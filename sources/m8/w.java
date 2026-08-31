package m8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
import j7.g5;
public final class w extends c6.a {
    public static final Parcelable.Creator<w> CREATOR = new c(18);
    public final int f13587a;
    public final ConnectionConfiguration f13588b;

    public w(int i10, ConnectionConfiguration connectionConfiguration) {
        this.f13587a = i10;
        this.f13588b = connectionConfiguration;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f13587a);
        g5.k(parcel, 3, this.f13588b, i10);
        g5.r(parcel, q10);
    }
}
