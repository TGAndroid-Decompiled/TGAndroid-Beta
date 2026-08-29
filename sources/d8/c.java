package d8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
public final class c extends a6.a {
    public static final Parcelable.Creator<c> CREATOR = new d6.d(5);
    public String f5477a;
    public String f5478b;
    public String f5479c;
    public String d;
    public String f5480e;
    public b f5481f;
    public b h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.l(parcel, 2, this.f5477a);
        o.l(parcel, 3, this.f5478b);
        o.l(parcel, 4, this.f5479c);
        o.l(parcel, 5, this.d);
        o.l(parcel, 6, this.f5480e);
        o.k(parcel, 7, this.f5481f, i10);
        o.k(parcel, 8, this.h, i10);
        o.r(parcel, q6);
    }
}
