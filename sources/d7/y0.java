package d7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class y0 extends p6.a {
    public static final Parcelable.Creator<y0> CREATOR = new r0(23);

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
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(0);
        df.r(parcel, q5);
    }
}
