package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class t extends o6.a {
    public static final Parcelable.Creator<t> CREATOR = new w.a(20);
    public final boolean f4147a;

    public t(boolean z10) {
        this.f4147a = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t) || this.f4147a != ((t) obj).f4147a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f4147a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 1, 4);
        parcel.writeInt(this.f4147a ? 1 : 0);
        w7.f0.r(parcel, q6);
    }
}
