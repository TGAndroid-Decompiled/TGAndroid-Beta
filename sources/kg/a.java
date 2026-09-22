package kg;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public final class a extends f {
    public final f6 f13591q;
    public final Paint f13592r;
    public int f13593s;

    public a(jg.a aVar, f6 f6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f13592r = paint;
        this.f13593s = 0;
        this.f13591q = f6Var;
        Paint paint2 = this.f13620c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f13620c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f13593s = i0.a.d(0.3f, j6.v0(j6.f19109d6, this.f13591q), this.f13627m);
    }
}
