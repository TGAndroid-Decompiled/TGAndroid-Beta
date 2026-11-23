package a6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
import q6.m;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new w.a(4);
    public final boolean f279a;
    public final String f280b;

    public b(String str, boolean z10) {
        if (z10) {
            m.h(str);
        }
        this.f279a = z10;
        this.f280b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f279a == bVar.f279a && m.l(this.f280b, bVar.f280b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f279a), this.f280b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.f279a ? 1 : 0);
        cc.l(parcel, 2, this.f280b);
        cc.s(parcel, r10);
    }
}
