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
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.wq;
public final class e9 extends st0 {
    public float f8969f0;
    public float f8970g0;
    public float f8971h0;
    public final float[] f8972i0;
    public final Path f8973j0;
    public final RectF f8974k0;
    public final RectF f8975l0;
    public final RectF m0;
    public final RectF f8976n0;
    public final RectF f8977o0;
    public final SparseArray f8978p0;
    public final org.telegram.ui.ActionBar.f2 f8979q0;
    public final q9 f8980r0;

    public e9(q9 q9Var, Context context, org.telegram.ui.ActionBar.f2 f2Var) {
        super(context, null);
        this.f8980r0 = q9Var;
        this.f8979q0 = f2Var;
        this.f8972i0 = new float[8];
        this.f8973j0 = new Path();
        this.f8974k0 = new RectF();
        this.f8975l0 = new RectF();
        this.m0 = new RectF();
        this.f8976n0 = new RectF();
        this.f8977o0 = new RectF();
        this.f8978p0 = new SparseArray();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: di.e9.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        q9 q9Var = this.f8980r0;
        if (keyCode != 24 && keyEvent.getKeyCode() != 25) {
            if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                q9Var.p();
                return true;
            }
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        q9Var.w(keyEvent);
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
        g9 g9Var;
        int i10;
        ii0 ii0Var;
        q9 q9Var = this.f8980r0;
        float[] fArr = q9Var.f9630o0;
        j4 currentPeerView = q9Var.f9629n0.getCurrentPeerView();
        if (currentPeerView != null) {
            n3 n3Var = currentPeerView.f9233t0;
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
        if (q9Var.f9631o1 && currentPeerView != null && (ii0Var = currentPeerView.f9169a3) != null) {
            float f11 = 0.0f;
            for (View view = currentPeerView; view != null && (view.getParent() instanceof View); view = (View) view.getParent()) {
                f10 += view.getX();
                f11 += view.getY();
            }
            if (currentPeerView.f9169a3.getReactionsWindow() != null && currentPeerView.f9169a3.getReactionsWindow().f6188c != null) {
                motionEvent.offsetLocation(-f10, (-f11) - currentPeerView.f9169a3.getReactionsWindow().f6188c.getTranslationY());
                currentPeerView.f9169a3.getReactionsWindow().f6188c.dispatchTouchEvent(motionEvent);
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
            q9Var.f9622j0 = false;
            org.telegram.messenger.g0.r(q9Var.f9601a1);
            float f12 = q9Var.X;
            if (f12 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, 0.0f);
                q9Var.G = ofFloat;
                ofFloat.addUpdateListener(new b9(this, 0));
                q9Var.G.addListener(new c9(this, 0));
                q9Var.G.setDuration(250L);
                q9Var.G.setInterpolator(wq.f40046f);
                q9Var.G.start();
            }
            if (q9Var.V >= 0.3f) {
                q9Var.u(true);
            }
            q9Var.Q(false);
            q9Var.R(false);
            z9 = true;
        }
        if (motionEvent.getAction() == 0) {
            q9Var.f9600a0 = false;
            if (currentPeerView != null) {
                b4 b4Var = currentPeerView.f9189h0;
                v8 v8Var = currentPeerView.f9204l0;
                j3 j3Var = currentPeerView.L0;
                fi.m3 m3Var = currentPeerView.f9213o0;
                if (m3Var != null && m3Var.V && v8Var != null) {
                    if (!m3Var.C0.contains(motionEvent.getX() - (currentPeerView.f9213o0.getX() + (j3Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.f9213o0.getY() + (j3Var.getY() + currentPeerView.getY()))) && !currentPeerView.F0(v8Var, motionEvent)) {
                        currentPeerView.f9213o0.f(true);
                    }
                }
                fi.m3 m3Var2 = currentPeerView.f9217p0;
                if (m3Var2 != null && m3Var2.V && b4Var != null && !m3Var2.C0.contains(motionEvent.getX() - (currentPeerView.f9217p0.getX() + (j3Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.f9217p0.getY() + (j3Var.getY() + currentPeerView.getY()))) && !currentPeerView.F0(b4Var, motionEvent)) {
                    currentPeerView.f9217p0.f(true);
                }
            }
            q9Var.f9629n0.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        }
        if (!q9Var.f9652y && !q9Var.G0 && !q9Var.H0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = (q9Var.f9611e0 > 0.0f ? 1 : (q9Var.f9611e0 == 0.0f ? 0 : -1));
        SparseArray sparseArray = this.f8978p0;
        if (i11 == 0 && !q9Var.f9622j0 && q9Var.f9629n0.F0 == 1 && motionEvent.getAction() == 2 && z10 && (((((Float) sparseArray.get(motionEvent.getPointerId(0), Float.valueOf(0.0f))).floatValue() - motionEvent.getX(0)) != 0.0f && (((i10 = (g9Var = q9Var.f9629n0).I0) == 0 && g9Var.K0 == 0.0f && floatValue < 0.0f) || (i10 == g9Var.getAdapter().b() - 1 && g9Var.K0 == 0.0f && i7 > 0))) || q9Var.X != 0.0f)) {
            float f13 = q9Var.X;
            if (f13 == 0.0f) {
                q9Var.Y = -floatValue;
            }
            if ((floatValue < 0.0f && q9Var.Y > 0.0f) || (i7 > 0 && q9Var.Y < 0.0f)) {
                floatValue *= 0.2f;
            }
            q9Var.X = f13 - floatValue;
            q9.i(q9Var);
            float f14 = q9Var.X;
            if ((f14 > 0.0f && q9Var.Y < 0.0f) || (f14 < 0.0f && q9Var.Y > 0.0f)) {
                q9Var.X = 0.0f;
            }
            z11 = true;
        } else {
            z11 = false;
        }
        if (currentPeerView != null && q9Var.f9611e0 == 0.0f && !q9Var.f9622j0 && !q9Var.K0 && !q9Var.H0 && q9Var.f9629n0.F0 != 1) {
            org.telegram.messenger.g0.r1(currentPeerView.L0, this, fArr);
            motionEvent.offsetLocation(-fArr[0], -fArr[1]);
            j4 currentPeerView2 = q9Var.f9629n0.getCurrentPeerView();
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
                if (q9Var.f9611e0 != 0.0f && !q9Var.f9615f1 && q9Var.f9632p0 < org.telegram.messenger.g0.L(20.0f)) {
                    if (q9Var.f9650x.f9793f > 0.5f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    q9Var.o(z12);
                }
                j4 z13 = q9Var.z();
                if (z13 != null) {
                    z13.f9233t0.f9150w0 = false;
                }
            }
            if (z9 && !q9Var.f9600a0) {
                q9Var.m();
            }
            if (!dispatchTouchEvent && (!q9.f9595w1 || !q9Var.f9634q0)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f8980r0.f9653y0) {
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        q9 q9Var = this.f8980r0;
        if (q9Var.f9602b && !q9Var.f9605c) {
            org.telegram.ui.ActionBar.f2 f2Var = this.f8979q0;
            org.telegram.messenger.g0.a3(f2Var.getParentActivity(), f2Var.getClassGuid());
        }
        setTag(2131296351, new d9(this));
        qs.f(q9Var.h).c(q9Var, qs.f25113x5);
        qs.f(q9Var.h).c(q9Var, qs.f25099v5);
        qs.f(q9Var.h).c(q9Var, qs.f24990d1);
        qs.f(q9Var.h).c(q9Var, qs.f24984c1);
        qs.f(q9Var.h).c(q9Var, qs.f25106w5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(2131296351, null);
        q9 q9Var = this.f8980r0;
        qs.f(q9Var.h).n(q9Var, qs.f25113x5);
        qs.f(q9Var.h).n(q9Var, qs.f25099v5);
        qs.f(q9Var.h).n(q9Var, qs.f24990d1);
        qs.f(q9Var.h).n(q9Var, qs.f24984c1);
        qs.f(q9Var.h).n(q9Var, qs.f25106w5);
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: di.e9.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        q9 q9Var = this.f8980r0;
        ((FrameLayout.LayoutParams) q9Var.f9607c1.getLayoutParams()).topMargin = org.telegram.messenger.g0.f22561m - org.telegram.messenger.g0.L(2.0f);
        q9Var.f9607c1.getLayoutParams().height = org.telegram.messenger.g0.L(2.0f);
        super.onMeasure(i7, i10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        g2 g2Var;
        int action = motionEvent.getAction();
        q9 q9Var = this.f8980r0;
        if (action == 1 || motionEvent.getAction() == 3) {
            q9Var.f9622j0 = false;
            q9Var.Q(false);
            if (q9Var.V >= 1.0f) {
                q9Var.u(true);
            } else if (!q9Var.G0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(q9Var.W, 0.0f);
                q9Var.G = ofFloat;
                ofFloat.addUpdateListener(new b9(this, 1));
                q9Var.G.addListener(new c9(this, 1));
                q9Var.G.setDuration(150L);
                q9Var.G.setInterpolator(wq.f40046f);
                q9Var.G.start();
            }
            j4 z9 = q9Var.z();
            if (z9 != null && (g2Var = z9.f9237u0) != null) {
                g2Var.setAllowTouches(true);
            }
        }
        if (!q9Var.f9622j0 && !q9Var.f9652y && q9Var.Z == 0.0f && ((q9Var.f9611e0 == 0.0f || (!q9Var.f9614f0 && !q9Var.f9616g0)) && !q9Var.f9621i1)) {
            return false;
        }
        q9Var.f9620i0.onTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z9) {
        super.requestDisallowInterceptTouchEvent(z9);
        this.f8980r0.f9614f0 = false;
    }
}
