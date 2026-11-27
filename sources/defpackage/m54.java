package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class m54 extends c4 {
    public static final Parcelable.Creator<m54> CREATOR = new ced((byte) 12);
    public String a;
    public String b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m54) {
            m54 m54Var = (m54) obj;
            if (vue.a(this.a, m54Var.a) && vue.a(this.b, m54Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 1, this.a);
        bye.l(parcel, 2, this.b);
        bye.s(parcel, r);
    }
}
