package m8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
import q6.m;
public class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new m6.e(8);
    public final int f20943a;
    public final Float f20944b;

    public h(int i7, Float f10) {
        boolean z10 = true;
        if (i7 != 1 && (f10 == null || f10.floatValue() < 0.0f)) {
            z10 = false;
        }
        m.a("Invalid PatternItem: type=" + i7 + " length=" + f10, z10);
        this.f20943a = i7;
        this.f20944b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f20943a == hVar.f20943a && m.l(this.f20944b, hVar.f20944b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f20943a), this.f20944b});
    }

    public String toString() {
        return "[PatternItem: type=" + this.f20943a + " length=" + this.f20944b + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f20943a);
        bc.e(parcel, 3, this.f20944b);
        bc.s(parcel, r10);
    }
}
