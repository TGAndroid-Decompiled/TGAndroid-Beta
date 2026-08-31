package l5;

import android.os.Parcel;
import android.os.Parcelable;
import b6.m;
import j7.g5;
import java.util.Arrays;
import l4.j;
public final class b extends c6.a {
    public static final Parcelable.Creator<b> CREATOR = new j(4);
    public final boolean f11715a;
    public final String f11716b;

    public b(String str, boolean z4) {
        if (z4) {
            m.h(str);
        }
        this.f11715a = z4;
        this.f11716b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f11715a == bVar.f11715a && m.l(this.f11716b, bVar.f11716b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11715a), this.f11716b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 4);
        parcel.writeInt(this.f11715a ? 1 : 0);
        g5.l(parcel, 2, this.f11716b);
        g5.r(parcel, q10);
    }
}
