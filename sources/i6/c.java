package i6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.clearcut.d2;
import com.google.android.gms.internal.clearcut.x1;
import g8.j;
import java.util.Arrays;
import n6.l;
import w7.f0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new j(9);
    public final d2 f10999a;
    public byte[] f11000b;
    public final int[] f11001c;
    public final String[] d;
    public final int[] e;
    public final byte[][] f11002f;
    public final k8.a[] h;
    public final boolean f11003n;
    public final x1 f11004r;

    public c(d2 d2Var, x1 x1Var) {
        this.f10999a = d2Var;
        this.f11004r = x1Var;
        this.f11001c = null;
        this.d = null;
        this.e = null;
        this.f11002f = null;
        this.h = null;
        this.f11003n = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (l.l(this.f10999a, cVar.f10999a) && Arrays.equals(this.f11000b, cVar.f11000b) && Arrays.equals(this.f11001c, cVar.f11001c) && Arrays.equals(this.d, cVar.d) && l.l(this.f11004r, cVar.f11004r) && l.l(null, null) && l.l(null, null) && Arrays.equals(this.e, cVar.e) && Arrays.deepEquals(this.f11002f, cVar.f11002f) && Arrays.equals(this.h, cVar.h) && this.f11003n == cVar.f11003n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10999a, this.f11000b, this.f11001c, this.d, this.f11004r, null, null, this.e, this.f11002f, this.h, Boolean.valueOf(this.f11003n)});
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("LogEventParcelable[");
        sb2.append(this.f10999a);
        sb2.append(", LogEventBytes: ");
        byte[] bArr = this.f11000b;
        if (bArr == null) {
            str = null;
        } else {
            str = new String(bArr);
        }
        sb2.append(str);
        sb2.append(", TestCodes: ");
        sb2.append(Arrays.toString(this.f11001c));
        sb2.append(", MendelPackages: ");
        sb2.append(Arrays.toString(this.d));
        sb2.append(", LogEvent: ");
        sb2.append(this.f11004r);
        sb2.append(", ExtensionProducer: null, VeProducer: null, ExperimentIDs: ");
        sb2.append(Arrays.toString(this.e));
        sb2.append(", ExperimentTokens: ");
        sb2.append(Arrays.toString(this.f11002f));
        sb2.append(", ExperimentTokensParcelables: ");
        sb2.append(Arrays.toString(this.h));
        sb2.append(", AddPhenotypeExperimentTokens: ");
        sb2.append(this.f11003n);
        sb2.append("]");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.k(parcel, 2, this.f10999a, i10);
        f0.c(parcel, 3, this.f11000b);
        f0.g(parcel, 4, this.f11001c);
        f0.m(parcel, 5, this.d);
        f0.g(parcel, 6, this.e);
        f0.d(parcel, 7, this.f11002f);
        f0.s(parcel, 8, 4);
        parcel.writeInt(this.f11003n ? 1 : 0);
        f0.o(parcel, 9, this.h, i10);
        f0.r(parcel, q6);
    }

    public c(d2 d2Var, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z10, k8.a[] aVarArr) {
        this.f10999a = d2Var;
        this.f11000b = bArr;
        this.f11001c = iArr;
        this.d = strArr;
        this.f11004r = null;
        this.e = iArr2;
        this.f11002f = bArr2;
        this.h = aVarArr;
        this.f11003n = z10;
    }
}
