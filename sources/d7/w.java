package d7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class w extends p6.a {
    public static final Parcelable.Creator<w> CREATOR;
    public final a0 f8250a;
    public final o7.s0 f8251b;
    public final List f8252c;

    static {
        o7.o.q(2, o7.a.f19198c, o7.a.d);
        CREATOR = new w.a(27);
    }

    public w(String str, byte[] bArr, ArrayList arrayList) {
        o7.s0 s0Var = o7.s0.f19252c;
        o7.s0 s10 = o7.s0.s(bArr.length, bArr);
        o6.l.h(str);
        try {
            this.f8250a = a0.a(str);
            this.f8251b = s10;
            this.f8252c = arrayList;
        } catch (z e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            List list = wVar.f8252c;
            if (this.f8250a.equals(wVar.f8250a) && o6.l.l(this.f8251b, wVar.f8251b)) {
                List list2 = this.f8252c;
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
        return Arrays.hashCode(new Object[]{this.f8250a, this.f8251b, this.f8252c});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f8250a);
        String c10 = v6.b.c(this.f8251b.t());
        return a1.g.s(a1.g.w("PublicKeyCredentialDescriptor{\n type=", valueOf, ", \n id=", c10, ", \n transports="), String.valueOf(this.f8252c), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        this.f8250a.getClass();
        df.l(parcel, 2, "public-key");
        df.c(parcel, 3, this.f8251b.t());
        df.p(parcel, 4, this.f8252c);
        df.r(parcel, q5);
    }
}
