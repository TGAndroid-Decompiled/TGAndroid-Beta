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
import org.telegram.ui.ActionBar.e;
public final class ybb extends wma {
    public float g0;
    public float h0;
    public float i0;
    public final float[] j0;
    public final Path k0;
    public final RectF l0;
    public final RectF m0;
    public final RectF n0;
    public final RectF o0;
    public final RectF p0;
    public final SparseArray q0;
    public final e r0;
    public final lcb s0;

    public ybb(lcb lcbVar, Context context, e eVar) {
        super(context, null);
        this.s0 = lcbVar;
        this.r0 = eVar;
        this.j0 = new float[8];
        this.k0 = new Path();
        this.l0 = new RectF();
        this.m0 = new RectF();
        this.n0 = new RectF();
        this.o0 = new RectF();
        this.p0 = new RectF();
        this.q0 = new SparseArray();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ybb.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        lcb lcbVar = this.s0;
        if (keyCode != 24 && keyEvent.getKeyCode() != 25) {
            if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                lcbVar.p();
                return true;
            }
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        lcbVar.r(keyEvent);
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
        acb acbVar;
        int i2;
        i49 i49Var;
        lcb lcbVar = this.s0;
        float[] fArr = lcbVar.p0;
        o68 currentPeerView = lcbVar.o0.getCurrentPeerView();
        if (currentPeerView != null) {
            y58 y58Var = currentPeerView.u0;
            if (y58Var.W.w()) {
                float x = currentPeerView.getX();
                float y = ((View) currentPeerView.getParent()).getY() + currentPeerView.getY();
                motionEvent.offsetLocation(-x, -y);
                if (!y58Var.W.m(currentPeerView.getContext()).onTouchEvent(motionEvent)) {
                    motionEvent.offsetLocation(x, y);
                }
                return true;
            }
        }
        float f = 0.0f;
        if (lcbVar.p1 && currentPeerView != null && (i49Var = currentPeerView.b3) != null) {
            float f2 = 0.0f;
            for (View view = currentPeerView; view != null && (view.getParent() instanceof View); view = (View) view.getParent()) {
                f += view.getX();
                f2 += view.getY();
            }
            if (currentPeerView.b3.getReactionsWindow() != null && currentPeerView.b3.getReactionsWindow().c != null) {
                motionEvent.offsetLocation(-f, (-f2) - currentPeerView.b3.getReactionsWindow().c.getTranslationY());
                currentPeerView.b3.getReactionsWindow().c.dispatchTouchEvent(motionEvent);
                return true;
            }
            Rect rect = hl.Q;
            i49Var.getHitRect(rect);
            rect.offset((int) f, (int) f2);
            if (motionEvent.getAction() == 0 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                currentPeerView.W0(false);
                return true;
            }
            motionEvent.offsetLocation(-rect.left, -rect.top);
            i49Var.dispatchTouchEvent(motionEvent);
            return true;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            z = false;
        } else {
            lcbVar.k0 = false;
            hl.r(lcbVar.b1);
            float f3 = lcbVar.Y;
            if (f3 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f3, 0.0f);
                lcbVar.H = ofFloat;
                ofFloat.addUpdateListener(new vbb(this, (byte) 0));
                lcbVar.H.addListener(new wbb(this, (byte) 0));
                lcbVar.H.setDuration(250L);
                lcbVar.H.setInterpolator(k43.f);
                lcbVar.H.start();
            }
            if (lcbVar.W >= 0.3f) {
                lcbVar.o(true);
            }
            lcbVar.O(false);
            lcbVar.P(false);
            z = true;
        }
        if (motionEvent.getAction() == 0) {
            lcbVar.b0 = false;
            if (currentPeerView != null) {
                b6 b6Var = currentPeerView.i0;
                x9b x9bVar = currentPeerView.m0;
                t58 t58Var = currentPeerView.M0;
                kg5 kg5Var = currentPeerView.p0;
                if (kg5Var != null && kg5Var.W && x9bVar != null) {
                    if (!kg5Var.D0.contains(motionEvent.getX() - (currentPeerView.p0.getX() + (t58Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.p0.getY() + (t58Var.getY() + currentPeerView.getY()))) && !currentPeerView.z0(x9bVar, motionEvent)) {
                        currentPeerView.p0.f(true);
                    }
                }
                kg5 kg5Var2 = currentPeerView.q0;
                if (kg5Var2 != null && kg5Var2.W && b6Var != null && !kg5Var2.D0.contains(motionEvent.getX() - (currentPeerView.q0.getX() + (t58Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.q0.getY() + (t58Var.getY() + currentPeerView.getY()))) && !currentPeerView.z0(b6Var, motionEvent)) {
                    currentPeerView.q0.f(true);
                }
            }
            lcbVar.o0.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        }
        if (!lcbVar.y && !lcbVar.H0 && !lcbVar.I0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = (lcbVar.f0 > 0.0f ? 1 : (lcbVar.f0 == 0.0f ? 0 : -1));
        SparseArray sparseArray = this.q0;
        if (i3 == 0 && !lcbVar.k0 && lcbVar.o0.G0 == 1 && motionEvent.getAction() == 2 && z2 && (((((Float) sparseArray.get(motionEvent.getPointerId(0), Float.valueOf(0.0f))).floatValue() - motionEvent.getX(0)) != 0.0f && (((i2 = (acbVar = lcbVar.o0).J0) == 0 && acbVar.L0 == 0.0f && floatValue < 0.0f) || (i2 == acbVar.getAdapter().b() - 1 && acbVar.L0 == 0.0f && i > 0))) || lcbVar.Y != 0.0f)) {
            float f4 = lcbVar.Y;
            if (f4 == 0.0f) {
                lcbVar.Z = -floatValue;
            }
            if ((floatValue < 0.0f && lcbVar.Z > 0.0f) || (i > 0 && lcbVar.Z < 0.0f)) {
                floatValue *= 0.2f;
            }
            lcbVar.Y = f4 - floatValue;
            lcbVar.V();
            float f5 = lcbVar.Y;
            if ((f5 > 0.0f && lcbVar.Z < 0.0f) || (f5 < 0.0f && lcbVar.Z > 0.0f)) {
                lcbVar.Y = 0.0f;
            }
            z3 = true;
        } else {
            z3 = false;
        }
        if (currentPeerView != null && lcbVar.f0 == 0.0f && !lcbVar.k0 && !lcbVar.L0 && !lcbVar.I0 && lcbVar.o0.G0 != 1) {
            hl.p1(currentPeerView.M0, this, fArr);
            motionEvent.offsetLocation(-fArr[0], -fArr[1]);
            o68 currentPeerView2 = lcbVar.o0.getCurrentPeerView();
            currentPeerView2.H2.a(motionEvent, currentPeerView2.M0, null, null, 0);
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
                if (lcbVar.f0 != 0.0f && !lcbVar.g1 && lcbVar.q0 < hl.L(20.0f)) {
                    if (lcbVar.x.f > 0.5f) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    lcbVar.k(z4);
                }
                o68 w = lcbVar.w();
                if (w != null) {
                    w.u0.w0 = false;
                }
            }
            if (z && !lcbVar.b0) {
                lcbVar.i();
            }
            if (!dispatchTouchEvent && (!lcb.x1 || !lcbVar.r0)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.s0.z0) {
            return false;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        lcb lcbVar = this.s0;
        if (lcbVar.b && !lcbVar.c) {
            e eVar = this.r0;
            hl.V2(eVar.getParentActivity(), eVar.getClassGuid());
        }
        setTag(2131296353, new xbb(this));
        jn7.f(lcbVar.h).b(lcbVar, jn7.A5);
        jn7.f(lcbVar.h).b(lcbVar, jn7.y5);
        jn7.f(lcbVar.h).b(lcbVar, jn7.d1);
        jn7.f(lcbVar.h).b(lcbVar, jn7.c1);
        jn7.f(lcbVar.h).b(lcbVar, jn7.z5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(2131296353, null);
        lcb lcbVar = this.s0;
        jn7.f(lcbVar.h).n(lcbVar, jn7.A5);
        jn7.f(lcbVar.h).n(lcbVar, jn7.y5);
        jn7.f(lcbVar.h).n(lcbVar, jn7.d1);
        jn7.f(lcbVar.h).n(lcbVar, jn7.c1);
        jn7.f(lcbVar.h).n(lcbVar, jn7.z5);
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ybb.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        lcb lcbVar = this.s0;
        ((FrameLayout.LayoutParams) lcbVar.d1.getLayoutParams()).topMargin = hl.m - hl.L(2.0f);
        lcbVar.d1.getLayoutParams().height = hl.L(2.0f);
        super.onMeasure(i, i2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b58 b58Var;
        int action = motionEvent.getAction();
        lcb lcbVar = this.s0;
        if (action == 1 || motionEvent.getAction() == 3) {
            lcbVar.k0 = false;
            lcbVar.O(false);
            if (lcbVar.W >= 1.0f) {
                lcbVar.o(true);
            } else if (!lcbVar.H0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(lcbVar.X, 0.0f);
                lcbVar.H = ofFloat;
                ofFloat.addUpdateListener(new vbb(this, (byte) 1));
                lcbVar.H.addListener(new wbb(this, (byte) 1));
                lcbVar.H.setDuration(150L);
                lcbVar.H.setInterpolator(k43.f);
                lcbVar.H.start();
            }
            o68 w = lcbVar.w();
            if (w != null && (b58Var = w.v0) != null) {
                b58Var.setAllowTouches(true);
            }
        }
        if (!lcbVar.k0 && !lcbVar.y && lcbVar.a0 == 0.0f && ((lcbVar.f0 == 0.0f || (!lcbVar.g0 && !lcbVar.h0)) && !lcbVar.j1)) {
            return false;
        }
        lcbVar.j0.onTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.s0.g0 = false;
    }
}
