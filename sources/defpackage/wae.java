package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class wae extends b4 {
    public static final Parcelable.Creator<wae> CREATOR = new qyd((byte) 17);
    public final int a;
    public final kpd b;

    public wae(int i, kpd kpdVar) {
        this.a = i;
        this.b = kpdVar;
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
