package g9;

import a9.p;

public final class h {

    public static final h f6809c = new h(0, 0);

    public final int f6810a;

    public final int f6811b;

    public h(int i10, int i11) {
        this.f6810a = i10;
        this.f6811b = i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(h.class.getSimpleName());
        sb2.append("[position = ");
        sb2.append(this.f6810a);
        sb2.append(", length = ");
        return p.k(this.f6811b, "]", sb2);
    }
}
