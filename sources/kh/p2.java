package kh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class p2 extends View {
    public final int f15824a;
    public final s2 f15825b;

    public p2(s2 s2Var, Context context, int i9) {
        super(context);
        this.f15824a = i9;
        this.f15825b = s2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.f15824a) {
            case 0:
                s2 s2Var = this.f15825b;
                s2Var.f16023q.reset();
                s2Var.b(canvas, true);
                return;
            default:
                s2 s2Var2 = this.f15825b;
                s2Var2.f16023q.reset();
                s2Var2.f16023q.postTranslate(-getX(), (-getY()) + AndroidUtilities.statusBarHeight);
                s2Var2.f16023q.postScale(1.0f / getScaleX(), 1.0f / getScaleY(), getPivotX(), getPivotY());
                s2Var2.b(canvas, false);
                return;
        }
    }

    @Override
    public void onMeasure(int i9, int i10) {
        switch (this.f15824a) {
            case 0:
                super.onMeasure(i9, i10);
                this.f15825b.g();
                return;
            default:
                super.onMeasure(i9, i10);
                return;
        }
    }
}
