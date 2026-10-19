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
    public final d2 f12721a;
    public byte[] f12722b;
    public final int[] f12723c;
    public final String[] d;
    public final int[] e;
    public final byte[][] f12724f;
    public final k8.a[] h;
    public final boolean f12725n;
    public final x1 f12726r;

    public c(d2 d2Var, x1 x1Var) {
        this.f12721a = d2Var;
        this.f12726r = x1Var;
        this.f12723c = null;
        this.d = null;
        this.e = null;
        this.f12724f = null;
        this.h = null;
        this.f12725n = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (l.l(this.f12721a, cVar.f12721a) && Arrays.equals(this.f12722b, cVar.f12722b) && Arrays.equals(this.f12723c, cVar.f12723c) && Arrays.equals(this.d, cVar.d) && l.l(this.f12726r, cVar.f12726r) && l.l(null, null) && l.l(null, null) && Arrays.equals(this.e, cVar.e) && Arrays.deepEquals(this.f12724f, cVar.f12724f) && Arrays.equals(this.h, cVar.h) && this.f12725n == cVar.f12725n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12721a, this.f12722b, this.f12723c, this.d, this.f12726r, null, null, this.e, this.f12724f, this.h, Boolean.valueOf(this.f12725n)});
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("LogEventParcelable[");
        sb2.append(this.f12721a);
        sb2.append(", LogEventBytes: ");
        byte[] bArr = this.f12722b;
        if (bArr == null) {
            str = null;
        } else {
            str = new String(bArr);
        }
        sb2.append(str);
        sb2.append(", TestCodes: ");
        sb2.append(Arrays.toString(this.f12723c));
        sb2.append(", MendelPackages: ");
        sb2.append(Arrays.toString(this.d));
        sb2.append(", LogEvent: ");
        sb2.append(this.f12726r);
        sb2.append(", ExtensionProducer: null, VeProducer: null, ExperimentIDs: ");
        sb2.append(Arrays.toString(this.e));
        sb2.append(", ExperimentTokens: ");
        sb2.append(Arrays.toString(this.f12724f));
        sb2.append(", ExperimentTokensParcelables: ");
        sb2.append(Arrays.toString(this.h));
        sb2.append(", AddPhenotypeExperimentTokens: ");
        sb2.append(this.f12725n);
        sb2.append("]");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.k(parcel, 2, this.f12721a, i10);
        f0.c(parcel, 3, this.f12722b);
        f0.g(parcel, 4, this.f12723c);
        f0.m(parcel, 5, this.d);
        f0.g(parcel, 6, this.e);
        f0.d(parcel, 7, this.f12724f);
        f0.s(parcel, 8, 4);
        parcel.writeInt(this.f12725n ? 1 : 0);
        f0.o(parcel, 9, this.h, i10);
        f0.r(parcel, q6);
    }

    public c(d2 d2Var, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z10, k8.a[] aVarArr) {
        this.f12721a = d2Var;
        this.f12722b = bArr;
        this.f12723c = iArr;
        this.d = strArr;
        this.f12726r = null;
        this.e = iArr2;
        this.f12724f = bArr2;
        this.h = aVarArr;
        this.f12725n = z10;
    }
}
