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
    public final b2 f19714a;
    public byte[] f19715b;
    public final int[] f19716c;
    public final String[] d;
    public final int[] f19717e;
    public final byte[][] f19718f;
    public final n8.a[] h;
    public final boolean f19719n;
    public final v1 f19720r;

    public c(b2 b2Var, v1 v1Var) {
        this.f19714a = b2Var;
        this.f19720r = v1Var;
        this.f19716c = null;
        this.d = null;
        this.f19717e = null;
        this.f19718f = null;
        this.h = null;
        this.f19719n = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (m.l(this.f19714a, cVar.f19714a) && Arrays.equals(this.f19715b, cVar.f19715b) && Arrays.equals(this.f19716c, cVar.f19716c) && Arrays.equals(this.d, cVar.d) && m.l(this.f19720r, cVar.f19720r) && m.l(null, null) && m.l(null, null) && Arrays.equals(this.f19717e, cVar.f19717e) && Arrays.deepEquals(this.f19718f, cVar.f19718f) && Arrays.equals(this.h, cVar.h) && this.f19719n == cVar.f19719n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19714a, this.f19715b, this.f19716c, this.d, this.f19720r, null, null, this.f19717e, this.f19718f, this.h, Boolean.valueOf(this.f19719n)});
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("LogEventParcelable[");
        sb2.append(this.f19714a);
        sb2.append(", LogEventBytes: ");
        byte[] bArr = this.f19715b;
        if (bArr == null) {
            str = null;
        } else {
            str = new String(bArr);
        }
        sb2.append(str);
        sb2.append(", TestCodes: ");
        sb2.append(Arrays.toString(this.f19716c));
        sb2.append(", MendelPackages: ");
        sb2.append(Arrays.toString(this.d));
        sb2.append(", LogEvent: ");
        sb2.append(this.f19720r);
        sb2.append(", ExtensionProducer: null, VeProducer: null, ExperimentIDs: ");
        sb2.append(Arrays.toString(this.f19717e));
        sb2.append(", ExperimentTokens: ");
        sb2.append(Arrays.toString(this.f19718f));
        sb2.append(", ExperimentTokensParcelables: ");
        sb2.append(Arrays.toString(this.h));
        sb2.append(", AddPhenotypeExperimentTokens: ");
        sb2.append(this.f19719n);
        sb2.append("]");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 2, this.f19714a, i7);
        bc.c(parcel, 3, this.f19715b);
        bc.g(parcel, 4, this.f19716c);
        bc.m(parcel, 5, this.d);
        bc.g(parcel, 6, this.f19717e);
        bc.d(parcel, 7, this.f19718f);
        bc.q(parcel, 8, 4);
        parcel.writeInt(this.f19719n ? 1 : 0);
        bc.o(parcel, 9, this.h, i7);
        bc.s(parcel, r10);
    }

    public c(b2 b2Var, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z10, n8.a[] aVarArr) {
        this.f19714a = b2Var;
        this.f19715b = bArr;
        this.f19716c = iArr;
        this.d = strArr;
        this.f19720r = null;
        this.f19717e = iArr2;
        this.f19718f = bArr2;
        this.h = aVarArr;
        this.f19719n = z10;
    }
}
