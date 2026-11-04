package gi;

import android.content.Context;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.xq;
public final class w7 extends FrameLayout {
    public final int f13801a = 0;
    public final org.telegram.ui.Components.u5 f13802b;
    public float f13803c;
    public final Path d;
    public final org.telegram.ui.ActionBar.t2 f13804e;

    public w7(ji.b0 b0Var, Context context) {
        super(context);
        this.f13804e = b0Var;
        this.f13802b = new org.telegram.ui.Components.u5(this, 250L, xq.h);
        this.d = new Path();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r18) {
        throw new UnsupportedOperationException("Method not decompiled: gi.w7.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f13801a) {
            case 0:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f13803c) {
                    ((t8) this.f13804e).dismiss();
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f13803c) {
                    ((ji.b0) this.f13804e).dismiss();
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        switch (this.f13801a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
                return;
            default:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
                return;
        }
    }

    public w7(t8 t8Var, Context context) {
        super(context);
        this.f13804e = t8Var;
        this.f13802b = new org.telegram.ui.Components.u5(this, 250L, xq.h);
        this.d = new Path();
    }
}
