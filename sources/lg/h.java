package lg;

import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
public final class h extends f {
    public final Paint f16129q;
    public int f16130r;
    public final g6 f16131s;

    public h(kg.a aVar, g6 g6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f16129q = paint;
        this.f16130r = 0;
        this.f16131s = g6Var;
        this.f16118c.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        Paint paint2 = this.f16118c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f16118c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f16130r = i0.a.f(0.3f, k6.w0(k6.f21184d6, this.f16131s), this.f16125m);
    }
}
