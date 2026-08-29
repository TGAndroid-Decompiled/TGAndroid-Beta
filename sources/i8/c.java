package i8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
public final class c extends a6.a {
    public static final Parcelable.Creator<c> CREATOR = new i4.g(6);
    public String f8563a;
    public d f8564b;
    public f f8565c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.l(parcel, 2, this.f8563a);
        o.k(parcel, 3, this.f8564b, i10);
        o.k(parcel, 5, this.f8565c, i10);
        o.r(parcel, q6);
    }
}
