package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class w0 extends o6.a {
    public static final Parcelable.Creator<w0> CREATOR = new r0(20);
    public final long f4168a;
    public final n7.s0 f4169b;
    public final n7.s0 f4170c;
    public final n7.s0 d;

    public w0(long j3, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        n6.l.h(bArr);
        n7.s0 t10 = n7.s0.t(bArr.length, bArr);
        n6.l.h(bArr2);
        n7.s0 t11 = n7.s0.t(bArr2.length, bArr2);
        n6.l.h(bArr3);
        n7.s0 t12 = n7.s0.t(bArr3.length, bArr3);
        this.f4168a = j3;
        this.f4169b = t10;
        this.f4170c = t11;
        this.d = t12;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w0) {
            w0 w0Var = (w0) obj;
            if (this.f4168a == w0Var.f4168a && n6.l.l(this.f4169b, w0Var.f4169b) && n6.l.l(this.f4170c, w0Var.f4170c) && n6.l.l(this.d, w0Var.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f4168a), this.f4169b, this.f4170c, this.d});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 1, 8);
        parcel.writeLong(this.f4168a);
        w7.f0.c(parcel, 2, this.f4169b.u());
        w7.f0.c(parcel, 3, this.f4170c.u());
        w7.f0.c(parcel, 4, this.d.u());
        w7.f0.r(parcel, q6);
    }
}
