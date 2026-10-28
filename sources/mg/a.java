package mg;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
public final class a extends f {
    public final u6 f18437q;
    public final Paint f18438r;
    public int f18439s;

    public a(lg.a aVar, u6 u6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f18438r = paint;
        this.f18439s = 0;
        this.f18437q = u6Var;
        Paint paint2 = this.f18466c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f18466c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f18439s = i0.a.f(0.3f, y6.w0(y6.f23357d6, this.f18437q), this.f18473m);
    }
}
