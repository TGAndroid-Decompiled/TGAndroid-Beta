package m2;

import j$.util.Objects;
public final class b {
    public final String f15973a;
    public final String f15974b;
    public final int f15975c;
    public final int d;

    public b(int i10, int i11, String str, String str2) {
        this.f15973a = str;
        this.f15974b = str2;
        this.f15975c = i10;
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
        if (this.f15975c == bVar.f15975c && this.d == bVar.d && Objects.equals(this.f15973a, bVar.f15973a) && Objects.equals(this.f15974b, bVar.f15974b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f15973a, this.f15974b, Integer.valueOf(this.f15975c), Integer.valueOf(this.d));
    }
}
