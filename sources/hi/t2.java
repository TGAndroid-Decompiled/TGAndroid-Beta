package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class t2 extends View {
    public final int f15432a;
    public final w2 f15433b;

    public t2(w2 w2Var, Context context, int i7) {
        super(context);
        this.f15432a = i7;
        this.f15433b = w2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.f15432a) {
            case 0:
                w2 w2Var = this.f15433b;
                w2Var.f15667q.reset();
                w2Var.b(canvas, true);
                return;
            default:
                w2 w2Var2 = this.f15433b;
                w2Var2.f15667q.reset();
                w2Var2.f15667q.postTranslate(-getX(), (-getY()) + org.telegram.messenger.g0.f24220m);
                w2Var2.f15667q.postScale(1.0f / getScaleX(), 1.0f / getScaleY(), getPivotX(), getPivotY());
                w2Var2.b(canvas, false);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f15432a) {
            case 0:
                super.onMeasure(i7, i10);
                this.f15433b.g();
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }
}
