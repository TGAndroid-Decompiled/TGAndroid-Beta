package lg;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
public final class a extends f {
    public final d6 f16025q;
    public final Paint f16026r;
    public int f16027s;

    public a(kg.a aVar, d6 d6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f16026r = paint;
        this.f16027s = 0;
        this.f16025q = d6Var;
        Paint paint2 = this.f16054c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f16054c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f16027s = i0.a.f(0.3f, h6.w0(h6.f20986d6, this.f16025q), this.f16061m);
    }
}
