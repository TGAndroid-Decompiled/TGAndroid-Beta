package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class w extends o6.a {
    public static final Parcelable.Creator<w> CREATOR;
    public final a0 f4580a;
    public final n7.t0 f4581b;
    public final List f4582c;

    static {
        n7.p.r(2, n7.a.f13935c, n7.a.d);
        CREATOR = new w.a(26);
    }

    public w(String str, byte[] bArr, ArrayList arrayList) {
        n7.t0 t0Var = n7.t0.f13996c;
        n7.t0 t10 = n7.t0.t(bArr.length, bArr);
        n6.l.h(str);
        try {
            this.f4580a = a0.a(str);
            this.f4581b = t10;
            this.f4582c = arrayList;
        } catch (z e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            List list = wVar.f4582c;
            if (this.f4580a.equals(wVar.f4580a) && n6.l.l(this.f4581b, wVar.f4581b)) {
                List list2 = this.f4582c;
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
        return Arrays.hashCode(new Object[]{this.f4580a, this.f4581b, this.f4582c});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4580a);
        String c10 = u6.b.c(this.f4581b.u());
        return a4.a.s(a4.a.w("PublicKeyCredentialDescriptor{\n type=", valueOf, ", \n id=", c10, ", \n transports="), String.valueOf(this.f4582c), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        this.f4580a.getClass();
        w7.e0.l(parcel, 2, "public-key");
        w7.e0.c(parcel, 3, this.f4581b.u());
        w7.e0.p(parcel, 4, this.f4582c);
        w7.e0.r(parcel, q6);
    }
}
