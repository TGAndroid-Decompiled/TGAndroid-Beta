package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
public final class wx8 extends c4 {
    public static final Parcelable.Creator<wx8> CREATOR;
    public final ay8 a;
    public final gfe b;
    public final ArrayList c;

    static {
        dnd.y(2, ojd.a, ojd.b);
        CREATOR = new m9d((byte) 27);
    }

    public wx8(String str, byte[] bArr, ArrayList arrayList) {
        gfe gfeVar = gfe.c;
        gfe o = gfe.o(bArr.length, bArr);
        xve.h(str);
        try {
            this.a = ay8.a(str);
            this.b = o;
            this.c = arrayList;
        } catch (zx8 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wx8) {
            wx8 wx8Var = (wx8) obj;
            ArrayList arrayList = wx8Var.c;
            if (this.a.equals(wx8Var.a) && vue.a(this.b, wx8Var.b)) {
                ArrayList arrayList2 = this.c;
                if (arrayList2 == null) {
                    if (arrayList == null) {
                        return true;
                    }
                    return false;
                } else if (arrayList != null && arrayList2.containsAll(arrayList) && arrayList.containsAll(arrayList2)) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String b = lsd.b(this.b.p());
        return c00.k(xnb.l("PublicKeyCredentialDescriptor{\n type=", valueOf, ", \n id=", b, ", \n transports="), String.valueOf(this.c), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        this.a.getClass();
        bye.l(parcel, 2, "public-key");
        bye.c(parcel, 3, this.b.p());
        bye.p(parcel, 4, this.c);
        bye.s(parcel, r);
    }
}
