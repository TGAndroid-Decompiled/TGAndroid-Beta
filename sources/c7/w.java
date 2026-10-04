package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class w extends o6.a {
    public static final Parcelable.Creator<w> CREATOR;
    public final a0 f4497a;
    public final n7.s0 f4498b;
    public final List f4499c;

    static {
        n7.o.r(2, n7.a.f16761c, n7.a.d);
        CREATOR = new w.a(26);
    }

    public w(String str, byte[] bArr, ArrayList arrayList) {
        n7.s0 s0Var = n7.s0.f16824c;
        n7.s0 t10 = n7.s0.t(bArr.length, bArr);
        n6.l.h(str);
        try {
            this.f4497a = a0.a(str);
            this.f4498b = t10;
            this.f4499c = arrayList;
        } catch (z e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            List list = wVar.f4499c;
            if (this.f4497a.equals(wVar.f4497a) && n6.l.l(this.f4498b, wVar.f4498b)) {
                List list2 = this.f4499c;
                if (list2 != null || list != null) {
                    if (list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2)) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4497a, this.f4498b, this.f4499c});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4497a);
        String c10 = u6.b.c(this.f4498b.u());
        return a4.a.s(a4.a.w("PublicKeyCredentialDescriptor{\n type=", valueOf, ", \n id=", c10, ", \n transports="), String.valueOf(this.f4499c), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        this.f4497a.getClass();
        w7.g0.l(parcel, 2, "public-key");
        w7.g0.c(parcel, 3, this.f4498b.u());
        w7.g0.p(parcel, 4, this.f4499c);
        w7.g0.r(parcel, q6);
    }
}
