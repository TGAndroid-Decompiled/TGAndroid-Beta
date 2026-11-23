package j7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new b(3);
    public final boolean f17389a;

    public e(boolean z10) {
        this.f17389a = z10;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = cc.r(dest, 20293);
        cc.q(dest, 1, 4);
        dest.writeInt(this.f17389a ? 1 : 0);
        cc.s(dest, r10);
    }
}
