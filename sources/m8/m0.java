package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import org.telegram.ui.yh;
public final class m0 extends c6.a implements l8.h {
    public static final Parcelable.Creator<m0> CREATOR = new c(29);
    public final String f13546a;
    public final String f13547b;
    public final int f13548c;
    public final boolean d;

    public m0(int i10, String str, String str2, boolean z4) {
        this.f13546a = str;
        this.f13547b = str2;
        this.f13548c = i10;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m0)) {
            return false;
        }
        return ((m0) obj).f13546a.equals(this.f13546a);
    }

    public final int hashCode() {
        return this.f13546a.hashCode();
    }

    public final String toString() {
        StringBuilder m9 = yh.m("Node{", this.f13547b, ", id=", this.f13546a, ", hops=");
        m9.append(this.f13548c);
        m9.append(", isNearby=");
        m9.append(this.d);
        m9.append("}");
        return m9.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.f13546a);
        g5.l(parcel, 3, this.f13547b);
        g5.s(parcel, 4, 4);
        parcel.writeInt(this.f13548c);
        g5.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        g5.r(parcel, q10);
    }
}
