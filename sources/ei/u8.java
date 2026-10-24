package ei;

import android.content.Context;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.zr;
public final class u8 extends FrameLayout {
    public final int f9925a = 0;
    public final org.telegram.ui.Components.d6 f9926b;
    public float f9927c;
    public final Path d;
    public final org.telegram.ui.ActionBar.h3 e;

    public u8(hi.k0 k0Var, Context context) {
        super(context);
        this.e = k0Var;
        this.f9926b = new org.telegram.ui.Components.d6(this, 250L, zr.h);
        this.d = new Path();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r18) {
        throw new UnsupportedOperationException("Method not decompiled: ei.u8.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f9925a) {
            case 0:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f9927c) {
                    ((r9) this.e).dismiss();
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f9927c) {
                    ((hi.k0) this.e).dismiss();
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f9925a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
                return;
            default:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
                return;
        }
    }

    public u8(r9 r9Var, Context context) {
        super(context);
        this.e = r9Var;
        this.f9926b = new org.telegram.ui.Components.d6(this, 250L, zr.h);
        this.d = new Path();
    }
}
