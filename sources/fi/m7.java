package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class m7 extends FrameLayout {
    public z3 f12274a;
    public long f12275b;
    public ArrayList f12276c;
    public boolean d;
    public final w f12277e;

    public m7(w wVar, Context context) {
        super(context);
        this.f12277e = wVar;
    }

    public final void a(boolean z10) {
        if (this.d != z10) {
            this.d = z10;
            invalidate();
            this.f12274a.setIsVisible(z10);
            this.f12277e.A();
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
