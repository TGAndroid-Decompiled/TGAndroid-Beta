package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class m2 extends View {
    public final int f12413a;
    public final p2 f12414b;

    public m2(p2 p2Var, Context context, int i7) {
        super(context);
        this.f12413a = i7;
        this.f12414b = p2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.f12413a) {
            case 0:
                p2 p2Var = this.f12414b;
                p2Var.f12588q.reset();
                p2Var.b(canvas, true);
                return;
            default:
                p2 p2Var2 = this.f12414b;
                p2Var2.f12588q.reset();
                p2Var2.f12588q.postTranslate(-getX(), (-getY()) + org.telegram.messenger.g0.f22531m);
                p2Var2.f12588q.postScale(1.0f / getScaleX(), 1.0f / getScaleY(), getPivotX(), getPivotY());
                p2Var2.b(canvas, false);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f12413a) {
            case 0:
                super.onMeasure(i7, i10);
                this.f12414b.g();
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }
}
