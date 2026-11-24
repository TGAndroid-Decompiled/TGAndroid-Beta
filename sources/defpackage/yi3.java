package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.UndoView;
public final class yi3 extends rl0 implements n2b {
    public static final int C3 = 0;
    public int A3;
    public final cj3 B3;
    public boolean k3;
    public boolean l3;
    public boolean m3;
    public final bj3 n3;
    public int o3;
    public float p3;
    public final Paint q3;
    public final RectF r3;
    public ph3 s3;
    public LongSparseArray t3;
    public Paint u3;
    public float v3;
    public float w3;
    public float x3;
    public boolean y3;
    public i7c z3;

    public yi3(cj3 cj3Var, Context context, bj3 bj3Var) {
        super(context, null);
        this.B3 = cj3Var;
        this.l3 = true;
        this.q3 = new Paint();
        this.r3 = new RectF();
        this.w3 = 1.0f;
        this.n3 = bj3Var;
        this.i3 = gl.L(200.0f);
    }

    public final void B1(defpackage.ph3 r15, float r16, boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yi3.B1(ph3, float, boolean):void");
    }

    public final void C1(boolean z, ue3 ue3Var) {
        gba.m1 = !gba.m1;
        SharedPreferences.Editor edit = na7.c1().edit();
        edit.putBoolean("archiveHidden", gba.m1);
        edit.apply();
        cj3 cj3Var = this.B3;
        UndoView u3 = cj3Var.u3();
        if (gba.m1) {
            if (ue3Var != null) {
                cj3Var.g2 = true;
                cj3Var.d1 = true;
                int top = (ue3Var.getTop() - getPaddingTop()) + ue3Var.getMeasuredHeight();
                if (cj3Var.L && !cj3Var.F0.g()) {
                    cj3Var.S = true;
                    top += gl.L(81.0f);
                }
                x0(0, top, s33.g);
                if (z) {
                    cj3Var.f1 = true;
                } else {
                    D1();
                }
            }
            u3.l(0L, 6, null, null);
            return;
        }
        u3.l(0L, 7, null, null);
        D1();
        if (z && ue3Var != null) {
            ue3Var.d0();
            ue3Var.invalidate();
        }
    }

    public final void D1() {
        byte b;
        boolean z = false;
        if (gba.m1) {
            b = 2;
        } else {
            b = 0;
        }
        bj3 bj3Var = this.n3;
        bj3Var.w = b;
        dh3 dh3Var = bj3Var.n;
        if (dh3Var != null) {
            if (b != 0) {
                z = true;
            }
            dh3Var.X = z;
        }
    }

    @Override
    public final boolean G0(View view) {
        if ((view instanceof ld5) && !view.isClickable()) {
            return false;
        }
        return true;
    }

    @Override
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        view.setTranslationY(cj3.F4);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void b(int[] iArr) {
        int paddingTop = (int) (getPaddingTop() + this.B3.O);
        iArr[0] = paddingTop;
        iArr[1] = getMeasuredHeight() + paddingTop;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yi3.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < getPaddingTop() + this.B3.O) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (getItemAnimator() != null && getItemAnimator().k() && (view instanceof ue3) && ((ue3) view).r) {
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    public float getViewOffset() {
        return cj3.F4;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        bj3 bj3Var = this.n3;
        if (bj3Var.n != null && cj3.F4 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            bj3Var.n.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (!this.W1) {
            cj3 cj3Var = this.B3;
            if (!cj3Var.d1 && !this.n3.y.k()) {
                if (motionEvent.getAction() == 0) {
                    aVar = ((d) cj3Var).actionBar;
                    cj3Var.e1 = !aVar.y();
                }
                return super.onInterceptTouchEvent(motionEvent);
            }
            return false;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.o3 = getPaddingTop();
        this.B3.A3 = 0.0f;
        this.n3.getClass();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        a aVar;
        int i4;
        float f;
        bj3[] bj3VarArr;
        AnimatorSet animatorSet;
        bj3 bj3Var = this.n3;
        int K0 = bj3Var.c.K0();
        float f2 = 0.0f;
        cj3 cj3Var = this.B3;
        if (K0 != -1 && bj3Var.e.E == 0 && bj3Var.c.y < 0 && bj3Var.a.getScrollState() != 1) {
            s49 K = bj3Var.a.K(K0);
            if (K == null) {
                K = bj3Var.a.L(K0, false);
            }
            if (K != null) {
                int top = K.a.getTop();
                if (bj3Var.s == 0 && cj3Var.w3() && bj3Var.w == 2) {
                    K0 = Math.max(1, K0);
                }
                this.m3 = true;
                bj3Var.c.g1(K0, (int) ((top - this.o3) + cj3Var.A3 + 0.0f));
                this.m3 = false;
            }
        } else if (K0 == -1 && this.l3) {
            ah3 ah3Var = bj3Var.c;
            if (bj3Var.s == 0 && cj3Var.w3()) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            ah3Var.g1(i3, (int) cj3Var.O);
        }
        this.m3 = true;
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        aVar = ((d) cj3Var).actionBar;
        if (aVar.getOccupyStatusBar()) {
            i4 = gl.m;
        } else {
            i4 = 0;
        }
        int i5 = currentActionBarHeight + i4;
        if (cj3Var.L && !cj3Var.P) {
            i5 += gl.L(81.0f);
        }
        if (!cj3Var.P) {
            i5 += gl.L(48.0f);
        }
        this.A3 = 0;
        float n3 = cj3Var.n3(false);
        fj3 fj3Var = cj3Var.L1;
        if (fj3Var != null) {
            f = fj3Var.getMetadata().c.a;
        } else {
            f = 0.0f;
        }
        float L = gl.L(50.0f);
        qi3 qi3Var = cj3Var.A0;
        if (qi3Var != null) {
            f2 = qi3Var.getUnreadOnlyBannerHeight();
        }
        int i6 = (int) ((L + f2) * n3);
        int i7 = i5 + i6;
        this.A3 += i6;
        fj3 fj3Var2 = cj3Var.L1;
        if (fj3Var2 != null) {
            int c = (int) fj3Var2.c(gl.R1(gl.L(14.0f), gl.L(7.0f), n3));
            i7 += c;
            this.A3 += c;
        }
        int L2 = i7 - gl.L(Math.max(n3, f) * 5.0f);
        this.A3 -= gl.L(Math.max(n3, f) * 5.0f);
        int D2 = cj3Var.D2();
        if (L2 != this.g3 || D2 != getPaddingBottom()) {
            setTopGlowOffset(L2);
            setPadding(0, L2, 0, D2);
            boolean z = cj3Var.L;
            pi4 pi4Var = bj3Var.x;
            if (z) {
                pi4Var.setPaddingTop(L2 - gl.L(81.0f));
            } else {
                pi4Var.setPaddingTop(L2);
            }
            for (int i8 = 0; i8 < getChildCount(); i8++) {
                if (getChildAt(i8) instanceof nj3) {
                    getChildAt(i8).requestLayout();
                }
            }
        }
        this.m3 = false;
        if (this.l3 && cj3Var.getMessagesController().R1) {
            if (bj3Var.s == 0 && cj3Var.w3()) {
                this.m3 = true;
                ((t26) getLayoutManager()).g1(1, (int) cj3Var.O);
                this.m3 = false;
            }
            this.l3 = false;
        }
        super.onMeasure(i, i2);
        if (!cj3Var.n2 && L2 != 0 && (bj3VarArr = cj3Var.f0) != null && bj3VarArr.length > 1 && !cj3Var.o3 && (animatorSet = cj3Var.i3) != null) {
            animatorSet.isRunning();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s49 s49Var;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        float f;
        int i8;
        if (!this.W1) {
            cj3 cj3Var = this.B3;
            if (!cj3Var.d1 && !cj3Var.E) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                bj3 bj3Var = this.n3;
                if (action == 1 || action == 3) {
                    is5 is5Var = bj3Var.e;
                    if (is5Var.E != 0) {
                        aj3 aj3Var = bj3Var.f;
                        if (aj3Var.f) {
                            aj3Var.g = true;
                            if (is5Var.i(null, 4) != 0 && (s49Var = bj3Var.f.e) != null) {
                                View view = s49Var.a;
                                if (view instanceof ue3) {
                                    ue3 ue3Var = (ue3) view;
                                    long dialogId = ue3Var.getDialogId();
                                    if (cf3.C(dialogId)) {
                                        C1(false, ue3Var);
                                    } else {
                                        TLRPC.Dialog dialog = (TLRPC.Dialog) cj3Var.getMessagesController().R.f(dialogId);
                                        if (dialog != null) {
                                            if (!hc2.Y(cj3Var.getMessagesController().K0(Long.valueOf(-dialogId)))) {
                                                i = ((d) cj3Var).currentAccount;
                                                if (gba.m(i) != 1) {
                                                    i2 = ((d) cj3Var).currentAccount;
                                                    if (gba.m(i2) != 3) {
                                                        i3 = ((d) cj3Var).currentAccount;
                                                        if (gba.m(i3) != 0) {
                                                            i4 = ((d) cj3Var).currentAccount;
                                                            if (gba.m(i4) == 4) {
                                                                ArrayList arrayList = new ArrayList();
                                                                arrayList.add(Long.valueOf(dialogId));
                                                                cj3Var.G4(arrayList, 102, true, false, null);
                                                            }
                                                        } else {
                                                            ArrayList arrayList2 = new ArrayList();
                                                            arrayList2.add(Long.valueOf(dialogId));
                                                            cj3Var.Q2 = !cj3Var.F3(dialog);
                                                            cj3Var.G4(arrayList2, 100, true, false, null);
                                                        }
                                                    } else if (!cj3Var.getMessagesController().n2(dialogId, 0L, null)) {
                                                        im7.n(y6c.t0).T(dialogId, 3, 0L);
                                                        if (u21.a(cj3Var)) {
                                                            u21.z(cj3Var, 3, 0, null).j();
                                                        }
                                                    } else {
                                                        ArrayList arrayList3 = new ArrayList();
                                                        arrayList3.add(Long.valueOf(dialogId));
                                                        i5 = ((d) cj3Var).currentAccount;
                                                        cj3Var.R2 = !na7.q1(i5).n2(dialogId, 0L, null);
                                                        if (cj3Var.R2 > 0) {
                                                            i6 = 0;
                                                        } else {
                                                            i6 = 1;
                                                        }
                                                        cj3Var.S2 = i6;
                                                        cj3Var.G4(arrayList3, 104, true, false, null);
                                                    }
                                                } else {
                                                    ArrayList arrayList4 = new ArrayList();
                                                    arrayList4.add(Long.valueOf(dialogId));
                                                    if (dialog.unread_count <= 0 && !dialog.unread_mark) {
                                                        i7 = 0;
                                                    } else {
                                                        i7 = 1;
                                                    }
                                                    cj3Var.P2 = i7;
                                                    cj3Var.G4(arrayList4, 101, true, false, null);
                                                }
                                            } else {
                                                ArrayList arrayList5 = new ArrayList();
                                                arrayList5.add(Long.valueOf(dialogId));
                                                cj3Var.G4(arrayList5, 111, true, false, null);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (bj3Var.s == 0 && ((action == 1 || action == 3) && bj3Var.w == 2 && cj3Var.w3() && ((t26) getLayoutManager()).K0() == 0)) {
                    int paddingTop = getPaddingTop();
                    ue3 l3 = cj3.l3(bj3Var);
                    if (l3 != null) {
                        if (gba.l1) {
                            f = 76.0f;
                        } else {
                            f = 70.0f;
                        }
                        int L = (int) (gl.L(f) * 0.85f);
                        int measuredHeight = l3.getMeasuredHeight() + (l3.getTop() - paddingTop);
                        long currentTimeMillis = System.currentTimeMillis() - cj3Var.f3;
                        if (measuredHeight >= L && currentTimeMillis >= 200) {
                            if (bj3Var.w != 1) {
                                if (getViewOffset() == 0.0f) {
                                    cj3Var.g2 = true;
                                    x0(0, l3.getTop() - paddingTop, s33.h);
                                }
                                if (!cj3Var.h3) {
                                    cj3Var.h3 = true;
                                    try {
                                        performHapticFeedback(3, 2);
                                    } catch (Exception unused) {
                                    }
                                    dh3 dh3Var = bj3Var.n;
                                    if (dh3Var != null) {
                                        dh3Var.a(true);
                                    }
                                }
                                l3.j0();
                                bj3Var.w = (byte) 1;
                                if (gl.A1()) {
                                    gl.g2(k96.M0(2131754923, null));
                                }
                            }
                            i8 = 2;
                        } else {
                            cj3Var.g2 = true;
                            x0(0, measuredHeight, s33.h);
                            i8 = 2;
                            bj3Var.w = (byte) 2;
                        }
                        if (getViewOffset() != 0.0f) {
                            float[] fArr = new float[i8];
                            fArr[0] = getViewOffset();
                            fArr[1] = 0.0f;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                            ofFloat.addUpdateListener(new uz1(this, (byte) 16));
                            ofFloat.setDuration(Math.max(100L, de9.x(getViewOffset(), gl.L(72.0f), 120.0f, 350.0f)));
                            ofFloat.setInterpolator(s33.h);
                            setScrollEnabled(false);
                            ofFloat.addListener(new im2(this, (byte) 10));
                            ofFloat.start();
                        }
                    }
                }
                return onTouchEvent;
            }
        }
        return false;
    }

    @Override
    public final void removeView(View view) {
        super.removeView(view);
        view.setTranslationY(0.0f);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void requestLayout() {
        if (this.m3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setAdapter(w39 w39Var) {
        super.setAdapter(w39Var);
        this.l3 = true;
    }

    public void setOpenRightFragmentProgress(float f) {
        this.p3 = f;
        invalidate();
    }

    public void setViewsOffset(float f) {
        View m;
        cj3.F4 = f;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setTranslationY(f);
        }
        if (this.D1 != -1 && (m = getLayoutManager().m(this.D1)) != null) {
            int right = m.getRight();
            int bottom = (int) (m.getBottom() + f);
            Rect rect = this.F1;
            rect.set(m.getLeft(), (int) (m.getTop() + f), right, bottom);
            this.C1.setBounds(rect);
        }
        invalidate();
    }

    @Override
    public final boolean w1() {
        return true;
    }

    @Override
    public final int z1() {
        return gl.L(48.0f);
    }
}
