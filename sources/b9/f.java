package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.internal.vision.e2;
public final class f extends r6.a implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new c(2);
    public final String f2969a;
    public final String f2970b;
    public final String f2971c;

    public f(String str, String str2, String str3) {
        q6.m.h(str);
        this.f2969a = str;
        q6.m.h(str2);
        this.f2970b = str2;
        q6.m.h(str3);
        this.f2971c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f2969a.equals(fVar.f2969a) && q6.m.l(fVar.f2970b, this.f2970b) && q6.m.l(fVar.f2971c, this.f2971c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2969a.hashCode();
    }

    public final String toString() {
        String str = this.f2969a;
        int i7 = 0;
        for (char c10 : str.toCharArray()) {
            i7 += c10;
        }
        String trim = str.trim();
        int length = trim.length();
        if (length > 25) {
            trim = trim.substring(0, 10) + "..." + trim.substring(length - 10, length) + "::" + i7;
        }
        return a8.p0.s(e2.n("Channel{token=", trim, ", nodeId=", this.f2970b, ", path="), this.f2971c, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.f2969a);
        cc.l(parcel, 3, this.f2970b);
        cc.l(parcel, 4, this.f2971c);
        cc.s(parcel, r10);
    }
}
