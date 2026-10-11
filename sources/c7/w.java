package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class w extends o6.a {
    public static final Parcelable.Creator<w> CREATOR;
    public final a0 f4547a;
    public final n7.s0 f4548b;
    public final List f4549c;

    static {
        n7.o.r(2, n7.a.f16783c, n7.a.d);
        CREATOR = new w.a(26);
    }

    public w(String str, byte[] bArr, ArrayList arrayList) {
        n7.s0 s0Var = n7.s0.f16846c;
        n7.s0 t10 = n7.s0.t(bArr.length, bArr);
        n6.m.h(str);
        try {
            this.f4547a = a0.a(str);
            this.f4548b = t10;
            this.f4549c = arrayList;
        } catch (z e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            List list = wVar.f4549c;
            if (this.f4547a.equals(wVar.f4547a) && n6.m.l(this.f4548b, wVar.f4548b)) {
                List list2 = this.f4549c;
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
        return Arrays.hashCode(new Object[]{this.f4547a, this.f4548b, this.f4549c});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4547a);
        String c10 = u6.b.c(this.f4548b.u());
        return a1.g.t(a1.g.x("PublicKeyCredentialDescriptor{\n type=", valueOf, ", \n id=", c10, ", \n transports="), String.valueOf(this.f4549c), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        this.f4547a.getClass();
        w7.d0.l(parcel, 2, "public-key");
        w7.d0.c(parcel, 3, this.f4548b.u());
        w7.d0.p(parcel, 4, this.f4549c);
        w7.d0.r(parcel, q6);
    }
}
