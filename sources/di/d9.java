package di;

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
import org.telegram.messenger.qs;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.Components.xq;
public final class d9 extends rt0 {
    public float f8939f0;
    public float f8940g0;
    public float f8941h0;
    public final float[] f8942i0;
    public final Path f8943j0;
    public final RectF f8944k0;
    public final RectF f8945l0;
    public final RectF m0;
    public final RectF f8946n0;
    public final RectF f8947o0;
    public final SparseArray f8948p0;
    public final org.telegram.ui.ActionBar.f2 f8949q0;
    public final p9 f8950r0;

    public d9(p9 p9Var, Context context, org.telegram.ui.ActionBar.f2 f2Var) {
        super(context, null);
        this.f8950r0 = p9Var;
        this.f8949q0 = f2Var;
        this.f8942i0 = new float[8];
        this.f8943j0 = new Path();
        this.f8944k0 = new RectF();
        this.f8945l0 = new RectF();
        this.m0 = new RectF();
        this.f8946n0 = new RectF();
        this.f8947o0 = new RectF();
        this.f8948p0 = new SparseArray();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: di.d9.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        p9 p9Var = this.f8950r0;
        if (keyCode != 24 && keyEvent.getKeyCode() != 25) {
            if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                p9Var.p();
                return true;
            }
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        p9Var.w(keyEvent);
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        float floatValue;
        int i7;
        f9 f9Var;
        int i10;
        ii0 ii0Var;
        p9 p9Var = this.f8950r0;
        float[] fArr = p9Var.f9560o0;
        i4 currentPeerView = p9Var.f9559n0.getCurrentPeerView();
        if (currentPeerView != null) {
            n3 n3Var = currentPeerView.f9196t0;
            if (n3Var.W.x()) {
                float x10 = currentPeerView.getX();
                float y10 = ((View) currentPeerView.getParent()).getY() + currentPeerView.getY();
                motionEvent.offsetLocation(-x10, -y10);
                if (!n3Var.W.n(currentPeerView.getContext()).onTouchEvent(motionEvent)) {
                    motionEvent.offsetLocation(x10, y10);
                }
                return true;
            }
        }
        float f10 = 0.0f;
        if (p9Var.f9561o1 && currentPeerView != null && (ii0Var = currentPeerView.f9132a3) != null) {
            float f11 = 0.0f;
            for (View view = currentPeerView; view != null && (view.getParent() instanceof View); view = (View) view.getParent()) {
                f10 += view.getX();
                f11 += view.getY();
            }
            if (currentPeerView.f9132a3.getReactionsWindow() != null && currentPeerView.f9132a3.getReactionsWindow().f6185c != null) {
                motionEvent.offsetLocation(-f10, (-f11) - currentPeerView.f9132a3.getReactionsWindow().f6185c.getTranslationY());
                currentPeerView.f9132a3.getReactionsWindow().f6185c.dispatchTouchEvent(motionEvent);
                return true;
            }
            Rect rect = org.telegram.messenger.g0.Q;
            ii0Var.getHitRect(rect);
            rect.offset((int) f10, (int) f11);
            if (motionEvent.getAction() == 0 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                currentPeerView.Z0(false);
                return true;
            }
            motionEvent.offsetLocation(-rect.left, -rect.top);
            ii0Var.dispatchTouchEvent(motionEvent);
            return true;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            z9 = false;
        } else {
            p9Var.f9552j0 = false;
            org.telegram.messenger.g0.r(p9Var.f9531a1);
            float f12 = p9Var.X;
            if (f12 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, 0.0f);
                p9Var.G = ofFloat;
                ofFloat.addUpdateListener(new a9(this, 0));
                p9Var.G.addListener(new b9(this, 0));
                p9Var.G.setDuration(250L);
                p9Var.G.setInterpolator(xq.f40345f);
                p9Var.G.start();
            }
            if (p9Var.V >= 0.3f) {
                p9Var.u(true);
            }
            p9Var.Q(false);
            p9Var.R(false);
            z9 = true;
        }
        if (motionEvent.getAction() == 0) {
            p9Var.f9530a0 = false;
            if (currentPeerView != null) {
                a4 a4Var = currentPeerView.f9152h0;
                u8 u8Var = currentPeerView.f9167l0;
                j3 j3Var = currentPeerView.L0;
                fi.m3 m3Var = currentPeerView.f9176o0;
                if (m3Var != null && m3Var.V && u8Var != null) {
                    if (!m3Var.C0.contains(motionEvent.getX() - (currentPeerView.f9176o0.getX() + (j3Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.f9176o0.getY() + (j3Var.getY() + currentPeerView.getY()))) && !currentPeerView.F0(u8Var, motionEvent)) {
                        currentPeerView.f9176o0.f(true);
                    }
                }
                fi.m3 m3Var2 = currentPeerView.f9180p0;
                if (m3Var2 != null && m3Var2.V && a4Var != null && !m3Var2.C0.contains(motionEvent.getX() - (currentPeerView.f9180p0.getX() + (j3Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.f9180p0.getY() + (j3Var.getY() + currentPeerView.getY()))) && !currentPeerView.F0(a4Var, motionEvent)) {
                    currentPeerView.f9180p0.f(true);
                }
            }
            p9Var.f9559n0.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        }
        if (!p9Var.f9582y && !p9Var.G0 && !p9Var.H0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = (p9Var.f9541e0 > 0.0f ? 1 : (p9Var.f9541e0 == 0.0f ? 0 : -1));
        SparseArray sparseArray = this.f8948p0;
        if (i11 == 0 && !p9Var.f9552j0 && p9Var.f9559n0.F0 == 1 && motionEvent.getAction() == 2 && z10 && (((((Float) sparseArray.get(motionEvent.getPointerId(0), Float.valueOf(0.0f))).floatValue() - motionEvent.getX(0)) != 0.0f && (((i10 = (f9Var = p9Var.f9559n0).I0) == 0 && f9Var.K0 == 0.0f && floatValue < 0.0f) || (i10 == f9Var.getAdapter().b() - 1 && f9Var.K0 == 0.0f && i7 > 0))) || p9Var.X != 0.0f)) {
            float f13 = p9Var.X;
            if (f13 == 0.0f) {
                p9Var.Y = -floatValue;
            }
            if ((floatValue < 0.0f && p9Var.Y > 0.0f) || (i7 > 0 && p9Var.Y < 0.0f)) {
                floatValue *= 0.2f;
            }
            p9Var.X = f13 - floatValue;
            p9.i(p9Var);
            float f14 = p9Var.X;
            if ((f14 > 0.0f && p9Var.Y < 0.0f) || (f14 < 0.0f && p9Var.Y > 0.0f)) {
                p9Var.X = 0.0f;
            }
            z11 = true;
        } else {
            z11 = false;
        }
        if (currentPeerView != null && p9Var.f9541e0 == 0.0f && !p9Var.f9552j0 && !p9Var.K0 && !p9Var.H0 && p9Var.f9559n0.F0 != 1) {
            org.telegram.messenger.g0.r1(currentPeerView.L0, this, fArr);
            motionEvent.offsetLocation(-fArr[0], -fArr[1]);
            i4 currentPeerView2 = p9Var.f9559n0.getCurrentPeerView();
            currentPeerView2.G2.a(motionEvent, currentPeerView2.L0, null, null, 0);
            motionEvent.offsetLocation(fArr[0], fArr[1]);
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                sparseArray.put(motionEvent.getPointerId(i12), Float.valueOf(motionEvent.getX(i12)));
            }
        } else {
            sparseArray.clear();
        }
        if (!z11) {
            boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (p9Var.f9541e0 != 0.0f && !p9Var.f9545f1 && p9Var.f9562p0 < org.telegram.messenger.g0.L(20.0f)) {
                    if (p9Var.f9580x.f9759f > 0.5f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    p9Var.o(z12);
                }
                i4 z13 = p9Var.z();
                if (z13 != null) {
                    z13.f9196t0.f9115w0 = false;
                }
            }
            if (z9 && !p9Var.f9530a0) {
                p9Var.m();
            }
            if (!dispatchTouchEvent && (!p9.f9525w1 || !p9Var.f9564q0)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f8950r0.f9583y0) {
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p9 p9Var = this.f8950r0;
        if (p9Var.f9532b && !p9Var.f9535c) {
            org.telegram.ui.ActionBar.f2 f2Var = this.f8949q0;
            org.telegram.messenger.g0.a3(f2Var.getParentActivity(), f2Var.getClassGuid());
        }
        setTag(2131296351, new c9(this));
        qs.f(p9Var.h).c(p9Var, qs.f25100x5);
        qs.f(p9Var.h).c(p9Var, qs.f25086v5);
        qs.f(p9Var.h).c(p9Var, qs.f24977d1);
        qs.f(p9Var.h).c(p9Var, qs.f24971c1);
        qs.f(p9Var.h).c(p9Var, qs.f25093w5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(2131296351, null);
        p9 p9Var = this.f8950r0;
        qs.f(p9Var.h).n(p9Var, qs.f25100x5);
        qs.f(p9Var.h).n(p9Var, qs.f25086v5);
        qs.f(p9Var.h).n(p9Var, qs.f24977d1);
        qs.f(p9Var.h).n(p9Var, qs.f24971c1);
        qs.f(p9Var.h).n(p9Var, qs.f25093w5);
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: di.d9.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        p9 p9Var = this.f8950r0;
        ((FrameLayout.LayoutParams) p9Var.f9537c1.getLayoutParams()).topMargin = org.telegram.messenger.g0.f22538m - org.telegram.messenger.g0.L(2.0f);
        p9Var.f9537c1.getLayoutParams().height = org.telegram.messenger.g0.L(2.0f);
        super.onMeasure(i7, i10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        g2 g2Var;
        int action = motionEvent.getAction();
        p9 p9Var = this.f8950r0;
        if (action == 1 || motionEvent.getAction() == 3) {
            p9Var.f9552j0 = false;
            p9Var.Q(false);
            if (p9Var.V >= 1.0f) {
                p9Var.u(true);
            } else if (!p9Var.G0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(p9Var.W, 0.0f);
                p9Var.G = ofFloat;
                ofFloat.addUpdateListener(new a9(this, 1));
                p9Var.G.addListener(new b9(this, 1));
                p9Var.G.setDuration(150L);
                p9Var.G.setInterpolator(xq.f40345f);
                p9Var.G.start();
            }
            i4 z9 = p9Var.z();
            if (z9 != null && (g2Var = z9.f9200u0) != null) {
                g2Var.setAllowTouches(true);
            }
        }
        if (!p9Var.f9552j0 && !p9Var.f9582y && p9Var.Z == 0.0f && ((p9Var.f9541e0 == 0.0f || (!p9Var.f9544f0 && !p9Var.f9546g0)) && !p9Var.f9551i1)) {
            return false;
        }
        p9Var.f9550i0.onTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z9) {
        super.requestDisallowInterceptTouchEvent(z9);
        this.f8950r0.f9544f0 = false;
    }
}
