package ng;

import android.graphics.Paint;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
public final class h extends f {
    public final Paint f20587q;
    public int f20588r;
    public final h6 f20589s;

    public h(mg.a aVar, h6 h6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f20587q = paint;
        this.f20588r = 0;
        this.f20589s = h6Var;
        this.f20575c.setStrokeWidth(g0.N(1.0f));
        Paint paint2 = this.f20575c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f20575c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f20588r = i0.a.f(0.3f, m6.w0(m6.f27890d6, this.f20589s), this.f20583m);
    }
}
