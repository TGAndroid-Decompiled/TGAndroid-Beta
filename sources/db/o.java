package db;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class o extends r6.a {
    public static final Parcelable.Creator<o> CREATOR = new k(3);
    public final String f8589a;

    public o(String token) {
        kotlin.jvm.internal.j.e(token, "token");
        this.f8589a = token;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = xb.r(dest, 20293);
        xb.l(dest, 1, this.f8589a);
        xb.s(dest, r10);
    }
}
