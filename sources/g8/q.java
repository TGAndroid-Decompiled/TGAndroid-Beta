package g8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class q extends z5.a {
    public static final Parcelable.Creator<q> CREATOR = new f4.e(18);

    public String f6771a;

    public String f6772b;

    public String f6773c;
    public String d;

    public String f6774e;

    public String f6775f;
    public String h;

    public String f6776n;

    public String f6777r;

    public boolean f6778s;
    public String v;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 2, this.f6771a);
        r8.l(parcel, 3, this.f6772b);
        r8.l(parcel, 4, this.f6773c);
        r8.l(parcel, 5, this.d);
        r8.l(parcel, 6, this.f6774e);
        r8.l(parcel, 7, this.f6775f);
        r8.l(parcel, 8, this.h);
        r8.l(parcel, 9, this.f6776n);
        r8.l(parcel, 10, this.f6777r);
        boolean z10 = this.f6778s;
        r8.s(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        r8.l(parcel, 12, this.v);
        r8.r(parcel, iQ);
    }
}
