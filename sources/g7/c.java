package g7;

import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new e6.p(13);
    public final boolean f7427a;

    public c(boolean z10) {
        this.f7427a = z10;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q6 = h0.q(dest, 20293);
        h0.s(dest, 1, 4);
        dest.writeInt(this.f7427a ? 1 : 0);
        h0.r(dest, q6);
    }
}
