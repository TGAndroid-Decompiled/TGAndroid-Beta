package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.wearable.ConnectionConfiguration;
public final class u extends r6.a {
    public static final Parcelable.Creator<u> CREATOR = new c(18);
    public final int f3064a;
    public final ConnectionConfiguration f3065b;

    public u(int i7, ConnectionConfiguration connectionConfiguration) {
        this.f3064a = i7;
        this.f3065b = connectionConfiguration;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f3064a);
        yb.k(parcel, 3, this.f3065b, i7);
        yb.s(parcel, r10);
    }
}
