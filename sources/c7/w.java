package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class w extends o6.a {
    public static final Parcelable.Creator<w> CREATOR;
    public final a0 f5027a;
    public final n7.s0 f5028b;
    public final List f5029c;

    static {
        n7.o.q(2, n7.a.f17318c, n7.a.d);
        CREATOR = new w.a(26);
    }

    public w(String str, byte[] bArr, ArrayList arrayList) {
        n7.s0 s0Var = n7.s0.f17372c;
        n7.s0 s10 = n7.s0.s(bArr.length, bArr);
        n6.l.h(str);
        try {
            this.f5027a = a0.a(str);
            this.f5028b = s10;
            this.f5029c = arrayList;
        } catch (z e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            List list = wVar.f5029c;
            if (this.f5027a.equals(wVar.f5027a) && n6.l.l(this.f5028b, wVar.f5028b)) {
                List list2 = this.f5029c;
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
        return Arrays.hashCode(new Object[]{this.f5027a, this.f5028b, this.f5029c});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f5027a);
        String c10 = u6.b.c(this.f5028b.t());
        return a1.g.s(a1.g.w("PublicKeyCredentialDescriptor{\n type=", valueOf, ", \n id=", c10, ", \n transports="), String.valueOf(this.f5029c), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        this.f5027a.getClass();
        w7.f0.l(parcel, 2, "public-key");
        w7.f0.c(parcel, 3, this.f5028b.t());
        w7.f0.p(parcel, 4, this.f5029c);
        w7.f0.r(parcel, q6);
    }
}
