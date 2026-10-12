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
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.sc;
public final class gb extends ow0 {
    public final Path A0;
    public final RectF B0;
    public final RectF C0;
    public final RectF D0;
    public final RectF E0;
    public final RectF F0;
    public final SparseArray G0;
    public final org.telegram.ui.ActionBar.m2 H0;
    public final sb I0;
    public float f3098w0;
    public float f3099x0;
    public float f3100y0;
    public final float[] f3101z0;

    public gb(sb sbVar, Context context, org.telegram.ui.ActionBar.m2 m2Var) {
        super(context, null);
        this.I0 = sbVar;
        this.H0 = m2Var;
        this.f3101z0 = new float[8];
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
        throw new UnsupportedOperationException("Method not decompiled: bi.gb.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        sb sbVar = this.I0;
        if (keyCode != 24 && keyEvent.getKeyCode() != 25) {
            if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                sbVar.onAttachedBackPressed();
                return true;
            }
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        sbVar.r(keyEvent);
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
        ib ibVar;
        int i11;
        gl0 gl0Var;
        sb sbVar = this.I0;
        float[] fArr = sbVar.f3691o0;
        q5 currentPeerView = sbVar.f3689n0.getCurrentPeerView();
        if (currentPeerView != null) {
            u4 u4Var = currentPeerView.K0;
            if (u4Var.W.x()) {
                float x10 = currentPeerView.getX();
                float y3 = ((View) currentPeerView.getParent()).getY() + currentPeerView.getY();
                motionEvent.offsetLocation(-x10, -y3);
                if (!u4Var.W.n(currentPeerView.getContext()).onTouchEvent(motionEvent)) {
                    motionEvent.offsetLocation(x10, y3);
                }
                return true;
            }
        }
        float f7 = 0.0f;
        if (sbVar.f3694p1 && currentPeerView != null && (gl0Var = currentPeerView.f3559r3) != null) {
            float f10 = 0.0f;
            for (View view = currentPeerView; view != null && (view.getParent() instanceof View); view = (View) view.getParent()) {
                f7 += view.getX();
                f10 += view.getY();
            }
            if (currentPeerView.f3559r3.getReactionsWindow() != null && currentPeerView.f3559r3.getReactionsWindow().f866c != null) {
                motionEvent.offsetLocation(-f7, (-f10) - currentPeerView.f3559r3.getReactionsWindow().f866c.getTranslationY());
                currentPeerView.f3559r3.getReactionsWindow().f866c.dispatchTouchEvent(motionEvent);
                return true;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            gl0Var.getHitRect(rect);
            rect.offset((int) f7, (int) f10);
            if (motionEvent.getAction() == 0 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                currentPeerView.b1(false);
                return true;
            }
            motionEvent.offsetLocation(-rect.left, -rect.top);
            gl0Var.dispatchTouchEvent(motionEvent);
            return true;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            z10 = false;
        } else {
            sbVar.f3682j0 = false;
            AndroidUtilities.cancelRunOnUIThread(sbVar.f3665b1);
            float f11 = sbVar.X;
            if (f11 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
                sbVar.G = ofFloat;
                ofFloat.addUpdateListener(new db(this, 0));
                sbVar.G.addListener(new eb(this, 0));
                sbVar.G.setDuration(250L);
                sbVar.G.setInterpolator(es.f24771f);
                sbVar.G.start();
            }
            if (sbVar.V >= 0.3f) {
                sbVar.q(true);
            }
            sbVar.K(false);
            sbVar.L(false);
            z10 = true;
        }
        if (motionEvent.getAction() == 0) {
            sbVar.f3661a0 = false;
            if (currentPeerView != null) {
                i5 i5Var = currentPeerView.f3580y0;
                xa xaVar = currentPeerView.C0;
                o4 o4Var = currentPeerView.f3511c1;
                di.d4 d4Var = currentPeerView.F0;
                if (d4Var != null && d4Var.V && xaVar != null) {
                    if (!d4Var.f6808r0.contains(motionEvent.getX() - (currentPeerView.F0.getX() + (o4Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.F0.getY() + (o4Var.getY() + currentPeerView.getY()))) && !currentPeerView.H0(motionEvent, xaVar)) {
                        currentPeerView.F0.e(true);
                    }
                }
                di.d4 d4Var2 = currentPeerView.G0;
                if (d4Var2 != null && d4Var2.V && i5Var != null && !d4Var2.f6808r0.contains(motionEvent.getX() - (currentPeerView.G0.getX() + (o4Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.G0.getY() + (o4Var.getY() + currentPeerView.getY()))) && !currentPeerView.H0(motionEvent, i5Var)) {
                    currentPeerView.G0.e(true);
                }
            }
            sbVar.f3689n0.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        }
        if (!sbVar.f3712x && !sbVar.H0 && !sbVar.I0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i12 = (sbVar.f3671e0 > 0.0f ? 1 : (sbVar.f3671e0 == 0.0f ? 0 : -1));
        SparseArray sparseArray = this.G0;
        if (i12 == 0 && !sbVar.f3682j0 && sbVar.f3689n0.F0 == 1 && motionEvent.getAction() == 2 && z11 && (((((Float) sparseArray.get(motionEvent.getPointerId(0), Float.valueOf(0.0f))).floatValue() - motionEvent.getX(0)) != 0.0f && (((i11 = (ibVar = sbVar.f3689n0).I0) == 0 && ibVar.K0 == 0.0f && floatValue < 0.0f) || (i11 == ibVar.getAdapter().b() - 1 && ibVar.K0 == 0.0f && i10 > 0))) || sbVar.X != 0.0f)) {
            float f12 = sbVar.X;
            if (f12 == 0.0f) {
                sbVar.Y = -floatValue;
            }
            if ((floatValue < 0.0f && sbVar.Y > 0.0f) || (i10 > 0 && sbVar.Y < 0.0f)) {
                floatValue *= 0.2f;
            }
            sbVar.X = f12 - floatValue;
            sb.k(sbVar);
            float f13 = sbVar.X;
            if ((f13 > 0.0f && sbVar.Y < 0.0f) || (f13 < 0.0f && sbVar.Y > 0.0f)) {
                sbVar.X = 0.0f;
            }
            z12 = true;
        } else {
            z12 = false;
        }
        if (currentPeerView != null && sbVar.f3671e0 == 0.0f && !sbVar.f3682j0 && !sbVar.L0 && !sbVar.I0 && sbVar.f3689n0.F0 != 1) {
            AndroidUtilities.getViewPositionInParent(currentPeerView.f3511c1, this, fArr);
            motionEvent.offsetLocation(-fArr[0], -fArr[1]);
            q5 currentPeerView2 = sbVar.f3689n0.getCurrentPeerView();
            currentPeerView2.X2.a(motionEvent, currentPeerView2.f3511c1, null, null, 0);
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
                if (sbVar.f3671e0 != 0.0f && !sbVar.f3677g1 && sbVar.f3693p0 < AndroidUtilities.dp(20.0f)) {
                    if (sbVar.f3709w.f2991f > 0.5f) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    sbVar.n(z13);
                }
                q5 t10 = sbVar.t();
                if (t10 != null) {
                    t10.K0.f3152w0 = false;
                }
            }
            if (z10 && !sbVar.f3661a0) {
                sbVar.m();
            }
            if (!dispatchTouchEvent && (!sb.f3657x1 || !sbVar.f3695q0)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.I0.f3715y0) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        sb sbVar = this.I0;
        if (sbVar.f3663b && !sbVar.f3666c) {
            org.telegram.ui.ActionBar.m2 m2Var = this.H0;
            AndroidUtilities.requestAdjustResize(m2Var.getParentActivity(), m2Var.getClassGuid());
        }
        sc.a(this, new fb(this));
        NotificationCenter.getInstance(sbVar.h).addObserver(sbVar, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(sbVar.h).addObserver(sbVar, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(sbVar.h).addObserver(sbVar, NotificationCenter.articleClosed);
        NotificationCenter.getInstance(sbVar.h).addObserver(sbVar, NotificationCenter.openArticle);
        NotificationCenter.getInstance(sbVar.h).addObserver(sbVar, NotificationCenter.storyDeleted);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        sc.h(this);
        sb sbVar = this.I0;
        NotificationCenter.getInstance(sbVar.h).removeObserver(sbVar, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(sbVar.h).removeObserver(sbVar, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(sbVar.h).removeObserver(sbVar, NotificationCenter.articleClosed);
        NotificationCenter.getInstance(sbVar.h).removeObserver(sbVar, NotificationCenter.openArticle);
        NotificationCenter.getInstance(sbVar.h).removeObserver(sbVar, NotificationCenter.storyDeleted);
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: bi.gb.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        sb sbVar = this.I0;
        ((FrameLayout.LayoutParams) sbVar.f3670d1.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight - AndroidUtilities.dp(2.0f);
        sbVar.f3670d1.getLayoutParams().height = AndroidUtilities.dp(2.0f);
        super.onMeasure(i10, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        h3 h3Var;
        int action = motionEvent.getAction();
        sb sbVar = this.I0;
        if (action == 1 || motionEvent.getAction() == 3) {
            sbVar.f3682j0 = false;
            sbVar.K(false);
            if (sbVar.V >= 1.0f) {
                sbVar.q(true);
            } else if (!sbVar.H0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(sbVar.W, 0.0f);
                sbVar.G = ofFloat;
                ofFloat.addUpdateListener(new db(this, 1));
                sbVar.G.addListener(new eb(this, 1));
                sbVar.G.setDuration(150L);
                sbVar.G.setInterpolator(es.f24771f);
                sbVar.G.start();
            }
            q5 t10 = sbVar.t();
            if (t10 != null && (h3Var = t10.L0) != null) {
                h3Var.setAllowTouches(true);
            }
        }
        if (!sbVar.f3682j0 && !sbVar.f3712x && sbVar.Z == 0.0f && ((sbVar.f3671e0 == 0.0f || (!sbVar.f3674f0 && !sbVar.f3676g0)) && !sbVar.f3683j1)) {
            return false;
        }
        sbVar.f3680i0.onTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        this.I0.f3674f0 = false;
    }
}
