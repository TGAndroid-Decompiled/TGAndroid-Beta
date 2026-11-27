package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
public final class iy0 extends wma {
    public final byte g0;
    public boolean h0;
    public final Object i0;

    public iy0(ny0 ny0Var, Context context, boolean z, boolean z2) {
        super(context, null);
        this.g0 = (byte) 0;
        this.i0 = ny0Var;
        this.h0 = z;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.g0) {
            case 0:
                ny0 ny0Var = (ny0) this.i0;
                ny0Var.S0(canvas, this);
                super.dispatchDraw(canvas);
                ny0Var.R0(canvas, this);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.g0) {
            case 0:
                ny0 ny0Var = (ny0) this.i0;
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ny0Var.s0.getBounds().top) {
                    ny0Var.dismiss();
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        switch (this.g0) {
            case 0:
                return super.drawChild(canvas, view, j);
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override
    public final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iy0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        float f;
        int i4;
        lt3 lt3Var;
        a aVar;
        a aVar2;
        float f2;
        float f3;
        a aVar3;
        a aVar4;
        float f4;
        int i5;
        float f5;
        byte b = this.g0;
        Object obj = this.i0;
        int i6 = 0;
        switch (b) {
            case 0:
                ny0 ny0Var = (ny0) obj;
                ny0Var.q1 = View.MeasureSpec.getSize(i2);
                ny0Var.O0(i, i2);
                if (this.h0) {
                    i3 = View.MeasureSpec.makeMeasureSpec(ny0Var.q1, 1073741824);
                } else {
                    i3 = i2;
                }
                if (ny0Var.K1 != null) {
                    int size = View.MeasureSpec.getSize(i);
                    int size2 = View.MeasureSpec.getSize(i3);
                    setMeasuredDimension(size, size2);
                    lt3 lt3Var2 = ny0Var.K1;
                    if (lt3Var2 != null && !lt3Var2.O && hl.L(20.0f) >= 0) {
                        lt3 lt3Var3 = ny0Var.K1;
                        if (!lt3Var3.e && !lt3Var3.P) {
                            lt3Var3.j();
                        }
                    }
                    if (hl.L(20.0f) >= 0) {
                        if (!ny0Var.d && (lt3Var = ny0Var.K1) != null) {
                            i4 = lt3Var.getEmojiPadding();
                        } else {
                            i4 = 0;
                        }
                        if (!hl.E) {
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
                            lt3 lt3Var4 = ny0Var.K1;
                            if (lt3Var4 != null && lt3Var4.l(childAt)) {
                                if (!hl.E && !hl.O1()) {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                                } else if (hl.O1()) {
                                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                                    if (hl.O1()) {
                                        f = 200.0f;
                                    } else {
                                        f = 320.0f;
                                    }
                                    childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.min(hl.L(f), getPaddingTop() + (i8 - hl.m)), 1073741824));
                                } else {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (i8 - hl.m), 1073741824));
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
                gi1 gi1Var = (gi1) obj;
                aVar = ((e) gi1Var).actionBar;
                measureChildWithMargins(aVar, i, 0, i2, 0);
                if (Q() > hl.L(20.0f)) {
                    this.h0 = true;
                    gi1Var.d.j();
                    this.h0 = false;
                }
                int childCount2 = getChildCount();
                while (i6 < childCount2) {
                    View childAt2 = getChildAt(i6);
                    if (childAt2 != null && childAt2.getVisibility() != 8) {
                        aVar2 = ((e) gi1Var).actionBar;
                        if (childAt2 != aVar2) {
                            iu3 iu3Var = gi1Var.d;
                            if (iu3Var != null && iu3Var.l(childAt2)) {
                                if (!hl.E && !hl.O1()) {
                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt2.getLayoutParams().height, 1073741824));
                                } else if (hl.O1()) {
                                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
                                    if (hl.O1()) {
                                        f2 = 200.0f;
                                    } else {
                                        f2 = 320.0f;
                                    }
                                    childAt2.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.min(hl.L(f2), getPaddingTop() + (paddingTop - hl.m)), 1073741824));
                                } else {
                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop - hl.m), 1073741824));
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
                g92 g92Var = (g92) obj;
                measureChildWithMargins(g92.Y(g92Var), i, 0, i2, 0);
                if (Q() > hl.L(20.0f)) {
                    this.h0 = true;
                    g92Var.w.j();
                    this.h0 = false;
                }
                int childCount3 = getChildCount();
                while (i6 < childCount3) {
                    View childAt3 = getChildAt(i6);
                    if (childAt3 != null && childAt3.getVisibility() != 8 && childAt3 != g92.Z(g92Var)) {
                        iu3 iu3Var2 = g92Var.w;
                        if (iu3Var2 != null && iu3Var2.l(childAt3)) {
                            if (!hl.E && !hl.O1()) {
                                childAt3.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt3.getLayoutParams().height, 1073741824));
                            } else if (hl.O1()) {
                                int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size5, 1073741824);
                                if (hl.O1()) {
                                    f3 = 200.0f;
                                } else {
                                    f3 = 320.0f;
                                }
                                childAt3.measure(makeMeasureSpec3, View.MeasureSpec.makeMeasureSpec(Math.min(hl.L(f3), getPaddingTop() + (paddingTop2 - hl.m)), 1073741824));
                            } else {
                                childAt3.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop2 - hl.m), 1073741824));
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
                xc5 xc5Var = (xc5) obj;
                aVar3 = ((e) xc5Var).actionBar;
                measureChildWithMargins(aVar3, i, 0, i2, 0);
                if (Q() > hl.L(20.0f)) {
                    iu3 iu3Var3 = xc5Var.c;
                    if (!iu3Var3.e) {
                        this.h0 = true;
                        iu3Var3.j();
                        this.h0 = false;
                    }
                }
                int childCount4 = getChildCount();
                while (i6 < childCount4) {
                    View childAt4 = getChildAt(i6);
                    if (childAt4 != null && childAt4.getVisibility() != 8) {
                        aVar4 = ((e) xc5Var).actionBar;
                        if (childAt4 != aVar4) {
                            iu3 iu3Var4 = xc5Var.c;
                            if (iu3Var4 != null && iu3Var4.l(childAt4)) {
                                if (!hl.E && !hl.O1()) {
                                    childAt4.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt4.getLayoutParams().height, 1073741824));
                                } else if (hl.O1()) {
                                    int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size7, 1073741824);
                                    if (hl.O1()) {
                                        f4 = 200.0f;
                                    } else {
                                        f4 = 320.0f;
                                    }
                                    childAt4.measure(makeMeasureSpec4, View.MeasureSpec.makeMeasureSpec(Math.min(hl.L(f4), getPaddingTop() + (paddingTop3 - hl.m)), 1073741824));
                                } else {
                                    childAt4.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop3 - hl.m), 1073741824));
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
                wh8 wh8Var = (wh8) obj;
                int i9 = i;
                measureChildWithMargins(wh8.d0(wh8Var), i9, 0, i2, 0);
                int Q = Q();
                if (Q > hl.L(20.0f) && !wh8Var.Q && !wh8Var.C0) {
                    this.h0 = true;
                    wh8Var.m0();
                    this.h0 = false;
                }
                if (Q <= hl.L(20.0f) && !hl.E && !hl.O1()) {
                    i5 = wh8Var.W;
                } else {
                    i5 = 0;
                }
                if (Q > hl.L(20.0f) && wh8Var.C0) {
                    i5 = hl.L(120.0f);
                }
                int i10 = i5;
                int childCount5 = getChildCount();
                while (i6 < childCount5) {
                    View childAt5 = getChildAt(i6);
                    if (childAt5 != null && childAt5.getVisibility() != 8 && childAt5 != wh8.e0(wh8Var)) {
                        o24 o24Var = wh8Var.S;
                        if (o24Var != null && o24Var == childAt5) {
                            if (!hl.E && !hl.O1()) {
                                childAt5.measure(View.MeasureSpec.makeMeasureSpec(size9, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt5.getLayoutParams().height, 1073741824));
                            } else if (hl.O1()) {
                                int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(size9, 1073741824);
                                if (hl.O1()) {
                                    f5 = 200.0f;
                                } else {
                                    f5 = 320.0f;
                                }
                                childAt5.measure(makeMeasureSpec5, View.MeasureSpec.makeMeasureSpec(Math.min(hl.L(f5), getPaddingTop() + (paddingTop4 - hl.m)), 1073741824));
                            } else {
                                childAt5.measure(View.MeasureSpec.makeMeasureSpec(size9, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop4 - hl.m), 1073741824));
                            }
                        } else if (wh8Var.c == childAt5) {
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
        switch (this.g0) {
            case 1:
                if (!this.h0) {
                    super.requestLayout();
                    return;
                }
                return;
            case 2:
                if (!this.h0) {
                    super.requestLayout();
                    return;
                }
                return;
            case 3:
                if (!this.h0) {
                    super.requestLayout();
                    return;
                }
                return;
            case 4:
                if (!this.h0) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                super.requestLayout();
                return;
        }
    }

    public iy0(e eVar, Context context, byte b) {
        super(context, null);
        this.g0 = b;
        this.i0 = eVar;
    }
}
