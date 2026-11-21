package ng;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
public final class a extends f {
    public final h6 f21496q;
    public final Paint f21497r;
    public int f21498s;

    public a(mg.a aVar, h6 h6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f21497r = paint;
        this.f21498s = 0;
        this.f21496q = h6Var;
        Paint paint2 = this.f21529c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f21529c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f21498s = i0.a.f(0.3f, m6.w0(m6.f29378d6, this.f21496q), this.f21537m);
    }
}
