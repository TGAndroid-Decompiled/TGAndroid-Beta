package j8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import java.util.Arrays;
import n6.l;
import w7.g0;
public class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new j(16);
    public final int f12903a;
    public final Float f12904b;

    public h(int i10, Float f7) {
        boolean z10 = true;
        if (i10 != 1 && (f7 == null || f7.floatValue() < 0.0f)) {
            z10 = false;
        }
        l.a("Invalid PatternItem: type=" + i10 + " length=" + f7, z10);
        this.f12903a = i10;
        this.f12904b = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f12903a == hVar.f12903a && l.l(this.f12904b, hVar.f12904b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f12903a), this.f12904b});
    }

    public String toString() {
        return "[PatternItem: type=" + this.f12903a + " length=" + this.f12904b + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 2, 4);
        parcel.writeInt(this.f12903a);
        g0.e(parcel, 3, this.f12904b);
        g0.r(parcel, q6);
    }
}
