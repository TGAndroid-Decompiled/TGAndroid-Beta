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
public abstract class mb1 extends ib1 {
    public boolean S0;
    public final ImageView T0;
    public boolean U0;
    public final ImageView V0;
    public final hb1 W0;
    public cs5 X0;
    public final gc Y0;
    public final ImageView Z0;
    public je5 a1;
    public int b1;
    public final int[] c1;
    public final je5 d1;
    public final Runnable e1;
    public final RectF f1;
    public final Drawable g1;
    public final gn h1;
    public final n41 i1;
    public il0 j1;
    public final lm k1;
    public final lm l1;
    public final lm m1;
    public boolean n1;
    public boolean o1;
    public final jb1 p1;
    public boolean q1;
    public p8c r1;
    public boolean s1;

    public mb1(Context context, z zVar, cja cjaVar, FrameLayout frameLayout, wjb wjbVar, sl0 sl0Var, Runnable runnable) {
        super(context, zVar, cjaVar, frameLayout, wjbVar, sl0Var);
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
        gn gnVar = new gn(false, false, false);
        this.h1 = gnVar;
        this.i1 = new n41(this);
        s33 s33Var = s33.h;
        this.k1 = new lm(this, 0L, 350L, s33Var);
        this.l1 = new lm(this, 0L, 350L, s33Var);
        this.m1 = new lm(this, 0L, 350L, s33Var);
        this.p1 = new jb1(this, (byte) 0);
        this.e1 = runnable;
        gnVar.w(gl.L(14.0f));
        gnVar.N = gl.q.x;
        gnVar.u(-1);
        boolean z = this instanceof z78;
        if (z) {
            gnVar.t(k96.M0(2131748133, null), true, true);
            this.g1 = context.getResources().getDrawable(2131231843);
        } else {
            gnVar.t(k96.M0(2131748132, null), true, true);
            this.g1 = context.getResources().getDrawable(2131231842);
        }
        ImageView imageView = new ImageView(context);
        this.T0 = imageView;
        imageView.setImageResource(2131231081);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(bkb.f0(1090519039, 1, gl.L(18.0f)));
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
        addView(imageView, nme.d(44, 44.0f, i5, 14.0f, f, 0.0f, f2));
        ImageView imageView2 = new ImageView(context);
        this.V0 = imageView2;
        hb1 hb1Var = new hb1(5);
        this.W0 = hb1Var;
        imageView2.setImageDrawable(hb1Var);
        imageView2.setBackground(bkb.f0(1090519039, 1, gl.L(18.0f)));
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
        addView(imageView2, nme.d(44, 44.0f, i6, 0.0f, f4, 10.0f, f5));
        if (z) {
            i3 = 1;
        } else {
            i3 = 3;
        }
        je5 je5Var = new je5(context, i3);
        this.d1 = je5Var;
        je5Var.q(12.0f);
        int L = gl.L(12.0f);
        if (z) {
            f6 = 8.0f;
        } else {
            f6 = f7;
        }
        je5Var.setPadding(L, gl.L(f6), gl.L(12.0f), gl.L(z ? f7 : 8.0f));
        je5Var.n(1.0f, -21.0f);
        je5Var.p(true);
        if (z) {
            i4 = 48;
        } else {
            i4 = 80;
        }
        addView(je5Var, nme.e(-1, 80, i4 | 5));
        ImageView imageView3 = new ImageView(context);
        this.Z0 = imageView3;
        gc gcVar = new gc(context);
        this.Y0 = gcVar;
        imageView3.setImageDrawable(gcVar);
        imageView3.setScaleType(scaleType);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1140850689, PorterDuff.Mode.MULTIPLY));
        imageView3.setBackground(bkb.f0(1090519039, 1, gl.L(16.0f)));
        addView(imageView3, nme.d(44, 44.0f, 53, 8.0f, 0.0f, 8.0f, 0.0f));
        imageView3.setContentDescription(k96.M0(2131755006, null));
        ote.a(imageView3);
        this.f.getEditText().addTextChangedListener(new b7(this, (byte) 3));
        imageView3.setVisibility(8);
        imageView3.setAlpha(0.0f);
        imageView3.setScaleX(0.6f);
        imageView3.setScaleY(0.6f);
        imageView3.setOnClickListener(new x91(this, (byte) 2));
        imageView2.setOnClickListener(new kb1(this, zVar, (byte) 0));
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
            f2 = gl.L(-8.0f);
        }
        imageView.setTranslationX(f2);
        cb1 cb1Var = this.f;
        cb1Var.getEditText().setTranslationX(gl.U1(this.o0, getEditTextLeft() + gl.L(-26.0f), gl.L(2.0f)));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) cb1Var.getLayoutParams();
        if (this.S0 && this.U0) {
            i2 = 33;
        }
        marginLayoutParams.rightMargin = gl.L(32 + i2);
        cb1Var.setLayoutParams(marginLayoutParams);
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
                f2 = gl.L(8.0f);
            }
            alpha.translationX(f2).withEndAction(new lb1(this, z, (byte) 1)).start();
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
                f2 = gl.L(8.0f);
            }
            imageView.setTranslationX(f2);
        }
        cb1 cb1Var = this.f;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) cb1Var.getLayoutParams();
        if (this.S0 && this.U0) {
            i2 = 33;
        }
        marginLayoutParams.rightMargin = gl.L(32 + i2);
        cb1Var.setLayoutParams(marginLayoutParams);
    }

    public final void F(boolean z) {
        float f;
        float f2;
        if (this.s1 != z) {
            if (z) {
                na7.q1(this.V).O1().b();
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
            scaleX.scaleY(f3).setInterpolator(s33.h).setDuration(420L).withEndAction(new lb1(this, z, (byte) 0)).start();
            if (z) {
                gc gcVar = this.Y0;
                Objects.requireNonNull(gcVar);
                imageView.postDelayed(new fc(gcVar, (byte) 1), 220L);
                je5 je5Var = this.a1;
                if (je5Var != null) {
                    je5Var.f(true);
                    this.a1 = null;
                }
                if (na7.c1().getInt("aihintshown", 0) < 3) {
                    je5 je5Var2 = new je5(getContext(), 3);
                    this.a1 = je5Var2;
                    je5Var2.p(true);
                    this.a1.t(k96.M0(2131754992, null));
                    this.a1.o(1.0f, ((-imageView.getWidth()) / 2.0f) + gl.L(4.0f));
                    addView(this.a1, nme.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
                    je5 je5Var3 = this.a1;
                    je5Var3.r0 = new q21(this, je5Var2, (byte) 14);
                    je5Var3.d = 4000L;
                    je5Var3.v();
                    na7.c1().edit().putInt("aihintshown", na7.c1().getInt("aihintshown", 0) + 1).apply();
                    return;
                }
                return;
            }
            je5 je5Var4 = this.a1;
            if (je5Var4 != null) {
                je5Var4.f(true);
                this.a1 = null;
            }
        }
    }

    public abstract boolean G();

    public final void H(wjb wjbVar) {
        this.a = wjbVar;
        this.h.setColorFilter(new PorterDuffColorFilter(bkb.w0(null, bkb.T5, false), PorterDuff.Mode.SRC_IN));
        int L = gl.L(16.0f);
        int i = bkb.pg;
        ShapeDrawable K = bkb.K(L, bkb.v0(i, wjbVar));
        fm2 fm2Var = this.n;
        fm2Var.a = K;
        fm2Var.invalidateSelf();
        this.W0.e(-1, bkb.v0(i, wjbVar), -1);
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
        je5 je5Var = this.d1;
        if (je5Var != null) {
            je5Var.f(true);
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
            imageView.setTranslationX(-gl.L((1.0f - this.o0) * 4.0f));
            if (this instanceof z78) {
                f2 = rectF.bottom - gl.L(44.0f);
                i = 1;
            } else {
                f2 = rectF.top;
                i = -1;
            }
            imageView.setTranslationY((Utilities.l((-this.k1.e(false, this.f.getEditText().getLineCount())) + 4.0f) * gl.L(3.0f) * i) + f2);
        }
        float f3 = this.l1.f(this.n1, !G());
        float d = this.m1.d(this.o1);
        if (f3 > 0.0f) {
            float a = this.i1.a(0.03f);
            int L = gl.L((1.0f - this.o0) * 4.0f);
            boolean z = this instanceof z78;
            gn gnVar = this.h1;
            RectF rectF2 = this.f1;
            if (z) {
                f = 1.0f;
                rectF2.set(gl.L(7.0f) + L, rectF.bottom + gl.L(10.0f), de9.v(gnVar.c(), gl.L(11.0f), d, gl.L(44.0f) + L), rectF.bottom + gl.L(42.0f));
            } else {
                f = 1.0f;
                rectF2.set(gl.L(7.0f) + L, rectF.top - gl.L(42.0f), de9.v(gnVar.c(), gl.L(11.0f), d, gl.L(44.0f) + L), rectF.top - gl.L(10.0f));
            }
            if (f3 < f) {
                canvas.saveLayerAlpha(rectF2, (int) (f3 * 255.0f), 31);
            } else {
                canvas.save();
            }
            canvas.scale(a, a, rectF2.centerX(), rectF2.centerY());
            canvas.clipRect(rectF2);
            kl0 kl0Var = this.h0;
            if (kl0Var != null) {
                if (this.j1 == null) {
                    il0 c = kl0Var.c(this, null, false);
                    c.p(nod.i(this.a));
                    c.q(gl.L(5.0f));
                    c.r(gl.L(16.0f));
                    this.j1 = c;
                }
                Rect rect = gl.Q;
                rectF2.round(rect);
                rect.inset(-gl.L(5.0f), -gl.L(5.0f));
                this.j1.setBounds(rect);
                this.j1.draw(canvas);
            }
            Drawable drawable = this.g1;
            drawable.setBounds((int) (rectF2.left + gl.L(9.0f)), (int) (rectF2.centerY() - gl.L(10.0f)), (int) (rectF2.left + gl.L(29.0f)), (int) (rectF2.centerY() + gl.L(10.0f)));
            drawable.draw(canvas);
            gnVar.o(rectF2.left + gl.L(37.0f), rectF2.top, rectF2.right, rectF2.bottom);
            gnVar.C = (int) (d * 255.0f);
            gnVar.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i;
        boolean z;
        int action = motionEvent.getAction();
        RectF rectF = this.f1;
        lm lmVar = this.l1;
        n41 n41Var = this.i1;
        if (action == 0) {
            if (lmVar.c > 0.0f && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                z = true;
            } else {
                z = false;
            }
            n41Var.c(z);
        } else if (motionEvent.getAction() == 2) {
            if (n41Var.i && (lmVar.c <= 0.0f || !rectF.contains(motionEvent.getX(), motionEvent.getY()))) {
                n41Var.c(false);
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && n41Var.i) {
            if (motionEvent.getAction() == 1) {
                A();
                if (this instanceof z78) {
                    i = 2131748133;
                } else {
                    i = 2131748132;
                }
                this.h1.t(k96.M0(i, null), true, true);
            }
            n41Var.c(false);
            return true;
        }
        if (!n41Var.i && !super.dispatchTouchEvent(motionEvent)) {
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
        return na7.q1(this.V).k4.g1.f();
    }

    @Override
    public int getCaptionLimit() {
        if (y6c.h(this.V).p()) {
            return getCaptionPremiumLimit();
        }
        return getCaptionDefaultLimit();
    }

    @Override
    public int getCaptionPremiumLimit() {
        return na7.q1(this.V).k4.h1.f();
    }

    @Override
    public int getEditTextHeight() {
        return super.getEditTextHeight();
    }

    @Override
    public int getEditTextLeft() {
        if (this.S0) {
            return gl.L(31.0f);
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
        float L = (-Math.min(gl.L(34.0f), i)) - gl.L(10.0f);
        if (this instanceof z78) {
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

    public void setOnTimerChange(p8c p8cVar) {
        this.r1 = p8cVar;
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
        je5 je5Var = this.d1;
        if (je5Var != null) {
            je5Var.f(true);
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
        jb1 jb1Var = this.p1;
        gl.r(jb1Var);
        if (na7.q1(this.V).X3.getInt("movecaptionhint", 0) >= 24) {
            boolean z2 = w01.a;
            z = false;
        } else {
            z = true;
        }
        this.o1 = z;
        if (z) {
            SharedPreferences sharedPreferences = na7.q1(this.V).X3;
            sharedPreferences.edit().putInt("movecaptionhint", sharedPreferences.getInt("movecaptionhint", 0) + 1).apply();
            invalidate();
            gl.e3(jb1Var, 5000L);
        }
    }
}
