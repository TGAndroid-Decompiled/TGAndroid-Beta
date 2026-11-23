package ng;

import android.graphics.Paint;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
public final class h extends f {
    public final Paint f21609q;
    public int f21610r;
    public final i6 f21611s;

    public h(mg.a aVar, i6 i6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f21609q = paint;
        this.f21610r = 0;
        this.f21611s = i6Var;
        this.f21597c.setStrokeWidth(g0.N(1.0f));
        Paint paint2 = this.f21597c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f21597c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f21610r = i0.a.f(0.3f, n6.w0(n6.f29451d6, this.f21611s), this.f21605m);
    }
}
