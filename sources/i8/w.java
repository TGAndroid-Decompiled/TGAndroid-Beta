package i8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
import g7.p8;
public final class w extends y5.a {
    public static final Parcelable.Creator<w> CREATOR = new c(18);
    public final int f11048a;
    public final ConnectionConfiguration f11049b;

    public w(int i9, ConnectionConfiguration connectionConfiguration) {
        this.f11048a = i9;
        this.f11049b = connectionConfiguration;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f11048a);
        p8.k(parcel, 3, this.f11049b, i9);
        p8.r(parcel, q10);
    }
}
