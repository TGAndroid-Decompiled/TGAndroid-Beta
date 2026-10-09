package m8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import w7.d0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new j(27);
    public final String f16276a;

    public e(String str) {
        this.f16276a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 2, this.f16276a);
        d0.r(parcel, q6);
    }
}
