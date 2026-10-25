package mg;

import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
public final class h extends f {
    public final Paint f18478q;
    public int f18479r;
    public final u6 f18480s;

    public h(lg.a aVar, u6 u6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f18478q = paint;
        this.f18479r = 0;
        this.f18480s = u6Var;
        this.f18467c.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        Paint paint2 = this.f18467c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f18467c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f18479r = i0.a.f(0.3f, y6.w0(y6.f23354d6, this.f18480s), this.f18474m);
    }
}
