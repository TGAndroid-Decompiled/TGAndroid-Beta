package kg;

import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
public final class h extends f {
    public final Paint f14854q;
    public int f14855r;
    public final d6 f14856s;

    public h(jg.a aVar, d6 d6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f14854q = paint;
        this.f14855r = 0;
        this.f14856s = d6Var;
        this.f14842c.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        Paint paint2 = this.f14842c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f14842c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f14855r = i0.a.d(0.3f, h6.w0(h6.f20786d6, this.f14856s), this.f14850m);
    }
}
