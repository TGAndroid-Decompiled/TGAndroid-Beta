package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class z0 extends o6.a {
    public static final Parcelable.Creator<z0> CREATOR = new w.a(17);
    public final boolean f4703a;

    public z0(boolean z10) {
        this.f4703a = Boolean.valueOf(z10).booleanValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z0) || this.f4703a != ((z0) obj).f4703a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f4703a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 1, 4);
        parcel.writeInt(this.f4703a ? 1 : 0);
        w7.e0.r(parcel, q6);
    }
}
