package defpackage;

import android.app.Activity;
import android.graphics.Typeface;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import org.telegram.ui.o;
public final class uv extends HorizontalScrollView {
    public final xi5 a;
    public final vv b;

    public uv(vv vvVar, Activity activity, xi5 xi5Var) {
        super(activity);
        this.b = vvVar;
        this.a = xi5Var;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        this.b.e.getMeasuredWidth();
        getMeasuredWidth();
        Typeface typeface = hl.a;
        return onInterceptTouchEvent;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        zib zibVar = this.b.e;
        zibVar.measure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight(), 0), i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), zibVar.getMeasuredHeight());
    }

    @Override
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        xi5 xi5Var = this.a;
        if (xi5Var.d != null) {
            xi5Var.d = null;
            xi5Var.f = null;
        }
        this.b.a();
        amb ambVar = ((o) xi5Var).Q0;
        if (ambVar != null && ambVar.w()) {
            ambVar.v();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.b.e.getMeasuredWidth() <= getMeasuredWidth() - hl.L(36.0f)) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        o.R(this.a);
        return super.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
    }
}
