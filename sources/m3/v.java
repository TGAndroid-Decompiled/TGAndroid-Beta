package m3;

import java.util.Arrays;

public final class v {

    public final int f17637a;

    public final byte[] f17638b;

    public final int f17639c;
    public final int d;

    public v(int i10, int i11, int i12, byte[] bArr) {
        this.f17637a = i10;
        this.f17638b = bArr;
        this.f17639c = i11;
        this.d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v.class == obj.getClass()) {
            v vVar = (v) obj;
            if (this.f17637a == vVar.f17637a && this.f17639c == vVar.f17639c && this.d == vVar.d && Arrays.equals(this.f17638b, vVar.f17638b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f17638b) + (this.f17637a * 31)) * 31) + this.f17639c) * 31) + this.d;
    }
}
