package m8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
import q6.m;
public class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new m6.e(8);
    public final int f21005a;
    public final Float f21006b;

    public h(int i7, Float f10) {
        boolean z10 = true;
        if (i7 != 1 && (f10 == null || f10.floatValue() < 0.0f)) {
            z10 = false;
        }
        m.a("Invalid PatternItem: type=" + i7 + " length=" + f10, z10);
        this.f21005a = i7;
        this.f21006b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f21005a == hVar.f21005a && m.l(this.f21006b, hVar.f21006b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f21005a), this.f21006b});
    }

    public String toString() {
        return "[PatternItem: type=" + this.f21005a + " length=" + this.f21006b + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f21005a);
        cc.e(parcel, 3, this.f21006b);
        cc.s(parcel, r10);
    }
}
