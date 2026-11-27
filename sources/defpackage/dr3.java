package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class dr3 extends FrameLayout {
    public wk5 a;
    public ActionBarLayout b;
    public boolean c;
    public final Paint d;
    public l2d e;
    public mq5 f;
    public mq5 h;

    public dr3(Activity activity) {
        super(activity);
        this.d = new Paint(1);
        mq5 mq5Var = mq5.e;
        this.f = mq5Var;
        this.h = mq5Var;
        ht2 ht2Var = new ht2(this, (byte) 28);
        WeakHashMap weakHashMap = ihc.a;
        ahc.i(this, ht2Var);
        setSystemUiVisibility(1280);
    }

    @Override
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        l2d l2dVar = this.e;
        if (l2dVar != null) {
            if ((view instanceof ActionBarLayout) || view.getTag() == null) {
                ihc.b(view, l2dVar);
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ActionBarLayout actionBarLayout = this.b;
        if (actionBarLayout != null && actionBarLayout.getParent() == this) {
            this.b.P(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    public Paint getInternalNavbarPaint() {
        return this.d;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return ((ActionBarLayout) this.a).h();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.c = true;
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                try {
                    childAt.layout(layoutParams.leftMargin, layoutParams.topMargin + getPaddingTop(), layoutParams.leftMargin + childAt.getMeasuredWidth(), layoutParams.topMargin + childAt.getMeasuredHeight() + getPaddingTop());
                } catch (Exception e) {
                    cc4.g(e, true);
                    boolean z2 = f11.a;
                    throw e;
                }
            }
        }
        this.c = false;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        mq5 mq5Var = this.f;
        int i3 = (size - mq5Var.a) - mq5Var.c;
        int i4 = (size2 - mq5Var.b) - mq5Var.d;
        Point point = hl.q;
        point.x = i3;
        point.y = i4;
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((size - layoutParams.leftMargin) - layoutParams.rightMargin, 1073741824);
                int i6 = layoutParams.height;
                if (i6 > 0) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((size2 - layoutParams.topMargin) - layoutParams.bottomMargin, 1073741824);
                }
                if ((childAt instanceof ActionBarLayout) && ((ActionBarLayout) childAt).h0()) {
                    childAt.forceLayout();
                }
                childAt.measure(makeMeasureSpec2, makeMeasureSpec);
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void requestLayout() {
        if (!this.c) {
            super.requestLayout();
        }
    }

    public void setActionBarLayout(ActionBarLayout actionBarLayout) {
        this.b = actionBarLayout;
    }

    public void setInternalNavigationBarColor(int i) {
        Paint paint = this.d;
        if (paint.getColor() != i) {
            paint.setColor(i);
            invalidate();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                getChildAt(i2).invalidate();
            }
        }
    }

    public void setParentActionBarLayout(wk5 wk5Var) {
        this.a = wk5Var;
    }
}
