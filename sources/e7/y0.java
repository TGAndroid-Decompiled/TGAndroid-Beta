package e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class y0 extends q6.a {
    public static final Parcelable.Creator<y0> CREATOR = new r0(26);

    public final boolean equals(Object obj) {
        if (!(obj instanceof y0)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.FALSE});
    }

    public final String toString() {
        return "DevicePublicKeyExtension{devicePublicKey=false}";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(0);
        j8.a.t(parcel, s6);
    }
}
