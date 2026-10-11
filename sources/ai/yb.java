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
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.tw0;
public final class yb extends tw0 {
    public final Path A0;
    public final RectF B0;
    public final RectF C0;
    public final RectF D0;
    public final RectF E0;
    public final RectF F0;
    public final SparseArray G0;
    public final org.telegram.ui.ActionBar.m2 H0;
    public final kc I0;
    public float f1990w0;
    public float f1991x0;
    public float f1992y0;
    public final float[] f1993z0;

    public yb(kc kcVar, Context context, org.telegram.ui.ActionBar.m2 m2Var) {
        super(context, null);
        this.I0 = kcVar;
        this.H0 = m2Var;
        this.f1993z0 = new float[8];
        this.A0 = new Path();
        this.B0 = new RectF();
        this.C0 = new RectF();
        this.D0 = new RectF();
        this.E0 = new RectF();
        this.F0 = new RectF();
        this.G0 = new SparseArray();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: ai.yb.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        kc kcVar = this.I0;
        if (keyCode != 24 && keyEvent.getKeyCode() != 25) {
            if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                kcVar.onAttachedBackPressed();
                return true;
            }
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        kcVar.r(keyEvent);
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
        ac acVar;
        int i11;
        ll0 ll0Var;
        kc kcVar = this.I0;
        float[] fArr = kcVar.f1285o0;
        f6 currentPeerView = kcVar.f1283n0.getCurrentPeerView();
        if (currentPeerView != null) {
            h5 h5Var = currentPeerView.K0;
            if (h5Var.W.x()) {
                float x10 = currentPeerView.getX();
                float y3 = ((View) currentPeerView.getParent()).getY() + currentPeerView.getY();
                motionEvent.offsetLocation(-x10, -y3);
                if (!h5Var.W.n(currentPeerView.getContext()).onTouchEvent(motionEvent)) {
                    motionEvent.offsetLocation(x10, y3);
                }
                return true;
            }
        }
        float f7 = 0.0f;
        if (kcVar.f1288p1 && currentPeerView != null && (ll0Var = currentPeerView.f1002r3) != null) {
            float f10 = 0.0f;
            for (View view = currentPeerView; view != null && (view.getParent() instanceof View); view = (View) view.getParent()) {
                f7 += view.getX();
                f10 += view.getY();
            }
            if (currentPeerView.f1002r3.getReactionsWindow() != null && currentPeerView.f1002r3.getReactionsWindow().f54572c != null) {
                motionEvent.offsetLocation(-f7, (-f10) - currentPeerView.f1002r3.getReactionsWindow().f54572c.getTranslationY());
                currentPeerView.f1002r3.getReactionsWindow().f54572c.dispatchTouchEvent(motionEvent);
                return true;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            ll0Var.getHitRect(rect);
            rect.offset((int) f7, (int) f10);
            if (motionEvent.getAction() == 0 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                currentPeerView.b1(false);
                return true;
            }
            motionEvent.offsetLocation(-rect.left, -rect.top);
            ll0Var.dispatchTouchEvent(motionEvent);
            return true;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            z10 = false;
        } else {
            kcVar.f1276j0 = false;
            AndroidUtilities.cancelRunOnUIThread(kcVar.f1258b1);
            float f11 = kcVar.X;
            if (f11 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
                kcVar.G = ofFloat;
                ofFloat.addUpdateListener(new vb(this, 0));
                kcVar.G.addListener(new wb(this, 0));
                kcVar.G.setDuration(250L);
                kcVar.G.setInterpolator(is.f27500f);
                kcVar.G.start();
            }
            if (kcVar.V >= 0.3f) {
                kcVar.q(true);
            }
            kcVar.K(false);
            kcVar.L(false);
            z10 = true;
        }
        if (motionEvent.getAction() == 0) {
            kcVar.f1254a0 = false;
            if (currentPeerView != null) {
                x5 x5Var = currentPeerView.f1023y0;
                ob obVar = currentPeerView.C0;
                b5 b5Var = currentPeerView.f955c1;
                ci.d4 d4Var = currentPeerView.F0;
                if (d4Var != null && d4Var.V && obVar != null) {
                    if (!d4Var.f4924r0.contains(motionEvent.getX() - (currentPeerView.F0.getX() + (b5Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.F0.getY() + (b5Var.getY() + currentPeerView.getY()))) && !currentPeerView.H0(motionEvent, obVar)) {
                        currentPeerView.F0.e(true);
                    }
                }
                ci.d4 d4Var2 = currentPeerView.G0;
                if (d4Var2 != null && d4Var2.V && x5Var != null && !d4Var2.f4924r0.contains(motionEvent.getX() - (currentPeerView.G0.getX() + (b5Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.G0.getY() + (b5Var.getY() + currentPeerView.getY()))) && !currentPeerView.H0(motionEvent, x5Var)) {
                    currentPeerView.G0.e(true);
                }
            }
            kcVar.f1283n0.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        }
        if (!kcVar.f1306x && !kcVar.H0 && !kcVar.I0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i12 = (kcVar.f1265e0 > 0.0f ? 1 : (kcVar.f1265e0 == 0.0f ? 0 : -1));
        SparseArray sparseArray = this.G0;
        if (i12 == 0 && !kcVar.f1276j0 && kcVar.f1283n0.F0 == 1 && motionEvent.getAction() == 2 && z11 && (((((Float) sparseArray.get(motionEvent.getPointerId(0), Float.valueOf(0.0f))).floatValue() - motionEvent.getX(0)) != 0.0f && (((i11 = (acVar = kcVar.f1283n0).I0) == 0 && acVar.K0 == 0.0f && floatValue < 0.0f) || (i11 == acVar.getAdapter().b() - 1 && acVar.K0 == 0.0f && i10 > 0))) || kcVar.X != 0.0f)) {
            float f12 = kcVar.X;
            if (f12 == 0.0f) {
                kcVar.Y = -floatValue;
            }
            if ((floatValue < 0.0f && kcVar.Y > 0.0f) || (i10 > 0 && kcVar.Y < 0.0f)) {
                floatValue *= 0.2f;
            }
            kcVar.X = f12 - floatValue;
            kc.k(kcVar);
            float f13 = kcVar.X;
            if ((f13 > 0.0f && kcVar.Y < 0.0f) || (f13 < 0.0f && kcVar.Y > 0.0f)) {
                kcVar.X = 0.0f;
            }
            z12 = true;
        } else {
            z12 = false;
        }
        if (currentPeerView != null && kcVar.f1265e0 == 0.0f && !kcVar.f1276j0 && !kcVar.L0 && !kcVar.I0 && kcVar.f1283n0.F0 != 1) {
            AndroidUtilities.getViewPositionInParent(currentPeerView.f955c1, this, fArr);
            motionEvent.offsetLocation(-fArr[0], -fArr[1]);
            f6 currentPeerView2 = kcVar.f1283n0.getCurrentPeerView();
            currentPeerView2.X2.a(motionEvent, currentPeerView2.f955c1, null, null, 0);
            motionEvent.offsetLocation(fArr[0], fArr[1]);
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            for (int i13 = 0; i13 < motionEvent.getPointerCount(); i13++) {
                sparseArray.put(motionEvent.getPointerId(i13), Float.valueOf(motionEvent.getX(i13)));
            }
        } else {
            sparseArray.clear();
        }
        if (!z12) {
            boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (kcVar.f1265e0 != 0.0f && !kcVar.f1271g1 && kcVar.f1287p0 < AndroidUtilities.dp(20.0f)) {
                    if (kcVar.f1303w.f1742f > 0.5f) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    kcVar.n(z13);
                }
                f6 t10 = kcVar.t();
                if (t10 != null) {
                    t10.K0.f1989w0 = false;
                }
            }
            if (z10 && !kcVar.f1254a0) {
                kcVar.m();
            }
            if (!dispatchTouchEvent && (!kc.f1250x1 || !kcVar.f1289q0)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.I0.f1309y0) {
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kc kcVar = this.I0;
        if (kcVar.f1256b && !kcVar.f1259c) {
            org.telegram.ui.ActionBar.m2 m2Var = this.H0;
            AndroidUtilities.requestAdjustResize(m2Var.getParentActivity(), m2Var.getClassGuid());
        }
        org.telegram.ui.Components.sc.a(this, new xb(this));
        NotificationCenter.getInstance(kcVar.h).addObserver(kcVar, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(kcVar.h).addObserver(kcVar, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(kcVar.h).addObserver(kcVar, NotificationCenter.articleClosed);
        NotificationCenter.getInstance(kcVar.h).addObserver(kcVar, NotificationCenter.openArticle);
        NotificationCenter.getInstance(kcVar.h).addObserver(kcVar, NotificationCenter.storyDeleted);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.sc.h(this);
        kc kcVar = this.I0;
        NotificationCenter.getInstance(kcVar.h).removeObserver(kcVar, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(kcVar.h).removeObserver(kcVar, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(kcVar.h).removeObserver(kcVar, NotificationCenter.articleClosed);
        NotificationCenter.getInstance(kcVar.h).removeObserver(kcVar, NotificationCenter.openArticle);
        NotificationCenter.getInstance(kcVar.h).removeObserver(kcVar, NotificationCenter.storyDeleted);
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: ai.yb.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        kc kcVar = this.I0;
        ((FrameLayout.LayoutParams) kcVar.f1263d1.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight - AndroidUtilities.dp(2.0f);
        kcVar.f1263d1.getLayoutParams().height = AndroidUtilities.dp(2.0f);
        super.onMeasure(i10, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s3 s3Var;
        int action = motionEvent.getAction();
        kc kcVar = this.I0;
        if (action == 1 || motionEvent.getAction() == 3) {
            kcVar.f1276j0 = false;
            kcVar.K(false);
            if (kcVar.V >= 1.0f) {
                kcVar.q(true);
            } else if (!kcVar.H0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(kcVar.W, 0.0f);
                kcVar.G = ofFloat;
                ofFloat.addUpdateListener(new vb(this, 1));
                kcVar.G.addListener(new wb(this, 1));
                kcVar.G.setDuration(150L);
                kcVar.G.setInterpolator(is.f27500f);
                kcVar.G.start();
            }
            f6 t10 = kcVar.t();
            if (t10 != null && (s3Var = t10.L0) != null) {
                s3Var.setAllowTouches(true);
            }
        }
        if (!kcVar.f1276j0 && !kcVar.f1306x && kcVar.Z == 0.0f && ((kcVar.f1265e0 == 0.0f || (!kcVar.f1268f0 && !kcVar.f1270g0)) && !kcVar.f1277j1)) {
            return false;
        }
        kcVar.f1274i0.onTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        this.I0.f1268f0 = false;
    }
}
