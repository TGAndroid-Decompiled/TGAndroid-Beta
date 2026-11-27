package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class n7d extends c4 {
    public static final Parcelable.Creator<n7d> CREATOR = new s5d((byte) 11);
    public final int a;
    public final a8d b;

    public n7d(int i, a8d a8dVar) {
        this.a = i;
        this.b = a8dVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        bye.k(parcel, 2, this.b, i);
        bye.s(parcel, r);
    }
}
