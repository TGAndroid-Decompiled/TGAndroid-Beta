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
public final class o9 extends jw0 {
    public final Path A0;
    public final RectF B0;
    public final RectF C0;
    public final RectF D0;
    public final RectF E0;
    public final RectF F0;
    public final SparseArray G0;
    public final org.telegram.ui.ActionBar.n2 H0;
    public final aa I0;
    public float f5707w0;
    public float f5708x0;
    public float f5709y0;
    public final float[] f5710z0;

    public o9(aa aaVar, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context, null);
        this.I0 = aaVar;
        this.H0 = n2Var;
        this.f5710z0 = new float[8];
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
        throw new UnsupportedOperationException("Method not decompiled: ci.o9.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        aa aaVar = this.I0;
        if (keyCode != 24 && keyEvent.getKeyCode() != 25) {
            if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                aaVar.onAttachedBackPressed();
                return true;
            }
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        aaVar.r(keyEvent);
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
        q9 q9Var;
        int i11;
        cl0 cl0Var;
        aa aaVar = this.I0;
        float[] fArr = aaVar.f5208o0;
        q4 currentPeerView = aaVar.f5206n0.getCurrentPeerView();
        if (currentPeerView != null) {
            v3 v3Var = currentPeerView.K0;
            if (v3Var.W.x()) {
                float x10 = currentPeerView.getX();
                float y3 = ((View) currentPeerView.getParent()).getY() + currentPeerView.getY();
                motionEvent.offsetLocation(-x10, -y3);
                if (!v3Var.W.n(currentPeerView.getContext()).onTouchEvent(motionEvent)) {
                    motionEvent.offsetLocation(x10, y3);
                }
                return true;
            }
        }
        float f7 = 0.0f;
        if (aaVar.f5211p1 && currentPeerView != null && (cl0Var = currentPeerView.f5820r3) != null) {
            float f10 = 0.0f;
            for (View view = currentPeerView; view != null && (view.getParent() instanceof View); view = (View) view.getParent()) {
                f7 += view.getX();
                f10 += view.getY();
            }
            if (currentPeerView.f5820r3.getReactionsWindow() != null && currentPeerView.f5820r3.getReactionsWindow().f872c != null) {
                motionEvent.offsetLocation(-f7, (-f10) - currentPeerView.f5820r3.getReactionsWindow().f872c.getTranslationY());
                currentPeerView.f5820r3.getReactionsWindow().f872c.dispatchTouchEvent(motionEvent);
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
            aaVar.f5199j0 = false;
            AndroidUtilities.cancelRunOnUIThread(aaVar.f5182b1);
            float f11 = aaVar.X;
            if (f11 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
                aaVar.G = ofFloat;
                ofFloat.addUpdateListener(new l9(this, 0));
                aaVar.G.addListener(new m9(this, 0));
                aaVar.G.setDuration(250L);
                aaVar.G.setInterpolator(bs.f25037f);
                aaVar.G.start();
            }
            if (aaVar.V >= 0.3f) {
                aaVar.q(true);
            }
            aaVar.K(false);
            aaVar.L(false);
            z10 = true;
        }
        if (motionEvent.getAction() == 0) {
            aaVar.f5178a0 = false;
            if (currentPeerView != null) {
                i4 i4Var = currentPeerView.f5841y0;
                f9 f9Var = currentPeerView.C0;
                r3 r3Var = currentPeerView.f5772c1;
                ei.x3 x3Var = currentPeerView.F0;
                if (x3Var != null && x3Var.V && f9Var != null) {
                    if (!x3Var.f10090r0.contains(motionEvent.getX() - (currentPeerView.F0.getX() + (r3Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.F0.getY() + (r3Var.getY() + currentPeerView.getY()))) && !currentPeerView.H0(motionEvent, f9Var)) {
                        currentPeerView.F0.e(true);
                    }
                }
                ei.x3 x3Var2 = currentPeerView.G0;
                if (x3Var2 != null && x3Var2.V && i4Var != null && !x3Var2.f10090r0.contains(motionEvent.getX() - (currentPeerView.G0.getX() + (r3Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.G0.getY() + (r3Var.getY() + currentPeerView.getY()))) && !currentPeerView.H0(motionEvent, i4Var)) {
                    currentPeerView.G0.e(true);
                }
            }
            aaVar.f5206n0.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        }
        if (!aaVar.f5229x && !aaVar.H0 && !aaVar.I0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i12 = (aaVar.f5188e0 > 0.0f ? 1 : (aaVar.f5188e0 == 0.0f ? 0 : -1));
        SparseArray sparseArray = this.G0;
        if (i12 == 0 && !aaVar.f5199j0 && aaVar.f5206n0.F0 == 1 && motionEvent.getAction() == 2 && z11 && (((((Float) sparseArray.get(motionEvent.getPointerId(0), Float.valueOf(0.0f))).floatValue() - motionEvent.getX(0)) != 0.0f && (((i11 = (q9Var = aaVar.f5206n0).I0) == 0 && q9Var.K0 == 0.0f && floatValue < 0.0f) || (i11 == q9Var.getAdapter().b() - 1 && q9Var.K0 == 0.0f && i10 > 0))) || aaVar.X != 0.0f)) {
            float f12 = aaVar.X;
            if (f12 == 0.0f) {
                aaVar.Y = -floatValue;
            }
            if ((floatValue < 0.0f && aaVar.Y > 0.0f) || (i10 > 0 && aaVar.Y < 0.0f)) {
                floatValue *= 0.2f;
            }
            aaVar.X = f12 - floatValue;
            aa.k(aaVar);
            float f13 = aaVar.X;
            if ((f13 > 0.0f && aaVar.Y < 0.0f) || (f13 < 0.0f && aaVar.Y > 0.0f)) {
                aaVar.X = 0.0f;
            }
            z12 = true;
        } else {
            z12 = false;
        }
        if (currentPeerView != null && aaVar.f5188e0 == 0.0f && !aaVar.f5199j0 && !aaVar.L0 && !aaVar.I0 && aaVar.f5206n0.F0 != 1) {
            AndroidUtilities.getViewPositionInParent(currentPeerView.f5772c1, this, fArr);
            motionEvent.offsetLocation(-fArr[0], -fArr[1]);
            q4 currentPeerView2 = aaVar.f5206n0.getCurrentPeerView();
            currentPeerView2.X2.a(motionEvent, currentPeerView2.f5772c1, null, null, 0);
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
                if (aaVar.f5188e0 != 0.0f && !aaVar.f5194g1 && aaVar.f5210p0 < AndroidUtilities.dp(20.0f)) {
                    if (aaVar.f5226w.f5283f > 0.5f) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    aaVar.n(z13);
                }
                q4 t10 = aaVar.t();
                if (t10 != null) {
                    t10.K0.f6000w0 = false;
                }
            }
            if (z10 && !aaVar.f5178a0) {
                aaVar.m();
            }
            if (!dispatchTouchEvent && (!aa.f5174x1 || !aaVar.f5212q0)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.I0.f5232y0) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        aa aaVar = this.I0;
        if (aaVar.f5180b && !aaVar.f5183c) {
            org.telegram.ui.ActionBar.n2 n2Var = this.H0;
            AndroidUtilities.requestAdjustResize(n2Var.getParentActivity(), n2Var.getClassGuid());
        }
        qc.a(this, new n9(this));
        NotificationCenter.getInstance(aaVar.h).addObserver(aaVar, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(aaVar.h).addObserver(aaVar, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(aaVar.h).addObserver(aaVar, NotificationCenter.articleClosed);
        NotificationCenter.getInstance(aaVar.h).addObserver(aaVar, NotificationCenter.openArticle);
        NotificationCenter.getInstance(aaVar.h).addObserver(aaVar, NotificationCenter.storyDeleted);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qc.h(this);
        aa aaVar = this.I0;
        NotificationCenter.getInstance(aaVar.h).removeObserver(aaVar, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(aaVar.h).removeObserver(aaVar, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(aaVar.h).removeObserver(aaVar, NotificationCenter.articleClosed);
        NotificationCenter.getInstance(aaVar.h).removeObserver(aaVar, NotificationCenter.openArticle);
        NotificationCenter.getInstance(aaVar.h).removeObserver(aaVar, NotificationCenter.storyDeleted);
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: ci.o9.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        aa aaVar = this.I0;
        ((FrameLayout.LayoutParams) aaVar.f5187d1.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight - AndroidUtilities.dp(2.0f);
        aaVar.f5187d1.getLayoutParams().height = AndroidUtilities.dp(2.0f);
        super.onMeasure(i10, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        n2 n2Var;
        int action = motionEvent.getAction();
        aa aaVar = this.I0;
        if (action == 1 || motionEvent.getAction() == 3) {
            aaVar.f5199j0 = false;
            aaVar.K(false);
            if (aaVar.V >= 1.0f) {
                aaVar.q(true);
            } else if (!aaVar.H0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(aaVar.W, 0.0f);
                aaVar.G = ofFloat;
                ofFloat.addUpdateListener(new l9(this, 1));
                aaVar.G.addListener(new m9(this, 1));
                aaVar.G.setDuration(150L);
                aaVar.G.setInterpolator(bs.f25037f);
                aaVar.G.start();
            }
            q4 t10 = aaVar.t();
            if (t10 != null && (n2Var = t10.L0) != null) {
                n2Var.setAllowTouches(true);
            }
        }
        if (!aaVar.f5199j0 && !aaVar.f5229x && aaVar.Z == 0.0f && ((aaVar.f5188e0 == 0.0f || (!aaVar.f5191f0 && !aaVar.f5193g0)) && !aaVar.f5200j1)) {
            return false;
        }
        aaVar.f5197i0.onTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        this.I0.f5191f0 = false;
    }
}
