package defpackage;

import android.app.Activity;
import android.graphics.Typeface;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import org.telegram.ui.o;
public final class tv extends HorizontalScrollView {
    public final vg5 a;
    public final uv b;

    public tv(uv uvVar, Activity activity, vg5 vg5Var) {
        super(activity);
        this.b = uvVar;
        this.a = vg5Var;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        this.b.e.getMeasuredWidth();
        getMeasuredWidth();
        Typeface typeface = gl.a;
        return onInterceptTouchEvent;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        efb efbVar = this.b.e;
        efbVar.measure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight(), 0), i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), efbVar.getMeasuredHeight());
    }

    @Override
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        vg5 vg5Var = this.a;
        if (vg5Var.d != null) {
            vg5Var.d = null;
            vg5Var.f = null;
        }
        this.b.a();
        fib fibVar = ((o) vg5Var).Q0;
        if (fibVar != null && fibVar.w()) {
            fibVar.v();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.b.e.getMeasuredWidth() <= getMeasuredWidth() - gl.L(36.0f)) {
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
