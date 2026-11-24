package defpackage;

import android.view.View;
public final class uz5 implements View.OnLayoutChangeListener {
    public boolean a;

    @Override
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        if (i4 - i2 > i3 - i) {
            z = true;
        } else {
            z = false;
        }
        if (z != this.a) {
            gl.c3(new ql3(this, (byte) 20));
            this.a = z;
        }
    }
}
