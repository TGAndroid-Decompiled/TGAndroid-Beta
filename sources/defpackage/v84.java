package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class v84 extends b4 {
    public static final Parcelable.Creator<v84> CREATOR = new xff((byte) 11);
    public final String a;

    public v84(String str) {
        fre.h(str);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v84)) {
            return false;
        }
        return this.a.equals(((v84) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return b00.j(new StringBuilder("FidoAppIdExtension{appid='"), this.a, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 2, this.a);
        jte.s(parcel, r);
    }
}
