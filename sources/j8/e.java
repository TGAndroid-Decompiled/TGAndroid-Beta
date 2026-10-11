package j8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import n6.m;
import w7.d0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new j(14);
    public final String f14080a;

    public e(String str) {
        m.i(str, "json must not be null");
        this.f14080a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 2, this.f14080a);
        d0.r(parcel, q6);
    }
}
