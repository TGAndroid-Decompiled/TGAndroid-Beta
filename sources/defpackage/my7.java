package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public class my7 extends b4 {
    public static final Parcelable.Creator<my7> CREATOR = new rhe((byte) 7);
    public final int a;
    public final Float b;

    public my7(int i, Float f) {
        boolean z = true;
        if (i != 1 && (f == null || f.floatValue() < 0.0f)) {
            z = false;
        }
        fre.a("Invalid PatternItem: type=" + i + " length=" + f, z);
        this.a = i;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof my7)) {
            return false;
        }
        my7 my7Var = (my7) obj;
        if (this.a == my7Var.a && cqe.a(this.b, my7Var.b)) {
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
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        jte.e(parcel, 3, this.b);
        jte.s(parcel, r);
    }
}
