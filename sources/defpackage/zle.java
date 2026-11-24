package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
public final class zle extends b4 {
    public static final Parcelable.Creator<zle> CREATOR = new qyd((byte) 4);
    public final String a;
    public final int b;
    public final int c;

    public zle(String str, int i, int i2) {
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
        if (obj != null && zle.class == obj.getClass()) {
            zle zleVar = (zle) obj;
            if (this.b == zleVar.b && this.c == zleVar.c && ((str2 = this.a) == (str = zleVar.a) || (str2 != null && str2.equals(str)))) {
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
        return b00.j(ir2.p("WebIconParcelable{", this.b, "x", this.c, " - "), this.a, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 1, this.a);
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        jte.q(parcel, 3, 4);
        parcel.writeInt(this.c);
        jte.s(parcel, r);
    }
}
