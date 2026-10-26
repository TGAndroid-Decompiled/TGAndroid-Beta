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
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.vw0;
public final class m9 extends vw0 {
    public float f8796l0;
    public float m0;
    public float f8797n0;
    public final float[] f8798o0;
    public final Path f8799p0;
    public final RectF f8800q0;
    public final RectF f8801r0;
    public final RectF f8802s0;
    public final RectF f8803t0;
    public final RectF f8804u0;
    public final SparseArray f8805v0;
    public final org.telegram.ui.ActionBar.r2 f8806w0;
    public final y9 f8807x0;

    public m9(y9 y9Var, Context context, org.telegram.ui.ActionBar.r2 r2Var) {
        super(context, null);
        this.f8807x0 = y9Var;
        this.f8806w0 = r2Var;
        this.f8798o0 = new float[8];
        this.f8799p0 = new Path();
        this.f8800q0 = new RectF();
        this.f8801r0 = new RectF();
        this.f8802s0 = new RectF();
        this.f8803t0 = new RectF();
        this.f8804u0 = new RectF();
        this.f8805v0 = new SparseArray();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: di.m9.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        y9 y9Var = this.f8807x0;
        if (keyCode != 24 && keyEvent.getKeyCode() != 25) {
            if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                y9Var.onAttachedBackPressed();
                return true;
            }
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        y9Var.r(keyEvent);
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
        fl0 fl0Var;
        y9 y9Var = this.f8807x0;
        float[] fArr = y9Var.f9447o0;
        q4 currentPeerView = y9Var.f9445n0.getCurrentPeerView();
        if (currentPeerView != null) {
            u3 u3Var = currentPeerView.f9050z0;
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
        if (y9Var.f9450p1 && currentPeerView != null && (fl0Var = currentPeerView.f8984g3) != null) {
            float f10 = 0.0f;
            for (View view = currentPeerView; view != null && (view.getParent() instanceof View); view = (View) view.getParent()) {
                f7 += view.getX();
                f10 += view.getY();
            }
            if (currentPeerView.f8984g3.getReactionsWindow() != null && currentPeerView.f8984g3.getReactionsWindow().f4049c != null) {
                motionEvent.offsetLocation(-f7, (-f10) - currentPeerView.f8984g3.getReactionsWindow().f4049c.getTranslationY());
                currentPeerView.f8984g3.getReactionsWindow().f4049c.dispatchTouchEvent(motionEvent);
                return true;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            fl0Var.getHitRect(rect);
            rect.offset((int) f7, (int) f10);
            if (motionEvent.getAction() == 0 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                currentPeerView.Z0(false);
                return true;
            }
            motionEvent.offsetLocation(-rect.left, -rect.top);
            fl0Var.dispatchTouchEvent(motionEvent);
            return true;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            z10 = false;
        } else {
            y9Var.f9438j0 = false;
            AndroidUtilities.cancelRunOnUIThread(y9Var.f9421b1);
            float f11 = y9Var.X;
            if (f11 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
                y9Var.G = ofFloat;
                ofFloat.addUpdateListener(new j9(this, 0));
                y9Var.G.addListener(new k9(this, 0));
                y9Var.G.setDuration(250L);
                y9Var.G.setInterpolator(ds.f27586f);
                y9Var.G.start();
            }
            if (y9Var.V >= 0.3f) {
                y9Var.q(true);
            }
            y9Var.K(false);
            y9Var.L(false);
            z10 = true;
        }
        if (motionEvent.getAction() == 0) {
            y9Var.f9417a0 = false;
            if (currentPeerView != null) {
                i4 i4Var = currentPeerView.f9003n0;
                d9 d9Var = currentPeerView.f9019r0;
                q3 q3Var = currentPeerView.R0;
                fi.v3 v3Var = currentPeerView.f9031u0;
                if (v3Var != null && v3Var.V && d9Var != null) {
                    if (!v3Var.f11805r0.contains(motionEvent.getX() - (currentPeerView.f9031u0.getX() + (q3Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.f9031u0.getY() + (q3Var.getY() + currentPeerView.getY()))) && !currentPeerView.F0(motionEvent, d9Var)) {
                        currentPeerView.f9031u0.e(true);
                    }
                }
                fi.v3 v3Var2 = currentPeerView.f9035v0;
                if (v3Var2 != null && v3Var2.V && i4Var != null && !v3Var2.f11805r0.contains(motionEvent.getX() - (currentPeerView.f9035v0.getX() + (q3Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.f9035v0.getY() + (q3Var.getY() + currentPeerView.getY()))) && !currentPeerView.F0(motionEvent, i4Var)) {
                    currentPeerView.f9035v0.e(true);
                }
            }
            y9Var.f9445n0.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        }
        if (!y9Var.f9468x && !y9Var.H0 && !y9Var.I0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i12 = (y9Var.f9427e0 > 0.0f ? 1 : (y9Var.f9427e0 == 0.0f ? 0 : -1));
        SparseArray sparseArray = this.f8805v0;
        if (i12 == 0 && !y9Var.f9438j0 && y9Var.f9445n0.F0 == 1 && motionEvent.getAction() == 2 && z11 && (((((Float) sparseArray.get(motionEvent.getPointerId(0), Float.valueOf(0.0f))).floatValue() - motionEvent.getX(0)) != 0.0f && (((i11 = (o9Var = y9Var.f9445n0).I0) == 0 && o9Var.K0 == 0.0f && floatValue < 0.0f) || (i11 == o9Var.getAdapter().b() - 1 && o9Var.K0 == 0.0f && i10 > 0))) || y9Var.X != 0.0f)) {
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
        if (currentPeerView != null && y9Var.f9427e0 == 0.0f && !y9Var.f9438j0 && !y9Var.L0 && !y9Var.I0 && y9Var.f9445n0.F0 != 1) {
            AndroidUtilities.getViewPositionInParent(currentPeerView.R0, this, fArr);
            motionEvent.offsetLocation(-fArr[0], -fArr[1]);
            q4 currentPeerView2 = y9Var.f9445n0.getCurrentPeerView();
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
                if (y9Var.f9427e0 != 0.0f && !y9Var.f9433g1 && y9Var.f9449p0 < AndroidUtilities.dp(20.0f)) {
                    if (y9Var.f9465w.f8429f > 0.5f) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    y9Var.n(z13);
                }
                q4 t10 = y9Var.t();
                if (t10 != null) {
                    t10.f9050z0.f8931w0 = false;
                }
            }
            if (z10 && !y9Var.f9417a0) {
                y9Var.m();
            }
            if (!dispatchTouchEvent && (!y9.f9413x1 || !y9Var.f9451q0)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f8807x0.f9471y0) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        y9 y9Var = this.f8807x0;
        if (y9Var.f9419b && !y9Var.f9422c) {
            org.telegram.ui.ActionBar.r2 r2Var = this.f8806w0;
            AndroidUtilities.requestAdjustResize(r2Var.getParentActivity(), r2Var.getClassGuid());
        }
        qc.a(this, new l9(this));
        NotificationCenter.getInstance(y9Var.h).addObserver(y9Var, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(y9Var.h).addObserver(y9Var, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(y9Var.h).addObserver(y9Var, NotificationCenter.articleClosed);
        NotificationCenter.getInstance(y9Var.h).addObserver(y9Var, NotificationCenter.openArticle);
        NotificationCenter.getInstance(y9Var.h).addObserver(y9Var, NotificationCenter.storyDeleted);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qc.h(this);
        y9 y9Var = this.f8807x0;
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
        y9 y9Var = this.f8807x0;
        ((FrameLayout.LayoutParams) y9Var.f9426d1.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight - AndroidUtilities.dp(2.0f);
        y9Var.f9426d1.getLayoutParams().height = AndroidUtilities.dp(2.0f);
        super.onMeasure(i10, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        m2 m2Var;
        int action = motionEvent.getAction();
        y9 y9Var = this.f8807x0;
        if (action == 1 || motionEvent.getAction() == 3) {
            y9Var.f9438j0 = false;
            y9Var.K(false);
            if (y9Var.V >= 1.0f) {
                y9Var.q(true);
            } else if (!y9Var.H0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(y9Var.W, 0.0f);
                y9Var.G = ofFloat;
                ofFloat.addUpdateListener(new j9(this, 1));
                y9Var.G.addListener(new k9(this, 1));
                y9Var.G.setDuration(150L);
                y9Var.G.setInterpolator(ds.f27586f);
                y9Var.G.start();
            }
            q4 t10 = y9Var.t();
            if (t10 != null && (m2Var = t10.A0) != null) {
                m2Var.setAllowTouches(true);
            }
        }
        if (!y9Var.f9438j0 && !y9Var.f9468x && y9Var.Z == 0.0f && ((y9Var.f9427e0 == 0.0f || (!y9Var.f9430f0 && !y9Var.f9432g0)) && !y9Var.f9439j1)) {
            return false;
        }
        y9Var.f9436i0.onTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        this.f8807x0.f9430f0 = false;
    }
}
