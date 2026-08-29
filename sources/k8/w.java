package k8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
public final class w extends a6.a {
    public static final Parcelable.Creator<w> CREATOR = new c(18);
    public final int f13571a;
    public final ConnectionConfiguration f13572b;

    public w(int i10, ConnectionConfiguration connectionConfiguration) {
        this.f13571a = i10;
        this.f13572b = connectionConfiguration;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f13571a);
        com.google.android.gms.internal.cast.o.k(parcel, 3, this.f13572b, i10);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
