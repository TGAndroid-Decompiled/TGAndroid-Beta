package org.telegram.messenger;
public final class vo {
    public final int f27461a;
    public final int f27462b;

    public vo(int i7, int i10) {
        this.f27461a = i7;
        this.f27462b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vo)) {
            return false;
        }
        vo voVar = (vo) obj;
        if (this.f27461a != voVar.f27461a || this.f27462b != voVar.f27462b) {
            return false;
        }
        return true;
    }
}
