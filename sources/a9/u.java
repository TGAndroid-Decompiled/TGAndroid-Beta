package a9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
public final class u extends q6.a {
    public static final Parcelable.Creator<u> CREATOR = new c(18);
    public final int f255a;
    public final ConnectionConfiguration f256b;

    public u(int i3, ConnectionConfiguration connectionConfiguration) {
        this.f255a = i3;
        this.f256b = connectionConfiguration;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f255a);
        j8.a.l(parcel, 3, this.f256b, i3);
        j8.a.t(parcel, s6);
    }
}
