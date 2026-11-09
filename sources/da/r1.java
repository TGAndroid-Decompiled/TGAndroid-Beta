package da;

import android.os.Build;
public final class r1 {
    public final int f8495a;
    public final int f8496b;
    public final long f8497c;
    public final long d;
    public final boolean f8498e;
    public final int f8499f;

    public r1(int i7, int i10, int i11, long j3, long j10, boolean z9) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        this.f8495a = i7;
        if (str != null) {
            this.f8496b = i10;
            this.f8497c = j3;
            this.d = j10;
            this.f8498e = z9;
            this.f8499f = i11;
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
            if (obj instanceof r1) {
                r1 r1Var = (r1) obj;
                if (this.f8495a == r1Var.f8495a) {
                    String str = Build.MODEL;
                    if (str.equals(str) && this.f8496b == r1Var.f8496b && this.f8497c == r1Var.f8497c && this.d == r1Var.d && this.f8498e == r1Var.f8498e && this.f8499f == r1Var.f8499f) {
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
        int i7;
        long j3 = this.f8497c;
        long j10 = this.d;
        int hashCode = (((((((((this.f8495a ^ 1000003) * 1000003) ^ Build.MODEL.hashCode()) * 1000003) ^ this.f8496b) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        if (this.f8498e) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return ((((((hashCode ^ i7) * 1000003) ^ this.f8499f) * 1000003) ^ Build.MANUFACTURER.hashCode()) * 1000003) ^ Build.PRODUCT.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceData{arch=");
        sb2.append(this.f8495a);
        sb2.append(", model=");
        sb2.append(Build.MODEL);
        sb2.append(", availableProcessors=");
        sb2.append(this.f8496b);
        sb2.append(", totalRam=");
        sb2.append(this.f8497c);
        sb2.append(", diskSpace=");
        sb2.append(this.d);
        sb2.append(", isEmulator=");
        sb2.append(this.f8498e);
        sb2.append(", state=");
        sb2.append(this.f8499f);
        sb2.append(", manufacturer=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(", modelClass=");
        return a8.p0.s(sb2, Build.PRODUCT, "}");
    }
}
