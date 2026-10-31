package dg;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
public final class a extends g {
    public final p6 f5880q;
    public final Paint f5881r;
    public int f5882s;

    public a(cg.a aVar, p6 p6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f5881r = paint;
        this.f5882s = 0;
        this.f5880q = p6Var;
        Paint paint2 = this.f5911c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f5911c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f5882s = i0.b.f(0.3f, t6.w0(t6.f20929d6, this.f5880q), this.f5918m);
    }
}
