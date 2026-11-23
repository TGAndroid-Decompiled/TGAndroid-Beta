package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class m7 extends FrameLayout {
    public z3 f12269a;
    public long f12270b;
    public ArrayList f12271c;
    public boolean d;
    public final w f12272e;

    public m7(w wVar, Context context) {
        super(context);
        this.f12272e = wVar;
    }

    public final void a(boolean z10) {
        if (this.d != z10) {
            this.d = z10;
            invalidate();
            this.f12269a.setIsVisible(z10);
            this.f12272e.A();
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
