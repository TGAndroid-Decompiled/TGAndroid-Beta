package i7;

import android.os.Parcel;
import android.os.Parcelable;
import f6.c0;
public final class d extends q6.a {
    public static final Parcelable.Creator<d> CREATOR = new c0(18);
    public final boolean f14671a;

    public d(boolean z10) {
        this.f14671a = z10;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i3) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int s6 = j8.a.s(dest, 20293);
        j8.a.r(dest, 1, 4);
        dest.writeInt(this.f14671a ? 1 : 0);
        j8.a.t(dest, s6);
    }
}
