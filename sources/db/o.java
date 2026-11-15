package db;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class o extends r6.a {
    public static final Parcelable.Creator<o> CREATOR = new k(3);
    public final String f7981a;

    public o(String token) {
        kotlin.jvm.internal.j.e(token, "token");
        this.f7981a = token;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = yb.r(dest, 20293);
        yb.l(dest, 1, this.f7981a);
        yb.s(dest, r10);
    }
}
