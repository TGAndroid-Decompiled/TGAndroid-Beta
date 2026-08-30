package gg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.ActionBar.j6;
public final class r2 extends View {
    public final v2 f6741a;

    public r2(v2 v2Var, Context context) {
        super(context);
        this.f6741a = v2Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawColor(this.f6741a.getThemedColor(j6.f19924e7));
    }
}
