package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class xjf extends c4 {
    public static final Parcelable.Creator<xjf> CREATOR = new nkf((byte) 4);

    public final boolean equals(Object obj) {
        if (!(obj instanceof xjf)) {
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
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 1, 4);
        parcel.writeInt(0);
        bye.s(parcel, r);
    }
}
