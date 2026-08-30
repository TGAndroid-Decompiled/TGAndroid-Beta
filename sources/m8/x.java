package m8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
import j7.f5;
public final class x extends c6.a {
    public static final Parcelable.Creator<x> CREATOR = new c(19);
    public final int f13876a;
    public final ConnectionConfiguration[] f13877b;

    public x(int i10, ConnectionConfiguration[] connectionConfigurationArr) {
        this.f13876a = i10;
        this.f13877b = connectionConfigurationArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f13876a);
        f5.o(parcel, 3, this.f13877b, i10);
        f5.r(parcel, q10);
    }
}
