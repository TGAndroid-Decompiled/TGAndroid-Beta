package mg;

import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
public final class h extends f {
    public final Paint f18477q;
    public int f18478r;
    public final u6 f18479s;

    public h(lg.a aVar, u6 u6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f18477q = paint;
        this.f18478r = 0;
        this.f18479s = u6Var;
        this.f18466c.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        Paint paint2 = this.f18466c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f18466c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f18478r = i0.a.f(0.3f, y6.w0(y6.f23357d6, this.f18479s), this.f18473m);
    }
}
