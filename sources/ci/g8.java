package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class g8 extends FrameLayout {
    public p4 f5372a;
    public long f5373b;
    public ArrayList f5374c;
    public boolean d;
    public final p9 e;

    public g8(p9 p9Var, Context context) {
        super(context);
        this.e = p9Var;
    }

    public final void a(boolean z10) {
        if (this.d != z10) {
            this.d = z10;
            invalidate();
            this.f5372a.setIsVisible(z10);
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
