package g7;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new e6.i(14);
    public final boolean f9473a;

    public c(boolean z10) {
        this.f9473a = z10;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q6 = e0.q(dest, 20293);
        e0.s(dest, 1, 4);
        dest.writeInt(this.f9473a ? 1 : 0);
        e0.r(dest, q6);
    }
}
