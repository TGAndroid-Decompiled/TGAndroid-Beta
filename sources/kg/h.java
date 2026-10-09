package kg;

import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
public final class h extends f {
    public final Paint f14855q;
    public int f14856r;
    public final e6 f14857s;

    public h(jg.a aVar, e6 e6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f14855q = paint;
        this.f14856r = 0;
        this.f14857s = e6Var;
        this.f14843c.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        Paint paint2 = this.f14843c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f14843c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f14856r = i0.a.d(0.3f, i6.w0(i6.f20797d6, this.f14857s), this.f14851m);
    }
}
