package kg;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
public final class a extends f {
    public final e6 f13593q;
    public final Paint f13594r;
    public int f13595s;

    public a(jg.a aVar, e6 e6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f13594r = paint;
        this.f13595s = 0;
        this.f13593q = e6Var;
        Paint paint2 = this.f13622c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f13622c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f13595s = i0.a.d(0.3f, i6.v0(i6.f18834d6, this.f13593q), this.f13629m);
    }
}
