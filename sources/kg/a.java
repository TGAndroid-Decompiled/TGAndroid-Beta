package kg;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
public final class a extends f {
    public final d6 f14809q;
    public final Paint f14810r;
    public int f14811s;

    public a(jg.a aVar, d6 d6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f14810r = paint;
        this.f14811s = 0;
        this.f14809q = d6Var;
        Paint paint2 = this.f14842c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f14842c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f14811s = i0.a.d(0.3f, h6.w0(h6.f20786d6, this.f14809q), this.f14850m);
    }
}
