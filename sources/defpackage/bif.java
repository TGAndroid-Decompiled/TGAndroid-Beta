package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class bif extends b4 {
    public static final Parcelable.Creator<bif> CREATOR = new t4d((byte) 6);
    public final int a;
    public final boolean b;
    public final boolean c;

    public bif(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bif)) {
            return false;
        }
        bif bifVar = (bif) obj;
        if (this.a == bifVar.a && this.b == bifVar.b && this.c == bifVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        jte.q(parcel, 3, 4);
        parcel.writeInt(this.b ? 1 : 0);
        jte.q(parcel, 4, 4);
        parcel.writeInt(this.c ? 1 : 0);
        jte.s(parcel, r);
    }
}
