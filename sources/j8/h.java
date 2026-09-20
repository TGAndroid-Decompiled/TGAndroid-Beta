package j8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import java.util.Arrays;
import n6.l;
import w7.f0;
public class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new j(16);
    public final int f12942a;
    public final Float f12943b;

    public h(int i10, Float f7) {
        boolean z10 = true;
        if (i10 != 1 && (f7 == null || f7.floatValue() < 0.0f)) {
            z10 = false;
        }
        l.a("Invalid PatternItem: type=" + i10 + " length=" + f7, z10);
        this.f12942a = i10;
        this.f12943b = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f12942a == hVar.f12942a && l.l(this.f12943b, hVar.f12943b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f12942a), this.f12943b});
    }

    public String toString() {
        return "[PatternItem: type=" + this.f12942a + " length=" + this.f12943b + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 2, 4);
        parcel.writeInt(this.f12942a);
        f0.e(parcel, 3, this.f12943b);
        f0.r(parcel, q6);
    }
}
