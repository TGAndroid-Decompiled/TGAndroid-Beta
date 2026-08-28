package ih;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class t7 extends FrameLayout {
    public i4 f12169a;
    public long f12170b;
    public ArrayList f12171c;
    public boolean d;
    public final c9 f12172e;

    public t7(c9 c9Var, Context context) {
        super(context);
        this.f12172e = c9Var;
    }

    public final void a(boolean z10) {
        if (this.d != z10) {
            this.d = z10;
            invalidate();
            this.f12169a.setIsVisible(z10);
            this.f12172e.A();
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
