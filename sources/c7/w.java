package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class w extends o6.a {
    public static final Parcelable.Creator<w> CREATOR;
    public final a0 f4651a;
    public final n7.s0 f4652b;
    public final List f4653c;

    static {
        n7.o.q(2, n7.a.f16164c, n7.a.d);
        CREATOR = new w.a(26);
    }

    public w(String str, byte[] bArr, ArrayList arrayList) {
        n7.s0 s0Var = n7.s0.f16218c;
        n7.s0 s10 = n7.s0.s(bArr.length, bArr);
        n6.l.h(str);
        try {
            this.f4651a = a0.a(str);
            this.f4652b = s10;
            this.f4653c = arrayList;
        } catch (z e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            List list = wVar.f4653c;
            if (this.f4651a.equals(wVar.f4651a) && n6.l.l(this.f4652b, wVar.f4652b)) {
                List list2 = this.f4653c;
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
        return Arrays.hashCode(new Object[]{this.f4651a, this.f4652b, this.f4653c});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4651a);
        String c10 = u6.b.c(this.f4652b.t());
        return a1.g.s(a1.g.w("PublicKeyCredentialDescriptor{\n type=", valueOf, ", \n id=", c10, ", \n transports="), String.valueOf(this.f4653c), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        this.f4651a.getClass();
        w7.g0.l(parcel, 2, "public-key");
        w7.g0.c(parcel, 3, this.f4652b.t());
        w7.g0.p(parcel, 4, this.f4653c);
        w7.g0.r(parcel, q6);
    }
}
