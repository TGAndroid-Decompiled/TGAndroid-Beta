package kg;

import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
public final class h extends f {
    public final Paint f13619q;
    public int f13620r;
    public final d6 f13621s;

    public h(jg.a aVar, d6 d6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f13619q = paint;
        this.f13620r = 0;
        this.f13621s = d6Var;
        this.f13608c.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        Paint paint2 = this.f13608c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f13608c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f13620r = i0.a.d(0.3f, h6.v0(h6.f19060d6, this.f13621s), this.f13615m);
    }
}
