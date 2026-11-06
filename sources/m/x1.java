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
public abstract class x1 extends ViewGroup {
    public int D;
    public int E;
    public boolean f19290a;
    public int f19291b;
    public int f19292c;
    public int d;
    public int f19293e;
    public int f19294f;
    public float h;
    public boolean f19295n;
    public int[] f19296r;
    public int[] f19297s;
    public Drawable f19298w;
    public int f19299x;
    public int f19300y;

    public x1(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f19290a = true;
        this.f19291b = -1;
        this.f19292c = 0;
        this.f19293e = 8388659;
        int[] iArr = f.a.f10866n;
        h6.m x10 = h6.m.x(context, attributeSet, iArr, i7);
        r0.i0.i(this, context, iArr, attributeSet, (TypedArray) x10.f14265c, i7);
        TypedArray typedArray = (TypedArray) x10.f14265c;
        int i10 = typedArray.getInt(1, -1);
        if (i10 >= 0) {
            setOrientation(i10);
        }
        int i11 = typedArray.getInt(0, -1);
        if (i11 >= 0) {
            setGravity(i11);
        }
        boolean z9 = typedArray.getBoolean(2, true);
        if (!z9) {
            setBaselineAligned(z9);
        }
        this.h = typedArray.getFloat(4, -1.0f);
        this.f19291b = typedArray.getInt(3, -1);
        this.f19295n = typedArray.getBoolean(7, false);
        setDividerDrawable(x10.p(5));
        this.D = typedArray.getInt(8, 0);
        this.E = typedArray.getDimensionPixelSize(6, 0);
        x10.C();
    }

    public final void c(Canvas canvas, int i7) {
        this.f19298w.setBounds(getPaddingLeft() + this.E, i7, (getWidth() - getPaddingRight()) - this.E, this.f19300y + i7);
        this.f19298w.draw(canvas);
    }

    @Override
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof w1;
    }

    public final void d(Canvas canvas, int i7) {
        this.f19298w.setBounds(i7, getPaddingTop() + this.E, this.f19299x + i7, (getHeight() - getPaddingBottom()) - this.E);
        this.f19298w.draw(canvas);
    }

    @Override
    public w1 generateDefaultLayoutParams() {
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
    public w1 generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override
    public w1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LinearLayout.LayoutParams(layoutParams);
    }

    @Override
    public int getBaseline() {
        int i7;
        if (this.f19291b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i10 = this.f19291b;
        if (childCount > i10) {
            View childAt = getChildAt(i10);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.f19291b == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i11 = this.f19292c;
            if (this.d == 1 && (i7 = this.f19293e & 112) != 48) {
                if (i7 != 16) {
                    if (i7 == 80) {
                        i11 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f19294f;
                    }
                } else {
                    i11 = jg.g.D(((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom(), this.f19294f, 2, i11);
                }
            }
            return i11 + ((LinearLayout.LayoutParams) ((w1) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.f19291b;
    }

    public Drawable getDividerDrawable() {
        return this.f19298w;
    }

    public int getDividerPadding() {
        return this.E;
    }

    public int getDividerWidth() {
        return this.f19299x;
    }

    public int getGravity() {
        return this.f19293e;
    }

    public int getOrientation() {
        return this.d;
    }

    public int getShowDividers() {
        return this.D;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.h;
    }

    public final boolean h(int i7) {
        if (i7 == 0) {
            if ((this.D & 1) == 0) {
                return false;
            }
            return true;
        } else if (i7 == getChildCount()) {
            if ((this.D & 4) == 0) {
                return false;
            }
            return true;
        } else {
            if ((this.D & 2) != 0) {
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
        if (this.f19298w != null) {
            int i10 = 0;
            if (this.d == 1) {
                int virtualChildCount = getVirtualChildCount();
                while (i10 < virtualChildCount) {
                    View childAt = getChildAt(i10);
                    if (childAt != null && childAt.getVisibility() != 8 && h(i10)) {
                        c(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((w1) childAt.getLayoutParams())).topMargin) - this.f19300y);
                    }
                    i10++;
                }
                if (h(virtualChildCount)) {
                    View childAt2 = getChildAt(virtualChildCount - 1);
                    if (childAt2 == null) {
                        bottom = (getHeight() - getPaddingBottom()) - this.f19300y;
                    } else {
                        bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((w1) childAt2.getLayoutParams())).bottomMargin;
                    }
                    c(canvas, bottom);
                    return;
                }
                return;
            }
            int virtualChildCount2 = getVirtualChildCount();
            boolean a10 = t3.a(this);
            while (i10 < virtualChildCount2) {
                View childAt3 = getChildAt(i10);
                if (childAt3 != null && childAt3.getVisibility() != 8 && h(i10)) {
                    w1 w1Var = (w1) childAt3.getLayoutParams();
                    if (a10) {
                        left2 = childAt3.getRight() + ((LinearLayout.LayoutParams) w1Var).rightMargin;
                    } else {
                        left2 = (childAt3.getLeft() - ((LinearLayout.LayoutParams) w1Var).leftMargin) - this.f19299x;
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
                        i7 = this.f19299x;
                        right = left - i7;
                    }
                } else {
                    w1 w1Var2 = (w1) childAt4.getLayoutParams();
                    if (a10) {
                        left = childAt4.getLeft() - ((LinearLayout.LayoutParams) w1Var2).leftMargin;
                        i7 = this.f19299x;
                        right = left - i7;
                    } else {
                        right = childAt4.getRight() + ((LinearLayout.LayoutParams) w1Var2).rightMargin;
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
        throw new UnsupportedOperationException("Method not decompiled: m.x1.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public void onMeasure(int r39, int r40) {
        throw new UnsupportedOperationException("Method not decompiled: m.x1.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z9) {
        this.f19290a = z9;
    }

    public void setBaselineAlignedChildIndex(int i7) {
        if (i7 >= 0 && i7 < getChildCount()) {
            this.f19291b = i7;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f19298w) {
            return;
        }
        this.f19298w = drawable;
        boolean z9 = false;
        if (drawable != null) {
            this.f19299x = drawable.getIntrinsicWidth();
            this.f19300y = drawable.getIntrinsicHeight();
        } else {
            this.f19299x = 0;
            this.f19300y = 0;
        }
        if (drawable == null) {
            z9 = true;
        }
        setWillNotDraw(z9);
        requestLayout();
    }

    public void setDividerPadding(int i7) {
        this.E = i7;
    }

    public void setGravity(int i7) {
        if (this.f19293e != i7) {
            if ((8388615 & i7) == 0) {
                i7 |= 8388611;
            }
            if ((i7 & 112) == 0) {
                i7 |= 48;
            }
            this.f19293e = i7;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i7) {
        int i10 = i7 & 8388615;
        int i11 = this.f19293e;
        if ((8388615 & i11) != i10) {
            this.f19293e = i10 | ((-8388616) & i11);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z9) {
        this.f19295n = z9;
    }

    public void setOrientation(int i7) {
        if (this.d != i7) {
            this.d = i7;
            requestLayout();
        }
    }

    public void setShowDividers(int i7) {
        if (i7 != this.D) {
            requestLayout();
        }
        this.D = i7;
    }

    public void setVerticalGravity(int i7) {
        int i10 = i7 & 112;
        int i11 = this.f19293e;
        if ((i11 & 112) != i10) {
            this.f19293e = i10 | (i11 & (-113));
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
