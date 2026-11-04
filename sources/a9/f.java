package a9;

import android.os.Parcel;
import android.os.Parcelable;
public final class f extends q6.a implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new c(2);
    public final String f193a;
    public final String f194b;
    public final String f195c;

    public f(String str, String str2, String str3) {
        p6.m.g(str);
        this.f193a = str;
        p6.m.g(str2);
        this.f194b = str2;
        p6.m.g(str3);
        this.f195c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f193a.equals(fVar.f193a) && p6.m.k(fVar.f194b, this.f194b) && p6.m.k(fVar.f195c, this.f195c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f193a.hashCode();
    }

    public final String toString() {
        String str = this.f193a;
        int i3 = 0;
        for (char c2 : str.toCharArray()) {
            i3 += c2;
        }
        String trim = str.trim();
        int length = trim.length();
        if (length > 25) {
            trim = trim.substring(0, 10) + "..." + trim.substring(length - 10, length) + "::" + i3;
        }
        return a1.g.s(com.google.android.recaptcha.internal.a.n("Channel{token=", trim, ", nodeId=", this.f194b, ", path="), this.f195c, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.f193a);
        j8.a.m(parcel, 3, this.f194b);
        j8.a.m(parcel, 4, this.f195c);
        j8.a.t(parcel, s6);
    }
}
