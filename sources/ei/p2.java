package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class p2 extends View {
    public final int f9594a;
    public final s2 f9595b;

    public p2(s2 s2Var, Context context, int i10) {
        super(context);
        this.f9594a = i10;
        this.f9595b = s2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.f9594a) {
            case 0:
                s2 s2Var = this.f9595b;
                s2Var.f9795q.reset();
                s2Var.b(canvas, true);
                return;
            default:
                s2 s2Var2 = this.f9595b;
                s2Var2.f9795q.reset();
                s2Var2.f9795q.postTranslate(-getX(), (-getY()) + AndroidUtilities.statusBarHeight);
                s2Var2.f9795q.postScale(1.0f / getScaleX(), 1.0f / getScaleY(), getPivotX(), getPivotY());
                s2Var2.b(canvas, false);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f9594a) {
            case 0:
                super.onMeasure(i10, i11);
                this.f9595b.g();
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }
}
