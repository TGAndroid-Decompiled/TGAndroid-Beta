package j7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new b(2);
    public final boolean f16912a;

    public d(boolean z10) {
        this.f16912a = z10;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = yb.r(dest, 20293);
        yb.q(dest, 1, 4);
        dest.writeInt(this.f16912a ? 1 : 0);
        yb.s(dest, r10);
    }
}
