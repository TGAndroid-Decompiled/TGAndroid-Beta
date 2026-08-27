package n6;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class w extends z5.a {
    public static final Parcelable.Creator<w> CREATOR;

    public final a0 f18430a;

    public final y6.s0 f18431b;

    public final List f18432c;

    static {
        y6.o.r(2, y6.a.f49713c, y6.a.d);
        CREATOR = new o0(7);
    }

    public w(String str, byte[] bArr, ArrayList arrayList) {
        y6.s0 s0Var = y6.s0.f49774c;
        y6.s0 s0VarT = y6.s0.t(bArr.length, bArr);
        y5.l.h(str);
        try {
            this.f18430a = a0.a(str);
            this.f18431b = s0VarT;
            this.f18432c = arrayList;
        } catch (z e9) {
            throw new IllegalArgumentException(e9);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        List list = wVar.f18432c;
        if (!this.f18430a.equals(wVar.f18430a) || !y5.l.l(this.f18431b, wVar.f18431b)) {
            return false;
        }
        List list2 = this.f18432c;
        if (list2 == null && list == null) {
            return true;
        }
        return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18430a, this.f18431b, this.f18432c});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f18430a);
        String strC = f6.b.c(this.f18431b.u());
        return a9.p.p(i0.a.p("PublicKeyCredentialDescriptor{\n type=", strValueOf, ", \n id=", strC, ", \n transports="), String.valueOf(this.f18432c), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        this.f18430a.getClass();
        r8.l(parcel, 2, "public-key");
        r8.c(parcel, 3, this.f18431b.u());
        r8.p(parcel, 4, this.f18432c);
        r8.r(parcel, iQ);
    }
}
