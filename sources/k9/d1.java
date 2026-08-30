package k9;

import android.os.Build;
public final class d1 {
    public final int f10114a;
    public final int f10115b;
    public final long f10116c;
    public final long d;
    public final boolean e;
    public final int f10117f;

    public d1(int i10, int i11, int i12, long j10, long j11, boolean z4) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        this.f10114a = i10;
        if (str != null) {
            this.f10115b = i11;
            this.f10116c = j10;
            this.d = j11;
            this.e = z4;
            this.f10117f = i12;
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
                if (this.f10114a == d1Var.f10114a) {
                    String str = Build.MODEL;
                    if (str.equals(str) && this.f10115b == d1Var.f10115b && this.f10116c == d1Var.f10116c && this.d == d1Var.d && this.e == d1Var.e && this.f10117f == d1Var.f10117f) {
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
        long j10 = this.f10116c;
        long j11 = this.d;
        int hashCode = (((((((((this.f10114a ^ 1000003) * 1000003) ^ Build.MODEL.hashCode()) * 1000003) ^ this.f10115b) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        if (this.e) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((((hashCode ^ i10) * 1000003) ^ this.f10117f) * 1000003) ^ Build.MANUFACTURER.hashCode()) * 1000003) ^ Build.PRODUCT.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceData{arch=");
        sb.append(this.f10114a);
        sb.append(", model=");
        sb.append(Build.MODEL);
        sb.append(", availableProcessors=");
        sb.append(this.f10115b);
        sb.append(", totalRam=");
        sb.append(this.f10116c);
        sb.append(", diskSpace=");
        sb.append(this.d);
        sb.append(", isEmulator=");
        sb.append(this.e);
        sb.append(", state=");
        sb.append(this.f10117f);
        sb.append(", manufacturer=");
        sb.append(Build.MANUFACTURER);
        sb.append(", modelClass=");
        return android.support.v4.media.a.r(sb, Build.PRODUCT, "}");
    }
}
