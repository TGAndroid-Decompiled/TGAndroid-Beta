package f8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class l extends y5.a {
    public static final Parcelable.Creator<l> CREATOR = new r(0);
    public int f5960a;
    public Bundle f5961b;

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        int i10 = this.f5960a;
        p8.s(parcel, 2, 4);
        parcel.writeInt(i10);
        p8.b(parcel, 3, this.f5961b);
        p8.r(parcel, q10);
    }
}
