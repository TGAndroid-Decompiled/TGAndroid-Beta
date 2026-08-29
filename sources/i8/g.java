package i8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
public final class g extends a6.a {
    public static final Parcelable.Creator<g> CREATOR = new i4.g(9);
    public String f8575a;
    public String f8576b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.l(parcel, 2, this.f8575a);
        o.l(parcel, 3, this.f8576b);
        o.r(parcel, q6);
    }
}
