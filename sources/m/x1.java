package m;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import java.util.WeakHashMap;

public abstract class x1 extends ViewGroup {
    public int A;

    public boolean f17514a;

    public int f17515b;

    public int f17516c;
    public int d;

    public int f17517e;

    public int f17518f;
    public float h;

    public boolean f17519n;

    public int[] f17520r;

    public int[] f17521s;
    public Drawable v;

    public int f17522w;

    public int f17523x;

    public int f17524y;

    public x1(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f17514a = true;
        this.f17515b = -1;
        this.f17516c = 0;
        this.f17517e = 8388659;
        int[] iArr = f.a.f5585n;
        j9.a aVarG = j9.a.G(context, attributeSet, iArr, i10);
        r0.j0.j(this, context, iArr, attributeSet, (TypedArray) aVarG.f12864c, i10);
        TypedArray typedArray = (TypedArray) aVarG.f12864c;
        int i11 = typedArray.getInt(1, -1);
        if (i11 >= 0) {
            setOrientation(i11);
        }
        int i12 = typedArray.getInt(0, -1);
        if (i12 >= 0) {
            setGravity(i12);
        }
        boolean z10 = typedArray.getBoolean(2, true);
        if (!z10) {
            setBaselineAligned(z10);
        }
        this.h = typedArray.getFloat(4, -1.0f);
        this.f17515b = typedArray.getInt(3, -1);
        this.f17519n = typedArray.getBoolean(7, false);
        setDividerDrawable(aVarG.y(5));
        this.f17524y = typedArray.getInt(8, 0);
        this.A = typedArray.getDimensionPixelSize(6, 0);
        aVarG.I();
    }

    public final void c(Canvas canvas, int i10) {
        this.v.setBounds(getPaddingLeft() + this.A, i10, (getWidth() - getPaddingRight()) - this.A, this.f17523x + i10);
        this.v.draw(canvas);
    }

    @Override
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof w1;
    }

    public final void d(Canvas canvas, int i10) {
        this.v.setBounds(i10, getPaddingTop() + this.A, this.f17522w + i10, (getHeight() - getPaddingBottom()) - this.A);
        this.v.draw(canvas);
    }

    @Override
    public w1 generateDefaultLayoutParams() {
        int i10 = this.d;
        if (i10 == 0) {
            return new w1(-2, -2);
        }
        if (i10 == 1) {
            return new w1(-1, -2);
        }
        return null;
    }

    @Override
    public w1 generateLayoutParams(AttributeSet attributeSet) {
        return new w1(getContext(), attributeSet);
    }

    @Override
    public w1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new w1(layoutParams);
    }

    @Override
    public int getBaseline() {
        int i10;
        if (this.f17515b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.f17515b;
        if (childCount <= i11) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i11);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f17515b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int iB = this.f17516c;
        if (this.d == 1 && (i10 = this.f17517e & 112) != 48) {
            if (i10 == 16) {
                iB = i0.a.B(((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom(), this.f17518f, 2, iB);
            } else if (i10 == 80) {
                iB = ((getBottom() - getTop()) - getPaddingBottom()) - this.f17518f;
            }
        }
        return iB + ((LinearLayout.LayoutParams) ((w1) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f17515b;
    }

    public Drawable getDividerDrawable() {
        return this.v;
    }

    public int getDividerPadding() {
        return this.A;
    }

    public int getDividerWidth() {
        return this.f17522w;
    }

    public int getGravity() {
        return this.f17517e;
    }

    public int getOrientation() {
        return this.d;
    }

    public int getShowDividers() {
        return this.f17524y;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.h;
    }

    public final boolean h(int i10) {
        if (i10 == 0) {
            return (this.f17524y & 1) != 0;
        }
        if (i10 == getChildCount()) {
            return (this.f17524y & 4) != 0;
        }
        if ((this.f17524y & 2) != 0) {
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                if (getChildAt(i11).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i10;
        int bottom;
        if (this.v == null) {
            return;
        }
        int i11 = 0;
        if (this.d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i11 < virtualChildCount) {
                View childAt = getChildAt(i11);
                if (childAt != null && childAt.getVisibility() != 8 && h(i11)) {
                    c(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((w1) childAt.getLayoutParams())).topMargin) - this.f17523x);
                }
                i11++;
            }
            if (h(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.f17523x;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((w1) childAt2.getLayoutParams())).bottomMargin;
                }
                c(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean zA = w3.a(this);
        while (i11 < virtualChildCount2) {
            View childAt3 = getChildAt(i11);
            if (childAt3 != null && childAt3.getVisibility() != 8 && h(i11)) {
                w1 w1Var = (w1) childAt3.getLayoutParams();
                d(canvas, zA ? childAt3.getRight() + ((LinearLayout.LayoutParams) w1Var).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) w1Var).leftMargin) - this.f17522w);
            }
            i11++;
        }
        if (h(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                w1 w1Var2 = (w1) childAt4.getLayoutParams();
                if (zA) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) w1Var2).leftMargin;
                    i10 = this.f17522w;
                    right = left - i10;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) w1Var2).rightMargin;
                }
            } else if (zA) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i10 = this.f17522w;
                right = left - i10;
            }
            d(canvas, right);
        }
    }

    @Override
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        char c10;
        int iB;
        int i14;
        int i15;
        int i16;
        int i17;
        int baseline;
        int i18;
        int i19;
        int iB2;
        int i20;
        int iB3;
        int iB4;
        int i21 = 8;
        if (this.d == 1) {
            int paddingLeft = getPaddingLeft();
            int i22 = i12 - i10;
            int paddingRight = i22 - getPaddingRight();
            int paddingRight2 = (i22 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i23 = this.f17517e;
            int i24 = i23 & 112;
            int i25 = 8388615 & i23;
            if (i24 != 16) {
                iB3 = i24 != 80 ? getPaddingTop() : ((getPaddingTop() + i13) - i11) - this.f17518f;
            } else {
                iB3 = i0.a.B(i13 - i11, this.f17518f, 2, getPaddingTop());
            }
            int i26 = 0;
            while (i26 < virtualChildCount) {
                View childAt = getChildAt(i26);
                if (childAt != null && childAt.getVisibility() != i21) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    w1 w1Var = (w1) childAt.getLayoutParams();
                    int i27 = ((LinearLayout.LayoutParams) w1Var).gravity;
                    if (i27 < 0) {
                        i27 = i25;
                    }
                    WeakHashMap weakHashMap = r0.j0.f46605a;
                    int absoluteGravity = Gravity.getAbsoluteGravity(i27, getLayoutDirection()) & 7;
                    if (absoluteGravity != 1) {
                        iB4 = absoluteGravity != 5 ? ((LinearLayout.LayoutParams) w1Var).leftMargin + paddingLeft : (paddingRight - measuredWidth) - ((LinearLayout.LayoutParams) w1Var).rightMargin;
                    } else {
                        iB4 = (i0.a.B(paddingRight2, measuredWidth, 2, paddingLeft) + ((LinearLayout.LayoutParams) w1Var).leftMargin) - ((LinearLayout.LayoutParams) w1Var).rightMargin;
                    }
                    if (h(i26)) {
                        iB3 += this.f17523x;
                    }
                    int i28 = iB3 + ((LinearLayout.LayoutParams) w1Var).topMargin;
                    childAt.layout(iB4, i28, measuredWidth + iB4, i28 + measuredHeight);
                    iB3 = measuredHeight + ((LinearLayout.LayoutParams) w1Var).bottomMargin + i28;
                }
                i26++;
                i21 = 8;
            }
            return;
        }
        boolean zA = w3.a(this);
        int paddingTop = getPaddingTop();
        int i29 = i13 - i11;
        int paddingBottom = i29 - getPaddingBottom();
        int paddingBottom2 = (i29 - paddingTop) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i30 = this.f17517e;
        int i31 = 8388615 & i30;
        int i32 = i30 & 112;
        boolean z11 = this.f17514a;
        int[] iArr = this.f17520r;
        int[] iArr2 = this.f17521s;
        WeakHashMap weakHashMap2 = r0.j0.f46605a;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i31, getLayoutDirection());
        if (absoluteGravity2 != 1) {
            iB = absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i12) - i10) - this.f17518f;
            c10 = 1;
        } else {
            c10 = 1;
            iB = i0.a.B(i12 - i10, this.f17518f, 2, getPaddingLeft());
        }
        if (zA) {
            i14 = virtualChildCount2 - 1;
            i15 = -1;
        } else {
            i14 = 0;
            i15 = 1;
        }
        int i33 = 0;
        while (i33 < virtualChildCount2) {
            int i34 = (i15 * i33) + i14;
            View childAt2 = getChildAt(i34);
            if (childAt2 == null) {
                i16 = i14;
            } else {
                i16 = i14;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight2 = childAt2.getMeasuredHeight();
                    int i35 = iB;
                    w1 w1Var2 = (w1) childAt2.getLayoutParams();
                    if (z11) {
                        i17 = i15;
                        baseline = ((LinearLayout.LayoutParams) w1Var2).height != -1 ? childAt2.getBaseline() : -1;
                        i18 = ((LinearLayout.LayoutParams) w1Var2).gravity;
                        if (i18 < 0) {
                            i18 = i32;
                        }
                        i19 = i18 & 112;
                        if (i19 != 16) {
                            iB2 = (i0.a.B(paddingBottom2, measuredHeight2, 2, paddingTop) + ((LinearLayout.LayoutParams) w1Var2).topMargin) - ((LinearLayout.LayoutParams) w1Var2).bottomMargin;
                        } else if (i19 != 48) {
                            iB2 = ((LinearLayout.LayoutParams) w1Var2).topMargin + paddingTop;
                            if (baseline != -1) {
                                iB2 = (iArr[c10] - baseline) + iB2;
                            }
                        } else if (i19 != 80) {
                            iB2 = paddingTop;
                        } else {
                            iB2 = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) w1Var2).bottomMargin;
                            if (baseline != -1) {
                                iB2 -= iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                            }
                        }
                        if (h(i34)) {
                            i20 = i35 + this.f17522w;
                        } else {
                            i20 = i35;
                        }
                        int i36 = i20 + ((LinearLayout.LayoutParams) w1Var2).leftMargin;
                        childAt2.layout(i36, iB2, i36 + measuredWidth2, measuredHeight2 + iB2);
                        iB = measuredWidth2 + ((LinearLayout.LayoutParams) w1Var2).rightMargin + i36;
                    } else {
                        i17 = i15;
                    }
                    i18 = ((LinearLayout.LayoutParams) w1Var2).gravity;
                    if (i18 < 0) {
                        i18 = i32;
                    }
                    i19 = i18 & 112;
                    if (i19 != 16) {
                        iB2 = (i0.a.B(paddingBottom2, measuredHeight2, 2, paddingTop) + ((LinearLayout.LayoutParams) w1Var2).topMargin) - ((LinearLayout.LayoutParams) w1Var2).bottomMargin;
                    } else if (i19 != 48) {
                        iB2 = ((LinearLayout.LayoutParams) w1Var2).topMargin + paddingTop;
                        if (baseline != -1) {
                            iB2 = (iArr[c10] - baseline) + iB2;
                        }
                    } else if (i19 != 80) {
                        iB2 = paddingTop;
                    } else {
                        iB2 = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) w1Var2).bottomMargin;
                        if (baseline != -1) {
                            iB2 -= iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                        }
                    }
                    if (h(i34)) {
                        i20 = i35 + this.f17522w;
                    } else {
                        i20 = i35;
                    }
                    int i37 = i20 + ((LinearLayout.LayoutParams) w1Var2).leftMargin;
                    childAt2.layout(i37, iB2, i37 + measuredWidth2, measuredHeight2 + iB2);
                    iB = measuredWidth2 + ((LinearLayout.LayoutParams) w1Var2).rightMargin + i37;
                }
                i33++;
                i15 = i17;
                i14 = i16;
            }
            i17 = i15;
            i33++;
            i15 = i17;
            i14 = i16;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int iMax;
        int i14;
        int baseline;
        int i15;
        int i16;
        int[] iArr;
        int i17;
        int i18;
        boolean z10;
        boolean z11;
        w1 w1Var;
        View view;
        int i19;
        int[] iArr2;
        int i20;
        int i21;
        boolean z12;
        int i22;
        int measuredHeight;
        boolean z13;
        boolean z14;
        int iMax2;
        int i23;
        int baseline2;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z15;
        int i29;
        int i30;
        int i31;
        View view2;
        boolean z16;
        x1 x1Var = this;
        int i32 = -2;
        int iMax3 = 0;
        int i33 = 1073741824;
        int i34 = 8;
        if (x1Var.d == 1) {
            x1Var.f17518f = 0;
            int virtualChildCount = x1Var.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int i35 = x1Var.f17515b;
            boolean z17 = x1Var.f17519n;
            int i36 = 0;
            int iMax4 = 0;
            int iMax5 = 0;
            int iMax6 = 0;
            float f10 = 0.0f;
            boolean z18 = false;
            int i37 = 0;
            boolean z19 = false;
            boolean z20 = true;
            while (i36 < virtualChildCount) {
                int i38 = mode;
                View childAt = x1Var.getChildAt(i36);
                if (childAt == null) {
                    x1Var.f17518f = x1Var.f17518f;
                } else {
                    if (childAt.getVisibility() != i34) {
                        if (x1Var.h(i36)) {
                            x1Var.f17518f += x1Var.f17523x;
                        }
                        w1 w1Var2 = (w1) childAt.getLayoutParams();
                        float f11 = ((LinearLayout.LayoutParams) w1Var2).weight;
                        f10 += f11;
                        if (mode2 == i33 && ((LinearLayout.LayoutParams) w1Var2).height == 0 && f11 > 0.0f) {
                            int i39 = x1Var.f17518f;
                            x1Var.f17518f = Math.max(i39, ((LinearLayout.LayoutParams) w1Var2).topMargin + i39 + ((LinearLayout.LayoutParams) w1Var2).bottomMargin);
                            view2 = childAt;
                            i28 = mode2;
                            i29 = i35;
                            z15 = z17;
                            i30 = i36;
                            i31 = i38;
                            z18 = true;
                        } else {
                            if (((LinearLayout.LayoutParams) w1Var2).height != 0 || f11 <= 0.0f) {
                                i27 = Integer.MIN_VALUE;
                            } else {
                                ((LinearLayout.LayoutParams) w1Var2).height = i32;
                                i27 = 0;
                            }
                            i28 = mode2;
                            z15 = z17;
                            i29 = i35;
                            i30 = i36;
                            i31 = i38;
                            x1Var.measureChildWithMargins(childAt, i10, 0, i11, f10 == 0.0f ? x1Var.f17518f : 0);
                            if (i27 != Integer.MIN_VALUE) {
                                ((LinearLayout.LayoutParams) w1Var2).height = i27;
                            }
                            int measuredHeight2 = childAt.getMeasuredHeight();
                            int i40 = x1Var.f17518f;
                            view2 = childAt;
                            x1Var.f17518f = Math.max(i40, i40 + measuredHeight2 + ((LinearLayout.LayoutParams) w1Var2).topMargin + ((LinearLayout.LayoutParams) w1Var2).bottomMargin);
                            if (z15) {
                                iMax6 = Math.max(measuredHeight2, iMax6);
                            }
                        }
                        if (i29 >= 0 && i29 == i30 + 1) {
                            x1Var.f17516c = x1Var.f17518f;
                        }
                        if (i30 < i29 && ((LinearLayout.LayoutParams) w1Var2).weight > 0.0f) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        if (i31 == 1073741824 || ((LinearLayout.LayoutParams) w1Var2).width != -1) {
                            z16 = false;
                        } else {
                            z16 = true;
                            z19 = true;
                        }
                        int i41 = ((LinearLayout.LayoutParams) w1Var2).leftMargin + ((LinearLayout.LayoutParams) w1Var2).rightMargin;
                        int measuredWidth = view2.getMeasuredWidth() + i41;
                        iMax3 = Math.max(iMax3, measuredWidth);
                        int measuredState = view2.getMeasuredState();
                        boolean z21 = z16;
                        int iCombineMeasuredStates = View.combineMeasuredStates(i37, measuredState);
                        if (z20) {
                            i37 = iCombineMeasuredStates;
                            boolean z22 = ((LinearLayout.LayoutParams) w1Var2).width == -1;
                            if (((LinearLayout.LayoutParams) w1Var2).weight > 0.0f) {
                                if (!z21) {
                                    i41 = measuredWidth;
                                }
                                iMax5 = Math.max(iMax5, i41);
                            } else {
                                if (!z21) {
                                    i41 = measuredWidth;
                                }
                                iMax4 = Math.max(iMax4, i41);
                            }
                            z20 = z22;
                        } else {
                            i37 = iCombineMeasuredStates;
                        }
                        if (((LinearLayout.LayoutParams) w1Var2).weight > 0.0f) {
                            if (!z21) {
                                i41 = measuredWidth;
                            }
                            iMax5 = Math.max(iMax5, i41);
                        } else {
                            if (!z21) {
                                i41 = measuredWidth;
                            }
                            iMax4 = Math.max(iMax4, i41);
                        }
                        z20 = z22;
                    }
                    i36 = i30 + 1;
                    i35 = i29;
                    mode = i31;
                    z17 = z15;
                    mode2 = i28;
                    i32 = -2;
                    i33 = 1073741824;
                    i34 = 8;
                }
                i28 = mode2;
                i29 = i35;
                z15 = z17;
                i30 = i36;
                i31 = i38;
                i36 = i30 + 1;
                i35 = i29;
                mode = i31;
                z17 = z15;
                mode2 = i28;
                i32 = -2;
                i33 = 1073741824;
                i34 = 8;
            }
            int i42 = mode;
            int i43 = mode2;
            boolean z23 = z17;
            int i44 = i37;
            int i45 = i11;
            if (x1Var.f17518f > 0 && x1Var.h(virtualChildCount)) {
                x1Var.f17518f += x1Var.f17523x;
            }
            if (z23 && (i43 == Integer.MIN_VALUE || i43 == 0)) {
                x1Var.f17518f = 0;
                for (int i46 = 0; i46 < virtualChildCount; i46++) {
                    View childAt2 = x1Var.getChildAt(i46);
                    if (childAt2 == null) {
                        x1Var.f17518f = x1Var.f17518f;
                    } else if (childAt2.getVisibility() != 8) {
                        w1 w1Var3 = (w1) childAt2.getLayoutParams();
                        int i47 = x1Var.f17518f;
                        x1Var.f17518f = Math.max(i47, i47 + iMax6 + ((LinearLayout.LayoutParams) w1Var3).topMargin + ((LinearLayout.LayoutParams) w1Var3).bottomMargin);
                    }
                }
            }
            int paddingBottom = x1Var.getPaddingBottom() + x1Var.getPaddingTop() + x1Var.f17518f;
            x1Var.f17518f = paddingBottom;
            int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, x1Var.getSuggestedMinimumHeight()), i45, 0);
            int i48 = (iResolveSizeAndState & 16777215) - x1Var.f17518f;
            if (z18 || (i48 != 0 && f10 > 0.0f)) {
                float f12 = x1Var.h;
                if (f12 > 0.0f) {
                    f10 = f12;
                }
                x1Var.f17518f = 0;
                int iCombineMeasuredStates2 = i44;
                int i49 = 0;
                while (i49 < virtualChildCount) {
                    View childAt3 = x1Var.getChildAt(i49);
                    if (childAt3.getVisibility() == 8) {
                        i49 = i49;
                    } else {
                        w1 w1Var4 = (w1) childAt3.getLayoutParams();
                        float f13 = ((LinearLayout.LayoutParams) w1Var4).weight;
                        if (f13 > 0.0f) {
                            int i50 = (int) ((i48 * f13) / f10);
                            f10 -= f13;
                            i48 -= i50;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, x1Var.getPaddingRight() + x1Var.getPaddingLeft() + ((LinearLayout.LayoutParams) w1Var4).leftMargin + ((LinearLayout.LayoutParams) w1Var4).rightMargin, ((LinearLayout.LayoutParams) w1Var4).width);
                            if (((LinearLayout.LayoutParams) w1Var4).height == 0) {
                                i26 = 1073741824;
                                if (i43 == 1073741824) {
                                    if (i50 <= 0) {
                                        i50 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i50, 1073741824));
                                }
                                iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                            } else {
                                i26 = 1073741824;
                            }
                            int measuredHeight3 = childAt3.getMeasuredHeight() + i50;
                            if (measuredHeight3 < 0) {
                                measuredHeight3 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight3, i26));
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                        }
                        int i51 = ((LinearLayout.LayoutParams) w1Var4).leftMargin + ((LinearLayout.LayoutParams) w1Var4).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i51;
                        iMax3 = Math.max(iMax3, measuredWidth2);
                        if (i42 != 1073741824) {
                            i25 = -1;
                            if (((LinearLayout.LayoutParams) w1Var4).width == -1) {
                                measuredWidth2 = i51;
                            }
                        } else {
                            i25 = -1;
                        }
                        iMax4 = Math.max(iMax4, measuredWidth2);
                        boolean z24 = z20 && ((LinearLayout.LayoutParams) w1Var4).width == i25;
                        int i52 = x1Var.f17518f;
                        x1Var.f17518f = Math.max(i52, childAt3.getMeasuredHeight() + i52 + ((LinearLayout.LayoutParams) w1Var4).topMargin + ((LinearLayout.LayoutParams) w1Var4).bottomMargin);
                        z20 = z24;
                    }
                    i49++;
                }
                x1Var.f17518f = x1Var.getPaddingBottom() + x1Var.getPaddingTop() + x1Var.f17518f;
                i44 = iCombineMeasuredStates2;
            } else {
                iMax4 = Math.max(iMax4, iMax5);
                if (z23 && i43 != 1073741824) {
                    for (int i53 = 0; i53 < virtualChildCount; i53++) {
                        View childAt4 = x1Var.getChildAt(i53);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((w1) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(iMax6, 1073741824));
                        }
                    }
                }
            }
            if (z20 || i42 == 1073741824) {
                iMax4 = iMax3;
            }
            x1Var.setMeasuredDimension(View.resolveSizeAndState(Math.max(x1Var.getPaddingRight() + x1Var.getPaddingLeft() + iMax4, x1Var.getSuggestedMinimumWidth()), i10, i44), iResolveSizeAndState);
            if (z19) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(x1Var.getMeasuredWidth(), 1073741824);
                int i54 = 0;
                while (i54 < virtualChildCount) {
                    View childAt5 = x1Var.getChildAt(i54);
                    if (childAt5.getVisibility() != 8) {
                        w1 w1Var5 = (w1) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) w1Var5).width == -1) {
                            int i55 = ((LinearLayout.LayoutParams) w1Var5).height;
                            ((LinearLayout.LayoutParams) w1Var5).height = childAt5.getMeasuredHeight();
                            x1Var.measureChildWithMargins(childAt5, iMakeMeasureSpec, 0, i45, 0);
                            ((LinearLayout.LayoutParams) w1Var5).height = i55;
                        }
                    }
                    i54++;
                    i45 = i11;
                }
                return;
            }
            return;
        }
        int i56 = i10;
        x1Var.f17518f = 0;
        int virtualChildCount2 = x1Var.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i56);
        int mode4 = View.MeasureSpec.getMode(i11);
        if (x1Var.f17520r == null || x1Var.f17521s == null) {
            x1Var.f17520r = new int[4];
            x1Var.f17521s = new int[4];
        }
        int[] iArr3 = x1Var.f17520r;
        int[] iArr4 = x1Var.f17521s;
        iArr3[3] = -1;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z25 = x1Var.f17514a;
        boolean z26 = x1Var.f17519n;
        boolean z27 = mode3 == 1073741824;
        int i57 = 0;
        int i58 = 0;
        int i59 = 0;
        int iMax7 = 0;
        int iMax8 = 0;
        int iCombineMeasuredStates3 = 0;
        boolean z28 = false;
        boolean z29 = false;
        float f14 = 0.0f;
        boolean z30 = true;
        while (i57 < virtualChildCount2) {
            View childAt6 = x1Var.getChildAt(i57);
            if (childAt6 == null) {
                x1Var.f17518f = x1Var.f17518f;
                i18 = i57;
                i23 = i59;
                iArr2 = iArr3;
                iArr = iArr4;
                z10 = z25;
                z11 = z26;
            } else {
                int i60 = i58;
                if (childAt6.getVisibility() == 8) {
                    i56 = i10;
                    i18 = i57;
                    i23 = i59;
                    iArr = iArr4;
                    z10 = z25;
                    z11 = z26;
                    i58 = i60;
                    iArr2 = iArr3;
                } else {
                    if (x1Var.h(i57)) {
                        x1Var.f17518f += x1Var.f17522w;
                    }
                    w1 w1Var6 = (w1) childAt6.getLayoutParams();
                    float f15 = ((LinearLayout.LayoutParams) w1Var6).weight;
                    f14 += f15;
                    int i61 = i57;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) w1Var6).width == 0 && f15 > 0.0f) {
                        if (z27) {
                            x1Var.f17518f = ((LinearLayout.LayoutParams) w1Var6).leftMargin + ((LinearLayout.LayoutParams) w1Var6).rightMargin + x1Var.f17518f;
                        } else {
                            int i62 = x1Var.f17518f;
                            x1Var.f17518f = Math.max(i62, ((LinearLayout.LayoutParams) w1Var6).leftMargin + i62 + ((LinearLayout.LayoutParams) w1Var6).rightMargin);
                        }
                        if (z25) {
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
                            view = childAt6;
                            z10 = z25;
                            z11 = z26;
                            i19 = i60;
                            i18 = i61;
                            w1Var = w1Var6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i56 = i10;
                            i20 = i59;
                            i17 = iMax7;
                        } else {
                            view = childAt6;
                            z10 = z25;
                            z11 = z26;
                            i19 = i60;
                            i18 = i61;
                            i21 = 1073741824;
                            z29 = true;
                            w1Var = w1Var6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i56 = i10;
                            i20 = i59;
                            i17 = iMax7;
                        }
                        if (mode4 == i21 && ((LinearLayout.LayoutParams) w1Var).height == -1) {
                            z12 = true;
                            z28 = true;
                        } else {
                            z12 = false;
                        }
                        i22 = ((LinearLayout.LayoutParams) w1Var).topMargin + ((LinearLayout.LayoutParams) w1Var).bottomMargin;
                        measuredHeight = view.getMeasuredHeight() + i22;
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                        if (z10) {
                            baseline2 = view.getBaseline();
                            z13 = z12;
                            if (baseline2 != -1) {
                                i24 = ((LinearLayout.LayoutParams) w1Var).gravity;
                                if (i24 < 0) {
                                    i24 = x1Var.f17517e;
                                }
                                int i63 = (((i24 & 112) >> 4) & (-2)) >> 1;
                                iArr2[i63] = Math.max(iArr2[i63], baseline2);
                                iArr[i63] = Math.max(iArr[i63], measuredHeight - baseline2);
                            }
                        } else {
                            z13 = z12;
                        }
                        int iMax9 = Math.max(i19, measuredHeight);
                        if (z30 || ((LinearLayout.LayoutParams) w1Var).height != -1) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        if (((LinearLayout.LayoutParams) w1Var).weight > 0.0f) {
                            if (!z13) {
                                i22 = measuredHeight;
                            }
                            iMax7 = Math.max(i17, i22);
                            iMax2 = i20;
                        } else {
                            if (!z13) {
                                i22 = measuredHeight;
                            }
                            iMax2 = Math.max(i20, i22);
                            iMax7 = i17;
                        }
                        int i64 = iMax2;
                        i58 = iMax9;
                        i23 = i64;
                        z30 = z14;
                    } else {
                        if (((LinearLayout.LayoutParams) w1Var6).width != 0 || f15 <= 0.0f) {
                            i16 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) w1Var6).width = -2;
                            i16 = 0;
                        }
                        iArr = iArr4;
                        i17 = iMax7;
                        i18 = i61;
                        z10 = z25;
                        z11 = z26;
                        int i65 = i16;
                        w1Var = w1Var6;
                        view = childAt6;
                        i19 = i60;
                        i56 = i10;
                        iArr2 = iArr3;
                        i20 = i59;
                        x1Var.measureChildWithMargins(view, i56, f14 == 0.0f ? x1Var.f17518f : 0, i11, 0);
                        if (i65 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) w1Var).width = i65;
                        }
                        int measuredWidth3 = view.getMeasuredWidth();
                        if (z27) {
                            x1Var.f17518f = ((LinearLayout.LayoutParams) w1Var).leftMargin + measuredWidth3 + ((LinearLayout.LayoutParams) w1Var).rightMargin + x1Var.f17518f;
                        } else {
                            int i66 = x1Var.f17518f;
                            x1Var.f17518f = Math.max(i66, i66 + measuredWidth3 + ((LinearLayout.LayoutParams) w1Var).leftMargin + ((LinearLayout.LayoutParams) w1Var).rightMargin);
                        }
                        if (z11) {
                            iMax8 = Math.max(measuredWidth3, iMax8);
                        }
                    }
                    i21 = 1073741824;
                    if (mode4 == i21) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    i22 = ((LinearLayout.LayoutParams) w1Var).topMargin + ((LinearLayout.LayoutParams) w1Var).bottomMargin;
                    measuredHeight = view.getMeasuredHeight() + i22;
                    iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                    if (z10) {
                        baseline2 = view.getBaseline();
                        z13 = z12;
                        if (baseline2 != -1) {
                            i24 = ((LinearLayout.LayoutParams) w1Var).gravity;
                            if (i24 < 0) {
                                i24 = x1Var.f17517e;
                            }
                            int i67 = (((i24 & 112) >> 4) & (-2)) >> 1;
                            iArr2[i67] = Math.max(iArr2[i67], baseline2);
                            iArr[i67] = Math.max(iArr[i67], measuredHeight - baseline2);
                        }
                    } else {
                        z13 = z12;
                    }
                    int iMax10 = Math.max(i19, measuredHeight);
                    if (z30) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    if (((LinearLayout.LayoutParams) w1Var).weight > 0.0f) {
                        if (!z13) {
                            i22 = measuredHeight;
                        }
                        iMax7 = Math.max(i17, i22);
                        iMax2 = i20;
                    } else {
                        if (!z13) {
                            i22 = measuredHeight;
                        }
                        iMax2 = Math.max(i20, i22);
                        iMax7 = i17;
                    }
                    int i68 = iMax2;
                    i58 = iMax10;
                    i23 = i68;
                    z30 = z14;
                }
            }
            i59 = i23;
            i57 = i18 + 1;
            iArr3 = iArr2;
            iArr4 = iArr;
            z25 = z10;
            z26 = z11;
        }
        int i69 = i58;
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        boolean z31 = z25;
        boolean z32 = z26;
        int i70 = i59;
        int i71 = iMax7;
        if (x1Var.f17518f > 0 && x1Var.h(virtualChildCount2)) {
            x1Var.f17518f += x1Var.f17522w;
        }
        int i72 = iArr5[1];
        int iMax11 = (i72 == -1 && iArr5[0] == -1 && iArr5[2] == -1 && iArr5[3] == -1) ? i69 : Math.max(i69, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[2]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i72, iArr5[2]))));
        if (z32 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            x1Var.f17518f = 0;
            for (int i73 = 0; i73 < virtualChildCount2; i73++) {
                View childAt7 = x1Var.getChildAt(i73);
                if (childAt7 == null) {
                    x1Var.f17518f = x1Var.f17518f;
                } else if (childAt7.getVisibility() != 8) {
                    w1 w1Var7 = (w1) childAt7.getLayoutParams();
                    if (z27) {
                        x1Var.f17518f = ((LinearLayout.LayoutParams) w1Var7).leftMargin + iMax8 + ((LinearLayout.LayoutParams) w1Var7).rightMargin + x1Var.f17518f;
                    } else {
                        int i74 = x1Var.f17518f;
                        x1Var.f17518f = Math.max(i74, i74 + iMax8 + ((LinearLayout.LayoutParams) w1Var7).leftMargin + ((LinearLayout.LayoutParams) w1Var7).rightMargin);
                    }
                }
            }
        }
        int paddingRight = x1Var.getPaddingRight() + x1Var.getPaddingLeft() + x1Var.f17518f;
        x1Var.f17518f = paddingRight;
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, x1Var.getSuggestedMinimumWidth()), i56, 0);
        int i75 = (iResolveSizeAndState2 & 16777215) - x1Var.f17518f;
        if (z29 || (i75 != 0 && f14 > 0.0f)) {
            float f16 = x1Var.h;
            if (f16 > 0.0f) {
                f14 = f16;
            }
            iArr5[3] = -1;
            iArr5[2] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[2] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            x1Var.f17518f = 0;
            iMax11 = -1;
            int i76 = 0;
            while (i76 < virtualChildCount2) {
                View childAt8 = x1Var.getChildAt(i76);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    iResolveSizeAndState2 = iResolveSizeAndState2;
                } else {
                    w1 w1Var8 = (w1) childAt8.getLayoutParams();
                    float f17 = ((LinearLayout.LayoutParams) w1Var8).weight;
                    if (f17 > 0.0f) {
                        int i77 = (int) ((i75 * f17) / f14);
                        f14 -= f17;
                        i75 -= i77;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, x1Var.getPaddingBottom() + x1Var.getPaddingTop() + ((LinearLayout.LayoutParams) w1Var8).topMargin + ((LinearLayout.LayoutParams) w1Var8).bottomMargin, ((LinearLayout.LayoutParams) w1Var8).height);
                        if (((LinearLayout.LayoutParams) w1Var8).width == 0) {
                            i15 = 1073741824;
                            if (mode3 == 1073741824) {
                                if (i77 <= 0) {
                                    i77 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i77, 1073741824), childMeasureSpec2);
                            }
                            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                        } else {
                            i15 = 1073741824;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i77;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i15), childMeasureSpec2);
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                    }
                    if (z27) {
                        x1Var.f17518f = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) w1Var8).leftMargin + ((LinearLayout.LayoutParams) w1Var8).rightMargin + x1Var.f17518f;
                    } else {
                        int i78 = x1Var.f17518f;
                        x1Var.f17518f = Math.max(i78, childAt8.getMeasuredWidth() + i78 + ((LinearLayout.LayoutParams) w1Var8).leftMargin + ((LinearLayout.LayoutParams) w1Var8).rightMargin);
                    }
                    boolean z33 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) w1Var8).height == -1;
                    int i79 = ((LinearLayout.LayoutParams) w1Var8).topMargin + ((LinearLayout.LayoutParams) w1Var8).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i79;
                    iMax11 = Math.max(iMax11, measuredHeight4);
                    if (!z33) {
                        i79 = measuredHeight4;
                    }
                    int iMax12 = Math.max(i70, i79);
                    if (z30) {
                        i14 = -1;
                        boolean z34 = ((LinearLayout.LayoutParams) w1Var8).height == -1;
                        if (!z31 && (baseline = childAt8.getBaseline()) != i14) {
                            int i80 = ((LinearLayout.LayoutParams) w1Var8).gravity;
                            if (i80 < 0) {
                                i80 = x1Var.f17517e;
                            }
                            int i81 = (((i80 & 112) >> 4) & (-2)) >> 1;
                            iArr5[i81] = Math.max(iArr5[i81], baseline);
                            iArr6[i81] = Math.max(iArr6[i81], measuredHeight4 - baseline);
                        }
                        z30 = z34;
                        i70 = iMax12;
                    } else {
                        i14 = -1;
                    }
                    if (!z31) {
                    }
                    z30 = z34;
                    i70 = iMax12;
                }
                i76++;
                iResolveSizeAndState2 = iResolveSizeAndState2;
            }
            i12 = iResolveSizeAndState2;
            i13 = -16777216;
            x1Var.f17518f = x1Var.getPaddingRight() + x1Var.getPaddingLeft() + x1Var.f17518f;
            int i82 = iArr5[1];
            if (i82 != -1 || iArr5[0] != -1 || iArr5[2] != -1 || iArr5[3] != -1) {
                iMax11 = Math.max(iMax11, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[2]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i82, iArr5[2]))));
            }
            iMax = i70;
        } else {
            iMax = Math.max(i70, i71);
            if (z32 && mode3 != 1073741824) {
                for (int i83 = 0; i83 < virtualChildCount2; i83++) {
                    View childAt9 = x1Var.getChildAt(i83);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((w1) childAt9.getLayoutParams())).weight > 0.0f) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(iMax8, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i12 = iResolveSizeAndState2;
            i13 = -16777216;
        }
        if (!z30 && mode4 != 1073741824) {
            iMax11 = iMax;
        }
        x1Var.setMeasuredDimension(i12 | (iCombineMeasuredStates3 & i13), View.resolveSizeAndState(Math.max(x1Var.getPaddingBottom() + x1Var.getPaddingTop() + iMax11, x1Var.getSuggestedMinimumHeight()), i11, iCombineMeasuredStates3 << 16));
        if (z28) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(x1Var.getMeasuredHeight(), 1073741824);
            int i84 = 0;
            while (i84 < virtualChildCount2) {
                View childAt10 = x1Var.getChildAt(i84);
                if (childAt10.getVisibility() != 8) {
                    w1 w1Var9 = (w1) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) w1Var9).height == -1) {
                        int i85 = ((LinearLayout.LayoutParams) w1Var9).width;
                        ((LinearLayout.LayoutParams) w1Var9).width = childAt10.getMeasuredWidth();
                        x1Var.measureChildWithMargins(childAt10, i56, 0, iMakeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) w1Var9).width = i85;
                    }
                }
                i84++;
                x1Var = this;
                i56 = i10;
            }
        }
    }

    public void setBaselineAligned(boolean z10) {
        this.f17514a = z10;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 >= 0 && i10 < getChildCount()) {
            this.f17515b = i10;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.v) {
            return;
        }
        this.v = drawable;
        if (drawable != null) {
            this.f17522w = drawable.getIntrinsicWidth();
            this.f17523x = drawable.getIntrinsicHeight();
        } else {
            this.f17522w = 0;
            this.f17523x = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i10) {
        this.A = i10;
    }

    public void setGravity(int i10) {
        if (this.f17517e != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f17517e = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & 8388615;
        int i12 = this.f17517e;
        if ((8388615 & i12) != i11) {
            this.f17517e = i11 | ((-8388616) & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.f17519n = z10;
    }

    public void setOrientation(int i10) {
        if (this.d != i10) {
            this.d = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.f17524y) {
            requestLayout();
        }
        this.f17524y = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & 112;
        int i12 = this.f17517e;
        if ((i12 & 112) != i11) {
            this.f17517e = i11 | (i12 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.h = Math.max(0.0f, f10);
    }

    @Override
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
