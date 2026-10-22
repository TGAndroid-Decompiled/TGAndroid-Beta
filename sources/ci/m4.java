package ci;

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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.zj0;
public final class m4 extends FrameLayout {
    public final k4 f5608a;
    public final l4 f5609b;
    public final TextView[] f5610c;
    public zj0 d;
    public final o4 e;
    public Paint f5611f;
    public float h;
    public boolean f5612n;
    public boolean f5613r;
    public ValueAnimator f5614s;

    public m4(Context context, o4 o4Var) {
        super(context);
        this.f5610c = new TextView[2];
        this.e = o4Var;
        k4 k4Var = new k4(this, context, 0);
        this.f5608a = k4Var;
        k4Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        addView(k4Var, w7.z5.d(32, 32.0f, 0, 12.0f, 2.0f, 0.0f, 0.0f));
        setClipChildren(false);
        l4 l4Var = new l4(context, 0);
        this.f5609b = l4Var;
        l4Var.setTextSize(14);
        l4Var.setTypeface(AndroidUtilities.bold());
        l4Var.setMaxLines(1);
        l4Var.setEllipsizeByGradient(AndroidUtilities.dp(4.0f));
        l4Var.setPivotX(0.0f);
        NotificationCenter.listenEmojiLoading(l4Var);
        addView(l4Var, w7.z5.d(-2, -2.0f, 0, 54.0f, 0.0f, 86.0f, 0.0f));
        for (int i10 = 0; i10 < 2; i10++) {
            this.f5610c[i10] = new TextView(context);
            this.f5610c[i10].setTextSize(1, 12.0f);
            this.f5610c[i10].setMaxLines(1);
            this.f5610c[i10].setSingleLine(true);
            this.f5610c[i10].setEllipsize(TextUtils.TruncateAt.MIDDLE);
            this.f5610c[i10].setTextColor(-1);
            this.f5610c[i10].setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(1.0f));
            addView(this.f5610c[i10], w7.z5.d(-2, -2.0f, 0, 51.0f, 18.0f, 83.0f, 0.0f));
        }
        this.f5609b.setTextColor(-1);
    }

    public final void b(float f7, Canvas canvas, RectF rectF, boolean z10) {
        boolean z11;
        float f10;
        boolean z12;
        float clamp;
        h7 h7Var;
        o4 o4Var = this.e;
        if ((o4Var != null && o4Var.f5689b != null) || this.h != 0.0f) {
            if (o4Var != null && (h7Var = o4Var.f5689b) != null && !h7Var.I) {
                this.h = 1.0f;
                f10 = h7Var.h;
                if (!this.f5612n) {
                    this.f5612n = true;
                }
                z11 = false;
            } else {
                if (this.f5612n) {
                    this.f5612n = false;
                    if (this.d.f32926f < 0.2f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f5613r = z12;
                }
                if (!this.f5613r) {
                    this.h = Utilities.clamp(this.h - ((1000.0f / AndroidUtilities.screenRefreshRate) / 300.0f), 1.0f, 0.0f);
                }
                z11 = true;
                f10 = 1.0f;
            }
            zj0 zj0Var = this.d;
            k4 k4Var = this.f5608a;
            if (zj0Var == null) {
                zj0 zj0Var2 = new zj0(k4Var);
                this.d = zj0Var2;
                zj0Var2.d(null, true, false);
            }
            this.d.f32936q = 0;
            ImageReceiver imageReceiver = k4Var.getImageReceiver();
            float D = com.google.android.gms.internal.play_billing.k3.D(1.0f, this.h, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(3.0f));
            this.d.f((int) (rectF.left - D), (int) (rectF.top - D), (int) (rectF.right + D), (int) (rectF.bottom + D));
            zj0 zj0Var3 = this.d;
            if (z11) {
                clamp = 1.0f;
            } else {
                clamp = Utilities.clamp(f10, 1.0f, 0.0f);
            }
            zj0Var3.e(clamp, true);
            if (this.f5613r && z11 && this.d.f32926f >= 0.9f) {
                this.h = Utilities.clamp(this.h - ((1000.0f / AndroidUtilities.screenRefreshRate) / 300.0f), 1.0f, 0.0f);
            }
            if (z10) {
                if (f7 != 1.0f) {
                    Paint t10 = d8.t(imageReceiver, false);
                    t10.setAlpha((int) (this.h * 255.0f));
                    zj0 zj0Var4 = this.d;
                    zj0Var4.f32939t = t10;
                    zj0Var4.a(canvas);
                }
                if (this.f5611f == null) {
                    Paint paint = new Paint(1);
                    this.f5611f = paint;
                    paint.setColor(-1);
                    this.f5611f.setStrokeWidth(AndroidUtilities.dp(2.0f));
                    this.f5611f.setStyle(Paint.Style.STROKE);
                    this.f5611f.setStrokeCap(Paint.Cap.ROUND);
                }
                this.f5611f.setAlpha((int) (255.0f * f7 * this.h));
                zj0 zj0Var5 = this.d;
                zj0Var5.f32939t = this.f5611f;
                zj0Var5.a(canvas);
            }
        }
    }

    public final void c(CharSequence charSequence, boolean z10) {
        ValueAnimator valueAnimator = this.f5614s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f5614s = null;
        }
        TextView[] textViewArr = this.f5610c;
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
            this.f5614s = ofFloat;
            ofFloat.addUpdateListener(new ah.c0(this, 16));
            this.f5614s.addListener(new ah.b(this, 10));
            this.f5614s.setInterpolator(bs.h);
            this.f5614s.setDuration(340L);
            this.f5614s.start();
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
        org.telegram.ui.Cells.z g02;
        TextView[] textViewArr = this.f5610c;
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
            g02 = null;
        } else {
            g02 = org.telegram.ui.ActionBar.h6.g0(822083583, 7, -1);
        }
        textView2.setBackground(g02);
    }

    public void setSubtitle(CharSequence charSequence) {
        c(charSequence, false);
    }
}
