package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class qe0 extends c4 {
    public static final Parcelable.Creator<qe0> CREATOR = new hud((byte) 16);
    public ue0 a;
    public String b;
    public String c;
    public ve0[] d;
    public se0[] e;
    public String[] f;
    public ne0[] h;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.k(parcel, 2, this.a, i);
        bye.l(parcel, 3, this.b);
        bye.l(parcel, 4, this.c);
        bye.o(parcel, 5, this.d, i);
        bye.o(parcel, 6, this.e, i);
        bye.m(parcel, 7, this.f);
        bye.o(parcel, 8, this.h, i);
        bye.s(parcel, r);
    }
}
