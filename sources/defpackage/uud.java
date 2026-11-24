package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
public final class uud extends b4 {
    public static final Parcelable.Creator<uud> CREATOR = new rpd((byte) 22);
    public final int a;
    public final ConnectionConfiguration[] b;

    public uud(int i, ConnectionConfiguration[] connectionConfigurationArr) {
        this.a = i;
        this.b = connectionConfigurationArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        jte.o(parcel, 3, this.b, i);
        jte.s(parcel, r);
    }
}
