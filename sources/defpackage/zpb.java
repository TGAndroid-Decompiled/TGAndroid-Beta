package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class zpb extends b4 {
    public static final Parcelable.Creator<zpb> CREATOR = new j9d((byte) 9);
    public final xpb a;
    public final String b;

    static {
        new zpb("supported", null);
        new zpb("not-supported", null);
    }

    public zpb(String str, String str2) {
        fre.h(str);
        try {
            this.a = xpb.a(str);
            this.b = str2;
        } catch (ypb e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zpb)) {
            return false;
        }
        zpb zpbVar = (zpb) obj;
        if (!vze.a(this.a, zpbVar.a) || !vze.a(this.b, zpbVar.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 2, this.a.a);
        jte.l(parcel, 3, this.b);
        jte.s(parcel, r);
    }
}
