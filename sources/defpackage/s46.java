package defpackage;

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
public abstract class s46 extends ViewGroup {
    public int E;
    public int F;
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public float h;
    public boolean n;
    public int[] r;
    public int[] s;
    public Drawable w;
    public int x;
    public int y;

    public s46(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = true;
        this.b = -1;
        this.c = 0;
        this.e = 8388659;
        int[] iArr = w19.n;
        ko9 v = ko9.v(context, attributeSet, iArr, i);
        ihc.k(this, context, iArr, attributeSet, (TypedArray) v.c, i);
        TypedArray typedArray = (TypedArray) v.c;
        int i2 = typedArray.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = typedArray.getInt(0, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z = typedArray.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.h = typedArray.getFloat(4, -1.0f);
        this.b = typedArray.getInt(3, -1);
        this.n = typedArray.getBoolean(7, false);
        setDividerDrawable(v.n(5));
        this.E = typedArray.getInt(8, 0);
        this.F = typedArray.getDimensionPixelSize(6, 0);
        v.y();
    }

    public final void c(Canvas canvas, int i) {
        this.w.setBounds(getPaddingLeft() + this.F, i, (getWidth() - getPaddingRight()) - this.F, this.y + i);
        this.w.draw(canvas);
    }

    @Override
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof r46;
    }

    public final void d(Canvas canvas, int i) {
        this.w.setBounds(i, getPaddingTop() + this.F, this.x + i, (getHeight() - getPaddingBottom()) - this.F);
        this.w.draw(canvas);
    }

    @Override
    public r46 generateDefaultLayoutParams() {
        int i = this.d;
        if (i == 0) {
            return new LinearLayout.LayoutParams(-2, -2);
        }
        if (i == 1) {
            return new LinearLayout.LayoutParams(-1, -2);
        }
        return null;
    }

    @Override
    public r46 generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override
    public r46 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LinearLayout.LayoutParams(layoutParams);
    }

    @Override
    public int getBaseline() {
        int i;
        if (this.b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.b;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.b == 0) {
                    return -1;
                }
                xi4.l("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
                return 0;
            }
            int i3 = this.c;
            if (this.d == 1 && (i = this.e & 112) != 48) {
                if (i != 16) {
                    if (i == 80) {
                        i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f;
                    }
                } else {
                    i3 = ik8.g(((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom(), this.f, 2, i3);
                }
            }
            return i3 + ((LinearLayout.LayoutParams) ((r46) childAt.getLayoutParams())).topMargin + baseline;
        }
        xi4.l("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        return 0;
    }

    public int getBaselineAlignedChildIndex() {
        return this.b;
    }

    public Drawable getDividerDrawable() {
        return this.w;
    }

    public int getDividerPadding() {
        return this.F;
    }

    public int getDividerWidth() {
        return this.x;
    }

    public int getGravity() {
        return this.e;
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

    public final boolean h(int i) {
        if (i == 0) {
            if ((this.E & 1) == 0) {
                return false;
            }
            return true;
        }
        int childCount = getChildCount();
        int i2 = this.E;
        if (i == childCount) {
            if ((i2 & 4) == 0) {
                return false;
            }
            return true;
        }
        if ((i2 & 2) != 0) {
            for (int i3 = i - 1; i3 >= 0; i3--) {
                if (getChildAt(i3).getVisibility() != 8) {
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
        int i;
        int left2;
        int bottom;
        if (this.w != null) {
            int i2 = 0;
            if (this.d == 1) {
                int virtualChildCount = getVirtualChildCount();
                while (i2 < virtualChildCount) {
                    View childAt = getChildAt(i2);
                    if (childAt != null && childAt.getVisibility() != 8 && h(i2)) {
                        c(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((r46) childAt.getLayoutParams())).topMargin) - this.y);
                    }
                    i2++;
                }
                if (h(virtualChildCount)) {
                    View childAt2 = getChildAt(virtualChildCount - 1);
                    if (childAt2 == null) {
                        bottom = (getHeight() - getPaddingBottom()) - this.y;
                    } else {
                        bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((r46) childAt2.getLayoutParams())).bottomMargin;
                    }
                    c(canvas, bottom);
                    return;
                }
                return;
            }
            int virtualChildCount2 = getVirtualChildCount();
            boolean a = fjc.a(this);
            while (i2 < virtualChildCount2) {
                View childAt3 = getChildAt(i2);
                if (childAt3 != null && childAt3.getVisibility() != 8 && h(i2)) {
                    r46 r46Var = (r46) childAt3.getLayoutParams();
                    if (a) {
                        left2 = childAt3.getRight() + ((LinearLayout.LayoutParams) r46Var).rightMargin;
                    } else {
                        left2 = (childAt3.getLeft() - ((LinearLayout.LayoutParams) r46Var).leftMargin) - this.x;
                    }
                    d(canvas, left2);
                }
                i2++;
            }
            if (h(virtualChildCount2)) {
                View childAt4 = getChildAt(virtualChildCount2 - 1);
                if (childAt4 == null) {
                    if (a) {
                        right = getPaddingLeft();
                    } else {
                        left = getWidth() - getPaddingRight();
                        i = this.x;
                        right = left - i;
                    }
                } else {
                    r46 r46Var2 = (r46) childAt4.getLayoutParams();
                    if (a) {
                        left = childAt4.getLeft() - ((LinearLayout.LayoutParams) r46Var2).leftMargin;
                        i = this.x;
                        right = left - i;
                    } else {
                        right = childAt4.getRight() + ((LinearLayout.LayoutParams) r46Var2).rightMargin;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s46.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public void onMeasure(int r39, int r40) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s46.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z) {
        this.a = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.b = i;
            return;
        }
        int childCount = getChildCount();
        throw new IllegalArgumentException("base aligned child index out of range (0, " + childCount + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.w) {
            return;
        }
        this.w = drawable;
        boolean z = false;
        if (drawable != null) {
            this.x = drawable.getIntrinsicWidth();
            this.y = drawable.getIntrinsicHeight();
        } else {
            this.x = 0;
            this.y = 0;
            z = true;
        }
        setWillNotDraw(z);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.F = i;
    }

    public void setGravity(int i) {
        if (this.e != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.e = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.e;
        if ((8388615 & i3) != i2) {
            this.e = (i3 & (-8388616)) | i2;
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.n = z;
    }

    public void setOrientation(int i) {
        if (this.d != i) {
            this.d = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.E) {
            requestLayout();
        }
        this.E = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.e;
        if ((i3 & 112) != i2) {
            this.e = (i3 & (-113)) | i2;
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.h = Math.max(0.0f, f);
    }

    @Override
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
