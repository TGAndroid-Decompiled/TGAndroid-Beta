package ai;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tr;
public final class xb extends mw0 {
    public final Path A0;
    public final RectF B0;
    public final RectF C0;
    public final RectF D0;
    public final RectF E0;
    public final RectF F0;
    public final SparseArray G0;
    public final org.telegram.ui.ActionBar.n2 H0;
    public final jc I0;
    public float f1886w0;
    public float f1887x0;
    public float f1888y0;
    public final float[] f1889z0;

    public xb(jc jcVar, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context, null);
        this.I0 = jcVar;
        this.H0 = n2Var;
        this.f1889z0 = new float[8];
        this.A0 = new Path();
        this.B0 = new RectF();
        this.C0 = new RectF();
        this.D0 = new RectF();
        this.E0 = new RectF();
        this.F0 = new RectF();
        this.G0 = new SparseArray();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: ai.xb.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        jc jcVar = this.I0;
        if (keyCode != 24 && keyEvent.getKeyCode() != 25) {
            if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                jcVar.onAttachedBackPressed();
                return true;
            }
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        jcVar.r(keyEvent);
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        float floatValue;
        int i10;
        zb zbVar;
        int i11;
        sk0 sk0Var;
        jc jcVar = this.I0;
        float[] fArr = jcVar.f1176o0;
        e6 currentPeerView = jcVar.f1174n0.getCurrentPeerView();
        if (currentPeerView != null) {
            g5 g5Var = currentPeerView.K0;
            if (g5Var.W.y()) {
                float x10 = currentPeerView.getX();
                float y3 = ((View) currentPeerView.getParent()).getY() + currentPeerView.getY();
                motionEvent.offsetLocation(-x10, -y3);
                if (!g5Var.W.o(currentPeerView.getContext()).onTouchEvent(motionEvent)) {
                    motionEvent.offsetLocation(x10, y3);
                }
                return true;
            }
        }
        float f7 = 0.0f;
        if (jcVar.f1179p1 && currentPeerView != null && (sk0Var = currentPeerView.f891r3) != null) {
            float f10 = 0.0f;
            for (View view = currentPeerView; view != null && (view.getParent() instanceof View); view = (View) view.getParent()) {
                f7 += view.getX();
                f10 += view.getY();
            }
            if (currentPeerView.f891r3.getReactionsWindow() != null && currentPeerView.f891r3.getReactionsWindow().f53552c != null) {
                motionEvent.offsetLocation(-f7, (-f10) - currentPeerView.f891r3.getReactionsWindow().f53552c.getTranslationY());
                currentPeerView.f891r3.getReactionsWindow().f53552c.dispatchTouchEvent(motionEvent);
                return true;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            sk0Var.getHitRect(rect);
            rect.offset((int) f7, (int) f10);
            if (motionEvent.getAction() == 0 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                currentPeerView.b1(false);
                return true;
            }
            motionEvent.offsetLocation(-rect.left, -rect.top);
            sk0Var.dispatchTouchEvent(motionEvent);
            return true;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            z10 = false;
        } else {
            jcVar.f1167j0 = false;
            AndroidUtilities.cancelRunOnUIThread(jcVar.f1149b1);
            float f11 = jcVar.X;
            if (f11 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
                jcVar.G = ofFloat;
                ofFloat.addUpdateListener(new ub(this, 0));
                jcVar.G.addListener(new vb(this, 0));
                jcVar.G.setDuration(250L);
                jcVar.G.setInterpolator(tr.f31215f);
                jcVar.G.start();
            }
            if (jcVar.V >= 0.3f) {
                jcVar.q(true);
            }
            jcVar.K(false);
            jcVar.L(false);
            z10 = true;
        }
        if (motionEvent.getAction() == 0) {
            jcVar.f1145a0 = false;
            if (currentPeerView != null) {
                w5 w5Var = currentPeerView.f912y0;
                nb nbVar = currentPeerView.C0;
                a5 a5Var = currentPeerView.f844c1;
                ci.e4 e4Var = currentPeerView.F0;
                if (e4Var != null && e4Var.V && nbVar != null) {
                    if (!e4Var.f5005r0.contains(motionEvent.getX() - (currentPeerView.F0.getX() + (a5Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.F0.getY() + (a5Var.getY() + currentPeerView.getY()))) && !currentPeerView.H0(motionEvent, nbVar)) {
                        currentPeerView.F0.e(true);
                    }
                }
                ci.e4 e4Var2 = currentPeerView.G0;
                if (e4Var2 != null && e4Var2.V && w5Var != null && !e4Var2.f5005r0.contains(motionEvent.getX() - (currentPeerView.G0.getX() + (a5Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.G0.getY() + (a5Var.getY() + currentPeerView.getY()))) && !currentPeerView.H0(motionEvent, w5Var)) {
                    currentPeerView.G0.e(true);
                }
            }
            jcVar.f1174n0.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        }
        if (!jcVar.f1197x && !jcVar.H0 && !jcVar.I0) {
            z11 = true;
        } else {
            z11 = false;
        }
        float f12 = jcVar.f1156e0;
        SparseArray sparseArray = this.G0;
        if (f12 == 0.0f && !jcVar.f1167j0 && jcVar.f1174n0.F0 == 1 && motionEvent.getAction() == 2 && z11 && (((((Float) sparseArray.get(motionEvent.getPointerId(0), Float.valueOf(0.0f))).floatValue() - motionEvent.getX(0)) != 0.0f && (((i11 = (zbVar = jcVar.f1174n0).I0) == 0 && zbVar.K0 == 0.0f && floatValue < 0.0f) || (i11 == zbVar.getAdapter().b() - 1 && zbVar.K0 == 0.0f && i10 > 0))) || jcVar.X != 0.0f)) {
            float f13 = jcVar.X;
            if (f13 == 0.0f) {
                jcVar.Y = -floatValue;
            }
            if ((floatValue < 0.0f && jcVar.Y > 0.0f) || (i10 > 0 && jcVar.Y < 0.0f)) {
                floatValue *= 0.2f;
            }
            jcVar.X = f13 - floatValue;
            jc.k(jcVar);
            float f14 = jcVar.X;
            if ((f14 > 0.0f && jcVar.Y < 0.0f) || (f14 < 0.0f && jcVar.Y > 0.0f)) {
                jcVar.X = 0.0f;
            }
            z12 = true;
        } else {
            z12 = false;
        }
        if (currentPeerView != null && jcVar.f1156e0 == 0.0f && !jcVar.f1167j0 && !jcVar.L0 && !jcVar.I0 && jcVar.f1174n0.F0 != 1) {
            AndroidUtilities.getViewPositionInParent(currentPeerView.f844c1, this, fArr);
            motionEvent.offsetLocation(-fArr[0], -fArr[1]);
            e6 currentPeerView2 = jcVar.f1174n0.getCurrentPeerView();
            currentPeerView2.X2.a(motionEvent, currentPeerView2.f844c1, null, null, 0);
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
                if (jcVar.f1156e0 != 0.0f && !jcVar.f1162g1 && jcVar.f1178p0 < AndroidUtilities.dp(20.0f)) {
                    if (jcVar.f1194w.f1635f > 0.5f) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    jcVar.n(z13);
                }
                e6 t10 = jcVar.t();
                if (t10 != null) {
                    t10.K0.f1885w0 = false;
                }
            }
            if (z10 && !jcVar.f1145a0) {
                jcVar.m();
            }
            if (!dispatchTouchEvent && (!jc.f1141x1 || !jcVar.f1180q0)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.I0.f1200y0) {
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jc jcVar = this.I0;
        if (jcVar.f1147b && !jcVar.f1150c) {
            org.telegram.ui.ActionBar.n2 n2Var = this.H0;
            AndroidUtilities.requestAdjustResize(n2Var.getParentActivity(), n2Var.getClassGuid());
        }
        org.telegram.ui.Components.rc.a(this, new wb(this));
        NotificationCenter.getInstance(jcVar.h).addObserver(jcVar, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(jcVar.h).addObserver(jcVar, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(jcVar.h).addObserver(jcVar, NotificationCenter.articleClosed);
        NotificationCenter.getInstance(jcVar.h).addObserver(jcVar, NotificationCenter.openArticle);
        NotificationCenter.getInstance(jcVar.h).addObserver(jcVar, NotificationCenter.storyDeleted);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.rc.h(this);
        jc jcVar = this.I0;
        NotificationCenter.getInstance(jcVar.h).removeObserver(jcVar, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(jcVar.h).removeObserver(jcVar, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(jcVar.h).removeObserver(jcVar, NotificationCenter.articleClosed);
        NotificationCenter.getInstance(jcVar.h).removeObserver(jcVar, NotificationCenter.openArticle);
        NotificationCenter.getInstance(jcVar.h).removeObserver(jcVar, NotificationCenter.storyDeleted);
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: ai.xb.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        jc jcVar = this.I0;
        ((FrameLayout.LayoutParams) jcVar.f1154d1.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight - AndroidUtilities.dp(2.0f);
        jcVar.f1154d1.getLayoutParams().height = AndroidUtilities.dp(2.0f);
        super.onMeasure(i10, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        r3 r3Var;
        int action = motionEvent.getAction();
        jc jcVar = this.I0;
        if (action == 1 || motionEvent.getAction() == 3) {
            jcVar.f1167j0 = false;
            jcVar.K(false);
            if (jcVar.V >= 1.0f) {
                jcVar.q(true);
            } else if (!jcVar.H0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(jcVar.W, 0.0f);
                jcVar.G = ofFloat;
                ofFloat.addUpdateListener(new ub(this, 1));
                jcVar.G.addListener(new vb(this, 1));
                jcVar.G.setDuration(150L);
                jcVar.G.setInterpolator(tr.f31215f);
                jcVar.G.start();
            }
            e6 t10 = jcVar.t();
            if (t10 != null && (r3Var = t10.L0) != null) {
                r3Var.setAllowTouches(true);
            }
        }
        if (!jcVar.f1167j0 && !jcVar.f1197x && jcVar.Z == 0.0f && ((jcVar.f1156e0 == 0.0f || (!jcVar.f1159f0 && !jcVar.f1161g0)) && !jcVar.f1168j1)) {
            return false;
        }
        jcVar.f1165i0.onTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        this.I0.f1159f0 = false;
    }
}
