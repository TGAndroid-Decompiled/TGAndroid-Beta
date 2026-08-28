package ih;

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
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.xu0;
public final class a9 extends xu0 {
    public final RectF A0;
    public final RectF B0;
    public final SparseArray C0;
    public final org.telegram.ui.ActionBar.o2 D0;
    public final m9 E0;
    public float f11236s0;
    public float f11237t0;
    public float f11238u0;
    public final float[] f11239v0;
    public final Path f11240w0;
    public final RectF f11241x0;
    public final RectF f11242y0;
    public final RectF f11243z0;

    public a9(m9 m9Var, Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        super(context, null);
        this.E0 = m9Var;
        this.D0 = o2Var;
        this.f11239v0 = new float[8];
        this.f11240w0 = new Path();
        this.f11241x0 = new RectF();
        this.f11242y0 = new RectF();
        this.f11243z0 = new RectF();
        this.A0 = new RectF();
        this.B0 = new RectF();
        this.C0 = new SparseArray();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: ih.a9.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        m9 m9Var = this.E0;
        if (keyCode != 24 && keyEvent.getKeyCode() != 25) {
            if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                m9Var.onAttachedBackPressed();
                return true;
            }
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        m9Var.r(keyEvent);
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        float floatValue;
        int i9;
        c9 c9Var;
        int i10;
        uj0 uj0Var;
        m9 m9Var = this.E0;
        float[] fArr = m9Var.f11808k0;
        i4 currentPeerView = m9Var.f11806j0.getCurrentPeerView();
        if (currentPeerView != null) {
            p3 p3Var = currentPeerView.G0;
            if (p3Var.S.y()) {
                float x10 = currentPeerView.getX();
                float y10 = ((View) currentPeerView.getParent()).getY() + currentPeerView.getY();
                motionEvent.offsetLocation(-x10, -y10);
                if (!p3Var.S.o(currentPeerView.getContext()).onTouchEvent(motionEvent)) {
                    motionEvent.offsetLocation(x10, y10);
                }
                return true;
            }
        }
        float f10 = 0.0f;
        if (m9Var.l1 && currentPeerView != null && (uj0Var = currentPeerView.f11570n3) != null) {
            float f11 = 0.0f;
            for (View view = currentPeerView; view != null && (view.getParent() instanceof View); view = (View) view.getParent()) {
                f10 += view.getX();
                f11 += view.getY();
            }
            if (currentPeerView.f11570n3.getReactionsWindow() != null && currentPeerView.f11570n3.getReactionsWindow().f10576c != null) {
                motionEvent.offsetLocation(-f10, (-f11) - currentPeerView.f11570n3.getReactionsWindow().f10576c.getTranslationY());
                currentPeerView.f11570n3.getReactionsWindow().f10576c.dispatchTouchEvent(motionEvent);
                return true;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            uj0Var.getHitRect(rect);
            rect.offset((int) f10, (int) f11);
            if (motionEvent.getAction() == 0 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                currentPeerView.b1(false);
                return true;
            }
            motionEvent.offsetLocation(-rect.left, -rect.top);
            uj0Var.dispatchTouchEvent(motionEvent);
            return true;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            z10 = false;
        } else {
            m9Var.f11798f0 = false;
            AndroidUtilities.cancelRunOnUIThread(m9Var.X0);
            float f12 = m9Var.T;
            if (f12 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, 0.0f);
                m9Var.C = ofFloat;
                ofFloat.addUpdateListener(new x8(this, 0));
                m9Var.C.addListener(new y8(this, 0));
                m9Var.C.setDuration(250L);
                m9Var.C.setInterpolator(gr.f28844f);
                m9Var.C.start();
            }
            if (m9Var.R >= 0.3f) {
                m9Var.q(true);
            }
            m9Var.K(false);
            m9Var.L(false);
            z10 = true;
        }
        if (motionEvent.getAction() == 0) {
            m9Var.W = false;
            if (currentPeerView != null) {
                dh.g gVar = currentPeerView.f11591u0;
                r8 r8Var = currentPeerView.f11607y0;
                l3 l3Var = currentPeerView.Y0;
                kh.x3 x3Var = currentPeerView.B0;
                if (x3Var != null && x3Var.R && r8Var != null) {
                    if (!x3Var.f16358n0.contains(motionEvent.getX() - (currentPeerView.B0.getX() + (l3Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.B0.getY() + (l3Var.getY() + currentPeerView.getY()))) && !currentPeerView.H0(motionEvent, r8Var)) {
                        currentPeerView.B0.e(true);
                    }
                }
                kh.x3 x3Var2 = currentPeerView.C0;
                if (x3Var2 != null && x3Var2.R && gVar != null && !x3Var2.f16358n0.contains(motionEvent.getX() - (currentPeerView.C0.getX() + (l3Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.C0.getY() + (l3Var.getY() + currentPeerView.getY()))) && !currentPeerView.H0(motionEvent, gVar)) {
                    currentPeerView.C0.e(true);
                }
            }
            m9Var.f11806j0.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        }
        if (!m9Var.f11832x && !m9Var.D0 && !m9Var.E0) {
            z11 = true;
        } else {
            z11 = false;
        }
        float f13 = m9Var.f11784a0;
        SparseArray sparseArray = this.C0;
        if (f13 == 0.0f && !m9Var.f11798f0 && m9Var.f11806j0.B0 == 1 && motionEvent.getAction() == 2 && z11 && (((((Float) sparseArray.get(motionEvent.getPointerId(0), Float.valueOf(0.0f))).floatValue() - motionEvent.getX(0)) != 0.0f && (((i10 = (c9Var = m9Var.f11806j0).E0) == 0 && c9Var.G0 == 0.0f && floatValue < 0.0f) || (i10 == c9Var.getAdapter().b() - 1 && c9Var.G0 == 0.0f && i9 > 0))) || m9Var.T != 0.0f)) {
            float f14 = m9Var.T;
            if (f14 == 0.0f) {
                m9Var.U = -floatValue;
            }
            if ((floatValue < 0.0f && m9Var.U > 0.0f) || (i9 > 0 && m9Var.U < 0.0f)) {
                floatValue *= 0.2f;
            }
            m9Var.T = f14 - floatValue;
            m9.k(m9Var);
            float f15 = m9Var.T;
            if ((f15 > 0.0f && m9Var.U < 0.0f) || (f15 < 0.0f && m9Var.U > 0.0f)) {
                m9Var.T = 0.0f;
            }
            z12 = true;
        } else {
            z12 = false;
        }
        if (currentPeerView != null && m9Var.f11784a0 == 0.0f && !m9Var.f11798f0 && !m9Var.H0 && !m9Var.E0 && m9Var.f11806j0.B0 != 1) {
            AndroidUtilities.getViewPositionInParent(currentPeerView.Y0, this, fArr);
            motionEvent.offsetLocation(-fArr[0], -fArr[1]);
            i4 currentPeerView2 = m9Var.f11806j0.getCurrentPeerView();
            currentPeerView2.T2.a(motionEvent, currentPeerView2.Y0, null, null, 0);
            motionEvent.offsetLocation(fArr[0], fArr[1]);
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            for (int i11 = 0; i11 < motionEvent.getPointerCount(); i11++) {
                sparseArray.put(motionEvent.getPointerId(i11), Float.valueOf(motionEvent.getX(i11)));
            }
        } else {
            sparseArray.clear();
        }
        if (!z12) {
            boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (m9Var.f11784a0 != 0.0f && !m9Var.f11791c1 && m9Var.f11810l0 < AndroidUtilities.dp(20.0f)) {
                    if (m9Var.f11830w.f11894f > 0.5f) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    m9Var.n(z13);
                }
                i4 t10 = m9Var.t();
                if (t10 != null) {
                    t10.G0.f11392s0 = false;
                }
            }
            if (z10 && !m9Var.W) {
                m9Var.m();
            }
            if (!dispatchTouchEvent && (!m9.f11776t1 || !m9Var.m0)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.E0.f11828u0) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m9 m9Var = this.E0;
        if (m9Var.f11786b && !m9Var.f11789c) {
            org.telegram.ui.ActionBar.o2 o2Var = this.D0;
            AndroidUtilities.requestAdjustResize(o2Var.getParentActivity(), o2Var.getClassGuid());
        }
        gc.a(this, new z8(this));
        NotificationCenter.getInstance(m9Var.h).addObserver(m9Var, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(m9Var.h).addObserver(m9Var, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(m9Var.h).addObserver(m9Var, NotificationCenter.articleClosed);
        NotificationCenter.getInstance(m9Var.h).addObserver(m9Var, NotificationCenter.openArticle);
        NotificationCenter.getInstance(m9Var.h).addObserver(m9Var, NotificationCenter.storyDeleted);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gc.h(this);
        m9 m9Var = this.E0;
        NotificationCenter.getInstance(m9Var.h).removeObserver(m9Var, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(m9Var.h).removeObserver(m9Var, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(m9Var.h).removeObserver(m9Var, NotificationCenter.articleClosed);
        NotificationCenter.getInstance(m9Var.h).removeObserver(m9Var, NotificationCenter.openArticle);
        NotificationCenter.getInstance(m9Var.h).removeObserver(m9Var, NotificationCenter.storyDeleted);
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: ih.a9.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        m9 m9Var = this.E0;
        ((FrameLayout.LayoutParams) m9Var.Z0.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight - AndroidUtilities.dp(2.0f);
        m9Var.Z0.getLayoutParams().height = AndroidUtilities.dp(2.0f);
        super.onMeasure(i9, i10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        h2 h2Var;
        int action = motionEvent.getAction();
        m9 m9Var = this.E0;
        if (action == 1 || motionEvent.getAction() == 3) {
            m9Var.f11798f0 = false;
            m9Var.K(false);
            if (m9Var.R >= 1.0f) {
                m9Var.q(true);
            } else if (!m9Var.D0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(m9Var.S, 0.0f);
                m9Var.C = ofFloat;
                ofFloat.addUpdateListener(new x8(this, 1));
                m9Var.C.addListener(new y8(this, 1));
                m9Var.C.setDuration(150L);
                m9Var.C.setInterpolator(gr.f28844f);
                m9Var.C.start();
            }
            i4 t10 = m9Var.t();
            if (t10 != null && (h2Var = t10.H0) != null) {
                h2Var.setAllowTouches(true);
            }
        }
        if (!m9Var.f11798f0 && !m9Var.f11832x && m9Var.V == 0.0f && ((m9Var.f11784a0 == 0.0f || (!m9Var.f11787b0 && !m9Var.f11790c0)) && !m9Var.f11799f1)) {
            return false;
        }
        m9Var.f11795e0.onTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        this.E0.f11787b0 = false;
    }
}
