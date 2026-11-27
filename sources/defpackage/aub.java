package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class aub extends c4 {
    public static final Parcelable.Creator<aub> CREATOR = new ced((byte) 9);
    public final ytb a;
    public final String b;

    static {
        new aub("supported", null);
        new aub("not-supported", null);
    }

    public aub(String str, String str2) {
        xve.h(str);
        try {
            this.a = ytb.a(str);
            this.b = str2;
        } catch (ztb e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aub)) {
            return false;
        }
        aub aubVar = (aub) obj;
        if (!y4f.a(this.a, aubVar.a) || !y4f.a(this.b, aubVar.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 2, this.a.a);
        bye.l(parcel, 3, this.b);
        bye.s(parcel, r);
    }
}
