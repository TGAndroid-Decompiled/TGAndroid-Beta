package kg;

import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
public final class h extends f {
    public final Paint f14852q;
    public int f14853r;
    public final c6 f14854s;

    public h(jg.a aVar, c6 c6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f14852q = paint;
        this.f14853r = 0;
        this.f14854s = c6Var;
        this.f14840c.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        Paint paint2 = this.f14840c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f14840c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f14853r = i0.a.d(0.3f, h6.w0(h6.f20560d6, this.f14854s), this.f14848m);
    }
}
