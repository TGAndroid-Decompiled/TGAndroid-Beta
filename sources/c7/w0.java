package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class w0 extends o6.a {
    public static final Parcelable.Creator<w0> CREATOR = new r0(20);
    public final long f4549a;
    public final n7.s0 f4550b;
    public final n7.s0 f4551c;
    public final n7.s0 d;

    public w0(long j3, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        n6.m.h(bArr);
        n7.s0 t10 = n7.s0.t(bArr.length, bArr);
        n6.m.h(bArr2);
        n7.s0 t11 = n7.s0.t(bArr2.length, bArr2);
        n6.m.h(bArr3);
        n7.s0 t12 = n7.s0.t(bArr3.length, bArr3);
        this.f4549a = j3;
        this.f4550b = t10;
        this.f4551c = t11;
        this.d = t12;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w0) {
            w0 w0Var = (w0) obj;
            if (this.f4549a == w0Var.f4549a && n6.m.l(this.f4550b, w0Var.f4550b) && n6.m.l(this.f4551c, w0Var.f4551c) && n6.m.l(this.d, w0Var.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f4549a), this.f4550b, this.f4551c, this.d});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.s(parcel, 1, 8);
        parcel.writeLong(this.f4549a);
        w7.c0.c(parcel, 2, this.f4550b.u());
        w7.c0.c(parcel, 3, this.f4551c.u());
        w7.c0.c(parcel, 4, this.d.u());
        w7.c0.r(parcel, q6);
    }
}
