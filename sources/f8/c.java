package f8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class c extends c6.a {
    public static final Parcelable.Creator<c> CREATOR = new b9.e(24);
    public String f6055a;
    public String f6056b;
    public String f6057c;
    public String d;
    public String e;
    public b f6058f;
    public b h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.f6055a);
        f5.l(parcel, 3, this.f6056b);
        f5.l(parcel, 4, this.f6057c);
        f5.l(parcel, 5, this.d);
        f5.l(parcel, 6, this.e);
        f5.k(parcel, 7, this.f6058f, i10);
        f5.k(parcel, 8, this.h, i10);
        f5.r(parcel, q10);
    }
}
