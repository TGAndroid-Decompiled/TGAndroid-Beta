package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class f33 extends c4 {
    public static final Parcelable.Creator<f33> CREATOR = new ced((byte) 0);
    public final String a;
    public final String b;

    public f33(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f33)) {
            return false;
        }
        f33 f33Var = (f33) obj;
        if (vue.a(this.a, f33Var.a) && vue.a(this.b, f33Var.b)) {
            return true;
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
