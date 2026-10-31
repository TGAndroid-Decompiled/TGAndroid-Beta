package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class w0 extends o6.a {
    public static final Parcelable.Creator<w0> CREATOR = new r0(20);
    public final long f4059a;
    public final n7.s0 f4060b;
    public final n7.s0 f4061c;
    public final n7.s0 d;

    public w0(long j10, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        n6.l.g(bArr);
        n7.s0 s10 = n7.s0.s(bArr.length, bArr);
        n6.l.g(bArr2);
        n7.s0 s11 = n7.s0.s(bArr2.length, bArr2);
        n6.l.g(bArr3);
        n7.s0 s12 = n7.s0.s(bArr3.length, bArr3);
        this.f4059a = j10;
        this.f4060b = s10;
        this.f4061c = s11;
        this.d = s12;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w0) {
            w0 w0Var = (w0) obj;
            if (this.f4059a == w0Var.f4059a && n6.l.k(this.f4060b, w0Var.f4060b) && n6.l.k(this.f4061c, w0Var.f4061c) && n6.l.k(this.d, w0Var.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f4059a), this.f4060b, this.f4061c, this.d});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 1, 8);
        parcel.writeLong(this.f4059a);
        w7.h0.c(parcel, 2, this.f4060b.t());
        w7.h0.c(parcel, 3, this.f4061c.t());
        w7.h0.c(parcel, 4, this.d.t());
        w7.h0.r(parcel, q6);
    }
}
