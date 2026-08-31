package hg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.ActionBar.k6;
public final class r2 extends View {
    public final v2 f7594a;

    public r2(v2 v2Var, Context context) {
        super(context);
        this.f7594a = v2Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawColor(this.f7594a.getThemedColor(k6.f21678e7));
    }
}
