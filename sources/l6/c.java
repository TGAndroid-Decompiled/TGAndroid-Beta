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
    public final b2 f19686a;
    public byte[] f19687b;
    public final int[] f19688c;
    public final String[] d;
    public final int[] f19689e;
    public final byte[][] f19690f;
    public final n8.a[] h;
    public final boolean f19691n;
    public final v1 f19692r;

    public c(b2 b2Var, v1 v1Var) {
        this.f19686a = b2Var;
        this.f19692r = v1Var;
        this.f19688c = null;
        this.d = null;
        this.f19689e = null;
        this.f19690f = null;
        this.h = null;
        this.f19691n = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (m.l(this.f19686a, cVar.f19686a) && Arrays.equals(this.f19687b, cVar.f19687b) && Arrays.equals(this.f19688c, cVar.f19688c) && Arrays.equals(this.d, cVar.d) && m.l(this.f19692r, cVar.f19692r) && m.l(null, null) && m.l(null, null) && Arrays.equals(this.f19689e, cVar.f19689e) && Arrays.deepEquals(this.f19690f, cVar.f19690f) && Arrays.equals(this.h, cVar.h) && this.f19691n == cVar.f19691n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19686a, this.f19687b, this.f19688c, this.d, this.f19692r, null, null, this.f19689e, this.f19690f, this.h, Boolean.valueOf(this.f19691n)});
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("LogEventParcelable[");
        sb2.append(this.f19686a);
        sb2.append(", LogEventBytes: ");
        byte[] bArr = this.f19687b;
        if (bArr == null) {
            str = null;
        } else {
            str = new String(bArr);
        }
        sb2.append(str);
        sb2.append(", TestCodes: ");
        sb2.append(Arrays.toString(this.f19688c));
        sb2.append(", MendelPackages: ");
        sb2.append(Arrays.toString(this.d));
        sb2.append(", LogEvent: ");
        sb2.append(this.f19692r);
        sb2.append(", ExtensionProducer: null, VeProducer: null, ExperimentIDs: ");
        sb2.append(Arrays.toString(this.f19689e));
        sb2.append(", ExperimentTokens: ");
        sb2.append(Arrays.toString(this.f19690f));
        sb2.append(", ExperimentTokensParcelables: ");
        sb2.append(Arrays.toString(this.h));
        sb2.append(", AddPhenotypeExperimentTokens: ");
        sb2.append(this.f19691n);
        sb2.append("]");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 2, this.f19686a, i7);
        bc.c(parcel, 3, this.f19687b);
        bc.g(parcel, 4, this.f19688c);
        bc.m(parcel, 5, this.d);
        bc.g(parcel, 6, this.f19689e);
        bc.d(parcel, 7, this.f19690f);
        bc.q(parcel, 8, 4);
        parcel.writeInt(this.f19691n ? 1 : 0);
        bc.o(parcel, 9, this.h, i7);
        bc.s(parcel, r10);
    }

    public c(b2 b2Var, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z10, n8.a[] aVarArr) {
        this.f19686a = b2Var;
        this.f19687b = bArr;
        this.f19688c = iArr;
        this.d = strArr;
        this.f19692r = null;
        this.f19689e = iArr2;
        this.f19690f = bArr2;
        this.h = aVarArr;
        this.f19691n = z10;
    }
}
