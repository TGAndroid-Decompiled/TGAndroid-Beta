package l6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.internal.clearcut.b2;
import com.google.android.gms.internal.clearcut.v1;
import java.util.Arrays;
import q6.m;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new j7.b(27);
    public final b2 f19717a;
    public byte[] f19718b;
    public final int[] f19719c;
    public final String[] d;
    public final int[] f19720e;
    public final byte[][] f19721f;
    public final n8.a[] h;
    public final boolean f19722n;
    public final v1 f19723r;

    public c(b2 b2Var, v1 v1Var) {
        this.f19717a = b2Var;
        this.f19723r = v1Var;
        this.f19719c = null;
        this.d = null;
        this.f19720e = null;
        this.f19721f = null;
        this.h = null;
        this.f19722n = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (m.l(this.f19717a, cVar.f19717a) && Arrays.equals(this.f19718b, cVar.f19718b) && Arrays.equals(this.f19719c, cVar.f19719c) && Arrays.equals(this.d, cVar.d) && m.l(this.f19723r, cVar.f19723r) && m.l(null, null) && m.l(null, null) && Arrays.equals(this.f19720e, cVar.f19720e) && Arrays.deepEquals(this.f19721f, cVar.f19721f) && Arrays.equals(this.h, cVar.h) && this.f19722n == cVar.f19722n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19717a, this.f19718b, this.f19719c, this.d, this.f19723r, null, null, this.f19720e, this.f19721f, this.h, Boolean.valueOf(this.f19722n)});
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("LogEventParcelable[");
        sb2.append(this.f19717a);
        sb2.append(", LogEventBytes: ");
        byte[] bArr = this.f19718b;
        if (bArr == null) {
            str = null;
        } else {
            str = new String(bArr);
        }
        sb2.append(str);
        sb2.append(", TestCodes: ");
        sb2.append(Arrays.toString(this.f19719c));
        sb2.append(", MendelPackages: ");
        sb2.append(Arrays.toString(this.d));
        sb2.append(", LogEvent: ");
        sb2.append(this.f19723r);
        sb2.append(", ExtensionProducer: null, VeProducer: null, ExperimentIDs: ");
        sb2.append(Arrays.toString(this.f19720e));
        sb2.append(", ExperimentTokens: ");
        sb2.append(Arrays.toString(this.f19721f));
        sb2.append(", ExperimentTokensParcelables: ");
        sb2.append(Arrays.toString(this.h));
        sb2.append(", AddPhenotypeExperimentTokens: ");
        sb2.append(this.f19722n);
        sb2.append("]");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 2, this.f19717a, i7);
        bc.c(parcel, 3, this.f19718b);
        bc.g(parcel, 4, this.f19719c);
        bc.m(parcel, 5, this.d);
        bc.g(parcel, 6, this.f19720e);
        bc.d(parcel, 7, this.f19721f);
        bc.q(parcel, 8, 4);
        parcel.writeInt(this.f19722n ? 1 : 0);
        bc.o(parcel, 9, this.h, i7);
        bc.s(parcel, r10);
    }

    public c(b2 b2Var, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z10, n8.a[] aVarArr) {
        this.f19717a = b2Var;
        this.f19718b = bArr;
        this.f19719c = iArr;
        this.d = strArr;
        this.f19723r = null;
        this.f19720e = iArr2;
        this.f19721f = bArr2;
        this.h = aVarArr;
        this.f19722n = z10;
    }
}
