package kg;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
public final class a extends f {
    public final d6 f13594q;
    public final Paint f13595r;
    public int f13596s;

    public a(jg.a aVar, d6 d6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f13595r = paint;
        this.f13596s = 0;
        this.f13594q = d6Var;
        Paint paint2 = this.f13623c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f13623c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f13596s = i0.a.d(0.3f, h6.v0(h6.f19076d6, this.f13594q), this.f13630m);
    }
}
