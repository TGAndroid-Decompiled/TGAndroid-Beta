package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class w extends o6.a {
    public static final Parcelable.Creator<w> CREATOR;
    public final a0 f4167a;
    public final n7.s0 f4168b;
    public final List f4169c;

    static {
        n7.o.r(2, n7.a.f15328c, n7.a.d);
        CREATOR = new w.a(26);
    }

    public w(String str, byte[] bArr, ArrayList arrayList) {
        n7.s0 s0Var = n7.s0.f15382c;
        n7.s0 t10 = n7.s0.t(bArr.length, bArr);
        n6.l.h(str);
        try {
            this.f4167a = a0.a(str);
            this.f4168b = t10;
            this.f4169c = arrayList;
        } catch (z e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            List list = wVar.f4169c;
            if (this.f4167a.equals(wVar.f4167a) && n6.l.l(this.f4168b, wVar.f4168b)) {
                List list2 = this.f4169c;
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
        return Arrays.hashCode(new Object[]{this.f4167a, this.f4168b, this.f4169c});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4167a);
        String c10 = u6.b.c(this.f4168b.u());
        return a4.a.s(a4.a.w("PublicKeyCredentialDescriptor{\n type=", valueOf, ", \n id=", c10, ", \n transports="), String.valueOf(this.f4169c), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        this.f4167a.getClass();
        w7.f0.l(parcel, 2, "public-key");
        w7.f0.c(parcel, 3, this.f4168b.u());
        w7.f0.p(parcel, 4, this.f4169c);
        w7.f0.r(parcel, q6);
    }
}
