package ng;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
public final class a extends f {
    public final i6 f21471q;
    public final Paint f21472r;
    public int f21473s;

    public a(mg.a aVar, i6 i6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f21472r = paint;
        this.f21473s = 0;
        this.f21471q = i6Var;
        Paint paint2 = this.f21504c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f21504c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f21473s = i0.a.f(0.3f, n6.w0(n6.f29396d6, this.f21471q), this.f21512m);
    }
}
