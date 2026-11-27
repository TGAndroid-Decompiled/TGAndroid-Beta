package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
public final class gh0 extends c4 {
    public static final Parcelable.Creator<gh0> CREATOR = new s5d((byte) 21);
    public final boolean a;
    public final byte[] b;
    public final String c;

    public gh0(boolean z, byte[] bArr, String str) {
        if (z) {
            xve.h(bArr);
            xve.h(str);
        }
        this.a = z;
        this.b = bArr;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gh0)) {
            return false;
        }
        gh0 gh0Var = (gh0) obj;
        if (this.a == gh0Var.a && Arrays.equals(this.b, gh0Var.b) && Objects.equals(this.c, gh0Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Objects.hash(Boolean.valueOf(this.a), this.c) * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        bye.c(parcel, 2, this.b);
        bye.l(parcel, 3, this.c);
        bye.s(parcel, r);
    }
}
