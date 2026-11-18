package db;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class o extends r6.a {
    public static final Parcelable.Creator<o> CREATOR = new k(3);
    public final String f8263a;

    public o(String token) {
        kotlin.jvm.internal.j.e(token, "token");
        this.f8263a = token;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = bc.r(dest, 20293);
        bc.l(dest, 1, this.f8263a);
        bc.s(dest, r10);
    }
}
