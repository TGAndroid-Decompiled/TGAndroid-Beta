package o6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class z0 extends a6.a {
    public static final Parcelable.Creator<z0> CREATOR = new w0(4);

    public final boolean equals(Object obj) {
        if (!(obj instanceof z0)) {
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
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 1, 4);
        parcel.writeInt(0);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
