package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
public final class k7c extends ColorDrawable {
    public final int a;
    public final ylb b;

    public k7c(int i, ylb ylbVar) {
        super(cmb.v0(i, ylbVar));
        this.a = i;
        this.b = ylbVar;
    }

    @Override
    public final void draw(Canvas canvas) {
        int v0 = cmb.v0(this.a, this.b);
        if (getColor() != v0) {
            setColor(v0);
        }
        super.draw(canvas);
    }
}
