package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class u2 extends View {
    public final int f5601a;
    public final x2 f5602b;

    public u2(x2 x2Var, Context context, int i10) {
        super(context);
        this.f5601a = i10;
        this.f5602b = x2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.f5601a) {
            case 0:
                x2 x2Var = this.f5602b;
                x2Var.f5820q.reset();
                x2Var.b(canvas, true);
                return;
            default:
                x2 x2Var2 = this.f5602b;
                x2Var2.f5820q.reset();
                x2Var2.f5820q.postTranslate(-getX(), (-getY()) + AndroidUtilities.statusBarHeight);
                x2Var2.f5820q.postScale(1.0f / getScaleX(), 1.0f / getScaleY(), getPivotX(), getPivotY());
                x2Var2.b(canvas, false);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f5601a) {
            case 0:
                super.onMeasure(i10, i11);
                this.f5602b.g();
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }
}
