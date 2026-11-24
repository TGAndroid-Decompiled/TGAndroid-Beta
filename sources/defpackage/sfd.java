package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class sfd extends b4 {
    public static final Parcelable.Creator<sfd> CREATOR = new j9d((byte) 27);
    public final int a;

    public sfd(int i) {
        this.a = i;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        jte.s(parcel, r);
    }
}
