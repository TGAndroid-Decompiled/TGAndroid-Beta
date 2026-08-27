package h9;

import android.os.Build;

public final class d1 {

    public final int f8671a;

    public final int f8672b;

    public final long f8673c;
    public final long d;

    public final boolean f8674e;

    public final int f8675f;

    public d1(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        this.f8671a = i10;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f8672b = i11;
        this.f8673c = j10;
        this.d = j11;
        this.f8674e = z10;
        this.f8675f = i12;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        if (this.f8671a != d1Var.f8671a) {
            return false;
        }
        String str = Build.MODEL;
        if (!str.equals(str) || this.f8672b != d1Var.f8672b || this.f8673c != d1Var.f8673c || this.d != d1Var.d || this.f8674e != d1Var.f8674e || this.f8675f != d1Var.f8675f) {
            return false;
        }
        String str2 = Build.MANUFACTURER;
        if (!str2.equals(str2)) {
            return false;
        }
        String str3 = Build.PRODUCT;
        return str3.equals(str3);
    }

    public final int hashCode() {
        int iHashCode = (((((this.f8671a ^ 1000003) * 1000003) ^ Build.MODEL.hashCode()) * 1000003) ^ this.f8672b) * 1000003;
        long j10 = this.f8673c;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.d;
        return ((((((((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f8674e ? 1231 : 1237)) * 1000003) ^ this.f8675f) * 1000003) ^ Build.MANUFACTURER.hashCode()) * 1000003) ^ Build.PRODUCT.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceData{arch=");
        sb2.append(this.f8671a);
        sb2.append(", model=");
        sb2.append(Build.MODEL);
        sb2.append(", availableProcessors=");
        sb2.append(this.f8672b);
        sb2.append(", totalRam=");
        sb2.append(this.f8673c);
        sb2.append(", diskSpace=");
        sb2.append(this.d);
        sb2.append(", isEmulator=");
        sb2.append(this.f8674e);
        sb2.append(", state=");
        sb2.append(this.f8675f);
        sb2.append(", manufacturer=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(", modelClass=");
        return a9.p.p(sb2, Build.PRODUCT, "}");
    }
}
