package h7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class a extends p6.a {
    public static final Parcelable.Creator<a> CREATOR = new f6.i(12);
    public final boolean f12679a;

    public a(boolean z10) {
        this.f12679a = z10;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q5 = df.q(dest, 20293);
        df.s(dest, 1, 4);
        dest.writeInt(this.f12679a ? 1 : 0);
        df.r(dest, q5);
    }
}
