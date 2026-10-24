package lg;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
public final class a extends f {
    public final g6 f16089q;
    public final Paint f16090r;
    public int f16091s;

    public a(kg.a aVar, g6 g6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f16090r = paint;
        this.f16091s = 0;
        this.f16089q = g6Var;
        Paint paint2 = this.f16118c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f16118c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f16091s = i0.a.f(0.3f, k6.w0(k6.f21184d6, this.f16089q), this.f16125m);
    }
}
