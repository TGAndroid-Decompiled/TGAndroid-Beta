package kg;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
public final class a extends f {
    public final e6 f13591q;
    public final Paint f13592r;
    public int f13593s;

    public a(jg.a aVar, e6 e6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f13592r = paint;
        this.f13593s = 0;
        this.f13591q = e6Var;
        Paint paint2 = this.f13620c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f13620c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f13593s = i0.a.d(0.3f, i6.v0(i6.f18836d6, this.f13591q), this.f13627m);
    }
}
