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
public final class a8b extends cja {
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
    public final m8b y0;

    public a8b(m8b m8bVar, Context context, d dVar) {
        super(context, null);
        this.y0 = m8bVar;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a8b.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        m8b m8bVar = this.y0;
        if (keyCode != 24 && keyEvent.getKeyCode() != 25) {
            if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                m8bVar.q();
                return true;
            }
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        m8bVar.r(keyEvent);
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
        c8b c8bVar;
        int i2;
        t09 t09Var;
        m8b m8bVar = this.y0;
        float[] fArr = m8bVar.p0;
        y28 currentPeerView = m8bVar.o0.getCurrentPeerView();
        if (currentPeerView != null) {
            i28 i28Var = currentPeerView.A0;
            if (i28Var.W.w()) {
                float x = currentPeerView.getX();
                float y = ((View) currentPeerView.getParent()).getY() + currentPeerView.getY();
                motionEvent.offsetLocation(-x, -y);
                if (!i28Var.W.m(currentPeerView.getContext()).onTouchEvent(motionEvent)) {
                    motionEvent.offsetLocation(x, y);
                }
                return true;
            }
        }
        float f = 0.0f;
        if (m8bVar.p1 && currentPeerView != null && (t09Var = currentPeerView.h3) != null) {
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
            Rect rect = gl.Q;
            t09Var.getHitRect(rect);
            rect.offset((int) f, (int) f2);
            if (motionEvent.getAction() == 0 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                currentPeerView.W0(false);
                return true;
            }
            motionEvent.offsetLocation(-rect.left, -rect.top);
            t09Var.dispatchTouchEvent(motionEvent);
            return true;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            z = false;
        } else {
            m8bVar.k0 = false;
            gl.r(m8bVar.b1);
            float f3 = m8bVar.Y;
            if (f3 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f3, 0.0f);
                m8bVar.H = ofFloat;
                ofFloat.addUpdateListener(new x7b(this, (byte) 0));
                m8bVar.H.addListener(new y7b(this, (byte) 0));
                m8bVar.H.setDuration(250L);
                m8bVar.H.setInterpolator(s33.f);
                m8bVar.H.start();
            }
            if (m8bVar.W >= 0.3f) {
                m8bVar.o(true);
            }
            m8bVar.O(false);
            m8bVar.P(false);
            z = true;
        }
        if (motionEvent.getAction() == 0) {
            m8bVar.b0 = false;
            if (currentPeerView != null) {
                a6 a6Var = currentPeerView.o0;
                z5b z5bVar = currentPeerView.s0;
                d28 d28Var = currentPeerView.S0;
                je5 je5Var = currentPeerView.v0;
                if (je5Var != null && je5Var.W && z5bVar != null) {
                    if (!je5Var.D0.contains(motionEvent.getX() - (currentPeerView.v0.getX() + (d28Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.v0.getY() + (d28Var.getY() + currentPeerView.getY()))) && !currentPeerView.z0(z5bVar, motionEvent)) {
                        currentPeerView.v0.f(true);
                    }
                }
                je5 je5Var2 = currentPeerView.w0;
                if (je5Var2 != null && je5Var2.W && a6Var != null && !je5Var2.D0.contains(motionEvent.getX() - (currentPeerView.w0.getX() + (d28Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.w0.getY() + (d28Var.getY() + currentPeerView.getY()))) && !currentPeerView.z0(a6Var, motionEvent)) {
                    currentPeerView.w0.f(true);
                }
            }
            m8bVar.o0.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        }
        if (!m8bVar.y && !m8bVar.H0 && !m8bVar.I0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = (m8bVar.f0 > 0.0f ? 1 : (m8bVar.f0 == 0.0f ? 0 : -1));
        SparseArray sparseArray = this.w0;
        if (i3 == 0 && !m8bVar.k0 && m8bVar.o0.G0 == 1 && motionEvent.getAction() == 2 && z2 && (((((Float) sparseArray.get(motionEvent.getPointerId(0), Float.valueOf(0.0f))).floatValue() - motionEvent.getX(0)) != 0.0f && (((i2 = (c8bVar = m8bVar.o0).J0) == 0 && c8bVar.L0 == 0.0f && floatValue < 0.0f) || (i2 == c8bVar.getAdapter().b() - 1 && c8bVar.L0 == 0.0f && i > 0))) || m8bVar.Y != 0.0f)) {
            float f4 = m8bVar.Y;
            if (f4 == 0.0f) {
                m8bVar.Z = -floatValue;
            }
            if ((floatValue < 0.0f && m8bVar.Z > 0.0f) || (i > 0 && m8bVar.Z < 0.0f)) {
                floatValue *= 0.2f;
            }
            m8bVar.Y = f4 - floatValue;
            m8bVar.V();
            float f5 = m8bVar.Y;
            if ((f5 > 0.0f && m8bVar.Z < 0.0f) || (f5 < 0.0f && m8bVar.Z > 0.0f)) {
                m8bVar.Y = 0.0f;
            }
            z3 = true;
        } else {
            z3 = false;
        }
        if (currentPeerView != null && m8bVar.f0 == 0.0f && !m8bVar.k0 && !m8bVar.L0 && !m8bVar.I0 && m8bVar.o0.G0 != 1) {
            gl.p1(currentPeerView.S0, this, fArr);
            motionEvent.offsetLocation(-fArr[0], -fArr[1]);
            y28 currentPeerView2 = m8bVar.o0.getCurrentPeerView();
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
                if (m8bVar.f0 != 0.0f && !m8bVar.g1 && m8bVar.q0 < gl.L(20.0f)) {
                    if (m8bVar.x.f > 0.5f) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    m8bVar.k(z4);
                }
                y28 w = m8bVar.w();
                if (w != null) {
                    w.A0.w0 = false;
                }
            }
            if (z && !m8bVar.b0) {
                m8bVar.i();
            }
            if (!dispatchTouchEvent && (!m8b.x1 || !m8bVar.r0)) {
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
        m8b m8bVar = this.y0;
        if (m8bVar.b && !m8bVar.c) {
            d dVar = this.x0;
            gl.V2(dVar.getParentActivity(), dVar.getClassGuid());
        }
        setTag(2131296353, new z7b(this));
        kk7.f(m8bVar.h).b(m8bVar, kk7.z5);
        kk7.f(m8bVar.h).b(m8bVar, kk7.x5);
        kk7.f(m8bVar.h).b(m8bVar, kk7.c1);
        kk7.f(m8bVar.h).b(m8bVar, kk7.b1);
        kk7.f(m8bVar.h).b(m8bVar, kk7.y5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(2131296353, null);
        m8b m8bVar = this.y0;
        kk7.f(m8bVar.h).n(m8bVar, kk7.z5);
        kk7.f(m8bVar.h).n(m8bVar, kk7.x5);
        kk7.f(m8bVar.h).n(m8bVar, kk7.c1);
        kk7.f(m8bVar.h).n(m8bVar, kk7.b1);
        kk7.f(m8bVar.h).n(m8bVar, kk7.y5);
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a8b.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        m8b m8bVar = this.y0;
        ((FrameLayout.LayoutParams) m8bVar.d1.getLayoutParams()).topMargin = gl.m - gl.L(2.0f);
        m8bVar.d1.getLayoutParams().height = gl.L(2.0f);
        super.onMeasure(i, i2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        l18 l18Var;
        int action = motionEvent.getAction();
        m8b m8bVar = this.y0;
        if (action == 1 || motionEvent.getAction() == 3) {
            m8bVar.k0 = false;
            m8bVar.O(false);
            if (m8bVar.W >= 1.0f) {
                m8bVar.o(true);
            } else if (!m8bVar.H0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(m8bVar.X, 0.0f);
                m8bVar.H = ofFloat;
                ofFloat.addUpdateListener(new x7b(this, (byte) 1));
                m8bVar.H.addListener(new y7b(this, (byte) 1));
                m8bVar.H.setDuration(150L);
                m8bVar.H.setInterpolator(s33.f);
                m8bVar.H.start();
            }
            y28 w = m8bVar.w();
            if (w != null && (l18Var = w.B0) != null) {
                l18Var.setAllowTouches(true);
            }
        }
        if (!m8bVar.k0 && !m8bVar.y && m8bVar.a0 == 0.0f && ((m8bVar.f0 == 0.0f || (!m8bVar.g0 && !m8bVar.h0)) && !m8bVar.j1)) {
            return false;
        }
        m8bVar.j0.onTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.y0.g0 = false;
    }
}
