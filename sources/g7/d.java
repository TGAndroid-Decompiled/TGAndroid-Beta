package g7;

import android.os.Parcel;
import android.os.Parcelable;
import w7.d0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new e6.i(15);
    public final boolean f10387a;

    public d(boolean z10) {
        this.f10387a = z10;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q6 = d0.q(dest, 20293);
        d0.s(dest, 1, 4);
        dest.writeInt(this.f10387a ? 1 : 0);
        d0.r(dest, q6);
    }
}
