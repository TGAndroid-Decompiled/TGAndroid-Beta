package org.telegram.messenger;
public final class wo {
    public final int f27370a;
    public final int f27371b;

    public wo(int i7, int i10) {
        this.f27370a = i7;
        this.f27371b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wo)) {
            return false;
        }
        wo woVar = (wo) obj;
        if (this.f27370a != woVar.f27370a || this.f27371b != woVar.f27371b) {
            return false;
        }
        return true;
    }
}
