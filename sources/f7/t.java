package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.Arrays;
public final class t extends r6.a {
    public static final Parcelable.Creator<t> CREATOR = new db.k(9);
    public final boolean f11430a;

    public t(boolean z9) {
        this.f11430a = z9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t) || this.f11430a != ((t) obj).f11430a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11430a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 1, 4);
        parcel.writeInt(this.f11430a ? 1 : 0);
        wb.s(parcel, r10);
    }
}
