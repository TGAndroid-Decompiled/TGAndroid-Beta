package og;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
public final class a extends f {
    public final e6 f21054q;
    public final Paint f21055r;
    public int f21056s;

    public a(ng.a aVar, e6 e6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f21055r = paint;
        this.f21056s = 0;
        this.f21054q = e6Var;
        Paint paint2 = this.f21087c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f21087c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f21056s = i0.a.f(0.3f, k6.w0(k6.f27878d6, this.f21054q), this.f21095m);
    }
}
