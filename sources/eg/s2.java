package eg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.ActionBar.g6;
public final class s2 extends View {
    public final w2 f6125a;

    public s2(w2 w2Var, Context context) {
        super(context);
        this.f6125a = w2Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawColor(this.f6125a.getThemedColor(g6.f23081e7));
    }
}
