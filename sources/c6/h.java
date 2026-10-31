package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.h0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new v(1);
    public final String f3883a;
    public final String f3884b;

    public h(String str, String str2) {
        this.f3883a = str;
        this.f3884b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (n6.l.k(this.f3883a, hVar.f3883a) && n6.l.k(this.f3884b, hVar.f3884b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3883a, this.f3884b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 1, this.f3883a);
        h0.l(parcel, 2, this.f3884b);
        h0.r(parcel, q6);
    }
}
