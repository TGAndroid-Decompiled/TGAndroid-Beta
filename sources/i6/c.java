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
    public final d2 f10996a;
    public byte[] f10997b;
    public final int[] f10998c;
    public final String[] d;
    public final int[] e;
    public final byte[][] f10999f;
    public final k8.a[] h;
    public final boolean f11000n;
    public final x1 f11001r;

    public c(d2 d2Var, x1 x1Var) {
        this.f10996a = d2Var;
        this.f11001r = x1Var;
        this.f10998c = null;
        this.d = null;
        this.e = null;
        this.f10999f = null;
        this.h = null;
        this.f11000n = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (l.l(this.f10996a, cVar.f10996a) && Arrays.equals(this.f10997b, cVar.f10997b) && Arrays.equals(this.f10998c, cVar.f10998c) && Arrays.equals(this.d, cVar.d) && l.l(this.f11001r, cVar.f11001r) && l.l(null, null) && l.l(null, null) && Arrays.equals(this.e, cVar.e) && Arrays.deepEquals(this.f10999f, cVar.f10999f) && Arrays.equals(this.h, cVar.h) && this.f11000n == cVar.f11000n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10996a, this.f10997b, this.f10998c, this.d, this.f11001r, null, null, this.e, this.f10999f, this.h, Boolean.valueOf(this.f11000n)});
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("LogEventParcelable[");
        sb2.append(this.f10996a);
        sb2.append(", LogEventBytes: ");
        byte[] bArr = this.f10997b;
        if (bArr == null) {
            str = null;
        } else {
            str = new String(bArr);
        }
        sb2.append(str);
        sb2.append(", TestCodes: ");
        sb2.append(Arrays.toString(this.f10998c));
        sb2.append(", MendelPackages: ");
        sb2.append(Arrays.toString(this.d));
        sb2.append(", LogEvent: ");
        sb2.append(this.f11001r);
        sb2.append(", ExtensionProducer: null, VeProducer: null, ExperimentIDs: ");
        sb2.append(Arrays.toString(this.e));
        sb2.append(", ExperimentTokens: ");
        sb2.append(Arrays.toString(this.f10999f));
        sb2.append(", ExperimentTokensParcelables: ");
        sb2.append(Arrays.toString(this.h));
        sb2.append(", AddPhenotypeExperimentTokens: ");
        sb2.append(this.f11000n);
        sb2.append("]");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.k(parcel, 2, this.f10996a, i10);
        e0.c(parcel, 3, this.f10997b);
        e0.g(parcel, 4, this.f10998c);
        e0.m(parcel, 5, this.d);
        e0.g(parcel, 6, this.e);
        e0.d(parcel, 7, this.f10999f);
        e0.s(parcel, 8, 4);
        parcel.writeInt(this.f11000n ? 1 : 0);
        e0.o(parcel, 9, this.h, i10);
        e0.r(parcel, q6);
    }

    public c(d2 d2Var, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z10, k8.a[] aVarArr) {
        this.f10996a = d2Var;
        this.f10997b = bArr;
        this.f10998c = iArr;
        this.d = strArr;
        this.f11001r = null;
        this.e = iArr2;
        this.f10999f = bArr2;
        this.h = aVarArr;
        this.f11000n = z10;
    }
}
