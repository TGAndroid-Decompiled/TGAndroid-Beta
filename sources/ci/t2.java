package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class t2 extends View {
    public final int f5993a;
    public final w2 f5994b;

    public t2(w2 w2Var, Context context, int i10) {
        super(context);
        this.f5993a = i10;
        this.f5994b = w2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.f5993a) {
            case 0:
                w2 w2Var = this.f5994b;
                w2Var.f6197q.reset();
                w2Var.b(canvas, true);
                return;
            default:
                w2 w2Var2 = this.f5994b;
                w2Var2.f6197q.reset();
                w2Var2.f6197q.postTranslate(-getX(), (-getY()) + AndroidUtilities.statusBarHeight);
                w2Var2.f6197q.postScale(1.0f / getScaleX(), 1.0f / getScaleY(), getPivotX(), getPivotY());
                w2Var2.b(canvas, false);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f5993a) {
            case 0:
                super.onMeasure(i10, i11);
                this.f5994b.g();
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }
}
