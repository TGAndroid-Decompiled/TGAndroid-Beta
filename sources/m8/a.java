package m8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import h8.j;
import java.util.Arrays;
import o6.l;
public final class a extends p6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(22);
    public String f18362a;
    public String f18363b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (l.l(this.f18362a, aVar.f18362a) && l.l(this.f18363b, aVar.f18363b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18362a, this.f18363b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 1, this.f18362a);
        df.l(parcel, 2, this.f18363b);
        df.r(parcel, q5);
    }
}
