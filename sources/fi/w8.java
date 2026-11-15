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
import org.telegram.messenger.ns;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.st0;
public final class w8 extends st0 {
    public float f12475g0;
    public float f12476h0;
    public float f12477i0;
    public final float[] f12478j0;
    public final Path f12479k0;
    public final RectF f12480l0;
    public final RectF m0;
    public final RectF f12481n0;
    public final RectF f12482o0;
    public final RectF f12483p0;
    public final SparseArray f12484q0;
    public final org.telegram.ui.ActionBar.e2 f12485r0;
    public final i9 f12486s0;

    public w8(i9 i9Var, Context context, org.telegram.ui.ActionBar.e2 e2Var) {
        super(context, null);
        this.f12486s0 = i9Var;
        this.f12485r0 = e2Var;
        this.f12478j0 = new float[8];
        this.f12479k0 = new Path();
        this.f12480l0 = new RectF();
        this.m0 = new RectF();
        this.f12481n0 = new RectF();
        this.f12482o0 = new RectF();
        this.f12483p0 = new RectF();
        this.f12484q0 = new SparseArray();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: fi.w8.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        i9 i9Var = this.f12486s0;
        if (keyCode != 24 && keyEvent.getKeyCode() != 25) {
            if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                i9Var.p();
                return true;
            }
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        i9Var.w(keyEvent);
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
        y8 y8Var;
        int i10;
        mi0 mi0Var;
        i9 i9Var = this.f12486s0;
        float[] fArr = i9Var.f11863p0;
        b4 currentPeerView = i9Var.f11861o0.getCurrentPeerView();
        if (currentPeerView != null) {
            i3 i3Var = currentPeerView.f11526u0;
            if (i3Var.f11418a0.x()) {
                float x10 = currentPeerView.getX();
                float y10 = ((View) currentPeerView.getParent()).getY() + currentPeerView.getY();
                motionEvent.offsetLocation(-x10, -y10);
                if (!i3Var.f11418a0.n(currentPeerView.getContext()).onTouchEvent(motionEvent)) {
                    motionEvent.offsetLocation(x10, y10);
                }
                return true;
            }
        }
        float f10 = 0.0f;
        if (i9Var.f11864p1 && currentPeerView != null && (mi0Var = currentPeerView.f11462b3) != null) {
            float f11 = 0.0f;
            for (View view = currentPeerView; view != null && (view.getParent() instanceof View); view = (View) view.getParent()) {
                f10 += view.getX();
                f11 += view.getY();
            }
            if (currentPeerView.f11462b3.getReactionsWindow() != null && currentPeerView.f11462b3.getReactionsWindow().f5010c != null) {
                motionEvent.offsetLocation(-f10, (-f11) - currentPeerView.f11462b3.getReactionsWindow().f5010c.getTranslationY());
                currentPeerView.f11462b3.getReactionsWindow().f5010c.dispatchTouchEvent(motionEvent);
                return true;
            }
            Rect rect = org.telegram.messenger.g0.Q;
            mi0Var.getHitRect(rect);
            rect.offset((int) f10, (int) f11);
            if (motionEvent.getAction() == 0 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                currentPeerView.Z0(false);
                return true;
            }
            motionEvent.offsetLocation(-rect.left, -rect.top);
            mi0Var.dispatchTouchEvent(motionEvent);
            return true;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            z10 = false;
        } else {
            i9Var.f11855k0 = false;
            org.telegram.messenger.g0.r(i9Var.f11835b1);
            float f12 = i9Var.Y;
            if (f12 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, 0.0f);
                i9Var.H = ofFloat;
                ofFloat.addUpdateListener(new t8(this, 0));
                i9Var.H.addListener(new u8(this, 0));
                i9Var.H.setDuration(250L);
                i9Var.H.setInterpolator(er.f34420f);
                i9Var.H.start();
            }
            if (i9Var.W >= 0.3f) {
                i9Var.u(true);
            }
            i9Var.Q(false);
            i9Var.R(false);
            z10 = true;
        }
        if (motionEvent.getAction() == 0) {
            i9Var.f11834b0 = false;
            if (currentPeerView != null) {
                bi.v1 v1Var = currentPeerView.f11482i0;
                n8 n8Var = currentPeerView.m0;
                e3 e3Var = currentPeerView.M0;
                hi.l3 l3Var = currentPeerView.f11506p0;
                if (l3Var != null && l3Var.W && n8Var != null) {
                    if (!l3Var.D0.contains(motionEvent.getX() - (currentPeerView.f11506p0.getX() + (e3Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.f11506p0.getY() + (e3Var.getY() + currentPeerView.getY()))) && !currentPeerView.F0(n8Var, motionEvent)) {
                        currentPeerView.f11506p0.f(true);
                    }
                }
                hi.l3 l3Var2 = currentPeerView.f11510q0;
                if (l3Var2 != null && l3Var2.W && v1Var != null && !l3Var2.D0.contains(motionEvent.getX() - (currentPeerView.f11510q0.getX() + (e3Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.f11510q0.getY() + (e3Var.getY() + currentPeerView.getY()))) && !currentPeerView.F0(v1Var, motionEvent)) {
                    currentPeerView.f11510q0.f(true);
                }
            }
            i9Var.f11861o0.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        }
        if (!i9Var.f11884y && !i9Var.H0 && !i9Var.I0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i11 = (i9Var.f11845f0 > 0.0f ? 1 : (i9Var.f11845f0 == 0.0f ? 0 : -1));
        SparseArray sparseArray = this.f12484q0;
        if (i11 == 0 && !i9Var.f11855k0 && i9Var.f11861o0.G0 == 1 && motionEvent.getAction() == 2 && z11 && (((((Float) sparseArray.get(motionEvent.getPointerId(0), Float.valueOf(0.0f))).floatValue() - motionEvent.getX(0)) != 0.0f && (((i10 = (y8Var = i9Var.f11861o0).J0) == 0 && y8Var.L0 == 0.0f && floatValue < 0.0f) || (i10 == y8Var.getAdapter().b() - 1 && y8Var.L0 == 0.0f && i7 > 0))) || i9Var.Y != 0.0f)) {
            float f13 = i9Var.Y;
            if (f13 == 0.0f) {
                i9Var.Z = -floatValue;
            }
            if ((floatValue < 0.0f && i9Var.Z > 0.0f) || (i7 > 0 && i9Var.Z < 0.0f)) {
                floatValue *= 0.2f;
            }
            i9Var.Y = f13 - floatValue;
            i9.i(i9Var);
            float f14 = i9Var.Y;
            if ((f14 > 0.0f && i9Var.Z < 0.0f) || (f14 < 0.0f && i9Var.Z > 0.0f)) {
                i9Var.Y = 0.0f;
            }
            z12 = true;
        } else {
            z12 = false;
        }
        if (currentPeerView != null && i9Var.f11845f0 == 0.0f && !i9Var.f11855k0 && !i9Var.L0 && !i9Var.I0 && i9Var.f11861o0.G0 != 1) {
            org.telegram.messenger.g0.r1(currentPeerView.M0, this, fArr);
            motionEvent.offsetLocation(-fArr[0], -fArr[1]);
            b4 currentPeerView2 = i9Var.f11861o0.getCurrentPeerView();
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
                if (i9Var.f11845f0 != 0.0f && !i9Var.f11848g1 && i9Var.f11865q0 < org.telegram.messenger.g0.L(20.0f)) {
                    if (i9Var.f11882x.f11931f > 0.5f) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    i9Var.o(z13);
                }
                b4 z14 = i9Var.z();
                if (z14 != null) {
                    z14.f11526u0.f11440x0 = false;
                }
            }
            if (z10 && !i9Var.f11834b0) {
                i9Var.m();
            }
            if (!dispatchTouchEvent && (!i9.f11827x1 || !i9Var.f11868r0)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f12486s0.f11886z0) {
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        i9 i9Var = this.f12486s0;
        if (i9Var.f11833b && !i9Var.f11836c) {
            org.telegram.ui.ActionBar.e2 e2Var = this.f12485r0;
            org.telegram.messenger.g0.a3(e2Var.getParentActivity(), e2Var.getClassGuid());
        }
        setTag(2131296351, new v8(this));
        ns.f(i9Var.h).c(i9Var, ns.f25605x5);
        ns.f(i9Var.h).c(i9Var, ns.f25591v5);
        ns.f(i9Var.h).c(i9Var, ns.f25482d1);
        ns.f(i9Var.h).c(i9Var, ns.f25476c1);
        ns.f(i9Var.h).c(i9Var, ns.f25598w5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(2131296351, null);
        i9 i9Var = this.f12486s0;
        ns.f(i9Var.h).n(i9Var, ns.f25605x5);
        ns.f(i9Var.h).n(i9Var, ns.f25591v5);
        ns.f(i9Var.h).n(i9Var, ns.f25482d1);
        ns.f(i9Var.h).n(i9Var, ns.f25476c1);
        ns.f(i9Var.h).n(i9Var, ns.f25598w5);
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: fi.w8.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        i9 i9Var = this.f12486s0;
        ((FrameLayout.LayoutParams) i9Var.f11840d1.getLayoutParams()).topMargin = org.telegram.messenger.g0.f23603m - org.telegram.messenger.g0.L(2.0f);
        i9Var.f11840d1.getLayoutParams().height = org.telegram.messenger.g0.L(2.0f);
        super.onMeasure(i7, i10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c2 c2Var;
        int action = motionEvent.getAction();
        i9 i9Var = this.f12486s0;
        if (action == 1 || motionEvent.getAction() == 3) {
            i9Var.f11855k0 = false;
            i9Var.Q(false);
            if (i9Var.W >= 1.0f) {
                i9Var.u(true);
            } else if (!i9Var.H0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i9Var.X, 0.0f);
                i9Var.H = ofFloat;
                ofFloat.addUpdateListener(new t8(this, 1));
                i9Var.H.addListener(new u8(this, 1));
                i9Var.H.setDuration(150L);
                i9Var.H.setInterpolator(er.f34420f);
                i9Var.H.start();
            }
            b4 z10 = i9Var.z();
            if (z10 != null && (c2Var = z10.f11530v0) != null) {
                c2Var.setAllowTouches(true);
            }
        }
        if (!i9Var.f11855k0 && !i9Var.f11884y && i9Var.f11831a0 == 0.0f && ((i9Var.f11845f0 == 0.0f || (!i9Var.f11847g0 && !i9Var.f11849h0)) && !i9Var.f11854j1)) {
            return false;
        }
        i9Var.f11853j0.onTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        this.f12486s0.f11847g0 = false;
    }
}
