package m6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class w extends y5.a {
    public static final Parcelable.Creator<w> CREATOR;
    public final a0 f17594a;
    public final x6.s0 f17595b;
    public final List f17596c;

    static {
        x6.o.r(2, x6.a.f48996c, x6.a.d);
        CREATOR = new h5.h(26);
    }

    public w(String str, byte[] bArr, ArrayList arrayList) {
        x6.s0 s0Var = x6.s0.f49057c;
        x6.s0 t10 = x6.s0.t(bArr.length, bArr);
        x5.l.h(str);
        try {
            this.f17594a = a0.a(str);
            this.f17595b = t10;
            this.f17596c = arrayList;
        } catch (z e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            List list = wVar.f17596c;
            if (this.f17594a.equals(wVar.f17594a) && x5.l.l(this.f17595b, wVar.f17595b)) {
                List list2 = this.f17596c;
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
        return Arrays.hashCode(new Object[]{this.f17594a, this.f17595b, this.f17596c});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f17594a);
        String c10 = e6.b.c(this.f17595b.u());
        return aa.d.r(j3.r0.q("PublicKeyCredentialDescriptor{\n type=", valueOf, ", \n id=", c10, ", \n transports="), String.valueOf(this.f17596c), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        this.f17594a.getClass();
        p8.l(parcel, 2, "public-key");
        p8.c(parcel, 3, this.f17595b.u());
        p8.p(parcel, 4, this.f17596c);
        p8.r(parcel, q10);
    }
}
