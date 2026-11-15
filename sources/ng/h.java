package ng;

import android.graphics.Paint;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
public final class h extends f {
    public final Paint f21152q;
    public int f21153r;
    public final e6 f21154s;

    public h(mg.a aVar, e6 e6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f21152q = paint;
        this.f21153r = 0;
        this.f21154s = e6Var;
        this.f21140c.setStrokeWidth(g0.N(1.0f));
        Paint paint2 = this.f21140c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f21140c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f21153r = i0.a.f(0.3f, j6.w0(j6.f28849d6, this.f21154s), this.f21148m);
    }
}
