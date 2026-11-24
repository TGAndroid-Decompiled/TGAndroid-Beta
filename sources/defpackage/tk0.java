package defpackage;

import android.graphics.Bitmap;
public final class tk0 extends na3 {
    public Bitmap a;
    public final vk0 b;

    public tk0(vk0 vk0Var) {
        this.b = vk0Var;
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
