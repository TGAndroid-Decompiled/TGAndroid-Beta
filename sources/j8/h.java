package j8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import java.util.Arrays;
import n6.l;
import w7.g0;
public class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new j(16);
    public final int f14057a;
    public final Float f14058b;

    public h(int i10, Float f7) {
        boolean z10 = true;
        if (i10 != 1 && (f7 == null || f7.floatValue() < 0.0f)) {
            z10 = false;
        }
        l.a("Invalid PatternItem: type=" + i10 + " length=" + f7, z10);
        this.f14057a = i10;
        this.f14058b = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f14057a == hVar.f14057a && l.l(this.f14058b, hVar.f14058b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f14057a), this.f14058b});
    }

    public String toString() {
        return "[PatternItem: type=" + this.f14057a + " length=" + this.f14058b + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 2, 4);
        parcel.writeInt(this.f14057a);
        g0.e(parcel, 3, this.f14058b);
        g0.r(parcel, q6);
    }
}
