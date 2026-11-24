package defpackage;

import android.graphics.drawable.Drawable;
public final class aec extends sn2 {
    public final bec E;

    public aec(bec becVar, Drawable drawable, Drawable drawable2) {
        super(drawable, drawable2);
        this.E = becVar;
    }

    @Override
    public final void setBounds(int i, int i2, int i3, int i4) {
        bec becVar = this.E;
        boolean z = becVar.d;
        float f = becVar.N;
        if (z) {
            super.setBounds(i, (int) (i2 - f), i3, i4);
        } else {
            super.setBounds(i, i2, i3, (int) (i4 + f));
        }
    }
}
