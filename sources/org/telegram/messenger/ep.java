package org.telegram.messenger;
public final class ep {
    public final int f15439a;
    public final int f15440b;

    public ep(int i10, int i11) {
        this.f15439a = i10;
        this.f15440b = i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ep)) {
            return false;
        }
        ep epVar = (ep) obj;
        if (this.f15439a != epVar.f15439a || this.f15440b != epVar.f15440b) {
            return false;
        }
        return true;
    }
}
