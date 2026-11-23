package j7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new b(3);
    public final boolean f17323a;

    public e(boolean z10) {
        this.f17323a = z10;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = bc.r(dest, 20293);
        bc.q(dest, 1, 4);
        dest.writeInt(this.f17323a ? 1 : 0);
        bc.s(dest, r10);
    }
}
