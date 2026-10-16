package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class w9 extends FrameLayout {
    public q5 f3927a;
    public long f3928b;
    public ArrayList f3929c;
    public boolean d;
    public final ib e;

    public w9(ib ibVar, Context context) {
        super(context);
        this.e = ibVar;
    }

    public final void a(boolean z10) {
        if (this.d != z10) {
            this.d = z10;
            invalidate();
            this.f3927a.setIsVisible(z10);
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
