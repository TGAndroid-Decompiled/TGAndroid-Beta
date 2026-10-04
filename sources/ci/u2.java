package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class u2 extends View {
    public final int f6058a;
    public final x2 f6059b;

    public u2(x2 x2Var, Context context, int i10) {
        super(context);
        this.f6058a = i10;
        this.f6059b = x2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.f6058a) {
            case 0:
                x2 x2Var = this.f6059b;
                x2Var.f6279q.reset();
                x2Var.b(canvas, true);
                return;
            default:
                x2 x2Var2 = this.f6059b;
                x2Var2.f6279q.reset();
                x2Var2.f6279q.postTranslate(-getX(), (-getY()) + AndroidUtilities.statusBarHeight);
                x2Var2.f6279q.postScale(1.0f / getScaleX(), 1.0f / getScaleY(), getPivotX(), getPivotY());
                x2Var2.b(canvas, false);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f6058a) {
            case 0:
                super.onMeasure(i10, i11);
                this.f6059b.g();
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }
}
