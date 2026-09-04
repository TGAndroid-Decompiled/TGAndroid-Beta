package lg;

import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public final class h extends f {
    public final Paint f15451q;
    public int f15452r;
    public final f6 f15453s;

    public h(kg.a aVar, f6 f6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f15451q = paint;
        this.f15452r = 0;
        this.f15453s = f6Var;
        this.f15439c.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        Paint paint2 = this.f15439c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f15439c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f15452r = i0.a.d(0.3f, j6.v0(j6.f20663d6, this.f15453s), this.f15447m);
    }
}
