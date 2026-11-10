package ng;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
public final class a extends f {
    public final h6 f20542q;
    public final Paint f20543r;
    public int f20544s;

    public a(mg.a aVar, h6 h6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f20543r = paint;
        this.f20544s = 0;
        this.f20542q = h6Var;
        Paint paint2 = this.f20575c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f20575c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f20544s = i0.a.f(0.3f, m6.w0(m6.f27890d6, this.f20542q), this.f20583m);
    }
}
