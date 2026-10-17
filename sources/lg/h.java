package lg;

import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
public final class h extends f {
    public final Paint f16060q;
    public int f16061r;
    public final d6 f16062s;

    public h(kg.a aVar, d6 d6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f16060q = paint;
        this.f16061r = 0;
        this.f16062s = d6Var;
        this.f16049c.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        Paint paint2 = this.f16049c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f16049c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f16061r = i0.b.f(0.3f, h6.w0(h6.f20986d6, this.f16062s), this.f16056m);
    }
}
