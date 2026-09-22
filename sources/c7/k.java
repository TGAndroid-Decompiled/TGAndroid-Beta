package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class k extends l {
    public static final Parcelable.Creator<k> CREATOR = new r0(17);
    public final r f4110a;
    public final String f4111b;
    public final int f4112c;

    public k(int i10, int i11, String str) {
        try {
            this.f4110a = r.a(i10);
            this.f4111b = str;
            this.f4112c = i11;
        } catch (q e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!n6.l.l(this.f4110a, kVar.f4110a) || !n6.l.l(this.f4111b, kVar.f4111b) || !n6.l.l(Integer.valueOf(this.f4112c), Integer.valueOf(kVar.f4112c))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4110a, this.f4111b, Integer.valueOf(this.f4112c)});
    }

    public final String toString() {
        lf.i iVar = new lf.i(getClass().getSimpleName());
        String valueOf = String.valueOf(this.f4110a.f4140a);
        lf.i iVar2 = new lf.i(7, false);
        ((lf.i) iVar.d).d = iVar2;
        iVar.d = iVar2;
        iVar2.f14022c = valueOf;
        iVar2.f14021b = "errorCode";
        String str = this.f4111b;
        if (str != null) {
            iVar.Z(str, "errorMessage");
        }
        return iVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        int i11 = this.f4110a.f4140a;
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        w7.e0.l(parcel, 3, this.f4111b);
        w7.e0.s(parcel, 4, 4);
        parcel.writeInt(this.f4112c);
        w7.e0.r(parcel, q6);
    }
}
