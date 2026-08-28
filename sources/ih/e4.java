package ih;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qi0;
public final class e4 extends FrameLayout {
    public final d4 f11354a;
    public final dg.c f11355b;
    public final TextView[] f11356c;
    public qi0 d;
    public final g4 f11357e;
    public Paint f11358f;
    public float h;
    public boolean f11359n;
    public boolean f11360r;
    public ValueAnimator f11361s;

    public e4(Context context, g4 g4Var) {
        super(context);
        this.f11356c = new TextView[2];
        this.f11357e = g4Var;
        d4 d4Var = new d4(this, context, 0);
        this.f11354a = d4Var;
        d4Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        addView(d4Var, g7.e6.d(32, 32.0f, 0, 12.0f, 2.0f, 0.0f, 0.0f));
        setClipChildren(false);
        dg.c cVar = new dg.c(context, 1);
        this.f11355b = cVar;
        cVar.setTextSize(14);
        cVar.setTypeface(AndroidUtilities.bold());
        cVar.setMaxLines(1);
        cVar.setEllipsizeByGradient(AndroidUtilities.dp(4.0f));
        cVar.setPivotX(0.0f);
        NotificationCenter.listenEmojiLoading(cVar);
        addView(cVar, g7.e6.d(-2, -2.0f, 0, 54.0f, 0.0f, 86.0f, 0.0f));
        for (int i9 = 0; i9 < 2; i9++) {
            this.f11356c[i9] = new TextView(context);
            this.f11356c[i9].setTextSize(1, 12.0f);
            this.f11356c[i9].setMaxLines(1);
            this.f11356c[i9].setSingleLine(true);
            this.f11356c[i9].setEllipsize(TextUtils.TruncateAt.MIDDLE);
            this.f11356c[i9].setTextColor(-1);
            this.f11356c[i9].setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(1.0f));
            addView(this.f11356c[i9], g7.e6.d(-2, -2.0f, 0, 51.0f, 18.0f, 83.0f, 0.0f));
        }
        this.f11355b.setTextColor(-1);
    }

    public final void b(float f10, Canvas canvas, RectF rectF, boolean z10) {
        float f11;
        boolean z11;
        boolean z12;
        float clamp;
        u6 u6Var;
        g4 g4Var = this.f11357e;
        if ((g4Var != null && g4Var.f11467b != null) || this.h != 0.0f) {
            if (g4Var != null && (u6Var = g4Var.f11467b) != null && !u6Var.E) {
                this.h = 1.0f;
                f11 = u6Var.h;
                if (!this.f11359n) {
                    this.f11359n = true;
                }
                z11 = false;
            } else {
                if (this.f11359n) {
                    this.f11359n = false;
                    if (this.d.f31958f < 0.2f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f11360r = z12;
                }
                if (!this.f11360r) {
                    this.h = Utilities.clamp(this.h - ((1000.0f / AndroidUtilities.screenRefreshRate) / 300.0f), 1.0f, 0.0f);
                }
                f11 = 1.0f;
                z11 = true;
            }
            qi0 qi0Var = this.d;
            d4 d4Var = this.f11354a;
            if (qi0Var == null) {
                qi0 qi0Var2 = new qi0(d4Var);
                this.d = qi0Var2;
                qi0Var2.d(null, true, false);
            }
            this.d.f31968q = 0;
            ImageReceiver imageReceiver = d4Var.getImageReceiver();
            float C = j3.r0.C(1.0f, this.h, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(3.0f));
            this.d.f((int) (rectF.left - C), (int) (rectF.top - C), (int) (rectF.right + C), (int) (rectF.bottom + C));
            qi0 qi0Var3 = this.d;
            if (z11) {
                clamp = 1.0f;
            } else {
                clamp = Utilities.clamp(f11, 1.0f, 0.0f);
            }
            qi0Var3.e(clamp, true);
            if (this.f11360r && z11 && this.d.f31958f >= 0.9f) {
                this.h = Utilities.clamp(this.h - ((1000.0f / AndroidUtilities.screenRefreshRate) / 300.0f), 1.0f, 0.0f);
            }
            if (z10) {
                if (f10 != 1.0f) {
                    Paint t10 = p7.t(imageReceiver, false);
                    t10.setAlpha((int) (this.h * 255.0f));
                    qi0 qi0Var4 = this.d;
                    qi0Var4.f31971t = t10;
                    qi0Var4.a(canvas);
                }
                if (this.f11358f == null) {
                    Paint paint = new Paint(1);
                    this.f11358f = paint;
                    paint.setColor(-1);
                    this.f11358f.setStrokeWidth(AndroidUtilities.dp(2.0f));
                    this.f11358f.setStyle(Paint.Style.STROKE);
                    this.f11358f.setStrokeCap(Paint.Cap.ROUND);
                }
                this.f11358f.setAlpha((int) (255.0f * f10 * this.h));
                qi0 qi0Var5 = this.d;
                qi0Var5.f31971t = this.f11358f;
                qi0Var5.a(canvas);
            }
        }
    }

    public final void c(CharSequence charSequence, boolean z10) {
        ValueAnimator valueAnimator = this.f11361s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f11361s = null;
        }
        TextView[] textViewArr = this.f11356c;
        if (z10) {
            textViewArr[1].setOnClickListener(null);
            textViewArr[1].setText(textViewArr[0].getText());
            textViewArr[1].setVisibility(0);
            textViewArr[1].setAlpha(1.0f);
            textViewArr[1].setTranslationY(0.0f);
            textViewArr[0].setText(charSequence);
            textViewArr[0].setVisibility(0);
            textViewArr[0].setAlpha(0.0f);
            textViewArr[0].setTranslationY(-AndroidUtilities.dp(4.0f));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f11361s = ofFloat;
            ofFloat.addUpdateListener(new bg.b(this, 18));
            this.f11361s.addListener(new ag.e(this, 14));
            this.f11361s.setInterpolator(gr.h);
            this.f11361s.setDuration(340L);
            this.f11361s.start();
            return;
        }
        textViewArr[0].setVisibility(0);
        textViewArr[0].setAlpha(1.0f);
        textViewArr[0].setText(charSequence);
        textViewArr[1].setVisibility(8);
        textViewArr[1].setAlpha(0.0f);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setOnSubtitleClick(View.OnClickListener onClickListener) {
        boolean z10;
        org.telegram.ui.Cells.z f02;
        TextView[] textViewArr = this.f11356c;
        textViewArr[0].setOnClickListener(onClickListener);
        TextView textView = textViewArr[0];
        if (onClickListener != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        textView.setClickable(z10);
        TextView textView2 = textViewArr[0];
        if (onClickListener == null) {
            f02 = null;
        } else {
            f02 = org.telegram.ui.ActionBar.f6.f0(822083583, 7, -1);
        }
        textView2.setBackground(f02);
    }

    public void setSubtitle(CharSequence charSequence) {
        c(charSequence, false);
    }
}
