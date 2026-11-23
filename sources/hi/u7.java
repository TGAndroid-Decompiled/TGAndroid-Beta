package hi;

import android.content.Context;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.nr;
public final class u7 extends FrameLayout {
    public final int f15572a = 0;
    public final org.telegram.ui.Components.d6 f15573b;
    public float f15574c;
    public final Path d;
    public final org.telegram.ui.ActionBar.w2 f15575e;

    public u7(li.d0 d0Var, Context context) {
        super(context);
        this.f15575e = d0Var;
        this.f15573b = new org.telegram.ui.Components.d6(this, 250L, nr.h);
        this.d = new Path();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r18) {
        throw new UnsupportedOperationException("Method not decompiled: hi.u7.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f15572a) {
            case 0:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f15574c) {
                    ((p8) this.f15575e).dismiss();
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f15574c) {
                    ((li.d0) this.f15575e).dismiss();
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        switch (this.f15572a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
                return;
            default:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
                return;
        }
    }

    public u7(p8 p8Var, Context context) {
        super(context);
        this.f15575e = p8Var;
        this.f15573b = new org.telegram.ui.Components.d6(this, 250L, nr.h);
        this.d = new Path();
    }
}
