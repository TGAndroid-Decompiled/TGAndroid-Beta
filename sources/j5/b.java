package j5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
import java.util.Arrays;
import z5.l;
public final class b extends a6.a {
    public static final Parcelable.Creator<b> CREATOR = new i4.g(15);
    public final boolean f10874a;
    public final String f10875b;

    public b(String str, boolean z10) {
        if (z10) {
            l.h(str);
        }
        this.f10874a = z10;
        this.f10875b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f10874a == bVar.f10874a && l.l(this.f10875b, bVar.f10875b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f10874a), this.f10875b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.s(parcel, 1, 4);
        parcel.writeInt(this.f10874a ? 1 : 0);
        o.l(parcel, 2, this.f10875b);
        o.r(parcel, q6);
    }
}
