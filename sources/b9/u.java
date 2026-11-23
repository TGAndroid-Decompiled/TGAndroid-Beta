package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.wearable.ConnectionConfiguration;
public final class u extends r6.a {
    public static final Parcelable.Creator<u> CREATOR = new c(18);
    public final int f3032a;
    public final ConnectionConfiguration f3033b;

    public u(int i7, ConnectionConfiguration connectionConfiguration) {
        this.f3032a = i7;
        this.f3033b = connectionConfiguration;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f3032a);
        cc.k(parcel, 3, this.f3033b, i7);
        cc.s(parcel, r10);
    }
}
