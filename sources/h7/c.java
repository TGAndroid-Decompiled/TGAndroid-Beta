package h7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class c extends p6.a {
    public static final Parcelable.Creator<c> CREATOR = new f6.i(14);
    public final boolean f12681a;

    public c(boolean z10) {
        this.f12681a = z10;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q5 = df.q(dest, 20293);
        df.s(dest, 1, 4);
        dest.writeInt(this.f12681a ? 1 : 0);
        df.r(dest, q5);
    }
}
