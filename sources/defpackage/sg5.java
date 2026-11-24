package defpackage;

import android.view.TextureView;
public abstract class sg5 extends TextureView {
    @Override
    public void invalidate() {
        if (qg5.c) {
            qg5.b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i, int i2, int i3, int i4) {
        if (qg5.c) {
            qg5.b.add(this);
        } else {
            super.invalidate(i, i2, i3, i4);
        }
    }
}
