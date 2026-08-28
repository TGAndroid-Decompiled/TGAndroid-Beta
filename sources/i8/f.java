package i8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class f extends y5.a implements h8.b, h8.d {
    public static final Parcelable.Creator<f> CREATOR = new c(2);
    public final String f10979a;
    public final String f10980b;
    public final String f10981c;

    public f(String str, String str2, String str3) {
        x5.l.h(str);
        this.f10979a = str;
        x5.l.h(str2);
        this.f10980b = str2;
        x5.l.h(str3);
        this.f10981c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f10979a.equals(fVar.f10979a) && x5.l.l(fVar.f10980b, this.f10980b) && x5.l.l(fVar.f10981c, this.f10981c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10979a.hashCode();
    }

    public final String toString() {
        String str = this.f10979a;
        int i9 = 0;
        for (char c10 : str.toCharArray()) {
            i9 += c10;
        }
        String trim = str.trim();
        int length = trim.length();
        if (length > 25) {
            trim = trim.substring(0, 10) + "..." + trim.substring(length - 10, length) + "::" + i9;
        }
        return aa.d.r(j3.r0.q("Channel{token=", trim, ", nodeId=", this.f10980b, ", path="), this.f10981c, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.f10979a);
        p8.l(parcel, 3, this.f10980b);
        p8.l(parcel, 4, this.f10981c);
        p8.r(parcel, q10);
    }
}
