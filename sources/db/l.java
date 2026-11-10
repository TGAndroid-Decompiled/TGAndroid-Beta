package db;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.ArrayList;
public final class l extends r6.a {
    public static final Parcelable.Creator<l> CREATOR = new k(2);
    public final ArrayList f8590a;

    public l(ArrayList capabilities) {
        kotlin.jvm.internal.j.e(capabilities, "capabilities");
        this.f8590a = capabilities;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = xb.r(dest, 20293);
        xb.p(dest, 1, this.f8590a);
        xb.s(dest, r10);
    }
}
