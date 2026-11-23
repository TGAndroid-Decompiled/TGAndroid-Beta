package j7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new b(0);
    public final boolean f17286a;

    public a(boolean z10) {
        this.f17286a = z10;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = cc.r(dest, 20293);
        cc.q(dest, 1, 4);
        dest.writeInt(this.f17286a ? 1 : 0);
        cc.s(dest, r10);
    }
}
