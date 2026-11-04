package og;

import android.graphics.Paint;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
public final class h extends f {
    public final Paint f21099q;
    public int f21100r;
    public final e6 f21101s;

    public h(ng.a aVar, e6 e6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f21099q = paint;
        this.f21100r = 0;
        this.f21101s = e6Var;
        this.f21087c.setStrokeWidth(g0.N(1.0f));
        Paint paint2 = this.f21087c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f21087c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f21100r = i0.a.f(0.3f, k6.w0(k6.f27878d6, this.f21101s), this.f21095m);
    }
}
