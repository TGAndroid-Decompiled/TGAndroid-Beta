package d8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
public final class i extends a6.a {
    public static final Parcelable.Creator<i> CREATOR = new d6.d(11);
    public int f5508a;
    public String f5509b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        int i11 = this.f5508a;
        o.s(parcel, 2, 4);
        parcel.writeInt(i11);
        o.l(parcel, 3, this.f5509b);
        o.r(parcel, q6);
    }
}
