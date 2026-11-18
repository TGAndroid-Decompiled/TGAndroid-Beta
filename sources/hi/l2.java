package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class l2 extends View {
    public final int f14887a;
    public final o2 f14888b;

    public l2(o2 o2Var, Context context, int i7) {
        super(context);
        this.f14887a = i7;
        this.f14888b = o2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.f14887a) {
            case 0:
                o2 o2Var = this.f14888b;
                o2Var.f15151q.reset();
                o2Var.b(canvas, true);
                return;
            default:
                o2 o2Var2 = this.f14888b;
                o2Var2.f15151q.reset();
                o2Var2.f15151q.postTranslate(-getX(), (-getY()) + org.telegram.messenger.g0.f24112m);
                o2Var2.f15151q.postScale(1.0f / getScaleX(), 1.0f / getScaleY(), getPivotX(), getPivotY());
                o2Var2.b(canvas, false);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f14887a) {
            case 0:
                super.onMeasure(i7, i10);
                this.f14888b.g();
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }
}
