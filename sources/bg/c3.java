package bg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
public final class c3 extends View {
    public final g3 f1722a;

    public c3(g3 g3Var, Context context) {
        super(context);
        this.f1722a = g3Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawColor(this.f1722a.getThemedColor(f6.f23020e7));
    }
}
