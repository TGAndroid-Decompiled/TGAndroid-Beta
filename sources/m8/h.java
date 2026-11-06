package m8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
import q6.m;
public class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new m6.e(8);
    public final int f19951a;
    public final Float f19952b;

    public h(int i7, Float f10) {
        boolean z9 = true;
        if (i7 != 1 && (f10 == null || f10.floatValue() < 0.0f)) {
            z9 = false;
        }
        m.a("Invalid PatternItem: type=" + i7 + " length=" + f10, z9);
        this.f19951a = i7;
        this.f19952b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f19951a == hVar.f19951a && m.k(this.f19952b, hVar.f19952b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f19951a), this.f19952b});
    }

    public String toString() {
        return "[PatternItem: type=" + this.f19951a + " length=" + this.f19952b + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f19951a);
        xb.e(parcel, 3, this.f19952b);
        xb.s(parcel, r10);
    }
}
