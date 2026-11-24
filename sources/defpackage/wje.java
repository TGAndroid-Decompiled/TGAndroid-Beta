package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class wje extends b4 {
    public static final Parcelable.Creator<wje> CREATOR = new sje((byte) 13);
    public final String a;
    public final String b;
    public final String c;

    public wje(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String toString() {
        return b10.j(mlb.m("DocumentId[packageName=", this.a, ", corpusName=", this.b, ", uri="), this.c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 1, this.a);
        mve.l(parcel, 2, this.b);
        mve.l(parcel, 3, this.c);
        mve.s(parcel, r);
    }
}
