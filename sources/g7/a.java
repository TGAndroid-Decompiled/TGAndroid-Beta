package g7;

import android.os.Parcel;
import android.os.Parcelable;
import w7.c0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new e6.i(12);
    public final boolean f10384a;

    public a(boolean z10) {
        this.f10384a = z10;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q6 = c0.q(dest, 20293);
        c0.s(dest, 1, 4);
        dest.writeInt(this.f10384a ? 1 : 0);
        c0.r(dest, q6);
    }
}
