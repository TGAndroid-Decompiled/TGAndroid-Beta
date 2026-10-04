package kg;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
public final class a extends f {
    public final d6 f14763q;
    public final Paint f14764r;
    public int f14765s;

    public a(jg.a aVar, d6 d6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f14764r = paint;
        this.f14765s = 0;
        this.f14763q = d6Var;
        Paint paint2 = this.f14796c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f14796c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f14765s = i0.a.d(0.3f, i6.v0(i6.f20822d6, this.f14763q), this.f14804m);
    }
}
