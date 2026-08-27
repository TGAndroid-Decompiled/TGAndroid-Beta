package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

public final class x5 extends View {

    public final va f17035a;

    public x5(va vaVar, Context context) {
        super(context);
        this.f17035a = vaVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        v5 v5Var = this.f17035a.K0;
        if (v5Var != null) {
            v5Var.d(canvas);
        }
    }
}
