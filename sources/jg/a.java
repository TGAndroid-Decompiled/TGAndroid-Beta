package jg;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public final class a extends f {
    public final f6 f11887q;
    public final Paint f11888r;
    public int f11889s;

    public a(ig.a aVar, f6 f6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f11888r = paint;
        this.f11889s = 0;
        this.f11887q = f6Var;
        Paint paint2 = this.f11916c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f11916c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f11889s = i0.a.d(0.3f, j6.v0(j6.f17928d6, this.f11887q), this.f11923m);
    }
}
