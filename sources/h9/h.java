package h9;

import a4.w;
public final class h {
    public static final h f7956c = new h(0, 0);
    public final int f7957a;
    public final int f7958b;

    public h(int i10, int i11) {
        this.f7957a = i10;
        this.f7958b = i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(h.class.getSimpleName());
        sb2.append("[position = ");
        sb2.append(this.f7957a);
        sb2.append(", length = ");
        return w.l(this.f7958b, "]", sb2);
    }
}
