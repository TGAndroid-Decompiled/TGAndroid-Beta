package ng;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
public final class a extends f {
    public final i6 f21468q;
    public final Paint f21469r;
    public int f21470s;

    public a(mg.a aVar, i6 i6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f21469r = paint;
        this.f21470s = 0;
        this.f21468q = i6Var;
        Paint paint2 = this.f21501c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f21501c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f21470s = i0.a.f(0.3f, n6.w0(n6.f29394d6, this.f21468q), this.f21509m);
    }
}
