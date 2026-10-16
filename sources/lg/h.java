package lg;

import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
public final class h extends f {
    public final Paint f14723q;
    public int f14724r;
    public final c6 f14725s;

    public h(kg.a aVar, c6 c6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f14723q = paint;
        this.f14724r = 0;
        this.f14725s = c6Var;
        this.f14712c.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        Paint paint2 = this.f14712c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f14712c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f14724r = i0.a.d(0.3f, g6.w0(g6.f19601d6, this.f14725s), this.f14719m);
    }
}
