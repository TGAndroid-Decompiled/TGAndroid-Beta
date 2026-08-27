package m5;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;

public final class h extends z5.a {
    public static final Parcelable.Creator<h> CREATOR = new w(1);

    public final String f17786a;

    public final String f17787b;

    public h(String str, String str2) {
        this.f17786a = str;
        this.f17787b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return y5.l.l(this.f17786a, hVar.f17786a) && y5.l.l(this.f17787b, hVar.f17787b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17786a, this.f17787b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 1, this.f17786a);
        r8.l(parcel, 2, this.f17787b);
        r8.r(parcel, iQ);
    }
}
