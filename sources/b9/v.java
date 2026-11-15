package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.wearable.ConnectionConfiguration;
public final class v extends r6.a {
    public static final Parcelable.Creator<v> CREATOR = new c(19);
    public final int f3068a;
    public final ConnectionConfiguration[] f3069b;

    public v(int i7, ConnectionConfiguration[] connectionConfigurationArr) {
        this.f3068a = i7;
        this.f3069b = connectionConfigurationArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f3068a);
        yb.o(parcel, 3, this.f3069b, i7);
        yb.s(parcel, r10);
    }
}
