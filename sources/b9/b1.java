package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.Arrays;
import java.util.Locale;
public final class b1 extends r6.a {
    public static final Parcelable.Creator<b1> CREATOR = new c(26);
    public final String f2974a;
    public final int f2975b;
    public final int f2976c;

    public b1(String str, int i7, int i10) {
        this.f2974a = str;
        this.f2975b = i7;
        this.f2976c = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj != null && b1.class == obj.getClass()) {
            b1 b1Var = (b1) obj;
            if (this.f2975b == b1Var.f2975b && this.f2976c == b1Var.f2976c && ((str2 = this.f2974a) == (str = b1Var.f2974a) || (str2 != null && str2.equals(str)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2974a, Integer.valueOf(this.f2975b), Integer.valueOf(this.f2976c)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return a8.p0.s(i5.c.n("WebIconParcelable{", this.f2975b, "x", this.f2976c, " - "), this.f2974a, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 1, this.f2974a);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f2975b);
        yb.q(parcel, 3, 4);
        parcel.writeInt(this.f2976c);
        yb.s(parcel, r10);
    }
}
