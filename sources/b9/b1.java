package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
import java.util.Locale;
public final class b1 extends r6.a {
    public static final Parcelable.Creator<b1> CREATOR = new c(26);
    public final String f2942a;
    public final int f2943b;
    public final int f2944c;

    public b1(String str, int i7, int i10) {
        this.f2942a = str;
        this.f2943b = i7;
        this.f2944c = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj != null && b1.class == obj.getClass()) {
            b1 b1Var = (b1) obj;
            if (this.f2943b == b1Var.f2943b && this.f2944c == b1Var.f2944c && ((str2 = this.f2942a) == (str = b1Var.f2942a) || (str2 != null && str2.equals(str)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2942a, Integer.valueOf(this.f2943b), Integer.valueOf(this.f2944c)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return a8.p0.s(i5.c.n("WebIconParcelable{", this.f2943b, "x", this.f2944c, " - "), this.f2942a, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 1, this.f2942a);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f2943b);
        cc.q(parcel, 3, 4);
        parcel.writeInt(this.f2944c);
        cc.s(parcel, r10);
    }
}
