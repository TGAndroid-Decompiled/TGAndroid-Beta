package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class o2 extends View {

    public final int f16468a;

    public final r2 f16469b;

    public o2(r2 r2Var, Context context, int i10) {
        super(context);
        this.f16468a = i10;
        this.f16469b = r2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.f16468a) {
            case 0:
                r2 r2Var = this.f16469b;
                r2Var.f16640q.reset();
                r2Var.b(canvas, true);
                break;
            default:
                r2 r2Var2 = this.f16469b;
                r2Var2.f16640q.reset();
                r2Var2.f16640q.postTranslate(-getX(), (-getY()) + AndroidUtilities.statusBarHeight);
                r2Var2.f16640q.postScale(1.0f / getScaleX(), 1.0f / getScaleY(), getPivotX(), getPivotY());
                r2Var2.b(canvas, false);
                break;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f16468a) {
            case 0:
                super.onMeasure(i10, i11);
                this.f16469b.g();
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }
}
