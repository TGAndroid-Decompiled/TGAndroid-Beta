package m8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
import j7.g5;
public final class x extends c6.a {
    public static final Parcelable.Creator<x> CREATOR = new c(19);
    public final int f13592a;
    public final ConnectionConfiguration[] f13593b;

    public x(int i10, ConnectionConfiguration[] connectionConfigurationArr) {
        this.f13592a = i10;
        this.f13593b = connectionConfigurationArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f13592a);
        g5.o(parcel, 3, this.f13593b, i10);
        g5.r(parcel, q10);
    }
}
