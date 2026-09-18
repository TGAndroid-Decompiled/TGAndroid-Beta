package i6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.clearcut.d2;
import com.google.android.gms.internal.clearcut.x1;
import g8.j;
import java.util.Arrays;
import n6.l;
import w7.e0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new j(9);
    public final d2 f11009a;
    public byte[] f11010b;
    public final int[] f11011c;
    public final String[] d;
    public final int[] e;
    public final byte[][] f11012f;
    public final k8.a[] h;
    public final boolean f11013n;
    public final x1 f11014r;

    public c(d2 d2Var, x1 x1Var) {
        this.f11009a = d2Var;
        this.f11014r = x1Var;
        this.f11011c = null;
        this.d = null;
        this.e = null;
        this.f11012f = null;
        this.h = null;
        this.f11013n = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (l.l(this.f11009a, cVar.f11009a) && Arrays.equals(this.f11010b, cVar.f11010b) && Arrays.equals(this.f11011c, cVar.f11011c) && Arrays.equals(this.d, cVar.d) && l.l(this.f11014r, cVar.f11014r) && l.l(null, null) && l.l(null, null) && Arrays.equals(this.e, cVar.e) && Arrays.deepEquals(this.f11012f, cVar.f11012f) && Arrays.equals(this.h, cVar.h) && this.f11013n == cVar.f11013n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11009a, this.f11010b, this.f11011c, this.d, this.f11014r, null, null, this.e, this.f11012f, this.h, Boolean.valueOf(this.f11013n)});
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("LogEventParcelable[");
        sb2.append(this.f11009a);
        sb2.append(", LogEventBytes: ");
        byte[] bArr = this.f11010b;
        if (bArr == null) {
            str = null;
        } else {
            str = new String(bArr);
        }
        sb2.append(str);
        sb2.append(", TestCodes: ");
        sb2.append(Arrays.toString(this.f11011c));
        sb2.append(", MendelPackages: ");
        sb2.append(Arrays.toString(this.d));
        sb2.append(", LogEvent: ");
        sb2.append(this.f11014r);
        sb2.append(", ExtensionProducer: null, VeProducer: null, ExperimentIDs: ");
        sb2.append(Arrays.toString(this.e));
        sb2.append(", ExperimentTokens: ");
        sb2.append(Arrays.toString(this.f11012f));
        sb2.append(", ExperimentTokensParcelables: ");
        sb2.append(Arrays.toString(this.h));
        sb2.append(", AddPhenotypeExperimentTokens: ");
        sb2.append(this.f11013n);
        sb2.append("]");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.k(parcel, 2, this.f11009a, i10);
        e0.c(parcel, 3, this.f11010b);
        e0.g(parcel, 4, this.f11011c);
        e0.m(parcel, 5, this.d);
        e0.g(parcel, 6, this.e);
        e0.d(parcel, 7, this.f11012f);
        e0.s(parcel, 8, 4);
        parcel.writeInt(this.f11013n ? 1 : 0);
        e0.o(parcel, 9, this.h, i10);
        e0.r(parcel, q6);
    }

    public c(d2 d2Var, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z10, k8.a[] aVarArr) {
        this.f11009a = d2Var;
        this.f11010b = bArr;
        this.f11011c = iArr;
        this.d = strArr;
        this.f11014r = null;
        this.e = iArr2;
        this.f11012f = bArr2;
        this.h = aVarArr;
        this.f11013n = z10;
    }
}
