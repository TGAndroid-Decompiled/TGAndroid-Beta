package oh;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class q7 extends FrameLayout {
    public f4 f17662a;
    public long f17663b;
    public ArrayList f17664c;
    public boolean d;
    public final y8 f17665e;

    public q7(y8 y8Var, Context context) {
        super(context);
        this.f17665e = y8Var;
    }

    public final void a(boolean z4) {
        if (this.d != z4) {
            this.d = z4;
            invalidate();
            this.f17662a.setIsVisible(z4);
            this.f17665e.A();
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
