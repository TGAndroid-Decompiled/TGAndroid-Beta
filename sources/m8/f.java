package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import org.telegram.ui.ai;
public final class f extends c6.a implements l8.b, l8.d {
    public static final Parcelable.Creator<f> CREATOR = new c(2);
    public final String f13789a;
    public final String f13790b;
    public final String f13791c;

    public f(String str, String str2, String str3) {
        b6.m.h(str);
        this.f13789a = str;
        b6.m.h(str2);
        this.f13790b = str2;
        b6.m.h(str3);
        this.f13791c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f13789a.equals(fVar.f13789a) && b6.m.l(fVar.f13790b, this.f13790b) && b6.m.l(fVar.f13791c, this.f13791c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13789a.hashCode();
    }

    public final String toString() {
        String str = this.f13789a;
        int i10 = 0;
        for (char c3 : str.toCharArray()) {
            i10 += c3;
        }
        String trim = str.trim();
        int length = trim.length();
        if (length > 25) {
            trim = trim.substring(0, 10) + "..." + trim.substring(length - 10, length) + "::" + i10;
        }
        return android.support.v4.media.a.r(ai.l("Channel{token=", trim, ", nodeId=", this.f13790b, ", path="), this.f13791c, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.f13789a);
        f5.l(parcel, 3, this.f13790b);
        f5.l(parcel, 4, this.f13791c);
        f5.r(parcel, q10);
    }
}
