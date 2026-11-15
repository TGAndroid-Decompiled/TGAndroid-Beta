package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class p7 extends FrameLayout {
    public b4 f12179a;
    public long f12180b;
    public ArrayList f12181c;
    public boolean d;
    public final w f12182e;

    public p7(w wVar, Context context) {
        super(context);
        this.f12182e = wVar;
    }

    public final void a(boolean z10) {
        if (this.d != z10) {
            this.d = z10;
            invalidate();
            this.f12179a.setIsVisible(z10);
            this.f12182e.A();
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
