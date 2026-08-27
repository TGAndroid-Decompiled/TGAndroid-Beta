package cg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.ActionBar.g6;

public final class u2 extends View {

    public final y2 f2834a;

    public u2(y2 y2Var, Context context) {
        super(context);
        this.f2834a = y2Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawColor(this.f2834a.getThemedColor(g6.f23073e7));
    }
}
