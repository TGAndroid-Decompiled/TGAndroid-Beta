package lg;

import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
public final class h extends f {
    public final Paint f16067q;
    public int f16068r;
    public final d6 f16069s;

    public h(kg.a aVar, d6 d6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f16067q = paint;
        this.f16068r = 0;
        this.f16069s = d6Var;
        this.f16056c.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        Paint paint2 = this.f16056c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f16056c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f16068r = i0.a.f(0.3f, h6.w0(h6.f20993d6, this.f16069s), this.f16063m);
    }
}
