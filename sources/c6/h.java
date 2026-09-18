package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new v(1);
    public final String f3996a;
    public final String f3997b;

    public h(String str, String str2) {
        this.f3996a = str;
        this.f3997b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (n6.l.l(this.f3996a, hVar.f3996a) && n6.l.l(this.f3997b, hVar.f3997b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3996a, this.f3997b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.l(parcel, 1, this.f3996a);
        w7.e0.l(parcel, 2, this.f3997b);
        w7.e0.r(parcel, q6);
    }
}
