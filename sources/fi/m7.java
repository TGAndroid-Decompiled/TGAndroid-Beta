package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class m7 extends FrameLayout {
    public z3 f12277a;
    public long f12278b;
    public ArrayList f12279c;
    public boolean d;
    public final w f12280e;

    public m7(w wVar, Context context) {
        super(context);
        this.f12280e = wVar;
    }

    public final void a(boolean z10) {
        if (this.d != z10) {
            this.d = z10;
            invalidate();
            this.f12277a.setIsVisible(z10);
            this.f12280e.A();
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
