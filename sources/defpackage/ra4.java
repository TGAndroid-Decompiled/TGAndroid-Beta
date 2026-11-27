package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class ra4 extends c4 {
    public static final Parcelable.Creator<ra4> CREATOR = new nkf((byte) 11);
    public final String a;

    public ra4(String str) {
        xve.h(str);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ra4)) {
            return false;
        }
        return this.a.equals(((ra4) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return c00.k(new StringBuilder("FidoAppIdExtension{appid='"), this.a, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 2, this.a);
        bye.s(parcel, r);
    }
}
