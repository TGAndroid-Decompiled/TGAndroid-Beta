package jh;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;

public final class p7 extends FrameLayout {

    public e4 f13828a;

    public long f13829b;

    public ArrayList f13830c;
    public boolean d;

    public final y8 f13831e;

    public p7(y8 y8Var, Context context) {
        super(context);
        this.f13831e = y8Var;
    }

    public final void a(boolean z10) {
        if (this.d != z10) {
            this.d = z10;
            invalidate();
            this.f13828a.setIsVisible(z10);
            this.f13831e.A();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.d) {
            super.dispatchDraw(canvas);
        }
    }
}
