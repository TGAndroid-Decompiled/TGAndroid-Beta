package kg;

import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
public final class h extends f {
    public final Paint f13632q;
    public int f13633r;
    public final e6 f13634s;

    public h(jg.a aVar, e6 e6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f13632q = paint;
        this.f13633r = 0;
        this.f13634s = e6Var;
        this.f13621c.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        Paint paint2 = this.f13621c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f13621c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f13633r = i0.a.d(0.3f, j6.v0(j6.f19062d6, this.f13634s), this.f13628m);
    }
}
