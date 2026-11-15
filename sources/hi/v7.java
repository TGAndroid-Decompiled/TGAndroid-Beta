package hi;

import android.content.Context;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.er;
public final class v7 extends FrameLayout {
    public final int f15245a = 0;
    public final org.telegram.ui.Components.u5 f15246b;
    public float f15247c;
    public final Path d;
    public final org.telegram.ui.ActionBar.u2 f15248e;

    public v7(li.d0 d0Var, Context context) {
        super(context);
        this.f15248e = d0Var;
        this.f15246b = new org.telegram.ui.Components.u5(this, 250L, er.h);
        this.d = new Path();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r18) {
        throw new UnsupportedOperationException("Method not decompiled: hi.v7.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f15245a) {
            case 0:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f15247c) {
                    ((q8) this.f15248e).dismiss();
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f15247c) {
                    ((li.d0) this.f15248e).dismiss();
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        switch (this.f15245a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
                return;
            default:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
                return;
        }
    }

    public v7(q8 q8Var, Context context) {
        super(context);
        this.f15248e = q8Var;
        this.f15246b = new org.telegram.ui.Components.u5(this, 250L, er.h);
        this.d = new Path();
    }
}
