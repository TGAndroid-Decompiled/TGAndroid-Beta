package m6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
public final class w0 extends y5.a {
    public static final Parcelable.Creator<w0> CREATOR = new r0(20);
    public final long f17597a;
    public final x6.s0 f17598b;
    public final x6.s0 f17599c;
    public final x6.s0 d;

    public w0(long j10, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        x5.l.h(bArr);
        x6.s0 t10 = x6.s0.t(bArr.length, bArr);
        x5.l.h(bArr2);
        x6.s0 t11 = x6.s0.t(bArr2.length, bArr2);
        x5.l.h(bArr3);
        x6.s0 t12 = x6.s0.t(bArr3.length, bArr3);
        this.f17597a = j10;
        this.f17598b = t10;
        this.f17599c = t11;
        this.d = t12;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w0) {
            w0 w0Var = (w0) obj;
            if (this.f17597a == w0Var.f17597a && x5.l.l(this.f17598b, w0Var.f17598b) && x5.l.l(this.f17599c, w0Var.f17599c) && x5.l.l(this.d, w0Var.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f17597a), this.f17598b, this.f17599c, this.d});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 8);
        parcel.writeLong(this.f17597a);
        p8.c(parcel, 2, this.f17598b.u());
        p8.c(parcel, 3, this.f17599c.u());
        p8.c(parcel, 4, this.d.u());
        p8.r(parcel, q10);
    }
}
