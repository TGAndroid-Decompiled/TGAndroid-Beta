package a9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
public final class a1 extends q6.a {
    public static final Parcelable.Creator<a1> CREATOR = new c(26);
    public final String f160a;
    public final int f161b;
    public final int f162c;

    public a1(String str, int i3, int i10) {
        this.f160a = str;
        this.f161b = i3;
        this.f162c = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            a1 a1Var = (a1) obj;
            if (this.f161b == a1Var.f161b && this.f162c == a1Var.f162c && ((str2 = this.f160a) == (str = a1Var.f160a) || (str2 != null && str2.equals(str)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f160a, Integer.valueOf(this.f161b), Integer.valueOf(this.f162c)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return a1.g.s(com.google.android.recaptcha.internal.a.m("WebIconParcelable{", this.f161b, "x", this.f162c, " - "), this.f160a, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 1, this.f160a);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f161b);
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(this.f162c);
        j8.a.t(parcel, s6);
    }
}
