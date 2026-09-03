package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
import java.util.Locale;
public final class b1 extends c6.a {
    public static final Parcelable.Creator<b1> CREATOR = new c(26);
    public final String f13492a;
    public final int f13493b;
    public final int f13494c;

    public b1(String str, int i10, int i11) {
        this.f13492a = str;
        this.f13493b = i10;
        this.f13494c = i11;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj != null && b1.class == obj.getClass()) {
            b1 b1Var = (b1) obj;
            if (this.f13493b == b1Var.f13493b && this.f13494c == b1Var.f13494c && ((str2 = this.f13492a) == (str = b1Var.f13492a) || (str2 != null && str2.equals(str)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13492a, Integer.valueOf(this.f13493b), Integer.valueOf(this.f13494c)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return android.support.v4.media.a.r(e2.c.m("WebIconParcelable{", this.f13493b, "x", this.f13494c, " - "), this.f13492a, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 1, this.f13492a);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f13493b);
        g5.s(parcel, 3, 4);
        parcel.writeInt(this.f13494c);
        g5.r(parcel, q10);
    }
}
