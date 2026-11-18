package o8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
import q6.m;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new m6.e(13);
    public String f21742a;
    public String f21743b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (m.l(this.f21742a, aVar.f21742a) && m.l(this.f21743b, aVar.f21743b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f21742a, this.f21743b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 1, this.f21742a);
        bc.l(parcel, 2, this.f21743b);
        bc.s(parcel, r10);
    }
}
