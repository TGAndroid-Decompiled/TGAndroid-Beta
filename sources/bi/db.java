package bi;

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
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qc;
public final class db extends ov0 {
    public final Path A0;
    public final RectF B0;
    public final RectF C0;
    public final RectF D0;
    public final RectF E0;
    public final RectF F0;
    public final SparseArray G0;
    public final org.telegram.ui.ActionBar.n2 H0;
    public final pb I0;
    public float f2914w0;
    public float f2915x0;
    public float f2916y0;
    public final float[] f2917z0;

    public db(pb pbVar, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context, null);
        this.I0 = pbVar;
        this.H0 = n2Var;
        this.f2917z0 = new float[8];
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
        throw new UnsupportedOperationException("Method not decompiled: bi.db.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        pb pbVar = this.I0;
        if (keyCode != 24 && keyEvent.getKeyCode() != 25) {
            if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                pbVar.onAttachedBackPressed();
                return true;
            }
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        pbVar.r(keyEvent);
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
        fb fbVar;
        int i11;
        fk0 fk0Var;
        pb pbVar = this.I0;
        float[] fArr = pbVar.f3590o0;
        o5 currentPeerView = pbVar.f3588n0.getCurrentPeerView();
        if (currentPeerView != null) {
            s4 s4Var = currentPeerView.K0;
            if (s4Var.W.y()) {
                float x10 = currentPeerView.getX();
                float y3 = ((View) currentPeerView.getParent()).getY() + currentPeerView.getY();
                motionEvent.offsetLocation(-x10, -y3);
                if (!s4Var.W.o(currentPeerView.getContext()).onTouchEvent(motionEvent)) {
                    motionEvent.offsetLocation(x10, y3);
                }
                return true;
            }
        }
        float f7 = 0.0f;
        if (pbVar.f3593p1 && currentPeerView != null && (fk0Var = currentPeerView.f3483r3) != null) {
            float f10 = 0.0f;
            for (View view = currentPeerView; view != null && (view.getParent() instanceof View); view = (View) view.getParent()) {
                f7 += view.getX();
                f10 += view.getY();
            }
            if (currentPeerView.f3483r3.getReactionsWindow() != null && currentPeerView.f3483r3.getReactionsWindow().f699c != null) {
                motionEvent.offsetLocation(-f7, (-f10) - currentPeerView.f3483r3.getReactionsWindow().f699c.getTranslationY());
                currentPeerView.f3483r3.getReactionsWindow().f699c.dispatchTouchEvent(motionEvent);
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
            pbVar.f3581j0 = false;
            AndroidUtilities.cancelRunOnUIThread(pbVar.f3563b1);
            float f11 = pbVar.X;
            if (f11 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
                pbVar.G = ofFloat;
                ofFloat.addUpdateListener(new ab(this, 0));
                pbVar.G.addListener(new bb(this, 0));
                pbVar.G.setDuration(250L);
                pbVar.G.setInterpolator(pr.f29493f);
                pbVar.G.start();
            }
            if (pbVar.V >= 0.3f) {
                pbVar.q(true);
            }
            pbVar.K(false);
            pbVar.L(false);
            z10 = true;
        }
        if (motionEvent.getAction() == 0) {
            pbVar.f3559a0 = false;
            if (currentPeerView != null) {
                g5 g5Var = currentPeerView.f3504y0;
                ua uaVar = currentPeerView.C0;
                l4 l4Var = currentPeerView.f3436c1;
                di.f4 f4Var = currentPeerView.F0;
                if (f4Var != null && f4Var.V && uaVar != null) {
                    if (!f4Var.f7245r0.contains(motionEvent.getX() - (currentPeerView.F0.getX() + (l4Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.F0.getY() + (l4Var.getY() + currentPeerView.getY()))) && !currentPeerView.H0(motionEvent, uaVar)) {
                        currentPeerView.F0.e(true);
                    }
                }
                di.f4 f4Var2 = currentPeerView.G0;
                if (f4Var2 != null && f4Var2.V && g5Var != null && !f4Var2.f7245r0.contains(motionEvent.getX() - (currentPeerView.G0.getX() + (l4Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.G0.getY() + (l4Var.getY() + currentPeerView.getY()))) && !currentPeerView.H0(motionEvent, g5Var)) {
                    currentPeerView.G0.e(true);
                }
            }
            pbVar.f3588n0.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        }
        if (!pbVar.f3611x && !pbVar.H0 && !pbVar.I0) {
            z11 = true;
        } else {
            z11 = false;
        }
        float f12 = pbVar.f3570e0;
        SparseArray sparseArray = this.G0;
        if (f12 == 0.0f && !pbVar.f3581j0 && pbVar.f3588n0.F0 == 1 && motionEvent.getAction() == 2 && z11 && (((((Float) sparseArray.get(motionEvent.getPointerId(0), Float.valueOf(0.0f))).floatValue() - motionEvent.getX(0)) != 0.0f && (((i11 = (fbVar = pbVar.f3588n0).I0) == 0 && fbVar.K0 == 0.0f && floatValue < 0.0f) || (i11 == fbVar.getAdapter().b() - 1 && fbVar.K0 == 0.0f && i10 > 0))) || pbVar.X != 0.0f)) {
            float f13 = pbVar.X;
            if (f13 == 0.0f) {
                pbVar.Y = -floatValue;
            }
            if ((floatValue < 0.0f && pbVar.Y > 0.0f) || (i10 > 0 && pbVar.Y < 0.0f)) {
                floatValue *= 0.2f;
            }
            pbVar.X = f13 - floatValue;
            pb.k(pbVar);
            float f14 = pbVar.X;
            if ((f14 > 0.0f && pbVar.Y < 0.0f) || (f14 < 0.0f && pbVar.Y > 0.0f)) {
                pbVar.X = 0.0f;
            }
            z12 = true;
        } else {
            z12 = false;
        }
        if (currentPeerView != null && pbVar.f3570e0 == 0.0f && !pbVar.f3581j0 && !pbVar.L0 && !pbVar.I0 && pbVar.f3588n0.F0 != 1) {
            AndroidUtilities.getViewPositionInParent(currentPeerView.f3436c1, this, fArr);
            motionEvent.offsetLocation(-fArr[0], -fArr[1]);
            o5 currentPeerView2 = pbVar.f3588n0.getCurrentPeerView();
            currentPeerView2.X2.a(motionEvent, currentPeerView2.f3436c1, null, null, 0);
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
                if (pbVar.f3570e0 != 0.0f && !pbVar.f3576g1 && pbVar.f3592p0 < AndroidUtilities.dp(20.0f)) {
                    if (pbVar.f3608w.f2792f > 0.5f) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    pbVar.n(z13);
                }
                o5 t10 = pbVar.t();
                if (t10 != null) {
                    t10.K0.f2969w0 = false;
                }
            }
            if (z10 && !pbVar.f3559a0) {
                pbVar.m();
            }
            if (!dispatchTouchEvent && (!pb.f3555x1 || !pbVar.f3594q0)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.I0.f3614y0) {
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        pb pbVar = this.I0;
        if (pbVar.f3561b && !pbVar.f3564c) {
            org.telegram.ui.ActionBar.n2 n2Var = this.H0;
            AndroidUtilities.requestAdjustResize(n2Var.getParentActivity(), n2Var.getClassGuid());
        }
        qc.a(this, new cb(this));
        NotificationCenter.getInstance(pbVar.h).addObserver(pbVar, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(pbVar.h).addObserver(pbVar, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(pbVar.h).addObserver(pbVar, NotificationCenter.articleClosed);
        NotificationCenter.getInstance(pbVar.h).addObserver(pbVar, NotificationCenter.openArticle);
        NotificationCenter.getInstance(pbVar.h).addObserver(pbVar, NotificationCenter.storyDeleted);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qc.h(this);
        pb pbVar = this.I0;
        NotificationCenter.getInstance(pbVar.h).removeObserver(pbVar, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(pbVar.h).removeObserver(pbVar, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(pbVar.h).removeObserver(pbVar, NotificationCenter.articleClosed);
        NotificationCenter.getInstance(pbVar.h).removeObserver(pbVar, NotificationCenter.openArticle);
        NotificationCenter.getInstance(pbVar.h).removeObserver(pbVar, NotificationCenter.storyDeleted);
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: bi.db.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        pb pbVar = this.I0;
        ((FrameLayout.LayoutParams) pbVar.f3568d1.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight - AndroidUtilities.dp(2.0f);
        pbVar.f3568d1.getLayoutParams().height = AndroidUtilities.dp(2.0f);
        super.onMeasure(i10, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        e3 e3Var;
        int action = motionEvent.getAction();
        pb pbVar = this.I0;
        if (action == 1 || motionEvent.getAction() == 3) {
            pbVar.f3581j0 = false;
            pbVar.K(false);
            if (pbVar.V >= 1.0f) {
                pbVar.q(true);
            } else if (!pbVar.H0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(pbVar.W, 0.0f);
                pbVar.G = ofFloat;
                ofFloat.addUpdateListener(new ab(this, 1));
                pbVar.G.addListener(new bb(this, 1));
                pbVar.G.setDuration(150L);
                pbVar.G.setInterpolator(pr.f29493f);
                pbVar.G.start();
            }
            o5 t10 = pbVar.t();
            if (t10 != null && (e3Var = t10.L0) != null) {
                e3Var.setAllowTouches(true);
            }
        }
        if (!pbVar.f3581j0 && !pbVar.f3611x && pbVar.Z == 0.0f && ((pbVar.f3570e0 == 0.0f || (!pbVar.f3573f0 && !pbVar.f3575g0)) && !pbVar.f3582j1)) {
            return false;
        }
        pbVar.f3579i0.onTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        this.I0.f3573f0 = false;
    }
}
