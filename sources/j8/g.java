package j8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n6.l;
import w7.h0;
public class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new g8.g(15);
    public final int f9727a;
    public final Float f9728b;

    public g(int i10, Float f7) {
        boolean z10 = true;
        if (i10 != 1 && (f7 == null || f7.floatValue() < 0.0f)) {
            z10 = false;
        }
        l.a("Invalid PatternItem: type=" + i10 + " length=" + f7, z10);
        this.f9727a = i10;
        this.f9728b = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f9727a == gVar.f9727a && l.k(this.f9728b, gVar.f9728b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9727a), this.f9728b});
    }

    public String toString() {
        return "[PatternItem: type=" + this.f9727a + " length=" + this.f9728b + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.s(parcel, 2, 4);
        parcel.writeInt(this.f9727a);
        h0.e(parcel, 3, this.f9728b);
        h0.r(parcel, q6);
    }
}
