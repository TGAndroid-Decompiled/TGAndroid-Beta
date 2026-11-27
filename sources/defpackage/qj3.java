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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.UndoView;
public final class qj3 extends sl0 implements j6b {
    public static final int C3 = 0;
    public int A3;
    public final uj3 B3;
    public boolean k3;
    public boolean l3;
    public boolean m3;
    public final tj3 n3;
    public int o3;
    public float p3;
    public final Paint q3;
    public final RectF r3;
    public ji3 s3;
    public LongSparseArray t3;
    public Paint u3;
    public float v3;
    public float w3;
    public float x3;
    public boolean y3;
    public ibc z3;

    public qj3(uj3 uj3Var, Context context, tj3 tj3Var) {
        super(context, null);
        this.B3 = uj3Var;
        this.l3 = true;
        this.q3 = new Paint();
        this.r3 = new RectF();
        this.w3 = 1.0f;
        this.n3 = tj3Var;
        this.i3 = hl.L(200.0f);
    }

    @Override
    public final int A1() {
        return hl.L(48.0f);
    }

    public final void C1(defpackage.ji3 r15, float r16, boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qj3.C1(ji3, float, boolean):void");
    }

    public final void D1(boolean z, of3 of3Var) {
        xea.m1 = !xea.m1;
        SharedPreferences.Editor edit = uc7.e1().edit();
        edit.putBoolean("archiveHidden", xea.m1);
        edit.apply();
        uj3 uj3Var = this.B3;
        UndoView w3 = uj3Var.w3();
        if (xea.m1) {
            if (of3Var != null) {
                uj3Var.g2 = true;
                uj3Var.d1 = true;
                int top = (of3Var.getTop() - getPaddingTop()) + of3Var.getMeasuredHeight();
                if (uj3Var.L && !uj3Var.F0.g()) {
                    uj3Var.S = true;
                    top += hl.L(81.0f);
                }
                y0(0, top, k43.g);
                if (z) {
                    uj3Var.f1 = true;
                } else {
                    E1();
                }
            }
            w3.l(0L, 6, null, null);
            return;
        }
        w3.l(0L, 7, null, null);
        E1();
        if (z && of3Var != null) {
            of3Var.c0();
            of3Var.invalidate();
        }
    }

    public final void E1() {
        byte b;
        boolean z = false;
        if (xea.m1) {
            b = 2;
        } else {
            b = 0;
        }
        tj3 tj3Var = this.n3;
        tj3Var.w = b;
        xh3 xh3Var = tj3Var.n;
        if (xh3Var != null) {
            if (b != 0) {
                z = true;
            }
            xh3Var.X = z;
        }
    }

    @Override
    public final boolean H0(View view) {
        if ((view instanceof mf5) && !view.isClickable()) {
            return false;
        }
        return true;
    }

    @Override
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        view.setTranslationY(uj3.H4);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qj3.dispatchDraw(android.graphics.Canvas):void");
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
        if (getItemAnimator() != null && getItemAnimator().k() && (view instanceof of3) && ((of3) view).r) {
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    public float getViewOffset() {
        return uj3.H4;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        tj3 tj3Var = this.n3;
        if (tj3Var.n != null && uj3.H4 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            tj3Var.n.c(canvas, true);
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
            uj3 uj3Var = this.B3;
            if (!uj3Var.d1 && !this.n3.y.k()) {
                if (motionEvent.getAction() == 0) {
                    aVar = ((e) uj3Var).actionBar;
                    uj3Var.e1 = !aVar.z();
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
        tj3[] tj3VarArr;
        AnimatorSet animatorSet;
        tj3 tj3Var = this.n3;
        int K0 = tj3Var.c.K0();
        float f2 = 0.0f;
        uj3 uj3Var = this.B3;
        if (K0 != -1 && tj3Var.e.E == 0 && tj3Var.c.y < 0 && tj3Var.a.getScrollState() != 1) {
            f89 L = tj3Var.a.L(K0);
            if (L == null) {
                L = tj3Var.a.M(K0, false);
            }
            if (L != null) {
                int top = L.a.getTop();
                if (tj3Var.s == 0 && uj3Var.y3() && tj3Var.w == 2) {
                    K0 = Math.max(1, K0);
                }
                this.m3 = true;
                tj3Var.c.g1(K0, (int) ((top - this.o3) + uj3Var.A3 + 0.0f));
                this.m3 = false;
            }
        } else if (K0 == -1 && this.l3) {
            uh3 uh3Var = tj3Var.c;
            if (tj3Var.s == 0 && uj3Var.y3()) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            uh3Var.g1(i3, (int) uj3Var.O);
        }
        this.m3 = true;
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        aVar = ((e) uj3Var).actionBar;
        if (aVar.getOccupyStatusBar()) {
            i4 = hl.m;
        } else {
            i4 = 0;
        }
        int i5 = currentActionBarHeight + i4;
        if (uj3Var.L && !uj3Var.P) {
            i5 += hl.L(81.0f);
        }
        if (!uj3Var.P) {
            i5 += hl.L(48.0f);
        }
        this.A3 = 0;
        float p3 = uj3Var.p3(false);
        xj3 xj3Var = uj3Var.L1;
        if (xj3Var != null) {
            f = xj3Var.getMetadata().c.a;
        } else {
            f = 0.0f;
        }
        float L2 = hl.L(50.0f);
        ij3 ij3Var = uj3Var.A0;
        if (ij3Var != null) {
            f2 = ij3Var.getUnreadOnlyBannerHeight();
        }
        int i6 = (int) ((L2 + f2) * p3);
        int i7 = i5 + i6;
        this.A3 += i6;
        xj3 xj3Var2 = uj3Var.L1;
        if (xj3Var2 != null) {
            int c = (int) xj3Var2.c(hl.R1(hl.L(14.0f), hl.L(7.0f), p3));
            i7 += c;
            this.A3 += c;
        }
        int L3 = i7 - hl.L(Math.max(p3, f) * 5.0f);
        this.A3 -= hl.L(Math.max(p3, f) * 5.0f);
        int F2 = uj3Var.F2();
        if (L3 != this.g3 || F2 != getPaddingBottom()) {
            setTopGlowOffset(L3);
            setPadding(0, L3, 0, F2);
            boolean z = uj3Var.L;
            tk4 tk4Var = tj3Var.x;
            if (z) {
                tk4Var.setPaddingTop(L3 - hl.L(81.0f));
            } else {
                tk4Var.setPaddingTop(L3);
            }
            for (int i8 = 0; i8 < getChildCount(); i8++) {
                if (getChildAt(i8) instanceof fk3) {
                    getChildAt(i8).requestLayout();
                }
            }
        }
        this.m3 = false;
        if (this.l3 && uj3Var.getMessagesController().R1) {
            if (tj3Var.s == 0 && uj3Var.y3()) {
                this.m3 = true;
                ((x46) getLayoutManager()).g1(1, (int) uj3Var.O);
                this.m3 = false;
            }
            this.l3 = false;
        }
        super.onMeasure(i, i2);
        if (!uj3Var.n2 && L3 != 0 && (tj3VarArr = uj3Var.f0) != null && tj3VarArr.length > 1 && !uj3Var.o3 && (animatorSet = uj3Var.i3) != null) {
            animatorSet.isRunning();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f89 f89Var;
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
            uj3 uj3Var = this.B3;
            if (!uj3Var.d1 && !uj3Var.E) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                tj3 tj3Var = this.n3;
                if (action == 1 || action == 3) {
                    lu5 lu5Var = tj3Var.e;
                    if (lu5Var.E != 0) {
                        sj3 sj3Var = tj3Var.f;
                        if (sj3Var.f) {
                            sj3Var.g = true;
                            if (lu5Var.i(null, 4) != 0 && (f89Var = tj3Var.f.e) != null) {
                                View view = f89Var.a;
                                if (view instanceof of3) {
                                    of3 of3Var = (of3) view;
                                    long dialogId = of3Var.getDialogId();
                                    if (wf3.C(dialogId)) {
                                        D1(false, of3Var);
                                    } else {
                                        TLRPC.Dialog dialog = (TLRPC.Dialog) uj3Var.getMessagesController().R.f(dialogId);
                                        if (dialog != null) {
                                            if (!xc2.Y(uj3Var.getMessagesController().M0(Long.valueOf(-dialogId)))) {
                                                i = ((e) uj3Var).currentAccount;
                                                if (xea.m(i) != 1) {
                                                    i2 = ((e) uj3Var).currentAccount;
                                                    if (xea.m(i2) != 3) {
                                                        i3 = ((e) uj3Var).currentAccount;
                                                        if (xea.m(i3) != 0) {
                                                            i4 = ((e) uj3Var).currentAccount;
                                                            if (xea.m(i4) == 4) {
                                                                ArrayList arrayList = new ArrayList();
                                                                arrayList.add(Long.valueOf(dialogId));
                                                                uj3Var.K4(arrayList, 102, true, false, null);
                                                            }
                                                        } else {
                                                            ArrayList arrayList2 = new ArrayList();
                                                            arrayList2.add(Long.valueOf(dialogId));
                                                            uj3Var.Q2 = !uj3Var.H3(dialog);
                                                            uj3Var.K4(arrayList2, 100, true, false, null);
                                                        }
                                                    } else if (!uj3Var.getMessagesController().p2(dialogId, 0L, null)) {
                                                        ip7.n(yac.t0).T(dialogId, 3, 0L);
                                                        if (d31.a(uj3Var)) {
                                                            d31.z(uj3Var, 3, 0, null).j();
                                                        }
                                                    } else {
                                                        ArrayList arrayList3 = new ArrayList();
                                                        arrayList3.add(Long.valueOf(dialogId));
                                                        i5 = ((e) uj3Var).currentAccount;
                                                        uj3Var.R2 = !uc7.s1(i5).p2(dialogId, 0L, null);
                                                        if (uj3Var.R2 > 0) {
                                                            i6 = 0;
                                                        } else {
                                                            i6 = 1;
                                                        }
                                                        uj3Var.S2 = i6;
                                                        uj3Var.K4(arrayList3, 104, true, false, null);
                                                    }
                                                } else {
                                                    ArrayList arrayList4 = new ArrayList();
                                                    arrayList4.add(Long.valueOf(dialogId));
                                                    if (dialog.unread_count <= 0 && !dialog.unread_mark) {
                                                        i7 = 0;
                                                    } else {
                                                        i7 = 1;
                                                    }
                                                    uj3Var.P2 = i7;
                                                    uj3Var.K4(arrayList4, 101, true, false, null);
                                                }
                                            } else {
                                                ArrayList arrayList5 = new ArrayList();
                                                arrayList5.add(Long.valueOf(dialogId));
                                                uj3Var.K4(arrayList5, 111, true, false, null);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (tj3Var.s == 0 && ((action == 1 || action == 3) && tj3Var.w == 2 && uj3Var.y3() && ((x46) getLayoutManager()).K0() == 0)) {
                    int paddingTop = getPaddingTop();
                    of3 n3 = uj3.n3(tj3Var);
                    if (n3 != null) {
                        if (xea.l1) {
                            f = 76.0f;
                        } else {
                            f = 70.0f;
                        }
                        int L = (int) (hl.L(f) * 0.85f);
                        int measuredHeight = n3.getMeasuredHeight() + (n3.getTop() - paddingTop);
                        long currentTimeMillis = System.currentTimeMillis() - uj3Var.f3;
                        if (measuredHeight >= L && currentTimeMillis >= 200) {
                            if (tj3Var.w != 1) {
                                if (getViewOffset() == 0.0f) {
                                    uj3Var.g2 = true;
                                    y0(0, n3.getTop() - paddingTop, k43.h);
                                }
                                if (!uj3Var.h3) {
                                    uj3Var.h3 = true;
                                    try {
                                        performHapticFeedback(3, 2);
                                    } catch (Exception unused) {
                                    }
                                    xh3 xh3Var = tj3Var.n;
                                    if (xh3Var != null) {
                                        xh3Var.a(true);
                                    }
                                }
                                n3.i0();
                                tj3Var.w = (byte) 1;
                                if (hl.A1()) {
                                    hl.g2(ob6.M0(2131754919, null));
                                }
                            }
                            i8 = 2;
                        } else {
                            uj3Var.g2 = true;
                            y0(0, measuredHeight, k43.h);
                            i8 = 2;
                            tj3Var.w = (byte) 2;
                        }
                        if (getViewOffset() != 0.0f) {
                            float[] fArr = new float[i8];
                            fArr[0] = getViewOffset();
                            fArr[1] = 0.0f;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                            ofFloat.addUpdateListener(new az1(this, (byte) 17));
                            ofFloat.setDuration(Math.max(100L, uh9.x(getViewOffset(), hl.L(72.0f), 120.0f, 350.0f)));
                            ofFloat.setInterpolator(k43.h);
                            setScrollEnabled(false);
                            ofFloat.addListener(new cn2(this, (byte) 10));
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
    public void setAdapter(j79 j79Var) {
        super.setAdapter(j79Var);
        this.l3 = true;
    }

    public void setOpenRightFragmentProgress(float f) {
        this.p3 = f;
        invalidate();
    }

    public void setViewsOffset(float f) {
        View m;
        uj3.H4 = f;
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
    public final boolean x1() {
        return true;
    }
}
