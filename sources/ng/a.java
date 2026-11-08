package ng;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
public final class a extends f {
    public final f6 f20537q;
    public final Paint f20538r;
    public int f20539s;

    public a(mg.a aVar, f6 f6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f20538r = paint;
        this.f20539s = 0;
        this.f20537q = f6Var;
        Paint paint2 = this.f20570c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f20570c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f20539s = i0.a.f(0.3f, k6.w0(k6.f27852d6, this.f20537q), this.f20578m);
    }
}
