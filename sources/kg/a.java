package kg;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
public final class a extends f {
    public final e6 f14810q;
    public final Paint f14811r;
    public int f14812s;

    public a(jg.a aVar, e6 e6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f14811r = paint;
        this.f14812s = 0;
        this.f14810q = e6Var;
        Paint paint2 = this.f14843c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f14843c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f14812s = i0.a.d(0.3f, i6.w0(i6.f20797d6, this.f14810q), this.f14851m);
    }
}
