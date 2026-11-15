package m8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import q6.m;
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new m6.e(6);
    public final String f20538a;

    public e(String str) {
        m.h(str, "json must not be null");
        this.f20538a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 2, this.f20538a);
        yb.s(parcel, r10);
    }
}
