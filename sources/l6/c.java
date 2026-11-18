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
    public final b2 f19689a;
    public byte[] f19690b;
    public final int[] f19691c;
    public final String[] d;
    public final int[] f19692e;
    public final byte[][] f19693f;
    public final n8.a[] h;
    public final boolean f19694n;
    public final v1 f19695r;

    public c(b2 b2Var, v1 v1Var) {
        this.f19689a = b2Var;
        this.f19695r = v1Var;
        this.f19691c = null;
        this.d = null;
        this.f19692e = null;
        this.f19693f = null;
        this.h = null;
        this.f19694n = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (m.l(this.f19689a, cVar.f19689a) && Arrays.equals(this.f19690b, cVar.f19690b) && Arrays.equals(this.f19691c, cVar.f19691c) && Arrays.equals(this.d, cVar.d) && m.l(this.f19695r, cVar.f19695r) && m.l(null, null) && m.l(null, null) && Arrays.equals(this.f19692e, cVar.f19692e) && Arrays.deepEquals(this.f19693f, cVar.f19693f) && Arrays.equals(this.h, cVar.h) && this.f19694n == cVar.f19694n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19689a, this.f19690b, this.f19691c, this.d, this.f19695r, null, null, this.f19692e, this.f19693f, this.h, Boolean.valueOf(this.f19694n)});
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("LogEventParcelable[");
        sb2.append(this.f19689a);
        sb2.append(", LogEventBytes: ");
        byte[] bArr = this.f19690b;
        if (bArr == null) {
            str = null;
        } else {
            str = new String(bArr);
        }
        sb2.append(str);
        sb2.append(", TestCodes: ");
        sb2.append(Arrays.toString(this.f19691c));
        sb2.append(", MendelPackages: ");
        sb2.append(Arrays.toString(this.d));
        sb2.append(", LogEvent: ");
        sb2.append(this.f19695r);
        sb2.append(", ExtensionProducer: null, VeProducer: null, ExperimentIDs: ");
        sb2.append(Arrays.toString(this.f19692e));
        sb2.append(", ExperimentTokens: ");
        sb2.append(Arrays.toString(this.f19693f));
        sb2.append(", ExperimentTokensParcelables: ");
        sb2.append(Arrays.toString(this.h));
        sb2.append(", AddPhenotypeExperimentTokens: ");
        sb2.append(this.f19694n);
        sb2.append("]");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 2, this.f19689a, i7);
        bc.c(parcel, 3, this.f19690b);
        bc.g(parcel, 4, this.f19691c);
        bc.m(parcel, 5, this.d);
        bc.g(parcel, 6, this.f19692e);
        bc.d(parcel, 7, this.f19693f);
        bc.q(parcel, 8, 4);
        parcel.writeInt(this.f19694n ? 1 : 0);
        bc.o(parcel, 9, this.h, i7);
        bc.s(parcel, r10);
    }

    public c(b2 b2Var, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z10, n8.a[] aVarArr) {
        this.f19689a = b2Var;
        this.f19690b = bArr;
        this.f19691c = iArr;
        this.d = strArr;
        this.f19695r = null;
        this.f19692e = iArr2;
        this.f19693f = bArr2;
        this.h = aVarArr;
        this.f19694n = z10;
    }
}
