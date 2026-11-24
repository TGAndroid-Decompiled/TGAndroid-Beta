package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class wj7 extends b4 {
    public static final Parcelable.Creator<wj7> CREATOR = new xff((byte) 9);
    public final String a;
    public final int b;
    public final String c;

    public wj7(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 2, this.a);
        jte.q(parcel, 3, 4);
        parcel.writeInt(this.b);
        jte.l(parcel, 4, this.c);
        jte.s(parcel, r);
    }
}
