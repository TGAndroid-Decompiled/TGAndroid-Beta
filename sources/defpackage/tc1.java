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
public abstract class tc1 extends pc1 {
    public boolean S0;
    public final ImageView T0;
    public boolean U0;
    public final ImageView V0;
    public final oc1 W0;
    public bu5 X0;
    public final hd Y0;
    public final ImageView Z0;
    public hg5 a1;
    public int b1;
    public final int[] c1;
    public final hg5 d1;
    public final Runnable e1;
    public final RectF f1;
    public final Drawable g1;
    public final ho h1;
    public final u51 i1;
    public im0 j1;
    public final ln k1;
    public final ln l1;
    public final ln m1;
    public boolean n1;
    public boolean o1;
    public final qc1 p1;
    public boolean q1;
    public qac r1;
    public boolean s1;

    public tc1(Context context, z zVar, ela elaVar, FrameLayout frameLayout, ylb ylbVar, sm0 sm0Var, Runnable runnable) {
        super(context, zVar, elaVar, frameLayout, ylbVar, sm0Var);
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
        ho hoVar = new ho(false, false, false);
        this.h1 = hoVar;
        this.i1 = new u51(this);
        d53 d53Var = d53.h;
        this.k1 = new ln(this, 0L, 350L, d53Var);
        this.l1 = new ln(this, 0L, 350L, d53Var);
        this.m1 = new ln(this, 0L, 350L, d53Var);
        this.p1 = new qc1(this, (byte) 0);
        this.e1 = runnable;
        hoVar.w(gm.L(14.0f));
        hoVar.N = gm.q.x;
        hoVar.u(-1);
        boolean z = this instanceof ba8;
        if (z) {
            hoVar.t(jb6.M0(2131748082, null), true, true);
            this.g1 = context.getResources().getDrawable(2131231844);
        } else {
            hoVar.t(jb6.M0(2131748081, null), true, true);
            this.g1 = context.getResources().getDrawable(2131231843);
        }
        ImageView imageView = new ImageView(context);
        this.T0 = imageView;
        imageView.setImageResource(2131231082);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(cmb.f0(1090519039, 1, gm.L(18.0f)));
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
        addView(imageView, qoe.d(44, 44.0f, i5, 14.0f, f, 0.0f, f2));
        ImageView imageView2 = new ImageView(context);
        this.V0 = imageView2;
        oc1 oc1Var = new oc1(5);
        this.W0 = oc1Var;
        imageView2.setImageDrawable(oc1Var);
        imageView2.setBackground(cmb.f0(1090519039, 1, gm.L(18.0f)));
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
        addView(imageView2, qoe.d(44, 44.0f, i6, 0.0f, f4, 10.0f, f5));
        if (z) {
            i3 = 1;
        } else {
            i3 = 3;
        }
        hg5 hg5Var = new hg5(context, i3);
        this.d1 = hg5Var;
        hg5Var.q(12.0f);
        int L = gm.L(12.0f);
        if (z) {
            f6 = 8.0f;
        } else {
            f6 = f7;
        }
        hg5Var.setPadding(L, gm.L(f6), gm.L(12.0f), gm.L(z ? f7 : 8.0f));
        hg5Var.n(1.0f, -21.0f);
        hg5Var.p(true);
        if (z) {
            i4 = 48;
        } else {
            i4 = 80;
        }
        addView(hg5Var, qoe.e(-1, 80, i4 | 5));
        ImageView imageView3 = new ImageView(context);
        this.Z0 = imageView3;
        hd hdVar = new hd(context);
        this.Y0 = hdVar;
        imageView3.setImageDrawable(hdVar);
        imageView3.setScaleType(scaleType);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1140850689, PorterDuff.Mode.MULTIPLY));
        imageView3.setBackground(cmb.f0(1090519039, 1, gm.L(16.0f)));
        addView(imageView3, qoe.d(44, 44.0f, 53, 8.0f, 0.0f, 8.0f, 0.0f));
        imageView3.setContentDescription(jb6.M0(2131755006, null));
        rve.a(imageView3);
        this.f.getEditText().addTextChangedListener(new b7(this, (byte) 4));
        imageView3.setVisibility(8);
        imageView3.setAlpha(f7);
        imageView3.setScaleX(0.6f);
        imageView3.setScaleY(0.6f);
        imageView3.setOnClickListener(new k81(this, (byte) 5));
        imageView2.setOnClickListener(new rc1(this, zVar, (byte) 0));
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
            f2 = gm.L(-8.0f);
        }
        imageView.setTranslationX(f2);
        jc1 jc1Var = this.f;
        jc1Var.getEditText().setTranslationX(gm.U1(this.o0, getEditTextLeft() + gm.L(-26.0f), gm.L(2.0f)));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) jc1Var.getLayoutParams();
        if (this.S0 && this.U0) {
            i2 = 33;
        }
        marginLayoutParams.rightMargin = gm.L(32 + i2);
        jc1Var.setLayoutParams(marginLayoutParams);
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
                f2 = gm.L(8.0f);
            }
            alpha.translationX(f2).withEndAction(new sc1(this, z, (byte) 1)).start();
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
                f2 = gm.L(8.0f);
            }
            imageView.setTranslationX(f2);
        }
        jc1 jc1Var = this.f;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) jc1Var.getLayoutParams();
        if (this.S0 && this.U0) {
            i2 = 33;
        }
        marginLayoutParams.rightMargin = gm.L(32 + i2);
        jc1Var.setLayoutParams(marginLayoutParams);
    }

    public final void F(boolean z) {
        float f;
        float f2;
        if (this.s1 != z) {
            if (z) {
                oc7.r1(this.V).P1().b();
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
            scaleX.scaleY(f3).setInterpolator(d53.h).setDuration(420L).withEndAction(new sc1(this, z, (byte) 0)).start();
            if (z) {
                hd hdVar = this.Y0;
                Objects.requireNonNull(hdVar);
                imageView.postDelayed(new gd(hdVar, (byte) 1), 220L);
                hg5 hg5Var = this.a1;
                if (hg5Var != null) {
                    hg5Var.f(true);
                    this.a1 = null;
                }
                if (oc7.d1().getInt("aihintshown", 0) < 3) {
                    hg5 hg5Var2 = new hg5(getContext(), 3);
                    this.a1 = hg5Var2;
                    hg5Var2.p(true);
                    this.a1.t(jb6.M0(2131754992, null));
                    this.a1.o(1.0f, ((-imageView.getWidth()) / 2.0f) + gm.L(4.0f));
                    addView(this.a1, qoe.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
                    hg5 hg5Var3 = this.a1;
                    hg5Var3.r0 = new y31(this, hg5Var2, (byte) 15);
                    hg5Var3.d = 4000L;
                    hg5Var3.v();
                    oc7.d1().edit().putInt("aihintshown", oc7.d1().getInt("aihintshown", 0) + 1).apply();
                    return;
                }
                return;
            }
            hg5 hg5Var4 = this.a1;
            if (hg5Var4 != null) {
                hg5Var4.f(true);
                this.a1 = null;
            }
        }
    }

    public abstract boolean G();

    public final void H(ylb ylbVar) {
        this.a = ylbVar;
        this.h.setColorFilter(new PorterDuffColorFilter(cmb.w0(null, cmb.T5, false), PorterDuff.Mode.SRC_IN));
        int L = gm.L(16.0f);
        int i = cmb.pg;
        ShapeDrawable K = cmb.K(L, cmb.v0(i, ylbVar));
        sn2 sn2Var = this.n;
        sn2Var.a = K;
        sn2Var.invalidateSelf();
        this.W0.e(-1, cmb.v0(i, ylbVar), -1);
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
        hg5 hg5Var = this.d1;
        if (hg5Var != null) {
            hg5Var.f(true);
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
            imageView.setTranslationX(-gm.L((1.0f - this.o0) * 4.0f));
            if (this instanceof ba8) {
                f2 = rectF.bottom - gm.L(44.0f);
                i = 1;
            } else {
                f2 = rectF.top;
                i = -1;
            }
            imageView.setTranslationY((Utilities.l((-this.k1.e(false, this.f.getEditText().getLineCount())) + 4.0f) * gm.L(3.0f) * i) + f2);
        }
        float f3 = this.l1.f(this.n1, !G());
        float d = this.m1.d(this.o1);
        if (f3 > 0.0f) {
            float a = this.i1.a(0.03f);
            int L = gm.L((1.0f - this.o0) * 4.0f);
            boolean z = this instanceof ba8;
            ho hoVar = this.h1;
            RectF rectF2 = this.f1;
            if (z) {
                f = 1.0f;
                rectF2.set(gm.L(7.0f) + L, rectF.bottom + gm.L(10.0f), hg9.u(hoVar.c(), gm.L(11.0f), d, gm.L(44.0f) + L), rectF.bottom + gm.L(42.0f));
            } else {
                f = 1.0f;
                rectF2.set(gm.L(7.0f) + L, rectF.top - gm.L(42.0f), hg9.u(hoVar.c(), gm.L(11.0f), d, gm.L(44.0f) + L), rectF.top - gm.L(10.0f));
            }
            if (f3 < f) {
                canvas.saveLayerAlpha(rectF2, (int) (f3 * 255.0f), 31);
            } else {
                canvas.save();
            }
            canvas.scale(a, a, rectF2.centerX(), rectF2.centerY());
            canvas.clipRect(rectF2);
            km0 km0Var = this.h0;
            if (km0Var != null) {
                if (this.j1 == null) {
                    im0 c = km0Var.c(this, null, false);
                    c.p(qqd.i(this.a));
                    c.q(gm.L(5.0f));
                    c.r(gm.L(16.0f));
                    this.j1 = c;
                }
                Rect rect = gm.Q;
                rectF2.round(rect);
                rect.inset(-gm.L(5.0f), -gm.L(5.0f));
                this.j1.setBounds(rect);
                this.j1.draw(canvas);
            }
            Drawable drawable = this.g1;
            drawable.setBounds((int) (rectF2.left + gm.L(9.0f)), (int) (rectF2.centerY() - gm.L(10.0f)), (int) (rectF2.left + gm.L(29.0f)), (int) (rectF2.centerY() + gm.L(10.0f)));
            drawable.draw(canvas);
            hoVar.o(rectF2.left + gm.L(37.0f), rectF2.top, rectF2.right, rectF2.bottom);
            hoVar.C = (int) (d * 255.0f);
            hoVar.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i;
        boolean z;
        int action = motionEvent.getAction();
        RectF rectF = this.f1;
        ln lnVar = this.l1;
        u51 u51Var = this.i1;
        if (action == 0) {
            if (lnVar.c > 0.0f && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                z = true;
            } else {
                z = false;
            }
            u51Var.c(z);
        } else if (motionEvent.getAction() == 2) {
            if (u51Var.i && (lnVar.c <= 0.0f || !rectF.contains(motionEvent.getX(), motionEvent.getY()))) {
                u51Var.c(false);
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && u51Var.i) {
            if (motionEvent.getAction() == 1) {
                A();
                if (this instanceof ba8) {
                    i = 2131748082;
                } else {
                    i = 2131748081;
                }
                this.h1.t(jb6.M0(i, null), true, true);
            }
            u51Var.c(false);
            return true;
        }
        if (!u51Var.i && !super.dispatchTouchEvent(motionEvent)) {
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
        return oc7.r1(this.V).l4.g1.f();
    }

    @Override
    public int getCaptionLimit() {
        if (z8c.h(this.V).p()) {
            return getCaptionPremiumLimit();
        }
        return getCaptionDefaultLimit();
    }

    @Override
    public int getCaptionPremiumLimit() {
        return oc7.r1(this.V).l4.h1.f();
    }

    @Override
    public int getEditTextHeight() {
        return super.getEditTextHeight();
    }

    @Override
    public int getEditTextLeft() {
        if (this.S0) {
            return gm.L(31.0f);
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
        float L = (-Math.min(gm.L(34.0f), i)) - gm.L(10.0f);
        if (this instanceof ba8) {
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

    public void setOnTimerChange(qac qacVar) {
        this.r1 = qacVar;
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
        this.W0.d(max, z, true);
        hg5 hg5Var = this.d1;
        if (hg5Var != null) {
            hg5Var.f(true);
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
        qc1 qc1Var = this.p1;
        gm.r(qc1Var);
        if (oc7.r1(this.V).X3.getInt("movecaptionhint", 0) >= 24) {
            boolean z2 = e21.a;
            z = false;
        } else {
            z = true;
        }
        this.o1 = z;
        if (z) {
            SharedPreferences sharedPreferences = oc7.r1(this.V).X3;
            sharedPreferences.edit().putInt("movecaptionhint", sharedPreferences.getInt("movecaptionhint", 0) + 1).apply();
            invalidate();
            gm.d3(qc1Var, 5000L);
        }
    }
}
