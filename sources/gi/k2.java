package gi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class k2 extends View {
    public final int f13028a;
    public final n2 f13029b;

    public k2(n2 n2Var, Context context, int i3) {
        super(context);
        this.f13028a = i3;
        this.f13029b = n2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.f13028a) {
            case 0:
                n2 n2Var = this.f13029b;
                n2Var.f13294q.reset();
                n2Var.b(canvas, true);
                return;
            default:
                n2 n2Var2 = this.f13029b;
                n2Var2.f13294q.reset();
                n2Var2.f13294q.postTranslate(-getX(), (-getY()) + org.telegram.messenger.g0.f22602m);
                n2Var2.f13294q.postScale(1.0f / getScaleX(), 1.0f / getScaleY(), getPivotX(), getPivotY());
                n2Var2.b(canvas, false);
                return;
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        switch (this.f13028a) {
            case 0:
                super.onMeasure(i3, i10);
                this.f13029b.g();
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }
}
