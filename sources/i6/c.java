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
    public final d2 f12723a;
    public byte[] f12724b;
    public final int[] f12725c;
    public final String[] d;
    public final int[] e;
    public final byte[][] f12726f;
    public final k8.a[] h;
    public final boolean f12727n;
    public final x1 f12728r;

    public c(d2 d2Var, x1 x1Var) {
        this.f12723a = d2Var;
        this.f12728r = x1Var;
        this.f12725c = null;
        this.d = null;
        this.e = null;
        this.f12726f = null;
        this.h = null;
        this.f12727n = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (l.l(this.f12723a, cVar.f12723a) && Arrays.equals(this.f12724b, cVar.f12724b) && Arrays.equals(this.f12725c, cVar.f12725c) && Arrays.equals(this.d, cVar.d) && l.l(this.f12728r, cVar.f12728r) && l.l(null, null) && l.l(null, null) && Arrays.equals(this.e, cVar.e) && Arrays.deepEquals(this.f12726f, cVar.f12726f) && Arrays.equals(this.h, cVar.h) && this.f12727n == cVar.f12727n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12723a, this.f12724b, this.f12725c, this.d, this.f12728r, null, null, this.e, this.f12726f, this.h, Boolean.valueOf(this.f12727n)});
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("LogEventParcelable[");
        sb2.append(this.f12723a);
        sb2.append(", LogEventBytes: ");
        byte[] bArr = this.f12724b;
        if (bArr == null) {
            str = null;
        } else {
            str = new String(bArr);
        }
        sb2.append(str);
        sb2.append(", TestCodes: ");
        sb2.append(Arrays.toString(this.f12725c));
        sb2.append(", MendelPackages: ");
        sb2.append(Arrays.toString(this.d));
        sb2.append(", LogEvent: ");
        sb2.append(this.f12728r);
        sb2.append(", ExtensionProducer: null, VeProducer: null, ExperimentIDs: ");
        sb2.append(Arrays.toString(this.e));
        sb2.append(", ExperimentTokens: ");
        sb2.append(Arrays.toString(this.f12726f));
        sb2.append(", ExperimentTokensParcelables: ");
        sb2.append(Arrays.toString(this.h));
        sb2.append(", AddPhenotypeExperimentTokens: ");
        sb2.append(this.f12727n);
        sb2.append("]");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.k(parcel, 2, this.f12723a, i10);
        f0.c(parcel, 3, this.f12724b);
        f0.g(parcel, 4, this.f12725c);
        f0.m(parcel, 5, this.d);
        f0.g(parcel, 6, this.e);
        f0.d(parcel, 7, this.f12726f);
        f0.s(parcel, 8, 4);
        parcel.writeInt(this.f12727n ? 1 : 0);
        f0.o(parcel, 9, this.h, i10);
        f0.r(parcel, q6);
    }

    public c(d2 d2Var, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z10, k8.a[] aVarArr) {
        this.f12723a = d2Var;
        this.f12724b = bArr;
        this.f12725c = iArr;
        this.d = strArr;
        this.f12728r = null;
        this.e = iArr2;
        this.f12726f = bArr2;
        this.h = aVarArr;
        this.f12727n = z10;
    }
}
