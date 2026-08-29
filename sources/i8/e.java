package i8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
public final class e extends a6.a {
    public static final Parcelable.Creator<e> CREATOR = new i4.g(7);
    public String f8571a;
    public String f8572b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.l(parcel, 2, this.f8571a);
        o.l(parcel, 3, this.f8572b);
        o.r(parcel, q6);
    }
}
