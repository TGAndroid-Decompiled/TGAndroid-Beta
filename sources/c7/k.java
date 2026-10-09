package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class k extends l {
    public static final Parcelable.Creator<k> CREATOR = new r0(17);
    public final r f4492a;
    public final String f4493b;
    public final int f4494c;

    public k(int i10, int i11, String str) {
        try {
            this.f4492a = r.a(i10);
            this.f4493b = str;
            this.f4494c = i11;
        } catch (q e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!n6.l.l(this.f4492a, kVar.f4492a) || !n6.l.l(this.f4493b, kVar.f4493b) || !n6.l.l(Integer.valueOf(this.f4494c), Integer.valueOf(kVar.f4494c))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4492a, this.f4493b, Integer.valueOf(this.f4494c)});
    }

    public final String toString() {
        la.h hVar = new la.h(getClass().getSimpleName());
        String valueOf = String.valueOf(this.f4492a.f4523a);
        la.h hVar2 = new la.h(8, false);
        ((la.h) hVar.d).d = hVar2;
        hVar.d = hVar2;
        hVar2.f15463c = valueOf;
        hVar2.f15462b = "errorCode";
        String str = this.f4493b;
        if (str != null) {
            hVar.a0(str, "errorMessage");
        }
        return hVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        int i11 = this.f4492a.f4523a;
        w7.d0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        w7.d0.l(parcel, 3, this.f4493b);
        w7.d0.s(parcel, 4, 4);
        parcel.writeInt(this.f4494c);
        w7.d0.r(parcel, q6);
    }
}
