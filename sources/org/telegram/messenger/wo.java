package org.telegram.messenger;
public final class wo {
    public final int f27371a;
    public final int f27372b;

    public wo(int i7, int i10) {
        this.f27371a = i7;
        this.f27372b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wo)) {
            return false;
        }
        wo woVar = (wo) obj;
        if (this.f27371a != woVar.f27371a || this.f27372b != woVar.f27372b) {
            return false;
        }
        return true;
    }
}
