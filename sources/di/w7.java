package di;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class w7 extends FrameLayout {
    public i4 f9910a;
    public long f9911b;
    public ArrayList f9912c;
    public boolean d;
    public final w f9913e;

    public w7(w wVar, Context context) {
        super(context);
        this.f9913e = wVar;
    }

    public final void a(boolean z9) {
        if (this.d != z9) {
            this.d = z9;
            invalidate();
            this.f9910a.setIsVisible(z9);
            this.f9913e.A();
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
