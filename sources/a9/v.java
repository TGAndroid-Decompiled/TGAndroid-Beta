package a9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
public final class v extends q6.a {
    public static final Parcelable.Creator<v> CREATOR = new c(19);
    public final int f260a;
    public final ConnectionConfiguration[] f261b;

    public v(int i3, ConnectionConfiguration[] connectionConfigurationArr) {
        this.f260a = i3;
        this.f261b = connectionConfigurationArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f260a);
        j8.a.p(parcel, 3, this.f261b, i3);
        j8.a.t(parcel, s6);
    }
}
