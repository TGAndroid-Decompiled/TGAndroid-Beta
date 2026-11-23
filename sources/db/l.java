package db;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.ArrayList;
public final class l extends r6.a {
    public static final Parcelable.Creator<l> CREATOR = new k(2);
    public final ArrayList f8250a;

    public l(ArrayList capabilities) {
        kotlin.jvm.internal.j.e(capabilities, "capabilities");
        this.f8250a = capabilities;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = cc.r(dest, 20293);
        cc.p(dest, 1, this.f8250a);
        cc.s(dest, r10);
    }
}
