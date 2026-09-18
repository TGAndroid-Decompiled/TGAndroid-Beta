package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class k extends l {
    public static final Parcelable.Creator<k> CREATOR = new r0(17);
    public final r f4113a;
    public final String f4114b;
    public final int f4115c;

    public k(int i10, int i11, String str) {
        try {
            this.f4113a = r.a(i10);
            this.f4114b = str;
            this.f4115c = i11;
        } catch (q e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!n6.l.l(this.f4113a, kVar.f4113a) || !n6.l.l(this.f4114b, kVar.f4114b) || !n6.l.l(Integer.valueOf(this.f4115c), Integer.valueOf(kVar.f4115c))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4113a, this.f4114b, Integer.valueOf(this.f4115c)});
    }

    public final String toString() {
        lf.i iVar = new lf.i(getClass().getSimpleName());
        String valueOf = String.valueOf(this.f4113a.f4143a);
        lf.i iVar2 = new lf.i(7, false);
        ((lf.i) iVar.d).d = iVar2;
        iVar.d = iVar2;
        iVar2.f14180c = valueOf;
        iVar2.f14179b = "errorCode";
        String str = this.f4114b;
        if (str != null) {
            iVar.Z(str, "errorMessage");
        }
        return iVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        int i11 = this.f4113a.f4143a;
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        w7.f0.l(parcel, 3, this.f4114b);
        w7.f0.s(parcel, 4, 4);
        parcel.writeInt(this.f4115c);
        w7.f0.r(parcel, q6);
    }
}
