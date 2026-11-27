package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class pe0 extends c4 {
    public static final Parcelable.Creator<pe0> CREATOR = new g3e((byte) 1);
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public oe0 f;
    public oe0 h;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 2, this.a);
        bye.l(parcel, 3, this.b);
        bye.l(parcel, 4, this.c);
        bye.l(parcel, 5, this.d);
        bye.l(parcel, 6, this.e);
        bye.k(parcel, 7, this.f, i);
        bye.k(parcel, 8, this.h, i);
        bye.s(parcel, r);
    }
}
