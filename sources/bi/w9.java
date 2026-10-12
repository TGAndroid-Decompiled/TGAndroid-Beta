package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class w9 extends FrameLayout {
    public q5 f3923a;
    public long f3924b;
    public ArrayList f3925c;
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
            this.f3923a.setIsVisible(z10);
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
