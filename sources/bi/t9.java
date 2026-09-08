package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class t9 extends FrameLayout {
    public o5 f3776a;
    public long f3777b;
    public ArrayList f3778c;
    public boolean d;
    public final fb f3779e;

    public t9(fb fbVar, Context context) {
        super(context);
        this.f3779e = fbVar;
    }

    public final void a(boolean z10) {
        if (this.d != z10) {
            this.d = z10;
            invalidate();
            this.f3776a.setIsVisible(z10);
            this.f3779e.A();
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
