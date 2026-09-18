package ai;

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
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.qr;
public final class b6 extends FrameLayout {
    public final z5 f582a;
    public final a6 f583b;
    public final TextView[] f584c;
    public cj0 d;
    public final d6 e;
    public Paint f585f;
    public float h;
    public boolean f586n;
    public boolean f587r;
    public ValueAnimator f588s;

    public b6(Context context, d6 d6Var) {
        super(context);
        this.f584c = new TextView[2];
        this.e = d6Var;
        z5 z5Var = new z5(this, context, 0);
        this.f582a = z5Var;
        z5Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        addView(z5Var, w7.x5.d(32, 32.0f, 0, 12.0f, 2.0f, 0.0f, 0.0f));
        setClipChildren(false);
        a6 a6Var = new a6(context, 0);
        this.f583b = a6Var;
        a6Var.setTextSize(14);
        a6Var.setTypeface(AndroidUtilities.bold());
        a6Var.setMaxLines(1);
        a6Var.setEllipsizeByGradient(AndroidUtilities.dp(4.0f));
        a6Var.setPivotX(0.0f);
        NotificationCenter.listenEmojiLoading(a6Var);
        addView(a6Var, w7.x5.d(-2, -2.0f, 0, 54.0f, 0.0f, 86.0f, 0.0f));
        for (int i10 = 0; i10 < 2; i10++) {
            this.f584c[i10] = new TextView(context);
            this.f584c[i10].setTextSize(1, 12.0f);
            this.f584c[i10].setMaxLines(1);
            this.f584c[i10].setSingleLine(true);
            this.f584c[i10].setEllipsize(TextUtils.TruncateAt.MIDDLE);
            this.f584c[i10].setTextColor(-1);
            this.f584c[i10].setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(1.0f));
            addView(this.f584c[i10], w7.x5.d(-2, -2.0f, 0, 51.0f, 18.0f, 83.0f, 0.0f));
        }
        this.f583b.setTextColor(-1);
    }

    public final void b(float f7, Canvas canvas, RectF rectF, boolean z10) {
        float f10;
        boolean z11;
        boolean z12;
        float clamp;
        k9 k9Var;
        d6 d6Var = this.e;
        if ((d6Var != null && d6Var.f707b != null) || this.h != 0.0f) {
            if (d6Var != null && (k9Var = d6Var.f707b) != null && !k9Var.I) {
                this.h = 1.0f;
                f10 = k9Var.h;
                if (!this.f586n) {
                    this.f586n = true;
                }
                z11 = false;
            } else {
                if (this.f586n) {
                    this.f586n = false;
                    if (this.d.f23059f < 0.2f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f587r = z12;
                }
                if (!this.f587r) {
                    this.h = Utilities.clamp(this.h - ((1000.0f / AndroidUtilities.screenRefreshRate) / 300.0f), 1.0f, 0.0f);
                }
                f10 = 1.0f;
                z11 = true;
            }
            cj0 cj0Var = this.d;
            z5 z5Var = this.f582a;
            if (cj0Var == null) {
                cj0 cj0Var2 = new cj0(z5Var);
                this.d = cj0Var2;
                cj0Var2.d(null, true, false);
            }
            this.d.f23069q = 0;
            ImageReceiver imageReceiver = z5Var.getImageReceiver();
            float b10 = com.google.android.gms.internal.vision.e2.b(1.0f, this.h, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(3.0f));
            this.d.f((int) (rectF.left - b10), (int) (rectF.top - b10), (int) (rectF.right + b10), (int) (rectF.bottom + b10));
            cj0 cj0Var3 = this.d;
            if (z11) {
                clamp = 1.0f;
            } else {
                clamp = Utilities.clamp(f10, 1.0f, 0.0f);
            }
            cj0Var3.e(clamp, true);
            if (this.f587r && z11 && this.d.f23059f >= 0.9f) {
                this.h = Utilities.clamp(this.h - ((1000.0f / AndroidUtilities.screenRefreshRate) / 300.0f), 1.0f, 0.0f);
            }
            if (z10) {
                if (f7 != 1.0f) {
                    Paint t10 = ia.t(imageReceiver, false);
                    t10.setAlpha((int) (this.h * 255.0f));
                    cj0 cj0Var4 = this.d;
                    cj0Var4.f23072t = t10;
                    cj0Var4.a(canvas);
                }
                if (this.f585f == null) {
                    Paint paint = new Paint(1);
                    this.f585f = paint;
                    paint.setColor(-1);
                    this.f585f.setStrokeWidth(AndroidUtilities.dp(2.0f));
                    this.f585f.setStyle(Paint.Style.STROKE);
                    this.f585f.setStrokeCap(Paint.Cap.ROUND);
                }
                this.f585f.setAlpha((int) (255.0f * f7 * this.h));
                cj0 cj0Var5 = this.d;
                cj0Var5.f23072t = this.f585f;
                cj0Var5.a(canvas);
            }
        }
    }

    public final void c(CharSequence charSequence, boolean z10) {
        ValueAnimator valueAnimator = this.f588s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f588s = null;
        }
        TextView[] textViewArr = this.f584c;
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
            this.f588s = ofFloat;
            ofFloat.addUpdateListener(new a(this, 8));
            this.f588s.addListener(new b(this, 5));
            this.f588s.setInterpolator(qr.h);
            this.f588s.setDuration(340L);
            this.f588s.start();
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
        TextView[] textViewArr = this.f584c;
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
            f02 = org.telegram.ui.ActionBar.j6.f0(822083583, 7, -1);
        }
        textView2.setBackground(f02);
    }

    public void setSubtitle(CharSequence charSequence) {
        c(charSequence, false);
    }
}
