package j8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import java.util.Arrays;
import n6.m;
import w7.c0;
public class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new j(16);
    public final int f14091a;
    public final Float f14092b;

    public h(int i10, Float f7) {
        boolean z10 = true;
        if (i10 != 1 && (f7 == null || f7.floatValue() < 0.0f)) {
            z10 = false;
        }
        m.a("Invalid PatternItem: type=" + i10 + " length=" + f7, z10);
        this.f14091a = i10;
        this.f14092b = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f14091a == hVar.f14091a && m.l(this.f14092b, hVar.f14092b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f14091a), this.f14092b});
    }

    public String toString() {
        return "[PatternItem: type=" + this.f14091a + " length=" + this.f14092b + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.s(parcel, 2, 4);
        parcel.writeInt(this.f14091a);
        c0.e(parcel, 3, this.f14092b);
        c0.r(parcel, q6);
    }
}
