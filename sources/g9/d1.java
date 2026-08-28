package g9;

import android.os.Build;
public final class d1 {
    public final int f7500a;
    public final int f7501b;
    public final long f7502c;
    public final long d;
    public final boolean f7503e;
    public final int f7504f;

    public d1(int i9, int i10, int i11, long j10, long j11, boolean z10) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        this.f7500a = i9;
        if (str != null) {
            this.f7501b = i10;
            this.f7502c = j10;
            this.d = j11;
            this.f7503e = z10;
            this.f7504f = i11;
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
                if (this.f7500a == d1Var.f7500a) {
                    String str = Build.MODEL;
                    if (str.equals(str) && this.f7501b == d1Var.f7501b && this.f7502c == d1Var.f7502c && this.d == d1Var.d && this.f7503e == d1Var.f7503e && this.f7504f == d1Var.f7504f) {
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
        int i9;
        long j10 = this.f7502c;
        long j11 = this.d;
        int hashCode = (((((((((this.f7500a ^ 1000003) * 1000003) ^ Build.MODEL.hashCode()) * 1000003) ^ this.f7501b) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        if (this.f7503e) {
            i9 = 1231;
        } else {
            i9 = 1237;
        }
        return ((((((hashCode ^ i9) * 1000003) ^ this.f7504f) * 1000003) ^ Build.MANUFACTURER.hashCode()) * 1000003) ^ Build.PRODUCT.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceData{arch=");
        sb2.append(this.f7500a);
        sb2.append(", model=");
        sb2.append(Build.MODEL);
        sb2.append(", availableProcessors=");
        sb2.append(this.f7501b);
        sb2.append(", totalRam=");
        sb2.append(this.f7502c);
        sb2.append(", diskSpace=");
        sb2.append(this.d);
        sb2.append(", isEmulator=");
        sb2.append(this.f7503e);
        sb2.append(", state=");
        sb2.append(this.f7504f);
        sb2.append(", manufacturer=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(", modelClass=");
        return aa.d.r(sb2, Build.PRODUCT, "}");
    }
}
