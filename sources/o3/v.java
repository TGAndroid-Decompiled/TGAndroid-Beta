package o3;

import java.util.Arrays;
public final class v {
    public final int f19120a;
    public final byte[] f19121b;
    public final int f19122c;
    public final int d;

    public v(int i10, int i11, int i12, byte[] bArr) {
        this.f19120a = i10;
        this.f19121b = bArr;
        this.f19122c = i11;
        this.d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v.class == obj.getClass()) {
            v vVar = (v) obj;
            if (this.f19120a == vVar.f19120a && this.f19122c == vVar.f19122c && this.d == vVar.d && Arrays.equals(this.f19121b, vVar.f19121b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f19121b) + (this.f19120a * 31)) * 31) + this.f19122c) * 31) + this.d;
    }
}
