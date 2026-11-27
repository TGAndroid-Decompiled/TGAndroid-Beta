package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import j$.util.Objects;
import org.telegram.messenger.Utilities;
import org.telegram.ui.z;
public abstract class ub1 extends qb1 {
    public boolean S0;
    public final ImageView T0;
    public boolean U0;
    public final ImageView V0;
    public final pb1 W0;
    public fu5 X0;
    public final hc Y0;
    public final ImageView Z0;
    public kg5 a1;
    public int b1;
    public final int[] c1;
    public final kg5 d1;
    public final Runnable e1;
    public final RectF f1;
    public final Drawable g1;
    public final hn h1;
    public final v41 i1;
    public jl0 j1;
    public final mm k1;
    public final mm l1;
    public final mm m1;
    public boolean n1;
    public boolean o1;
    public final rb1 p1;
    public boolean q1;
    public pcc r1;
    public boolean s1;

    public ub1(Context context, z zVar, wma wmaVar, FrameLayout frameLayout, vnb vnbVar, tl0 tl0Var, Runnable runnable) {
        super(context, zVar, wmaVar, frameLayout, vnbVar, tl0Var);
        int i;
        float f;
        float f2;
        float f3;
        int i2;
        float f4;
        float f5;
        int i3;
        float f6;
        int i4;
        this.b1 = 0;
        this.c1 = new int[]{Integer.MAX_VALUE, 3, 10, 30, 0};
        this.f1 = new RectF();
        hn hnVar = new hn(false, false, false);
        this.h1 = hnVar;
        this.i1 = new v41(this);
        k43 k43Var = k43.h;
        this.k1 = new mm(this, 0L, 350L, k43Var);
        this.l1 = new mm(this, 0L, 350L, k43Var);
        this.m1 = new mm(this, 0L, 350L, k43Var);
        this.p1 = new rb1(this, (byte) 0);
        this.e1 = runnable;
        hnVar.w(hl.L(14.0f));
        hnVar.N = hl.q.x;
        hnVar.u(-1);
        boolean z = this instanceof qb8;
        if (z) {
            hnVar.t(ob6.M0(2131748079, null), true, true);
            this.g1 = context.getResources().getDrawable(2131231843);
        } else {
            hnVar.t(ob6.M0(2131748078, null), true, true);
            this.g1 = context.getResources().getDrawable(2131231842);
        }
        ImageView imageView = new ImageView(context);
        this.T0 = imageView;
        imageView.setImageResource(2131231081);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(aob.f0(1090519039, 1, hl.L(18.0f)));
        C(false);
        if (z) {
            i = 48;
        } else {
            i = 80;
        }
        int i5 = i | 3;
        if (z) {
            f = 6.0f;
        } else {
            f = 0.0f;
        }
        if (z) {
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            f2 = 6.0f;
            f3 = 0.0f;
        }
        float f7 = f3;
        addView(imageView, tre.d(44, 44.0f, i5, 14.0f, f, 0.0f, f2));
        ImageView imageView2 = new ImageView(context);
        this.V0 = imageView2;
        pb1 pb1Var = new pb1(5);
        this.W0 = pb1Var;
        imageView2.setImageDrawable(pb1Var);
        imageView2.setBackground(aob.f0(1090519039, 1, hl.L(18.0f)));
        imageView2.setScaleType(scaleType);
        E(false, false);
        if (z) {
            i2 = 48;
        } else {
            i2 = 80;
        }
        int i6 = i2 | 5;
        if (z) {
            f4 = 6.0f;
        } else {
            f4 = f7;
        }
        if (z) {
            f5 = f7;
        } else {
            f5 = 6.0f;
        }
        addView(imageView2, tre.d(44, 44.0f, i6, 0.0f, f4, 10.0f, f5));
        if (z) {
            i3 = 1;
        } else {
            i3 = 3;
        }
        kg5 kg5Var = new kg5(context, i3);
        this.d1 = kg5Var;
        kg5Var.q(12.0f);
        int L = hl.L(12.0f);
        if (z) {
            f6 = 8.0f;
        } else {
            f6 = f7;
        }
        kg5Var.setPadding(L, hl.L(f6), hl.L(12.0f), hl.L(z ? f7 : 8.0f));
        kg5Var.n(1.0f, -21.0f);
        kg5Var.p(true);
        if (z) {
            i4 = 48;
        } else {
            i4 = 80;
        }
        addView(kg5Var, tre.e(-1, 80, i4 | 5));
        ImageView imageView3 = new ImageView(context);
        this.Z0 = imageView3;
        hc hcVar = new hc(context);
        this.Y0 = hcVar;
        imageView3.setImageDrawable(hcVar);
        imageView3.setScaleType(scaleType);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1140850689, PorterDuff.Mode.MULTIPLY));
        imageView3.setBackground(aob.f0(1090519039, 1, hl.L(16.0f)));
        addView(imageView3, tre.d(44, 44.0f, 53, 8.0f, 0.0f, 8.0f, 0.0f));
        imageView3.setContentDescription(ob6.M0(2131755003, null));
        iye.a(imageView3);
        this.f.getEditText().addTextChangedListener(new c7(this, (byte) 3));
        imageView3.setVisibility(8);
        imageView3.setAlpha(0.0f);
        imageView3.setScaleX(0.6f);
        imageView3.setScaleY(0.6f);
        imageView3.setOnClickListener(new r81(this, (byte) 4));
        imageView2.setOnClickListener(new sb1(this, zVar, (byte) 0));
    }

    public abstract void A();

    public abstract void B();

    public final void C(boolean z) {
        int i;
        float f;
        this.S0 = z;
        ImageView imageView = this.T0;
        imageView.animate().cancel();
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
        float f2 = 0.0f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        imageView.setAlpha(f);
        if (!z) {
            f2 = hl.L(-8.0f);
        }
        imageView.setTranslationX(f2);
        kb1 kb1Var = this.f;
        kb1Var.getEditText().setTranslationX(hl.U1(this.o0, getEditTextLeft() + hl.L(-26.0f), hl.L(2.0f)));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) kb1Var.getLayoutParams();
        if (this.S0 && this.U0) {
            i2 = 33;
        }
        marginLayoutParams.rightMargin = hl.L(32 + i2);
        kb1Var.setLayoutParams(marginLayoutParams);
    }

    public final void D(boolean z, boolean z2) {
        if (this.n1 == z && z2) {
            return;
        }
        this.n1 = z;
        if (!z2) {
            this.l1.f(z, true);
        }
        invalidate();
    }

    public final void E(boolean z, boolean z2) {
        int i;
        this.U0 = z;
        ImageView imageView = this.V0;
        imageView.animate().cancel();
        float f = 1.0f;
        int i2 = 0;
        float f2 = 0.0f;
        if (z2) {
            imageView.setVisibility(0);
            ViewPropertyAnimator animate = imageView.animate();
            if (!z) {
                f = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f);
            if (!z) {
                f2 = hl.L(8.0f);
            }
            alpha.translationX(f2).withEndAction(new tb1(this, z, (byte) 0)).start();
        } else {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
            if (!z) {
                f = 0.0f;
            }
            imageView.setAlpha(f);
            if (!z) {
                f2 = hl.L(8.0f);
            }
            imageView.setTranslationX(f2);
        }
        kb1 kb1Var = this.f;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) kb1Var.getLayoutParams();
        if (this.S0 && this.U0) {
            i2 = 33;
        }
        marginLayoutParams.rightMargin = hl.L(32 + i2);
        kb1Var.setLayoutParams(marginLayoutParams);
    }

    public final void F(boolean z) {
        float f;
        float f2;
        if (this.s1 != z) {
            if (z) {
                uc7.s1(this.V).Q1().b();
            }
            this.s1 = z;
            ImageView imageView = this.Z0;
            imageView.setVisibility(0);
            ViewPropertyAnimator animate = imageView.animate();
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f);
            float f3 = 0.6f;
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.6f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f2);
            if (z) {
                f3 = 1.0f;
            }
            scaleX.scaleY(f3).setInterpolator(k43.h).setDuration(420L).withEndAction(new tb1(this, z, (byte) 1)).start();
            if (z) {
                hc hcVar = this.Y0;
                Objects.requireNonNull(hcVar);
                imageView.postDelayed(new gc(hcVar, (byte) 1), 220L);
                kg5 kg5Var = this.a1;
                if (kg5Var != null) {
                    kg5Var.f(true);
                    this.a1 = null;
                }
                if (uc7.e1().getInt("aihintshown", 0) < 3) {
                    kg5 kg5Var2 = new kg5(getContext(), 3);
                    this.a1 = kg5Var2;
                    kg5Var2.p(true);
                    this.a1.t(ob6.M0(2131754989, null));
                    this.a1.o(1.0f, ((-imageView.getWidth()) / 2.0f) + hl.L(4.0f));
                    addView(this.a1, tre.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
                    kg5 kg5Var3 = this.a1;
                    kg5Var3.r0 = new z21(this, kg5Var2, (byte) 14);
                    kg5Var3.d = 4000L;
                    kg5Var3.v();
                    uc7.e1().edit().putInt("aihintshown", uc7.e1().getInt("aihintshown", 0) + 1).apply();
                    return;
                }
                return;
            }
            kg5 kg5Var4 = this.a1;
            if (kg5Var4 != null) {
                kg5Var4.f(true);
                this.a1 = null;
            }
        }
    }

    public abstract boolean G();

    public final void H(vnb vnbVar) {
        this.a = vnbVar;
        this.h.setColorFilter(new PorterDuffColorFilter(aob.w0(null, aob.U5, false), PorterDuff.Mode.SRC_IN));
        int L = hl.L(16.0f);
        int i = aob.qg;
        ShapeDrawable K = aob.K(L, aob.v0(i, vnbVar));
        zm2 zm2Var = this.n;
        zm2Var.a = K;
        zm2Var.invalidateSelf();
        this.W0.g(-1, aob.v0(i, vnbVar), -1);
    }

    @Override
    public final int a() {
        return 0;
    }

    @Override
    public final void c(boolean z) {
        int i;
        int i2 = 0;
        if (!z && this.U0) {
            i = 0;
        } else {
            i = 8;
        }
        ImageView imageView = this.V0;
        imageView.setVisibility(i);
        if (z || !this.S0) {
            i2 = 8;
        }
        ImageView imageView2 = this.T0;
        imageView2.setVisibility(i2);
        if (z) {
            imageView.setVisibility(8);
            imageView2.setVisibility(8);
        }
    }

    @Override
    public final void d(boolean z) {
        int i;
        if (!z) {
            int i2 = 8;
            if (this.U0) {
                i = 0;
            } else {
                i = 8;
            }
            this.V0.setVisibility(i);
            if (this.S0) {
                i2 = 0;
            }
            this.T0.setVisibility(i2);
        }
        kg5 kg5Var = this.d1;
        if (kg5Var != null) {
            kg5Var.f(true);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        int i;
        super.dispatchDraw(canvas);
        RectF rectF = this.A0;
        ImageView imageView = this.Z0;
        if (imageView != null) {
            imageView.setTranslationX(-hl.L((1.0f - this.o0) * 4.0f));
            if (this instanceof qb8) {
                f2 = rectF.bottom - hl.L(44.0f);
                i = 1;
            } else {
                f2 = rectF.top;
                i = -1;
            }
            imageView.setTranslationY((Utilities.l((-this.k1.e(false, this.f.getEditText().getLineCount())) + 4.0f) * hl.L(3.0f) * i) + f2);
        }
        float f3 = this.l1.f(this.n1, !G());
        float d = this.m1.d(this.o1);
        if (f3 > 0.0f) {
            float a = this.i1.a(0.03f);
            int L = hl.L((1.0f - this.o0) * 4.0f);
            boolean z = this instanceof qb8;
            hn hnVar = this.h1;
            RectF rectF2 = this.f1;
            if (z) {
                f = 1.0f;
                rectF2.set(hl.L(7.0f) + L, rectF.bottom + hl.L(10.0f), uh9.v(hnVar.c(), hl.L(11.0f), d, hl.L(44.0f) + L), rectF.bottom + hl.L(42.0f));
            } else {
                f = 1.0f;
                rectF2.set(hl.L(7.0f) + L, rectF.top - hl.L(42.0f), uh9.v(hnVar.c(), hl.L(11.0f), d, hl.L(44.0f) + L), rectF.top - hl.L(10.0f));
            }
            if (f3 < f) {
                canvas.saveLayerAlpha(rectF2, (int) (f3 * 255.0f), 31);
            } else {
                canvas.save();
            }
            canvas.scale(a, a, rectF2.centerX(), rectF2.centerY());
            canvas.clipRect(rectF2);
            ll0 ll0Var = this.h0;
            if (ll0Var != null) {
                if (this.j1 == null) {
                    jl0 c = ll0Var.c(this, null, false);
                    c.p(dtd.i(this.a));
                    c.q(hl.L(5.0f));
                    c.r(hl.L(16.0f));
                    this.j1 = c;
                }
                Rect rect = hl.Q;
                rectF2.round(rect);
                rect.inset(-hl.L(5.0f), -hl.L(5.0f));
                this.j1.setBounds(rect);
                this.j1.draw(canvas);
            }
            Drawable drawable = this.g1;
            drawable.setBounds((int) (rectF2.left + hl.L(9.0f)), (int) (rectF2.centerY() - hl.L(10.0f)), (int) (rectF2.left + hl.L(29.0f)), (int) (rectF2.centerY() + hl.L(10.0f)));
            drawable.draw(canvas);
            hnVar.o(rectF2.left + hl.L(37.0f), rectF2.top, rectF2.right, rectF2.bottom);
            hnVar.C = (int) (d * 255.0f);
            hnVar.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i;
        boolean z;
        int action = motionEvent.getAction();
        RectF rectF = this.f1;
        mm mmVar = this.l1;
        v41 v41Var = this.i1;
        if (action == 0) {
            if (mmVar.c > 0.0f && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                z = true;
            } else {
                z = false;
            }
            v41Var.c(z);
        } else if (motionEvent.getAction() == 2) {
            if (v41Var.i && (mmVar.c <= 0.0f || !rectF.contains(motionEvent.getX(), motionEvent.getY()))) {
                v41Var.c(false);
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && v41Var.i) {
            if (motionEvent.getAction() == 1) {
                A();
                if (this instanceof qb8) {
                    i = 2131748079;
                } else {
                    i = 2131748078;
                }
                this.h1.t(ob6.M0(i, null), true, true);
            }
            v41Var.c(false);
            return true;
        }
        if (!v41Var.i && !super.dispatchTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean f(View view) {
        if (view != this.d1) {
            return true;
        }
        return false;
    }

    @Override
    public int getCaptionDefaultLimit() {
        return uc7.s1(this.V).k4.o1.f();
    }

    @Override
    public int getCaptionLimit() {
        if (yac.h(this.V).p()) {
            return getCaptionPremiumLimit();
        }
        return getCaptionDefaultLimit();
    }

    @Override
    public int getCaptionPremiumLimit() {
        return uc7.s1(this.V).k4.p1.f();
    }

    @Override
    public int getEditTextHeight() {
        return super.getEditTextHeight();
    }

    @Override
    public int getEditTextLeft() {
        if (this.S0) {
            return hl.L(31.0f);
        }
        return 0;
    }

    @Override
    public int getEditTextStyle() {
        return 3;
    }

    @Override
    public final void r(int i) {
        float f;
        float L = (-Math.min(hl.L(34.0f), i)) - hl.L(10.0f);
        if (this instanceof qb8) {
            f = -1.0f;
        } else {
            f = 1.0f;
        }
        this.d1.setTranslationY(L * f);
    }

    @Override
    public final void s(int i, int i2) {
        boolean z;
        boolean z2;
        CharSequence text = getText();
        boolean z3 = false;
        if (i2 > 2 && text != null && !TextUtils.isEmpty(text.toString().trim())) {
            z = true;
        } else {
            z = false;
        }
        F(z);
        if (this.s1) {
            if (i < 3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (i2 < 3) {
                z3 = true;
            }
            if (z2 != z3) {
                invalidate();
            }
        }
    }

    public void setIsVideo(boolean z) {
        this.q1 = z;
    }

    public void setOnAddPhotoClick(View.OnClickListener onClickListener) {
        this.T0.setOnClickListener(onClickListener);
    }

    public void setOnTimerChange(pcc pccVar) {
        this.r1 = pccVar;
    }

    @Override
    public void setText(CharSequence charSequence) {
        super.setText(charSequence);
    }

    public void setTimer(int i) {
        int max;
        boolean z;
        this.b1 = i;
        if (i == Integer.MAX_VALUE) {
            max = 1;
        } else {
            max = Math.max(1, i);
        }
        if (this.b1 > 0) {
            z = true;
        } else {
            z = false;
        }
        this.W0.f(max, z, true);
        kg5 kg5Var = this.d1;
        if (kg5Var != null) {
            kg5Var.f(true);
        }
    }

    @Override
    public final void t() {
        Runnable runnable = this.e1;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void u(float f) {
        float f2 = 1.0f - f;
        this.V0.setAlpha(f2);
        this.T0.setAlpha(f2);
    }

    @Override
    public void x(int i) {
        boolean z = this.m0;
        super.x(i);
        if (!z && this.M.c()) {
            B();
        }
    }

    public final void z() {
        boolean z;
        rb1 rb1Var = this.p1;
        hl.r(rb1Var);
        if (uc7.s1(this.V).X3.getInt("movecaptionhint", 0) >= 24) {
            boolean z2 = f11.a;
            z = false;
        } else {
            z = true;
        }
        this.o1 = z;
        if (z) {
            SharedPreferences sharedPreferences = uc7.s1(this.V).X3;
            sharedPreferences.edit().putInt("movecaptionhint", sharedPreferences.getInt("movecaptionhint", 0) + 1).apply();
            invalidate();
            hl.d3(rb1Var, 5000L);
        }
    }
}
