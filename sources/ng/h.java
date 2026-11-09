package ng;

import android.graphics.Paint;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
public final class h extends f {
    public final Paint f20582q;
    public int f20583r;
    public final g6 f20584s;

    public h(mg.a aVar, g6 g6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f20582q = paint;
        this.f20583r = 0;
        this.f20584s = g6Var;
        this.f20570c.setStrokeWidth(g0.N(1.0f));
        Paint paint2 = this.f20570c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f20570c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f20583r = i0.a.f(0.3f, l6.w0(l6.f27865d6, this.f20584s), this.f20578m);
    }
}
