package mg;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
public final class a extends f {
    public final u6 f18438q;
    public final Paint f18439r;
    public int f18440s;

    public a(lg.a aVar, u6 u6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f18439r = paint;
        this.f18440s = 0;
        this.f18438q = u6Var;
        Paint paint2 = this.f18467c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f18467c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f18440s = i0.a.f(0.3f, y6.w0(y6.f23354d6, this.f18438q), this.f18474m);
    }
}
