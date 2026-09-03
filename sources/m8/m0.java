package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import org.telegram.ui.ai;
public final class m0 extends c6.a implements l8.h {
    public static final Parcelable.Creator<m0> CREATOR = new c(29);
    public final String f13814a;
    public final String f13815b;
    public final int f13816c;
    public final boolean d;

    public m0(int i10, String str, String str2, boolean z4) {
        this.f13814a = str;
        this.f13815b = str2;
        this.f13816c = i10;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m0)) {
            return false;
        }
        return ((m0) obj).f13814a.equals(this.f13814a);
    }

    public final int hashCode() {
        return this.f13814a.hashCode();
    }

    public final String toString() {
        StringBuilder l10 = ai.l("Node{", this.f13815b, ", id=", this.f13814a, ", hops=");
        l10.append(this.f13816c);
        l10.append(", isNearby=");
        l10.append(this.d);
        l10.append("}");
        return l10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.f13814a);
        f5.l(parcel, 3, this.f13815b);
        f5.s(parcel, 4, 4);
        parcel.writeInt(this.f13816c);
        f5.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        f5.r(parcel, q10);
    }
}
