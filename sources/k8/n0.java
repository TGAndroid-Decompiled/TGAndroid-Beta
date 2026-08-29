package k8;

import android.os.Parcel;
import android.os.Parcelable;
import org.telegram.ui.th;
public final class n0 extends a6.a implements j8.h {
    public static final Parcelable.Creator<n0> CREATOR = new c(29);
    public final String f13535a;
    public final String f13536b;
    public final int f13537c;
    public final boolean d;

    public n0(int i10, String str, String str2, boolean z10) {
        this.f13535a = str;
        this.f13536b = str2;
        this.f13537c = i10;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n0)) {
            return false;
        }
        return ((n0) obj).f13535a.equals(this.f13535a);
    }

    public final int hashCode() {
        return this.f13535a.hashCode();
    }

    public final String toString() {
        StringBuilder k9 = th.k("Node{", this.f13536b, ", id=", this.f13535a, ", hops=");
        k9.append(this.f13537c);
        k9.append(", isNearby=");
        k9.append(this.d);
        k9.append("}");
        return k9.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.l(parcel, 2, this.f13535a);
        com.google.android.gms.internal.cast.o.l(parcel, 3, this.f13536b);
        com.google.android.gms.internal.cast.o.s(parcel, 4, 4);
        parcel.writeInt(this.f13537c);
        com.google.android.gms.internal.cast.o.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
