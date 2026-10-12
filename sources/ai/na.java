package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class na extends FrameLayout {
    public f6 f1485a;
    public long f1486b;
    public ArrayList f1487c;
    public boolean d;
    public final ac f1488e;

    public na(ac acVar, Context context) {
        super(context);
        this.f1488e = acVar;
    }

    public final void a(boolean z10) {
        if (this.d != z10) {
            this.d = z10;
            invalidate();
            this.f1485a.setIsVisible(z10);
            this.f1488e.A();
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
