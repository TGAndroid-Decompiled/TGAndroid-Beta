package db;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class i extends r6.a {
    public static final Parcelable.Creator<i> CREATOR = new k(0);
    public final int f8579a;
    public final String f8580b;
    public final int f8581c;

    public i(int i7, int i10, String simOperatorName) {
        kotlin.jvm.internal.j.e(simOperatorName, "simOperatorName");
        this.f8579a = i7;
        this.f8580b = simOperatorName;
        this.f8581c = i10;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = xb.r(dest, 20293);
        xb.q(dest, 1, 4);
        dest.writeInt(this.f8579a);
        xb.l(dest, 2, this.f8580b);
        xb.q(dest, 3, 4);
        dest.writeInt(this.f8581c);
        xb.s(dest, r10);
    }
}
