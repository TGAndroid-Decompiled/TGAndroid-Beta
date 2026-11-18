package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.wearable.ConnectionConfiguration;
public final class v extends r6.a {
    public static final Parcelable.Creator<v> CREATOR = new c(19);
    public final int f3065a;
    public final ConnectionConfiguration[] f3066b;

    public v(int i7, ConnectionConfiguration[] connectionConfigurationArr) {
        this.f3065a = i7;
        this.f3066b = connectionConfigurationArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f3065a);
        bc.o(parcel, 3, this.f3066b, i7);
        bc.s(parcel, r10);
    }
}
