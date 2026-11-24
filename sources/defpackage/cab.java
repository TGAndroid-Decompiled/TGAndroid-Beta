package defpackage;

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
import org.telegram.ui.ActionBar.d;
public final class cab extends ela {
    public float m0;
    public float n0;
    public float o0;
    public final float[] p0;
    public final Path q0;
    public final RectF r0;
    public final RectF s0;
    public final RectF t0;
    public final RectF u0;
    public final RectF v0;
    public final SparseArray w0;
    public final d x0;
    public final oab y0;

    public cab(oab oabVar, Context context, d dVar) {
        super(context, null);
        this.y0 = oabVar;
        this.x0 = dVar;
        this.p0 = new float[8];
        this.q0 = new Path();
        this.r0 = new RectF();
        this.s0 = new RectF();
        this.t0 = new RectF();
        this.u0 = new RectF();
        this.v0 = new RectF();
        this.w0 = new SparseArray();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cab.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        oab oabVar = this.y0;
        if (keyCode != 24 && keyEvent.getKeyCode() != 25) {
            if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                oabVar.p();
                return true;
            }
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        oabVar.r(keyEvent);
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        float floatValue;
        int i;
        eab eabVar;
        int i2;
        v29 v29Var;
        oab oabVar = this.y0;
        float[] fArr = oabVar.p0;
        a58 currentPeerView = oabVar.o0.getCurrentPeerView();
        if (currentPeerView != null) {
            l48 l48Var = currentPeerView.A0;
            if (l48Var.W.w()) {
                float x = currentPeerView.getX();
                float y = ((View) currentPeerView.getParent()).getY() + currentPeerView.getY();
                motionEvent.offsetLocation(-x, -y);
                if (!l48Var.W.m(currentPeerView.getContext()).onTouchEvent(motionEvent)) {
                    motionEvent.offsetLocation(x, y);
                }
                return true;
            }
        }
        float f = 0.0f;
        if (oabVar.p1 && currentPeerView != null && (v29Var = currentPeerView.h3) != null) {
            float f2 = 0.0f;
            for (View view = currentPeerView; view != null && (view.getParent() instanceof View); view = (View) view.getParent()) {
                f += view.getX();
                f2 += view.getY();
            }
            if (currentPeerView.h3.getReactionsWindow() != null && currentPeerView.h3.getReactionsWindow().c != null) {
                motionEvent.offsetLocation(-f, (-f2) - currentPeerView.h3.getReactionsWindow().c.getTranslationY());
                currentPeerView.h3.getReactionsWindow().c.dispatchTouchEvent(motionEvent);
                return true;
            }
            Rect rect = gm.Q;
            v29Var.getHitRect(rect);
            rect.offset((int) f, (int) f2);
            if (motionEvent.getAction() == 0 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                currentPeerView.W0(false);
                return true;
            }
            motionEvent.offsetLocation(-rect.left, -rect.top);
            v29Var.dispatchTouchEvent(motionEvent);
            return true;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            z = false;
        } else {
            oabVar.k0 = false;
            gm.r(oabVar.b1);
            float f3 = oabVar.Y;
            if (f3 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f3, 0.0f);
                oabVar.H = ofFloat;
                ofFloat.addUpdateListener(new z9b(this, (byte) 0));
                oabVar.H.addListener(new aab(this, (byte) 0));
                oabVar.H.setDuration(250L);
                oabVar.H.setInterpolator(d53.f);
                oabVar.H.start();
            }
            if (oabVar.W >= 0.3f) {
                oabVar.o(true);
            }
            oabVar.O(false);
            oabVar.P(false);
            z = true;
        }
        if (motionEvent.getAction() == 0) {
            oabVar.b0 = false;
            if (currentPeerView != null) {
                a6 a6Var = currentPeerView.o0;
                b8b b8bVar = currentPeerView.s0;
                g48 g48Var = currentPeerView.S0;
                hg5 hg5Var = currentPeerView.v0;
                if (hg5Var != null && hg5Var.W && b8bVar != null) {
                    if (!hg5Var.D0.contains(motionEvent.getX() - (currentPeerView.v0.getX() + (g48Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.v0.getY() + (g48Var.getY() + currentPeerView.getY()))) && !currentPeerView.z0(b8bVar, motionEvent)) {
                        currentPeerView.v0.f(true);
                    }
                }
                hg5 hg5Var2 = currentPeerView.w0;
                if (hg5Var2 != null && hg5Var2.W && a6Var != null && !hg5Var2.D0.contains(motionEvent.getX() - (currentPeerView.w0.getX() + (g48Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.w0.getY() + (g48Var.getY() + currentPeerView.getY()))) && !currentPeerView.z0(a6Var, motionEvent)) {
                    currentPeerView.w0.f(true);
                }
            }
            oabVar.o0.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        }
        if (!oabVar.y && !oabVar.H0 && !oabVar.I0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = (oabVar.f0 > 0.0f ? 1 : (oabVar.f0 == 0.0f ? 0 : -1));
        SparseArray sparseArray = this.w0;
        if (i3 == 0 && !oabVar.k0 && oabVar.o0.G0 == 1 && motionEvent.getAction() == 2 && z2 && (((((Float) sparseArray.get(motionEvent.getPointerId(0), Float.valueOf(0.0f))).floatValue() - motionEvent.getX(0)) != 0.0f && (((i2 = (eabVar = oabVar.o0).J0) == 0 && eabVar.L0 == 0.0f && floatValue < 0.0f) || (i2 == eabVar.getAdapter().b() - 1 && eabVar.L0 == 0.0f && i > 0))) || oabVar.Y != 0.0f)) {
            float f4 = oabVar.Y;
            if (f4 == 0.0f) {
                oabVar.Z = -floatValue;
            }
            if ((floatValue < 0.0f && oabVar.Z > 0.0f) || (i > 0 && oabVar.Z < 0.0f)) {
                floatValue *= 0.2f;
            }
            oabVar.Y = f4 - floatValue;
            oabVar.V();
            float f5 = oabVar.Y;
            if ((f5 > 0.0f && oabVar.Z < 0.0f) || (f5 < 0.0f && oabVar.Z > 0.0f)) {
                oabVar.Y = 0.0f;
            }
            z3 = true;
        } else {
            z3 = false;
        }
        if (currentPeerView != null && oabVar.f0 == 0.0f && !oabVar.k0 && !oabVar.L0 && !oabVar.I0 && oabVar.o0.G0 != 1) {
            gm.p1(currentPeerView.S0, this, fArr);
            motionEvent.offsetLocation(-fArr[0], -fArr[1]);
            a58 currentPeerView2 = oabVar.o0.getCurrentPeerView();
            currentPeerView2.N2.a(motionEvent, currentPeerView2.S0, null, null, 0);
            motionEvent.offsetLocation(fArr[0], fArr[1]);
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            for (int i4 = 0; i4 < motionEvent.getPointerCount(); i4++) {
                sparseArray.put(motionEvent.getPointerId(i4), Float.valueOf(motionEvent.getX(i4)));
            }
        } else {
            sparseArray.clear();
        }
        if (!z3) {
            boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (oabVar.f0 != 0.0f && !oabVar.g1 && oabVar.q0 < gm.L(20.0f)) {
                    if (oabVar.x.f > 0.5f) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    oabVar.k(z4);
                }
                a58 w = oabVar.w();
                if (w != null) {
                    w.A0.w0 = false;
                }
            }
            if (z && !oabVar.b0) {
                oabVar.i();
            }
            if (!dispatchTouchEvent && (!oab.x1 || !oabVar.r0)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.y0.z0) {
            return false;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        oab oabVar = this.y0;
        if (oabVar.b && !oabVar.c) {
            d dVar = this.x0;
            gm.V2(dVar.getParentActivity(), dVar.getClassGuid());
        }
        setTag(2131296353, new bab(this));
        nm7.f(oabVar.h).b(oabVar, nm7.B5);
        nm7.f(oabVar.h).b(oabVar, nm7.z5);
        nm7.f(oabVar.h).b(oabVar, nm7.d1);
        nm7.f(oabVar.h).b(oabVar, nm7.c1);
        nm7.f(oabVar.h).b(oabVar, nm7.A5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(2131296353, null);
        oab oabVar = this.y0;
        nm7.f(oabVar.h).n(oabVar, nm7.B5);
        nm7.f(oabVar.h).n(oabVar, nm7.z5);
        nm7.f(oabVar.h).n(oabVar, nm7.d1);
        nm7.f(oabVar.h).n(oabVar, nm7.c1);
        nm7.f(oabVar.h).n(oabVar, nm7.A5);
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cab.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        oab oabVar = this.y0;
        ((FrameLayout.LayoutParams) oabVar.d1.getLayoutParams()).topMargin = gm.m - gm.L(2.0f);
        oabVar.d1.getLayoutParams().height = gm.L(2.0f);
        super.onMeasure(i, i2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        n38 n38Var;
        int action = motionEvent.getAction();
        oab oabVar = this.y0;
        if (action == 1 || motionEvent.getAction() == 3) {
            oabVar.k0 = false;
            oabVar.O(false);
            if (oabVar.W >= 1.0f) {
                oabVar.o(true);
            } else if (!oabVar.H0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(oabVar.X, 0.0f);
                oabVar.H = ofFloat;
                ofFloat.addUpdateListener(new z9b(this, (byte) 1));
                oabVar.H.addListener(new aab(this, (byte) 1));
                oabVar.H.setDuration(150L);
                oabVar.H.setInterpolator(d53.f);
                oabVar.H.start();
            }
            a58 w = oabVar.w();
            if (w != null && (n38Var = w.B0) != null) {
                n38Var.setAllowTouches(true);
            }
        }
        if (!oabVar.k0 && !oabVar.y && oabVar.a0 == 0.0f && ((oabVar.f0 == 0.0f || (!oabVar.g0 && !oabVar.h0)) && !oabVar.j1)) {
            return false;
        }
        oabVar.j0.onTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.y0.g0 = false;
    }
}
