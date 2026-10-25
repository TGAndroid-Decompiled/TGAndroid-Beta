package d7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class w0 extends p6.a {
    public static final Parcelable.Creator<w0> CREATOR = new r0(21);
    public final long f8253a;
    public final o7.s0 f8254b;
    public final o7.s0 f8255c;
    public final o7.s0 d;

    public w0(long j10, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        o6.l.h(bArr);
        o7.s0 s10 = o7.s0.s(bArr.length, bArr);
        o6.l.h(bArr2);
        o7.s0 s11 = o7.s0.s(bArr2.length, bArr2);
        o6.l.h(bArr3);
        o7.s0 s12 = o7.s0.s(bArr3.length, bArr3);
        this.f8253a = j10;
        this.f8254b = s10;
        this.f8255c = s11;
        this.d = s12;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w0) {
            w0 w0Var = (w0) obj;
            if (this.f8253a == w0Var.f8253a && o6.l.l(this.f8254b, w0Var.f8254b) && o6.l.l(this.f8255c, w0Var.f8255c) && o6.l.l(this.d, w0Var.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f8253a), this.f8254b, this.f8255c, this.d});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 8);
        parcel.writeLong(this.f8253a);
        df.c(parcel, 2, this.f8254b.t());
        df.c(parcel, 3, this.f8255c.t());
        df.c(parcel, 4, this.d.t());
        df.r(parcel, q5);
    }
}
