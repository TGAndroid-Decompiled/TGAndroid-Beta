package ng;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
public final class a extends f {
    public final g6 f20537q;
    public final Paint f20538r;
    public int f20539s;

    public a(mg.a aVar, g6 g6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f20538r = paint;
        this.f20539s = 0;
        this.f20537q = g6Var;
        Paint paint2 = this.f20570c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f20570c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f20539s = i0.a.f(0.3f, l6.w0(l6.f27865d6, this.f20537q), this.f20578m);
    }
}
