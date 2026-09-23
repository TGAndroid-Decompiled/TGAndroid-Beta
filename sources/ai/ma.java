package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class ma extends FrameLayout {
    public e6 f1268a;
    public long f1269b;
    public ArrayList f1270c;
    public boolean d;
    public final zb e;

    public ma(zb zbVar, Context context) {
        super(context);
        this.e = zbVar;
    }

    public final void a(boolean z10) {
        if (this.d != z10) {
            this.d = z10;
            invalidate();
            this.f1268a.setIsVisible(z10);
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
