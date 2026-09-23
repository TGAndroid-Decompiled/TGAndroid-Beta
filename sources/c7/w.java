package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class w extends o6.a {
    public static final Parcelable.Creator<w> CREATOR;
    public final a0 f4158a;
    public final n7.t0 f4159b;
    public final List f4160c;

    static {
        n7.p.r(2, n7.a.f15080c, n7.a.d);
        CREATOR = new w.a(26);
    }

    public w(String str, byte[] bArr, ArrayList arrayList) {
        n7.t0 t0Var = n7.t0.f15141c;
        n7.t0 t10 = n7.t0.t(bArr.length, bArr);
        n6.l.h(str);
        try {
            this.f4158a = a0.a(str);
            this.f4159b = t10;
            this.f4160c = arrayList;
        } catch (z e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            List list = wVar.f4160c;
            if (this.f4158a.equals(wVar.f4158a) && n6.l.l(this.f4159b, wVar.f4159b)) {
                List list2 = this.f4160c;
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
        return Arrays.hashCode(new Object[]{this.f4158a, this.f4159b, this.f4160c});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4158a);
        String c10 = u6.b.c(this.f4159b.u());
        return a4.a.t(a4.a.x("PublicKeyCredentialDescriptor{\n type=", valueOf, ", \n id=", c10, ", \n transports="), String.valueOf(this.f4160c), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        this.f4158a.getClass();
        w7.e0.l(parcel, 2, "public-key");
        w7.e0.c(parcel, 3, this.f4159b.u());
        w7.e0.p(parcel, 4, this.f4160c);
        w7.e0.r(parcel, q6);
    }
}
