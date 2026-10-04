package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class k extends l {
    public static final Parcelable.Creator<k> CREATOR = new r0(17);
    public final r f4441a;
    public final String f4442b;
    public final int f4443c;

    public k(int i10, int i11, String str) {
        try {
            this.f4441a = r.a(i10);
            this.f4442b = str;
            this.f4443c = i11;
        } catch (q e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!n6.l.l(this.f4441a, kVar.f4441a) || !n6.l.l(this.f4442b, kVar.f4442b) || !n6.l.l(Integer.valueOf(this.f4443c), Integer.valueOf(kVar.f4443c))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4441a, this.f4442b, Integer.valueOf(this.f4443c)});
    }

    public final String toString() {
        la.h hVar = new la.h(getClass().getSimpleName());
        String valueOf = String.valueOf(this.f4441a.f4472a);
        la.h hVar2 = new la.h(8, false);
        ((la.h) hVar.d).d = hVar2;
        hVar.d = hVar2;
        hVar2.f15398c = valueOf;
        hVar2.f15397b = "errorCode";
        String str = this.f4442b;
        if (str != null) {
            hVar.Z(str, "errorMessage");
        }
        return hVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        int i11 = this.f4441a.f4472a;
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        w7.g0.l(parcel, 3, this.f4442b);
        w7.g0.s(parcel, 4, 4);
        parcel.writeInt(this.f4443c);
        w7.g0.r(parcel, q6);
    }
}
