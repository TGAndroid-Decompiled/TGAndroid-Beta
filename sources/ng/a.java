package ng;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
public final class a extends f {
    public final f6 f20534q;
    public final Paint f20535r;
    public int f20536s;

    public a(mg.a aVar, f6 f6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f20535r = paint;
        this.f20536s = 0;
        this.f20534q = f6Var;
        Paint paint2 = this.f20567c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f20567c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f20536s = i0.a.f(0.3f, k6.w0(k6.f27849d6, this.f20534q), this.f20575m);
    }
}
