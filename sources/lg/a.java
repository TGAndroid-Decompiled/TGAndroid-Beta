package lg;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
public final class a extends f {
    public final c6 f14683q;
    public final Paint f14684r;
    public int f14685s;

    public a(kg.a aVar, c6 c6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f14684r = paint;
        this.f14685s = 0;
        this.f14683q = c6Var;
        Paint paint2 = this.f14712c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f14712c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f14685s = i0.a.d(0.3f, g6.w0(g6.f19901d6, this.f14683q), this.f14719m);
    }
}
