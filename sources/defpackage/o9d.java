package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class o9d extends c4 {
    public static final Parcelable.Creator<o9d> CREATOR = new ced((byte) 15);
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String h;
    public String n;
    public String r;
    public boolean s;
    public String w;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 2, this.a);
        bye.l(parcel, 3, this.b);
        bye.l(parcel, 4, this.c);
        bye.l(parcel, 5, this.d);
        bye.l(parcel, 6, this.e);
        bye.l(parcel, 7, this.f);
        bye.l(parcel, 8, this.h);
        bye.l(parcel, 9, this.n);
        bye.l(parcel, 10, this.r);
        boolean z = this.s;
        bye.q(parcel, 11, 4);
        parcel.writeInt(z ? 1 : 0);
        bye.l(parcel, 12, this.w);
        bye.s(parcel, r);
    }
}
