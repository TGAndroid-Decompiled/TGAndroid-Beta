package di;

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
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.ww0;
public final class m9 extends ww0 {
    public float f8795l0;
    public float m0;
    public float f8796n0;
    public final float[] f8797o0;
    public final Path f8798p0;
    public final RectF f8799q0;
    public final RectF f8800r0;
    public final RectF f8801s0;
    public final RectF f8802t0;
    public final RectF f8803u0;
    public final SparseArray f8804v0;
    public final org.telegram.ui.ActionBar.r2 f8805w0;
    public final y9 f8806x0;

    public m9(y9 y9Var, Context context, org.telegram.ui.ActionBar.r2 r2Var) {
        super(context, null);
        this.f8806x0 = y9Var;
        this.f8805w0 = r2Var;
        this.f8797o0 = new float[8];
        this.f8798p0 = new Path();
        this.f8799q0 = new RectF();
        this.f8800r0 = new RectF();
        this.f8801s0 = new RectF();
        this.f8802t0 = new RectF();
        this.f8803u0 = new RectF();
        this.f8804v0 = new SparseArray();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: di.m9.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        y9 y9Var = this.f8806x0;
        if (keyCode != 24 && keyEvent.getKeyCode() != 25) {
            if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                y9Var.onAttachedBackPressed();
                return true;
            }
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        y9Var.s(keyEvent);
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
        o9 o9Var;
        int i11;
        gl0 gl0Var;
        y9 y9Var = this.f8806x0;
        float[] fArr = y9Var.f9446o0;
        q4 currentPeerView = y9Var.f9444n0.getCurrentPeerView();
        if (currentPeerView != null) {
            u3 u3Var = currentPeerView.f9049z0;
            if (u3Var.W.x()) {
                float x9 = currentPeerView.getX();
                float y3 = ((View) currentPeerView.getParent()).getY() + currentPeerView.getY();
                motionEvent.offsetLocation(-x9, -y3);
                if (!u3Var.W.n(currentPeerView.getContext()).onTouchEvent(motionEvent)) {
                    motionEvent.offsetLocation(x9, y3);
                }
                return true;
            }
        }
        float f7 = 0.0f;
        if (y9Var.f9449p1 && currentPeerView != null && (gl0Var = currentPeerView.f8983g3) != null) {
            float f10 = 0.0f;
            for (View view = currentPeerView; view != null && (view.getParent() instanceof View); view = (View) view.getParent()) {
                f7 += view.getX();
                f10 += view.getY();
            }
            if (currentPeerView.f8983g3.getReactionsWindow() != null && currentPeerView.f8983g3.getReactionsWindow().f4049c != null) {
                motionEvent.offsetLocation(-f7, (-f10) - currentPeerView.f8983g3.getReactionsWindow().f4049c.getTranslationY());
                currentPeerView.f8983g3.getReactionsWindow().f4049c.dispatchTouchEvent(motionEvent);
                return true;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            gl0Var.getHitRect(rect);
            rect.offset((int) f7, (int) f10);
            if (motionEvent.getAction() == 0 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                currentPeerView.Z0(false);
                return true;
            }
            motionEvent.offsetLocation(-rect.left, -rect.top);
            gl0Var.dispatchTouchEvent(motionEvent);
            return true;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            z10 = false;
        } else {
            y9Var.f9437j0 = false;
            AndroidUtilities.cancelRunOnUIThread(y9Var.f9420b1);
            float f11 = y9Var.X;
            if (f11 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
                y9Var.G = ofFloat;
                ofFloat.addUpdateListener(new j9(this, 0));
                y9Var.G.addListener(new k9(this, 0));
                y9Var.G.setDuration(250L);
                y9Var.G.setInterpolator(ds.f27530f);
                y9Var.G.start();
            }
            if (y9Var.V >= 0.3f) {
                y9Var.q(true);
            }
            y9Var.L(false);
            y9Var.M(false);
            z10 = true;
        }
        if (motionEvent.getAction() == 0) {
            y9Var.f9416a0 = false;
            if (currentPeerView != null) {
                i4 i4Var = currentPeerView.f9002n0;
                d9 d9Var = currentPeerView.f9018r0;
                q3 q3Var = currentPeerView.R0;
                fi.v3 v3Var = currentPeerView.f9030u0;
                if (v3Var != null && v3Var.V && d9Var != null) {
                    if (!v3Var.f11804r0.contains(motionEvent.getX() - (currentPeerView.f9030u0.getX() + (q3Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.f9030u0.getY() + (q3Var.getY() + currentPeerView.getY()))) && !currentPeerView.F0(motionEvent, d9Var)) {
                        currentPeerView.f9030u0.e(true);
                    }
                }
                fi.v3 v3Var2 = currentPeerView.f9034v0;
                if (v3Var2 != null && v3Var2.V && i4Var != null && !v3Var2.f11804r0.contains(motionEvent.getX() - (currentPeerView.f9034v0.getX() + (q3Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.f9034v0.getY() + (q3Var.getY() + currentPeerView.getY()))) && !currentPeerView.F0(motionEvent, i4Var)) {
                    currentPeerView.f9034v0.e(true);
                }
            }
            y9Var.f9444n0.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        }
        if (!y9Var.f9467x && !y9Var.H0 && !y9Var.I0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i12 = (y9Var.f9426e0 > 0.0f ? 1 : (y9Var.f9426e0 == 0.0f ? 0 : -1));
        SparseArray sparseArray = this.f8804v0;
        if (i12 == 0 && !y9Var.f9437j0 && y9Var.f9444n0.F0 == 1 && motionEvent.getAction() == 2 && z11 && (((((Float) sparseArray.get(motionEvent.getPointerId(0), Float.valueOf(0.0f))).floatValue() - motionEvent.getX(0)) != 0.0f && (((i11 = (o9Var = y9Var.f9444n0).I0) == 0 && o9Var.K0 == 0.0f && floatValue < 0.0f) || (i11 == o9Var.getAdapter().b() - 1 && o9Var.K0 == 0.0f && i10 > 0))) || y9Var.X != 0.0f)) {
            float f12 = y9Var.X;
            if (f12 == 0.0f) {
                y9Var.Y = -floatValue;
            }
            if ((floatValue < 0.0f && y9Var.Y > 0.0f) || (i10 > 0 && y9Var.Y < 0.0f)) {
                floatValue *= 0.2f;
            }
            y9Var.X = f12 - floatValue;
            y9.k(y9Var);
            float f13 = y9Var.X;
            if ((f13 > 0.0f && y9Var.Y < 0.0f) || (f13 < 0.0f && y9Var.Y > 0.0f)) {
                y9Var.X = 0.0f;
            }
            z12 = true;
        } else {
            z12 = false;
        }
        if (currentPeerView != null && y9Var.f9426e0 == 0.0f && !y9Var.f9437j0 && !y9Var.L0 && !y9Var.I0 && y9Var.f9444n0.F0 != 1) {
            AndroidUtilities.getViewPositionInParent(currentPeerView.R0, this, fArr);
            motionEvent.offsetLocation(-fArr[0], -fArr[1]);
            q4 currentPeerView2 = y9Var.f9444n0.getCurrentPeerView();
            currentPeerView2.M2.a(motionEvent, currentPeerView2.R0, null, null, 0);
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
                if (y9Var.f9426e0 != 0.0f && !y9Var.f9432g1 && y9Var.f9448p0 < AndroidUtilities.dp(20.0f)) {
                    if (y9Var.f9464w.f8429f > 0.5f) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    y9Var.n(z13);
                }
                q4 u10 = y9Var.u();
                if (u10 != null) {
                    u10.f9049z0.f8930w0 = false;
                }
            }
            if (z10 && !y9Var.f9416a0) {
                y9Var.m();
            }
            if (!dispatchTouchEvent && (!y9.f9412x1 || !y9Var.f9450q0)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f8806x0.f9470y0) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        y9 y9Var = this.f8806x0;
        if (y9Var.f9418b && !y9Var.f9421c) {
            org.telegram.ui.ActionBar.r2 r2Var = this.f8805w0;
            AndroidUtilities.requestAdjustResize(r2Var.getParentActivity(), r2Var.getClassGuid());
        }
        qc.a(this, new l9(this));
        NotificationCenter.getInstance(y9Var.h).addWeakObserver(y9Var, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(y9Var.h).addWeakObserver(y9Var, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(y9Var.h).addWeakObserver(y9Var, NotificationCenter.articleClosed);
        NotificationCenter.getInstance(y9Var.h).addWeakObserver(y9Var, NotificationCenter.openArticle);
        NotificationCenter.getInstance(y9Var.h).addWeakObserver(y9Var, NotificationCenter.storyDeleted);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qc.h(this);
        y9 y9Var = this.f8806x0;
        NotificationCenter.getInstance(y9Var.h).removeObserver(y9Var, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(y9Var.h).removeObserver(y9Var, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(y9Var.h).removeObserver(y9Var, NotificationCenter.articleClosed);
        NotificationCenter.getInstance(y9Var.h).removeObserver(y9Var, NotificationCenter.openArticle);
        NotificationCenter.getInstance(y9Var.h).removeObserver(y9Var, NotificationCenter.storyDeleted);
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: di.m9.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        y9 y9Var = this.f8806x0;
        ((FrameLayout.LayoutParams) y9Var.f9425d1.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight - AndroidUtilities.dp(2.0f);
        y9Var.f9425d1.getLayoutParams().height = AndroidUtilities.dp(2.0f);
        super.onMeasure(i10, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        m2 m2Var;
        int action = motionEvent.getAction();
        y9 y9Var = this.f8806x0;
        if (action == 1 || motionEvent.getAction() == 3) {
            y9Var.f9437j0 = false;
            y9Var.L(false);
            if (y9Var.V >= 1.0f) {
                y9Var.q(true);
            } else if (!y9Var.H0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(y9Var.W, 0.0f);
                y9Var.G = ofFloat;
                ofFloat.addUpdateListener(new j9(this, 1));
                y9Var.G.addListener(new k9(this, 1));
                y9Var.G.setDuration(150L);
                y9Var.G.setInterpolator(ds.f27530f);
                y9Var.G.start();
            }
            q4 u10 = y9Var.u();
            if (u10 != null && (m2Var = u10.A0) != null) {
                m2Var.setAllowTouches(true);
            }
        }
        if (!y9Var.f9437j0 && !y9Var.f9467x && y9Var.Z == 0.0f && ((y9Var.f9426e0 == 0.0f || (!y9Var.f9429f0 && !y9Var.f9431g0)) && !y9Var.f9438j1)) {
            return false;
        }
        y9Var.f9435i0.onTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        this.f8806x0.f9429f0 = false;
    }
}
