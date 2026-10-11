package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new v(1);
    public final String f4362a;
    public final String f4363b;

    public h(String str, String str2) {
        this.f4362a = str;
        this.f4363b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (n6.m.l(this.f4362a, hVar.f4362a) && n6.m.l(this.f4363b, hVar.f4363b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4362a, this.f4363b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.l(parcel, 1, this.f4362a);
        w7.d0.l(parcel, 2, this.f4363b);
        w7.d0.r(parcel, q6);
    }
}
