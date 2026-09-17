package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new r0(12);
    public final boolean f4622a;

    public h(boolean z10) {
        this.f4622a = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h) || this.f4622a != ((h) obj).f4622a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f4622a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 1, 4);
        parcel.writeInt(this.f4622a ? 1 : 0);
        w7.e0.r(parcel, q6);
    }
}
