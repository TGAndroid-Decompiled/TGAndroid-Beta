package defpackage;

import android.graphics.Bitmap;
public final class uj0 extends u93 {
    public Bitmap a;
    public final wj0 b;

    public uj0(wj0 wj0Var) {
        this.b = wj0Var;
    }

    @Override
    public final void clear() {
        this.a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.b.o(this);
    }
}
