package n6;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;

public final class k extends l {
    public static final Parcelable.Creator<k> CREATOR = new o0(28);

    public final r f18374a;

    public final String f18375b;

    public final int f18376c;

    public k(int i10, int i11, String str) {
        try {
            this.f18374a = r.a(i10);
            this.f18375b = str;
            this.f18376c = i11;
        } catch (q e9) {
            throw new IllegalArgumentException(e9);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return y5.l.l(this.f18374a, kVar.f18374a) && y5.l.l(this.f18375b, kVar.f18375b) && y5.l.l(Integer.valueOf(this.f18376c), Integer.valueOf(kVar.f18376c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18374a, this.f18375b, Integer.valueOf(this.f18376c)});
    }

    public final String toString() {
        u2.b bVar = new u2.b(getClass().getSimpleName(), 12);
        String strValueOf = String.valueOf(this.f18374a.f18404a);
        y6.c cVar = new y6.c(11);
        ((u2.b) bVar.d).d = cVar;
        bVar.d = cVar;
        cVar.f48263c = strValueOf;
        cVar.f48262b = "errorCode";
        String str = this.f18375b;
        if (str != null) {
            bVar.j(str, "errorMessage");
        }
        return bVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        int i11 = this.f18374a.f18404a;
        r8.s(parcel, 2, 4);
        parcel.writeInt(i11);
        r8.l(parcel, 3, this.f18375b);
        r8.s(parcel, 4, 4);
        parcel.writeInt(this.f18376c);
        r8.r(parcel, iQ);
    }
}
