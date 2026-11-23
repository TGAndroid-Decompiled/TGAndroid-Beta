package ng;

import android.graphics.Paint;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
public final class h extends f {
    public final Paint f21544q;
    public int f21545r;
    public final h6 f21546s;

    public h(mg.a aVar, h6 h6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f21544q = paint;
        this.f21545r = 0;
        this.f21546s = h6Var;
        this.f21532c.setStrokeWidth(g0.N(1.0f));
        Paint paint2 = this.f21532c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f21532c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f21545r = i0.a.f(0.3f, m6.w0(m6.f29381d6, this.f21546s), this.f21540m);
    }
}
