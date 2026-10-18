package lg;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
public final class a extends f {
    public final d6 f16027q;
    public final Paint f16028r;
    public int f16029s;

    public a(kg.a aVar, d6 d6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f16028r = paint;
        this.f16029s = 0;
        this.f16027q = d6Var;
        Paint paint2 = this.f16056c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f16056c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f16029s = i0.a.f(0.3f, h6.w0(h6.f20993d6, this.f16027q), this.f16063m);
    }
}
