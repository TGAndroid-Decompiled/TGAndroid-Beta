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
public abstract class yt8 extends FrameLayout implements jm7 {
    public final ur0 a;
    public final vgc b;
    public final v3b c;
    public final xt8 d;
    public int e;
    public boolean f;
    public ValueAnimator h;
    public float n;
    public boolean r;
    public final Rect s;
    public final pp8 w;

    public yt8(Context context, v3b v3bVar, final nea neaVar) {
        super(context);
        this.s = new Rect();
        this.c = v3bVar;
        Objects.requireNonNull(v3bVar);
        this.w = new pp8(v3bVar, (byte) 8);
        final oea oeaVar = (oea) this;
        ur0 ur0Var = new ur0(oeaVar, context, neaVar, (byte) 2);
        this.a = ur0Var;
        ur0Var.setAllowDisallowInterceptTouch(true);
        xt8 xt8Var = new xt8(oeaVar);
        this.d = xt8Var;
        xt8Var.a = v3bVar.a();
        ur0Var.setAdapter(xt8Var);
        ur0Var.setTranslationY(gm.L(42.0f));
        vgc l = ur0Var.l(10, true);
        this.b = l;
        l.h(cmb.wi, cmb.F6, cmb.ui, cmb.xi, cmb.r8);
        l.r = 12;
        l.setPreTabClick(new kac() {
            @Override
            public final Object j(Integer num, Object obj) {
                h4b storiesController;
                byte b = r3;
                final nea neaVar2 = neaVar;
                oea oeaVar2 = oeaVar;
                switch (b) {
                    case 0:
                        Integer num2 = (Integer) obj;
                        if (oeaVar2.f) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            ik.P(neaVar2.a, neaVar2.b, neaVar2.c, new yf9(neaVar2, (byte) 20));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj;
                        if (num.intValue() != -1 && num.intValue() != 0 && !oeaVar2.f) {
                            final int intValue = num.intValue();
                            nha nhaVar = neaVar2.d;
                            d dVar = nhaVar.y1;
                            storiesController = nhaVar.getStoriesController();
                            if (storiesController.h(nhaVar.m1)) {
                                bu5 I = bu5.I(dVar, view);
                                I.X(new ds8(neaVar2));
                                I.b(2131231768, jb6.M0(2131744487, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b2 = r3;
                                        int i = intValue;
                                        nea neaVar3 = neaVar2;
                                        switch (b2) {
                                            case 0:
                                                nha nhaVar2 = neaVar3.d;
                                                nhaVar2.U0(i, nhaVar2.m1, nhaVar2.y1);
                                                return;
                                            case 1:
                                                nha nhaVar3 = neaVar3.d;
                                                nhaVar3.W0(i, nhaVar3.m1, nhaVar3.y1);
                                                return;
                                            case 2:
                                                neaVar3.d.o1(i);
                                                return;
                                            default:
                                                nha nhaVar4 = neaVar3.d;
                                                nhaVar4.V0(i, nhaVar4.m1, nhaVar4.y1);
                                                return;
                                        }
                                    }
                                }, false);
                                nhaVar.g(new x59(I, (byte) 12), dVar, nhaVar.m1, intValue);
                                I.b(2131232122, jb6.M0(2131744482, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b2 = r3;
                                        int i = intValue;
                                        nea neaVar3 = neaVar2;
                                        switch (b2) {
                                            case 0:
                                                nha nhaVar2 = neaVar3.d;
                                                nhaVar2.U0(i, nhaVar2.m1, nhaVar2.y1);
                                                return;
                                            case 1:
                                                nha nhaVar3 = neaVar3.d;
                                                nhaVar3.W0(i, nhaVar3.m1, nhaVar3.y1);
                                                return;
                                            case 2:
                                                neaVar3.d.o1(i);
                                                return;
                                            default:
                                                nha nhaVar4 = neaVar3.d;
                                                nhaVar4.V0(i, nhaVar4.m1, nhaVar4.y1);
                                                return;
                                        }
                                    }
                                }, false);
                                I.b(2131232791, jb6.M0(2131744479, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b2 = r3;
                                        int i = intValue;
                                        nea neaVar3 = neaVar2;
                                        switch (b2) {
                                            case 0:
                                                nha nhaVar2 = neaVar3.d;
                                                nhaVar2.U0(i, nhaVar2.m1, nhaVar2.y1);
                                                return;
                                            case 1:
                                                nha nhaVar3 = neaVar3.d;
                                                nhaVar3.W0(i, nhaVar3.m1, nhaVar3.y1);
                                                return;
                                            case 2:
                                                neaVar3.d.o1(i);
                                                return;
                                            default:
                                                nha nhaVar4 = neaVar3.d;
                                                nhaVar4.V0(i, nhaVar4.m1, nhaVar4.y1);
                                                return;
                                        }
                                    }
                                }, false);
                                I.b(2131232114, jb6.M0(2131744485, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b2 = r3;
                                        int i = intValue;
                                        nea neaVar3 = neaVar2;
                                        switch (b2) {
                                            case 0:
                                                nha nhaVar2 = neaVar3.d;
                                                nhaVar2.U0(i, nhaVar2.m1, nhaVar2.y1);
                                                return;
                                            case 1:
                                                nha nhaVar3 = neaVar3.d;
                                                nhaVar3.W0(i, nhaVar3.m1, nhaVar3.y1);
                                                return;
                                            case 2:
                                                neaVar3.d.o1(i);
                                                return;
                                            default:
                                                nha nhaVar4 = neaVar3.d;
                                                nhaVar4.V0(i, nhaVar4.m1, nhaVar4.y1);
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
        l.setOnTabLongClick(new kac() {
            @Override
            public final Object j(Integer num, Object obj) {
                h4b storiesController;
                byte b = r3;
                final nea neaVar2 = neaVar;
                oea oeaVar2 = oeaVar;
                switch (b) {
                    case 0:
                        Integer num2 = (Integer) obj;
                        if (oeaVar2.f) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            ik.P(neaVar2.a, neaVar2.b, neaVar2.c, new yf9(neaVar2, (byte) 20));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj;
                        if (num.intValue() != -1 && num.intValue() != 0 && !oeaVar2.f) {
                            final int intValue = num.intValue();
                            nha nhaVar = neaVar2.d;
                            d dVar = nhaVar.y1;
                            storiesController = nhaVar.getStoriesController();
                            if (storiesController.h(nhaVar.m1)) {
                                bu5 I = bu5.I(dVar, view);
                                I.X(new ds8(neaVar2));
                                I.b(2131231768, jb6.M0(2131744487, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b2 = r3;
                                        int i = intValue;
                                        nea neaVar3 = neaVar2;
                                        switch (b2) {
                                            case 0:
                                                nha nhaVar2 = neaVar3.d;
                                                nhaVar2.U0(i, nhaVar2.m1, nhaVar2.y1);
                                                return;
                                            case 1:
                                                nha nhaVar3 = neaVar3.d;
                                                nhaVar3.W0(i, nhaVar3.m1, nhaVar3.y1);
                                                return;
                                            case 2:
                                                neaVar3.d.o1(i);
                                                return;
                                            default:
                                                nha nhaVar4 = neaVar3.d;
                                                nhaVar4.V0(i, nhaVar4.m1, nhaVar4.y1);
                                                return;
                                        }
                                    }
                                }, false);
                                nhaVar.g(new x59(I, (byte) 12), dVar, nhaVar.m1, intValue);
                                I.b(2131232122, jb6.M0(2131744482, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b2 = r3;
                                        int i = intValue;
                                        nea neaVar3 = neaVar2;
                                        switch (b2) {
                                            case 0:
                                                nha nhaVar2 = neaVar3.d;
                                                nhaVar2.U0(i, nhaVar2.m1, nhaVar2.y1);
                                                return;
                                            case 1:
                                                nha nhaVar3 = neaVar3.d;
                                                nhaVar3.W0(i, nhaVar3.m1, nhaVar3.y1);
                                                return;
                                            case 2:
                                                neaVar3.d.o1(i);
                                                return;
                                            default:
                                                nha nhaVar4 = neaVar3.d;
                                                nhaVar4.V0(i, nhaVar4.m1, nhaVar4.y1);
                                                return;
                                        }
                                    }
                                }, false);
                                I.b(2131232791, jb6.M0(2131744479, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b2 = r3;
                                        int i = intValue;
                                        nea neaVar3 = neaVar2;
                                        switch (b2) {
                                            case 0:
                                                nha nhaVar2 = neaVar3.d;
                                                nhaVar2.U0(i, nhaVar2.m1, nhaVar2.y1);
                                                return;
                                            case 1:
                                                nha nhaVar3 = neaVar3.d;
                                                nhaVar3.W0(i, nhaVar3.m1, nhaVar3.y1);
                                                return;
                                            case 2:
                                                neaVar3.d.o1(i);
                                                return;
                                            default:
                                                nha nhaVar4 = neaVar3.d;
                                                nhaVar4.V0(i, nhaVar4.m1, nhaVar4.y1);
                                                return;
                                        }
                                    }
                                }, false);
                                I.b(2131232114, jb6.M0(2131744485, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b2 = r3;
                                        int i = intValue;
                                        nea neaVar3 = neaVar2;
                                        switch (b2) {
                                            case 0:
                                                nha nhaVar2 = neaVar3.d;
                                                nhaVar2.U0(i, nhaVar2.m1, nhaVar2.y1);
                                                return;
                                            case 1:
                                                nha nhaVar3 = neaVar3.d;
                                                nhaVar3.W0(i, nhaVar3.m1, nhaVar3.y1);
                                                return;
                                            case 2:
                                                neaVar3.d.o1(i);
                                                return;
                                            default:
                                                nha nhaVar4 = neaVar3.d;
                                                nhaVar4.V0(i, nhaVar4.m1, nhaVar4.y1);
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
        addView(l, qoe.e(-1, 42, 48));
        c(!v3bVar.h.isEmpty(), false, true);
    }

    public final void a() {
        int i;
        vgc vgcVar = this.b;
        if (vgcVar != null) {
            i = vgcVar.getCurrentTabId();
        } else {
            i = 0;
        }
        v3b v3bVar = this.c;
        boolean a = v3bVar.a();
        xt8 xt8Var = this.d;
        xt8Var.a = a;
        this.a.m(true);
        c(!v3bVar.h.isEmpty(), true, false);
        int i2 = this.e;
        if (i2 > 0) {
            if (xt8Var.i(i2) != -1) {
                gm.d3(new wt8(this, this.e, (byte) 1), 500L);
                this.e = 0;
            }
        } else if (vgcVar != null && i > 0 && v3bVar.b(i) == null) {
            vgcVar.e(0, 0);
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
        this.h.setInterpolator(d53.h);
        this.h.addUpdateListener(new fx7(this, (byte) 20));
        this.h.start();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.l3 && ((Long) objArr[0]).longValue() == this.c.b) {
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
        v3b v3bVar = this.c;
        nm7.f(v3bVar.a).b(this, nm7.l3);
        if (this.r != v3bVar.h.isEmpty() && this.d.a == v3bVar.a()) {
            return;
        }
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.f(this.c.a).n(this, nm7.l3);
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
            gm.d3(new wt8(this, i, (byte) 0), 500L);
        } else {
            this.e = i;
        }
    }

    public void setReorderingAlbums(boolean z) {
        float f;
        float f2;
        if (this.f != z) {
            this.f = z;
            vgc vgcVar = this.b;
            vgcVar.setReordering(z);
            boolean z2 = this.f;
            oea oeaVar = (oea) this;
            nha nhaVar = oeaVar.x;
            TextView textView = nhaVar.t0;
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
            scaleX.scaleY(f3).withEndAction(new n28((byte) 14, oeaVar, z2)).start();
            nhaVar.G1(true);
            nhaVar.Q0();
            if (z) {
                d S = LaunchActivity.S();
                if (S instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) S;
                    profileActivity.n3(false);
                    gm.c3(new gs8(profileActivity, (byte) 1));
                }
            }
            if (!z) {
                gm.r(this.w);
                v3b v3bVar = this.c;
                v3bVar.e();
                v3bVar.f(false);
                int currentPosition = vgcVar.getCurrentPosition();
                xt8 xt8Var = this.d;
                int f4 = xt8Var.f(currentPosition);
                this.a.m(true);
                int i = xt8Var.i(f4);
                vgcVar.f(0.0f, i, i);
            }
        }
    }
}
