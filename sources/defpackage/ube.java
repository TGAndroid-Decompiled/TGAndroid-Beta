package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class ube extends b4 {
    public static final Parcelable.Creator<ube> CREATOR = new qyd((byte) 18);
    public final int a;

    public ube(int i) {
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
