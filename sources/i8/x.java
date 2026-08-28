package i8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
import g7.p8;
public final class x extends y5.a {
    public static final Parcelable.Creator<x> CREATOR = new c(19);
    public final int f11053a;
    public final ConnectionConfiguration[] f11054b;

    public x(int i9, ConnectionConfiguration[] connectionConfigurationArr) {
        this.f11053a = i9;
        this.f11054b = connectionConfigurationArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f11053a);
        p8.o(parcel, 3, this.f11054b, i9);
        p8.r(parcel, q10);
    }
}
