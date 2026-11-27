package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class mme extends c4 {
    public static final Parcelable.Creator<mme> CREATOR = new ime((byte) 13);
    public final String a;
    public final String b;
    public final String c;

    public mme(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String toString() {
        return c00.k(xnb.l("DocumentId[packageName=", this.a, ", corpusName=", this.b, ", uri="), this.c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 1, this.a);
        bye.l(parcel, 2, this.b);
        bye.l(parcel, 3, this.c);
        bye.s(parcel, r);
    }
}
