package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class w0 extends o6.a {
    public static final Parcelable.Creator<w0> CREATOR = new r0(20);
    public final long f4500a;
    public final n7.s0 f4501b;
    public final n7.s0 f4502c;
    public final n7.s0 d;

    public w0(long j3, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        n6.l.h(bArr);
        n7.s0 t10 = n7.s0.t(bArr.length, bArr);
        n6.l.h(bArr2);
        n7.s0 t11 = n7.s0.t(bArr2.length, bArr2);
        n6.l.h(bArr3);
        n7.s0 t12 = n7.s0.t(bArr3.length, bArr3);
        this.f4500a = j3;
        this.f4501b = t10;
        this.f4502c = t11;
        this.d = t12;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w0) {
            w0 w0Var = (w0) obj;
            if (this.f4500a == w0Var.f4500a && n6.l.l(this.f4501b, w0Var.f4501b) && n6.l.l(this.f4502c, w0Var.f4502c) && n6.l.l(this.d, w0Var.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f4500a), this.f4501b, this.f4502c, this.d});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 1, 8);
        parcel.writeLong(this.f4500a);
        w7.g0.c(parcel, 2, this.f4501b.u());
        w7.g0.c(parcel, 3, this.f4502c.u());
        w7.g0.c(parcel, 4, this.d.u());
        w7.g0.r(parcel, q6);
    }
}
