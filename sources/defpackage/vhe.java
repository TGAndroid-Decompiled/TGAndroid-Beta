package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class vhe extends b4 {
    public static final Parcelable.Creator<vhe> CREATOR = new rhe((byte) 13);
    public final String a;
    public final String b;
    public final String c;

    public vhe(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String toString() {
        return b00.j(yjb.l("DocumentId[packageName=", this.a, ", corpusName=", this.b, ", uri="), this.c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 1, this.a);
        jte.l(parcel, 2, this.b);
        jte.l(parcel, 3, this.c);
        jte.s(parcel, r);
    }
}
