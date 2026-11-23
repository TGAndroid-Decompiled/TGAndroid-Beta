package org.telegram.messenger;
public final class wo {
    public final int f27779a;
    public final int f27780b;

    public wo(int i7, int i10) {
        this.f27779a = i7;
        this.f27780b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wo)) {
            return false;
        }
        wo woVar = (wo) obj;
        if (this.f27779a != woVar.f27779a || this.f27780b != woVar.f27780b) {
            return false;
        }
        return true;
    }
}
