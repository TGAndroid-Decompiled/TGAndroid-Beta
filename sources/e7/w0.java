package e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class w0 extends q6.a {
    public static final Parcelable.Creator<w0> CREATOR = new r0(24);
    public final long f9899a;
    public final p7.t0 f9900b;
    public final p7.t0 f9901c;
    public final p7.t0 d;

    public w0(long j10, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        p6.m.g(bArr);
        p7.t0 o10 = p7.t0.o(bArr.length, bArr);
        p6.m.g(bArr2);
        p7.t0 o11 = p7.t0.o(bArr2.length, bArr2);
        p6.m.g(bArr3);
        p7.t0 o12 = p7.t0.o(bArr3.length, bArr3);
        this.f9899a = j10;
        this.f9900b = o10;
        this.f9901c = o11;
        this.d = o12;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w0) {
            w0 w0Var = (w0) obj;
            if (this.f9899a == w0Var.f9899a && p6.m.k(this.f9900b, w0Var.f9900b) && p6.m.k(this.f9901c, w0Var.f9901c) && p6.m.k(this.d, w0Var.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f9899a), this.f9900b, this.f9901c, this.d});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 8);
        parcel.writeLong(this.f9899a);
        j8.a.d(parcel, 2, this.f9900b.p());
        j8.a.d(parcel, 3, this.f9901c.p());
        j8.a.d(parcel, 4, this.d.p());
        j8.a.t(parcel, s6);
    }
}
