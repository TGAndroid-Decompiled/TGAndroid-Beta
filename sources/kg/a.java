package kg;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
public final class a extends f {
    public final d6 f13579q;
    public final Paint f13580r;
    public int f13581s;

    public a(jg.a aVar, d6 d6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f13580r = paint;
        this.f13581s = 0;
        this.f13579q = d6Var;
        Paint paint2 = this.f13608c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f13608c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f13581s = i0.a.d(0.3f, h6.v0(h6.f19059d6, this.f13579q), this.f13615m);
    }
}
