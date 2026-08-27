package n6;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;

public final class x0 extends z5.a {
    public static final Parcelable.Creator<x0> CREATOR = new w0(1);

    public final long f18436a;

    public final y6.s0 f18437b;

    public final y6.s0 f18438c;
    public final y6.s0 d;

    public x0(long j10, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        y5.l.h(bArr);
        y6.s0 s0VarT = y6.s0.t(bArr.length, bArr);
        y5.l.h(bArr2);
        y6.s0 s0VarT2 = y6.s0.t(bArr2.length, bArr2);
        y5.l.h(bArr3);
        y6.s0 s0VarT3 = y6.s0.t(bArr3.length, bArr3);
        this.f18436a = j10;
        this.f18437b = s0VarT;
        this.f18438c = s0VarT2;
        this.d = s0VarT3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return this.f18436a == x0Var.f18436a && y5.l.l(this.f18437b, x0Var.f18437b) && y5.l.l(this.f18438c, x0Var.f18438c) && y5.l.l(this.d, x0Var.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f18436a), this.f18437b, this.f18438c, this.d});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 1, 8);
        parcel.writeLong(this.f18436a);
        r8.c(parcel, 2, this.f18437b.u());
        r8.c(parcel, 3, this.f18438c.u());
        r8.c(parcel, 4, this.d.u());
        r8.r(parcel, iQ);
    }
}
