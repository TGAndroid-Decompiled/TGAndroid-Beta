package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.Arrays;
public final class w0 extends r6.a {
    public static final Parcelable.Creator<w0> CREATOR = new t0(9);
    public final long f11456a;
    public final q7.s0 f11457b;
    public final q7.s0 f11458c;
    public final q7.s0 d;

    public w0(long j3, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        q6.m.g(bArr);
        q7.s0 o4 = q7.s0.o(bArr.length, bArr);
        q6.m.g(bArr2);
        q7.s0 o10 = q7.s0.o(bArr2.length, bArr2);
        q6.m.g(bArr3);
        q7.s0 o11 = q7.s0.o(bArr3.length, bArr3);
        this.f11456a = j3;
        this.f11457b = o4;
        this.f11458c = o10;
        this.d = o11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w0) {
            w0 w0Var = (w0) obj;
            if (this.f11456a == w0Var.f11456a && q6.m.k(this.f11457b, w0Var.f11457b) && q6.m.k(this.f11458c, w0Var.f11458c) && q6.m.k(this.d, w0Var.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f11456a), this.f11457b, this.f11458c, this.d});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 1, 8);
        parcel.writeLong(this.f11456a);
        wb.c(parcel, 2, this.f11457b.p());
        wb.c(parcel, 3, this.f11458c.p());
        wb.c(parcel, 4, this.d.p());
        wb.s(parcel, r10);
    }
}
