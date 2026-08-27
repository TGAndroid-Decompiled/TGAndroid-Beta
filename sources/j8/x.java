package j8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
import h7.r8;

public final class x extends z5.a {
    public static final Parcelable.Creator<x> CREATOR = new c(19);

    public final int f12853a;

    public final ConnectionConfiguration[] f12854b;

    public x(int i10, ConnectionConfiguration[] connectionConfigurationArr) {
        this.f12853a = i10;
        this.f12854b = connectionConfigurationArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f12853a);
        r8.o(parcel, 3, this.f12854b, i10);
        r8.r(parcel, iQ);
    }
}
