package di;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class e8 extends FrameLayout {
    public q4 f8526a;
    public long f8527b;
    public ArrayList f8528c;
    public boolean d;
    public final o9 e;

    public e8(o9 o9Var, Context context) {
        super(context);
        this.e = o9Var;
    }

    public final void a(boolean z10) {
        if (this.d != z10) {
            this.d = z10;
            invalidate();
            this.f8526a.setIsVisible(z10);
            this.e.A();
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
