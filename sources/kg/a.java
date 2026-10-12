package kg;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
public final class a extends f {
    public final c6 f14807q;
    public final Paint f14808r;
    public int f14809s;

    public a(jg.a aVar, c6 c6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f14808r = paint;
        this.f14809s = 0;
        this.f14807q = c6Var;
        Paint paint2 = this.f14840c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f14840c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f14809s = i0.a.d(0.3f, h6.w0(h6.f20560d6, this.f14807q), this.f14848m);
    }
}
