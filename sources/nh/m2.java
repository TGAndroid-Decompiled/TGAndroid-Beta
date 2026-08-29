package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class m2 extends View {
    public final int f18122a;
    public final p2 f18123b;

    public m2(p2 p2Var, Context context, int i10) {
        super(context);
        this.f18122a = i10;
        this.f18123b = p2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.f18122a) {
            case 0:
                p2 p2Var = this.f18123b;
                p2Var.f18344q.reset();
                p2Var.b(canvas, true);
                return;
            default:
                p2 p2Var2 = this.f18123b;
                p2Var2.f18344q.reset();
                p2Var2.f18344q.postTranslate(-getX(), (-getY()) + AndroidUtilities.statusBarHeight);
                p2Var2.f18344q.postScale(1.0f / getScaleX(), 1.0f / getScaleY(), getPivotX(), getPivotY());
                p2Var2.b(canvas, false);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f18122a) {
            case 0:
                super.onMeasure(i10, i11);
                this.f18123b.g();
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }
}
