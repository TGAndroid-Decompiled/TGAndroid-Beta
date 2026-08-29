package lh;

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
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.mc;
public final class w8 extends hv0 {
    public final RectF A0;
    public final RectF B0;
    public final SparseArray C0;
    public final org.telegram.ui.ActionBar.o2 D0;
    public final i9 E0;
    public float f16374s0;
    public float f16375t0;
    public float f16376u0;
    public final float[] f16377v0;
    public final Path f16378w0;
    public final RectF f16379x0;
    public final RectF f16380y0;
    public final RectF f16381z0;

    public w8(i9 i9Var, Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        super(context, null);
        this.E0 = i9Var;
        this.D0 = o2Var;
        this.f16377v0 = new float[8];
        this.f16378w0 = new Path();
        this.f16379x0 = new RectF();
        this.f16380y0 = new RectF();
        this.f16381z0 = new RectF();
        this.A0 = new RectF();
        this.B0 = new RectF();
        this.C0 = new SparseArray();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: lh.w8.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        i9 i9Var = this.E0;
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
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        float floatValue;
        int i10;
        y8 y8Var;
        int i11;
        fk0 fk0Var;
        i9 i9Var = this.E0;
        float[] fArr = i9Var.f15767k0;
        d4 currentPeerView = i9Var.f15765j0.getCurrentPeerView();
        if (currentPeerView != null) {
            l3 l3Var = currentPeerView.G0;
            if (l3Var.S.y()) {
                float x4 = currentPeerView.getX();
                float y8 = ((View) currentPeerView.getParent()).getY() + currentPeerView.getY();
                motionEvent.offsetLocation(-x4, -y8);
                if (!l3Var.S.o(currentPeerView.getContext()).onTouchEvent(motionEvent)) {
                    motionEvent.offsetLocation(x4, y8);
                }
                return true;
            }
        }
        float f9 = 0.0f;
        if (i9Var.l1 && currentPeerView != null && (fk0Var = currentPeerView.f15506n3) != null) {
            float f10 = 0.0f;
            for (View view = currentPeerView; view != null && (view.getParent() instanceof View); view = (View) view.getParent()) {
                f9 += view.getX();
                f10 += view.getY();
            }
            if (currentPeerView.f15506n3.getReactionsWindow() != null && currentPeerView.f15506n3.getReactionsWindow().f13683c != null) {
                motionEvent.offsetLocation(-f9, (-f10) - currentPeerView.f15506n3.getReactionsWindow().f13683c.getTranslationY());
                currentPeerView.f15506n3.getReactionsWindow().f13683c.dispatchTouchEvent(motionEvent);
                return true;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            fk0Var.getHitRect(rect);
            rect.offset((int) f9, (int) f10);
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
            i9Var.f15757f0 = false;
            AndroidUtilities.cancelRunOnUIThread(i9Var.X0);
            float f11 = i9Var.T;
            if (f11 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
                i9Var.C = ofFloat;
                ofFloat.addUpdateListener(new t8(this, 0));
                i9Var.C.addListener(new u8(this, 0));
                i9Var.C.setDuration(250L);
                i9Var.C.setInterpolator(jr.f29800f);
                i9Var.C.start();
            }
            if (i9Var.R >= 0.3f) {
                i9Var.q(true);
            }
            i9Var.K(false);
            i9Var.L(false);
            z10 = true;
        }
        if (motionEvent.getAction() == 0) {
            i9Var.W = false;
            if (currentPeerView != null) {
                bh.d dVar = currentPeerView.f15527u0;
                n8 n8Var = currentPeerView.f15543y0;
                h3 h3Var = currentPeerView.Y0;
                nh.t3 t3Var = currentPeerView.B0;
                if (t3Var != null && t3Var.R && n8Var != null) {
                    if (!t3Var.f18603n0.contains(motionEvent.getX() - (currentPeerView.B0.getX() + (h3Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.B0.getY() + (h3Var.getY() + currentPeerView.getY()))) && !currentPeerView.H0(motionEvent, n8Var)) {
                        currentPeerView.B0.e(true);
                    }
                }
                nh.t3 t3Var2 = currentPeerView.C0;
                if (t3Var2 != null && t3Var2.R && dVar != null && !t3Var2.f18603n0.contains(motionEvent.getX() - (currentPeerView.C0.getX() + (h3Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.C0.getY() + (h3Var.getY() + currentPeerView.getY()))) && !currentPeerView.H0(motionEvent, dVar)) {
                    currentPeerView.C0.e(true);
                }
            }
            i9Var.f15765j0.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        }
        if (!i9Var.f15791x && !i9Var.D0 && !i9Var.E0) {
            z11 = true;
        } else {
            z11 = false;
        }
        float f12 = i9Var.f15743a0;
        SparseArray sparseArray = this.C0;
        if (f12 == 0.0f && !i9Var.f15757f0 && i9Var.f15765j0.B0 == 1 && motionEvent.getAction() == 2 && z11 && (((((Float) sparseArray.get(motionEvent.getPointerId(0), Float.valueOf(0.0f))).floatValue() - motionEvent.getX(0)) != 0.0f && (((i11 = (y8Var = i9Var.f15765j0).E0) == 0 && y8Var.G0 == 0.0f && floatValue < 0.0f) || (i11 == y8Var.getAdapter().b() - 1 && y8Var.G0 == 0.0f && i10 > 0))) || i9Var.T != 0.0f)) {
            float f13 = i9Var.T;
            if (f13 == 0.0f) {
                i9Var.U = -floatValue;
            }
            if ((floatValue < 0.0f && i9Var.U > 0.0f) || (i10 > 0 && i9Var.U < 0.0f)) {
                floatValue *= 0.2f;
            }
            i9Var.T = f13 - floatValue;
            i9.k(i9Var);
            float f14 = i9Var.T;
            if ((f14 > 0.0f && i9Var.U < 0.0f) || (f14 < 0.0f && i9Var.U > 0.0f)) {
                i9Var.T = 0.0f;
            }
            z12 = true;
        } else {
            z12 = false;
        }
        if (currentPeerView != null && i9Var.f15743a0 == 0.0f && !i9Var.f15757f0 && !i9Var.H0 && !i9Var.E0 && i9Var.f15765j0.B0 != 1) {
            AndroidUtilities.getViewPositionInParent(currentPeerView.Y0, this, fArr);
            motionEvent.offsetLocation(-fArr[0], -fArr[1]);
            d4 currentPeerView2 = i9Var.f15765j0.getCurrentPeerView();
            currentPeerView2.T2.a(motionEvent, currentPeerView2.Y0, null, null, 0);
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
                if (i9Var.f15743a0 != 0.0f && !i9Var.f15750c1 && i9Var.f15769l0 < AndroidUtilities.dp(20.0f)) {
                    if (i9Var.f15789w.f15886f > 0.5f) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    i9Var.n(z13);
                }
                d4 t10 = i9Var.t();
                if (t10 != null) {
                    t10.G0.f15357s0 = false;
                }
            }
            if (z10 && !i9Var.W) {
                i9Var.m();
            }
            if (!dispatchTouchEvent && (!i9.f15735t1 || !i9Var.m0)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.E0.f15787u0) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        i9 i9Var = this.E0;
        if (i9Var.f15745b && !i9Var.f15748c) {
            org.telegram.ui.ActionBar.o2 o2Var = this.D0;
            AndroidUtilities.requestAdjustResize(o2Var.getParentActivity(), o2Var.getClassGuid());
        }
        mc.a(this, new v8(this));
        NotificationCenter.getInstance(i9Var.h).addObserver(i9Var, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(i9Var.h).addObserver(i9Var, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i9Var.h).addObserver(i9Var, NotificationCenter.articleClosed);
        NotificationCenter.getInstance(i9Var.h).addObserver(i9Var, NotificationCenter.openArticle);
        NotificationCenter.getInstance(i9Var.h).addObserver(i9Var, NotificationCenter.storyDeleted);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mc.h(this);
        i9 i9Var = this.E0;
        NotificationCenter.getInstance(i9Var.h).removeObserver(i9Var, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(i9Var.h).removeObserver(i9Var, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i9Var.h).removeObserver(i9Var, NotificationCenter.articleClosed);
        NotificationCenter.getInstance(i9Var.h).removeObserver(i9Var, NotificationCenter.openArticle);
        NotificationCenter.getInstance(i9Var.h).removeObserver(i9Var, NotificationCenter.storyDeleted);
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: lh.w8.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        i9 i9Var = this.E0;
        ((FrameLayout.LayoutParams) i9Var.Z0.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight - AndroidUtilities.dp(2.0f);
        i9Var.Z0.getLayoutParams().height = AndroidUtilities.dp(2.0f);
        super.onMeasure(i10, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f2 f2Var;
        int action = motionEvent.getAction();
        i9 i9Var = this.E0;
        if (action == 1 || motionEvent.getAction() == 3) {
            i9Var.f15757f0 = false;
            i9Var.K(false);
            if (i9Var.R >= 1.0f) {
                i9Var.q(true);
            } else if (!i9Var.D0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i9Var.S, 0.0f);
                i9Var.C = ofFloat;
                ofFloat.addUpdateListener(new t8(this, 1));
                i9Var.C.addListener(new u8(this, 1));
                i9Var.C.setDuration(150L);
                i9Var.C.setInterpolator(jr.f29800f);
                i9Var.C.start();
            }
            d4 t10 = i9Var.t();
            if (t10 != null && (f2Var = t10.H0) != null) {
                f2Var.setAllowTouches(true);
            }
        }
        if (!i9Var.f15757f0 && !i9Var.f15791x && i9Var.V == 0.0f && ((i9Var.f15743a0 == 0.0f || (!i9Var.f15746b0 && !i9Var.f15749c0)) && !i9Var.f15758f1)) {
            return false;
        }
        i9Var.f15754e0.onTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        this.E0.f15746b0 = false;
    }
}
