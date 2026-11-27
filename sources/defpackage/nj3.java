package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
public final class nj3 extends wma {
    public final Paint g0;
    public int h0;
    public int i0;
    public int j0;
    public VelocityTracker k0;
    public final Rect l0;
    public boolean m0;
    public final dj2 n0;
    public final uj3 o0;

    public nj3(uj3 uj3Var, Context context) {
        super(context, null);
        this.o0 = uj3Var;
        this.g0 = new Paint(1);
        this.l0 = new Rect();
        this.n0 = new dj2(new aj3(this, (byte) 1));
    }

    @Override
    public final void H(android.graphics.Canvas r9, float r10, android.graphics.Rect r11, android.graphics.Paint r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nj3.H(android.graphics.Canvas, float, android.graphics.Rect, android.graphics.Paint, boolean):void");
    }

    @Override
    public final void J(Canvas canvas, ArrayList arrayList) {
        bj3 bj3Var;
        d79 n;
        uj3 uj3Var = this.o0;
        if (uj3Var.s3 && (bj3Var = uj3Var.D0) != null && bj3Var.getVisibility() == 0) {
            bj3 bj3Var2 = uj3Var.D0;
            View[] viewArr = bj3Var2.e;
            for (int i = 0; i < viewArr.length; i++) {
                View view = viewArr[i];
                if (view != null && view.getVisibility() == 0 && (n = vic.n(viewArr[i])) != null) {
                    for (int i2 = 0; i2 < n.getChildCount(); i2++) {
                        View childAt = n.getChildAt(i2);
                        if (childAt.getY() < hl.L(100.0f) + hl.L(203.0f)) {
                            int save = canvas.save();
                            canvas.translate(viewArr[i].getX(), childAt.getY() + n.getY() + viewArr[i].getY() + bj3Var2.getY());
                            childAt.draw(canvas);
                            canvas.restoreToCount(save);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void K() {
        vy4 vy4Var;
        xea.f();
        vy4Var = ((e) this.o0).glassEngine;
        vy4Var.g();
    }

    @Override
    public final boolean N() {
        return true;
    }

    public final boolean X() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nj3.X():boolean");
    }

    public final int Y() {
        a aVar;
        float f;
        uj3 uj3Var = this.o0;
        aVar = ((e) uj3Var).actionBar;
        float height = aVar.getHeight();
        li3 li3Var = uj3Var.H3;
        if (li3Var != null && li3Var.c()) {
            f = uj3Var.H3.e;
        } else {
            f = 0.0f;
        }
        if (uj3Var.L) {
            height = qd4.A(1.0f, uj3Var.w3, (1.0f - f) * (1.0f - uj3Var.z1) * hl.L(81.0f), height);
        }
        return (int) qd4.A(1.0f, f, (1.0f - uj3Var.z1) * (1.0f - uj3Var.w3) * hl.L(48.0f), height + uj3Var.U);
    }

    public final int Z() {
        float f;
        uj3 uj3Var = this.o0;
        float f2 = uj3Var.O;
        li3 li3Var = uj3Var.H3;
        if (li3Var != null && li3Var.c()) {
            f = uj3Var.H3.e;
        } else {
            f = 0.0f;
        }
        return (int) qd4.A(1.0f, uj3Var.z1, qd4.z(1.0f, f, 1.0f - uj3Var.w3, f2), -getY());
    }

    public final boolean a0(MotionEvent motionEvent, boolean z) {
        int i;
        a aVar;
        uj3 uj3Var = this.o0;
        ij3 ij3Var = uj3Var.A0;
        SparseIntArray sparseIntArray = ij3Var.l0;
        int i2 = ij3Var.L;
        if (z) {
            i = 1;
        } else {
            i = -1;
        }
        int i3 = sparseIntArray.get(i2 + i, -1);
        if (i3 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        uj3Var.p3 = false;
        uj3Var.o3 = true;
        this.i0 = (int) (motionEvent.getX() + uj3Var.l3);
        aVar = ((e) uj3Var).actionBar;
        aVar.setEnabled(false);
        uj3Var.A0.setEnabled(false);
        tj3 tj3Var = uj3Var.f0[1];
        tj3Var.h = i3;
        tj3Var.setVisibility(0);
        uj3Var.k3 = z;
        uj3Var.j5(false);
        uj3Var.n5(true);
        tj3[] tj3VarArr = uj3Var.f0;
        if (z) {
            tj3VarArr[1].setTranslationX(tj3VarArr[0].getMeasuredWidth());
            return true;
        }
        tj3VarArr[1].setTranslationX(-tj3VarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nj3.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.n0.a(this, motionEvent) && !super.dispatchTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        a aVar;
        a aVar2;
        uj3 uj3Var = this.o0;
        if (view == uj3Var.L0) {
            return true;
        }
        if (wma.f0) {
            return super.drawChild(canvas, view, j);
        }
        tj3[] tj3VarArr = uj3Var.f0;
        int i = 0;
        if (view != tj3VarArr[0] && ((tj3VarArr.length <= 1 || view != tj3VarArr[1]) && view != uj3Var.L1 && view != uj3Var.A0)) {
            aVar = ((e) uj3Var).actionBar;
            if (view == aVar && uj3Var.d4 != 1.0f) {
                canvas.save();
                if (uj3Var.e4) {
                    canvas.translate((1.0f - uj3Var.d4) * hl.L(40.0f) * (-1), 0.0f);
                } else {
                    float B = qu6.B(1.0f, uj3Var.d4, 0.05f, 1.0f);
                    canvas.translate((1.0f - uj3Var.d4) * (-hl.L(4.0f)), 0.0f);
                    aVar2 = ((e) uj3Var).actionBar;
                    if (aVar2.getOccupyStatusBar()) {
                        i = hl.m;
                    }
                    canvas.scale(B, B, 0.0f, (a.getCurrentActionBarHeight() / 2.0f) + i);
                }
                boolean drawChild = super.drawChild(canvas, view, j);
                canvas.restore();
                return drawChild;
            }
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        if (view != uj3Var.L1 && view != uj3Var.A0) {
            canvas.clipRect(0.0f, (-getY()) + Z() + Y(), getMeasuredWidth(), getMeasuredHeight());
        }
        float f = uj3Var.d4;
        if (f != 1.0f) {
            if (uj3Var.e4) {
                canvas.translate((1.0f - uj3Var.d4) * hl.L(40.0f) * (-1), 0.0f);
            } else {
                float B2 = qu6.B(1.0f, f, 0.05f, 1.0f);
                canvas.translate((1.0f - uj3Var.d4) * (-hl.L(4.0f)), 0.0f);
                canvas.scale(B2, B2, 0.0f, (-getY()) + uj3Var.O + Y());
            }
        }
        boolean drawChild2 = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild2;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ul ulVar = this.o0.F3;
        if (ulVar != null) {
            ulVar.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ul ulVar = this.o0.F3;
        if (ulVar != null) {
            ulVar.b();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        a aVar;
        ij3 ij3Var;
        int actionMasked = motionEvent.getActionMasked();
        uj3 uj3Var = this.o0;
        if (actionMasked == 1 || actionMasked == 3) {
            aVar = ((e) uj3Var).actionBar;
            if (aVar.z()) {
                uj3Var.a1 = true;
            }
        }
        if (X() || (((ij3Var = uj3Var.A0) != null && ij3Var.Q) || onTouchEvent(motionEvent))) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nj3.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        boolean z;
        a aVar;
        a aVar2;
        int i3;
        a aVar3;
        int i4;
        a aVar4;
        a aVar5;
        int i5;
        uj3 uj3Var = this.o0;
        byte b = uj3Var.a;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size2 > size) {
            z = true;
        } else {
            z = false;
        }
        setMeasuredDimension(size, size2);
        s7 s7Var = uj3Var.n0;
        if (s7Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) s7Var.getLayoutParams();
            aVar5 = ((e) uj3Var).actionBar;
            if (aVar5.getOccupyStatusBar()) {
                i5 = hl.m;
            } else {
                i5 = 0;
            }
            layoutParams.topMargin = i5;
            layoutParams.height = a.getCurrentActionBarHeight();
        }
        aVar = ((e) uj3Var).actionBar;
        measureChildWithMargins(aVar, i, 0, i2, 0);
        int Q = Q();
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt != null && childAt.getVisibility() != 8) {
                aVar2 = ((e) uj3Var).actionBar;
                if (childAt != aVar2) {
                    if (childAt instanceof d93) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                        int size3 = View.MeasureSpec.getSize(i2);
                        int L = hl.L(10.0f);
                        int L2 = hl.L(2.0f) + size3;
                        aVar4 = ((e) uj3Var).actionBar;
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(L, L2 - aVar4.getMeasuredHeight()), 1073741824));
                    } else if (childAt instanceof tj3) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                        int L3 = hl.L(2.0f) + size2;
                        if (uj3Var.H3.c()) {
                            if (uj3Var.x) {
                                L3 = hl.L(50.0f) + L3;
                            }
                            if (uj3Var.L) {
                                L3 = hl.L(81.0f) + L3;
                            }
                            L3 = hl.L(48.0f) + L3;
                        }
                        int i7 = L3 + uj3Var.Q;
                        if (uj3Var.x3 == null) {
                            childAt.setTranslationY(0.0f);
                        }
                        if (uj3Var.f4) {
                            i4 = (int) (i7 * 0.05f);
                        } else {
                            i4 = 0;
                        }
                        childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), i4);
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(hl.L(10.0f), i7 + i4), 1073741824));
                        childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                    } else {
                        bj3 bj3Var = uj3Var.D0;
                        if (childAt == bj3Var) {
                            bj3Var.setTranslationY(uj3Var.J0);
                            uj3Var.D0.s0.setKeyboardHeight(Q);
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(hl.L(b) + View.MeasureSpec.getSize(i2), 1073741824);
                            uj3Var.c3(true);
                            childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                            childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                            Rect rect = hl.Q;
                            aVar3 = ((e) uj3Var).actionBar;
                            rect.set(0, (hl.L(b) + aVar3.getMeasuredHeight()) - hl.L(2.0f), childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                        } else {
                            bi3 bi3Var = uj3Var.D1;
                            if (bi3Var != null && bi3Var.V0(childAt)) {
                                if (hl.E) {
                                    if (hl.O1()) {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(hl.L(320.0f), getPaddingTop() + (size2 - hl.m)), 1073741824));
                                    } else {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size2 - hl.m), 1073741824));
                                    }
                                } else {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                                }
                            } else if (childAt == uj3Var.H3) {
                                int size4 = View.MeasureSpec.getSize(i2);
                                if (uj3Var.f4) {
                                    i3 = (int) (size4 * 0.05f);
                                } else {
                                    i3 = 0;
                                }
                                uj3Var.H3.setTransitionPaddingBottom(i3);
                                childAt.measure(i, View.MeasureSpec.makeMeasureSpec(Math.max(hl.L(10.0f), size4 + i3), 1073741824));
                            } else {
                                measureChildWithMargins(childAt, i, 0, i2, 0);
                            }
                        }
                    }
                }
            }
        }
        if (z != this.m0) {
            post(new mj3(this, (byte) 1));
            this.m0 = z;
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nj3.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        uj3 uj3Var = this.o0;
        if (uj3Var.p3 && !uj3Var.o3) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }
}
