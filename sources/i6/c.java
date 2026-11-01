package i6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.clearcut.d2;
import com.google.android.gms.internal.clearcut.x1;
import g8.g;
import java.util.Arrays;
import n6.l;
import w7.h0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new g(8);
    public final d2 f8220a;
    public byte[] f8221b;
    public final int[] f8222c;
    public final String[] d;
    public final int[] e;
    public final byte[][] f8223f;
    public final k8.a[] h;
    public final boolean f8224n;
    public final x1 f8225r;

    public c(d2 d2Var, x1 x1Var) {
        this.f8220a = d2Var;
        this.f8225r = x1Var;
        this.f8222c = null;
        this.d = null;
        this.e = null;
        this.f8223f = null;
        this.h = null;
        this.f8224n = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (l.k(this.f8220a, cVar.f8220a) && Arrays.equals(this.f8221b, cVar.f8221b) && Arrays.equals(this.f8222c, cVar.f8222c) && Arrays.equals(this.d, cVar.d) && l.k(this.f8225r, cVar.f8225r) && l.k(null, null) && l.k(null, null) && Arrays.equals(this.e, cVar.e) && Arrays.deepEquals(this.f8223f, cVar.f8223f) && Arrays.equals(this.h, cVar.h) && this.f8224n == cVar.f8224n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8220a, this.f8221b, this.f8222c, this.d, this.f8225r, null, null, this.e, this.f8223f, this.h, Boolean.valueOf(this.f8224n)});
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("LogEventParcelable[");
        sb2.append(this.f8220a);
        sb2.append(", LogEventBytes: ");
        byte[] bArr = this.f8221b;
        if (bArr == null) {
            str = null;
        } else {
            str = new String(bArr);
        }
        sb2.append(str);
        sb2.append(", TestCodes: ");
        sb2.append(Arrays.toString(this.f8222c));
        sb2.append(", MendelPackages: ");
        sb2.append(Arrays.toString(this.d));
        sb2.append(", LogEvent: ");
        sb2.append(this.f8225r);
        sb2.append(", ExtensionProducer: null, VeProducer: null, ExperimentIDs: ");
        sb2.append(Arrays.toString(this.e));
        sb2.append(", ExperimentTokens: ");
        sb2.append(Arrays.toString(this.f8223f));
        sb2.append(", ExperimentTokensParcelables: ");
        sb2.append(Arrays.toString(this.h));
        sb2.append(", AddPhenotypeExperimentTokens: ");
        sb2.append(this.f8224n);
        sb2.append("]");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.k(parcel, 2, this.f8220a, i10);
        h0.c(parcel, 3, this.f8221b);
        h0.g(parcel, 4, this.f8222c);
        h0.m(parcel, 5, this.d);
        h0.g(parcel, 6, this.e);
        h0.d(parcel, 7, this.f8223f);
        h0.s(parcel, 8, 4);
        parcel.writeInt(this.f8224n ? 1 : 0);
        h0.o(parcel, 9, this.h, i10);
        h0.r(parcel, q6);
    }

    public c(d2 d2Var, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z10, k8.a[] aVarArr) {
        this.f8220a = d2Var;
        this.f8221b = bArr;
        this.f8222c = iArr;
        this.d = strArr;
        this.f8225r = null;
        this.e = iArr2;
        this.f8223f = bArr2;
        this.h = aVarArr;
        this.f8224n = z10;
    }
}
