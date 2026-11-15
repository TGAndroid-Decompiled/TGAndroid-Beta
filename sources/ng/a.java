package ng;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
public final class a extends f {
    public final e6 f21107q;
    public final Paint f21108r;
    public int f21109s;

    public a(mg.a aVar, e6 e6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f21108r = paint;
        this.f21109s = 0;
        this.f21107q = e6Var;
        Paint paint2 = this.f21140c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f21140c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f21109s = i0.a.f(0.3f, j6.w0(j6.f28849d6, this.f21107q), this.f21148m);
    }
}
