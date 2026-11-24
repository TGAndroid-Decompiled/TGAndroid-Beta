package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class uw5 extends b4 {
    public static final Parcelable.Creator<uw5> CREATOR = new qyd((byte) 3);
    public String a;
    public String b;
    public ArrayList c;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 2, this.a);
        jte.l(parcel, 3, this.b);
        jte.p(parcel, 4, this.c);
        jte.s(parcel, r);
    }
}
