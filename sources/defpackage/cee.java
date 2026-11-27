package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class cee extends c4 {
    public static final Parcelable.Creator<cee> CREATOR = new g3e((byte) 14);
    public final int a;
    public final fjd b;

    public cee(int i, fjd fjdVar) {
        this.a = i;
        this.b = fjdVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        bye.k(parcel, 3, this.b, i);
        bye.s(parcel, r);
    }
}
