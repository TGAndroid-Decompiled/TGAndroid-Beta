package j8;

import android.os.Parcel;
import android.os.Parcelable;
import n6.l;
import w7.h0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new g8.g(13);
    public final String f9714a;

    public d(String str) {
        l.h(str, "json must not be null");
        this.f9714a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 2, this.f9714a);
        h0.r(parcel, q6);
    }
}
