package m6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
public final class k extends l {
    public static final Parcelable.Creator<k> CREATOR = new r0(17);
    public final r f17538a;
    public final String f17539b;
    public final int f17540c;

    public k(int i9, int i10, String str) {
        try {
            this.f17538a = r.a(i9);
            this.f17539b = str;
            this.f17540c = i10;
        } catch (q e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!x5.l.l(this.f17538a, kVar.f17538a) || !x5.l.l(this.f17539b, kVar.f17539b) || !x5.l.l(Integer.valueOf(this.f17540c), Integer.valueOf(kVar.f17540c))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17538a, this.f17539b, Integer.valueOf(this.f17540c)});
    }

    public final String toString() {
        t5.c cVar = new t5.c(getClass().getSimpleName(), 12);
        String valueOf = String.valueOf(this.f17538a.f17569a);
        t5.c cVar2 = new t5.c(11);
        ((t5.c) cVar.d).d = cVar2;
        cVar.d = cVar2;
        cVar2.f47682b = valueOf;
        cVar2.f47683c = "errorCode";
        String str = this.f17539b;
        if (str != null) {
            cVar.j(str, "errorMessage");
        }
        return cVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        int i10 = this.f17538a.f17569a;
        p8.s(parcel, 2, 4);
        parcel.writeInt(i10);
        p8.l(parcel, 3, this.f17539b);
        p8.s(parcel, 4, 4);
        parcel.writeInt(this.f17540c);
        p8.r(parcel, q10);
    }
}
