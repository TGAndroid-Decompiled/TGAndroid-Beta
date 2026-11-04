package e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class o0 extends q6.a {
    public static final Parcelable.Creator<o0> CREATOR = new w.a(25);
    public final String f9852a;

    public o0(String str) {
        p6.m.g(str);
        this.f9852a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o0)) {
            return false;
        }
        return this.f9852a.equals(((o0) obj).f9852a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9852a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 1, this.f9852a);
        j8.a.t(parcel, s6);
    }
}
