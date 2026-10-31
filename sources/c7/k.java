package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class k extends l {
    public static final Parcelable.Creator<k> CREATOR = new r0(17);
    public final r f4002a;
    public final String f4003b;
    public final int f4004c;

    public k(int i10, int i11, String str) {
        try {
            this.f4002a = r.a(i10);
            this.f4003b = str;
            this.f4004c = i11;
        } catch (q e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!n6.l.k(this.f4002a, kVar.f4002a) || !n6.l.k(this.f4003b, kVar.f4003b) || !n6.l.k(Integer.valueOf(this.f4004c), Integer.valueOf(kVar.f4004c))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4002a, this.f4003b, Integer.valueOf(this.f4004c)});
    }

    public final String toString() {
        li.k kVar = new li.k(getClass().getSimpleName());
        String valueOf = String.valueOf(this.f4002a.f4032a);
        li.k kVar2 = new li.k(9, false);
        ((li.k) kVar.d).d = kVar2;
        kVar.d = kVar2;
        kVar2.f12101c = valueOf;
        kVar2.f12100b = "errorCode";
        String str = this.f4003b;
        if (str != null) {
            kVar.M(str, "errorMessage");
        }
        return kVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        int i11 = this.f4002a.f4032a;
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        w7.h0.l(parcel, 3, this.f4003b);
        w7.h0.s(parcel, 4, 4);
        parcel.writeInt(this.f4004c);
        w7.h0.r(parcel, q6);
    }
}
