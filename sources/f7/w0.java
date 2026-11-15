package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.Arrays;
public final class w0 extends r6.a {
    public static final Parcelable.Creator<w0> CREATOR = new t0(9);
    public final long f11270a;
    public final q7.s0 f11271b;
    public final q7.s0 f11272c;
    public final q7.s0 d;

    public w0(long j3, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        q6.m.g(bArr);
        q7.s0 o4 = q7.s0.o(bArr.length, bArr);
        q6.m.g(bArr2);
        q7.s0 o10 = q7.s0.o(bArr2.length, bArr2);
        q6.m.g(bArr3);
        q7.s0 o11 = q7.s0.o(bArr3.length, bArr3);
        this.f11270a = j3;
        this.f11271b = o4;
        this.f11272c = o10;
        this.d = o11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w0) {
            w0 w0Var = (w0) obj;
            if (this.f11270a == w0Var.f11270a && q6.m.k(this.f11271b, w0Var.f11271b) && q6.m.k(this.f11272c, w0Var.f11272c) && q6.m.k(this.d, w0Var.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f11270a), this.f11271b, this.f11272c, this.d});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 8);
        parcel.writeLong(this.f11270a);
        yb.c(parcel, 2, this.f11271b.p());
        yb.c(parcel, 3, this.f11272c.p());
        yb.c(parcel, 4, this.d.p());
        yb.s(parcel, r10);
    }
}
