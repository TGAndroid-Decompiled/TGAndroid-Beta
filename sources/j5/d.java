package j5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
import java.util.Arrays;
public final class d extends a6.a {
    public static final Parcelable.Creator<d> CREATOR = new i4.g(17);
    public final boolean f10879a;

    public d(boolean z10) {
        this.f10879a = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d) || this.f10879a != ((d) obj).f10879a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f10879a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.s(parcel, 1, 4);
        parcel.writeInt(this.f10879a ? 1 : 0);
        o.r(parcel, q6);
    }
}
