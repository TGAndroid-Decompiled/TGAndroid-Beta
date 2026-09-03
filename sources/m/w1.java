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
    public int B;
    public boolean f13377a;
    public int f13378b;
    public int f13379c;
    public int d;
    public int f13380e;
    public int f13381f;
    public float h;
    public boolean f13382n;
    public int[] f13383r;
    public int[] f13384s;
    public Drawable v;
    public int f13385w;
    public int f13386x;
    public int f13387y;

    public w1(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f13377a = true;
        this.f13378b = -1;
        this.f13379c = 0;
        this.f13380e = 8388659;
        int[] iArr = f.a.f5699n;
        l7.w0 y10 = l7.w0.y(context, attributeSet, iArr, i10);
        r0.j0.j(this, context, iArr, attributeSet, (TypedArray) y10.f12081c, i10);
        TypedArray typedArray = (TypedArray) y10.f12081c;
        int i11 = typedArray.getInt(1, -1);
        if (i11 >= 0) {
            setOrientation(i11);
        }
        int i12 = typedArray.getInt(0, -1);
        if (i12 >= 0) {
            setGravity(i12);
        }
        boolean z4 = typedArray.getBoolean(2, true);
        if (!z4) {
            setBaselineAligned(z4);
        }
        this.h = typedArray.getFloat(4, -1.0f);
        this.f13378b = typedArray.getInt(3, -1);
        this.f13382n = typedArray.getBoolean(7, false);
        setDividerDrawable(y10.s(5));
        this.f13387y = typedArray.getInt(8, 0);
        this.B = typedArray.getDimensionPixelSize(6, 0);
        y10.A();
    }

    public final void c(Canvas canvas, int i10) {
        this.v.setBounds(getPaddingLeft() + this.B, i10, (getWidth() - getPaddingRight()) - this.B, this.f13386x + i10);
        this.v.draw(canvas);
    }

    @Override
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof v1;
    }

    public final void d(Canvas canvas, int i10) {
        this.v.setBounds(i10, getPaddingTop() + this.B, this.f13385w + i10, (getHeight() - getPaddingBottom()) - this.B);
        this.v.draw(canvas);
    }

    @Override
    public v1 generateDefaultLayoutParams() {
        int i10 = this.d;
        if (i10 == 0) {
            return new LinearLayout.LayoutParams(-2, -2);
        }
        if (i10 == 1) {
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
        int i10;
        if (this.f13378b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.f13378b;
        if (childCount > i11) {
            View childAt = getChildAt(i11);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.f13378b == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i12 = this.f13379c;
            if (this.d == 1 && (i10 = this.f13380e & 112) != 48) {
                if (i10 != 16) {
                    if (i10 == 80) {
                        i12 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f13381f;
                    }
                } else {
                    i12 = l.d.d(((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom(), this.f13381f, 2, i12);
                }
            }
            return i12 + ((LinearLayout.LayoutParams) ((v1) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.f13378b;
    }

    public Drawable getDividerDrawable() {
        return this.v;
    }

    public int getDividerPadding() {
        return this.B;
    }

    public int getDividerWidth() {
        return this.f13385w;
    }

    public int getGravity() {
        return this.f13380e;
    }

    public int getOrientation() {
        return this.d;
    }

    public int getShowDividers() {
        return this.f13387y;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.h;
    }

    public final boolean h(int i10) {
        if (i10 == 0) {
            if ((this.f13387y & 1) == 0) {
                return false;
            }
            return true;
        } else if (i10 == getChildCount()) {
            if ((this.f13387y & 4) == 0) {
                return false;
            }
            return true;
        } else {
            if ((this.f13387y & 2) != 0) {
                for (int i11 = i10 - 1; i11 >= 0; i11--) {
                    if (getChildAt(i11).getVisibility() != 8) {
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
        int i10;
        int left2;
        int bottom;
        if (this.v != null) {
            int i11 = 0;
            if (this.d == 1) {
                int virtualChildCount = getVirtualChildCount();
                while (i11 < virtualChildCount) {
                    View childAt = getChildAt(i11);
                    if (childAt != null && childAt.getVisibility() != 8 && h(i11)) {
                        c(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((v1) childAt.getLayoutParams())).topMargin) - this.f13386x);
                    }
                    i11++;
                }
                if (h(virtualChildCount)) {
                    View childAt2 = getChildAt(virtualChildCount - 1);
                    if (childAt2 == null) {
                        bottom = (getHeight() - getPaddingBottom()) - this.f13386x;
                    } else {
                        bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((v1) childAt2.getLayoutParams())).bottomMargin;
                    }
                    c(canvas, bottom);
                    return;
                }
                return;
            }
            int virtualChildCount2 = getVirtualChildCount();
            boolean a2 = u3.a(this);
            while (i11 < virtualChildCount2) {
                View childAt3 = getChildAt(i11);
                if (childAt3 != null && childAt3.getVisibility() != 8 && h(i11)) {
                    v1 v1Var = (v1) childAt3.getLayoutParams();
                    if (a2) {
                        left2 = childAt3.getRight() + ((LinearLayout.LayoutParams) v1Var).rightMargin;
                    } else {
                        left2 = (childAt3.getLeft() - ((LinearLayout.LayoutParams) v1Var).leftMargin) - this.f13385w;
                    }
                    d(canvas, left2);
                }
                i11++;
            }
            if (h(virtualChildCount2)) {
                View childAt4 = getChildAt(virtualChildCount2 - 1);
                if (childAt4 == null) {
                    if (a2) {
                        right = getPaddingLeft();
                    } else {
                        left = getWidth() - getPaddingRight();
                        i10 = this.f13385w;
                        right = left - i10;
                    }
                } else {
                    v1 v1Var2 = (v1) childAt4.getLayoutParams();
                    if (a2) {
                        left = childAt4.getLeft() - ((LinearLayout.LayoutParams) v1Var2).leftMargin;
                        i10 = this.f13385w;
                        right = left - i10;
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

    public void setBaselineAligned(boolean z4) {
        this.f13377a = z4;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 >= 0 && i10 < getChildCount()) {
            this.f13378b = i10;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.v) {
            return;
        }
        this.v = drawable;
        boolean z4 = false;
        if (drawable != null) {
            this.f13385w = drawable.getIntrinsicWidth();
            this.f13386x = drawable.getIntrinsicHeight();
        } else {
            this.f13385w = 0;
            this.f13386x = 0;
        }
        if (drawable == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        requestLayout();
    }

    public void setDividerPadding(int i10) {
        this.B = i10;
    }

    public void setGravity(int i10) {
        if (this.f13380e != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f13380e = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & 8388615;
        int i12 = this.f13380e;
        if ((8388615 & i12) != i11) {
            this.f13380e = i11 | ((-8388616) & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z4) {
        this.f13382n = z4;
    }

    public void setOrientation(int i10) {
        if (this.d != i10) {
            this.d = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.f13387y) {
            requestLayout();
        }
        this.f13387y = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & 112;
        int i12 = this.f13380e;
        if ((i12 & 112) != i11) {
            this.f13380e = i11 | (i12 & (-113));
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
