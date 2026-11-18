package ng;

import android.graphics.Paint;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
public final class h extends f {
    public final Paint f21513q;
    public int f21514r;
    public final i6 f21515s;

    public h(mg.a aVar, i6 i6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f21513q = paint;
        this.f21514r = 0;
        this.f21515s = i6Var;
        this.f21501c.setStrokeWidth(g0.N(1.0f));
        Paint paint2 = this.f21501c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f21501c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f21514r = i0.a.f(0.3f, n6.w0(n6.f29394d6, this.f21515s), this.f21509m);
    }
}
