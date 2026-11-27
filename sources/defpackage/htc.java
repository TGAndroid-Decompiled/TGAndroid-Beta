package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class htc extends c4 {
    public static final Parcelable.Creator<htc> CREATOR = new t4f((byte) 9);
    public String a;
    public String b;
    public prb c;
    public rac d;
    public rac e;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 2, this.a);
        bye.l(parcel, 3, this.b);
        bye.k(parcel, 4, this.c, i);
        bye.k(parcel, 5, this.d, i);
        bye.k(parcel, 6, this.e, i);
        bye.s(parcel, r);
    }
}
