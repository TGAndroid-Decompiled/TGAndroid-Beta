package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
public final class fh0 extends b4 {
    public static final Parcelable.Creator<fh0> CREATOR = new b1d((byte) 21);
    public final boolean a;
    public final byte[] b;
    public final String c;

    public fh0(boolean z, byte[] bArr, String str) {
        if (z) {
            fre.h(bArr);
            fre.h(str);
        }
        this.a = z;
        this.b = bArr;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fh0)) {
            return false;
        }
        fh0 fh0Var = (fh0) obj;
        if (this.a == fh0Var.a && Arrays.equals(this.b, fh0Var.b) && Objects.equals(this.c, fh0Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Objects.hash(Boolean.valueOf(this.a), this.c) * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        jte.c(parcel, 2, this.b);
        jte.l(parcel, 3, this.c);
        jte.s(parcel, r);
    }
}
