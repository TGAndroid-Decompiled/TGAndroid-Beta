package defpackage;

import java.util.ArrayList;
public abstract class i71 extends la {
    public final byte d;
    public final ArrayList e = new ArrayList();

    public i71(int i) {
        this.d = i;
    }

    public abstract void F();

    @Override
    public final int b() {
        return this.e.size();
    }

    @Override
    public final int d(int i) {
        return ((p71) this.e.get(i)).a;
    }
}
