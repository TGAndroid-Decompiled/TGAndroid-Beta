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
public final class jk3 extends rm0 implements o4b {
    public static final int C3 = 0;
    public int A3;
    public final nk3 B3;
    public boolean k3;
    public boolean l3;
    public boolean m3;
    public final mk3 n3;
    public int o3;
    public float p3;
    public final Paint q3;
    public final RectF r3;
    public bj3 s3;
    public LongSparseArray t3;
    public Paint u3;
    public float v3;
    public float w3;
    public float x3;
    public boolean y3;
    public j9c z3;

    public jk3(nk3 nk3Var, Context context, mk3 mk3Var) {
        super(context, null);
        this.B3 = nk3Var;
        this.l3 = true;
        this.q3 = new Paint();
        this.r3 = new RectF();
        this.w3 = 1.0f;
        this.n3 = mk3Var;
        this.i3 = gm.L(200.0f);
    }

    public final void B1(defpackage.bj3 r15, float r16, boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jk3.B1(bj3, float, boolean):void");
    }

    public final void C1(boolean z, hg3 hg3Var) {
        gda.m1 = !gda.m1;
        SharedPreferences.Editor edit = oc7.d1().edit();
        edit.putBoolean("archiveHidden", gda.m1);
        edit.apply();
        nk3 nk3Var = this.B3;
        UndoView w3 = nk3Var.w3();
        if (gda.m1) {
            if (hg3Var != null) {
                nk3Var.g2 = true;
                nk3Var.d1 = true;
                int top = (hg3Var.getTop() - getPaddingTop()) + hg3Var.getMeasuredHeight();
                if (nk3Var.L && !nk3Var.F0.g()) {
                    nk3Var.S = true;
                    top += gm.L(81.0f);
                }
                x0(0, top, d53.g);
                if (z) {
                    nk3Var.f1 = true;
                } else {
                    D1();
                }
            }
            w3.l(0L, 6, null, null);
            return;
        }
        w3.l(0L, 7, null, null);
        D1();
        if (z && hg3Var != null) {
            hg3Var.c0();
            hg3Var.invalidate();
        }
    }

    public final void D1() {
        byte b;
        boolean z = false;
        if (gda.m1) {
            b = 2;
        } else {
            b = 0;
        }
        mk3 mk3Var = this.n3;
        mk3Var.w = b;
        pi3 pi3Var = mk3Var.n;
        if (pi3Var != null) {
            if (b != 0) {
                z = true;
            }
            pi3Var.X = z;
        }
    }

    @Override
    public final boolean G0(View view) {
        if ((view instanceof jf5) && !view.isClickable()) {
            return false;
        }
        return true;
    }

    @Override
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        view.setTranslationY(nk3.H4);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jk3.dispatchDraw(android.graphics.Canvas):void");
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
        if (getItemAnimator() != null && getItemAnimator().k() && (view instanceof hg3) && ((hg3) view).r) {
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    public float getViewOffset() {
        return nk3.H4;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        mk3 mk3Var = this.n3;
        if (mk3Var.n != null && nk3.H4 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            mk3Var.n.c(canvas, true);
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
            nk3 nk3Var = this.B3;
            if (!nk3Var.d1 && !this.n3.y.k()) {
                if (motionEvent.getAction() == 0) {
                    aVar = ((d) nk3Var).actionBar;
                    nk3Var.e1 = !aVar.y();
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
        mk3[] mk3VarArr;
        AnimatorSet animatorSet;
        mk3 mk3Var = this.n3;
        int K0 = mk3Var.c.K0();
        float f2 = 0.0f;
        nk3 nk3Var = this.B3;
        if (K0 != -1 && mk3Var.e.E == 0 && mk3Var.c.y < 0 && mk3Var.a.getScrollState() != 1) {
            u69 K = mk3Var.a.K(K0);
            if (K == null) {
                K = mk3Var.a.L(K0, false);
            }
            if (K != null) {
                int top = K.a.getTop();
                if (mk3Var.s == 0 && nk3Var.y3() && mk3Var.w == 2) {
                    K0 = Math.max(1, K0);
                }
                this.m3 = true;
                mk3Var.c.g1(K0, (int) ((top - this.o3) + nk3Var.A3 + 0.0f));
                this.m3 = false;
            }
        } else if (K0 == -1 && this.l3) {
            mi3 mi3Var = mk3Var.c;
            if (mk3Var.s == 0 && nk3Var.y3()) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            mi3Var.g1(i3, (int) nk3Var.O);
        }
        this.m3 = true;
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        aVar = ((d) nk3Var).actionBar;
        if (aVar.getOccupyStatusBar()) {
            i4 = gm.m;
        } else {
            i4 = 0;
        }
        int i5 = currentActionBarHeight + i4;
        if (nk3Var.L && !nk3Var.P) {
            i5 += gm.L(81.0f);
        }
        if (!nk3Var.P) {
            i5 += gm.L(48.0f);
        }
        this.A3 = 0;
        float p3 = nk3Var.p3(false);
        qk3 qk3Var = nk3Var.L1;
        if (qk3Var != null) {
            f = qk3Var.getMetadata().c.a;
        } else {
            f = 0.0f;
        }
        float L = gm.L(50.0f);
        ak3 ak3Var = nk3Var.A0;
        if (ak3Var != null) {
            f2 = ak3Var.getUnreadOnlyBannerHeight();
        }
        int i6 = (int) ((L + f2) * p3);
        int i7 = i5 + i6;
        this.A3 += i6;
        qk3 qk3Var2 = nk3Var.L1;
        if (qk3Var2 != null) {
            int c = (int) qk3Var2.c(gm.R1(gm.L(14.0f), gm.L(7.0f), p3));
            i7 += c;
            this.A3 += c;
        }
        int L2 = i7 - gm.L(Math.max(p3, f) * 5.0f);
        this.A3 -= gm.L(Math.max(p3, f) * 5.0f);
        int F2 = nk3Var.F2();
        if (L2 != this.g3 || F2 != getPaddingBottom()) {
            setTopGlowOffset(L2);
            setPadding(0, L2, 0, F2);
            boolean z = nk3Var.L;
            tk4 tk4Var = mk3Var.x;
            if (z) {
                tk4Var.setPaddingTop(L2 - gm.L(81.0f));
            } else {
                tk4Var.setPaddingTop(L2);
            }
            for (int i8 = 0; i8 < getChildCount(); i8++) {
                if (getChildAt(i8) instanceof yk3) {
                    getChildAt(i8).requestLayout();
                }
            }
        }
        this.m3 = false;
        if (this.l3 && nk3Var.getMessagesController().R1) {
            if (mk3Var.s == 0 && nk3Var.y3()) {
                this.m3 = true;
                ((u46) getLayoutManager()).g1(1, (int) nk3Var.O);
                this.m3 = false;
            }
            this.l3 = false;
        }
        super.onMeasure(i, i2);
        if (!nk3Var.n2 && L2 != 0 && (mk3VarArr = nk3Var.f0) != null && mk3VarArr.length > 1 && !nk3Var.o3 && (animatorSet = nk3Var.i3) != null) {
            animatorSet.isRunning();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        u69 u69Var;
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
            nk3 nk3Var = this.B3;
            if (!nk3Var.d1 && !nk3Var.E) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                mk3 mk3Var = this.n3;
                if (action == 1 || action == 3) {
                    hu5 hu5Var = mk3Var.e;
                    if (hu5Var.E != 0) {
                        lk3 lk3Var = mk3Var.f;
                        if (lk3Var.f) {
                            lk3Var.g = true;
                            if (hu5Var.i(null, 4) != 0 && (u69Var = mk3Var.f.e) != null) {
                                View view = u69Var.a;
                                if (view instanceof hg3) {
                                    hg3 hg3Var = (hg3) view;
                                    long dialogId = hg3Var.getDialogId();
                                    if (pg3.C(dialogId)) {
                                        C1(false, hg3Var);
                                    } else {
                                        TLRPC.Dialog dialog = (TLRPC.Dialog) nk3Var.getMessagesController().R.f(dialogId);
                                        if (dialog != null) {
                                            if (!sd2.Y(nk3Var.getMessagesController().L0(Long.valueOf(-dialogId)))) {
                                                i = ((d) nk3Var).currentAccount;
                                                if (gda.m(i) != 1) {
                                                    i2 = ((d) nk3Var).currentAccount;
                                                    if (gda.m(i2) != 3) {
                                                        i3 = ((d) nk3Var).currentAccount;
                                                        if (gda.m(i3) != 0) {
                                                            i4 = ((d) nk3Var).currentAccount;
                                                            if (gda.m(i4) == 4) {
                                                                ArrayList arrayList = new ArrayList();
                                                                arrayList.add(Long.valueOf(dialogId));
                                                                nk3Var.K4(arrayList, 102, true, false, null);
                                                            }
                                                        } else {
                                                            ArrayList arrayList2 = new ArrayList();
                                                            arrayList2.add(Long.valueOf(dialogId));
                                                            nk3Var.Q2 = !nk3Var.H3(dialog);
                                                            nk3Var.K4(arrayList2, 100, true, false, null);
                                                        }
                                                    } else if (!nk3Var.getMessagesController().o2(dialogId, 0L, null)) {
                                                        lo7.n(z8c.t0).T(dialogId, 3, 0L);
                                                        if (c41.a(nk3Var)) {
                                                            c41.z(nk3Var, 3, 0, null).j();
                                                        }
                                                    } else {
                                                        ArrayList arrayList3 = new ArrayList();
                                                        arrayList3.add(Long.valueOf(dialogId));
                                                        i5 = ((d) nk3Var).currentAccount;
                                                        nk3Var.R2 = !oc7.r1(i5).o2(dialogId, 0L, null);
                                                        if (nk3Var.R2 > 0) {
                                                            i6 = 0;
                                                        } else {
                                                            i6 = 1;
                                                        }
                                                        nk3Var.S2 = i6;
                                                        nk3Var.K4(arrayList3, 104, true, false, null);
                                                    }
                                                } else {
                                                    ArrayList arrayList4 = new ArrayList();
                                                    arrayList4.add(Long.valueOf(dialogId));
                                                    if (dialog.unread_count <= 0 && !dialog.unread_mark) {
                                                        i7 = 0;
                                                    } else {
                                                        i7 = 1;
                                                    }
                                                    nk3Var.P2 = i7;
                                                    nk3Var.K4(arrayList4, 101, true, false, null);
                                                }
                                            } else {
                                                ArrayList arrayList5 = new ArrayList();
                                                arrayList5.add(Long.valueOf(dialogId));
                                                nk3Var.K4(arrayList5, 111, true, false, null);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (mk3Var.s == 0 && ((action == 1 || action == 3) && mk3Var.w == 2 && nk3Var.y3() && ((u46) getLayoutManager()).K0() == 0)) {
                    int paddingTop = getPaddingTop();
                    hg3 n3 = nk3.n3(mk3Var);
                    if (n3 != null) {
                        if (gda.l1) {
                            f = 76.0f;
                        } else {
                            f = 70.0f;
                        }
                        int L = (int) (gm.L(f) * 0.85f);
                        int measuredHeight = n3.getMeasuredHeight() + (n3.getTop() - paddingTop);
                        long currentTimeMillis = System.currentTimeMillis() - nk3Var.f3;
                        if (measuredHeight >= L && currentTimeMillis >= 200) {
                            if (mk3Var.w != 1) {
                                if (getViewOffset() == 0.0f) {
                                    nk3Var.g2 = true;
                                    x0(0, n3.getTop() - paddingTop, d53.h);
                                }
                                if (!nk3Var.h3) {
                                    nk3Var.h3 = true;
                                    try {
                                        performHapticFeedback(3, 2);
                                    } catch (Exception unused) {
                                    }
                                    pi3 pi3Var = mk3Var.n;
                                    if (pi3Var != null) {
                                        pi3Var.a(true);
                                    }
                                }
                                n3.i0();
                                mk3Var.w = (byte) 1;
                                if (gm.A1()) {
                                    gm.g2(jb6.M0(2131754923, null));
                                }
                            }
                            i8 = 2;
                        } else {
                            nk3Var.g2 = true;
                            x0(0, measuredHeight, d53.h);
                            i8 = 2;
                            mk3Var.w = (byte) 2;
                        }
                        if (getViewOffset() != 0.0f) {
                            float[] fArr = new float[i8];
                            fArr[0] = getViewOffset();
                            fArr[1] = 0.0f;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                            ofFloat.addUpdateListener(new et1(this, (byte) 18));
                            ofFloat.setDuration(Math.max(100L, hg9.x(getViewOffset(), gm.L(72.0f), 120.0f, 350.0f)));
                            ofFloat.setInterpolator(d53.h);
                            setScrollEnabled(false);
                            ofFloat.addListener(new kh2(this, (byte) 12));
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
    public void setAdapter(y59 y59Var) {
        super.setAdapter(y59Var);
        this.l3 = true;
    }

    public void setOpenRightFragmentProgress(float f) {
        this.p3 = f;
        invalidate();
    }

    public void setViewsOffset(float f) {
        View m;
        nk3.H4 = f;
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
        return gm.L(48.0f);
    }
}
