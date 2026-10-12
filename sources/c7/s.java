package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class s extends o6.a {
    public static final Parcelable.Creator<s> CREATOR = new r0(24);
    public final String f4523a;

    public s(String str) {
        n6.m.h(str);
        this.f4523a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        return this.f4523a.equals(((s) obj).f4523a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4523a});
    }

    public final String toString() {
        return a1.g.t(new StringBuilder("FidoAppIdExtension{appid='"), this.f4523a, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.l(parcel, 2, this.f4523a);
        w7.c0.r(parcel, q6);
    }
}
