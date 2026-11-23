package db;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class i extends r6.a {
    public static final Parcelable.Creator<i> CREATOR = new k(0);
    public final int f8244a;
    public final String f8245b;
    public final int f8246c;

    public i(int i7, int i10, String simOperatorName) {
        kotlin.jvm.internal.j.e(simOperatorName, "simOperatorName");
        this.f8244a = i7;
        this.f8245b = simOperatorName;
        this.f8246c = i10;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = cc.r(dest, 20293);
        cc.q(dest, 1, 4);
        dest.writeInt(this.f8244a);
        cc.l(dest, 2, this.f8245b);
        cc.q(dest, 3, 4);
        dest.writeInt(this.f8246c);
        cc.s(dest, r10);
    }
}
