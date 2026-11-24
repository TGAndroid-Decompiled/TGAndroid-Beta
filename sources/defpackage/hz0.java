package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public final class hz0 extends ela {
    public final byte m0;
    public boolean n0;
    public final Object o0;

    public hz0(mz0 mz0Var, Context context, boolean z, boolean z2) {
        super(context, null);
        this.m0 = (byte) 0;
        this.o0 = mz0Var;
        this.n0 = z;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.m0) {
            case 0:
                mz0 mz0Var = (mz0) this.o0;
                mz0Var.R0(canvas, this);
                super.dispatchDraw(canvas);
                mz0Var.Q0(canvas, this);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.m0) {
            case 0:
                mz0 mz0Var = (mz0) this.o0;
                if (motionEvent.getAction() == 0 && motionEvent.getY() < mz0Var.s0.getBounds().top) {
                    mz0Var.dismiss();
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        switch (this.m0) {
            case 0:
                return super.drawChild(canvas, view, j);
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override
    public final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hz0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        float f;
        int i4;
        du3 du3Var;
        a aVar;
        a aVar2;
        float f2;
        float f3;
        a aVar3;
        a aVar4;
        float f4;
        int i5;
        float f5;
        byte b = this.m0;
        Object obj = this.o0;
        int i6 = 0;
        switch (b) {
            case 0:
                mz0 mz0Var = (mz0) obj;
                mz0Var.q1 = View.MeasureSpec.getSize(i2);
                mz0Var.N0(i, i2);
                if (this.n0) {
                    i3 = View.MeasureSpec.makeMeasureSpec(mz0Var.q1, 1073741824);
                } else {
                    i3 = i2;
                }
                if (mz0Var.K1 != null) {
                    int size = View.MeasureSpec.getSize(i);
                    int size2 = View.MeasureSpec.getSize(i3);
                    setMeasuredDimension(size, size2);
                    du3 du3Var2 = mz0Var.K1;
                    if (du3Var2 != null && !du3Var2.O && gm.L(20.0f) >= 0) {
                        du3 du3Var3 = mz0Var.K1;
                        if (!du3Var3.e && !du3Var3.P) {
                            du3Var3.j();
                        }
                    }
                    if (gm.L(20.0f) >= 0) {
                        if (!mz0Var.d && (du3Var = mz0Var.K1) != null) {
                            i4 = du3Var.getEmojiPadding();
                        } else {
                            i4 = 0;
                        }
                        if (!gm.E) {
                            size2 -= i4;
                            i3 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
                        }
                    }
                    int i7 = i3;
                    int i8 = size2;
                    int childCount = getChildCount();
                    while (i6 < childCount) {
                        View childAt = getChildAt(i6);
                        if (childAt != null && childAt.getVisibility() != 8) {
                            du3 du3Var4 = mz0Var.K1;
                            if (du3Var4 != null && du3Var4.l(childAt)) {
                                if (!gm.E && !gm.O1()) {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                                } else if (gm.O1()) {
                                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                                    if (gm.O1()) {
                                        f = 200.0f;
                                    } else {
                                        f = 320.0f;
                                    }
                                    childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.min(gm.L(f), getPaddingTop() + (i8 - gm.m)), 1073741824));
                                } else {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (i8 - gm.m), 1073741824));
                                }
                            } else {
                                measureChildWithMargins(childAt, i, 0, i7, 0);
                            }
                        }
                        i6++;
                    }
                    return;
                }
                super.onMeasure(i, i3);
                return;
            case 1:
                int size3 = View.MeasureSpec.getSize(i);
                int size4 = View.MeasureSpec.getSize(i2);
                setMeasuredDimension(size3, size4);
                int paddingTop = size4 - getPaddingTop();
                fj1 fj1Var = (fj1) obj;
                aVar = ((d) fj1Var).actionBar;
                measureChildWithMargins(aVar, i, 0, i2, 0);
                if (Q() > gm.L(20.0f)) {
                    this.n0 = true;
                    fj1Var.d.j();
                    this.n0 = false;
                }
                int childCount2 = getChildCount();
                while (i6 < childCount2) {
                    View childAt2 = getChildAt(i6);
                    if (childAt2 != null && childAt2.getVisibility() != 8) {
                        aVar2 = ((d) fj1Var).actionBar;
                        if (childAt2 != aVar2) {
                            cv3 cv3Var = fj1Var.d;
                            if (cv3Var != null && cv3Var.l(childAt2)) {
                                if (!gm.E && !gm.O1()) {
                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt2.getLayoutParams().height, 1073741824));
                                } else if (gm.O1()) {
                                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
                                    if (gm.O1()) {
                                        f2 = 200.0f;
                                    } else {
                                        f2 = 320.0f;
                                    }
                                    childAt2.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.min(gm.L(f2), getPaddingTop() + (paddingTop - gm.m)), 1073741824));
                                } else {
                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop - gm.m), 1073741824));
                                }
                            } else {
                                measureChildWithMargins(childAt2, i, 0, i2, 0);
                            }
                        }
                    }
                    i6++;
                }
                return;
            case 2:
                int size5 = View.MeasureSpec.getSize(i);
                int size6 = View.MeasureSpec.getSize(i2);
                setMeasuredDimension(size5, size6);
                int paddingTop2 = size6 - getPaddingTop();
                ba2 ba2Var = (ba2) obj;
                measureChildWithMargins(ba2.Z(ba2Var), i, 0, i2, 0);
                if (Q() > gm.L(20.0f)) {
                    this.n0 = true;
                    ba2Var.w.j();
                    this.n0 = false;
                }
                int childCount3 = getChildCount();
                while (i6 < childCount3) {
                    View childAt3 = getChildAt(i6);
                    if (childAt3 != null && childAt3.getVisibility() != 8 && childAt3 != ba2.a0(ba2Var)) {
                        cv3 cv3Var2 = ba2Var.w;
                        if (cv3Var2 != null && cv3Var2.l(childAt3)) {
                            if (!gm.E && !gm.O1()) {
                                childAt3.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt3.getLayoutParams().height, 1073741824));
                            } else if (gm.O1()) {
                                int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size5, 1073741824);
                                if (gm.O1()) {
                                    f3 = 200.0f;
                                } else {
                                    f3 = 320.0f;
                                }
                                childAt3.measure(makeMeasureSpec3, View.MeasureSpec.makeMeasureSpec(Math.min(gm.L(f3), getPaddingTop() + (paddingTop2 - gm.m)), 1073741824));
                            } else {
                                childAt3.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop2 - gm.m), 1073741824));
                            }
                        } else {
                            measureChildWithMargins(childAt3, i, 0, i2, 0);
                        }
                    }
                    i6++;
                }
                return;
            case 3:
                int size7 = View.MeasureSpec.getSize(i);
                int size8 = View.MeasureSpec.getSize(i2);
                setMeasuredDimension(size7, size8);
                int paddingTop3 = size8 - getPaddingTop();
                uc5 uc5Var = (uc5) obj;
                aVar3 = ((d) uc5Var).actionBar;
                measureChildWithMargins(aVar3, i, 0, i2, 0);
                if (Q() > gm.L(20.0f)) {
                    cv3 cv3Var3 = uc5Var.c;
                    if (!cv3Var3.e) {
                        this.n0 = true;
                        cv3Var3.j();
                        this.n0 = false;
                    }
                }
                int childCount4 = getChildCount();
                while (i6 < childCount4) {
                    View childAt4 = getChildAt(i6);
                    if (childAt4 != null && childAt4.getVisibility() != 8) {
                        aVar4 = ((d) uc5Var).actionBar;
                        if (childAt4 != aVar4) {
                            cv3 cv3Var4 = uc5Var.c;
                            if (cv3Var4 != null && cv3Var4.l(childAt4)) {
                                if (!gm.E && !gm.O1()) {
                                    childAt4.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt4.getLayoutParams().height, 1073741824));
                                } else if (gm.O1()) {
                                    int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size7, 1073741824);
                                    if (gm.O1()) {
                                        f4 = 200.0f;
                                    } else {
                                        f4 = 320.0f;
                                    }
                                    childAt4.measure(makeMeasureSpec4, View.MeasureSpec.makeMeasureSpec(Math.min(gm.L(f4), getPaddingTop() + (paddingTop3 - gm.m)), 1073741824));
                                } else {
                                    childAt4.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop3 - gm.m), 1073741824));
                                }
                            } else {
                                measureChildWithMargins(childAt4, i, 0, i2, 0);
                            }
                        }
                    }
                    i6++;
                }
                return;
            default:
                int size9 = View.MeasureSpec.getSize(i);
                int size10 = View.MeasureSpec.getSize(i2);
                setMeasuredDimension(size9, size10);
                int paddingTop4 = size10 - getPaddingTop();
                kg8 kg8Var = (kg8) obj;
                int i9 = i;
                measureChildWithMargins(kg8.e0(kg8Var), i9, 0, i2, 0);
                int Q = Q();
                if (Q > gm.L(20.0f) && !kg8Var.Q && !kg8Var.C0) {
                    this.n0 = true;
                    kg8Var.n0();
                    this.n0 = false;
                }
                if (Q <= gm.L(20.0f) && !gm.E && !gm.O1()) {
                    i5 = kg8Var.W;
                } else {
                    i5 = 0;
                }
                if (Q > gm.L(20.0f) && kg8Var.C0) {
                    i5 = gm.L(120.0f);
                }
                int i10 = i5;
                int childCount5 = getChildCount();
                while (i6 < childCount5) {
                    View childAt5 = getChildAt(i6);
                    if (childAt5 != null && childAt5.getVisibility() != 8 && childAt5 != kg8.f0(kg8Var)) {
                        e34 e34Var = kg8Var.S;
                        if (e34Var != null && e34Var == childAt5) {
                            if (!gm.E && !gm.O1()) {
                                childAt5.measure(View.MeasureSpec.makeMeasureSpec(size9, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt5.getLayoutParams().height, 1073741824));
                            } else if (gm.O1()) {
                                int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(size9, 1073741824);
                                if (gm.O1()) {
                                    f5 = 200.0f;
                                } else {
                                    f5 = 320.0f;
                                }
                                childAt5.measure(makeMeasureSpec5, View.MeasureSpec.makeMeasureSpec(Math.min(gm.L(f5), getPaddingTop() + (paddingTop4 - gm.m)), 1073741824));
                            } else {
                                childAt5.measure(View.MeasureSpec.makeMeasureSpec(size9, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop4 - gm.m), 1073741824));
                            }
                        } else if (kg8Var.c == childAt5) {
                            childAt5.measure(i9, View.MeasureSpec.makeMeasureSpec(paddingTop4 - i10, 1073741824));
                        } else {
                            measureChildWithMargins(childAt5, i9, 0, i2, 0);
                        }
                    }
                    i6++;
                    i9 = i;
                }
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.m0) {
            case 1:
                if (!this.n0) {
                    super.requestLayout();
                    return;
                }
                return;
            case 2:
                if (!this.n0) {
                    super.requestLayout();
                    return;
                }
                return;
            case 3:
                if (!this.n0) {
                    super.requestLayout();
                    return;
                }
                return;
            case 4:
                if (!this.n0) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                super.requestLayout();
                return;
        }
    }

    public hz0(d dVar, Context context, byte b) {
        super(context, null);
        this.m0 = b;
        this.o0 = dVar;
    }
}
