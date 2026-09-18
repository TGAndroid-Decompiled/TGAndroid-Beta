package kg;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
public final class a extends f {
    public final e6 f13592q;
    public final Paint f13593r;
    public int f13594s;

    public a(jg.a aVar, e6 e6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f13593r = paint;
        this.f13594s = 0;
        this.f13592q = e6Var;
        Paint paint2 = this.f13621c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f13621c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f13594s = i0.a.d(0.3f, j6.v0(j6.f19062d6, this.f13592q), this.f13628m);
    }
}
