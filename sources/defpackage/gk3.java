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
import org.telegram.ui.ActionBar.d;
public final class gk3 extends ela {
    public final Paint m0;
    public int n0;
    public int o0;
    public int p0;
    public VelocityTracker q0;
    public final Rect r0;
    public boolean s0;
    public final vj2 t0;
    public final nk3 u0;

    public gk3(nk3 nk3Var, Context context) {
        super(context, null);
        this.u0 = nk3Var;
        this.m0 = new Paint(1);
        this.r0 = new Rect();
        this.t0 = new vj2(new fk3(this));
    }

    @Override
    public final void H(android.graphics.Canvas r9, float r10, android.graphics.Rect r11, android.graphics.Paint r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gk3.H(android.graphics.Canvas, float, android.graphics.Rect, android.graphics.Paint, boolean):void");
    }

    @Override
    public final void J(Canvas canvas, ArrayList arrayList) {
        sj3 sj3Var;
        r59 n;
        nk3 nk3Var = this.u0;
        if (nk3Var.s3 && (sj3Var = nk3Var.D0) != null && sj3Var.getVisibility() == 0) {
            sj3 sj3Var2 = nk3Var.D0;
            View[] viewArr = sj3Var2.e;
            for (int i = 0; i < viewArr.length; i++) {
                View view = viewArr[i];
                if (view != null && view.getVisibility() == 0 && (n = wgc.n(viewArr[i])) != null) {
                    for (int i2 = 0; i2 < n.getChildCount(); i2++) {
                        View childAt = n.getChildAt(i2);
                        if (childAt.getY() < gm.L(100.0f) + gm.L(203.0f)) {
                            int save = canvas.save();
                            canvas.translate(viewArr[i].getX(), childAt.getY() + n.getY() + viewArr[i].getY() + sj3Var2.getY());
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
        sy4 sy4Var;
        super.K();
        sy4Var = ((d) this.u0).glassEngine;
        sy4Var.g();
    }

    @Override
    public final boolean N() {
        return true;
    }

    public final boolean X() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gk3.X():boolean");
    }

    public final int Y() {
        a aVar;
        float f;
        nk3 nk3Var = this.u0;
        aVar = ((d) nk3Var).actionBar;
        float height = aVar.getHeight();
        dj3 dj3Var = nk3Var.H3;
        if (dj3Var != null && dj3Var.c()) {
            f = nk3Var.H3.e;
        } else {
            f = 0.0f;
        }
        if (nk3Var.L) {
            height = td4.A(1.0f, nk3Var.w3, (1.0f - f) * (1.0f - nk3Var.z1) * gm.L(81.0f), height);
        }
        return (int) td4.A(1.0f, f, (1.0f - nk3Var.z1) * (1.0f - nk3Var.w3) * gm.L(48.0f), height + nk3Var.U);
    }

    public final int Z() {
        float f;
        nk3 nk3Var = this.u0;
        float f2 = nk3Var.O;
        dj3 dj3Var = nk3Var.H3;
        if (dj3Var != null && dj3Var.c()) {
            f = nk3Var.H3.e;
        } else {
            f = 0.0f;
        }
        return (int) td4.A(1.0f, nk3Var.z1, td4.z(1.0f, f, 1.0f - nk3Var.w3, f2), -getY());
    }

    public final boolean a0(MotionEvent motionEvent, boolean z) {
        int i;
        a aVar;
        nk3 nk3Var = this.u0;
        ak3 ak3Var = nk3Var.A0;
        SparseIntArray sparseIntArray = ak3Var.k0;
        int i2 = ak3Var.L;
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
        nk3Var.p3 = false;
        nk3Var.o3 = true;
        this.o0 = (int) (motionEvent.getX() + nk3Var.l3);
        aVar = ((d) nk3Var).actionBar;
        aVar.setEnabled(false);
        nk3Var.A0.setEnabled(false);
        mk3 mk3Var = nk3Var.f0[1];
        mk3Var.h = i3;
        mk3Var.setVisibility(0);
        nk3Var.k3 = z;
        nk3Var.j5(false);
        nk3Var.n5(true);
        mk3[] mk3VarArr = nk3Var.f0;
        if (z) {
            mk3VarArr[1].setTranslationX(mk3VarArr[0].getMeasuredWidth());
            return true;
        }
        mk3VarArr[1].setTranslationX(-mk3VarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gk3.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.t0.a(this, motionEvent) && !super.dispatchTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        a aVar;
        a aVar2;
        nk3 nk3Var = this.u0;
        if (view == nk3Var.L0) {
            return true;
        }
        if (ela.l0) {
            return super.drawChild(canvas, view, j);
        }
        mk3[] mk3VarArr = nk3Var.f0;
        int i = 0;
        if (view != mk3VarArr[0] && ((mk3VarArr.length <= 1 || view != mk3VarArr[1]) && view != nk3Var.L1 && view != nk3Var.A0)) {
            aVar = ((d) nk3Var).actionBar;
            if (view == aVar && nk3Var.d4 != 1.0f) {
                canvas.save();
                if (nk3Var.e4) {
                    canvas.translate((1.0f - nk3Var.d4) * gm.L(40.0f) * (-1), 0.0f);
                } else {
                    float B = kt6.B(1.0f, nk3Var.d4, 0.05f, 1.0f);
                    canvas.translate((1.0f - nk3Var.d4) * (-gm.L(4.0f)), 0.0f);
                    aVar2 = ((d) nk3Var).actionBar;
                    if (aVar2.getOccupyStatusBar()) {
                        i = gm.m;
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
        if (view != nk3Var.L1 && view != nk3Var.A0) {
            canvas.clipRect(0.0f, (-getY()) + Z() + Y(), getMeasuredWidth(), getMeasuredHeight());
        }
        float f = nk3Var.d4;
        if (f != 1.0f) {
            if (nk3Var.e4) {
                canvas.translate((1.0f - nk3Var.d4) * gm.L(40.0f) * (-1), 0.0f);
            } else {
                float B2 = kt6.B(1.0f, f, 0.05f, 1.0f);
                canvas.translate((1.0f - nk3Var.d4) * (-gm.L(4.0f)), 0.0f);
                canvas.scale(B2, B2, 0.0f, (-getY()) + nk3Var.O + Y());
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
        tm tmVar = this.u0.F3;
        if (tmVar != null) {
            tmVar.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        tm tmVar = this.u0.F3;
        if (tmVar != null) {
            tmVar.b();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        a aVar;
        ak3 ak3Var;
        int actionMasked = motionEvent.getActionMasked();
        nk3 nk3Var = this.u0;
        if (actionMasked == 1 || actionMasked == 3) {
            aVar = ((d) nk3Var).actionBar;
            if (aVar.y()) {
                nk3Var.a1 = true;
            }
        }
        if (X() || (((ak3Var = nk3Var.A0) != null && ak3Var.P) || onTouchEvent(motionEvent))) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gk3.onLayout(boolean, int, int, int, int):void");
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
        nk3 nk3Var = this.u0;
        byte b = nk3Var.a;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size2 > size) {
            z = true;
        } else {
            z = false;
        }
        setMeasuredDimension(size, size2);
        r7 r7Var = nk3Var.n0;
        if (r7Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) r7Var.getLayoutParams();
            aVar5 = ((d) nk3Var).actionBar;
            if (aVar5.getOccupyStatusBar()) {
                i5 = gm.m;
            } else {
                i5 = 0;
            }
            layoutParams.topMargin = i5;
            layoutParams.height = a.getCurrentActionBarHeight();
        }
        aVar = ((d) nk3Var).actionBar;
        measureChildWithMargins(aVar, i, 0, i2, 0);
        int Q = Q();
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt != null && childAt.getVisibility() != 8) {
                aVar2 = ((d) nk3Var).actionBar;
                if (childAt != aVar2) {
                    if (childAt instanceof w93) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                        int size3 = View.MeasureSpec.getSize(i2);
                        int L = gm.L(10.0f);
                        int L2 = gm.L(2.0f) + size3;
                        aVar4 = ((d) nk3Var).actionBar;
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(L, L2 - aVar4.getMeasuredHeight()), 1073741824));
                    } else if (childAt instanceof mk3) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                        int L3 = gm.L(2.0f) + size2;
                        if (nk3Var.H3.c()) {
                            if (nk3Var.x) {
                                L3 = gm.L(50.0f) + L3;
                            }
                            if (nk3Var.L) {
                                L3 = gm.L(81.0f) + L3;
                            }
                            L3 = gm.L(48.0f) + L3;
                        }
                        int i7 = L3 + nk3Var.Q;
                        if (nk3Var.x3 == null) {
                            childAt.setTranslationY(0.0f);
                        }
                        if (nk3Var.f4) {
                            i4 = (int) (i7 * 0.05f);
                        } else {
                            i4 = 0;
                        }
                        childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), i4);
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(gm.L(10.0f), i7 + i4), 1073741824));
                        childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                    } else {
                        sj3 sj3Var = nk3Var.D0;
                        if (childAt == sj3Var) {
                            sj3Var.setTranslationY(nk3Var.J0);
                            nk3Var.D0.s0.setKeyboardHeight(Q);
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(gm.L(b) + View.MeasureSpec.getSize(i2), 1073741824);
                            nk3Var.c3(true);
                            childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                            childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                            Rect rect = gm.Q;
                            aVar3 = ((d) nk3Var).actionBar;
                            rect.set(0, (gm.L(b) + aVar3.getMeasuredHeight()) - gm.L(2.0f), childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                        } else {
                            ti3 ti3Var = nk3Var.D1;
                            if (ti3Var != null && ti3Var.S0(childAt)) {
                                if (gm.E) {
                                    if (gm.O1()) {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(gm.L(320.0f), getPaddingTop() + (size2 - gm.m)), 1073741824));
                                    } else {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size2 - gm.m), 1073741824));
                                    }
                                } else {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                                }
                            } else if (childAt == nk3Var.H3) {
                                int size4 = View.MeasureSpec.getSize(i2);
                                if (nk3Var.f4) {
                                    i3 = (int) (size4 * 0.05f);
                                } else {
                                    i3 = 0;
                                }
                                nk3Var.H3.setTransitionPaddingBottom(i3);
                                childAt.measure(i, View.MeasureSpec.makeMeasureSpec(Math.max(gm.L(10.0f), size4 + i3), 1073741824));
                            } else {
                                measureChildWithMargins(childAt, i, 0, i2, 0);
                            }
                        }
                    }
                }
            }
        }
        if (z != this.s0) {
            post(new ek3(this, (byte) 1));
            this.s0 = z;
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gk3.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        nk3 nk3Var = this.u0;
        if (nk3Var.p3 && !nk3Var.o3) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }
}
