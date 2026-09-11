package lg;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public final class a extends f {
    public final f6 f15406q;
    public final Paint f15407r;
    public int f15408s;

    public a(kg.a aVar, f6 f6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f15407r = paint;
        this.f15408s = 0;
        this.f15406q = f6Var;
        Paint paint2 = this.f15439c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f15439c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f15408s = i0.a.d(0.3f, j6.v0(j6.f20663d6, this.f15406q), this.f15447m);
    }
}
