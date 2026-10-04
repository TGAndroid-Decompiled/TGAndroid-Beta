package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class ma extends FrameLayout {
    public e6 f1372a;
    public long f1373b;
    public ArrayList f1374c;
    public boolean d;
    public final zb f1375e;

    public ma(zb zbVar, Context context) {
        super(context);
        this.f1375e = zbVar;
    }

    public final void a(boolean z10) {
        if (this.d != z10) {
            this.d = z10;
            invalidate();
            this.f1372a.setIsVisible(z10);
            this.f1375e.A();
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
