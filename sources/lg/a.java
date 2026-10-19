package lg;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
public final class a extends f {
    public final d6 f16028q;
    public final Paint f16029r;
    public int f16030s;

    public a(kg.a aVar, d6 d6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f16029r = paint;
        this.f16030s = 0;
        this.f16028q = d6Var;
        Paint paint2 = this.f16057c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f16057c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f16030s = i0.a.f(0.3f, h6.w0(h6.f20989d6, this.f16028q), this.f16064m);
    }
}
