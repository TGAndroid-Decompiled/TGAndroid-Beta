package dg;

import android.graphics.Paint;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
public final class i extends g {
    public final Paint f5922q;
    public int f5923r;
    public final p6 f5924s;

    public i(cg.a aVar, p6 p6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f5922q = paint;
        this.f5923r = 0;
        this.f5924s = p6Var;
        this.f5911c.setStrokeWidth(i0.N(1.0f));
        Paint paint2 = this.f5911c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f5911c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f5923r = i0.b.f(0.3f, t6.w0(t6.f20929d6, this.f5924s), this.f5918m);
    }
}
