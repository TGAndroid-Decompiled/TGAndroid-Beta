package i6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.clearcut.c2;
import com.google.android.gms.internal.clearcut.w1;
import g8.j;
import java.util.Arrays;
import n6.l;
import w7.f0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new j(9);
    public final c2 f11336a;
    public byte[] f11337b;
    public final int[] f11338c;
    public final String[] d;
    public final int[] e;
    public final byte[][] f11339f;
    public final k8.a[] h;
    public final boolean f11340n;
    public final w1 f11341r;

    public c(c2 c2Var, w1 w1Var) {
        this.f11336a = c2Var;
        this.f11341r = w1Var;
        this.f11338c = null;
        this.d = null;
        this.e = null;
        this.f11339f = null;
        this.h = null;
        this.f11340n = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (l.l(this.f11336a, cVar.f11336a) && Arrays.equals(this.f11337b, cVar.f11337b) && Arrays.equals(this.f11338c, cVar.f11338c) && Arrays.equals(this.d, cVar.d) && l.l(this.f11341r, cVar.f11341r) && l.l(null, null) && l.l(null, null) && Arrays.equals(this.e, cVar.e) && Arrays.deepEquals(this.f11339f, cVar.f11339f) && Arrays.equals(this.h, cVar.h) && this.f11340n == cVar.f11340n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11336a, this.f11337b, this.f11338c, this.d, this.f11341r, null, null, this.e, this.f11339f, this.h, Boolean.valueOf(this.f11340n)});
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("LogEventParcelable[");
        sb2.append(this.f11336a);
        sb2.append(", LogEventBytes: ");
        byte[] bArr = this.f11337b;
        if (bArr == null) {
            str = null;
        } else {
            str = new String(bArr);
        }
        sb2.append(str);
        sb2.append(", TestCodes: ");
        sb2.append(Arrays.toString(this.f11338c));
        sb2.append(", MendelPackages: ");
        sb2.append(Arrays.toString(this.d));
        sb2.append(", LogEvent: ");
        sb2.append(this.f11341r);
        sb2.append(", ExtensionProducer: null, VeProducer: null, ExperimentIDs: ");
        sb2.append(Arrays.toString(this.e));
        sb2.append(", ExperimentTokens: ");
        sb2.append(Arrays.toString(this.f11339f));
        sb2.append(", ExperimentTokensParcelables: ");
        sb2.append(Arrays.toString(this.h));
        sb2.append(", AddPhenotypeExperimentTokens: ");
        sb2.append(this.f11340n);
        sb2.append("]");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.k(parcel, 2, this.f11336a, i10);
        f0.c(parcel, 3, this.f11337b);
        f0.g(parcel, 4, this.f11338c);
        f0.m(parcel, 5, this.d);
        f0.g(parcel, 6, this.e);
        f0.d(parcel, 7, this.f11339f);
        f0.s(parcel, 8, 4);
        parcel.writeInt(this.f11340n ? 1 : 0);
        f0.o(parcel, 9, this.h, i10);
        f0.r(parcel, q6);
    }

    public c(c2 c2Var, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z10, k8.a[] aVarArr) {
        this.f11336a = c2Var;
        this.f11337b = bArr;
        this.f11338c = iArr;
        this.d = strArr;
        this.f11341r = null;
        this.e = iArr2;
        this.f11339f = bArr2;
        this.h = aVarArr;
        this.f11340n = z10;
    }
}
