package o6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class x0 extends a6.a {
    public static final Parcelable.Creator<x0> CREATOR = new w0(2);
    public final long f19460a;
    public final z6.s0 f19461b;
    public final z6.s0 f19462c;
    public final z6.s0 d;

    public x0(long j10, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        z5.l.h(bArr);
        z6.s0 t10 = z6.s0.t(bArr.length, bArr);
        z5.l.h(bArr2);
        z6.s0 t11 = z6.s0.t(bArr2.length, bArr2);
        z5.l.h(bArr3);
        z6.s0 t12 = z6.s0.t(bArr3.length, bArr3);
        this.f19460a = j10;
        this.f19461b = t10;
        this.f19462c = t11;
        this.d = t12;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x0) {
            x0 x0Var = (x0) obj;
            if (this.f19460a == x0Var.f19460a && z5.l.l(this.f19461b, x0Var.f19461b) && z5.l.l(this.f19462c, x0Var.f19462c) && z5.l.l(this.d, x0Var.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f19460a), this.f19461b, this.f19462c, this.d});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 1, 8);
        parcel.writeLong(this.f19460a);
        com.google.android.gms.internal.cast.o.c(parcel, 2, this.f19461b.u());
        com.google.android.gms.internal.cast.o.c(parcel, 3, this.f19462c.u());
        com.google.android.gms.internal.cast.o.c(parcel, 4, this.d.u());
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
