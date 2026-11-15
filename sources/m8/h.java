package m8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.Arrays;
import q6.m;
public class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new m6.e(8);
    public final int f20551a;
    public final Float f20552b;

    public h(int i7, Float f10) {
        boolean z10 = true;
        if (i7 != 1 && (f10 == null || f10.floatValue() < 0.0f)) {
            z10 = false;
        }
        m.a("Invalid PatternItem: type=" + i7 + " length=" + f10, z10);
        this.f20551a = i7;
        this.f20552b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f20551a == hVar.f20551a && m.k(this.f20552b, hVar.f20552b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f20551a), this.f20552b});
    }

    public String toString() {
        return "[PatternItem: type=" + this.f20551a + " length=" + this.f20552b + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f20551a);
        yb.e(parcel, 3, this.f20552b);
        yb.s(parcel, r10);
    }
}
