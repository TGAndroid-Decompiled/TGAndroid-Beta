package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.Arrays;
public final class s extends r6.a {
    public static final Parcelable.Creator<s> CREATOR = new t0(13);
    public final String f11429a;

    public s(String str) {
        q6.m.g(str);
        this.f11429a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        return this.f11429a.equals(((s) obj).f11429a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11429a});
    }

    public final String toString() {
        return a8.p0.s(new StringBuilder("FidoAppIdExtension{appid='"), this.f11429a, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 2, this.f11429a);
        wb.s(parcel, r10);
    }
}
