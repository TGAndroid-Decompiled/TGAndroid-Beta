package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class zqd extends b4 {
    public static final Parcelable.Creator<zqd> CREATOR = new rpd((byte) 3);
    public final int a;
    public final p8d b;

    public zqd(int i, p8d p8dVar) {
        this.a = i;
        this.b = p8dVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        jte.k(parcel, 3, this.b, i);
        jte.s(parcel, r);
    }
}
