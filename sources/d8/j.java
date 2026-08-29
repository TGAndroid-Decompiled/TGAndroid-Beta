package d8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
public final class j extends a6.a {
    public static final Parcelable.Creator<j> CREATOR = new d6.d(10);
    public String f5510a;
    public String f5511b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.l(parcel, 2, this.f5510a);
        o.l(parcel, 3, this.f5511b);
        o.r(parcel, q6);
    }
}
