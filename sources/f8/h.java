package f8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class h extends c6.a {
    public static final Parcelable.Creator<h> CREATOR = new b9.e(27);
    public String f6067a;
    public String f6068b;
    public String f6069c;
    public String d;
    public String e;
    public String f6070f;
    public String h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.f6067a);
        f5.l(parcel, 3, this.f6068b);
        f5.l(parcel, 4, this.f6069c);
        f5.l(parcel, 5, this.d);
        f5.l(parcel, 6, this.e);
        f5.l(parcel, 7, this.f6070f);
        f5.l(parcel, 8, this.h);
        f5.r(parcel, q10);
    }
}
