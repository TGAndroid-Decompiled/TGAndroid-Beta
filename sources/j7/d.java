package j7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new b(2);
    public final boolean f17288a;

    public d(boolean z10) {
        this.f17288a = z10;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = cc.r(dest, 20293);
        cc.q(dest, 1, 4);
        dest.writeInt(this.f17288a ? 1 : 0);
        cc.s(dest, r10);
    }
}
