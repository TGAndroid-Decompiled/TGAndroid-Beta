package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import j$.util.Objects;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public abstract class gv8 extends FrameLayout implements fn7 {
    public final uq0 a;
    public final uic b;
    public final q5b c;
    public final fv8 d;
    public int e;
    public boolean f;
    public ValueAnimator h;
    public float n;
    public boolean r;
    public final Rect s;
    public final uk8 w;

    public gv8(Context context, q5b q5bVar, final ega egaVar) {
        super(context);
        this.s = new Rect();
        this.c = q5bVar;
        Objects.requireNonNull(q5bVar);
        this.w = new uk8(q5bVar, (byte) 16);
        final fga fgaVar = (fga) this;
        uq0 uq0Var = new uq0(fgaVar, context, egaVar, (byte) 2);
        this.a = uq0Var;
        uq0Var.setAllowDisallowInterceptTouch(true);
        fv8 fv8Var = new fv8(fgaVar);
        this.d = fv8Var;
        fv8Var.a = q5bVar.a();
        uq0Var.setAdapter(fv8Var);
        uq0Var.setTranslationY(hl.L(42.0f));
        uic l = uq0Var.l(10, true);
        this.b = l;
        l.h(aob.xi, aob.G6, aob.vi, aob.yi, aob.s8);
        l.r = 12;
        l.setPreTabClick(new jcc() {
            @Override
            public final Object g(Integer num, Object obj) {
                c6b storiesController;
                byte b = r3;
                final ega egaVar2 = egaVar;
                fga fgaVar2 = fgaVar;
                switch (b) {
                    case 0:
                        Integer num2 = (Integer) obj;
                        if (fgaVar2.f) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            jj.P(egaVar2.a, egaVar2.b, egaVar2.c, new ye9(egaVar2, (byte) 29));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj;
                        if (num.intValue() != -1 && num.intValue() != 0 && !fgaVar2.f) {
                            final int intValue = num.intValue();
                            eja ejaVar = egaVar2.d;
                            e eVar = ejaVar.y1;
                            storiesController = ejaVar.getStoriesController();
                            if (storiesController.h(ejaVar.m1)) {
                                fu5 I = fu5.I(eVar, view);
                                I.X(new nt8(egaVar2));
                                I.b(2131231767, ob6.M0(2131744455, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b2 = r3;
                                        int i = intValue;
                                        ega egaVar3 = egaVar2;
                                        switch (b2) {
                                            case 0:
                                                eja ejaVar2 = egaVar3.d;
                                                ejaVar2.U0(i, ejaVar2.m1, ejaVar2.y1);
                                                return;
                                            case 1:
                                                eja ejaVar3 = egaVar3.d;
                                                ejaVar3.W0(i, ejaVar3.m1, ejaVar3.y1);
                                                return;
                                            case 2:
                                                egaVar3.d.o1(i);
                                                return;
                                            default:
                                                eja ejaVar4 = egaVar3.d;
                                                ejaVar4.V0(i, ejaVar4.m1, ejaVar4.y1);
                                                return;
                                        }
                                    }
                                }, false);
                                ejaVar.g(new ve9(I, (byte) 9), eVar, ejaVar.m1, intValue);
                                I.b(2131232121, ob6.M0(2131744450, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b2 = r3;
                                        int i = intValue;
                                        ega egaVar3 = egaVar2;
                                        switch (b2) {
                                            case 0:
                                                eja ejaVar2 = egaVar3.d;
                                                ejaVar2.U0(i, ejaVar2.m1, ejaVar2.y1);
                                                return;
                                            case 1:
                                                eja ejaVar3 = egaVar3.d;
                                                ejaVar3.W0(i, ejaVar3.m1, ejaVar3.y1);
                                                return;
                                            case 2:
                                                egaVar3.d.o1(i);
                                                return;
                                            default:
                                                eja ejaVar4 = egaVar3.d;
                                                ejaVar4.V0(i, ejaVar4.m1, ejaVar4.y1);
                                                return;
                                        }
                                    }
                                }, false);
                                I.b(2131232797, ob6.M0(2131744447, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b2 = r3;
                                        int i = intValue;
                                        ega egaVar3 = egaVar2;
                                        switch (b2) {
                                            case 0:
                                                eja ejaVar2 = egaVar3.d;
                                                ejaVar2.U0(i, ejaVar2.m1, ejaVar2.y1);
                                                return;
                                            case 1:
                                                eja ejaVar3 = egaVar3.d;
                                                ejaVar3.W0(i, ejaVar3.m1, ejaVar3.y1);
                                                return;
                                            case 2:
                                                egaVar3.d.o1(i);
                                                return;
                                            default:
                                                eja ejaVar4 = egaVar3.d;
                                                ejaVar4.V0(i, ejaVar4.m1, ejaVar4.y1);
                                                return;
                                        }
                                    }
                                }, false);
                                I.b(2131232113, ob6.M0(2131744453, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b2 = r3;
                                        int i = intValue;
                                        ega egaVar3 = egaVar2;
                                        switch (b2) {
                                            case 0:
                                                eja ejaVar2 = egaVar3.d;
                                                ejaVar2.U0(i, ejaVar2.m1, ejaVar2.y1);
                                                return;
                                            case 1:
                                                eja ejaVar3 = egaVar3.d;
                                                ejaVar3.W0(i, ejaVar3.m1, ejaVar3.y1);
                                                return;
                                            case 2:
                                                egaVar3.d.o1(i);
                                                return;
                                            default:
                                                eja ejaVar4 = egaVar3.d;
                                                ejaVar4.V0(i, ejaVar4.m1, ejaVar4.y1);
                                                return;
                                        }
                                    }
                                }, true);
                                I.a0();
                            }
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                }
            }
        });
        l.setOnTabLongClick(new jcc() {
            @Override
            public final Object g(Integer num, Object obj) {
                c6b storiesController;
                byte b = r3;
                final ega egaVar2 = egaVar;
                fga fgaVar2 = fgaVar;
                switch (b) {
                    case 0:
                        Integer num2 = (Integer) obj;
                        if (fgaVar2.f) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            jj.P(egaVar2.a, egaVar2.b, egaVar2.c, new ye9(egaVar2, (byte) 29));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj;
                        if (num.intValue() != -1 && num.intValue() != 0 && !fgaVar2.f) {
                            final int intValue = num.intValue();
                            eja ejaVar = egaVar2.d;
                            e eVar = ejaVar.y1;
                            storiesController = ejaVar.getStoriesController();
                            if (storiesController.h(ejaVar.m1)) {
                                fu5 I = fu5.I(eVar, view);
                                I.X(new nt8(egaVar2));
                                I.b(2131231767, ob6.M0(2131744455, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b2 = r3;
                                        int i = intValue;
                                        ega egaVar3 = egaVar2;
                                        switch (b2) {
                                            case 0:
                                                eja ejaVar2 = egaVar3.d;
                                                ejaVar2.U0(i, ejaVar2.m1, ejaVar2.y1);
                                                return;
                                            case 1:
                                                eja ejaVar3 = egaVar3.d;
                                                ejaVar3.W0(i, ejaVar3.m1, ejaVar3.y1);
                                                return;
                                            case 2:
                                                egaVar3.d.o1(i);
                                                return;
                                            default:
                                                eja ejaVar4 = egaVar3.d;
                                                ejaVar4.V0(i, ejaVar4.m1, ejaVar4.y1);
                                                return;
                                        }
                                    }
                                }, false);
                                ejaVar.g(new ve9(I, (byte) 9), eVar, ejaVar.m1, intValue);
                                I.b(2131232121, ob6.M0(2131744450, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b2 = r3;
                                        int i = intValue;
                                        ega egaVar3 = egaVar2;
                                        switch (b2) {
                                            case 0:
                                                eja ejaVar2 = egaVar3.d;
                                                ejaVar2.U0(i, ejaVar2.m1, ejaVar2.y1);
                                                return;
                                            case 1:
                                                eja ejaVar3 = egaVar3.d;
                                                ejaVar3.W0(i, ejaVar3.m1, ejaVar3.y1);
                                                return;
                                            case 2:
                                                egaVar3.d.o1(i);
                                                return;
                                            default:
                                                eja ejaVar4 = egaVar3.d;
                                                ejaVar4.V0(i, ejaVar4.m1, ejaVar4.y1);
                                                return;
                                        }
                                    }
                                }, false);
                                I.b(2131232797, ob6.M0(2131744447, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b2 = r3;
                                        int i = intValue;
                                        ega egaVar3 = egaVar2;
                                        switch (b2) {
                                            case 0:
                                                eja ejaVar2 = egaVar3.d;
                                                ejaVar2.U0(i, ejaVar2.m1, ejaVar2.y1);
                                                return;
                                            case 1:
                                                eja ejaVar3 = egaVar3.d;
                                                ejaVar3.W0(i, ejaVar3.m1, ejaVar3.y1);
                                                return;
                                            case 2:
                                                egaVar3.d.o1(i);
                                                return;
                                            default:
                                                eja ejaVar4 = egaVar3.d;
                                                ejaVar4.V0(i, ejaVar4.m1, ejaVar4.y1);
                                                return;
                                        }
                                    }
                                }, false);
                                I.b(2131232113, ob6.M0(2131744453, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b2 = r3;
                                        int i = intValue;
                                        ega egaVar3 = egaVar2;
                                        switch (b2) {
                                            case 0:
                                                eja ejaVar2 = egaVar3.d;
                                                ejaVar2.U0(i, ejaVar2.m1, ejaVar2.y1);
                                                return;
                                            case 1:
                                                eja ejaVar3 = egaVar3.d;
                                                ejaVar3.W0(i, ejaVar3.m1, ejaVar3.y1);
                                                return;
                                            case 2:
                                                egaVar3.d.o1(i);
                                                return;
                                            default:
                                                eja ejaVar4 = egaVar3.d;
                                                ejaVar4.V0(i, ejaVar4.m1, ejaVar4.y1);
                                                return;
                                        }
                                    }
                                }, true);
                                I.a0();
                            }
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                }
            }
        });
        addView(l, tre.e(-1, 42, 48));
        c(!q5bVar.h.isEmpty(), false, true);
    }

    public final void a() {
        int i;
        uic uicVar = this.b;
        if (uicVar != null) {
            i = uicVar.getCurrentTabId();
        } else {
            i = 0;
        }
        q5b q5bVar = this.c;
        boolean a = q5bVar.a();
        fv8 fv8Var = this.d;
        fv8Var.a = a;
        this.a.m(true);
        c(!q5bVar.h.isEmpty(), true, false);
        int i2 = this.e;
        if (i2 > 0) {
            if (fv8Var.i(i2) != -1) {
                hl.d3(new dv8(this, this.e, (byte) 1), 500L);
                this.e = 0;
            }
        } else if (uicVar != null && i > 0 && q5bVar.b(i) == null) {
            uicVar.e(0, 0);
        }
    }

    public abstract void b();

    public final void c(boolean z, boolean z2, boolean z3) {
        if (this.r == z && !z3) {
            return;
        }
        this.r = z;
        setEnabled(z);
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.h = null;
        }
        float f = 0.0f;
        if (!z2) {
            if (z) {
                f = 1.0f;
            }
            this.n = f;
            b();
            return;
        }
        float f2 = this.n;
        if (z) {
            f = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        this.h = ofFloat;
        ofFloat.setDuration(480L);
        this.h.setInterpolator(k43.h);
        this.h.addUpdateListener(new pv7(this, (byte) 21));
        this.h.start();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.l3 && ((Long) objArr[0]).longValue() == this.c.b) {
            a();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.r && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public int getCurrentAlbumId() {
        return this.d.f(this.b.getCurrentPosition());
    }

    public float getVisibilityFactor() {
        return this.n;
    }

    public float getVisualHeight() {
        return getMeasuredHeight() * this.n;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        q5b q5bVar = this.c;
        jn7.f(q5bVar.a).b(this, jn7.l3);
        if (this.r != q5bVar.h.isEmpty() && this.d.a == q5bVar.a()) {
            return;
        }
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.f(this.c.a).n(this, jn7.l3);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Rect rect = this.s;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
    }

    public void setInitialTabId(int i) {
        if (this.d.i(i) != -1) {
            hl.d3(new dv8(this, i, (byte) 0), 500L);
        } else {
            this.e = i;
        }
    }

    public void setReorderingAlbums(boolean z) {
        float f;
        float f2;
        if (this.f != z) {
            this.f = z;
            uic uicVar = this.b;
            uicVar.setReordering(z);
            boolean z2 = this.f;
            fga fgaVar = (fga) this;
            eja ejaVar = fgaVar.x;
            TextView textView = ejaVar.t0;
            textView.setVisibility(0);
            ViewPropertyAnimator animate = textView.animate();
            float f3 = 1.0f;
            if (z2) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f);
            if (z2) {
                f2 = 1.0f;
            } else {
                f2 = 0.4f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f2);
            if (!z2) {
                f3 = 0.4f;
            }
            scaleX.scaleY(f3).withEndAction(new q38((byte) 14, fgaVar, z2)).start();
            ejaVar.G1(true);
            ejaVar.Q0();
            if (z) {
                e S = LaunchActivity.S();
                if (S instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) S;
                    profileActivity.k3(false);
                    hl.c3(new ev8(profileActivity, (byte) 0));
                }
            }
            if (!z) {
                hl.r(this.w);
                q5b q5bVar = this.c;
                q5bVar.e();
                q5bVar.f(false);
                int currentPosition = uicVar.getCurrentPosition();
                fv8 fv8Var = this.d;
                int f4 = fv8Var.f(currentPosition);
                this.a.m(true);
                int i = fv8Var.i(f4);
                uicVar.f(0.0f, i, i);
            }
        }
    }
}
