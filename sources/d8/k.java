package d8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
public final class k extends a6.a {
    public static final Parcelable.Creator<k> CREATOR = new d6.d(13);
    public String f5512a;
    public String f5513b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.l(parcel, 2, this.f5512a);
        o.l(parcel, 3, this.f5513b);
        o.r(parcel, q6);
    }
}
