package ng;

import android.graphics.Paint;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
public final class h extends f {
    public final Paint f21516q;
    public int f21517r;
    public final i6 f21518s;

    public h(mg.a aVar, i6 i6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f21516q = paint;
        this.f21517r = 0;
        this.f21518s = i6Var;
        this.f21504c.setStrokeWidth(g0.N(1.0f));
        Paint paint2 = this.f21504c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f21504c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f21517r = i0.a.f(0.3f, n6.w0(n6.f29396d6, this.f21518s), this.f21512m);
    }
}
