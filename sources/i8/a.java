package i8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
public final class a extends a6.a {
    public static final Parcelable.Creator<a> CREATOR = new i4.g(3);
    public String f8558a;
    public String f8559b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.l(parcel, 2, this.f8558a);
        o.l(parcel, 3, this.f8559b);
        o.r(parcel, q6);
    }
}
