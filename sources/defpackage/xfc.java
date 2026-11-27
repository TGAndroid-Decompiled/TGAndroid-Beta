package defpackage;

import android.graphics.drawable.Drawable;
public final class xfc extends zm2 {
    public final yfc E;

    public xfc(yfc yfcVar, Drawable drawable, Drawable drawable2) {
        super(drawable, drawable2);
        this.E = yfcVar;
    }

    @Override
    public final void setBounds(int i, int i2, int i3, int i4) {
        yfc yfcVar = this.E;
        boolean z = yfcVar.d;
        float f = yfcVar.N;
        if (z) {
            super.setBounds(i, (int) (i2 - f), i3, i4);
        } else {
            super.setBounds(i, i2, i3, (int) (i4 + f));
        }
    }
}
