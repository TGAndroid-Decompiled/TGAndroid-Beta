package fi;

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
import c8.ma;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.sh0;
public final class v3 extends FrameLayout {
    public final t3 f12681a;
    public final u3 f12682b;
    public final TextView[] f12683c;
    public sh0 d;
    public final x3 f12684e;
    public Paint f12685f;
    public float h;
    public boolean f12686n;
    public boolean f12687r;
    public ValueAnimator f12688s;

    public v3(Context context, x3 x3Var) {
        super(context);
        this.f12683c = new TextView[2];
        this.f12684e = x3Var;
        t3 t3Var = new t3(0, context, this);
        this.f12681a = t3Var;
        t3Var.setRoundRadius(org.telegram.messenger.g0.L(16.0f));
        addView(t3Var, ma.d(32, 32.0f, 0, 12.0f, 2.0f, 0.0f, 0.0f));
        setClipChildren(false);
        u3 u3Var = new u3(context, 0);
        this.f12682b = u3Var;
        u3Var.setTextSize(14);
        u3Var.setTypeface(org.telegram.messenger.g0.o());
        u3Var.setMaxLines(1);
        u3Var.setEllipsizeByGradient(org.telegram.messenger.g0.L(4.0f));
        u3Var.setPivotX(0.0f);
        ks.i(u3Var);
        addView(u3Var, ma.d(-2, -2.0f, 0, 54.0f, 0.0f, 86.0f, 0.0f));
        for (int i7 = 0; i7 < 2; i7++) {
            this.f12683c[i7] = new TextView(context);
            this.f12683c[i7].setTextSize(1, 12.0f);
            this.f12683c[i7].setMaxLines(1);
            this.f12683c[i7].setSingleLine(true);
            this.f12683c[i7].setEllipsize(TextUtils.TruncateAt.MIDDLE);
            this.f12683c[i7].setTextColor(-1);
            this.f12683c[i7].setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(1.0f));
            addView(this.f12683c[i7], ma.d(-2, -2.0f, 0, 51.0f, 18.0f, 83.0f, 0.0f));
        }
        this.f12682b.setTextColor(-1);
    }

    public final void b(float f10, Canvas canvas, RectF rectF, boolean z10) {
        boolean z11;
        float f11;
        boolean z12;
        float i7;
        o6 o6Var;
        x3 x3Var = this.f12684e;
        if ((x3Var != null && x3Var.f12763b != null) || this.h != 0.0f) {
            if (x3Var != null && (o6Var = x3Var.f12763b) != null && !o6Var.J) {
                this.h = 1.0f;
                f11 = o6Var.h;
                if (!this.f12686n) {
                    this.f12686n = true;
                }
                z11 = false;
            } else {
                if (this.f12686n) {
                    this.f12686n = false;
                    if (this.d.f39591f < 0.2f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f12687r = z12;
                }
                if (!this.f12687r) {
                    this.h = Utilities.i(this.h - ((1000.0f / org.telegram.messenger.g0.f24147r) / 300.0f), 1.0f, 0.0f);
                }
                z11 = true;
                f11 = 1.0f;
            }
            sh0 sh0Var = this.d;
            t3 t3Var = this.f12681a;
            if (sh0Var == null) {
                sh0 sh0Var2 = new sh0(t3Var);
                this.d = sh0Var2;
                sh0Var2.d(null, true, false);
            }
            this.d.f39601q = 0;
            ImageReceiver imageReceiver = t3Var.getImageReceiver();
            float t6 = com.google.android.gms.internal.vision.e2.t(1.0f, this.h, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(3.0f));
            this.d.f((int) (rectF.left - t6), (int) (rectF.top - t6), (int) (rectF.right + t6), (int) (rectF.bottom + t6));
            sh0 sh0Var3 = this.d;
            if (z11) {
                i7 = 1.0f;
            } else {
                i7 = Utilities.i(f11, 1.0f, 0.0f);
            }
            sh0Var3.e(true, i7);
            if (this.f12687r && z11 && this.d.f39591f >= 0.9f) {
                this.h = Utilities.i(this.h - ((1000.0f / org.telegram.messenger.g0.f24147r) / 300.0f), 1.0f, 0.0f);
            }
            if (z10) {
                if (f10 != 1.0f) {
                    Paint t10 = i7.t(imageReceiver, false);
                    t10.setAlpha((int) (this.h * 255.0f));
                    sh0 sh0Var4 = this.d;
                    sh0Var4.f39604t = t10;
                    sh0Var4.a(canvas);
                }
                if (this.f12685f == null) {
                    Paint paint = new Paint(1);
                    this.f12685f = paint;
                    paint.setColor(-1);
                    this.f12685f.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
                    this.f12685f.setStyle(Paint.Style.STROKE);
                    this.f12685f.setStrokeCap(Paint.Cap.ROUND);
                }
                this.f12685f.setAlpha((int) (255.0f * f10 * this.h));
                sh0 sh0Var5 = this.d;
                sh0Var5.f39604t = this.f12685f;
                sh0Var5.a(canvas);
            }
        }
    }

    public final void c(CharSequence charSequence, boolean z10) {
        ValueAnimator valueAnimator = this.f12688s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f12688s = null;
        }
        TextView[] textViewArr = this.f12683c;
        if (z10) {
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
            this.f12688s = ofFloat;
            ofFloat.addUpdateListener(new ah.g(this, 19));
            this.f12688s.addListener(new ai.k0(this, 12));
            this.f12688s.setInterpolator(nr.h);
            this.f12688s.setDuration(340L);
            this.f12688s.start();
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
        org.telegram.ui.Cells.y h02;
        TextView[] textViewArr = this.f12683c;
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
            h02 = null;
        } else {
            h02 = org.telegram.ui.ActionBar.m6.h0(822083583, 7, -1);
        }
        textView2.setBackground(h02);
    }

    public void setSubtitle(CharSequence charSequence) {
        c(charSequence, false);
    }
}
