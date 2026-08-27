package n6;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;

public final class s extends z5.a {
    public static final Parcelable.Creator<s> CREATOR = new w0(5);

    public final String f18407a;

    public s(String str) {
        y5.l.h(str);
        this.f18407a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.f18407a.equals(((s) obj).f18407a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18407a});
    }

    public final String toString() {
        return a9.p.p(new StringBuilder("FidoAppIdExtension{appid='"), this.f18407a, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 2, this.f18407a);
        r8.r(parcel, iQ);
    }
}
