package j8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import n6.l;
import w7.d0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new j(14);
    public final String f14081a;

    public e(String str) {
        l.i(str, "json must not be null");
        this.f14081a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 2, this.f14081a);
        d0.r(parcel, q6);
    }
}
