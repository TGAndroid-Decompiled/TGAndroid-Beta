package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class a3b extends FrameLayout {
    public y28 a;
    public long b;
    public ArrayList c;
    public boolean d;
    public final c8b e;

    public a3b(c8b c8bVar, Context context) {
        super(context);
        this.e = c8bVar;
    }

    public final void a(boolean z) {
        if (this.d != z) {
            this.d = z;
            invalidate();
            this.a.setIsVisible(z);
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
