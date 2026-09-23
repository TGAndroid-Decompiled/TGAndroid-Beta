package kg;

import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
public final class h extends f {
    public final Paint f13621q;
    public int f13622r;
    public final d6 f13623s;

    public h(jg.a aVar, d6 d6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f13621q = paint;
        this.f13622r = 0;
        this.f13623s = d6Var;
        this.f13610c.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        Paint paint2 = this.f13610c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f13610c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f13622r = i0.a.d(0.3f, h6.v0(h6.f18789d6, this.f13623s), this.f13617m);
    }
}
