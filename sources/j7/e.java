package j7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new b(3);
    public final boolean f16560a;

    public e(boolean z9) {
        this.f16560a = z9;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = xb.r(dest, 20293);
        xb.q(dest, 1, 4);
        dest.writeInt(this.f16560a ? 1 : 0);
        xb.s(dest, r10);
    }
}
