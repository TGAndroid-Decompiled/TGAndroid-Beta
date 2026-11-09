package di;

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
import c8.ha;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.eh0;
import org.telegram.ui.Components.xq;
public final class f4 extends FrameLayout {
    public final d4 f8985a;
    public final e4 f8986b;
    public final TextView[] f8987c;
    public eh0 d;
    public final h4 f8988e;
    public Paint f8989f;
    public float h;
    public boolean f8990n;
    public boolean f8991r;
    public ValueAnimator f8992s;

    public f4(Context context, h4 h4Var) {
        super(context);
        this.f8987c = new TextView[2];
        this.f8988e = h4Var;
        d4 d4Var = new d4(0, context, this);
        this.f8985a = d4Var;
        d4Var.setRoundRadius(org.telegram.messenger.g0.L(16.0f));
        addView(d4Var, ha.d(32, 32.0f, 0, 12.0f, 2.0f, 0.0f, 0.0f));
        setClipChildren(false);
        e4 e4Var = new e4(context, 0);
        this.f8986b = e4Var;
        e4Var.setTextSize(14);
        e4Var.setTypeface(org.telegram.messenger.g0.o());
        e4Var.setMaxLines(1);
        e4Var.setEllipsizeByGradient(org.telegram.messenger.g0.L(4.0f));
        e4Var.setPivotX(0.0f);
        qs.i(e4Var);
        addView(e4Var, ha.d(-2, -2.0f, 0, 54.0f, 0.0f, 86.0f, 0.0f));
        for (int i7 = 0; i7 < 2; i7++) {
            this.f8987c[i7] = new TextView(context);
            this.f8987c[i7].setTextSize(1, 12.0f);
            this.f8987c[i7].setMaxLines(1);
            this.f8987c[i7].setSingleLine(true);
            this.f8987c[i7].setEllipsize(TextUtils.TruncateAt.MIDDLE);
            this.f8987c[i7].setTextColor(-1);
            this.f8987c[i7].setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(1.0f));
            addView(this.f8987c[i7], ha.d(-2, -2.0f, 0, 51.0f, 18.0f, 83.0f, 0.0f));
        }
        this.f8986b.setTextColor(-1);
    }

    public final void b(float f10, Canvas canvas, RectF rectF, boolean z9) {
        boolean z10;
        float f11;
        boolean z11;
        float i7;
        y6 y6Var;
        h4 h4Var = this.f8988e;
        if ((h4Var != null && h4Var.f9065b != null) || this.h != 0.0f) {
            if (h4Var != null && (y6Var = h4Var.f9065b) != null && !y6Var.I) {
                this.h = 1.0f;
                f11 = y6Var.h;
                if (!this.f8990n) {
                    this.f8990n = true;
                }
                z10 = false;
            } else {
                if (this.f8990n) {
                    this.f8990n = false;
                    if (this.d.f33393f < 0.2f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f8991r = z11;
                }
                if (!this.f8991r) {
                    this.h = Utilities.i(this.h - ((1000.0f / org.telegram.messenger.g0.f22564r) / 300.0f), 1.0f, 0.0f);
                }
                z10 = true;
                f11 = 1.0f;
            }
            eh0 eh0Var = this.d;
            d4 d4Var = this.f8985a;
            if (eh0Var == null) {
                eh0 eh0Var2 = new eh0(d4Var);
                this.d = eh0Var2;
                eh0Var2.d(null, true, false);
            }
            this.d.f33403q = 0;
            ImageReceiver imageReceiver = d4Var.getImageReceiver();
            float v = com.google.android.recaptcha.internal.a.v(1.0f, this.h, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(3.0f));
            this.d.f((int) (rectF.left - v), (int) (rectF.top - v), (int) (rectF.right + v), (int) (rectF.bottom + v));
            eh0 eh0Var3 = this.d;
            if (z10) {
                i7 = 1.0f;
            } else {
                i7 = Utilities.i(f11, 1.0f, 0.0f);
            }
            eh0Var3.e(true, i7);
            if (this.f8991r && z10 && this.d.f33393f >= 0.9f) {
                this.h = Utilities.i(this.h - ((1000.0f / org.telegram.messenger.g0.f22564r) / 300.0f), 1.0f, 0.0f);
            }
            if (z9) {
                if (f10 != 1.0f) {
                    Paint t6 = s7.t(imageReceiver, false);
                    t6.setAlpha((int) (this.h * 255.0f));
                    eh0 eh0Var4 = this.d;
                    eh0Var4.f33406t = t6;
                    eh0Var4.a(canvas);
                }
                if (this.f8989f == null) {
                    Paint paint = new Paint(1);
                    this.f8989f = paint;
                    paint.setColor(-1);
                    this.f8989f.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
                    this.f8989f.setStyle(Paint.Style.STROKE);
                    this.f8989f.setStrokeCap(Paint.Cap.ROUND);
                }
                this.f8989f.setAlpha((int) (255.0f * f10 * this.h));
                eh0 eh0Var5 = this.d;
                eh0Var5.f33406t = this.f8989f;
                eh0Var5.a(canvas);
            }
        }
    }

    public final void c(CharSequence charSequence, boolean z9) {
        ValueAnimator valueAnimator = this.f8992s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f8992s = null;
        }
        TextView[] textViewArr = this.f8987c;
        if (z9) {
            textViewArr[1].setOnClickListener(null);
            textViewArr[1].setText(textViewArr[0].getText());
            textViewArr[1].setVisibility(0);
            textViewArr[1].setAlpha(1.0f);
            textViewArr[1].setTranslationY(0.0f);
            textViewArr[0].setText(charSequence);
            textViewArr[0].setVisibility(0);
            textViewArr[0].setAlpha(0.0f);
            textViewArr[0].setTranslationY(-org.telegram.messenger.g0.L(4.0f));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f8992s = ofFloat;
            ofFloat.addUpdateListener(new ah.h(this, 18));
            this.f8992s.addListener(new bi.t5(this, 10));
            this.f8992s.setInterpolator(xq.h);
            this.f8992s.setDuration(340L);
            this.f8992s.start();
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
        boolean z9;
        org.telegram.ui.Cells.y h02;
        TextView[] textViewArr = this.f8987c;
        textViewArr[0].setOnClickListener(onClickListener);
        TextView textView = textViewArr[0];
        if (onClickListener != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        textView.setClickable(z9);
        TextView textView2 = textViewArr[0];
        if (onClickListener == null) {
            h02 = null;
        } else {
            h02 = org.telegram.ui.ActionBar.l6.h0(822083583, 7, -1);
        }
        textView2.setBackground(h02);
    }

    public void setSubtitle(CharSequence charSequence) {
        c(charSequence, false);
    }
}
