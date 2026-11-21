package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class k2 extends View {
    public final int f14862a;
    public final n2 f14863b;

    public k2(n2 n2Var, Context context, int i7) {
        super(context);
        this.f14862a = i7;
        this.f14863b = n2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.f14862a) {
            case 0:
                n2 n2Var = this.f14863b;
                n2Var.f15084q.reset();
                n2Var.b(canvas, true);
                return;
            default:
                n2 n2Var2 = this.f14863b;
                n2Var2.f15084q.reset();
                n2Var2.f15084q.postTranslate(-getX(), (-getY()) + org.telegram.messenger.g0.f24140m);
                n2Var2.f15084q.postScale(1.0f / getScaleX(), 1.0f / getScaleY(), getPivotX(), getPivotY());
                n2Var2.b(canvas, false);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f14862a) {
            case 0:
                super.onMeasure(i7, i10);
                this.f14863b.g();
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }
}
