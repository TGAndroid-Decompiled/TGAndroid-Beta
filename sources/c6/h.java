package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new v(1);
    public final String f4361a;
    public final String f4362b;

    public h(String str, String str2) {
        this.f4361a = str;
        this.f4362b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (n6.m.l(this.f4361a, hVar.f4361a) && n6.m.l(this.f4362b, hVar.f4362b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4361a, this.f4362b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.l(parcel, 1, this.f4361a);
        w7.c0.l(parcel, 2, this.f4362b);
        w7.c0.r(parcel, q6);
    }
}
