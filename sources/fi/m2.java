package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class m2 extends View {
    public final int f12415a;
    public final p2 f12416b;

    public m2(p2 p2Var, Context context, int i7) {
        super(context);
        this.f12415a = i7;
        this.f12416b = p2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.f12415a) {
            case 0:
                p2 p2Var = this.f12416b;
                p2Var.f12590q.reset();
                p2Var.b(canvas, true);
                return;
            default:
                p2 p2Var2 = this.f12416b;
                p2Var2.f12590q.reset();
                p2Var2.f12590q.postTranslate(-getX(), (-getY()) + org.telegram.messenger.g0.f22561m);
                p2Var2.f12590q.postScale(1.0f / getScaleX(), 1.0f / getScaleY(), getPivotX(), getPivotY());
                p2Var2.b(canvas, false);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f12415a) {
            case 0:
                super.onMeasure(i7, i10);
                this.f12416b.g();
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }
}
