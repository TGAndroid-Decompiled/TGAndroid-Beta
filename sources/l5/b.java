package l5;

import android.os.Parcel;
import android.os.Parcelable;
import b6.m;
import j7.f5;
import java.util.Arrays;
import l4.j;
public final class b extends c6.a {
    public static final Parcelable.Creator<b> CREATOR = new j(4);
    public final boolean f11449a;
    public final String f11450b;

    public b(String str, boolean z4) {
        if (z4) {
            m.h(str);
        }
        this.f11449a = z4;
        this.f11450b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f11449a == bVar.f11449a && m.l(this.f11450b, bVar.f11450b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11449a), this.f11450b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.f11449a ? 1 : 0);
        f5.l(parcel, 2, this.f11450b);
        f5.r(parcel, q10);
    }
}
