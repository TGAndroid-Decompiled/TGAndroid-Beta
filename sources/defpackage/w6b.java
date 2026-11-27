package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class w6b extends FrameLayout {
    public o68 a;
    public long b;
    public ArrayList c;
    public boolean d;
    public final bcb e;

    public w6b(bcb bcbVar, Context context) {
        super(context);
        this.e = bcbVar;
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
