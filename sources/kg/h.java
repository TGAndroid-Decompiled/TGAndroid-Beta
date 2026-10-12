package kg;

import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
public final class h extends f {
    public final Paint f14851q;
    public int f14852r;
    public final c6 f14853s;

    public h(jg.a aVar, c6 c6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f14851q = paint;
        this.f14852r = 0;
        this.f14853s = c6Var;
        this.f14839c.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        Paint paint2 = this.f14839c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f14839c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f14852r = i0.a.d(0.3f, h6.w0(h6.f20559d6, this.f14853s), this.f14847m);
    }
}
