package defpackage;

import android.os.Build;
public final class oa0 {
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final boolean e;
    public final int f;

    public oa0(int i, int i2, int i3, long j, long j2, boolean z) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        this.a = i;
        if (str != null) {
            this.b = i2;
            this.c = j;
            this.d = j2;
            this.e = z;
            this.f = i3;
            if (str2 != null) {
                if (str3 != null) {
                    return;
                }
                fvc.f("Null modelClass");
                throw null;
            }
            fvc.f("Null manufacturer");
            throw null;
        }
        fvc.f("Null model");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof oa0) {
                oa0 oa0Var = (oa0) obj;
                if (this.a == oa0Var.a) {
                    String str = Build.MODEL;
                    if (str.equals(str) && this.b == oa0Var.b && this.c == oa0Var.c && this.d == oa0Var.d && this.e == oa0Var.e && this.f == oa0Var.f) {
                        String str2 = Build.MANUFACTURER;
                        if (str2.equals(str2)) {
                            String str3 = Build.PRODUCT;
                            if (str3.equals(str3)) {
                                return true;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        long j = this.c;
        long j2 = this.d;
        int hashCode = (((((((((this.a ^ 1000003) * 1000003) ^ Build.MODEL.hashCode()) * 1000003) ^ this.b) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        if (this.e) {
            i = 1231;
        } else {
            i = 1237;
        }
        return ((((((hashCode ^ i) * 1000003) ^ this.f) * 1000003) ^ Build.MANUFACTURER.hashCode()) * 1000003) ^ Build.PRODUCT.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceData{arch=");
        sb.append(this.a);
        sb.append(", model=");
        sb.append(Build.MODEL);
        sb.append(", availableProcessors=");
        sb.append(this.b);
        sb.append(", totalRam=");
        sb.append(this.c);
        sb.append(", diskSpace=");
        sb.append(this.d);
        sb.append(", isEmulator=");
        sb.append(this.e);
        sb.append(", state=");
        sb.append(this.f);
        sb.append(", manufacturer=");
        sb.append(Build.MANUFACTURER);
        sb.append(", modelClass=");
        return b00.j(sb, Build.PRODUCT, "}");
    }
}
