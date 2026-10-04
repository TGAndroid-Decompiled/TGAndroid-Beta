package kg;

import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
public final class h extends f {
    public final Paint f14807q;
    public int f14808r;
    public final d6 f14809s;

    public h(jg.a aVar, d6 d6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f14807q = paint;
        this.f14808r = 0;
        this.f14809s = d6Var;
        this.f14795c.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        Paint paint2 = this.f14795c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f14795c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f14808r = i0.a.d(0.3f, i6.v0(i6.f20817d6, this.f14809s), this.f14803m);
    }
}
