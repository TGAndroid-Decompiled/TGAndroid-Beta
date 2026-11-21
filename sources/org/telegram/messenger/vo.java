package org.telegram.messenger;
public final class vo {
    public final int f27487a;
    public final int f27488b;

    public vo(int i7, int i10) {
        this.f27487a = i7;
        this.f27488b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vo)) {
            return false;
        }
        vo voVar = (vo) obj;
        if (this.f27487a != voVar.f27487a || this.f27488b != voVar.f27488b) {
            return false;
        }
        return true;
    }
}
