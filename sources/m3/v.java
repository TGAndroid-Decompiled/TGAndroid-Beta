package m3;

import java.util.Arrays;
public final class v {
    public final int f17261a;
    public final byte[] f17262b;
    public final int f17263c;
    public final int d;

    public v(int i9, int i10, int i11, byte[] bArr) {
        this.f17261a = i9;
        this.f17262b = bArr;
        this.f17263c = i10;
        this.d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v.class == obj.getClass()) {
            v vVar = (v) obj;
            if (this.f17261a == vVar.f17261a && this.f17263c == vVar.f17263c && this.d == vVar.d && Arrays.equals(this.f17262b, vVar.f17262b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f17262b) + (this.f17261a * 31)) * 31) + this.f17263c) * 31) + this.d;
    }
}
