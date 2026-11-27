package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class afd extends c4 {
    public static final Parcelable.Creator<afd> CREATOR = new ced((byte) 7);
    public final String a;

    public afd(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof afd)) {
            return false;
        }
        return vue.a(this.a, ((afd) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 1, this.a);
        bye.s(parcel, r);
    }
}
