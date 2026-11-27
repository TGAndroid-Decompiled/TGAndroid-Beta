package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
public final class k9c extends ColorDrawable {
    public final int a;
    public final vnb b;

    public k9c(int i, vnb vnbVar) {
        super(aob.v0(i, vnbVar));
        this.a = i;
        this.b = vnbVar;
    }

    @Override
    public final void draw(Canvas canvas) {
        int v0 = aob.v0(this.a, this.b);
        if (getColor() != v0) {
            setColor(v0);
        }
        super.draw(canvas);
    }
}
