package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class ue0 extends c4 {
    public static final Parcelable.Creator<ue0> CREATOR = new ime((byte) 2);
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String h;

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
        bye.s(parcel, r);
    }
}
