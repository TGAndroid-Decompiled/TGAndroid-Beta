package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class k extends l {
    public static final Parcelable.Creator<k> CREATOR = new r0(17);
    public final r f4598a;
    public final String f4599b;
    public final int f4600c;

    public k(int i10, int i11, String str) {
        try {
            this.f4598a = r.a(i10);
            this.f4599b = str;
            this.f4600c = i11;
        } catch (q e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!n6.l.l(this.f4598a, kVar.f4598a) || !n6.l.l(this.f4599b, kVar.f4599b) || !n6.l.l(Integer.valueOf(this.f4600c), Integer.valueOf(kVar.f4600c))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4598a, this.f4599b, Integer.valueOf(this.f4600c)});
    }

    public final String toString() {
        li.k kVar = new li.k(getClass().getSimpleName());
        String valueOf = String.valueOf(this.f4598a.f4628a);
        li.k kVar2 = new li.k(8, false);
        ((li.k) kVar.d).d = kVar2;
        kVar.d = kVar2;
        kVar2.f14821c = valueOf;
        kVar2.f14820b = "errorCode";
        String str = this.f4599b;
        if (str != null) {
            kVar.Y(str, "errorMessage");
        }
        return kVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        int i11 = this.f4598a.f4628a;
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        w7.g0.l(parcel, 3, this.f4599b);
        w7.g0.s(parcel, 4, 4);
        parcel.writeInt(this.f4600c);
        w7.g0.r(parcel, q6);
    }
}
