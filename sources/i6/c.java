package i6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.clearcut.d2;
import com.google.android.gms.internal.clearcut.x1;
import g8.j;
import java.util.Arrays;
import n6.l;
import w7.g0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new j(9);
    public final d2 f11978a;
    public byte[] f11979b;
    public final int[] f11980c;
    public final String[] d;
    public final int[] f11981e;
    public final byte[][] f11982f;
    public final k8.a[] h;
    public final boolean f11983n;
    public final x1 f11984r;

    public c(d2 d2Var, x1 x1Var) {
        this.f11978a = d2Var;
        this.f11984r = x1Var;
        this.f11980c = null;
        this.d = null;
        this.f11981e = null;
        this.f11982f = null;
        this.h = null;
        this.f11983n = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (l.l(this.f11978a, cVar.f11978a) && Arrays.equals(this.f11979b, cVar.f11979b) && Arrays.equals(this.f11980c, cVar.f11980c) && Arrays.equals(this.d, cVar.d) && l.l(this.f11984r, cVar.f11984r) && l.l(null, null) && l.l(null, null) && Arrays.equals(this.f11981e, cVar.f11981e) && Arrays.deepEquals(this.f11982f, cVar.f11982f) && Arrays.equals(this.h, cVar.h) && this.f11983n == cVar.f11983n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11978a, this.f11979b, this.f11980c, this.d, this.f11984r, null, null, this.f11981e, this.f11982f, this.h, Boolean.valueOf(this.f11983n)});
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("LogEventParcelable[");
        sb2.append(this.f11978a);
        sb2.append(", LogEventBytes: ");
        byte[] bArr = this.f11979b;
        if (bArr == null) {
            str = null;
        } else {
            str = new String(bArr);
        }
        sb2.append(str);
        sb2.append(", TestCodes: ");
        sb2.append(Arrays.toString(this.f11980c));
        sb2.append(", MendelPackages: ");
        sb2.append(Arrays.toString(this.d));
        sb2.append(", LogEvent: ");
        sb2.append(this.f11984r);
        sb2.append(", ExtensionProducer: null, VeProducer: null, ExperimentIDs: ");
        sb2.append(Arrays.toString(this.f11981e));
        sb2.append(", ExperimentTokens: ");
        sb2.append(Arrays.toString(this.f11982f));
        sb2.append(", ExperimentTokensParcelables: ");
        sb2.append(Arrays.toString(this.h));
        sb2.append(", AddPhenotypeExperimentTokens: ");
        sb2.append(this.f11983n);
        sb2.append("]");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.k(parcel, 2, this.f11978a, i10);
        g0.c(parcel, 3, this.f11979b);
        g0.g(parcel, 4, this.f11980c);
        g0.m(parcel, 5, this.d);
        g0.g(parcel, 6, this.f11981e);
        g0.d(parcel, 7, this.f11982f);
        g0.s(parcel, 8, 4);
        parcel.writeInt(this.f11983n ? 1 : 0);
        g0.o(parcel, 9, this.h, i10);
        g0.r(parcel, q6);
    }

    public c(d2 d2Var, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z10, k8.a[] aVarArr) {
        this.f11978a = d2Var;
        this.f11979b = bArr;
        this.f11980c = iArr;
        this.d = strArr;
        this.f11984r = null;
        this.f11981e = iArr2;
        this.f11982f = bArr2;
        this.h = aVarArr;
        this.f11983n = z10;
    }
}
