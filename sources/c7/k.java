package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class k extends l {
    public static final Parcelable.Creator<k> CREATOR = new r0(17);
    public final r f4442a;
    public final String f4443b;
    public final int f4444c;

    public k(int i10, int i11, String str) {
        try {
            this.f4442a = r.a(i10);
            this.f4443b = str;
            this.f4444c = i11;
        } catch (q e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!n6.l.l(this.f4442a, kVar.f4442a) || !n6.l.l(this.f4443b, kVar.f4443b) || !n6.l.l(Integer.valueOf(this.f4444c), Integer.valueOf(kVar.f4444c))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4442a, this.f4443b, Integer.valueOf(this.f4444c)});
    }

    public final String toString() {
        la.h hVar = new la.h(getClass().getSimpleName());
        String valueOf = String.valueOf(this.f4442a.f4473a);
        la.h hVar2 = new la.h(8, false);
        ((la.h) hVar.d).d = hVar2;
        hVar.d = hVar2;
        hVar2.f15400c = valueOf;
        hVar2.f15399b = "errorCode";
        String str = this.f4443b;
        if (str != null) {
            hVar.Z(str, "errorMessage");
        }
        return hVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        int i11 = this.f4442a.f4473a;
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        w7.g0.l(parcel, 3, this.f4443b);
        w7.g0.s(parcel, 4, 4);
        parcel.writeInt(this.f4444c);
        w7.g0.r(parcel, q6);
    }
}
