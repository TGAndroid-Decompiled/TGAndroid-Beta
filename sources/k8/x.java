package k8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
public final class x extends a6.a {
    public static final Parcelable.Creator<x> CREATOR = new c(19);
    public final int f13576a;
    public final ConnectionConfiguration[] f13577b;

    public x(int i10, ConnectionConfiguration[] connectionConfigurationArr) {
        this.f13576a = i10;
        this.f13577b = connectionConfigurationArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f13576a);
        com.google.android.gms.internal.cast.o.o(parcel, 3, this.f13577b, i10);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
