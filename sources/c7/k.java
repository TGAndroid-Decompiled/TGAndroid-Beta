package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class k extends l {
    public static final Parcelable.Creator<k> CREATOR = new r0(17);
    public final r f4114a;
    public final String f4115b;
    public final int f4116c;

    public k(int i10, int i11, String str) {
        try {
            this.f4114a = r.a(i10);
            this.f4115b = str;
            this.f4116c = i11;
        } catch (q e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!n6.l.l(this.f4114a, kVar.f4114a) || !n6.l.l(this.f4115b, kVar.f4115b) || !n6.l.l(Integer.valueOf(this.f4116c), Integer.valueOf(kVar.f4116c))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4114a, this.f4115b, Integer.valueOf(this.f4116c)});
    }

    public final String toString() {
        lf.h hVar = new lf.h(getClass().getSimpleName());
        String valueOf = String.valueOf(this.f4114a.f4144a);
        lf.h hVar2 = new lf.h(7, false);
        ((lf.h) hVar.d).d = hVar2;
        hVar.d = hVar2;
        hVar2.f14216c = valueOf;
        hVar2.f14215b = "errorCode";
        String str = this.f4115b;
        if (str != null) {
            hVar.Z(str, "errorMessage");
        }
        return hVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        int i11 = this.f4114a.f4144a;
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        w7.f0.l(parcel, 3, this.f4115b);
        w7.f0.s(parcel, 4, 4);
        parcel.writeInt(this.f4116c);
        w7.f0.r(parcel, q6);
    }
}
