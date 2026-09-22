package kg;

import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
public final class h extends f {
    public final Paint f13633q;
    public int f13634r;
    public final e6 f13635s;

    public h(jg.a aVar, e6 e6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f13633q = paint;
        this.f13634r = 0;
        this.f13635s = e6Var;
        this.f13622c.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        Paint paint2 = this.f13622c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f13622c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f13634r = i0.a.d(0.3f, i6.v0(i6.f18834d6, this.f13635s), this.f13629m);
    }
}
