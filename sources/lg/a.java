package lg;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
public final class a extends f {
    public final d6 f16020q;
    public final Paint f16021r;
    public int f16022s;

    public a(kg.a aVar, d6 d6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f16021r = paint;
        this.f16022s = 0;
        this.f16020q = d6Var;
        Paint paint2 = this.f16049c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f16049c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f16022s = i0.b.f(0.3f, h6.w0(h6.f20986d6, this.f16020q), this.f16056m);
    }
}
