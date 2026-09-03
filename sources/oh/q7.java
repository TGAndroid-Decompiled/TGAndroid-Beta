package oh;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class q7 extends FrameLayout {
    public f4 f17664a;
    public long f17665b;
    public ArrayList f17666c;
    public boolean d;
    public final y8 f17667e;

    public q7(y8 y8Var, Context context) {
        super(context);
        this.f17667e = y8Var;
    }

    public final void a(boolean z4) {
        if (this.d != z4) {
            this.d = z4;
            invalidate();
            this.f17664a.setIsVisible(z4);
            this.f17667e.A();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (!this.d) {
            return;
        }
        super.dispatchDraw(canvas);
    }
}
