package i8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
public final class h extends a6.a {
    public static final Parcelable.Creator<h> CREATOR = new i4.g(10);
    public String f8577a;
    public String f8578b;
    public f f8579c;
    public g d;
    public g f8580e;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.l(parcel, 2, this.f8577a);
        o.l(parcel, 3, this.f8578b);
        o.k(parcel, 4, this.f8579c, i10);
        o.k(parcel, 5, this.d, i10);
        o.k(parcel, 6, this.f8580e, i10);
        o.r(parcel, q6);
    }
}
