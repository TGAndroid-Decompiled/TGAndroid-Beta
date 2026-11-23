package ng;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
public final class a extends f {
    public final h6 f21499q;
    public final Paint f21500r;
    public int f21501s;

    public a(mg.a aVar, h6 h6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f21500r = paint;
        this.f21501s = 0;
        this.f21499q = h6Var;
        Paint paint2 = this.f21532c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f21532c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f21501s = i0.a.f(0.3f, m6.w0(m6.f29381d6, this.f21499q), this.f21540m);
    }
}
