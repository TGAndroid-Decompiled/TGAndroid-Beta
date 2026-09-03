package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
import java.util.Locale;
public final class b1 extends c6.a {
    public static final Parcelable.Creator<b1> CREATOR = new c(26);
    public final String f13762a;
    public final int f13763b;
    public final int f13764c;

    public b1(String str, int i10, int i11) {
        this.f13762a = str;
        this.f13763b = i10;
        this.f13764c = i11;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj != null && b1.class == obj.getClass()) {
            b1 b1Var = (b1) obj;
            if (this.f13763b == b1Var.f13763b && this.f13764c == b1Var.f13764c && ((str2 = this.f13762a) == (str = b1Var.f13762a) || (str2 != null && str2.equals(str)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13762a, Integer.valueOf(this.f13763b), Integer.valueOf(this.f13764c)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return android.support.v4.media.a.r(e2.c.m("WebIconParcelable{", this.f13763b, "x", this.f13764c, " - "), this.f13762a, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 1, this.f13762a);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f13763b);
        f5.s(parcel, 3, 4);
        parcel.writeInt(this.f13764c);
        f5.r(parcel, q10);
    }
}
