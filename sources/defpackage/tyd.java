package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class tyd extends b4 {
    public static final Parcelable.Creator<tyd> CREATOR = new qyd((byte) 11);
    public final int a;

    public tyd(int i) {
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
