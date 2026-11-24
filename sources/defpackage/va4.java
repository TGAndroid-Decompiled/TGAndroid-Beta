package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class va4 extends b4 {
    public static final Parcelable.Creator<va4> CREATOR = new yhf((byte) 11);
    public final String a;

    public va4(String str) {
        ite.h(str);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof va4)) {
            return false;
        }
        return this.a.equals(((va4) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return b10.j(new StringBuilder("FidoAppIdExtension{appid='"), this.a, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 2, this.a);
        mve.s(parcel, r);
    }
}
