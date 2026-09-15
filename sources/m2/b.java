package m2;

import j$.util.Objects;
public final class b {
    public final String f14390a;
    public final String f14391b;
    public final int f14392c;
    public final int d;

    public b(int i10, int i11, String str, String str2) {
        this.f14390a = str;
        this.f14391b = str2;
        this.f14392c = i10;
        this.d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f14392c == bVar.f14392c && this.d == bVar.d && Objects.equals(this.f14390a, bVar.f14390a) && Objects.equals(this.f14391b, bVar.f14391b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f14390a, this.f14391b, Integer.valueOf(this.f14392c), Integer.valueOf(this.d));
    }
}
