package defpackage;

import android.app.Activity;
import android.graphics.Typeface;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import org.telegram.ui.o;
public final class tw extends HorizontalScrollView {
    public final ui5 a;
    public final uw b;

    public tw(uw uwVar, Activity activity, ui5 ui5Var) {
        super(activity);
        this.b = uwVar;
        this.a = ui5Var;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        this.b.e.getMeasuredWidth();
        getMeasuredWidth();
        Typeface typeface = gm.a;
        return onInterceptTouchEvent;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        ehb ehbVar = this.b.e;
        ehbVar.measure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight(), 0), i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), ehbVar.getMeasuredHeight());
    }

    @Override
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        ui5 ui5Var = this.a;
        if (ui5Var.d != null) {
            ui5Var.d = null;
            ui5Var.f = null;
        }
        this.b.a();
        gkb gkbVar = ((o) ui5Var).Q0;
        if (gkbVar != null && gkbVar.w()) {
            gkbVar.v();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.b.e.getMeasuredWidth() <= getMeasuredWidth() - gm.L(36.0f)) {
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
