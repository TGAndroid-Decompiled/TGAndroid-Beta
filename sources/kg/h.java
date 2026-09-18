package kg;

import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public final class h extends f {
    public final Paint f13634q;
    public int f13635r;
    public final f6 f13636s;

    public h(jg.a aVar, f6 f6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f13634q = paint;
        this.f13635r = 0;
        this.f13636s = f6Var;
        this.f13623c.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        Paint paint2 = this.f13623c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f13623c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f13635r = i0.a.d(0.3f, j6.v0(j6.f18863d6, this.f13636s), this.f13630m);
    }
}
