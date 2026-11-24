package defpackage;

import android.graphics.drawable.Drawable;
public final class zbc extends fm2 {
    public final acc E;

    public zbc(acc accVar, Drawable drawable, Drawable drawable2) {
        super(drawable, drawable2);
        this.E = accVar;
    }

    @Override
    public final void setBounds(int i, int i2, int i3, int i4) {
        acc accVar = this.E;
        boolean z = accVar.d;
        float f = accVar.N;
        if (z) {
            super.setBounds(i, (int) (i2 - f), i3, i4);
        } else {
            super.setBounds(i, i2, i3, (int) (i4 + f));
        }
    }
}
