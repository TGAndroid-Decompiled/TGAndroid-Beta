package a7;

import a9.p;
import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class g extends z5.a {
    public static final Parcelable.Creator<g> CREATOR = new w.a(3);

    public final String f110a;

    public final String f111b;

    public final String f112c;

    public g(String str, String str2, String str3) {
        this.f110a = str;
        this.f111b = str2;
        this.f112c = str3;
    }

    public final String toString() {
        return p.p(i0.a.p("DocumentId[packageName=", this.f110a, ", corpusName=", this.f111b, ", uri="), this.f112c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 1, this.f110a);
        r8.l(parcel, 2, this.f111b);
        r8.l(parcel, 3, this.f112c);
        r8.r(parcel, iQ);
    }
}
