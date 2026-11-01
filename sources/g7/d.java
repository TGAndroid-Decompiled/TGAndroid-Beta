package g7;

import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new e6.p(14);
    public final boolean f7429a;

    public d(boolean z10) {
        this.f7429a = z10;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q6 = h0.q(dest, 20293);
        h0.s(dest, 1, 4);
        dest.writeInt(this.f7429a ? 1 : 0);
        h0.r(dest, q6);
    }
}
