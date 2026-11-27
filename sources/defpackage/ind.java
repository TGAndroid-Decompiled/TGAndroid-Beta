package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class ind extends c4 {
    public static final Parcelable.Creator<ind> CREATOR = new zkd((byte) 13);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public ind(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        bye.q(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        bye.q(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        bye.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        bye.q(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        bye.s(parcel, r);
    }
}
