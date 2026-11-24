package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
public final class k5c extends ColorDrawable {
    public final int a;
    public final wjb b;

    public k5c(int i, wjb wjbVar) {
        super(bkb.v0(i, wjbVar));
        this.a = i;
        this.b = wjbVar;
    }

    @Override
    public final void draw(Canvas canvas) {
        int v0 = bkb.v0(this.a, this.b);
        if (getColor() != v0) {
            setColor(v0);
        }
        super.draw(canvas);
    }
}
