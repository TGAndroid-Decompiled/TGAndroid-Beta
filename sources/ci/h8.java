package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class h8 extends FrameLayout {
    public q4 f5476a;
    public long f5477b;
    public ArrayList f5478c;
    public boolean d;
    public final q9 e;

    public h8(q9 q9Var, Context context) {
        super(context);
        this.e = q9Var;
    }

    public final void a(boolean z10) {
        if (this.d != z10) {
            this.d = z10;
            invalidate();
            this.f5476a.setIsVisible(z10);
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
