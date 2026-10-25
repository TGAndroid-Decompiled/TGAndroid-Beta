package h6;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class c extends p6.a {
    public static final Parcelable.Creator<c> CREATOR = new f6.i(11);
    public final String f12624a;

    public c(String str) {
        this.f12624a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return a.d(this.f12624a, ((c) obj).f12624a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12624a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.f12624a);
        df.r(parcel, q5);
    }
}
