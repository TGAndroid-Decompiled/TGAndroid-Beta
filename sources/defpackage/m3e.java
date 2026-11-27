package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class m3e extends c4 {
    public static final Parcelable.Creator<m3e> CREATOR = new g3e((byte) 12);
    public final gfe a;
    public final gfe b;

    public m3e(gfe gfeVar, gfe gfeVar2) {
        this.a = gfeVar;
        this.b = gfeVar2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m3e) {
            m3e m3eVar = (m3e) obj;
            if (vue.a(this.a, m3eVar.a) && vue.a(this.b, m3eVar.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] p;
        int r = bye.r(parcel, 20293);
        byte[] bArr = null;
        gfe gfeVar = this.a;
        if (gfeVar == null) {
            p = null;
        } else {
            p = gfeVar.p();
        }
        bye.c(parcel, 1, p);
        gfe gfeVar2 = this.b;
        if (gfeVar2 != null) {
            bArr = gfeVar2.p();
        }
        bye.c(parcel, 2, bArr);
        bye.s(parcel, r);
    }
}
