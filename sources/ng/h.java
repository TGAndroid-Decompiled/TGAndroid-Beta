package ng;

import android.graphics.Paint;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
public final class h extends f {
    public final Paint f21510q;
    public int f21511r;
    public final h6 f21512s;

    public h(mg.a aVar, h6 h6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f21510q = paint;
        this.f21511r = 0;
        this.f21512s = h6Var;
        this.f21498c.setStrokeWidth(g0.N(1.0f));
        Paint paint2 = this.f21498c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f21498c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f21511r = i0.a.f(0.3f, m6.w0(m6.f29347d6, this.f21512s), this.f21506m);
    }
}
