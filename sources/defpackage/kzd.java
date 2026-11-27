package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
public final class kzd extends c4 {
    public static final Parcelable.Creator<kzd> CREATOR = new hud((byte) 22);
    public final int a;
    public final ConnectionConfiguration[] b;

    public kzd(int i, ConnectionConfiguration[] connectionConfigurationArr) {
        this.a = i;
        this.b = connectionConfigurationArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        bye.o(parcel, 3, this.b, i);
        bye.s(parcel, r);
    }
}
