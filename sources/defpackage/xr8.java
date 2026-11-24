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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public abstract class xr8 extends FrameLayout implements gk7 {
    public final uq0 a;
    public final vec b;
    public final u1b c;
    public final wr8 d;
    public int e;
    public boolean f;
    public ValueAnimator h;
    public float n;
    public boolean r;
    public final Rect s;
    public final sr8 w;

    public xr8(Context context, u1b u1bVar, final nca ncaVar) {
        super(context);
        this.s = new Rect();
        this.c = u1bVar;
        Objects.requireNonNull(u1bVar);
        this.w = new sr8(u1bVar, (byte) 0);
        final oca ocaVar = (oca) this;
        uq0 uq0Var = new uq0(ocaVar, context, ncaVar, (byte) 2);
        this.a = uq0Var;
        uq0Var.setAllowDisallowInterceptTouch(true);
        wr8 wr8Var = new wr8(ocaVar);
        this.d = wr8Var;
        wr8Var.a = u1bVar.a();
        uq0Var.setAdapter(wr8Var);
        uq0Var.setTranslationY(gl.L(42.0f));
        vec l = uq0Var.l(10, true);
        this.b = l;
        l.h(bkb.wi, bkb.F6, bkb.ui, bkb.xi, bkb.r8);
        l.r = 12;
        l.setPreTabClick(new j8c() {
            @Override
            public final Object g(Integer num, Object obj) {
                g2b storiesController;
                byte b = r3;
                final nca ncaVar2 = ncaVar;
                oca ocaVar2 = ocaVar;
                switch (b) {
                    case 0:
                        Integer num2 = (Integer) obj;
                        if (ocaVar2.f) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            ij.P(ncaVar2.a, ncaVar2.b, ncaVar2.c, new wh9(ncaVar2, (byte) 16));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj;
                        if (num.intValue() != -1 && num.intValue() != 0 && !ocaVar2.f) {
                            final int intValue = num.intValue();
                            nfa nfaVar = ncaVar2.d;
                            d dVar = nfaVar.y1;
                            storiesController = nfaVar.getStoriesController();
                            if (storiesController.h(nfaVar.m1)) {
                                cs5 I = cs5.I(dVar, view);
                                I.X(new bq8(ncaVar2));
                                I.b(2131231767, k96.M0(2131744561, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b2 = r3;
                                        int i = intValue;
                                        nca ncaVar3 = ncaVar2;
                                        switch (b2) {
                                            case 0:
                                                nfa nfaVar2 = ncaVar3.d;
                                                nfaVar2.U0(i, nfaVar2.m1, nfaVar2.y1);
                                                return;
                                            case 1:
                                                nfa nfaVar3 = ncaVar3.d;
                                                nfaVar3.W0(i, nfaVar3.m1, nfaVar3.y1);
                                                return;
                                            case 2:
                                                ncaVar3.d.o1(i);
                                                return;
                                            default:
                                                nfa nfaVar4 = ncaVar3.d;
                                                nfaVar4.V0(i, nfaVar4.m1, nfaVar4.y1);
                                                return;
                                        }
                                    }
                                }, false);
                                nfaVar.g(new u39(I, (byte) 12), dVar, nfaVar.m1, intValue);
                                I.b(2131232121, k96.M0(2131744556, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b2 = r3;
                                        int i = intValue;
                                        nca ncaVar3 = ncaVar2;
                                        switch (b2) {
                                            case 0:
                                                nfa nfaVar2 = ncaVar3.d;
                                                nfaVar2.U0(i, nfaVar2.m1, nfaVar2.y1);
                                                return;
                                            case 1:
                                                nfa nfaVar3 = ncaVar3.d;
                                                nfaVar3.W0(i, nfaVar3.m1, nfaVar3.y1);
                                                return;
                                            case 2:
                                                ncaVar3.d.o1(i);
                                                return;
                                            default:
                                                nfa nfaVar4 = ncaVar3.d;
                                                nfaVar4.V0(i, nfaVar4.m1, nfaVar4.y1);
                                                return;
                                        }
                                    }
                                }, false);
                                I.b(2131232778, k96.M0(2131744553, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b2 = r3;
                                        int i = intValue;
                                        nca ncaVar3 = ncaVar2;
                                        switch (b2) {
                                            case 0:
                                                nfa nfaVar2 = ncaVar3.d;
                                                nfaVar2.U0(i, nfaVar2.m1, nfaVar2.y1);
                                                return;
                                            case 1:
                                                nfa nfaVar3 = ncaVar3.d;
                                                nfaVar3.W0(i, nfaVar3.m1, nfaVar3.y1);
                                                return;
                                            case 2:
                                                ncaVar3.d.o1(i);
                                                return;
                                            default:
                                                nfa nfaVar4 = ncaVar3.d;
                                                nfaVar4.V0(i, nfaVar4.m1, nfaVar4.y1);
                                                return;
                                        }
                                    }
                                }, false);
                                I.b(2131232113, k96.M0(2131744559, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b2 = r3;
                                        int i = intValue;
                                        nca ncaVar3 = ncaVar2;
                                        switch (b2) {
                                            case 0:
                                                nfa nfaVar2 = ncaVar3.d;
                                                nfaVar2.U0(i, nfaVar2.m1, nfaVar2.y1);
                                                return;
                                            case 1:
                                                nfa nfaVar3 = ncaVar3.d;
                                                nfaVar3.W0(i, nfaVar3.m1, nfaVar3.y1);
                                                return;
                                            case 2:
                                                ncaVar3.d.o1(i);
                                                return;
                                            default:
                                                nfa nfaVar4 = ncaVar3.d;
                                                nfaVar4.V0(i, nfaVar4.m1, nfaVar4.y1);
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
        l.setOnTabLongClick(new j8c() {
            @Override
            public final Object g(Integer num, Object obj) {
                g2b storiesController;
                byte b = r3;
                final nca ncaVar2 = ncaVar;
                oca ocaVar2 = ocaVar;
                switch (b) {
                    case 0:
                        Integer num2 = (Integer) obj;
                        if (ocaVar2.f) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            ij.P(ncaVar2.a, ncaVar2.b, ncaVar2.c, new wh9(ncaVar2, (byte) 16));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj;
                        if (num.intValue() != -1 && num.intValue() != 0 && !ocaVar2.f) {
                            final int intValue = num.intValue();
                            nfa nfaVar = ncaVar2.d;
                            d dVar = nfaVar.y1;
                            storiesController = nfaVar.getStoriesController();
                            if (storiesController.h(nfaVar.m1)) {
                                cs5 I = cs5.I(dVar, view);
                                I.X(new bq8(ncaVar2));
                                I.b(2131231767, k96.M0(2131744561, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b2 = r3;
                                        int i = intValue;
                                        nca ncaVar3 = ncaVar2;
                                        switch (b2) {
                                            case 0:
                                                nfa nfaVar2 = ncaVar3.d;
                                                nfaVar2.U0(i, nfaVar2.m1, nfaVar2.y1);
                                                return;
                                            case 1:
                                                nfa nfaVar3 = ncaVar3.d;
                                                nfaVar3.W0(i, nfaVar3.m1, nfaVar3.y1);
                                                return;
                                            case 2:
                                                ncaVar3.d.o1(i);
                                                return;
                                            default:
                                                nfa nfaVar4 = ncaVar3.d;
                                                nfaVar4.V0(i, nfaVar4.m1, nfaVar4.y1);
                                                return;
                                        }
                                    }
                                }, false);
                                nfaVar.g(new u39(I, (byte) 12), dVar, nfaVar.m1, intValue);
                                I.b(2131232121, k96.M0(2131744556, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b2 = r3;
                                        int i = intValue;
                                        nca ncaVar3 = ncaVar2;
                                        switch (b2) {
                                            case 0:
                                                nfa nfaVar2 = ncaVar3.d;
                                                nfaVar2.U0(i, nfaVar2.m1, nfaVar2.y1);
                                                return;
                                            case 1:
                                                nfa nfaVar3 = ncaVar3.d;
                                                nfaVar3.W0(i, nfaVar3.m1, nfaVar3.y1);
                                                return;
                                            case 2:
                                                ncaVar3.d.o1(i);
                                                return;
                                            default:
                                                nfa nfaVar4 = ncaVar3.d;
                                                nfaVar4.V0(i, nfaVar4.m1, nfaVar4.y1);
                                                return;
                                        }
                                    }
                                }, false);
                                I.b(2131232778, k96.M0(2131744553, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b2 = r3;
                                        int i = intValue;
                                        nca ncaVar3 = ncaVar2;
                                        switch (b2) {
                                            case 0:
                                                nfa nfaVar2 = ncaVar3.d;
                                                nfaVar2.U0(i, nfaVar2.m1, nfaVar2.y1);
                                                return;
                                            case 1:
                                                nfa nfaVar3 = ncaVar3.d;
                                                nfaVar3.W0(i, nfaVar3.m1, nfaVar3.y1);
                                                return;
                                            case 2:
                                                ncaVar3.d.o1(i);
                                                return;
                                            default:
                                                nfa nfaVar4 = ncaVar3.d;
                                                nfaVar4.V0(i, nfaVar4.m1, nfaVar4.y1);
                                                return;
                                        }
                                    }
                                }, false);
                                I.b(2131232113, k96.M0(2131744559, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b2 = r3;
                                        int i = intValue;
                                        nca ncaVar3 = ncaVar2;
                                        switch (b2) {
                                            case 0:
                                                nfa nfaVar2 = ncaVar3.d;
                                                nfaVar2.U0(i, nfaVar2.m1, nfaVar2.y1);
                                                return;
                                            case 1:
                                                nfa nfaVar3 = ncaVar3.d;
                                                nfaVar3.W0(i, nfaVar3.m1, nfaVar3.y1);
                                                return;
                                            case 2:
                                                ncaVar3.d.o1(i);
                                                return;
                                            default:
                                                nfa nfaVar4 = ncaVar3.d;
                                                nfaVar4.V0(i, nfaVar4.m1, nfaVar4.y1);
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
        addView(l, nme.e(-1, 42, 48));
        c(!u1bVar.h.isEmpty(), false, true);
    }

    public final void a() {
        int i;
        vec vecVar = this.b;
        if (vecVar != null) {
            i = vecVar.getCurrentTabId();
        } else {
            i = 0;
        }
        u1b u1bVar = this.c;
        boolean a = u1bVar.a();
        wr8 wr8Var = this.d;
        wr8Var.a = a;
        this.a.m(true);
        c(!u1bVar.h.isEmpty(), true, false);
        int i2 = this.e;
        if (i2 > 0) {
            if (wr8Var.i(i2) != -1) {
                gl.e3(new ur8(this, this.e, (byte) 1), 500L);
                this.e = 0;
            }
        } else if (vecVar != null && i > 0 && u1bVar.b(i) == null) {
            vecVar.e(0, 0);
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
        this.h.setInterpolator(s33.h);
        this.h.addUpdateListener(new u28(this, (byte) 18));
        this.h.start();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.k3 && ((Long) objArr[0]).longValue() == this.c.b) {
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
        u1b u1bVar = this.c;
        kk7.f(u1bVar.a).b(this, kk7.k3);
        if (this.r != u1bVar.h.isEmpty() && this.d.a == u1bVar.a()) {
            return;
        }
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.f(this.c.a).n(this, kk7.k3);
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
            gl.e3(new ur8(this, i, (byte) 0), 500L);
        } else {
            this.e = i;
        }
    }

    public void setReorderingAlbums(boolean z) {
        float f;
        float f2;
        if (this.f != z) {
            this.f = z;
            vec vecVar = this.b;
            vecVar.setReordering(z);
            boolean z2 = this.f;
            oca ocaVar = (oca) this;
            nfa nfaVar = ocaVar.x;
            TextView textView = nfaVar.t0;
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
            scaleX.scaleY(f3).withEndAction(new k08((byte) 14, ocaVar, z2)).start();
            nfaVar.G1(true);
            nfaVar.Q0();
            if (z) {
                d S = LaunchActivity.S();
                if (S instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) S;
                    profileActivity.j3(false);
                    gl.d3(new vr8(profileActivity, (byte) 0));
                }
            }
            if (!z) {
                gl.r(this.w);
                u1b u1bVar = this.c;
                u1bVar.e();
                u1bVar.f(false);
                int currentPosition = vecVar.getCurrentPosition();
                wr8 wr8Var = this.d;
                int f4 = wr8Var.f(currentPosition);
                this.a.m(true);
                int i = wr8Var.i(f4);
                vecVar.f(0.0f, i, i);
            }
        }
    }
}
