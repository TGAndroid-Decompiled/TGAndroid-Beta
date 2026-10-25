package aa;

import android.os.Build;
public final class f1 {
    public final int f1079a;
    public final int f1080b;
    public final long f1081c;
    public final long d;
    public final boolean e;
    public final int f1082f;

    public f1(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        this.f1079a = i10;
        if (str != null) {
            this.f1080b = i11;
            this.f1081c = j10;
            this.d = j11;
            this.e = z10;
            this.f1082f = i12;
            if (str2 != null) {
                if (str3 != null) {
                    return;
                }
                throw new NullPointerException("Null modelClass");
            }
            throw new NullPointerException("Null manufacturer");
        }
        throw new NullPointerException("Null model");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof f1) {
                f1 f1Var = (f1) obj;
                if (this.f1079a == f1Var.f1079a) {
                    String str = Build.MODEL;
                    if (str.equals(str) && this.f1080b == f1Var.f1080b && this.f1081c == f1Var.f1081c && this.d == f1Var.d && this.e == f1Var.e && this.f1082f == f1Var.f1082f) {
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
        int i10;
        long j10 = this.f1081c;
        long j11 = this.d;
        int hashCode = (((((((((this.f1079a ^ 1000003) * 1000003) ^ Build.MODEL.hashCode()) * 1000003) ^ this.f1080b) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        if (this.e) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((((hashCode ^ i10) * 1000003) ^ this.f1082f) * 1000003) ^ Build.MANUFACTURER.hashCode()) * 1000003) ^ Build.PRODUCT.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceData{arch=");
        sb2.append(this.f1079a);
        sb2.append(", model=");
        sb2.append(Build.MODEL);
        sb2.append(", availableProcessors=");
        sb2.append(this.f1080b);
        sb2.append(", totalRam=");
        sb2.append(this.f1081c);
        sb2.append(", diskSpace=");
        sb2.append(this.d);
        sb2.append(", isEmulator=");
        sb2.append(this.e);
        sb2.append(", state=");
        sb2.append(this.f1082f);
        sb2.append(", manufacturer=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(", modelClass=");
        return a1.g.s(sb2, Build.PRODUCT, "}");
    }
}
