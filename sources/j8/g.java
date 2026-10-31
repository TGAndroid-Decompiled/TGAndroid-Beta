package j8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n6.l;
import w7.h0;
public class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new g8.g(15);
    public final int f9726a;
    public final Float f9727b;

    public g(int i10, Float f7) {
        boolean z10 = true;
        if (i10 != 1 && (f7 == null || f7.floatValue() < 0.0f)) {
            z10 = false;
        }
        l.a("Invalid PatternItem: type=" + i10 + " length=" + f7, z10);
        this.f9726a = i10;
        this.f9727b = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f9726a == gVar.f9726a && l.k(this.f9727b, gVar.f9727b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9726a), this.f9727b});
    }

    public String toString() {
        return "[PatternItem: type=" + this.f9726a + " length=" + this.f9727b + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.s(parcel, 2, 4);
        parcel.writeInt(this.f9726a);
        h0.e(parcel, 3, this.f9727b);
        h0.r(parcel, q6);
    }
}
