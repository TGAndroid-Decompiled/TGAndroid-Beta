package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class std extends b4 {
    public static final Parcelable.Creator<std> CREATOR = new rpd((byte) 12);
    public final int a;
    public final boolean b;

    public std(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        jte.q(parcel, 3, 4);
        parcel.writeInt(this.b ? 1 : 0);
        jte.s(parcel, r);
    }
}
