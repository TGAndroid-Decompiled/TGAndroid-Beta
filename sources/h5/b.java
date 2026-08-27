package h5;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;
import y5.l;

public final class b extends z5.a {
    public static final Parcelable.Creator<b> CREATOR = new h(2);

    public final boolean f8267a;

    public final String f8268b;

    public b(String str, boolean z10) {
        if (z10) {
            l.h(str);
        }
        this.f8267a = z10;
        this.f8268b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f8267a == bVar.f8267a && l.l(this.f8268b, bVar.f8268b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f8267a), this.f8268b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 1, 4);
        parcel.writeInt(this.f8267a ? 1 : 0);
        r8.l(parcel, 2, this.f8268b);
        r8.r(parcel, iQ);
    }
}
