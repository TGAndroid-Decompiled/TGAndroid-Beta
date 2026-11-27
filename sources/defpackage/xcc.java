package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class xcc extends c4 {
    public static final Parcelable.Creator<xcc> CREATOR = new ced((byte) 23);
    public final int a;
    public final short b;
    public final short c;

    public xcc(int i, short s, short s2) {
        this.a = i;
        this.b = s;
        this.c = s2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xcc)) {
            return false;
        }
        xcc xccVar = (xcc) obj;
        if (this.a != xccVar.a || this.b != xccVar.b || this.c != xccVar.c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Short.valueOf(this.b), Short.valueOf(this.c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        bye.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        bye.q(parcel, 3, 4);
        parcel.writeInt(this.c);
        bye.s(parcel, r);
    }
}
