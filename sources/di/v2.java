package di;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class v2 extends View {
    public final int f8311a;
    public final y2 f8312b;

    public v2(y2 y2Var, Context context, int i10) {
        super(context);
        this.f8311a = i10;
        this.f8312b = y2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.f8311a) {
            case 0:
                y2 y2Var = this.f8312b;
                y2Var.f8490q.reset();
                y2Var.b(canvas, true);
                return;
            default:
                y2 y2Var2 = this.f8312b;
                y2Var2.f8490q.reset();
                y2Var2.f8490q.postTranslate(-getX(), (-getY()) + AndroidUtilities.statusBarHeight);
                y2Var2.f8490q.postScale(1.0f / getScaleX(), 1.0f / getScaleY(), getPivotX(), getPivotY());
                y2Var2.b(canvas, false);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f8311a) {
            case 0:
                super.onMeasure(i10, i11);
                this.f8312b.g();
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }
}
