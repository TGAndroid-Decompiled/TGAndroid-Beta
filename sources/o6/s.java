package o6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class s extends a6.a {
    public static final Parcelable.Creator<s> CREATOR = new w0(6);
    public final String f19431a;

    public s(String str) {
        z5.l.h(str);
        this.f19431a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        return this.f19431a.equals(((s) obj).f19431a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19431a});
    }

    public final String toString() {
        return a4.w.q(new StringBuilder("FidoAppIdExtension{appid='"), this.f19431a, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.l(parcel, 2, this.f19431a);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
