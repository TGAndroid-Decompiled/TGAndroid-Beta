package m;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
public abstract class w1 extends ViewGroup {
    public int E;
    public int F;
    public boolean f19873a;
    public int f19874b;
    public int f19875c;
    public int d;
    public int f19876e;
    public int f19877f;
    public float h;
    public boolean f19878n;
    public int[] f19879r;
    public int[] f19880s;
    public Drawable f19881w;
    public int f19882x;
    public int f19883y;

    public w1(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f19873a = true;
        this.f19874b = -1;
        this.f19875c = 0;
        this.f19876e = 8388659;
        int[] iArr = f.a.f10682n;
        h6.m z10 = h6.m.z(context, attributeSet, iArr, i7);
        r0.i0.i(this, context, iArr, attributeSet, (TypedArray) z10.f13625c, i7);
        TypedArray typedArray = (TypedArray) z10.f13625c;
        int i10 = typedArray.getInt(1, -1);
        if (i10 >= 0) {
            setOrientation(i10);
        }
        int i11 = typedArray.getInt(0, -1);
        if (i11 >= 0) {
            setGravity(i11);
        }
        boolean z11 = typedArray.getBoolean(2, true);
        if (!z11) {
            setBaselineAligned(z11);
        }
        this.h = typedArray.getFloat(4, -1.0f);
        this.f19874b = typedArray.getInt(3, -1);
        this.f19878n = typedArray.getBoolean(7, false);
        setDividerDrawable(z10.p(5));
        this.E = typedArray.getInt(8, 0);
        this.F = typedArray.getDimensionPixelSize(6, 0);
        z10.D();
    }

    public final void c(Canvas canvas, int i7) {
        this.f19881w.setBounds(getPaddingLeft() + this.F, i7, (getWidth() - getPaddingRight()) - this.F, this.f19883y + i7);
        this.f19881w.draw(canvas);
    }

    @Override
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof v1;
    }

    public final void d(Canvas canvas, int i7) {
        this.f19881w.setBounds(i7, getPaddingTop() + this.F, this.f19882x + i7, (getHeight() - getPaddingBottom()) - this.F);
        this.f19881w.draw(canvas);
    }

    @Override
    public v1 generateDefaultLayoutParams() {
        int i7 = this.d;
        if (i7 == 0) {
            return new LinearLayout.LayoutParams(-2, -2);
        }
        if (i7 == 1) {
            return new LinearLayout.LayoutParams(-1, -2);
        }
        return null;
    }

    @Override
    public v1 generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override
    public v1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LinearLayout.LayoutParams(layoutParams);
    }

    @Override
    public int getBaseline() {
        int i7;
        if (this.f19874b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i10 = this.f19874b;
        if (childCount > i10) {
            View childAt = getChildAt(i10);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.f19874b == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i11 = this.f19875c;
            if (this.d == 1 && (i7 = this.f19876e & 112) != 48) {
                if (i7 != 16) {
                    if (i7 == 80) {
                        i11 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f19877f;
                    }
                } else {
                    i11 = i5.c.e(((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom(), this.f19877f, 2, i11);
                }
            }
            return i11 + ((LinearLayout.LayoutParams) ((v1) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.f19874b;
    }

    public Drawable getDividerDrawable() {
        return this.f19881w;
    }

    public int getDividerPadding() {
        return this.F;
    }

    public int getDividerWidth() {
        return this.f19882x;
    }

    public int getGravity() {
        return this.f19876e;
    }

    public int getOrientation() {
        return this.d;
    }

    public int getShowDividers() {
        return this.E;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.h;
    }

    public final boolean h(int i7) {
        if (i7 == 0) {
            if ((this.E & 1) == 0) {
                return false;
            }
            return true;
        } else if (i7 == getChildCount()) {
            if ((this.E & 4) == 0) {
                return false;
            }
            return true;
        } else {
            if ((this.E & 2) != 0) {
                for (int i10 = i7 - 1; i10 >= 0; i10--) {
                    if (getChildAt(i10).getVisibility() != 8) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i7;
        int left2;
        int bottom;
        if (this.f19881w != null) {
            int i10 = 0;
            if (this.d == 1) {
                int virtualChildCount = getVirtualChildCount();
                while (i10 < virtualChildCount) {
                    View childAt = getChildAt(i10);
                    if (childAt != null && childAt.getVisibility() != 8 && h(i10)) {
                        c(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((v1) childAt.getLayoutParams())).topMargin) - this.f19883y);
                    }
                    i10++;
                }
                if (h(virtualChildCount)) {
                    View childAt2 = getChildAt(virtualChildCount - 1);
                    if (childAt2 == null) {
                        bottom = (getHeight() - getPaddingBottom()) - this.f19883y;
                    } else {
                        bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((v1) childAt2.getLayoutParams())).bottomMargin;
                    }
                    c(canvas, bottom);
                    return;
                }
                return;
            }
            int virtualChildCount2 = getVirtualChildCount();
            boolean a10 = r3.a(this);
            while (i10 < virtualChildCount2) {
                View childAt3 = getChildAt(i10);
                if (childAt3 != null && childAt3.getVisibility() != 8 && h(i10)) {
                    v1 v1Var = (v1) childAt3.getLayoutParams();
                    if (a10) {
                        left2 = childAt3.getRight() + ((LinearLayout.LayoutParams) v1Var).rightMargin;
                    } else {
                        left2 = (childAt3.getLeft() - ((LinearLayout.LayoutParams) v1Var).leftMargin) - this.f19882x;
                    }
                    d(canvas, left2);
                }
                i10++;
            }
            if (h(virtualChildCount2)) {
                View childAt4 = getChildAt(virtualChildCount2 - 1);
                if (childAt4 == null) {
                    if (a10) {
                        right = getPaddingLeft();
                    } else {
                        left = getWidth() - getPaddingRight();
                        i7 = this.f19882x;
                        right = left - i7;
                    }
                } else {
                    v1 v1Var2 = (v1) childAt4.getLayoutParams();
                    if (a10) {
                        left = childAt4.getLeft() - ((LinearLayout.LayoutParams) v1Var2).leftMargin;
                        i7 = this.f19882x;
                        right = left - i7;
                    } else {
                        right = childAt4.getRight() + ((LinearLayout.LayoutParams) v1Var2).rightMargin;
                    }
                }
                d(canvas, right);
            }
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
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: m.w1.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public void onMeasure(int r39, int r40) {
        throw new UnsupportedOperationException("Method not decompiled: m.w1.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z10) {
        this.f19873a = z10;
    }

    public void setBaselineAlignedChildIndex(int i7) {
        if (i7 >= 0 && i7 < getChildCount()) {
            this.f19874b = i7;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f19881w) {
            return;
        }
        this.f19881w = drawable;
        boolean z10 = false;
        if (drawable != null) {
            this.f19882x = drawable.getIntrinsicWidth();
            this.f19883y = drawable.getIntrinsicHeight();
        } else {
            this.f19882x = 0;
            this.f19883y = 0;
        }
        if (drawable == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        requestLayout();
    }

    public void setDividerPadding(int i7) {
        this.F = i7;
    }

    public void setGravity(int i7) {
        if (this.f19876e != i7) {
            if ((8388615 & i7) == 0) {
                i7 |= 8388611;
            }
            if ((i7 & 112) == 0) {
                i7 |= 48;
            }
            this.f19876e = i7;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i7) {
        int i10 = i7 & 8388615;
        int i11 = this.f19876e;
        if ((8388615 & i11) != i10) {
            this.f19876e = i10 | ((-8388616) & i11);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.f19878n = z10;
    }

    public void setOrientation(int i7) {
        if (this.d != i7) {
            this.d = i7;
            requestLayout();
        }
    }

    public void setShowDividers(int i7) {
        if (i7 != this.E) {
            requestLayout();
        }
        this.E = i7;
    }

    public void setVerticalGravity(int i7) {
        int i10 = i7 & 112;
        int i11 = this.f19876e;
        if ((i11 & 112) != i10) {
            this.f19876e = i10 | (i11 & (-113));
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
