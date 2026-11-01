package org.telegram.messenger;
public final class fp {
    public final int f15780a;
    public final int f15781b;

    public fp(int i10, int i11) {
        this.f15780a = i10;
        this.f15781b = i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fp)) {
            return false;
        }
        fp fpVar = (fp) obj;
        if (this.f15780a != fpVar.f15780a || this.f15781b != fpVar.f15781b) {
            return false;
        }
        return true;
    }
}
