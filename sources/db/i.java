package db;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class i extends r6.a {
    public static final Parcelable.Creator<i> CREATOR = new k(0);
    public final int f8584a;
    public final String f8585b;
    public final int f8586c;

    public i(int i7, int i10, String simOperatorName) {
        kotlin.jvm.internal.j.e(simOperatorName, "simOperatorName");
        this.f8584a = i7;
        this.f8585b = simOperatorName;
        this.f8586c = i10;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = xb.r(dest, 20293);
        xb.q(dest, 1, 4);
        dest.writeInt(this.f8584a);
        xb.l(dest, 2, this.f8585b);
        xb.q(dest, 3, 4);
        dest.writeInt(this.f8586c);
        xb.s(dest, r10);
    }
}
