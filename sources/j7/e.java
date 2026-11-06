package j7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new b(3);
    public final boolean f16557a;

    public e(boolean z9) {
        this.f16557a = z9;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = wb.r(dest, 20293);
        wb.q(dest, 1, 4);
        dest.writeInt(this.f16557a ? 1 : 0);
        wb.s(dest, r10);
    }
}
