package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class w0 extends o6.a {
    public static final Parcelable.Creator<w0> CREATOR = new r0(20);
    public final long f4583a;
    public final n7.t0 f4584b;
    public final n7.t0 f4585c;
    public final n7.t0 d;

    public w0(long j3, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        n6.l.h(bArr);
        n7.t0 t10 = n7.t0.t(bArr.length, bArr);
        n6.l.h(bArr2);
        n7.t0 t11 = n7.t0.t(bArr2.length, bArr2);
        n6.l.h(bArr3);
        n7.t0 t12 = n7.t0.t(bArr3.length, bArr3);
        this.f4583a = j3;
        this.f4584b = t10;
        this.f4585c = t11;
        this.d = t12;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w0) {
            w0 w0Var = (w0) obj;
            if (this.f4583a == w0Var.f4583a && n6.l.l(this.f4584b, w0Var.f4584b) && n6.l.l(this.f4585c, w0Var.f4585c) && n6.l.l(this.d, w0Var.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f4583a), this.f4584b, this.f4585c, this.d});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 1, 8);
        parcel.writeLong(this.f4583a);
        w7.e0.c(parcel, 2, this.f4584b.u());
        w7.e0.c(parcel, 3, this.f4585c.u());
        w7.e0.c(parcel, 4, this.d.u());
        w7.e0.r(parcel, q6);
    }
}
