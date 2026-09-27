package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class k extends l {
    public static final Parcelable.Creator<k> CREATOR = new r0(17);
    public final r f4107a;
    public final String f4108b;
    public final int f4109c;

    public k(int i10, int i11, String str) {
        try {
            this.f4107a = r.a(i10);
            this.f4108b = str;
            this.f4109c = i11;
        } catch (q e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!n6.l.l(this.f4107a, kVar.f4107a) || !n6.l.l(this.f4108b, kVar.f4108b) || !n6.l.l(Integer.valueOf(this.f4109c), Integer.valueOf(kVar.f4109c))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4107a, this.f4108b, Integer.valueOf(this.f4109c)});
    }

    public final String toString() {
        la.h hVar = new la.h(getClass().getSimpleName());
        String valueOf = String.valueOf(this.f4107a.f4137a);
        la.h hVar2 = new la.h(8, false);
        ((la.h) hVar.d).d = hVar2;
        hVar.d = hVar2;
        hVar2.f14169c = valueOf;
        hVar2.f14168b = "errorCode";
        String str = this.f4108b;
        if (str != null) {
            hVar.Z(str, "errorMessage");
        }
        return hVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        int i11 = this.f4107a.f4137a;
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        w7.f0.l(parcel, 3, this.f4108b);
        w7.f0.s(parcel, 4, 4);
        parcel.writeInt(this.f4109c);
        w7.f0.r(parcel, q6);
    }
}
