package o6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class k extends l {
    public static final Parcelable.Creator<k> CREATOR = new n0(29);
    public final r f19398a;
    public final String f19399b;
    public final int f19400c;

    public k(int i10, int i11, String str) {
        try {
            this.f19398a = r.a(i10);
            this.f19399b = str;
            this.f19400c = i11;
        } catch (q e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!z5.l.l(this.f19398a, kVar.f19398a) || !z5.l.l(this.f19399b, kVar.f19399b) || !z5.l.l(Integer.valueOf(this.f19400c), Integer.valueOf(kVar.f19400c))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19398a, this.f19399b, Integer.valueOf(this.f19400c)});
    }

    public final String toString() {
        v5.c cVar = new v5.c(getClass().getSimpleName(), 11);
        String valueOf = String.valueOf(this.f19398a.f19428a);
        v5.c cVar2 = new v5.c(10);
        ((v5.c) cVar.d).d = cVar2;
        cVar.d = cVar2;
        cVar2.f49409b = valueOf;
        cVar2.f49410c = "errorCode";
        String str = this.f19399b;
        if (str != null) {
            cVar.j(str, "errorMessage");
        }
        return cVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        int i11 = this.f19398a.f19428a;
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(i11);
        com.google.android.gms.internal.cast.o.l(parcel, 3, this.f19399b);
        com.google.android.gms.internal.cast.o.s(parcel, 4, 4);
        parcel.writeInt(this.f19400c);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
