package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class na extends FrameLayout {
    public f6 f1487a;
    public long f1488b;
    public ArrayList f1489c;
    public boolean d;
    public final ac f1490e;

    public na(ac acVar, Context context) {
        super(context);
        this.f1490e = acVar;
    }

    public final void a(boolean z10) {
        if (this.d != z10) {
            this.d = z10;
            invalidate();
            this.f1487a.setIsVisible(z10);
            this.f1490e.A();
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
