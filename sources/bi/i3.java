package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class i3 extends View {
    public final int f2850a;
    public final m3 f2851b;

    public i3(m3 m3Var, Context context, int i10) {
        super(context);
        this.f2850a = i10;
        this.f2851b = m3Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.f2850a) {
            case 0:
                m3 m3Var = this.f2851b;
                m3Var.f3089q.reset();
                m3Var.b(canvas, true);
                return;
            default:
                m3 m3Var2 = this.f2851b;
                m3Var2.f3089q.reset();
                m3Var2.f3089q.postTranslate(-getX(), (-getY()) + AndroidUtilities.statusBarHeight);
                m3Var2.f3089q.postScale(1.0f / getScaleX(), 1.0f / getScaleY(), getPivotX(), getPivotY());
                m3Var2.b(canvas, false);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f2850a) {
            case 0:
                super.onMeasure(i10, i11);
                this.f2851b.g();
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }
}
