package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class k extends l {
    public static final Parcelable.Creator<k> CREATOR = new r0(17);
    public final r f4662a;
    public final String f4663b;
    public final int f4664c;

    public k(int i10, int i11, String str) {
        try {
            this.f4662a = r.a(i10);
            this.f4663b = str;
            this.f4664c = i11;
        } catch (q e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!n6.l.l(this.f4662a, kVar.f4662a) || !n6.l.l(this.f4663b, kVar.f4663b) || !n6.l.l(Integer.valueOf(this.f4664c), Integer.valueOf(kVar.f4664c))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4662a, this.f4663b, Integer.valueOf(this.f4664c)});
    }

    public final String toString() {
        m2.t tVar = new m2.t(getClass().getSimpleName(), 7);
        String valueOf = String.valueOf(this.f4662a.f4693a);
        m2.t tVar2 = new m2.t(6, false);
        ((m2.t) tVar.d).d = tVar2;
        tVar.d = tVar2;
        tVar2.f15845c = valueOf;
        tVar2.f15844b = "errorCode";
        String str = this.f4663b;
        if (str != null) {
            tVar.T(str, "errorMessage");
        }
        return tVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        int i11 = this.f4662a.f4693a;
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        w7.e0.l(parcel, 3, this.f4663b);
        w7.e0.s(parcel, 4, 4);
        parcel.writeInt(this.f4664c);
        w7.e0.r(parcel, q6);
    }
}
