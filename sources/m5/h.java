package m5;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
public final class h extends y5.a {
    public static final Parcelable.Creator<h> CREATOR = new v(1);
    public final String f17409a;
    public final String f17410b;

    public h(String str, String str2) {
        this.f17409a = str;
        this.f17410b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (x5.l.l(this.f17409a, hVar.f17409a) && x5.l.l(this.f17410b, hVar.f17410b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17409a, this.f17410b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 1, this.f17409a);
        p8.l(parcel, 2, this.f17410b);
        p8.r(parcel, q10);
    }
}
