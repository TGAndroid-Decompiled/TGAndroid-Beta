package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
public final class xwd extends b4 {
    public static final Parcelable.Creator<xwd> CREATOR = new urd((byte) 22);
    public final int a;
    public final ConnectionConfiguration[] b;

    public xwd(int i, ConnectionConfiguration[] connectionConfigurationArr) {
        this.a = i;
        this.b = connectionConfigurationArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        mve.o(parcel, 3, this.b, i);
        mve.s(parcel, r);
    }
}
