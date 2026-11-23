package db;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class o extends r6.a {
    public static final Parcelable.Creator<o> CREATOR = new k(3);
    public final String f8254a;

    public o(String token) {
        kotlin.jvm.internal.j.e(token, "token");
        this.f8254a = token;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = cc.r(dest, 20293);
        cc.l(dest, 1, this.f8254a);
        cc.s(dest, r10);
    }
}
