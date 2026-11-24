package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class hff extends b4 {
    public static final Parcelable.Creator<hff> CREATOR = new xff((byte) 4);

    public final boolean equals(Object obj) {
        if (!(obj instanceof hff)) {
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
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 1, 4);
        parcel.writeInt(0);
        jte.s(parcel, r);
    }
}
