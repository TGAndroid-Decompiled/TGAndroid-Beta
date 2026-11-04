package l8;

import android.os.Parcel;
import android.os.Parcelable;
import i7.p;
import java.util.Arrays;
import p6.m;
public class h extends q6.a {
    public static final Parcelable.Creator<h> CREATOR = new p(22);
    public final int f18122a;
    public final Float f18123b;

    public h(int i3, Float f10) {
        boolean z10 = true;
        if (i3 != 1 && (f10 == null || f10.floatValue() < 0.0f)) {
            z10 = false;
        }
        m.a("Invalid PatternItem: type=" + i3 + " length=" + f10, z10);
        this.f18122a = i3;
        this.f18123b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f18122a == hVar.f18122a && m.k(this.f18123b, hVar.f18123b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f18122a), this.f18123b});
    }

    public String toString() {
        return "[PatternItem: type=" + this.f18122a + " length=" + this.f18123b + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f18122a);
        j8.a.f(parcel, 3, this.f18123b);
        j8.a.t(parcel, s6);
    }
}
