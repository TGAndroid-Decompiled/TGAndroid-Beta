package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import com.google.android.gms.wearable.ConnectionConfiguration;
public final class u extends r6.a {
    public static final Parcelable.Creator<u> CREATOR = new c(18);
    public final int f3108a;
    public final ConnectionConfiguration f3109b;

    public u(int i7, ConnectionConfiguration connectionConfiguration) {
        this.f3108a = i7;
        this.f3109b = connectionConfiguration;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f3108a);
        xb.k(parcel, 3, this.f3109b, i7);
        xb.s(parcel, r10);
    }
}
