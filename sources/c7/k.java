package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class k extends l {
    public static final Parcelable.Creator<k> CREATOR = new r0(17);
    public final r f4491a;
    public final String f4492b;
    public final int f4493c;

    public k(int i10, int i11, String str) {
        try {
            this.f4491a = r.a(i10);
            this.f4492b = str;
            this.f4493c = i11;
        } catch (q e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!n6.m.l(this.f4491a, kVar.f4491a) || !n6.m.l(this.f4492b, kVar.f4492b) || !n6.m.l(Integer.valueOf(this.f4493c), Integer.valueOf(kVar.f4493c))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4491a, this.f4492b, Integer.valueOf(this.f4493c)});
    }

    public final String toString() {
        la.h hVar = new la.h(getClass().getSimpleName());
        String valueOf = String.valueOf(this.f4491a.f4522a);
        la.h hVar2 = new la.h(8, false);
        ((la.h) hVar.d).d = hVar2;
        hVar.d = hVar2;
        hVar2.f15502c = valueOf;
        hVar2.f15501b = "errorCode";
        String str = this.f4492b;
        if (str != null) {
            hVar.a0(str, "errorMessage");
        }
        return hVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        int i11 = this.f4491a.f4522a;
        w7.d0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        w7.d0.l(parcel, 3, this.f4492b);
        w7.d0.s(parcel, 4, 4);
        parcel.writeInt(this.f4493c);
        w7.d0.r(parcel, q6);
    }
}
