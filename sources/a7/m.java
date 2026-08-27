package a7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class m extends z5.a {
    public static final Parcelable.Creator<m> CREATOR = new w.a(8);

    public final boolean f131a;

    public m(boolean z10) {
        this.f131a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && this.f131a == ((m) obj).f131a;
    }

    public final int hashCode() {
        return this.f131a ? 1 : 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 1, 4);
        parcel.writeInt(this.f131a ? 1 : 0);
        r8.r(parcel, iQ);
    }
}
