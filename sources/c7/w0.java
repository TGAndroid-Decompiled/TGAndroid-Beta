package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class w0 extends o6.a {
    public static final Parcelable.Creator<w0> CREATOR = new r0(20);
    public final long f5025a;
    public final n7.s0 f5026b;
    public final n7.s0 f5027c;
    public final n7.s0 d;

    public w0(long j10, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        n6.l.h(bArr);
        n7.s0 s10 = n7.s0.s(bArr.length, bArr);
        n6.l.h(bArr2);
        n7.s0 s11 = n7.s0.s(bArr2.length, bArr2);
        n6.l.h(bArr3);
        n7.s0 s12 = n7.s0.s(bArr3.length, bArr3);
        this.f5025a = j10;
        this.f5026b = s10;
        this.f5027c = s11;
        this.d = s12;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w0) {
            w0 w0Var = (w0) obj;
            if (this.f5025a == w0Var.f5025a && n6.l.l(this.f5026b, w0Var.f5026b) && n6.l.l(this.f5027c, w0Var.f5027c) && n6.l.l(this.d, w0Var.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f5025a), this.f5026b, this.f5027c, this.d});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 1, 8);
        parcel.writeLong(this.f5025a);
        w7.f0.c(parcel, 2, this.f5026b.t());
        w7.f0.c(parcel, 3, this.f5027c.t());
        w7.f0.c(parcel, 4, this.d.t());
        w7.f0.r(parcel, q6);
    }
}
