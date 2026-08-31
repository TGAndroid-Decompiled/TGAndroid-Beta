package j8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class l extends c6.a {
    public static final Parcelable.Creator<l> CREATOR = new f8.o(26);
    public int f9915a;
    public Bundle f9916b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        int i11 = this.f9915a;
        g5.s(parcel, 2, 4);
        parcel.writeInt(i11);
        g5.b(parcel, 3, this.f9916b);
        g5.r(parcel, q10);
    }
}
