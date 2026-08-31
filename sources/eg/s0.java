package eg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.ht0;
public final class s0 extends View {
    public final ht0 f5470a;

    public s0(ht0 ht0Var, Context context) {
        super(context);
        this.f5470a = ht0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        q0 q0Var = this.f5470a.T0;
        if (q0Var != null) {
            q0Var.d(canvas);
        }
    }
}
