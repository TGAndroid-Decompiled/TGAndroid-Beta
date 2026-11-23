package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
public final class w0 extends r6.a {
    public static final Parcelable.Creator<w0> CREATOR = new t0(9);
    public final long f11582a;
    public final q7.s0 f11583b;
    public final q7.s0 f11584c;
    public final q7.s0 d;

    public w0(long j3, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        q6.m.h(bArr);
        q7.s0 o4 = q7.s0.o(bArr.length, bArr);
        q6.m.h(bArr2);
        q7.s0 o10 = q7.s0.o(bArr2.length, bArr2);
        q6.m.h(bArr3);
        q7.s0 o11 = q7.s0.o(bArr3.length, bArr3);
        this.f11582a = j3;
        this.f11583b = o4;
        this.f11584c = o10;
        this.d = o11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w0) {
            w0 w0Var = (w0) obj;
            if (this.f11582a == w0Var.f11582a && q6.m.l(this.f11583b, w0Var.f11583b) && q6.m.l(this.f11584c, w0Var.f11584c) && q6.m.l(this.d, w0Var.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f11582a), this.f11583b, this.f11584c, this.d});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 8);
        parcel.writeLong(this.f11582a);
        cc.c(parcel, 2, this.f11583b.p());
        cc.c(parcel, 3, this.f11584c.p());
        cc.c(parcel, 4, this.d.p());
        cc.s(parcel, r10);
    }
}
