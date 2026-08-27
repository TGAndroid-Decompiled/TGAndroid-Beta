package j8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
import h7.r8;

public final class w extends z5.a {
    public static final Parcelable.Creator<w> CREATOR = new c(18);

    public final int f12848a;

    public final ConnectionConfiguration f12849b;

    public w(int i10, ConnectionConfiguration connectionConfiguration) {
        this.f12848a = i10;
        this.f12849b = connectionConfiguration;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f12848a);
        r8.k(parcel, 3, this.f12849b, i10);
        r8.r(parcel, iQ);
    }
}
