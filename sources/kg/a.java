package kg;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
public final class a extends f {
    public final d6 f14762q;
    public final Paint f14763r;
    public int f14764s;

    public a(jg.a aVar, d6 d6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f14763r = paint;
        this.f14764s = 0;
        this.f14762q = d6Var;
        Paint paint2 = this.f14795c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f14795c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f14764s = i0.a.d(0.3f, i6.v0(i6.f20818d6, this.f14762q), this.f14803m);
    }
}
