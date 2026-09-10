package jg;

import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public final class h extends f {
    public final Paint f11927q;
    public int f11928r;
    public final f6 f11929s;

    public h(ig.a aVar, f6 f6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f11927q = paint;
        this.f11928r = 0;
        this.f11929s = f6Var;
        this.f11916c.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        Paint paint2 = this.f11916c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f11916c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f11928r = i0.a.d(0.3f, j6.v0(j6.f17928d6, this.f11929s), this.f11923m);
    }
}
