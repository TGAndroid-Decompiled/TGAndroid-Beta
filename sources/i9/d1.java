package i9;

import android.os.Build;
public final class d1 {
    public final int f8635a;
    public final int f8636b;
    public final long f8637c;
    public final long d;
    public final boolean f8638e;
    public final int f8639f;

    public d1(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        this.f8635a = i10;
        if (str != null) {
            this.f8636b = i11;
            this.f8637c = j10;
            this.d = j11;
            this.f8638e = z10;
            this.f8639f = i12;
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
            if (obj instanceof d1) {
                d1 d1Var = (d1) obj;
                if (this.f8635a == d1Var.f8635a) {
                    String str = Build.MODEL;
                    if (str.equals(str) && this.f8636b == d1Var.f8636b && this.f8637c == d1Var.f8637c && this.d == d1Var.d && this.f8638e == d1Var.f8638e && this.f8639f == d1Var.f8639f) {
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
        long j10 = this.f8637c;
        long j11 = this.d;
        int hashCode = (((((((((this.f8635a ^ 1000003) * 1000003) ^ Build.MODEL.hashCode()) * 1000003) ^ this.f8636b) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        if (this.f8638e) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((((hashCode ^ i10) * 1000003) ^ this.f8639f) * 1000003) ^ Build.MANUFACTURER.hashCode()) * 1000003) ^ Build.PRODUCT.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceData{arch=");
        sb2.append(this.f8635a);
        sb2.append(", model=");
        sb2.append(Build.MODEL);
        sb2.append(", availableProcessors=");
        sb2.append(this.f8636b);
        sb2.append(", totalRam=");
        sb2.append(this.f8637c);
        sb2.append(", diskSpace=");
        sb2.append(this.d);
        sb2.append(", isEmulator=");
        sb2.append(this.f8638e);
        sb2.append(", state=");
        sb2.append(this.f8639f);
        sb2.append(", manufacturer=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(", modelClass=");
        return a4.w.q(sb2, Build.PRODUCT, "}");
    }
}
