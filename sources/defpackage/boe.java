package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
public final class boe extends b4 {
    public static final Parcelable.Creator<boe> CREATOR = new t0e((byte) 4);
    public final String a;
    public final int b;
    public final int c;

    public boe(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj != null && boe.class == obj.getClass()) {
            boe boeVar = (boe) obj;
            if (this.b == boeVar.b && this.c == boeVar.c && ((str2 = this.a) == (str = boeVar.a) || (str2 != null && str2.equals(str)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return b10.j(ts2.o("WebIconParcelable{", this.b, "x", this.c, " - "), this.a, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 1, this.a);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        mve.q(parcel, 3, 4);
        parcel.writeInt(this.c);
        mve.s(parcel, r);
    }
}
