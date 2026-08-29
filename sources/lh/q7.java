package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class q7 extends FrameLayout {
    public d4 f16132a;
    public long f16133b;
    public ArrayList f16134c;
    public boolean d;
    public final y8 f16135e;

    public q7(y8 y8Var, Context context) {
        super(context);
        this.f16135e = y8Var;
    }

    public final void a(boolean z10) {
        if (this.d != z10) {
            this.d = z10;
            invalidate();
            this.f16132a.setIsVisible(z10);
            this.f16135e.A();
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
