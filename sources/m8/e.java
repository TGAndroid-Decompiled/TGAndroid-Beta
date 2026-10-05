package m8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import w7.g0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new j(27);
    public final String f16342a;

    public e(String str) {
        this.f16342a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.f16342a);
        g0.r(parcel, q6);
    }
}
