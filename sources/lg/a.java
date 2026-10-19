package lg;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
public final class a extends f {
    public final d6 f16026q;
    public final Paint f16027r;
    public int f16028s;

    public a(kg.a aVar, d6 d6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f16027r = paint;
        this.f16028s = 0;
        this.f16026q = d6Var;
        Paint paint2 = this.f16055c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f16055c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f16028s = i0.a.f(0.3f, h6.w0(h6.f20987d6, this.f16026q), this.f16062m);
    }
}
