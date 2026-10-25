package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class n2 extends View {
    public final int f11291a;
    public final q2 f11292b;

    public n2(q2 q2Var, Context context, int i10) {
        super(context);
        this.f11291a = i10;
        this.f11292b = q2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.f11291a) {
            case 0:
                q2 q2Var = this.f11292b;
                q2Var.f11478q.reset();
                q2Var.b(canvas, true);
                return;
            default:
                q2 q2Var2 = this.f11292b;
                q2Var2.f11478q.reset();
                q2Var2.f11478q.postTranslate(-getX(), (-getY()) + AndroidUtilities.statusBarHeight);
                q2Var2.f11478q.postScale(1.0f / getScaleX(), 1.0f / getScaleY(), getPivotX(), getPivotY());
                q2Var2.b(canvas, false);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f11291a) {
            case 0:
                super.onMeasure(i10, i11);
                this.f11292b.g();
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }
}
