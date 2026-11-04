package e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class k extends l {
    public static final Parcelable.Creator<k> CREATOR = new r0(21);
    public final r f9839a;
    public final String f9840b;
    public final int f9841c;

    public k(int i3, int i10, String str) {
        try {
            this.f9839a = r.a(i3);
            this.f9840b = str;
            this.f9841c = i10;
        } catch (q e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!p6.m.k(this.f9839a, kVar.f9839a) || !p6.m.k(this.f9840b, kVar.f9840b) || !p6.m.k(Integer.valueOf(this.f9841c), Integer.valueOf(kVar.f9841c))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9839a, this.f9840b, Integer.valueOf(this.f9841c)});
    }

    public final String toString() {
        p7.d dVar = new p7.d(getClass().getSimpleName(), 1);
        String valueOf = String.valueOf(this.f9839a.f9870a);
        p7.d dVar2 = new p7.d(0, false);
        ((p7.d) dVar.d).f53346c = dVar2;
        dVar.d = dVar2;
        dVar2.d = valueOf;
        dVar2.f53345b = "errorCode";
        String str = this.f9840b;
        if (str != null) {
            dVar.I(str, "errorMessage");
        }
        return dVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        int i10 = this.f9839a.f9870a;
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(i10);
        j8.a.m(parcel, 3, this.f9840b);
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(this.f9841c);
        j8.a.t(parcel, s6);
    }
}
