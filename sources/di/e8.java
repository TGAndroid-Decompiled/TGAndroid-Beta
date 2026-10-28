package di;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class e8 extends FrameLayout {
    public q4 f8525a;
    public long f8526b;
    public ArrayList f8527c;
    public boolean d;
    public final x e;

    public e8(x xVar, Context context) {
        super(context);
        this.e = xVar;
    }

    public final void a(boolean z10) {
        if (this.d != z10) {
            this.d = z10;
            invalidate();
            this.f8525a.setIsVisible(z10);
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
