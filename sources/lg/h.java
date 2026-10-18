package lg;

import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
public final class h extends f {
    public final Paint f16065q;
    public int f16066r;
    public final d6 f16067s;

    public h(kg.a aVar, d6 d6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f16065q = paint;
        this.f16066r = 0;
        this.f16067s = d6Var;
        this.f16054c.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        Paint paint2 = this.f16054c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f16054c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f16066r = i0.a.f(0.3f, h6.w0(h6.f20986d6, this.f16067s), this.f16061m);
    }
}
