package db;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class i extends r6.a {
    public static final Parcelable.Creator<i> CREATOR = new k(0);
    public final int f7968a;
    public final String f7969b;
    public final int f7970c;

    public i(int i7, int i10, String simOperatorName) {
        kotlin.jvm.internal.j.e(simOperatorName, "simOperatorName");
        this.f7968a = i7;
        this.f7969b = simOperatorName;
        this.f7970c = i10;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = yb.r(dest, 20293);
        yb.q(dest, 1, 4);
        dest.writeInt(this.f7968a);
        yb.l(dest, 2, this.f7969b);
        yb.q(dest, 3, 4);
        dest.writeInt(this.f7970c);
        yb.s(dest, r10);
    }
}
