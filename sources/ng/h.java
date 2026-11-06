package ng;

import android.graphics.Paint;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
public final class h extends f {
    public final Paint f20579q;
    public int f20580r;
    public final f6 f20581s;

    public h(mg.a aVar, f6 f6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f20579q = paint;
        this.f20580r = 0;
        this.f20581s = f6Var;
        this.f20567c.setStrokeWidth(g0.N(1.0f));
        Paint paint2 = this.f20567c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f20567c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f20580r = i0.a.f(0.3f, k6.w0(k6.f27849d6, this.f20581s), this.f20575m);
    }
}
