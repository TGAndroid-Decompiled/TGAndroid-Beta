package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class w0 extends o6.a {
    public static final Parcelable.Creator<w0> CREATOR = new r0(20);
    public final long f5028a;
    public final n7.t0 f5029b;
    public final n7.t0 f5030c;
    public final n7.t0 d;

    public w0(long j10, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        n6.l.h(bArr);
        n7.t0 s10 = n7.t0.s(bArr.length, bArr);
        n6.l.h(bArr2);
        n7.t0 s11 = n7.t0.s(bArr2.length, bArr2);
        n6.l.h(bArr3);
        n7.t0 s12 = n7.t0.s(bArr3.length, bArr3);
        this.f5028a = j10;
        this.f5029b = s10;
        this.f5030c = s11;
        this.d = s12;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w0) {
            w0 w0Var = (w0) obj;
            if (this.f5028a == w0Var.f5028a && n6.l.l(this.f5029b, w0Var.f5029b) && n6.l.l(this.f5030c, w0Var.f5030c) && n6.l.l(this.d, w0Var.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f5028a), this.f5029b, this.f5030c, this.d});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 1, 8);
        parcel.writeLong(this.f5028a);
        w7.f0.c(parcel, 2, this.f5029b.t());
        w7.f0.c(parcel, 3, this.f5030c.t());
        w7.f0.c(parcel, 4, this.d.t());
        w7.f0.r(parcel, q6);
    }
}
