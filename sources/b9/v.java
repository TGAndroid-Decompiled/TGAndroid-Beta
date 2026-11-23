package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.wearable.ConnectionConfiguration;
public final class v extends r6.a {
    public static final Parcelable.Creator<v> CREATOR = new c(19);
    public final int f3036a;
    public final ConnectionConfiguration[] f3037b;

    public v(int i7, ConnectionConfiguration[] connectionConfigurationArr) {
        this.f3036a = i7;
        this.f3037b = connectionConfigurationArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f3036a);
        cc.o(parcel, 3, this.f3037b, i7);
        cc.s(parcel, r10);
    }
}
