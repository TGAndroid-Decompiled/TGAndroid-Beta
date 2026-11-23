package org.telegram.messenger;
public final class vo {
    public final int f27555a;
    public final int f27556b;

    public vo(int i7, int i10) {
        this.f27555a = i7;
        this.f27556b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vo)) {
            return false;
        }
        vo voVar = (vo) obj;
        if (this.f27555a != voVar.f27555a || this.f27556b != voVar.f27556b) {
            return false;
        }
        return true;
    }
}
