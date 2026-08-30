package m8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
import j7.f5;
public final class w extends c6.a {
    public static final Parcelable.Creator<w> CREATOR = new c(18);
    public final int f13871a;
    public final ConnectionConfiguration f13872b;

    public w(int i10, ConnectionConfiguration connectionConfiguration) {
        this.f13871a = i10;
        this.f13872b = connectionConfiguration;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f13871a);
        f5.k(parcel, 3, this.f13872b, i10);
        f5.r(parcel, q10);
    }
}
