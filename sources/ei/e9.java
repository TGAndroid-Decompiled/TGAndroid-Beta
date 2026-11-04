package ei;

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
import org.telegram.messenger.hs;
import org.telegram.ui.Components.li0;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.xq;
public final class e9 extends qt0 {
    public float f10238g0;
    public float f10239h0;
    public float f10240i0;
    public final float[] f10241j0;
    public final Path f10242k0;
    public final RectF f10243l0;
    public final RectF m0;
    public final RectF f10244n0;
    public final RectF f10245o0;
    public final RectF f10246p0;
    public final SparseArray f10247q0;
    public final org.telegram.ui.ActionBar.d2 f10248r0;
    public final r9 f10249s0;

    public e9(r9 r9Var, Context context, org.telegram.ui.ActionBar.d2 d2Var) {
        super(context, null);
        this.f10249s0 = r9Var;
        this.f10248r0 = d2Var;
        this.f10241j0 = new float[8];
        this.f10242k0 = new Path();
        this.f10243l0 = new RectF();
        this.m0 = new RectF();
        this.f10244n0 = new RectF();
        this.f10245o0 = new RectF();
        this.f10246p0 = new RectF();
        this.f10247q0 = new SparseArray();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: ei.e9.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        r9 r9Var = this.f10249s0;
        if (keyCode != 24 && keyEvent.getKeyCode() != 25) {
            if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                r9Var.p();
                return true;
            }
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        r9Var.F(keyEvent);
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        float floatValue;
        int i3;
        g9 g9Var;
        int i10;
        li0 li0Var;
        r9 r9Var = this.f10249s0;
        float[] fArr = r9Var.f10941p0;
        j4 currentPeerView = r9Var.f10939o0.getCurrentPeerView();
        if (currentPeerView != null) {
            q3 q3Var = currentPeerView.f10510u0;
            if (q3Var.f10373a0.x()) {
                float x10 = currentPeerView.getX();
                float y9 = ((View) currentPeerView.getParent()).getY() + currentPeerView.getY();
                motionEvent.offsetLocation(-x10, -y9);
                if (!q3Var.f10373a0.n(currentPeerView.getContext()).onTouchEvent(motionEvent)) {
                    motionEvent.offsetLocation(x10, y9);
                }
                return true;
            }
        }
        float f10 = 0.0f;
        if (r9Var.f10944q1 && currentPeerView != null && (li0Var = currentPeerView.f10446b3) != null) {
            float f11 = 0.0f;
            for (View view = currentPeerView; view != null && (view.getParent() instanceof View); view = (View) view.getParent()) {
                f10 += view.getX();
                f11 += view.getY();
            }
            if (currentPeerView.f10446b3.getReactionsWindow() != null && currentPeerView.f10446b3.getReactionsWindow().f8933c != null) {
                motionEvent.offsetLocation(-f10, (-f11) - currentPeerView.f10446b3.getReactionsWindow().f8933c.getTranslationY());
                currentPeerView.f10446b3.getReactionsWindow().f8933c.dispatchTouchEvent(motionEvent);
                return true;
            }
            Rect rect = org.telegram.messenger.g0.Q;
            li0Var.getHitRect(rect);
            rect.offset((int) f10, (int) f11);
            if (motionEvent.getAction() == 0 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                currentPeerView.Z0(false);
                return true;
            }
            motionEvent.offsetLocation(-rect.left, -rect.top);
            li0Var.dispatchTouchEvent(motionEvent);
            return true;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            z10 = false;
        } else {
            r9Var.f10933k0 = false;
            org.telegram.messenger.g0.r(r9Var.f10916c1);
            float f12 = r9Var.Y;
            if (f12 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, 0.0f);
                r9Var.H = ofFloat;
                ofFloat.addUpdateListener(new b9(this, 0));
                r9Var.H.addListener(new c9(this, 0));
                r9Var.H.setDuration(250L);
                r9Var.H.setInterpolator(xq.f40452f);
                r9Var.H.start();
            }
            if (r9Var.W >= 0.3f) {
                r9Var.D(true);
            }
            r9Var.Y(false);
            r9Var.Z(false);
            z10 = true;
        }
        if (motionEvent.getAction() == 0) {
            r9Var.f10912b0 = false;
            if (currentPeerView != null) {
                ai.d2 d2Var = currentPeerView.f10466i0;
                u8 u8Var = currentPeerView.m0;
                m3 m3Var = currentPeerView.M0;
                gi.l3 l3Var = currentPeerView.f10490p0;
                if (l3Var != null && l3Var.W && u8Var != null) {
                    if (!l3Var.D0.contains(motionEvent.getX() - (currentPeerView.f10490p0.getX() + (m3Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.f10490p0.getY() + (m3Var.getY() + currentPeerView.getY()))) && !currentPeerView.F0(u8Var, motionEvent)) {
                        currentPeerView.f10490p0.f(true);
                    }
                }
                gi.l3 l3Var2 = currentPeerView.f10494q0;
                if (l3Var2 != null && l3Var2.W && d2Var != null && !l3Var2.D0.contains(motionEvent.getX() - (currentPeerView.f10494q0.getX() + (m3Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.f10494q0.getY() + (m3Var.getY() + currentPeerView.getY()))) && !currentPeerView.F0(d2Var, motionEvent)) {
                    currentPeerView.f10494q0.f(true);
                }
            }
            r9Var.f10939o0.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        }
        if (!r9Var.f10963y && !r9Var.I0 && !r9Var.J0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i11 = (r9Var.f10923f0 > 0.0f ? 1 : (r9Var.f10923f0 == 0.0f ? 0 : -1));
        SparseArray sparseArray = this.f10247q0;
        if (i11 == 0 && !r9Var.f10933k0 && r9Var.f10939o0.G0 == 1 && motionEvent.getAction() == 2 && z11 && (((((Float) sparseArray.get(motionEvent.getPointerId(0), Float.valueOf(0.0f))).floatValue() - motionEvent.getX(0)) != 0.0f && (((i10 = (g9Var = r9Var.f10939o0).J0) == 0 && g9Var.L0 == 0.0f && floatValue < 0.0f) || (i10 == g9Var.getAdapter().b() - 1 && g9Var.L0 == 0.0f && i3 > 0))) || r9Var.Y != 0.0f)) {
            float f13 = r9Var.Y;
            if (f13 == 0.0f) {
                r9Var.Z = -floatValue;
            }
            if ((floatValue < 0.0f && r9Var.Z > 0.0f) || (i3 > 0 && r9Var.Z < 0.0f)) {
                floatValue *= 0.2f;
            }
            r9Var.Y = f13 - floatValue;
            r9.w(r9Var);
            float f14 = r9Var.Y;
            if ((f14 > 0.0f && r9Var.Z < 0.0f) || (f14 < 0.0f && r9Var.Z > 0.0f)) {
                r9Var.Y = 0.0f;
            }
            z12 = true;
        } else {
            z12 = false;
        }
        if (currentPeerView != null && r9Var.f10923f0 == 0.0f && !r9Var.f10933k0 && !r9Var.M0 && !r9Var.J0 && r9Var.f10939o0.G0 != 1) {
            org.telegram.messenger.g0.r1(currentPeerView.M0, this, fArr);
            motionEvent.offsetLocation(-fArr[0], -fArr[1]);
            j4 currentPeerView2 = r9Var.f10939o0.getCurrentPeerView();
            currentPeerView2.H2.a(motionEvent, currentPeerView2.M0, null, null, 0);
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
                if (r9Var.f10923f0 != 0.0f && !r9Var.f10928h1 && r9Var.f10943q0 < org.telegram.messenger.g0.L(20.0f)) {
                    if (r9Var.f10960x.f11001f > 0.5f) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    r9Var.A(z13);
                }
                j4 H = r9Var.H();
                if (H != null) {
                    H.f10510u0.f10395x0 = false;
                }
            }
            if (z10 && !r9Var.f10912b0) {
                r9Var.z();
            }
            if (!dispatchTouchEvent && (!r9.f10906y1 || !r9Var.f10946r0)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f10249s0.f10965z0) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        r9 r9Var = this.f10249s0;
        if (r9Var.f10911b && !r9Var.f10914c) {
            org.telegram.ui.ActionBar.d2 d2Var = this.f10248r0;
            org.telegram.messenger.g0.a3(d2Var.getParentActivity(), d2Var.getClassGuid());
        }
        setTag(2131296351, new d9(this));
        hs.f(r9Var.h).c(r9Var, hs.f23338x5);
        hs.f(r9Var.h).c(r9Var, hs.f23324v5);
        hs.f(r9Var.h).c(r9Var, hs.f23214d1);
        hs.f(r9Var.h).c(r9Var, hs.f23209c1);
        hs.f(r9Var.h).c(r9Var, hs.f23331w5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(2131296351, null);
        r9 r9Var = this.f10249s0;
        hs.f(r9Var.h).n(r9Var, hs.f23338x5);
        hs.f(r9Var.h).n(r9Var, hs.f23324v5);
        hs.f(r9Var.h).n(r9Var, hs.f23214d1);
        hs.f(r9Var.h).n(r9Var, hs.f23209c1);
        hs.f(r9Var.h).n(r9Var, hs.f23331w5);
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: ei.e9.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        r9 r9Var = this.f10249s0;
        ((FrameLayout.LayoutParams) r9Var.f10921e1.getLayoutParams()).topMargin = org.telegram.messenger.g0.f22602m - org.telegram.messenger.g0.L(2.0f);
        r9Var.f10921e1.getLayoutParams().height = org.telegram.messenger.g0.L(2.0f);
        super.onMeasure(i3, i10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        k2 k2Var;
        int action = motionEvent.getAction();
        r9 r9Var = this.f10249s0;
        if (action == 1 || motionEvent.getAction() == 3) {
            r9Var.f10933k0 = false;
            r9Var.Y(false);
            if (r9Var.W >= 1.0f) {
                r9Var.D(true);
            } else if (!r9Var.I0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(r9Var.X, 0.0f);
                r9Var.H = ofFloat;
                ofFloat.addUpdateListener(new b9(this, 1));
                r9Var.H.addListener(new c9(this, 1));
                r9Var.H.setDuration(150L);
                r9Var.H.setInterpolator(xq.f40452f);
                r9Var.H.start();
            }
            j4 H = r9Var.H();
            if (H != null && (k2Var = H.f10514v0) != null) {
                k2Var.setAllowTouches(true);
            }
        }
        if (!r9Var.f10933k0 && !r9Var.f10963y && r9Var.f10909a0 == 0.0f && ((r9Var.f10923f0 == 0.0f || (!r9Var.f10925g0 && !r9Var.f10927h0)) && !r9Var.k1)) {
            return false;
        }
        r9Var.f10931j0.onTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        this.f10249s0.f10925g0 = false;
    }
}
