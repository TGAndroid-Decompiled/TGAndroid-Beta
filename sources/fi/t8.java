package fi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.ls;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.xi0;
public final class t8 extends du0 {
    public float f12635g0;
    public float f12636h0;
    public float f12637i0;
    public final float[] f12638j0;
    public final Path f12639k0;
    public final RectF f12640l0;
    public final RectF m0;
    public final RectF f12641n0;
    public final RectF f12642o0;
    public final RectF f12643p0;
    public final SparseArray f12644q0;
    public final org.telegram.ui.ActionBar.g2 f12645r0;
    public final f9 f12646s0;

    public t8(f9 f9Var, Context context, org.telegram.ui.ActionBar.g2 g2Var) {
        super(context, null);
        this.f12646s0 = f9Var;
        this.f12645r0 = g2Var;
        this.f12638j0 = new float[8];
        this.f12639k0 = new Path();
        this.f12640l0 = new RectF();
        this.m0 = new RectF();
        this.f12641n0 = new RectF();
        this.f12642o0 = new RectF();
        this.f12643p0 = new RectF();
        this.f12644q0 = new SparseArray();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: fi.t8.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        f9 f9Var = this.f12646s0;
        if (keyCode != 24 && keyEvent.getKeyCode() != 25) {
            if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                f9Var.p();
                return true;
            }
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        f9Var.w(keyEvent);
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        float floatValue;
        int i7;
        v8 v8Var;
        int i10;
        xi0 xi0Var;
        f9 f9Var = this.f12646s0;
        float[] fArr = f9Var.f12029p0;
        z3 currentPeerView = f9Var.f12027o0.getCurrentPeerView();
        if (currentPeerView != null) {
            g3 g3Var = currentPeerView.f12920u0;
            if (g3Var.f12778a0.x()) {
                float x10 = currentPeerView.getX();
                float y10 = ((View) currentPeerView.getParent()).getY() + currentPeerView.getY();
                motionEvent.offsetLocation(-x10, -y10);
                if (!g3Var.f12778a0.n(currentPeerView.getContext()).onTouchEvent(motionEvent)) {
                    motionEvent.offsetLocation(x10, y10);
                }
                return true;
            }
        }
        float f10 = 0.0f;
        if (f9Var.f12030p1 && currentPeerView != null && (xi0Var = currentPeerView.f12856b3) != null) {
            float f11 = 0.0f;
            for (View view = currentPeerView; view != null && (view.getParent() instanceof View); view = (View) view.getParent()) {
                f10 += view.getX();
                f11 += view.getY();
            }
            if (currentPeerView.f12856b3.getReactionsWindow() != null && currentPeerView.f12856b3.getReactionsWindow().f5328c != null) {
                motionEvent.offsetLocation(-f10, (-f11) - currentPeerView.f12856b3.getReactionsWindow().f5328c.getTranslationY());
                currentPeerView.f12856b3.getReactionsWindow().f5328c.dispatchTouchEvent(motionEvent);
                return true;
            }
            Rect rect = org.telegram.messenger.g0.Q;
            xi0Var.getHitRect(rect);
            rect.offset((int) f10, (int) f11);
            if (motionEvent.getAction() == 0 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                currentPeerView.Z0(false);
                return true;
            }
            motionEvent.offsetLocation(-rect.left, -rect.top);
            xi0Var.dispatchTouchEvent(motionEvent);
            return true;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            z10 = false;
        } else {
            f9Var.f12021k0 = false;
            org.telegram.messenger.g0.r(f9Var.f12001b1);
            float f12 = f9Var.Y;
            if (f12 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, 0.0f);
                f9Var.H = ofFloat;
                ofFloat.addUpdateListener(new q8(this, 0));
                f9Var.H.addListener(new r8(this, 0));
                f9Var.H.setDuration(250L);
                f9Var.H.setInterpolator(nr.f37960f);
                f9Var.H.start();
            }
            if (f9Var.W >= 0.3f) {
                f9Var.u(true);
            }
            f9Var.Q(false);
            f9Var.R(false);
            z10 = true;
        }
        if (motionEvent.getAction() == 0) {
            f9Var.f12000b0 = false;
            if (currentPeerView != null) {
                bi.t2 t2Var = currentPeerView.f12876i0;
                k8 k8Var = currentPeerView.m0;
                c3 c3Var = currentPeerView.M0;
                hi.l3 l3Var = currentPeerView.f12900p0;
                if (l3Var != null && l3Var.W && k8Var != null) {
                    if (!l3Var.D0.contains(motionEvent.getX() - (currentPeerView.f12900p0.getX() + (c3Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.f12900p0.getY() + (c3Var.getY() + currentPeerView.getY()))) && !currentPeerView.F0(k8Var, motionEvent)) {
                        currentPeerView.f12900p0.f(true);
                    }
                }
                hi.l3 l3Var2 = currentPeerView.f12904q0;
                if (l3Var2 != null && l3Var2.W && t2Var != null && !l3Var2.D0.contains(motionEvent.getX() - (currentPeerView.f12904q0.getX() + (c3Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.f12904q0.getY() + (c3Var.getY() + currentPeerView.getY()))) && !currentPeerView.F0(t2Var, motionEvent)) {
                    currentPeerView.f12904q0.f(true);
                }
            }
            f9Var.f12027o0.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        }
        if (!f9Var.f12050y && !f9Var.H0 && !f9Var.I0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i11 = (f9Var.f12011f0 > 0.0f ? 1 : (f9Var.f12011f0 == 0.0f ? 0 : -1));
        SparseArray sparseArray = this.f12644q0;
        if (i11 == 0 && !f9Var.f12021k0 && f9Var.f12027o0.G0 == 1 && motionEvent.getAction() == 2 && z11 && (((((Float) sparseArray.get(motionEvent.getPointerId(0), Float.valueOf(0.0f))).floatValue() - motionEvent.getX(0)) != 0.0f && (((i10 = (v8Var = f9Var.f12027o0).J0) == 0 && v8Var.L0 == 0.0f && floatValue < 0.0f) || (i10 == v8Var.getAdapter().b() - 1 && v8Var.L0 == 0.0f && i7 > 0))) || f9Var.Y != 0.0f)) {
            float f13 = f9Var.Y;
            if (f13 == 0.0f) {
                f9Var.Z = -floatValue;
            }
            if ((floatValue < 0.0f && f9Var.Z > 0.0f) || (i7 > 0 && f9Var.Z < 0.0f)) {
                floatValue *= 0.2f;
            }
            f9Var.Y = f13 - floatValue;
            f9.i(f9Var);
            float f14 = f9Var.Y;
            if ((f14 > 0.0f && f9Var.Z < 0.0f) || (f14 < 0.0f && f9Var.Z > 0.0f)) {
                f9Var.Y = 0.0f;
            }
            z12 = true;
        } else {
            z12 = false;
        }
        if (currentPeerView != null && f9Var.f12011f0 == 0.0f && !f9Var.f12021k0 && !f9Var.L0 && !f9Var.I0 && f9Var.f12027o0.G0 != 1) {
            org.telegram.messenger.g0.r1(currentPeerView.M0, this, fArr);
            motionEvent.offsetLocation(-fArr[0], -fArr[1]);
            z3 currentPeerView2 = f9Var.f12027o0.getCurrentPeerView();
            currentPeerView2.H2.a(motionEvent, currentPeerView2.M0, null, null, 0);
            motionEvent.offsetLocation(fArr[0], fArr[1]);
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                sparseArray.put(motionEvent.getPointerId(i12), Float.valueOf(motionEvent.getX(i12)));
            }
        } else {
            sparseArray.clear();
        }
        if (!z12) {
            boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (f9Var.f12011f0 != 0.0f && !f9Var.f12014g1 && f9Var.f12031q0 < org.telegram.messenger.g0.L(20.0f)) {
                    if (f9Var.f12048x.f12191f > 0.5f) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    f9Var.o(z13);
                }
                z3 z14 = f9Var.z();
                if (z14 != null) {
                    z14.f12920u0.f12800x0 = false;
                }
            }
            if (z10 && !f9Var.f12000b0) {
                f9Var.m();
            }
            if (!dispatchTouchEvent && (!f9.f11993x1 || !f9Var.f12034r0)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f12646s0.f12052z0) {
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f9 f9Var = this.f12646s0;
        if (f9Var.f11999b && !f9Var.f12002c) {
            org.telegram.ui.ActionBar.g2 g2Var = this.f12645r0;
            org.telegram.messenger.g0.Z2(g2Var.getParentActivity(), g2Var.getClassGuid());
        }
        setTag(2131296353, new s8(this));
        ls.f(f9Var.h).c(f9Var, ls.A5);
        ls.f(f9Var.h).c(f9Var, ls.f25424y5);
        ls.f(f9Var.h).c(f9Var, ls.f25294d1);
        ls.f(f9Var.h).c(f9Var, ls.f25288c1);
        ls.f(f9Var.h).c(f9Var, ls.f25431z5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(2131296353, null);
        f9 f9Var = this.f12646s0;
        ls.f(f9Var.h).n(f9Var, ls.A5);
        ls.f(f9Var.h).n(f9Var, ls.f25424y5);
        ls.f(f9Var.h).n(f9Var, ls.f25294d1);
        ls.f(f9Var.h).n(f9Var, ls.f25288c1);
        ls.f(f9Var.h).n(f9Var, ls.f25431z5);
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: fi.t8.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        f9 f9Var = this.f12646s0;
        ((FrameLayout.LayoutParams) f9Var.f12006d1.getLayoutParams()).topMargin = org.telegram.messenger.g0.f24040m - org.telegram.messenger.g0.L(2.0f);
        f9Var.f12006d1.getLayoutParams().height = org.telegram.messenger.g0.L(2.0f);
        super.onMeasure(i7, i10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a2 a2Var;
        int action = motionEvent.getAction();
        f9 f9Var = this.f12646s0;
        if (action == 1 || motionEvent.getAction() == 3) {
            f9Var.f12021k0 = false;
            f9Var.Q(false);
            if (f9Var.W >= 1.0f) {
                f9Var.u(true);
            } else if (!f9Var.H0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f9Var.X, 0.0f);
                f9Var.H = ofFloat;
                ofFloat.addUpdateListener(new q8(this, 1));
                f9Var.H.addListener(new r8(this, 1));
                f9Var.H.setDuration(150L);
                f9Var.H.setInterpolator(nr.f37960f);
                f9Var.H.start();
            }
            z3 z10 = f9Var.z();
            if (z10 != null && (a2Var = z10.f12924v0) != null) {
                a2Var.setAllowTouches(true);
            }
        }
        if (!f9Var.f12021k0 && !f9Var.f12050y && f9Var.f11997a0 == 0.0f && ((f9Var.f12011f0 == 0.0f || (!f9Var.f12013g0 && !f9Var.f12015h0)) && !f9Var.f12020j1)) {
            return false;
        }
        f9Var.f12019j0.onTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        this.f12646s0.f12013g0 = false;
    }
}
