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
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.qr;
public final class xb extends pv0 {
    public final Path A0;
    public final RectF B0;
    public final RectF C0;
    public final RectF D0;
    public final RectF E0;
    public final RectF F0;
    public final SparseArray G0;
    public final org.telegram.ui.ActionBar.n2 H0;
    public final jc I0;
    public float f1733w0;
    public float f1734x0;
    public float f1735y0;
    public final float[] f1736z0;

    public xb(jc jcVar, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context, null);
        this.I0 = jcVar;
        this.H0 = n2Var;
        this.f1736z0 = new float[8];
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
        fk0 fk0Var;
        jc jcVar = this.I0;
        float[] fArr = jcVar.f1093o0;
        f6 currentPeerView = jcVar.f1091n0.getCurrentPeerView();
        if (currentPeerView != null) {
            h5 h5Var = currentPeerView.K0;
            if (h5Var.W.y()) {
                float x10 = currentPeerView.getX();
                float y3 = ((View) currentPeerView.getParent()).getY() + currentPeerView.getY();
                motionEvent.offsetLocation(-x10, -y3);
                if (!h5Var.W.o(currentPeerView.getContext()).onTouchEvent(motionEvent)) {
                    motionEvent.offsetLocation(x10, y3);
                }
                return true;
            }
        }
        float f7 = 0.0f;
        if (jcVar.f1096p1 && currentPeerView != null && (fk0Var = currentPeerView.f845r3) != null) {
            float f10 = 0.0f;
            for (View view = currentPeerView; view != null && (view.getParent() instanceof View); view = (View) view.getParent()) {
                f7 += view.getX();
                f10 += view.getY();
            }
            if (currentPeerView.f845r3.getReactionsWindow() != null && currentPeerView.f845r3.getReactionsWindow().f48985c != null) {
                motionEvent.offsetLocation(-f7, (-f10) - currentPeerView.f845r3.getReactionsWindow().f48985c.getTranslationY());
                currentPeerView.f845r3.getReactionsWindow().f48985c.dispatchTouchEvent(motionEvent);
                return true;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            fk0Var.getHitRect(rect);
            rect.offset((int) f7, (int) f10);
            if (motionEvent.getAction() == 0 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                currentPeerView.b1(false);
                return true;
            }
            motionEvent.offsetLocation(-rect.left, -rect.top);
            fk0Var.dispatchTouchEvent(motionEvent);
            return true;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            z10 = false;
        } else {
            jcVar.f1084j0 = false;
            AndroidUtilities.cancelRunOnUIThread(jcVar.f1067b1);
            float f11 = jcVar.X;
            if (f11 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
                jcVar.G = ofFloat;
                ofFloat.addUpdateListener(new ub(this, 0));
                jcVar.G.addListener(new vb(this, 0));
                jcVar.G.setDuration(250L);
                jcVar.G.setInterpolator(qr.f27423f);
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
            jcVar.f1063a0 = false;
            if (currentPeerView != null) {
                x5 x5Var = currentPeerView.f866y0;
                nb nbVar = currentPeerView.C0;
                a5 a5Var = currentPeerView.f798c1;
                ci.f4 f4Var = currentPeerView.F0;
                if (f4Var != null && f4Var.V && nbVar != null) {
                    if (!f4Var.f4640r0.contains(motionEvent.getX() - (currentPeerView.F0.getX() + (a5Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.F0.getY() + (a5Var.getY() + currentPeerView.getY()))) && !currentPeerView.H0(motionEvent, nbVar)) {
                        currentPeerView.F0.e(true);
                    }
                }
                ci.f4 f4Var2 = currentPeerView.G0;
                if (f4Var2 != null && f4Var2.V && x5Var != null && !f4Var2.f4640r0.contains(motionEvent.getX() - (currentPeerView.G0.getX() + (a5Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.G0.getY() + (a5Var.getY() + currentPeerView.getY()))) && !currentPeerView.H0(motionEvent, x5Var)) {
                    currentPeerView.G0.e(true);
                }
            }
            jcVar.f1091n0.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        }
        if (!jcVar.f1114x && !jcVar.H0 && !jcVar.I0) {
            z11 = true;
        } else {
            z11 = false;
        }
        float f12 = jcVar.f1073e0;
        SparseArray sparseArray = this.G0;
        if (f12 == 0.0f && !jcVar.f1084j0 && jcVar.f1091n0.F0 == 1 && motionEvent.getAction() == 2 && z11 && (((((Float) sparseArray.get(motionEvent.getPointerId(0), Float.valueOf(0.0f))).floatValue() - motionEvent.getX(0)) != 0.0f && (((i11 = (zbVar = jcVar.f1091n0).I0) == 0 && zbVar.K0 == 0.0f && floatValue < 0.0f) || (i11 == zbVar.getAdapter().b() - 1 && zbVar.K0 == 0.0f && i10 > 0))) || jcVar.X != 0.0f)) {
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
        if (currentPeerView != null && jcVar.f1073e0 == 0.0f && !jcVar.f1084j0 && !jcVar.L0 && !jcVar.I0 && jcVar.f1091n0.F0 != 1) {
            AndroidUtilities.getViewPositionInParent(currentPeerView.f798c1, this, fArr);
            motionEvent.offsetLocation(-fArr[0], -fArr[1]);
            f6 currentPeerView2 = jcVar.f1091n0.getCurrentPeerView();
            currentPeerView2.X2.a(motionEvent, currentPeerView2.f798c1, null, null, 0);
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
                if (jcVar.f1073e0 != 0.0f && !jcVar.f1079g1 && jcVar.f1095p0 < AndroidUtilities.dp(20.0f)) {
                    if (jcVar.f1111w.f1469f > 0.5f) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    jcVar.n(z13);
                }
                f6 t10 = jcVar.t();
                if (t10 != null) {
                    t10.K0.f1732w0 = false;
                }
            }
            if (z10 && !jcVar.f1063a0) {
                jcVar.m();
            }
            if (!dispatchTouchEvent && (!jc.f1059x1 || !jcVar.f1097q0)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.I0.f1117y0) {
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jc jcVar = this.I0;
        if (jcVar.f1065b && !jcVar.f1068c) {
            org.telegram.ui.ActionBar.n2 n2Var = this.H0;
            AndroidUtilities.requestAdjustResize(n2Var.getParentActivity(), n2Var.getClassGuid());
        }
        org.telegram.ui.Components.oc.a(this, new wb(this));
        NotificationCenter.getInstance(jcVar.h).addObserver(jcVar, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(jcVar.h).addObserver(jcVar, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(jcVar.h).addObserver(jcVar, NotificationCenter.articleClosed);
        NotificationCenter.getInstance(jcVar.h).addObserver(jcVar, NotificationCenter.openArticle);
        NotificationCenter.getInstance(jcVar.h).addObserver(jcVar, NotificationCenter.storyDeleted);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.oc.h(this);
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
        ((FrameLayout.LayoutParams) jcVar.f1072d1.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight - AndroidUtilities.dp(2.0f);
        jcVar.f1072d1.getLayoutParams().height = AndroidUtilities.dp(2.0f);
        super.onMeasure(i10, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        r3 r3Var;
        int action = motionEvent.getAction();
        jc jcVar = this.I0;
        if (action == 1 || motionEvent.getAction() == 3) {
            jcVar.f1084j0 = false;
            jcVar.K(false);
            if (jcVar.V >= 1.0f) {
                jcVar.q(true);
            } else if (!jcVar.H0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(jcVar.W, 0.0f);
                jcVar.G = ofFloat;
                ofFloat.addUpdateListener(new ub(this, 1));
                jcVar.G.addListener(new vb(this, 1));
                jcVar.G.setDuration(150L);
                jcVar.G.setInterpolator(qr.f27423f);
                jcVar.G.start();
            }
            f6 t10 = jcVar.t();
            if (t10 != null && (r3Var = t10.L0) != null) {
                r3Var.setAllowTouches(true);
            }
        }
        if (!jcVar.f1084j0 && !jcVar.f1114x && jcVar.Z == 0.0f && ((jcVar.f1073e0 == 0.0f || (!jcVar.f1076f0 && !jcVar.f1078g0)) && !jcVar.f1085j1)) {
            return false;
        }
        jcVar.f1082i0.onTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        this.I0.f1076f0 = false;
    }
}
