package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class k2 extends View {
    public final int f14497a;
    public final n2 f14498b;

    public k2(n2 n2Var, Context context, int i7) {
        super(context);
        this.f14497a = i7;
        this.f14498b = n2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.f14497a) {
            case 0:
                n2 n2Var = this.f14498b;
                n2Var.f14753q.reset();
                n2Var.b(canvas, true);
                return;
            default:
                n2 n2Var2 = this.f14498b;
                n2Var2.f14753q.reset();
                n2Var2.f14753q.postTranslate(-getX(), (-getY()) + org.telegram.messenger.g0.f23605m);
                n2Var2.f14753q.postScale(1.0f / getScaleX(), 1.0f / getScaleY(), getPivotX(), getPivotY());
                n2Var2.b(canvas, false);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f14497a) {
            case 0:
                super.onMeasure(i7, i10);
                this.f14498b.g();
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }
}
