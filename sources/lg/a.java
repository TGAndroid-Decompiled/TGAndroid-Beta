package lg;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public final class a extends f {
    public final f6 f15433q;
    public final Paint f15434r;
    public int f15435s;

    public a(kg.a aVar, f6 f6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f15434r = paint;
        this.f15435s = 0;
        this.f15433q = f6Var;
        Paint paint2 = this.f15466c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f15466c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f15435s = i0.a.d(0.3f, j6.v0(j6.f20690d6, this.f15433q), this.f15474m);
    }
}
