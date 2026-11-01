package m8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new g8.g(26);
    public final String f13026a;

    public e(String str) {
        this.f13026a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 2, this.f13026a);
        h0.r(parcel, q6);
    }
}
