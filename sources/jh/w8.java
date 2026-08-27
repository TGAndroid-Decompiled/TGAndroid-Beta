package jh;

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
import hh.y9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.Components.zu0;

public final class w8 extends zu0 {
    public final RectF A0;
    public final RectF B0;
    public final SparseArray C0;
    public final org.telegram.ui.ActionBar.n2 D0;
    public final i9 E0;

    public float f14104s0;

    public float f14105t0;

    public float f14106u0;

    public final float[] f14107v0;

    public final Path f14108w0;

    public final RectF f14109x0;

    public final RectF f14110y0;

    public final RectF f14111z0;

    public w8(i9 i9Var, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context, null);
        this.E0 = i9Var;
        this.D0 = n2Var;
        this.f14107v0 = new float[8];
        this.f14108w0 = new Path();
        this.f14109x0 = new RectF();
        this.f14110y0 = new RectF();
        this.f14111z0 = new RectF();
        this.A0 = new RectF();
        this.B0 = new RectF();
        this.C0 = new SparseArray();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: jh.w8.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        i9 i9Var = this.E0;
        if (keyCode == 24 || keyEvent.getKeyCode() == 25) {
            i9Var.r(keyEvent);
            return true;
        }
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        i9Var.onAttachedBackPressed();
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        float f10;
        boolean z10;
        boolean z11;
        float f11;
        SparseArray sparseArray;
        boolean z12;
        boolean zDispatchTouchEvent;
        e4 e4VarT;
        boolean z13;
        y8 y8Var;
        int i11;
        lh.w3 w3Var;
        lh.w3 w3Var2;
        wj0 wj0Var;
        i9 i9Var = this.E0;
        float[] fArr = i9Var.f13489k0;
        e4 currentPeerView = i9Var.f13487j0.getCurrentPeerView();
        if (currentPeerView != null) {
            n3 n3Var = currentPeerView.G0;
            if (n3Var.S.y()) {
                float x8 = currentPeerView.getX();
                float y10 = ((View) currentPeerView.getParent()).getY() + currentPeerView.getY();
                motionEvent.offsetLocation(-x8, -y10);
                if (!n3Var.S.o(currentPeerView.getContext()).onTouchEvent(motionEvent)) {
                    motionEvent.offsetLocation(x8, y10);
                    float x10 = 0.0f;
                    i10 = 0;
                    if (!i9Var.l1 && currentPeerView != null && (wj0Var = currentPeerView.f13257n3) != null) {
                        float y11 = 0.0f;
                        for (View view = currentPeerView; view != null && (view.getParent() instanceof View); view = (View) view.getParent()) {
                            x10 += view.getX();
                            y11 += view.getY();
                        }
                        if (currentPeerView.f13257n3.getReactionsWindow() != null && currentPeerView.f13257n3.getReactionsWindow().f11270c != null) {
                            motionEvent.offsetLocation(-x10, (-y11) - currentPeerView.f13257n3.getReactionsWindow().f11270c.getTranslationY());
                            currentPeerView.f13257n3.getReactionsWindow().f11270c.dispatchTouchEvent(motionEvent);
                            return true;
                        }
                        Rect rect = AndroidUtilities.rectTmp2;
                        wj0Var.getHitRect(rect);
                        rect.offset((int) x10, (int) y11);
                        if (motionEvent.getAction() == 0 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            currentPeerView.b1(false);
                            return true;
                        }
                        motionEvent.offsetLocation(-rect.left, -rect.top);
                        wj0Var.dispatchTouchEvent(motionEvent);
                        return true;
                    }
                    if (motionEvent.getAction() != 1 || motionEvent.getAction() == 3) {
                        i9Var.f13479f0 = false;
                        AndroidUtilities.cancelRunOnUIThread(i9Var.X0);
                        f10 = i9Var.T;
                        if (f10 != 0.0f) {
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, 0.0f);
                            i9Var.C = valueAnimatorOfFloat;
                            valueAnimatorOfFloat.addUpdateListener(new t8(this, i10));
                            i9Var.C.addListener(new u8(this, i10));
                            i9Var.C.setDuration(250L);
                            i9Var.C.setInterpolator(er.f28122f);
                            i9Var.C.start();
                        }
                        if (i9Var.R >= 0.3f) {
                            i9Var.q(true);
                        }
                        i9Var.K(false);
                        i9Var.L(false);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (motionEvent.getAction() == 0) {
                        i9Var.W = false;
                        if (currentPeerView != null) {
                            ag.d dVar = currentPeerView.f13278u0;
                            n8 n8Var = currentPeerView.f13294y0;
                            j3 j3Var = currentPeerView.Y0;
                            w3Var = currentPeerView.B0;
                            if (w3Var != null && w3Var.R && n8Var != null && !w3Var.f16990n0.contains(motionEvent.getX() - (currentPeerView.B0.getX() + (j3Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.B0.getY() + (j3Var.getY() + currentPeerView.getY()))) && !currentPeerView.H0(motionEvent, n8Var)) {
                                currentPeerView.B0.e(true);
                            }
                            w3Var2 = currentPeerView.C0;
                            if (w3Var2 != null && w3Var2.R && dVar != null && !w3Var2.f16990n0.contains(motionEvent.getX() - (currentPeerView.C0.getX() + (j3Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.C0.getY() + (j3Var.getY() + currentPeerView.getY()))) && !currentPeerView.H0(motionEvent, dVar)) {
                                currentPeerView.C0.e(true);
                            }
                        }
                        i9Var.f13487j0.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    }
                    if (!i9Var.f13513x || i9Var.D0 || i9Var.E0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    f11 = i9Var.f13465a0;
                    sparseArray = this.C0;
                    if (f11 != 0.0f && !i9Var.f13479f0 && i9Var.f13487j0.B0 == 1 && motionEvent.getAction() == 2 && z11) {
                        float fFloatValue = ((Float) sparseArray.get(motionEvent.getPointerId(0), Float.valueOf(0.0f))).floatValue() - motionEvent.getX(0);
                        if ((fFloatValue == 0.0f || !(((i11 = (y8Var = i9Var.f13487j0).E0) == 0 && y8Var.G0 == 0.0f && fFloatValue < 0.0f) || (i11 == y8Var.getAdapter().b() - 1 && y8Var.G0 == 0.0f && fFloatValue > 0.0f))) && i9Var.T == 0.0f) {
                            z12 = false;
                        } else {
                            float f12 = i9Var.T;
                            if (f12 == 0.0f) {
                                i9Var.U = -fFloatValue;
                            }
                            if ((fFloatValue < 0.0f && i9Var.U > 0.0f) || (fFloatValue > 0.0f && i9Var.U < 0.0f)) {
                                fFloatValue *= 0.2f;
                            }
                            i9Var.T = f12 - fFloatValue;
                            i9.k(i9Var);
                            float f13 = i9Var.T;
                            if ((f13 > 0.0f && i9Var.U < 0.0f) || (f13 < 0.0f && i9Var.U > 0.0f)) {
                                i9Var.T = 0.0f;
                            }
                            z12 = true;
                        }
                    } else {
                        z12 = false;
                    }
                    if (currentPeerView != null && i9Var.f13465a0 == 0.0f && !i9Var.f13479f0 && !i9Var.H0 && !i9Var.E0 && i9Var.f13487j0.B0 != 1) {
                        AndroidUtilities.getViewPositionInParent(currentPeerView.Y0, this, fArr);
                        motionEvent.offsetLocation(-fArr[0], -fArr[1]);
                        e4 currentPeerView2 = i9Var.f13487j0.getCurrentPeerView();
                        currentPeerView2.T2.a(motionEvent, currentPeerView2.Y0, null, null, 0);
                        motionEvent.offsetLocation(fArr[0], fArr[1]);
                    }
                    if (motionEvent.getAction() != 1 || motionEvent.getAction() == 3) {
                        sparseArray.clear();
                    } else {
                        for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                            sparseArray.put(motionEvent.getPointerId(i12), Float.valueOf(motionEvent.getX(i12)));
                        }
                    }
                    if (!z12) {
                        zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                        if (motionEvent.getAction() != 1 || motionEvent.getAction() == 3) {
                            if (i9Var.f13465a0 != 0.0f && !i9Var.f13472c1 && i9Var.f13491l0 < AndroidUtilities.dp(20.0f)) {
                                if (i9Var.f13511w.f13581f > 0.5f) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                i9Var.n(z13);
                            }
                            e4VarT = i9Var.t();
                            if (e4VarT != null) {
                                e4VarT.G0.f13063s0 = false;
                            }
                        }
                        if (z10 && !i9Var.W) {
                            i9Var.m();
                        }
                        if (zDispatchTouchEvent && (!i9.f13457t1 || !i9Var.m0)) {
                            return false;
                        }
                    }
                }
            } else {
                float x11 = 0.0f;
                i10 = 0;
                if (!i9Var.l1) {
                }
                if (motionEvent.getAction() != 1) {
                    i9Var.f13479f0 = false;
                    AndroidUtilities.cancelRunOnUIThread(i9Var.X0);
                    f10 = i9Var.T;
                    if (f10 != 0.0f) {
                        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(f10, 0.0f);
                        i9Var.C = valueAnimatorOfFloat2;
                        valueAnimatorOfFloat2.addUpdateListener(new t8(this, i10));
                        i9Var.C.addListener(new u8(this, i10));
                        i9Var.C.setDuration(250L);
                        i9Var.C.setInterpolator(er.f28122f);
                        i9Var.C.start();
                    }
                    if (i9Var.R >= 0.3f) {
                        i9Var.q(true);
                    }
                    i9Var.K(false);
                    i9Var.L(false);
                    z10 = true;
                } else {
                    i9Var.f13479f0 = false;
                    AndroidUtilities.cancelRunOnUIThread(i9Var.X0);
                    f10 = i9Var.T;
                    if (f10 != 0.0f) {
                        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(f10, 0.0f);
                        i9Var.C = valueAnimatorOfFloat3;
                        valueAnimatorOfFloat3.addUpdateListener(new t8(this, i10));
                        i9Var.C.addListener(new u8(this, i10));
                        i9Var.C.setDuration(250L);
                        i9Var.C.setInterpolator(er.f28122f);
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
                        ag.d dVar2 = currentPeerView.f13278u0;
                        n8 n8Var2 = currentPeerView.f13294y0;
                        j3 j3Var2 = currentPeerView.Y0;
                        w3Var = currentPeerView.B0;
                        if (w3Var != null) {
                            currentPeerView.B0.e(true);
                        }
                        w3Var2 = currentPeerView.C0;
                        if (w3Var2 != null) {
                            currentPeerView.C0.e(true);
                        }
                    }
                    i9Var.f13487j0.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                }
                if (i9Var.f13513x) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                f11 = i9Var.f13465a0;
                sparseArray = this.C0;
                if (f11 != 0.0f) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                if (currentPeerView != null) {
                    AndroidUtilities.getViewPositionInParent(currentPeerView.Y0, this, fArr);
                    motionEvent.offsetLocation(-fArr[0], -fArr[1]);
                    e4 currentPeerView3 = i9Var.f13487j0.getCurrentPeerView();
                    currentPeerView3.T2.a(motionEvent, currentPeerView3.Y0, null, null, 0);
                    motionEvent.offsetLocation(fArr[0], fArr[1]);
                }
                if (motionEvent.getAction() != 1) {
                    sparseArray.clear();
                } else {
                    sparseArray.clear();
                }
                if (!z12) {
                    zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                    if (motionEvent.getAction() != 1) {
                        if (i9Var.f13465a0 != 0.0f) {
                            if (i9Var.f13511w.f13581f > 0.5f) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            i9Var.n(z13);
                        }
                        e4VarT = i9Var.t();
                        if (e4VarT != null) {
                            e4VarT.G0.f13063s0 = false;
                        }
                    } else {
                        if (i9Var.f13465a0 != 0.0f) {
                            if (i9Var.f13511w.f13581f > 0.5f) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            i9Var.n(z13);
                        }
                        e4VarT = i9Var.t();
                        if (e4VarT != null) {
                            e4VarT.G0.f13063s0 = false;
                        }
                    }
                    if (z10) {
                        i9Var.m();
                    }
                    if (zDispatchTouchEvent) {
                    }
                }
            }
        } else {
            float x12 = 0.0f;
            i10 = 0;
            if (!i9Var.l1) {
            }
            if (motionEvent.getAction() != 1) {
                i9Var.f13479f0 = false;
                AndroidUtilities.cancelRunOnUIThread(i9Var.X0);
                f10 = i9Var.T;
                if (f10 != 0.0f) {
                    ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(f10, 0.0f);
                    i9Var.C = valueAnimatorOfFloat4;
                    valueAnimatorOfFloat4.addUpdateListener(new t8(this, i10));
                    i9Var.C.addListener(new u8(this, i10));
                    i9Var.C.setDuration(250L);
                    i9Var.C.setInterpolator(er.f28122f);
                    i9Var.C.start();
                }
                if (i9Var.R >= 0.3f) {
                    i9Var.q(true);
                }
                i9Var.K(false);
                i9Var.L(false);
                z10 = true;
            } else {
                i9Var.f13479f0 = false;
                AndroidUtilities.cancelRunOnUIThread(i9Var.X0);
                f10 = i9Var.T;
                if (f10 != 0.0f) {
                    ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(f10, 0.0f);
                    i9Var.C = valueAnimatorOfFloat5;
                    valueAnimatorOfFloat5.addUpdateListener(new t8(this, i10));
                    i9Var.C.addListener(new u8(this, i10));
                    i9Var.C.setDuration(250L);
                    i9Var.C.setInterpolator(er.f28122f);
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
                    ag.d dVar3 = currentPeerView.f13278u0;
                    n8 n8Var3 = currentPeerView.f13294y0;
                    j3 j3Var3 = currentPeerView.Y0;
                    w3Var = currentPeerView.B0;
                    if (w3Var != null) {
                        currentPeerView.B0.e(true);
                    }
                    w3Var2 = currentPeerView.C0;
                    if (w3Var2 != null) {
                        currentPeerView.C0.e(true);
                    }
                }
                i9Var.f13487j0.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
            }
            if (i9Var.f13513x) {
                z11 = false;
            } else {
                z11 = false;
            }
            f11 = i9Var.f13465a0;
            sparseArray = this.C0;
            if (f11 != 0.0f) {
                z12 = false;
            } else {
                z12 = false;
            }
            if (currentPeerView != null) {
                AndroidUtilities.getViewPositionInParent(currentPeerView.Y0, this, fArr);
                motionEvent.offsetLocation(-fArr[0], -fArr[1]);
                e4 currentPeerView4 = i9Var.f13487j0.getCurrentPeerView();
                currentPeerView4.T2.a(motionEvent, currentPeerView4.Y0, null, null, 0);
                motionEvent.offsetLocation(fArr[0], fArr[1]);
            }
            if (motionEvent.getAction() != 1) {
                sparseArray.clear();
            } else {
                sparseArray.clear();
            }
            if (!z12) {
                zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() != 1) {
                    if (i9Var.f13465a0 != 0.0f) {
                        if (i9Var.f13511w.f13581f > 0.5f) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        i9Var.n(z13);
                    }
                    e4VarT = i9Var.t();
                    if (e4VarT != null) {
                        e4VarT.G0.f13063s0 = false;
                    }
                } else {
                    if (i9Var.f13465a0 != 0.0f) {
                        if (i9Var.f13511w.f13581f > 0.5f) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        i9Var.n(z13);
                    }
                    e4VarT = i9Var.t();
                    if (e4VarT != null) {
                        e4VarT.G0.f13063s0 = false;
                    }
                }
                if (z10) {
                    i9Var.m();
                }
                if (zDispatchTouchEvent) {
                }
            }
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.E0.f13509u0) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        i9 i9Var = this.E0;
        if (i9Var.f13467b && !i9Var.f13470c) {
            org.telegram.ui.ActionBar.n2 n2Var = this.D0;
            AndroidUtilities.requestAdjustResize(n2Var.getParentActivity(), n2Var.getClassGuid());
        }
        ec.a(this, new v8(this));
        NotificationCenter.getInstance(i9Var.h).addObserver(i9Var, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(i9Var.h).addObserver(i9Var, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i9Var.h).addObserver(i9Var, NotificationCenter.articleClosed);
        NotificationCenter.getInstance(i9Var.h).addObserver(i9Var, NotificationCenter.openArticle);
        NotificationCenter.getInstance(i9Var.h).addObserver(i9Var, NotificationCenter.storyDeleted);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ec.h(this);
        i9 i9Var = this.E0;
        NotificationCenter.getInstance(i9Var.h).removeObserver(i9Var, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(i9Var.h).removeObserver(i9Var, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i9Var.h).removeObserver(i9Var, NotificationCenter.articleClosed);
        NotificationCenter.getInstance(i9Var.h).removeObserver(i9Var, NotificationCenter.openArticle);
        NotificationCenter.getInstance(i9Var.h).removeObserver(i9Var, NotificationCenter.storyDeleted);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f10;
        g2 g2Var;
        h9 h9Var;
        d4 d4Var;
        e4 currentPeerView;
        c4 c4Var;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        g2 g2Var2;
        i9 i9Var = this.E0;
        l3 l3Var = i9Var.X0;
        if (motionEvent.getAction() == 0 && i9Var.Q == 1.0f) {
            float x8 = motionEvent.getX();
            this.f14106u0 = x8;
            this.f14104s0 = x8;
            this.f14105t0 = motionEvent.getY();
            i9Var.f13471c0 = false;
            i9Var.f13468b0 = (i9Var.E0 || i9.i(i9Var, i9Var.f13505s, motionEvent.getX(), motionEvent.getY(), false)) ? false : true;
            i9Var.f13473d0 = (i9Var.E0 || i9.i(i9Var, i9Var.f13505s, motionEvent.getX(), motionEvent.getY(), true)) ? false : true;
            i9Var.K(i9Var.f13468b0 && !i9Var.f13486i1);
            e4 e4VarT = i9Var.t();
            if (i9Var.f13468b0 && e4VarT != null && (g2Var2 = e4VarT.H0) != null) {
                g2Var2.setAllowTouches(false);
            }
            if (i9Var.f13468b0 && !i9Var.E0 && i9Var.f13486i1) {
                y9 y9Var = new y9(this, 28);
                i9Var.f13488j1 = y9Var;
                AndroidUtilities.runOnUIThread(y9Var, 150L);
            }
            if (i9Var.f13468b0 && !i9Var.f13513x && !i9Var.E0 && !i9Var.f13480f1) {
                AndroidUtilities.runOnUIThread(l3Var, 400L);
            }
            f10 = 1.0f;
        } else if (motionEvent.getAction() == 2) {
            float fAbs = Math.abs(this.f14105t0 - motionEvent.getY());
            float fAbs2 = Math.abs(this.f14104s0 - motionEvent.getX());
            if (!i9Var.W0 || !i9Var.f13481g0 || i9Var.f13469b1 || i9Var.f13479f0 || (d4Var = i9Var.C0) == null || d4Var.f13192b == null || (currentPeerView = i9Var.f13487j0.getCurrentPeerView()) == null || (c4Var = currentPeerView.K1) == null || c4Var.f13142b != null || !c4Var.f13144e) {
                f10 = 1.0f;
            } else {
                long documentDuration = currentPeerView.N2;
                if (documentDuration <= 0 && (storyItem = c4Var.f13141a) != null && (messageMedia = storyItem.media) != null && (document = messageMedia.document) != null) {
                    documentDuration = (long) (MessageObject.getDocumentDuration(document) * 1000.0d);
                }
                if (documentDuration > 0) {
                    float x10 = motionEvent.getX();
                    h9 h9Var2 = i9Var.C0.f13192b;
                    f10 = 1.0f;
                    if (((int) (h9Var2.seek((x10 - this.f14106u0) / AndroidUtilities.dp(220.0f), documentDuration) * 10.0f)) != ((int) (h9Var2.currentSeek * 10.0f))) {
                        try {
                            currentPeerView.performHapticFeedback(9, 1);
                        } catch (Exception unused) {
                        }
                    }
                    currentPeerView.Y0.invalidate();
                    this.f14106u0 = x10;
                } else {
                    f10 = 1.0f;
                }
            }
            if (fAbs > fAbs2 && !i9Var.f13481g0 && !i9Var.f13471c0 && fAbs > AndroidUtilities.touchSlop * 2.0f) {
                i9Var.f13471c0 = true;
            }
            if (!i9Var.f13479f0 && !i9Var.f13481g0 && !i9Var.f13513x && i9Var.f13473d0) {
                if (fAbs > fAbs2 && fAbs > AndroidUtilities.touchSlop * 2.0f) {
                    i9Var.f13479f0 = true;
                    e4 currentPeerView2 = i9Var.f13487j0.getCurrentPeerView();
                    if (currentPeerView2 != null) {
                        currentPeerView2.p0();
                    }
                    boolean z10 = (currentPeerView2 == null || currentPeerView2.K1.f13145f || (!currentPeerView2.f13295y1 && (!currentPeerView2.f13299z1 || !currentPeerView2.f13293x3))) ? false : true;
                    i9Var.f13483h0 = (z10 || currentPeerView2 == null || currentPeerView2.f13299z1 || currentPeerView2.B1 || i9Var.f13501q1 != null) ? false : true;
                    boolean z11 = z10 && !currentPeerView2.Y2 && currentPeerView2.K1.f13141a != null && i9Var.f13501q1 == null;
                    i9Var.Y = z11;
                    if (z11 && this.f35375f != 0) {
                        i9Var.Y = false;
                    }
                    if (i9Var.Y) {
                        i9Var.p();
                    }
                    i9Var.V = 0.0f;
                    y9 y9Var2 = i9Var.f13488j1;
                    if (y9Var2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(y9Var2);
                        i9Var.f13488j1.run();
                        i9Var.f13488j1 = null;
                    }
                    AndroidUtilities.cancelRunOnUIThread(l3Var);
                }
                i9Var.y();
            }
        } else {
            f10 = 1.0f;
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                AndroidUtilities.cancelRunOnUIThread(l3Var);
                y9 y9Var3 = i9Var.f13488j1;
                if (y9Var3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(y9Var3);
                    i9Var.f13488j1 = null;
                }
                i9Var.K(false);
                i9Var.f13471c0 = false;
                i9Var.f13481g0 = false;
                d4 d4Var2 = i9Var.C0;
                if (d4Var2 != null && (h9Var = d4Var2.f13192b) != null) {
                    h9Var.setSeeking(false);
                }
                e4 e4VarT2 = i9Var.t();
                if (e4VarT2 != null && (g2Var = e4VarT2.H0) != null) {
                    g2Var.setAllowTouches(true);
                }
            }
        }
        k5 k5Var = i9Var.f13511w;
        boolean z12 = k5Var != null && k5Var.f13581f == f10;
        if (!i9Var.f13479f0 && !z12) {
            i9Var.f13476e0.onTouchEvent(motionEvent);
        }
        return i9Var.f13479f0 || super.onInterceptTouchEvent(motionEvent);
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
        g2 g2Var;
        int action = motionEvent.getAction();
        i9 i9Var = this.E0;
        int i10 = 1;
        if (action == 1 || motionEvent.getAction() == 3) {
            i9Var.f13479f0 = false;
            i9Var.K(false);
            if (i9Var.R >= 1.0f) {
                i9Var.q(true);
            } else if (!i9Var.D0) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(i9Var.S, 0.0f);
                i9Var.C = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new t8(this, i10));
                i9Var.C.addListener(new u8(this, i10));
                i9Var.C.setDuration(150L);
                i9Var.C.setInterpolator(er.f28122f);
                i9Var.C.start();
            }
            e4 e4VarT = i9Var.t();
            if (e4VarT != null && (g2Var = e4VarT.H0) != null) {
                g2Var.setAllowTouches(true);
            }
        }
        if (!i9Var.f13479f0 && !i9Var.f13513x && i9Var.V == 0.0f && ((i9Var.f13465a0 == 0.0f || (!i9Var.f13468b0 && !i9Var.f13471c0)) && !i9Var.f13480f1)) {
            return false;
        }
        i9Var.f13476e0.onTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        this.E0.f13468b0 = false;
    }
}
