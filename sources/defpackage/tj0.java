package defpackage;

import android.graphics.Bitmap;
public final class tj0 extends b93 {
    public Bitmap a;
    public final vj0 b;

    public tj0(vj0 vj0Var) {
        this.b = vj0Var;
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
