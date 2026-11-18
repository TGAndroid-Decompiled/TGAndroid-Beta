package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
import java.util.Locale;
public final class b1 extends r6.a {
    public static final Parcelable.Creator<b1> CREATOR = new c(26);
    public final String f2971a;
    public final int f2972b;
    public final int f2973c;

    public b1(String str, int i7, int i10) {
        this.f2971a = str;
        this.f2972b = i7;
        this.f2973c = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj != null && b1.class == obj.getClass()) {
            b1 b1Var = (b1) obj;
            if (this.f2972b == b1Var.f2972b && this.f2973c == b1Var.f2973c && ((str2 = this.f2971a) == (str = b1Var.f2971a) || (str2 != null && str2.equals(str)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2971a, Integer.valueOf(this.f2972b), Integer.valueOf(this.f2973c)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return a8.p0.s(i5.c.n("WebIconParcelable{", this.f2972b, "x", this.f2973c, " - "), this.f2971a, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 1, this.f2971a);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f2972b);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f2973c);
        bc.s(parcel, r10);
    }
}
