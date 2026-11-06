package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import com.google.android.gms.wearable.ConnectionConfiguration;
public final class v extends r6.a {
    public static final Parcelable.Creator<v> CREATOR = new c(19);
    public final int f3113a;
    public final ConnectionConfiguration[] f3114b;

    public v(int i7, ConnectionConfiguration[] connectionConfigurationArr) {
        this.f3113a = i7;
        this.f3114b = connectionConfigurationArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 2, 4);
        parcel.writeInt(this.f3113a);
        wb.o(parcel, 3, this.f3114b, i7);
        wb.s(parcel, r10);
    }
}
