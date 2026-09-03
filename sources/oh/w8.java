package oh;

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
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.qk0;
public final class w8 extends pv0 {
    public final RectF A0;
    public final RectF B0;
    public final RectF C0;
    public final SparseArray D0;
    public final org.telegram.ui.ActionBar.p2 E0;
    public final i9 F0;
    public float f17913t0;
    public float f17914u0;
    public float f17915v0;
    public final float[] f17916w0;
    public final Path f17917x0;
    public final RectF f17918y0;
    public final RectF f17919z0;

    public w8(i9 i9Var, Context context, org.telegram.ui.ActionBar.p2 p2Var) {
        super(context, null);
        this.F0 = i9Var;
        this.E0 = p2Var;
        this.f17916w0 = new float[8];
        this.f17917x0 = new Path();
        this.f17918y0 = new RectF();
        this.f17919z0 = new RectF();
        this.A0 = new RectF();
        this.B0 = new RectF();
        this.C0 = new RectF();
        this.D0 = new SparseArray();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: oh.w8.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        i9 i9Var = this.F0;
        if (keyCode != 24 && keyEvent.getKeyCode() != 25) {
            if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                i9Var.onAttachedBackPressed();
                return true;
            }
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        i9Var.r(keyEvent);
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        float floatValue;
        int i10;
        y8 y8Var;
        int i11;
        qk0 qk0Var;
        i9 i9Var = this.F0;
        float[] fArr = i9Var.f17281l0;
        f4 currentPeerView = i9Var.f17279k0.getCurrentPeerView();
        if (currentPeerView != null) {
            n3 n3Var = currentPeerView.H0;
            if (n3Var.T.y()) {
                float x10 = currentPeerView.getX();
                float y10 = ((View) currentPeerView.getParent()).getY() + currentPeerView.getY();
                motionEvent.offsetLocation(-x10, -y10);
                if (!n3Var.T.o(currentPeerView.getContext()).onTouchEvent(motionEvent)) {
                    motionEvent.offsetLocation(x10, y10);
                }
                return true;
            }
        }
        float f10 = 0.0f;
        if (i9Var.f17282m1 && currentPeerView != null && (qk0Var = currentPeerView.f17096o3) != null) {
            float f11 = 0.0f;
            for (View view = currentPeerView; view != null && (view.getParent() instanceof View); view = (View) view.getParent()) {
                f10 += view.getX();
                f11 += view.getY();
            }
            if (currentPeerView.f17096o3.getReactionsWindow() != null && currentPeerView.f17096o3.getReactionsWindow().f16037c != null) {
                motionEvent.offsetLocation(-f10, (-f11) - currentPeerView.f17096o3.getReactionsWindow().f16037c.getTranslationY());
                currentPeerView.f17096o3.getReactionsWindow().f16037c.dispatchTouchEvent(motionEvent);
                return true;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            qk0Var.getHitRect(rect);
            rect.offset((int) f10, (int) f11);
            if (motionEvent.getAction() == 0 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                currentPeerView.b1(false);
                return true;
            }
            motionEvent.offsetLocation(-rect.left, -rect.top);
            qk0Var.dispatchTouchEvent(motionEvent);
            return true;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            z4 = false;
        } else {
            i9Var.f17271g0 = false;
            AndroidUtilities.cancelRunOnUIThread(i9Var.Y0);
            float f12 = i9Var.U;
            if (f12 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, 0.0f);
                i9Var.D = ofFloat;
                ofFloat.addUpdateListener(new t8(this, 0));
                i9Var.D.addListener(new u8(this, 0));
                i9Var.D.setDuration(250L);
                i9Var.D.setInterpolator(pr.f30168f);
                i9Var.D.start();
            }
            if (i9Var.S >= 0.3f) {
                i9Var.q(true);
            }
            i9Var.K(false);
            i9Var.L(false);
            z4 = true;
        }
        if (motionEvent.getAction() == 0) {
            i9Var.X = false;
            if (currentPeerView != null) {
                eh.d dVar = currentPeerView.f17117v0;
                n8 n8Var = currentPeerView.f17133z0;
                j3 j3Var = currentPeerView.Z0;
                qh.e3 e3Var = currentPeerView.C0;
                if (e3Var != null && e3Var.S && n8Var != null) {
                    if (!e3Var.f45278o0.contains(motionEvent.getX() - (currentPeerView.C0.getX() + (j3Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.C0.getY() + (j3Var.getY() + currentPeerView.getY()))) && !currentPeerView.H0(motionEvent, n8Var)) {
                        currentPeerView.C0.e(true);
                    }
                }
                qh.e3 e3Var2 = currentPeerView.D0;
                if (e3Var2 != null && e3Var2.S && dVar != null && !e3Var2.f45278o0.contains(motionEvent.getX() - (currentPeerView.D0.getX() + (j3Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.D0.getY() + (j3Var.getY() + currentPeerView.getY()))) && !currentPeerView.H0(motionEvent, dVar)) {
                    currentPeerView.D0.e(true);
                }
            }
            i9Var.f17279k0.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        }
        if (!i9Var.f17304x && !i9Var.E0 && !i9Var.F0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f13 = i9Var.f17258b0;
        SparseArray sparseArray = this.D0;
        if (f13 == 0.0f && !i9Var.f17271g0 && i9Var.f17279k0.C0 == 1 && motionEvent.getAction() == 2 && z10 && (((((Float) sparseArray.get(motionEvent.getPointerId(0), Float.valueOf(0.0f))).floatValue() - motionEvent.getX(0)) != 0.0f && (((i11 = (y8Var = i9Var.f17279k0).F0) == 0 && y8Var.H0 == 0.0f && floatValue < 0.0f) || (i11 == y8Var.getAdapter().b() - 1 && y8Var.H0 == 0.0f && i10 > 0))) || i9Var.U != 0.0f)) {
            float f14 = i9Var.U;
            if (f14 == 0.0f) {
                i9Var.V = -floatValue;
            }
            if ((floatValue < 0.0f && i9Var.V > 0.0f) || (i10 > 0 && i9Var.V < 0.0f)) {
                floatValue *= 0.2f;
            }
            i9Var.U = f14 - floatValue;
            i9.k(i9Var);
            float f15 = i9Var.U;
            if ((f15 > 0.0f && i9Var.V < 0.0f) || (f15 < 0.0f && i9Var.V > 0.0f)) {
                i9Var.U = 0.0f;
            }
            z11 = true;
        } else {
            z11 = false;
        }
        if (currentPeerView != null && i9Var.f17258b0 == 0.0f && !i9Var.f17271g0 && !i9Var.I0 && !i9Var.F0 && i9Var.f17279k0.C0 != 1) {
            AndroidUtilities.getViewPositionInParent(currentPeerView.Z0, this, fArr);
            motionEvent.offsetLocation(-fArr[0], -fArr[1]);
            f4 currentPeerView2 = i9Var.f17279k0.getCurrentPeerView();
            currentPeerView2.U2.a(motionEvent, currentPeerView2.Z0, null, null, 0);
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
                if (i9Var.f17258b0 != 0.0f && !i9Var.f17264d1 && i9Var.m0 < AndroidUtilities.dp(20.0f)) {
                    if (i9Var.f17302w.f17493f > 0.5f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    i9Var.n(z12);
                }
                f4 t6 = i9Var.t();
                if (t6 != null) {
                    t6.H0.f16866t0 = false;
                }
            }
            if (z4 && !i9Var.X) {
                i9Var.m();
            }
            if (!dispatchTouchEvent && (!i9.f17248u1 || !i9Var.f17284n0)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.F0.f17301v0) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        i9 i9Var = this.F0;
        if (i9Var.f17257b && !i9Var.f17260c) {
            org.telegram.ui.ActionBar.p2 p2Var = this.E0;
            AndroidUtilities.requestAdjustResize(p2Var.getParentActivity(), p2Var.getClassGuid());
        }
        ic.a(this, new v8(this));
        NotificationCenter.getInstance(i9Var.h).addObserver(i9Var, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(i9Var.h).addObserver(i9Var, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i9Var.h).addObserver(i9Var, NotificationCenter.articleClosed);
        NotificationCenter.getInstance(i9Var.h).addObserver(i9Var, NotificationCenter.openArticle);
        NotificationCenter.getInstance(i9Var.h).addObserver(i9Var, NotificationCenter.storyDeleted);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ic.h(this);
        i9 i9Var = this.F0;
        NotificationCenter.getInstance(i9Var.h).removeObserver(i9Var, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(i9Var.h).removeObserver(i9Var, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i9Var.h).removeObserver(i9Var, NotificationCenter.articleClosed);
        NotificationCenter.getInstance(i9Var.h).removeObserver(i9Var, NotificationCenter.openArticle);
        NotificationCenter.getInstance(i9Var.h).removeObserver(i9Var, NotificationCenter.storyDeleted);
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: oh.w8.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        i9 i9Var = this.F0;
        ((FrameLayout.LayoutParams) i9Var.f17256a1.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight - AndroidUtilities.dp(2.0f);
        i9Var.f17256a1.getLayoutParams().height = AndroidUtilities.dp(2.0f);
        super.onMeasure(i10, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        h2 h2Var;
        int action = motionEvent.getAction();
        i9 i9Var = this.F0;
        if (action == 1 || motionEvent.getAction() == 3) {
            i9Var.f17271g0 = false;
            i9Var.K(false);
            if (i9Var.S >= 1.0f) {
                i9Var.q(true);
            } else if (!i9Var.E0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i9Var.T, 0.0f);
                i9Var.D = ofFloat;
                ofFloat.addUpdateListener(new t8(this, 1));
                i9Var.D.addListener(new u8(this, 1));
                i9Var.D.setDuration(150L);
                i9Var.D.setInterpolator(pr.f30168f);
                i9Var.D.start();
            }
            f4 t6 = i9Var.t();
            if (t6 != null && (h2Var = t6.I0) != null) {
                h2Var.setAllowTouches(true);
            }
        }
        if (!i9Var.f17271g0 && !i9Var.f17304x && i9Var.W == 0.0f && ((i9Var.f17258b0 == 0.0f || (!i9Var.f17261c0 && !i9Var.f17263d0)) && !i9Var.f17272g1)) {
            return false;
        }
        i9Var.f17269f0.onTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        super.requestDisallowInterceptTouchEvent(z4);
        this.F0.f17261c0 = false;
    }
}
