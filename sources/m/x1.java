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
    public int A;
    public boolean f17139a;
    public int f17140b;
    public int f17141c;
    public int d;
    public int f17142e;
    public int f17143f;
    public float h;
    public boolean f17144n;
    public int[] f17145r;
    public int[] f17146s;
    public Drawable v;
    public int f17147w;
    public int f17148x;
    public int f17149y;

    public x1(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f17139a = true;
        this.f17140b = -1;
        this.f17141c = 0;
        this.f17142e = 8388659;
        int[] iArr = f.a.f5280n;
        j4.c E = j4.c.E(context, attributeSet, iArr, i9);
        r0.j0.j(this, context, iArr, attributeSet, (TypedArray) E.f13432c, i9);
        TypedArray typedArray = (TypedArray) E.f13432c;
        int i10 = typedArray.getInt(1, -1);
        if (i10 >= 0) {
            setOrientation(i10);
        }
        int i11 = typedArray.getInt(0, -1);
        if (i11 >= 0) {
            setGravity(i11);
        }
        boolean z10 = typedArray.getBoolean(2, true);
        if (!z10) {
            setBaselineAligned(z10);
        }
        this.h = typedArray.getFloat(4, -1.0f);
        this.f17140b = typedArray.getInt(3, -1);
        this.f17144n = typedArray.getBoolean(7, false);
        setDividerDrawable(E.w(5));
        this.f17149y = typedArray.getInt(8, 0);
        this.A = typedArray.getDimensionPixelSize(6, 0);
        E.G();
    }

    public final void c(Canvas canvas, int i9) {
        this.v.setBounds(getPaddingLeft() + this.A, i9, (getWidth() - getPaddingRight()) - this.A, this.f17148x + i9);
        this.v.draw(canvas);
    }

    @Override
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof w1;
    }

    public final void d(Canvas canvas, int i9) {
        this.v.setBounds(i9, getPaddingTop() + this.A, this.f17147w + i9, (getHeight() - getPaddingBottom()) - this.A);
        this.v.draw(canvas);
    }

    @Override
    public w1 generateDefaultLayoutParams() {
        int i9 = this.d;
        if (i9 == 0) {
            return new LinearLayout.LayoutParams(-2, -2);
        }
        if (i9 == 1) {
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
        int i9;
        if (this.f17140b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i10 = this.f17140b;
        if (childCount > i10) {
            View childAt = getChildAt(i10);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.f17140b == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i11 = this.f17141c;
            if (this.d == 1 && (i9 = this.f17142e & 112) != 48) {
                if (i9 != 16) {
                    if (i9 == 80) {
                        i11 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f17143f;
                    }
                } else {
                    i11 = j3.r0.d(((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom(), this.f17143f, 2, i11);
                }
            }
            return i11 + ((LinearLayout.LayoutParams) ((w1) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.f17140b;
    }

    public Drawable getDividerDrawable() {
        return this.v;
    }

    public int getDividerPadding() {
        return this.A;
    }

    public int getDividerWidth() {
        return this.f17147w;
    }

    public int getGravity() {
        return this.f17142e;
    }

    public int getOrientation() {
        return this.d;
    }

    public int getShowDividers() {
        return this.f17149y;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.h;
    }

    public final boolean h(int i9) {
        if (i9 == 0) {
            if ((this.f17149y & 1) == 0) {
                return false;
            }
            return true;
        } else if (i9 == getChildCount()) {
            if ((this.f17149y & 4) == 0) {
                return false;
            }
            return true;
        } else {
            if ((this.f17149y & 2) != 0) {
                for (int i10 = i9 - 1; i10 >= 0; i10--) {
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
        int i9;
        int left2;
        int bottom;
        if (this.v != null) {
            int i10 = 0;
            if (this.d == 1) {
                int virtualChildCount = getVirtualChildCount();
                while (i10 < virtualChildCount) {
                    View childAt = getChildAt(i10);
                    if (childAt != null && childAt.getVisibility() != 8 && h(i10)) {
                        c(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((w1) childAt.getLayoutParams())).topMargin) - this.f17148x);
                    }
                    i10++;
                }
                if (h(virtualChildCount)) {
                    View childAt2 = getChildAt(virtualChildCount - 1);
                    if (childAt2 == null) {
                        bottom = (getHeight() - getPaddingBottom()) - this.f17148x;
                    } else {
                        bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((w1) childAt2.getLayoutParams())).bottomMargin;
                    }
                    c(canvas, bottom);
                    return;
                }
                return;
            }
            int virtualChildCount2 = getVirtualChildCount();
            boolean a2 = w3.a(this);
            while (i10 < virtualChildCount2) {
                View childAt3 = getChildAt(i10);
                if (childAt3 != null && childAt3.getVisibility() != 8 && h(i10)) {
                    w1 w1Var = (w1) childAt3.getLayoutParams();
                    if (a2) {
                        left2 = childAt3.getRight() + ((LinearLayout.LayoutParams) w1Var).rightMargin;
                    } else {
                        left2 = (childAt3.getLeft() - ((LinearLayout.LayoutParams) w1Var).leftMargin) - this.f17147w;
                    }
                    d(canvas, left2);
                }
                i10++;
            }
            if (h(virtualChildCount2)) {
                View childAt4 = getChildAt(virtualChildCount2 - 1);
                if (childAt4 == null) {
                    if (a2) {
                        right = getPaddingLeft();
                    } else {
                        left = getWidth() - getPaddingRight();
                        i9 = this.f17147w;
                        right = left - i9;
                    }
                } else {
                    w1 w1Var2 = (w1) childAt4.getLayoutParams();
                    if (a2) {
                        left = childAt4.getLeft() - ((LinearLayout.LayoutParams) w1Var2).leftMargin;
                        i9 = this.f17147w;
                        right = left - i9;
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

    public void setBaselineAligned(boolean z10) {
        this.f17139a = z10;
    }

    public void setBaselineAlignedChildIndex(int i9) {
        if (i9 >= 0 && i9 < getChildCount()) {
            this.f17140b = i9;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.v) {
            return;
        }
        this.v = drawable;
        boolean z10 = false;
        if (drawable != null) {
            this.f17147w = drawable.getIntrinsicWidth();
            this.f17148x = drawable.getIntrinsicHeight();
        } else {
            this.f17147w = 0;
            this.f17148x = 0;
        }
        if (drawable == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        requestLayout();
    }

    public void setDividerPadding(int i9) {
        this.A = i9;
    }

    public void setGravity(int i9) {
        if (this.f17142e != i9) {
            if ((8388615 & i9) == 0) {
                i9 |= 8388611;
            }
            if ((i9 & 112) == 0) {
                i9 |= 48;
            }
            this.f17142e = i9;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i9) {
        int i10 = i9 & 8388615;
        int i11 = this.f17142e;
        if ((8388615 & i11) != i10) {
            this.f17142e = i10 | ((-8388616) & i11);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.f17144n = z10;
    }

    public void setOrientation(int i9) {
        if (this.d != i9) {
            this.d = i9;
            requestLayout();
        }
    }

    public void setShowDividers(int i9) {
        if (i9 != this.f17149y) {
            requestLayout();
        }
        this.f17149y = i9;
    }

    public void setVerticalGravity(int i9) {
        int i10 = i9 & 112;
        int i11 = this.f17142e;
        if ((i11 & 112) != i10) {
            this.f17142e = i10 | (i11 & (-113));
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
