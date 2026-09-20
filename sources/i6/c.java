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
    public final d2 f11010a;
    public byte[] f11011b;
    public final int[] f11012c;
    public final String[] d;
    public final int[] e;
    public final byte[][] f11013f;
    public final k8.a[] h;
    public final boolean f11014n;
    public final x1 f11015r;

    public c(d2 d2Var, x1 x1Var) {
        this.f11010a = d2Var;
        this.f11015r = x1Var;
        this.f11012c = null;
        this.d = null;
        this.e = null;
        this.f11013f = null;
        this.h = null;
        this.f11014n = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (l.l(this.f11010a, cVar.f11010a) && Arrays.equals(this.f11011b, cVar.f11011b) && Arrays.equals(this.f11012c, cVar.f11012c) && Arrays.equals(this.d, cVar.d) && l.l(this.f11015r, cVar.f11015r) && l.l(null, null) && l.l(null, null) && Arrays.equals(this.e, cVar.e) && Arrays.deepEquals(this.f11013f, cVar.f11013f) && Arrays.equals(this.h, cVar.h) && this.f11014n == cVar.f11014n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11010a, this.f11011b, this.f11012c, this.d, this.f11015r, null, null, this.e, this.f11013f, this.h, Boolean.valueOf(this.f11014n)});
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("LogEventParcelable[");
        sb2.append(this.f11010a);
        sb2.append(", LogEventBytes: ");
        byte[] bArr = this.f11011b;
        if (bArr == null) {
            str = null;
        } else {
            str = new String(bArr);
        }
        sb2.append(str);
        sb2.append(", TestCodes: ");
        sb2.append(Arrays.toString(this.f11012c));
        sb2.append(", MendelPackages: ");
        sb2.append(Arrays.toString(this.d));
        sb2.append(", LogEvent: ");
        sb2.append(this.f11015r);
        sb2.append(", ExtensionProducer: null, VeProducer: null, ExperimentIDs: ");
        sb2.append(Arrays.toString(this.e));
        sb2.append(", ExperimentTokens: ");
        sb2.append(Arrays.toString(this.f11013f));
        sb2.append(", ExperimentTokensParcelables: ");
        sb2.append(Arrays.toString(this.h));
        sb2.append(", AddPhenotypeExperimentTokens: ");
        sb2.append(this.f11014n);
        sb2.append("]");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.k(parcel, 2, this.f11010a, i10);
        f0.c(parcel, 3, this.f11011b);
        f0.g(parcel, 4, this.f11012c);
        f0.m(parcel, 5, this.d);
        f0.g(parcel, 6, this.e);
        f0.d(parcel, 7, this.f11013f);
        f0.s(parcel, 8, 4);
        parcel.writeInt(this.f11014n ? 1 : 0);
        f0.o(parcel, 9, this.h, i10);
        f0.r(parcel, q6);
    }

    public c(d2 d2Var, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z10, k8.a[] aVarArr) {
        this.f11010a = d2Var;
        this.f11011b = bArr;
        this.f11012c = iArr;
        this.d = strArr;
        this.f11015r = null;
        this.e = iArr2;
        this.f11013f = bArr2;
        this.h = aVarArr;
        this.f11014n = z10;
    }
}
