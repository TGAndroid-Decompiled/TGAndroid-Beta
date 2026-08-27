package ag;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import h7.b6;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.y5;

public class s1 extends FrameLayout implements s80 {
    public boolean A;
    public boolean B;
    public kq C;
    public boolean D;
    public boolean E;
    public final y5 F;
    public final y5 G;
    public hp H;
    public float I;
    public boolean J;
    public ValueAnimator K;

    public final Paint f641a;

    public float f642b;

    public boolean f643c;
    public final o1 d;

    public final o1 f644e;

    public final int f645f;
    public boolean h;

    public float f646n;

    public final p1 f647r;

    public ValueAnimator f648s;
    public final Path v;

    public final org.telegram.ui.Components.voip.h f649w;

    public boolean f650x;

    public final ri0 f651y;

    public s1(Context context, c6 c6Var, boolean z10) {
        this(AndroidUtilities.dp(8.0f), context, c6Var, z10);
    }

    public final void a(String str, View.OnClickListener onClickListener, boolean z10) {
        if (!this.A && z10) {
            z10 = true;
        }
        this.A = true;
        o1 o1Var = this.d;
        if (z10 && o1Var.f29632c.f()) {
            o1Var.a();
        }
        o1Var.c(str, z10, true);
        p1 p1Var = this.f647r;
        p1Var.setContentDescription(str);
        if (this.E) {
            return;
        }
        p1Var.setOnClickListener(onClickListener);
    }

    @Override
    public final boolean b() {
        return this.J;
    }

    public final void c(CharSequence charSequence, boolean z10, boolean z11) {
        this.h = true;
        this.f650x = z10;
        o1 o1Var = this.f644e;
        o1Var.c(charSequence, z11, true);
        o1Var.setContentDescription(charSequence);
        d(z11);
    }

    public final void d(boolean z10) {
        ValueAnimator valueAnimator = this.f648s;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f648s.cancel();
        }
        if (!z10) {
            this.f646n = this.h ? 1.0f : 0.0f;
            e();
            return;
        }
        int i10 = 0;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f646n, this.h ? 1.0f : 0.0f);
        this.f648s = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new q1(this, i10));
        this.f648s.addListener(new r1(this, i10));
        this.f648s.setDuration(250L);
        this.f648s.setInterpolator(er.f28122f);
        this.f648s.start();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int iDp;
        kq kqVar = this.C;
        o1 o1Var = this.f644e;
        if (kqVar != null) {
            jq jqVar = kqVar.f30167a;
            if (jqVar.h == 0) {
                iDp = 0;
            } else {
                iDp = AndroidUtilities.dp(jqVar.C - 0.5f) + jqVar.f29791s;
            }
            float fDp = ((iDp * 0.85f) + AndroidUtilities.dp(3.0f)) / 2.0f;
            y5 y5Var = this.F;
            y5Var.d(fDp, false);
            float fE = (o1Var.getDrawable().e() / 2.0f) + (getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(3.0f);
            y5 y5Var2 = this.G;
            y5Var2.d(fE, false);
            o1Var.setTranslationX(-y5Var.f34812c);
            this.C.setTranslationX(y5Var2.f34812c - y5Var.f34812c);
        } else if (o1Var != null) {
            o1Var.setTranslationX(0.0f);
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        float f10 = this.f646n;
        Paint paint = this.f641a;
        int i10 = this.f645f;
        if (f10 != 1.0f || !this.f650x) {
            if (this.f643c) {
                float f11 = this.f642b + 0.016f;
                this.f642b = f11;
                if (f11 > 3.0f) {
                    this.f643c = false;
                }
            } else {
                float f12 = this.f642b - 0.016f;
                this.f642b = f12;
                if (f12 < 1.0f) {
                    this.f643c = true;
                }
            }
            if (this.D) {
                j2.d().f((-getMeasuredWidth()) * 0.1f * this.f642b, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float f13 = i10;
                canvas.drawRoundRect(rectF, f13, f13, j2.d().e());
            } else {
                paint.setAlpha(255);
                float f14 = i10;
                canvas.drawRoundRect(rectF, f14, f14, paint);
            }
            invalidate();
        }
        if (!BuildVars.IS_BILLING_UNAVAILABLE && !this.B) {
            int measuredWidth = getMeasuredWidth();
            org.telegram.ui.Components.voip.h hVar = this.f649w;
            hVar.f33591f = measuredWidth;
            hVar.a(i10, canvas, rectF, null);
        }
        float f15 = this.f646n;
        if (f15 != 0.0f && this.f650x) {
            paint.setAlpha((int) (f15 * 255.0f));
            if (this.f646n != 1.0f) {
                Path path = this.v;
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, Math.max(getMeasuredWidth(), getMeasuredHeight()) * 1.4f * this.f646n, Path.Direction.CW);
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
        float f10 = this.f646n;
        o1 o1Var = this.f644e;
        o1Var.setAlpha(f10);
        o1Var.setTranslationY((1.0f - this.f646n) * AndroidUtilities.dp(12.0f));
        float f11 = 1.0f - this.f646n;
        p1 p1Var = this.f647r;
        p1Var.setAlpha(f11);
        p1Var.setTranslationY((-AndroidUtilities.dp(12.0f)) * this.f646n);
        p1Var.setVisibility(this.f646n == 1.0f ? 4 : 0);
        o1Var.setVisibility(this.f646n == 0.0f ? 4 : 0);
        invalidate();
    }

    public ri0 getIconView() {
        return this.f651y;
    }

    public j6 getTextView() {
        return this.d;
    }

    @Override
    public final boolean isEnabled() {
        return this.f647r.isEnabled();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f647r.setEnabled(z10);
    }

    public void setFlickerDisabled(boolean z10) {
        this.B = z10;
        invalidate();
    }

    public void setIcon(int i10) {
        ri0 ri0Var = this.f651y;
        ri0Var.f(i10, 24, 24, null);
        org.telegram.ui.Components.voip.h hVar = this.f649w;
        hVar.f33592g = 2.0f;
        hVar.f33600p = new af.e(this, 2);
        invalidate();
        ri0Var.setVisibility(0);
    }

    @Override
    public void setLoading(boolean z10) {
        if (this.J != z10) {
            ValueAnimator valueAnimator = this.K;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.K = null;
            }
            float f10 = this.I;
            this.J = z10;
            int i10 = 1;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, z10 ? 1.0f : 0.0f);
            this.K = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new u(this, i10));
            this.K.addListener(new x(i10, this, z10));
            this.K.setDuration(320L);
            this.K.setInterpolator(er.h);
            this.K.start();
        }
    }

    public s1(int i10, Context context, c6 c6Var, boolean z10) {
        super(context);
        Paint paint = new Paint(1);
        this.f641a = paint;
        this.v = new Path();
        this.D = true;
        this.F = new y5(this);
        this.G = new y5(this);
        this.I = 0.0f;
        this.f645f = i10;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f649w = hVar;
        hVar.f33598n = 1.2f;
        hVar.f33595k = false;
        hVar.f33597m = 4.0f;
        LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 0);
        o1 o1Var = new o1(this, context, 0);
        this.d = o1Var;
        o1Var.b(0.35f, 350L, er.h);
        o1Var.setGravity(17);
        o1Var.setTextColor(-1);
        o1Var.setTextSize(AndroidUtilities.dp(14.0f));
        o1Var.setTypeface(AndroidUtilities.bold());
        ri0 ri0Var = new ri0(context);
        this.f651y = ri0Var;
        ri0Var.setColorFilter(-1);
        ri0Var.setVisibility(8);
        p1 p1Var = new p1(this, context, 0);
        this.f647r = p1Var;
        p1Var.addView(linearLayoutG, z5.e(-2, -2, 17));
        int iK = i0.b.k(-1, 120);
        p1Var.setBackground(g6.i0(i10, i10, i10, i10, 0, iK, iK));
        linearLayoutG.addView(o1Var, z5.q(-2, -2, 16));
        linearLayoutG.addView(ri0Var, z5.p(24, 24, 0.0f, 16, 4, 0, 0, 0));
        addView(p1Var);
        setOutlineProvider(gf.r0.f7055b);
        setClipToOutline(true);
        b6.b(this, 0.02f, 1.2f);
        if (z10) {
            o1 o1Var2 = new o1(this, context, 1);
            this.f644e = o1Var2;
            o1Var2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            o1Var2.setGravity(17);
            o1Var2.setTextColor(g6.v0(g6.Sh, c6Var));
            o1Var2.setTextSize(AndroidUtilities.dp(14.0f));
            o1Var2.setTypeface(AndroidUtilities.bold());
            o1Var2.getDrawable().D = true;
            int iDp = AndroidUtilities.dp(8.0f);
            int iK2 = i0.b.k(-1, 120);
            o1Var2.setBackground(g6.i0(iDp, iDp, iDp, iDp, 0, iK2, iK2));
            addView(o1Var2);
            paint.setColor(g6.v0(g6.Oh, c6Var));
            e();
        }
    }
}
