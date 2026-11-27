package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class fjd extends c4 implements Parcelable {
    public static final Parcelable.Creator<fjd> CREATOR = new ced((byte) 25);
    public final String a;
    public final String b;
    public final String c;

    public fjd(String str, String str2, String str3) {
        xve.h(str);
        this.a = str;
        xve.h(str2);
        this.b = str2;
        xve.h(str3);
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fjd)) {
            return false;
        }
        fjd fjdVar = (fjd) obj;
        if (this.a.equals(fjdVar.a) && vue.a(fjdVar.b, this.b) && vue.a(fjdVar.c, this.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str = this.a;
        int i = 0;
        for (char c : str.toCharArray()) {
            i += c;
        }
        String trim = str.trim();
        int length = trim.length();
        if (length > 25) {
            trim = trim.substring(0, 10) + "..." + trim.substring(length - 10, length) + "::" + i;
        }
        return c00.k(xnb.l("Channel{token=", trim, ", nodeId=", this.b, ", path="), this.c, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 2, this.a);
        bye.l(parcel, 3, this.b);
        bye.l(parcel, 4, this.c);
        bye.s(parcel, r);
    }
}
