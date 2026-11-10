package fi;

import android.content.Context;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.wq;
public final class x7 extends FrameLayout {
    public final int f13092a = 0;
    public final org.telegram.ui.Components.v5 f13093b;
    public float f13094c;
    public final Path d;
    public final org.telegram.ui.ActionBar.w2 f13095e;

    public x7(ii.d0 d0Var, Context context) {
        super(context);
        this.f13095e = d0Var;
        this.f13093b = new org.telegram.ui.Components.v5(this, 250L, wq.h);
        this.d = new Path();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r18) {
        throw new UnsupportedOperationException("Method not decompiled: fi.x7.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f13092a) {
            case 0:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f13094c) {
                    ((s8) this.f13095e).dismiss();
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f13094c) {
                    ((ii.d0) this.f13095e).dismiss();
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        switch (this.f13092a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
                return;
            default:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
                return;
        }
    }

    public x7(s8 s8Var, Context context) {
        super(context);
        this.f13095e = s8Var;
        this.f13093b = new org.telegram.ui.Components.v5(this, 250L, wq.h);
        this.d = new Path();
    }
}
