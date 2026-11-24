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
public final class vi3 extends cja {
    public final Paint m0;
    public int n0;
    public int o0;
    public int p0;
    public VelocityTracker q0;
    public final Rect r0;
    public boolean s0;
    public final hi2 t0;
    public final cj3 u0;

    public vi3(cj3 cj3Var, Context context) {
        super(context, null);
        this.u0 = cj3Var;
        this.m0 = new Paint(1);
        this.r0 = new Rect();
        this.t0 = new hi2(new gi3(this));
    }

    @Override
    public final void H(android.graphics.Canvas r9, float r10, android.graphics.Rect r11, android.graphics.Paint r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vi3.H(android.graphics.Canvas, float, android.graphics.Rect, android.graphics.Paint, boolean):void");
    }

    @Override
    public final void J(Canvas canvas, ArrayList arrayList) {
        hi3 hi3Var;
        o39 o;
        cj3 cj3Var = this.u0;
        if (cj3Var.s3 && (hi3Var = cj3Var.D0) != null && hi3Var.getVisibility() == 0) {
            hi3 hi3Var2 = cj3Var.D0;
            View[] viewArr = hi3Var2.e;
            for (int i = 0; i < viewArr.length; i++) {
                View view = viewArr[i];
                if (view != null && view.getVisibility() == 0 && (o = wec.o(viewArr[i])) != null) {
                    for (int i2 = 0; i2 < o.getChildCount(); i2++) {
                        View childAt = o.getChildAt(i2);
                        if (childAt.getY() < gl.L(100.0f) + gl.L(203.0f)) {
                            int save = canvas.save();
                            canvas.translate(viewArr[i].getX(), childAt.getY() + o.getY() + viewArr[i].getY() + hi3Var2.getY());
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
        qw4 qw4Var;
        super.K();
        qw4Var = ((d) this.u0).glassEngine;
        qw4Var.g();
    }

    @Override
    public final boolean N() {
        return true;
    }

    public final boolean X() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vi3.X():boolean");
    }

    public final int Y() {
        a aVar;
        float f;
        cj3 cj3Var = this.u0;
        aVar = ((d) cj3Var).actionBar;
        float height = aVar.getHeight();
        rh3 rh3Var = cj3Var.H3;
        if (rh3Var != null && rh3Var.c()) {
            f = cj3Var.H3.e;
        } else {
            f = 0.0f;
        }
        if (cj3Var.L) {
            height = tb4.A(1.0f, cj3Var.w3, (1.0f - f) * (1.0f - cj3Var.z1) * gl.L(81.0f), height);
        }
        return (int) tb4.A(1.0f, f, (1.0f - cj3Var.z1) * (1.0f - cj3Var.w3) * gl.L(48.0f), height + cj3Var.U);
    }

    public final int Z() {
        float f;
        cj3 cj3Var = this.u0;
        float f2 = cj3Var.O;
        rh3 rh3Var = cj3Var.H3;
        if (rh3Var != null && rh3Var.c()) {
            f = cj3Var.H3.e;
        } else {
            f = 0.0f;
        }
        return (int) tb4.A(1.0f, cj3Var.z1, tb4.z(1.0f, f, 1.0f - cj3Var.w3, f2), -getY());
    }

    public final boolean a0(MotionEvent motionEvent, boolean z) {
        int i;
        a aVar;
        cj3 cj3Var = this.u0;
        qi3 qi3Var = cj3Var.A0;
        SparseIntArray sparseIntArray = qi3Var.k0;
        int i2 = qi3Var.L;
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
        cj3Var.p3 = false;
        cj3Var.o3 = true;
        this.o0 = (int) (motionEvent.getX() + cj3Var.l3);
        aVar = ((d) cj3Var).actionBar;
        aVar.setEnabled(false);
        cj3Var.A0.setEnabled(false);
        bj3 bj3Var = cj3Var.f0[1];
        bj3Var.h = i3;
        bj3Var.setVisibility(0);
        cj3Var.k3 = z;
        cj3Var.f5(false);
        cj3Var.j5(true);
        bj3[] bj3VarArr = cj3Var.f0;
        if (z) {
            bj3VarArr[1].setTranslationX(bj3VarArr[0].getMeasuredWidth());
            return true;
        }
        bj3VarArr[1].setTranslationX(-bj3VarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vi3.dispatchDraw(android.graphics.Canvas):void");
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
        cj3 cj3Var = this.u0;
        if (view == cj3Var.L0) {
            return true;
        }
        if (cja.l0) {
            return super.drawChild(canvas, view, j);
        }
        bj3[] bj3VarArr = cj3Var.f0;
        int i = 0;
        if (view != bj3VarArr[0] && ((bj3VarArr.length <= 1 || view != bj3VarArr[1]) && view != cj3Var.L1 && view != cj3Var.A0)) {
            aVar = ((d) cj3Var).actionBar;
            if (view == aVar && cj3Var.b4 != 1.0f) {
                canvas.save();
                if (cj3Var.c4) {
                    canvas.translate((1.0f - cj3Var.b4) * gl.L(40.0f) * (-1), 0.0f);
                } else {
                    float B = ls6.B(1.0f, cj3Var.b4, 0.05f, 1.0f);
                    canvas.translate((1.0f - cj3Var.b4) * (-gl.L(4.0f)), 0.0f);
                    aVar2 = ((d) cj3Var).actionBar;
                    if (aVar2.getOccupyStatusBar()) {
                        i = gl.m;
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
        if (view != cj3Var.L1 && view != cj3Var.A0) {
            canvas.clipRect(0.0f, (-getY()) + Z() + Y(), getMeasuredWidth(), getMeasuredHeight());
        }
        float f = cj3Var.b4;
        if (f != 1.0f) {
            if (cj3Var.c4) {
                canvas.translate((1.0f - cj3Var.b4) * gl.L(40.0f) * (-1), 0.0f);
            } else {
                float B2 = ls6.B(1.0f, f, 0.05f, 1.0f);
                canvas.translate((1.0f - cj3Var.b4) * (-gl.L(4.0f)), 0.0f);
                canvas.scale(B2, B2, 0.0f, (-getY()) + cj3Var.O + Y());
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
        tl tlVar = this.u0.F3;
        if (tlVar != null) {
            tlVar.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        tl tlVar = this.u0.F3;
        if (tlVar != null) {
            tlVar.b();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        a aVar;
        qi3 qi3Var;
        int actionMasked = motionEvent.getActionMasked();
        cj3 cj3Var = this.u0;
        if (actionMasked == 1 || actionMasked == 3) {
            aVar = ((d) cj3Var).actionBar;
            if (aVar.y()) {
                cj3Var.a1 = true;
            }
        }
        if (X() || (((qi3Var = cj3Var.A0) != null && qi3Var.P) || onTouchEvent(motionEvent))) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vi3.onLayout(boolean, int, int, int, int):void");
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
        cj3 cj3Var = this.u0;
        byte b = cj3Var.a;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size2 > size) {
            z = true;
        } else {
            z = false;
        }
        setMeasuredDimension(size, size2);
        r7 r7Var = cj3Var.n0;
        if (r7Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) r7Var.getLayoutParams();
            aVar5 = ((d) cj3Var).actionBar;
            if (aVar5.getOccupyStatusBar()) {
                i5 = gl.m;
            } else {
                i5 = 0;
            }
            layoutParams.topMargin = i5;
            layoutParams.height = a.getCurrentActionBarHeight();
        }
        aVar = ((d) cj3Var).actionBar;
        measureChildWithMargins(aVar, i, 0, i2, 0);
        int Q = Q();
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt != null && childAt.getVisibility() != 8) {
                aVar2 = ((d) cj3Var).actionBar;
                if (childAt != aVar2) {
                    if (childAt instanceof k83) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                        int size3 = View.MeasureSpec.getSize(i2);
                        int L = gl.L(10.0f);
                        int L2 = gl.L(2.0f) + size3;
                        aVar4 = ((d) cj3Var).actionBar;
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(L, L2 - aVar4.getMeasuredHeight()), 1073741824));
                    } else if (childAt instanceof bj3) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                        int L3 = gl.L(2.0f) + size2;
                        if (cj3Var.H3.c()) {
                            if (cj3Var.x) {
                                L3 = gl.L(50.0f) + L3;
                            }
                            if (cj3Var.L) {
                                L3 = gl.L(81.0f) + L3;
                            }
                            L3 = gl.L(48.0f) + L3;
                        }
                        int i7 = L3 + cj3Var.Q;
                        if (cj3Var.x3 == null) {
                            childAt.setTranslationY(0.0f);
                        }
                        if (cj3Var.d4) {
                            i4 = (int) (i7 * 0.05f);
                        } else {
                            i4 = 0;
                        }
                        childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), i4);
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(gl.L(10.0f), i7 + i4), 1073741824));
                        childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                    } else {
                        hi3 hi3Var = cj3Var.D0;
                        if (childAt == hi3Var) {
                            hi3Var.setTranslationY(cj3Var.J0);
                            cj3Var.D0.s0.setKeyboardHeight(Q);
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(gl.L(b) + View.MeasureSpec.getSize(i2), 1073741824);
                            cj3Var.a3(true);
                            childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                            childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                            Rect rect = gl.Q;
                            aVar3 = ((d) cj3Var).actionBar;
                            rect.set(0, (gl.L(b) + aVar3.getMeasuredHeight()) - gl.L(2.0f), childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                        } else {
                            hh3 hh3Var = cj3Var.D1;
                            if (hh3Var != null && hh3Var.R0(childAt)) {
                                if (gl.E) {
                                    if (gl.O1()) {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(gl.L(320.0f), getPaddingTop() + (size2 - gl.m)), 1073741824));
                                    } else {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size2 - gl.m), 1073741824));
                                    }
                                } else {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                                }
                            } else if (childAt == cj3Var.H3) {
                                int size4 = View.MeasureSpec.getSize(i2);
                                if (cj3Var.d4) {
                                    i3 = (int) (size4 * 0.05f);
                                } else {
                                    i3 = 0;
                                }
                                cj3Var.H3.setTransitionPaddingBottom(i3);
                                childAt.measure(i, View.MeasureSpec.makeMeasureSpec(Math.max(gl.L(10.0f), size4 + i3), 1073741824));
                            } else {
                                measureChildWithMargins(childAt, i, 0, i2, 0);
                            }
                        }
                    }
                }
            }
        }
        if (z != this.s0) {
            post(new ui3(this, (byte) 1));
            this.s0 = z;
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vi3.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        cj3 cj3Var = this.u0;
        if (cj3Var.p3 && !cj3Var.o3) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }
}
