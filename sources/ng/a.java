package ng;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
public final class a extends f {
    public final h6 f21465q;
    public final Paint f21466r;
    public int f21467s;

    public a(mg.a aVar, h6 h6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f21466r = paint;
        this.f21467s = 0;
        this.f21465q = h6Var;
        Paint paint2 = this.f21498c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f21498c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f21467s = i0.a.f(0.3f, m6.w0(m6.f29347d6, this.f21465q), this.f21506m);
    }
}
