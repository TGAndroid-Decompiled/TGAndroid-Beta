package kg;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
public final class a extends f {
    public final c6 f14806q;
    public final Paint f14807r;
    public int f14808s;

    public a(jg.a aVar, c6 c6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f14807r = paint;
        this.f14808s = 0;
        this.f14806q = c6Var;
        Paint paint2 = this.f14839c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f14839c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f14808s = i0.a.d(0.3f, h6.w0(h6.f20559d6, this.f14806q), this.f14847m);
    }
}
