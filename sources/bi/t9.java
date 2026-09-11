package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class t9 extends FrameLayout {
    public o5 f3749a;
    public long f3750b;
    public ArrayList f3751c;
    public boolean d;
    public final fb f3752e;

    public t9(fb fbVar, Context context) {
        super(context);
        this.f3752e = fbVar;
    }

    public final void a(boolean z10) {
        if (this.d != z10) {
            this.d = z10;
            invalidate();
            this.f3749a.setIsVisible(z10);
            this.f3752e.A();
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
