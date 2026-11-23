package org.telegram.messenger;
public final class wo {
    public final int f27743a;
    public final int f27744b;

    public wo(int i7, int i10) {
        this.f27743a = i7;
        this.f27744b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wo)) {
            return false;
        }
        wo woVar = (wo) obj;
        if (this.f27743a != woVar.f27743a || this.f27744b != woVar.f27744b) {
            return false;
        }
        return true;
    }
}
