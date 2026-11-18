package org.telegram.messenger;
public final class vo {
    public final int f27459a;
    public final int f27460b;

    public vo(int i7, int i10) {
        this.f27459a = i7;
        this.f27460b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vo)) {
            return false;
        }
        vo voVar = (vo) obj;
        if (this.f27459a != voVar.f27459a || this.f27460b != voVar.f27460b) {
            return false;
        }
        return true;
    }
}
