package fi;

import android.content.Context;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ds;
public final class q8 extends FrameLayout {
    public final int f11499a = 0;
    public final org.telegram.ui.Components.h6 f11500b;
    public float f11501c;
    public final Path d;
    public final org.telegram.ui.ActionBar.k3 e;

    public q8(ii.j0 j0Var, Context context) {
        super(context);
        this.e = j0Var;
        this.f11500b = new org.telegram.ui.Components.h6(this, 250L, ds.h);
        this.d = new Path();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r18) {
        throw new UnsupportedOperationException("Method not decompiled: fi.q8.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f11499a) {
            case 0:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f11501c) {
                    ((n9) this.e).dismiss();
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f11501c) {
                    ((ii.j0) this.e).dismiss();
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f11499a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
                return;
            default:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
                return;
        }
    }

    public q8(n9 n9Var, Context context) {
        super(context);
        this.e = n9Var;
        this.f11500b = new org.telegram.ui.Components.h6(this, 250L, ds.h);
        this.d = new Path();
    }
}
