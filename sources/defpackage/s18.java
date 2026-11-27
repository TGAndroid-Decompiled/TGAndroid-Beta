package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public class s18 extends c4 {
    public static final Parcelable.Creator<s18> CREATOR = new ime((byte) 7);
    public final int a;
    public final Float b;

    public s18(int i, Float f) {
        boolean z = true;
        if (i != 1 && (f == null || f.floatValue() < 0.0f)) {
            z = false;
        }
        xve.a("Invalid PatternItem: type=" + i + " length=" + f, z);
        this.a = i;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s18)) {
            return false;
        }
        s18 s18Var = (s18) obj;
        if (this.a == s18Var.a && vue.a(this.b, s18Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
    }

    public String toString() {
        return "[PatternItem: type=" + this.a + " length=" + this.b + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        bye.e(parcel, 3, this.b);
        bye.s(parcel, r);
    }
}
