package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class gi6 extends c4 {
    public static final Parcelable.Creator<gi6> CREATOR = new ime((byte) 10);
    public String a;
    public hi6 b;
    public prb c;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 2, this.a);
        bye.k(parcel, 3, this.b, i);
        bye.k(parcel, 5, this.c, i);
        bye.s(parcel, r);
    }
}
