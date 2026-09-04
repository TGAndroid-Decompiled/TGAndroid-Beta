package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class y0 extends o6.a {
    public static final Parcelable.Creator<y0> CREATOR = new r0(22);

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
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 1, 4);
        parcel.writeInt(0);
        w7.e0.r(parcel, q6);
    }
}
