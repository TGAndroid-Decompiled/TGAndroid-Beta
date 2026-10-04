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
    public final d2 f11977a;
    public byte[] f11978b;
    public final int[] f11979c;
    public final String[] d;
    public final int[] f11980e;
    public final byte[][] f11981f;
    public final k8.a[] h;
    public final boolean f11982n;
    public final x1 f11983r;

    public c(d2 d2Var, x1 x1Var) {
        this.f11977a = d2Var;
        this.f11983r = x1Var;
        this.f11979c = null;
        this.d = null;
        this.f11980e = null;
        this.f11981f = null;
        this.h = null;
        this.f11982n = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (l.l(this.f11977a, cVar.f11977a) && Arrays.equals(this.f11978b, cVar.f11978b) && Arrays.equals(this.f11979c, cVar.f11979c) && Arrays.equals(this.d, cVar.d) && l.l(this.f11983r, cVar.f11983r) && l.l(null, null) && l.l(null, null) && Arrays.equals(this.f11980e, cVar.f11980e) && Arrays.deepEquals(this.f11981f, cVar.f11981f) && Arrays.equals(this.h, cVar.h) && this.f11982n == cVar.f11982n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11977a, this.f11978b, this.f11979c, this.d, this.f11983r, null, null, this.f11980e, this.f11981f, this.h, Boolean.valueOf(this.f11982n)});
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("LogEventParcelable[");
        sb2.append(this.f11977a);
        sb2.append(", LogEventBytes: ");
        byte[] bArr = this.f11978b;
        if (bArr == null) {
            str = null;
        } else {
            str = new String(bArr);
        }
        sb2.append(str);
        sb2.append(", TestCodes: ");
        sb2.append(Arrays.toString(this.f11979c));
        sb2.append(", MendelPackages: ");
        sb2.append(Arrays.toString(this.d));
        sb2.append(", LogEvent: ");
        sb2.append(this.f11983r);
        sb2.append(", ExtensionProducer: null, VeProducer: null, ExperimentIDs: ");
        sb2.append(Arrays.toString(this.f11980e));
        sb2.append(", ExperimentTokens: ");
        sb2.append(Arrays.toString(this.f11981f));
        sb2.append(", ExperimentTokensParcelables: ");
        sb2.append(Arrays.toString(this.h));
        sb2.append(", AddPhenotypeExperimentTokens: ");
        sb2.append(this.f11982n);
        sb2.append("]");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.k(parcel, 2, this.f11977a, i10);
        g0.c(parcel, 3, this.f11978b);
        g0.g(parcel, 4, this.f11979c);
        g0.m(parcel, 5, this.d);
        g0.g(parcel, 6, this.f11980e);
        g0.d(parcel, 7, this.f11981f);
        g0.s(parcel, 8, 4);
        parcel.writeInt(this.f11982n ? 1 : 0);
        g0.o(parcel, 9, this.h, i10);
        g0.r(parcel, q6);
    }

    public c(d2 d2Var, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z10, k8.a[] aVarArr) {
        this.f11977a = d2Var;
        this.f11978b = bArr;
        this.f11979c = iArr;
        this.d = strArr;
        this.f11983r = null;
        this.f11980e = iArr2;
        this.f11981f = bArr2;
        this.h = aVarArr;
        this.f11982n = z10;
    }
}
