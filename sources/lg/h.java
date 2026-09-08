package lg;

import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public final class h extends f {
    public final Paint f15478q;
    public int f15479r;
    public final f6 f15480s;

    public h(kg.a aVar, f6 f6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f15478q = paint;
        this.f15479r = 0;
        this.f15480s = f6Var;
        this.f15466c.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        Paint paint2 = this.f15466c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f15466c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f15479r = i0.a.d(0.3f, j6.v0(j6.f20690d6, this.f15480s), this.f15474m);
    }
}
