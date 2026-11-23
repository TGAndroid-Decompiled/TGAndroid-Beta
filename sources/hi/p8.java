package hi;

import android.content.Context;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.kr;
public final class p8 extends FrameLayout {
    public final int f15186a = 0;
    public final org.telegram.ui.Components.c6 f15187b;
    public float f15188c;
    public final Path d;
    public final org.telegram.ui.ActionBar.w2 f15189e;

    public p8(li.c0 c0Var, Context context) {
        super(context);
        this.f15189e = c0Var;
        this.f15187b = new org.telegram.ui.Components.c6(this, 250L, kr.h);
        this.d = new Path();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r18) {
        throw new UnsupportedOperationException("Method not decompiled: hi.p8.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f15186a) {
            case 0:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f15188c) {
                    ((k9) this.f15189e).dismiss();
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f15188c) {
                    ((li.c0) this.f15189e).dismiss();
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        switch (this.f15186a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
                return;
            default:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
                return;
        }
    }

    public p8(k9 k9Var, Context context) {
        super(context);
        this.f15189e = k9Var;
        this.f15187b = new org.telegram.ui.Components.c6(this, 250L, kr.h);
        this.d = new Path();
    }
}
