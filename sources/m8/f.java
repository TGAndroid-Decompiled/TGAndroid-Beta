package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import org.telegram.ui.yh;
public final class f extends c6.a implements l8.b, l8.d {
    public static final Parcelable.Creator<f> CREATOR = new c(2);
    public final String f13519a;
    public final String f13520b;
    public final String f13521c;

    public f(String str, String str2, String str3) {
        b6.m.h(str);
        this.f13519a = str;
        b6.m.h(str2);
        this.f13520b = str2;
        b6.m.h(str3);
        this.f13521c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f13519a.equals(fVar.f13519a) && b6.m.l(fVar.f13520b, this.f13520b) && b6.m.l(fVar.f13521c, this.f13521c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13519a.hashCode();
    }

    public final String toString() {
        String str = this.f13519a;
        int i10 = 0;
        for (char c3 : str.toCharArray()) {
            i10 += c3;
        }
        String trim = str.trim();
        int length = trim.length();
        if (length > 25) {
            trim = trim.substring(0, 10) + "..." + trim.substring(length - 10, length) + "::" + i10;
        }
        return android.support.v4.media.a.r(yh.m("Channel{token=", trim, ", nodeId=", this.f13520b, ", path="), this.f13521c, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.f13519a);
        g5.l(parcel, 3, this.f13520b);
        g5.l(parcel, 4, this.f13521c);
        g5.r(parcel, q10);
    }
}
