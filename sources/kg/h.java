package kg;

import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
public final class h extends f {
    public final Paint f14808q;
    public int f14809r;
    public final d6 f14810s;

    public h(jg.a aVar, d6 d6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f14808q = paint;
        this.f14809r = 0;
        this.f14810s = d6Var;
        this.f14796c.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        Paint paint2 = this.f14796c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f14796c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f14809r = i0.a.d(0.3f, i6.v0(i6.f20822d6, this.f14810s), this.f14804m);
    }
}
