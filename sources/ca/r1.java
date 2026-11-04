package ca;

import android.os.Build;
public final class r1 {
    public final int f4523a;
    public final int f4524b;
    public final long f4525c;
    public final long d;
    public final boolean f4526e;
    public final int f4527f;

    public r1(int i3, int i10, int i11, long j10, long j11, boolean z10) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        this.f4523a = i3;
        if (str != null) {
            this.f4524b = i10;
            this.f4525c = j10;
            this.d = j11;
            this.f4526e = z10;
            this.f4527f = i11;
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
                if (this.f4523a == r1Var.f4523a) {
                    String str = Build.MODEL;
                    if (str.equals(str) && this.f4524b == r1Var.f4524b && this.f4525c == r1Var.f4525c && this.d == r1Var.d && this.f4526e == r1Var.f4526e && this.f4527f == r1Var.f4527f) {
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
        int i3;
        long j10 = this.f4525c;
        long j11 = this.d;
        int hashCode = (((((((((this.f4523a ^ 1000003) * 1000003) ^ Build.MODEL.hashCode()) * 1000003) ^ this.f4524b) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        if (this.f4526e) {
            i3 = 1231;
        } else {
            i3 = 1237;
        }
        return ((((((hashCode ^ i3) * 1000003) ^ this.f4527f) * 1000003) ^ Build.MANUFACTURER.hashCode()) * 1000003) ^ Build.PRODUCT.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceData{arch=");
        sb2.append(this.f4523a);
        sb2.append(", model=");
        sb2.append(Build.MODEL);
        sb2.append(", availableProcessors=");
        sb2.append(this.f4524b);
        sb2.append(", totalRam=");
        sb2.append(this.f4525c);
        sb2.append(", diskSpace=");
        sb2.append(this.d);
        sb2.append(", isEmulator=");
        sb2.append(this.f4526e);
        sb2.append(", state=");
        sb2.append(this.f4527f);
        sb2.append(", manufacturer=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(", modelClass=");
        return a1.g.s(sb2, Build.PRODUCT, "}");
    }
}
