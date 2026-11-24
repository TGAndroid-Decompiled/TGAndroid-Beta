package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class asb extends b4 {
    public static final Parcelable.Creator<asb> CREATOR = new lbd((byte) 9);
    public final yrb a;
    public final String b;

    static {
        new asb("supported", null);
        new asb("not-supported", null);
    }

    public asb(String str, String str2) {
        ite.h(str);
        try {
            this.a = yrb.a(str);
            this.b = str2;
        } catch (zrb e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof asb)) {
            return false;
        }
        asb asbVar = (asb) obj;
        if (!x1f.a(this.a, asbVar.a) || !x1f.a(this.b, asbVar.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 2, this.a.a);
        mve.l(parcel, 3, this.b);
        mve.s(parcel, r);
    }
}
