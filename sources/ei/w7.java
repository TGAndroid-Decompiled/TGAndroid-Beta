package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class w7 extends FrameLayout {
    public j4 f11189a;
    public long f11190b;
    public ArrayList f11191c;
    public boolean d;
    public final x f11192e;

    public w7(x xVar, Context context) {
        super(context);
        this.f11192e = xVar;
    }

    public final void a(boolean z10) {
        if (this.d != z10) {
            this.d = z10;
            invalidate();
            this.f11189a.setIsVisible(z10);
            this.f11192e.A();
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
