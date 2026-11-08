package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class w extends r6.a {
    public static final Parcelable.Creator<w> CREATOR;
    public final a0 f11453a;
    public final q7.s0 f11454b;
    public final List f11455c;

    static {
        q7.o.m(2, q7.a.f53960c, q7.a.d);
        CREATOR = new db.k(15);
    }

    public w(String str, byte[] bArr, ArrayList arrayList) {
        q7.s0 s0Var = q7.s0.f54021c;
        q7.s0 o4 = q7.s0.o(bArr.length, bArr);
        q6.m.g(str);
        try {
            this.f11453a = a0.a(str);
            this.f11454b = o4;
            this.f11455c = arrayList;
        } catch (z e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            List list = wVar.f11455c;
            if (this.f11453a.equals(wVar.f11453a) && q6.m.k(this.f11454b, wVar.f11454b)) {
                List list2 = this.f11455c;
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
        return Arrays.hashCode(new Object[]{this.f11453a, this.f11454b, this.f11455c});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11453a);
        String c10 = x6.b.c(this.f11454b.p());
        return a8.p0.s(com.google.android.recaptcha.internal.a.n("PublicKeyCredentialDescriptor{\n type=", valueOf, ", \n id=", c10, ", \n transports="), String.valueOf(this.f11455c), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        this.f11453a.getClass();
        xb.l(parcel, 2, "public-key");
        xb.c(parcel, 3, this.f11454b.p());
        xb.p(parcel, 4, this.f11455c);
        xb.s(parcel, r10);
    }
}
