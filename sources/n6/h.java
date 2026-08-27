package n6;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;

public final class h extends z5.a {
    public static final Parcelable.Creator<h> CREATOR = new o0(23);

    public final boolean f18361a;

    public h(boolean z10) {
        this.f18361a = z10;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof h) && this.f18361a == ((h) obj).f18361a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f18361a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 1, 4);
        parcel.writeInt(this.f18361a ? 1 : 0);
        r8.r(parcel, iQ);
    }
}
