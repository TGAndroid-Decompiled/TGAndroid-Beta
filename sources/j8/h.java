package j8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import java.util.Arrays;
import n6.l;
import w7.d0;
public class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new j(16);
    public final int f14094a;
    public final Float f14095b;

    public h(int i10, Float f7) {
        boolean z10 = true;
        if (i10 != 1 && (f7 == null || f7.floatValue() < 0.0f)) {
            z10 = false;
        }
        l.a("Invalid PatternItem: type=" + i10 + " length=" + f7, z10);
        this.f14094a = i10;
        this.f14095b = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f14094a == hVar.f14094a && l.l(this.f14095b, hVar.f14095b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f14094a), this.f14095b});
    }

    public String toString() {
        return "[PatternItem: type=" + this.f14094a + " length=" + this.f14095b + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.s(parcel, 2, 4);
        parcel.writeInt(this.f14094a);
        d0.e(parcel, 3, this.f14095b);
        d0.r(parcel, q6);
    }
}
