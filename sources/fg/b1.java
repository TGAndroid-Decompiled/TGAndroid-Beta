package fg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import eg.u2;
import k7.c6;
import k7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.y3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.z5;
public class b1 extends FrameLayout implements j90 {
    public boolean B;
    public boolean C;
    public wq D;
    public boolean E;
    public boolean F;
    public final z5 G;
    public final z5 H;
    public tp I;
    public float J;
    public boolean K;
    public ValueAnimator L;
    public final Paint f6244a;
    public float f6245b;
    public boolean f6246c;
    public final a1 d;
    public final a1 f6247e;
    public final int f6248f;
    public boolean h;
    public float f6249n;
    public final eg.s2 f6250r;
    public ValueAnimator f6251s;
    public final Path v;
    public final org.telegram.ui.Components.voip.h f6252w;
    public boolean f6253x;
    public final kj0 f6254y;

    public b1(Context context, g6 g6Var, boolean z4) {
        this(AndroidUtilities.dp(8.0f), context, g6Var, z4);
    }

    public final void a(String str, View.OnClickListener onClickListener, boolean z4) {
        if (!this.B && z4) {
            z4 = true;
        }
        this.B = true;
        a1 a1Var = this.d;
        if (z4 && a1Var.f28282c.f()) {
            a1Var.a();
        }
        a1Var.c(str, z4, true);
        eg.s2 s2Var = this.f6250r;
        s2Var.setContentDescription(str);
        if (!this.F) {
            s2Var.setOnClickListener(onClickListener);
        }
    }

    @Override
    public final boolean b() {
        return this.K;
    }

    public final void c(CharSequence charSequence, boolean z4, boolean z10) {
        this.h = true;
        this.f6253x = z4;
        a1 a1Var = this.f6247e;
        a1Var.c(charSequence, z10, true);
        a1Var.setContentDescription(charSequence);
        d(z10);
    }

    public final void d(boolean z4) {
        ValueAnimator valueAnimator = this.f6251s;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f6251s.cancel();
        }
        float f10 = 0.0f;
        if (!z4) {
            if (this.h) {
                f10 = 1.0f;
            }
            this.f6249n = f10;
            e();
            return;
        }
        float f11 = this.f6249n;
        if (this.h) {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f6251s = ofFloat;
        ofFloat.addUpdateListener(new f2.d0(this, 1));
        this.f6251s.addListener(new dg.l0(this, 3));
        this.f6251s.setDuration(250L);
        this.f6251s.setInterpolator(pr.f30168f);
        this.f6251s.start();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int dp;
        wq wqVar = this.D;
        a1 a1Var = this.f6247e;
        if (wqVar != null) {
            vq vqVar = wqVar.f32815a;
            if (vqVar.h == 0) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(vqVar.C - 0.5f) + vqVar.f32523s;
            }
            z5 z5Var = this.G;
            z5Var.d(((dp * 0.85f) + AndroidUtilities.dp(3.0f)) / 2.0f, false);
            float e6 = (a1Var.getDrawable().e() / 2.0f) + (getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(3.0f);
            z5 z5Var2 = this.H;
            z5Var2.d(e6, false);
            a1Var.setTranslationX(-z5Var.f33763c);
            this.D.setTranslationX(z5Var2.f33763c - z5Var.f33763c);
        } else if (a1Var != null) {
            a1Var.setTranslationX(0.0f);
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        float f10 = this.f6249n;
        Paint paint = this.f6244a;
        int i10 = this.f6248f;
        if (f10 != 1.0f || !this.f6253x) {
            if (this.f6246c) {
                float f11 = this.f6245b + 0.016f;
                this.f6245b = f11;
                if (f11 > 3.0f) {
                    this.f6246c = false;
                }
            } else {
                float f12 = this.f6245b - 0.016f;
                this.f6245b = f12;
                if (f12 < 1.0f) {
                    this.f6246c = true;
                }
            }
            if (this.E) {
                q1.d().f((-getMeasuredWidth()) * 0.1f * this.f6245b, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float f13 = i10;
                canvas.drawRoundRect(rectF, f13, f13, q1.d().e());
            } else {
                paint.setAlpha(255);
                float f14 = i10;
                canvas.drawRoundRect(rectF, f14, f14, paint);
            }
            invalidate();
        }
        if (!BuildVars.IS_BILLING_UNAVAILABLE && !this.C) {
            int measuredWidth = getMeasuredWidth();
            org.telegram.ui.Components.voip.h hVar = this.f6252w;
            hVar.f32060f = measuredWidth;
            hVar.a(i10, canvas, rectF, null);
        }
        float f15 = this.f6249n;
        if (f15 != 0.0f && this.f6253x) {
            paint.setAlpha((int) (f15 * 255.0f));
            if (this.f6249n != 1.0f) {
                Path path = this.v;
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, Math.max(getMeasuredWidth(), getMeasuredHeight()) * 1.4f * this.f6249n, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                float f16 = i10;
                canvas.drawRoundRect(rectF, f16, f16, paint);
                canvas.restore();
            } else {
                float f17 = i10;
                canvas.drawRoundRect(rectF, f17, f17, paint);
            }
        }
        super.dispatchDraw(canvas);
    }

    public final void e() {
        int i10;
        float f10 = this.f6249n;
        a1 a1Var = this.f6247e;
        a1Var.setAlpha(f10);
        a1Var.setTranslationY((1.0f - this.f6249n) * AndroidUtilities.dp(12.0f));
        eg.s2 s2Var = this.f6250r;
        s2Var.setAlpha(1.0f - this.f6249n);
        s2Var.setTranslationY((-AndroidUtilities.dp(12.0f)) * this.f6249n);
        int i11 = 0;
        if (this.f6249n == 1.0f) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        s2Var.setVisibility(i10);
        if (this.f6249n == 0.0f) {
            i11 = 4;
        }
        a1Var.setVisibility(i11);
        invalidate();
    }

    public kj0 getIconView() {
        return this.f6254y;
    }

    public k6 getTextView() {
        return this.d;
    }

    @Override
    public final boolean isEnabled() {
        return this.f6250r.isEnabled();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
        this.f6250r.setEnabled(z4);
    }

    public void setFlickerDisabled(boolean z4) {
        this.C = z4;
        invalidate();
    }

    public void setIcon(int i10) {
        kj0 kj0Var = this.f6254y;
        kj0Var.f(i10, 24, 24, null);
        org.telegram.ui.Components.voip.h hVar = this.f6252w;
        hVar.f32061g = 2.0f;
        hVar.f32069p = new eh.m(this, 5);
        invalidate();
        kj0Var.setVisibility(0);
    }

    @Override
    public void setLoading(boolean z4) {
        float f10;
        if (this.K != z4) {
            ValueAnimator valueAnimator = this.L;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.L = null;
            }
            float f11 = this.J;
            this.K = z4;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.L = ofFloat;
            ofFloat.addUpdateListener(new eg.m1(this, 7));
            this.L.addListener(new u2(2, this, z4));
            this.L.setDuration(320L);
            this.L.setInterpolator(pr.h);
            this.L.start();
        }
    }

    public b1(int i10, Context context, g6 g6Var, boolean z4) {
        super(context);
        Paint paint = new Paint(1);
        this.f6244a = paint;
        this.v = new Path();
        this.E = true;
        this.G = new z5(this);
        this.H = new z5(this);
        this.J = 0.0f;
        this.f6248f = i10;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f6252w = hVar;
        hVar.f32067n = 1.2f;
        hVar.f32064k = false;
        hVar.f32066m = 4.0f;
        LinearLayout f10 = y3.f(context, 0);
        a1 a1Var = new a1(this, context, 0);
        this.d = a1Var;
        a1Var.b(0.35f, 350L, pr.h);
        a1Var.setGravity(17);
        a1Var.setTextColor(-1);
        a1Var.setTextSize(AndroidUtilities.dp(14.0f));
        a1Var.setTypeface(AndroidUtilities.bold());
        ?? imageView = new ImageView(context);
        this.f6254y = imageView;
        imageView.setColorFilter(-1);
        imageView.setVisibility(8);
        eg.s2 s2Var = new eg.s2(this, context, 3);
        this.f6250r = s2Var;
        s2Var.addView(f10, c6.e(-2, -2, 17));
        int k10 = i0.a.k(-1, 120);
        s2Var.setBackground(org.telegram.ui.ActionBar.k6.i0(i10, i10, i10, i10, 0, k10, k10));
        f10.addView(a1Var, c6.q(-2, -2, 16));
        f10.addView((View) imageView, c6.p(24, 24, 0.0f, 16, 4, 0, 0, 0));
        addView(s2Var);
        setOutlineProvider(lf.q0.f12505b);
        setClipToOutline(true);
        e6.b(this, 0.02f, 1.2f);
        if (z4) {
            a1 a1Var2 = new a1(this, context, 1);
            this.f6247e = a1Var2;
            a1Var2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            a1Var2.setGravity(17);
            a1Var2.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Sh, g6Var));
            a1Var2.setTextSize(AndroidUtilities.dp(14.0f));
            a1Var2.setTypeface(AndroidUtilities.bold());
            a1Var2.getDrawable().D = true;
            int dp = AndroidUtilities.dp(8.0f);
            int k11 = i0.a.k(-1, 120);
            a1Var2.setBackground(org.telegram.ui.ActionBar.k6.i0(dp, dp, dp, dp, 0, k11, k11));
            addView(a1Var2);
            paint.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, g6Var));
            e();
        }
    }
}
