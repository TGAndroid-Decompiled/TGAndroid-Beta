package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class k extends l {
    public static final Parcelable.Creator<k> CREATOR = new r0(17);
    public final r f4635a;
    public final String f4636b;
    public final int f4637c;

    public k(int i10, int i11, String str) {
        try {
            this.f4635a = r.a(i10);
            this.f4636b = str;
            this.f4637c = i11;
        } catch (q e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!n6.l.l(this.f4635a, kVar.f4635a) || !n6.l.l(this.f4636b, kVar.f4636b) || !n6.l.l(Integer.valueOf(this.f4637c), Integer.valueOf(kVar.f4637c))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4635a, this.f4636b, Integer.valueOf(this.f4637c)});
    }

    public final String toString() {
        m2.t tVar = new m2.t(getClass().getSimpleName(), 7);
        String valueOf = String.valueOf(this.f4635a.f4666a);
        m2.t tVar2 = new m2.t(6, false);
        ((m2.t) tVar.d).d = tVar2;
        tVar.d = tVar2;
        tVar2.f15818c = valueOf;
        tVar2.f15817b = "errorCode";
        String str = this.f4636b;
        if (str != null) {
            tVar.T(str, "errorMessage");
        }
        return tVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        int i11 = this.f4635a.f4666a;
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        w7.e0.l(parcel, 3, this.f4636b);
        w7.e0.s(parcel, 4, 4);
        parcel.writeInt(this.f4637c);
        w7.e0.r(parcel, q6);
    }
}
