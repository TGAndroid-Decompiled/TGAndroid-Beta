package kg;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
public final class a extends f {
    public final d6 f13581q;
    public final Paint f13582r;
    public int f13583s;

    public a(jg.a aVar, d6 d6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f13582r = paint;
        this.f13583s = 0;
        this.f13581q = d6Var;
        Paint paint2 = this.f13610c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f13610c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f13583s = i0.a.d(0.3f, h6.v0(h6.f18789d6, this.f13581q), this.f13617m);
    }
}
