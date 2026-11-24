package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public final class ay0 extends cja {
    public final byte m0;
    public boolean n0;
    public final Object o0;

    public ay0(fy0 fy0Var, Context context, boolean z, boolean z2) {
        super(context, null);
        this.m0 = (byte) 0;
        this.o0 = fy0Var;
        this.n0 = z;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.m0) {
            case 0:
                fy0 fy0Var = (fy0) this.o0;
                fy0Var.R0(canvas, this);
                super.dispatchDraw(canvas);
                fy0Var.Q0(canvas, this);
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
                fy0 fy0Var = (fy0) this.o0;
                if (motionEvent.getAction() == 0 && motionEvent.getY() < fy0Var.s0.getBounds().top) {
                    fy0Var.dismiss();
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ay0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        float f;
        int i4;
        ts3 ts3Var;
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
                fy0 fy0Var = (fy0) obj;
                fy0Var.q1 = View.MeasureSpec.getSize(i2);
                fy0Var.N0(i, i2);
                if (this.n0) {
                    i3 = View.MeasureSpec.makeMeasureSpec(fy0Var.q1, 1073741824);
                } else {
                    i3 = i2;
                }
                if (fy0Var.K1 != null) {
                    int size = View.MeasureSpec.getSize(i);
                    int size2 = View.MeasureSpec.getSize(i3);
                    setMeasuredDimension(size, size2);
                    ts3 ts3Var2 = fy0Var.K1;
                    if (ts3Var2 != null && !ts3Var2.O && gl.L(20.0f) >= 0) {
                        ts3 ts3Var3 = fy0Var.K1;
                        if (!ts3Var3.e && !ts3Var3.P) {
                            ts3Var3.j();
                        }
                    }
                    if (gl.L(20.0f) >= 0) {
                        if (!fy0Var.d && (ts3Var = fy0Var.K1) != null) {
                            i4 = ts3Var.getEmojiPadding();
                        } else {
                            i4 = 0;
                        }
                        if (!gl.E) {
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
                            ts3 ts3Var4 = fy0Var.K1;
                            if (ts3Var4 != null && ts3Var4.l(childAt)) {
                                if (!gl.E && !gl.O1()) {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                                } else if (gl.O1()) {
                                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                                    if (gl.O1()) {
                                        f = 200.0f;
                                    } else {
                                        f = 320.0f;
                                    }
                                    childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.min(gl.L(f), getPaddingTop() + (i8 - gl.m)), 1073741824));
                                } else {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (i8 - gl.m), 1073741824));
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
                yh1 yh1Var = (yh1) obj;
                aVar = ((d) yh1Var).actionBar;
                measureChildWithMargins(aVar, i, 0, i2, 0);
                if (Q() > gl.L(20.0f)) {
                    this.n0 = true;
                    yh1Var.d.j();
                    this.n0 = false;
                }
                int childCount2 = getChildCount();
                while (i6 < childCount2) {
                    View childAt2 = getChildAt(i6);
                    if (childAt2 != null && childAt2.getVisibility() != 8) {
                        aVar2 = ((d) yh1Var).actionBar;
                        if (childAt2 != aVar2) {
                            rt3 rt3Var = yh1Var.d;
                            if (rt3Var != null && rt3Var.l(childAt2)) {
                                if (!gl.E && !gl.O1()) {
                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt2.getLayoutParams().height, 1073741824));
                                } else if (gl.O1()) {
                                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
                                    if (gl.O1()) {
                                        f2 = 200.0f;
                                    } else {
                                        f2 = 320.0f;
                                    }
                                    childAt2.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.min(gl.L(f2), getPaddingTop() + (paddingTop - gl.m)), 1073741824));
                                } else {
                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop - gl.m), 1073741824));
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
                p82 p82Var = (p82) obj;
                measureChildWithMargins(p82.Y(p82Var), i, 0, i2, 0);
                if (Q() > gl.L(20.0f)) {
                    this.n0 = true;
                    p82Var.w.j();
                    this.n0 = false;
                }
                int childCount3 = getChildCount();
                while (i6 < childCount3) {
                    View childAt3 = getChildAt(i6);
                    if (childAt3 != null && childAt3.getVisibility() != 8 && childAt3 != p82.Z(p82Var)) {
                        rt3 rt3Var2 = p82Var.w;
                        if (rt3Var2 != null && rt3Var2.l(childAt3)) {
                            if (!gl.E && !gl.O1()) {
                                childAt3.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt3.getLayoutParams().height, 1073741824));
                            } else if (gl.O1()) {
                                int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size5, 1073741824);
                                if (gl.O1()) {
                                    f3 = 200.0f;
                                } else {
                                    f3 = 320.0f;
                                }
                                childAt3.measure(makeMeasureSpec3, View.MeasureSpec.makeMeasureSpec(Math.min(gl.L(f3), getPaddingTop() + (paddingTop2 - gl.m)), 1073741824));
                            } else {
                                childAt3.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop2 - gl.m), 1073741824));
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
                wa5 wa5Var = (wa5) obj;
                aVar3 = ((d) wa5Var).actionBar;
                measureChildWithMargins(aVar3, i, 0, i2, 0);
                if (Q() > gl.L(20.0f)) {
                    rt3 rt3Var3 = wa5Var.c;
                    if (!rt3Var3.e) {
                        this.n0 = true;
                        rt3Var3.j();
                        this.n0 = false;
                    }
                }
                int childCount4 = getChildCount();
                while (i6 < childCount4) {
                    View childAt4 = getChildAt(i6);
                    if (childAt4 != null && childAt4.getVisibility() != 8) {
                        aVar4 = ((d) wa5Var).actionBar;
                        if (childAt4 != aVar4) {
                            rt3 rt3Var4 = wa5Var.c;
                            if (rt3Var4 != null && rt3Var4.l(childAt4)) {
                                if (!gl.E && !gl.O1()) {
                                    childAt4.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt4.getLayoutParams().height, 1073741824));
                                } else if (gl.O1()) {
                                    int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size7, 1073741824);
                                    if (gl.O1()) {
                                        f4 = 200.0f;
                                    } else {
                                        f4 = 320.0f;
                                    }
                                    childAt4.measure(makeMeasureSpec4, View.MeasureSpec.makeMeasureSpec(Math.min(gl.L(f4), getPaddingTop() + (paddingTop3 - gl.m)), 1073741824));
                                } else {
                                    childAt4.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop3 - gl.m), 1073741824));
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
                ie8 ie8Var = (ie8) obj;
                int i9 = i;
                measureChildWithMargins(ie8.d0(ie8Var), i9, 0, i2, 0);
                int Q = Q();
                if (Q > gl.L(20.0f) && !ie8Var.Q && !ie8Var.C0) {
                    this.n0 = true;
                    ie8Var.m0();
                    this.n0 = false;
                }
                if (Q <= gl.L(20.0f) && !gl.E && !gl.O1()) {
                    i5 = ie8Var.W;
                } else {
                    i5 = 0;
                }
                if (Q > gl.L(20.0f) && ie8Var.C0) {
                    i5 = gl.L(120.0f);
                }
                int i10 = i5;
                int childCount5 = getChildCount();
                while (i6 < childCount5) {
                    View childAt5 = getChildAt(i6);
                    if (childAt5 != null && childAt5.getVisibility() != 8 && childAt5 != ie8.e0(ie8Var)) {
                        t14 t14Var = ie8Var.S;
                        if (t14Var != null && t14Var == childAt5) {
                            if (!gl.E && !gl.O1()) {
                                childAt5.measure(View.MeasureSpec.makeMeasureSpec(size9, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt5.getLayoutParams().height, 1073741824));
                            } else if (gl.O1()) {
                                int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(size9, 1073741824);
                                if (gl.O1()) {
                                    f5 = 200.0f;
                                } else {
                                    f5 = 320.0f;
                                }
                                childAt5.measure(makeMeasureSpec5, View.MeasureSpec.makeMeasureSpec(Math.min(gl.L(f5), getPaddingTop() + (paddingTop4 - gl.m)), 1073741824));
                            } else {
                                childAt5.measure(View.MeasureSpec.makeMeasureSpec(size9, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop4 - gl.m), 1073741824));
                            }
                        } else if (ie8Var.c == childAt5) {
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

    public ay0(d dVar, Context context, byte b) {
        super(context, null);
        this.m0 = b;
        this.o0 = dVar;
    }
}
