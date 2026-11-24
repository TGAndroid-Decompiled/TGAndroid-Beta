package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
public final class fi0 extends b4 {
    public static final Parcelable.Creator<fi0> CREATOR = new d3d((byte) 21);
    public final boolean a;
    public final byte[] b;
    public final String c;

    public fi0(boolean z, byte[] bArr, String str) {
        if (z) {
            ite.h(bArr);
            ite.h(str);
        }
        this.a = z;
        this.b = bArr;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fi0)) {
            return false;
        }
        fi0 fi0Var = (fi0) obj;
        if (this.a == fi0Var.a && Arrays.equals(this.b, fi0Var.b) && Objects.equals(this.c, fi0Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Objects.hash(Boolean.valueOf(this.a), this.c) * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        mve.c(parcel, 2, this.b);
        mve.l(parcel, 3, this.c);
        mve.s(parcel, r);
    }
}
