package ci;

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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.qc;
public final class n9 extends jw0 {
    public final Path A0;
    public final RectF B0;
    public final RectF C0;
    public final RectF D0;
    public final RectF E0;
    public final RectF F0;
    public final SparseArray G0;
    public final org.telegram.ui.ActionBar.n2 H0;
    public final z9 I0;
    public float f5607w0;
    public float f5608x0;
    public float f5609y0;
    public final float[] f5610z0;

    public n9(z9 z9Var, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context, null);
        this.I0 = z9Var;
        this.H0 = n2Var;
        this.f5610z0 = new float[8];
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
        throw new UnsupportedOperationException("Method not decompiled: ci.n9.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        z9 z9Var = this.I0;
        if (keyCode != 24 && keyEvent.getKeyCode() != 25) {
            if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                z9Var.onAttachedBackPressed();
                return true;
            }
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        z9Var.r(keyEvent);
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
        p9 p9Var;
        int i11;
        cl0 cl0Var;
        z9 z9Var = this.I0;
        float[] fArr = z9Var.f6240o0;
        p4 currentPeerView = z9Var.f6238n0.getCurrentPeerView();
        if (currentPeerView != null) {
            u3 u3Var = currentPeerView.K0;
            if (u3Var.W.x()) {
                float x10 = currentPeerView.getX();
                float y3 = ((View) currentPeerView.getParent()).getY() + currentPeerView.getY();
                motionEvent.offsetLocation(-x10, -y3);
                if (!u3Var.W.n(currentPeerView.getContext()).onTouchEvent(motionEvent)) {
                    motionEvent.offsetLocation(x10, y3);
                }
                return true;
            }
        }
        float f7 = 0.0f;
        if (z9Var.f6243p1 && currentPeerView != null && (cl0Var = currentPeerView.f5700r3) != null) {
            float f10 = 0.0f;
            for (View view = currentPeerView; view != null && (view.getParent() instanceof View); view = (View) view.getParent()) {
                f7 += view.getX();
                f10 += view.getY();
            }
            if (currentPeerView.f5700r3.getReactionsWindow() != null && currentPeerView.f5700r3.getReactionsWindow().f872c != null) {
                motionEvent.offsetLocation(-f7, (-f10) - currentPeerView.f5700r3.getReactionsWindow().f872c.getTranslationY());
                currentPeerView.f5700r3.getReactionsWindow().f872c.dispatchTouchEvent(motionEvent);
                return true;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            cl0Var.getHitRect(rect);
            rect.offset((int) f7, (int) f10);
            if (motionEvent.getAction() == 0 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                currentPeerView.b1(false);
                return true;
            }
            motionEvent.offsetLocation(-rect.left, -rect.top);
            cl0Var.dispatchTouchEvent(motionEvent);
            return true;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            z10 = false;
        } else {
            z9Var.f6231j0 = false;
            AndroidUtilities.cancelRunOnUIThread(z9Var.f6214b1);
            float f11 = z9Var.X;
            if (f11 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
                z9Var.G = ofFloat;
                ofFloat.addUpdateListener(new k9(this, 0));
                z9Var.G.addListener(new l9(this, 0));
                z9Var.G.setDuration(250L);
                z9Var.G.setInterpolator(bs.f25030f);
                z9Var.G.start();
            }
            if (z9Var.V >= 0.3f) {
                z9Var.q(true);
            }
            z9Var.K(false);
            z9Var.L(false);
            z10 = true;
        }
        if (motionEvent.getAction() == 0) {
            z9Var.f6210a0 = false;
            if (currentPeerView != null) {
                h4 h4Var = currentPeerView.f5721y0;
                e9 e9Var = currentPeerView.C0;
                q3 q3Var = currentPeerView.f5652c1;
                ei.x3 x3Var = currentPeerView.F0;
                if (x3Var != null && x3Var.V && e9Var != null) {
                    if (!x3Var.f10088r0.contains(motionEvent.getX() - (currentPeerView.F0.getX() + (q3Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.F0.getY() + (q3Var.getY() + currentPeerView.getY()))) && !currentPeerView.H0(motionEvent, e9Var)) {
                        currentPeerView.F0.e(true);
                    }
                }
                ei.x3 x3Var2 = currentPeerView.G0;
                if (x3Var2 != null && x3Var2.V && h4Var != null && !x3Var2.f10088r0.contains(motionEvent.getX() - (currentPeerView.G0.getX() + (q3Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.G0.getY() + (q3Var.getY() + currentPeerView.getY()))) && !currentPeerView.H0(motionEvent, h4Var)) {
                    currentPeerView.G0.e(true);
                }
            }
            z9Var.f6238n0.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        }
        if (!z9Var.f6261x && !z9Var.H0 && !z9Var.I0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i12 = (z9Var.f6220e0 > 0.0f ? 1 : (z9Var.f6220e0 == 0.0f ? 0 : -1));
        SparseArray sparseArray = this.G0;
        if (i12 == 0 && !z9Var.f6231j0 && z9Var.f6238n0.F0 == 1 && motionEvent.getAction() == 2 && z11 && (((((Float) sparseArray.get(motionEvent.getPointerId(0), Float.valueOf(0.0f))).floatValue() - motionEvent.getX(0)) != 0.0f && (((i11 = (p9Var = z9Var.f6238n0).I0) == 0 && p9Var.K0 == 0.0f && floatValue < 0.0f) || (i11 == p9Var.getAdapter().b() - 1 && p9Var.K0 == 0.0f && i10 > 0))) || z9Var.X != 0.0f)) {
            float f12 = z9Var.X;
            if (f12 == 0.0f) {
                z9Var.Y = -floatValue;
            }
            if ((floatValue < 0.0f && z9Var.Y > 0.0f) || (i10 > 0 && z9Var.Y < 0.0f)) {
                floatValue *= 0.2f;
            }
            z9Var.X = f12 - floatValue;
            z9.k(z9Var);
            float f13 = z9Var.X;
            if ((f13 > 0.0f && z9Var.Y < 0.0f) || (f13 < 0.0f && z9Var.Y > 0.0f)) {
                z9Var.X = 0.0f;
            }
            z12 = true;
        } else {
            z12 = false;
        }
        if (currentPeerView != null && z9Var.f6220e0 == 0.0f && !z9Var.f6231j0 && !z9Var.L0 && !z9Var.I0 && z9Var.f6238n0.F0 != 1) {
            AndroidUtilities.getViewPositionInParent(currentPeerView.f5652c1, this, fArr);
            motionEvent.offsetLocation(-fArr[0], -fArr[1]);
            p4 currentPeerView2 = z9Var.f6238n0.getCurrentPeerView();
            currentPeerView2.X2.a(motionEvent, currentPeerView2.f5652c1, null, null, 0);
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
                if (z9Var.f6220e0 != 0.0f && !z9Var.f6226g1 && z9Var.f6242p0 < AndroidUtilities.dp(20.0f)) {
                    if (z9Var.f6258w.f5179f > 0.5f) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z9Var.n(z13);
                }
                p4 t10 = z9Var.t();
                if (t10 != null) {
                    t10.K0.f5892w0 = false;
                }
            }
            if (z10 && !z9Var.f6210a0) {
                z9Var.m();
            }
            if (!dispatchTouchEvent && (!z9.f6206x1 || !z9Var.f6244q0)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.I0.f6264y0) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z9 z9Var = this.I0;
        if (z9Var.f6212b && !z9Var.f6215c) {
            org.telegram.ui.ActionBar.n2 n2Var = this.H0;
            AndroidUtilities.requestAdjustResize(n2Var.getParentActivity(), n2Var.getClassGuid());
        }
        qc.a(this, new m9(this));
        NotificationCenter.getInstance(z9Var.h).addObserver(z9Var, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(z9Var.h).addObserver(z9Var, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(z9Var.h).addObserver(z9Var, NotificationCenter.articleClosed);
        NotificationCenter.getInstance(z9Var.h).addObserver(z9Var, NotificationCenter.openArticle);
        NotificationCenter.getInstance(z9Var.h).addObserver(z9Var, NotificationCenter.storyDeleted);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qc.h(this);
        z9 z9Var = this.I0;
        NotificationCenter.getInstance(z9Var.h).removeObserver(z9Var, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(z9Var.h).removeObserver(z9Var, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(z9Var.h).removeObserver(z9Var, NotificationCenter.articleClosed);
        NotificationCenter.getInstance(z9Var.h).removeObserver(z9Var, NotificationCenter.openArticle);
        NotificationCenter.getInstance(z9Var.h).removeObserver(z9Var, NotificationCenter.storyDeleted);
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: ci.n9.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        z9 z9Var = this.I0;
        ((FrameLayout.LayoutParams) z9Var.f6219d1.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight - AndroidUtilities.dp(2.0f);
        z9Var.f6219d1.getLayoutParams().height = AndroidUtilities.dp(2.0f);
        super.onMeasure(i10, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        m2 m2Var;
        int action = motionEvent.getAction();
        z9 z9Var = this.I0;
        if (action == 1 || motionEvent.getAction() == 3) {
            z9Var.f6231j0 = false;
            z9Var.K(false);
            if (z9Var.V >= 1.0f) {
                z9Var.q(true);
            } else if (!z9Var.H0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(z9Var.W, 0.0f);
                z9Var.G = ofFloat;
                ofFloat.addUpdateListener(new k9(this, 1));
                z9Var.G.addListener(new l9(this, 1));
                z9Var.G.setDuration(150L);
                z9Var.G.setInterpolator(bs.f25030f);
                z9Var.G.start();
            }
            p4 t10 = z9Var.t();
            if (t10 != null && (m2Var = t10.L0) != null) {
                m2Var.setAllowTouches(true);
            }
        }
        if (!z9Var.f6231j0 && !z9Var.f6261x && z9Var.Z == 0.0f && ((z9Var.f6220e0 == 0.0f || (!z9Var.f6223f0 && !z9Var.f6225g0)) && !z9Var.f6232j1)) {
            return false;
        }
        z9Var.f6229i0.onTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        this.I0.f6223f0 = false;
    }
}
