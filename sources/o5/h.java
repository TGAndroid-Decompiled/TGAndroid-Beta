package o5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class h extends a6.a {
    public static final Parcelable.Creator<h> CREATOR = new v(1);
    public final String f19268a;
    public final String f19269b;

    public h(String str, String str2) {
        this.f19268a = str;
        this.f19269b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (z5.l.l(this.f19268a, hVar.f19268a) && z5.l.l(this.f19269b, hVar.f19269b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19268a, this.f19269b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.l(parcel, 1, this.f19268a);
        com.google.android.gms.internal.cast.o.l(parcel, 2, this.f19269b);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
