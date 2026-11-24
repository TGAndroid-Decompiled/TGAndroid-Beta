package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class t7c extends b4 {
    public static final Parcelable.Creator<t7c> CREATOR = new j9d((byte) 20);
    public final boolean a;

    public t7c(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t7c) || this.a != ((t7c) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        jte.s(parcel, r);
    }
}
