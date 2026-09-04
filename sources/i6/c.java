package i6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.clearcut.c2;
import com.google.android.gms.internal.clearcut.w1;
import g8.j;
import java.util.Arrays;
import n6.l;
import w7.e0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new j(9);
    public final c2 f11873a;
    public byte[] f11874b;
    public final int[] f11875c;
    public final String[] d;
    public final int[] f11876e;
    public final byte[][] f11877f;
    public final k8.a[] h;
    public final boolean f11878n;
    public final w1 f11879r;

    public c(c2 c2Var, w1 w1Var) {
        this.f11873a = c2Var;
        this.f11879r = w1Var;
        this.f11875c = null;
        this.d = null;
        this.f11876e = null;
        this.f11877f = null;
        this.h = null;
        this.f11878n = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (l.l(this.f11873a, cVar.f11873a) && Arrays.equals(this.f11874b, cVar.f11874b) && Arrays.equals(this.f11875c, cVar.f11875c) && Arrays.equals(this.d, cVar.d) && l.l(this.f11879r, cVar.f11879r) && l.l(null, null) && l.l(null, null) && Arrays.equals(this.f11876e, cVar.f11876e) && Arrays.deepEquals(this.f11877f, cVar.f11877f) && Arrays.equals(this.h, cVar.h) && this.f11878n == cVar.f11878n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11873a, this.f11874b, this.f11875c, this.d, this.f11879r, null, null, this.f11876e, this.f11877f, this.h, Boolean.valueOf(this.f11878n)});
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("LogEventParcelable[");
        sb2.append(this.f11873a);
        sb2.append(", LogEventBytes: ");
        byte[] bArr = this.f11874b;
        if (bArr == null) {
            str = null;
        } else {
            str = new String(bArr);
        }
        sb2.append(str);
        sb2.append(", TestCodes: ");
        sb2.append(Arrays.toString(this.f11875c));
        sb2.append(", MendelPackages: ");
        sb2.append(Arrays.toString(this.d));
        sb2.append(", LogEvent: ");
        sb2.append(this.f11879r);
        sb2.append(", ExtensionProducer: null, VeProducer: null, ExperimentIDs: ");
        sb2.append(Arrays.toString(this.f11876e));
        sb2.append(", ExperimentTokens: ");
        sb2.append(Arrays.toString(this.f11877f));
        sb2.append(", ExperimentTokensParcelables: ");
        sb2.append(Arrays.toString(this.h));
        sb2.append(", AddPhenotypeExperimentTokens: ");
        sb2.append(this.f11878n);
        sb2.append("]");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.k(parcel, 2, this.f11873a, i10);
        e0.c(parcel, 3, this.f11874b);
        e0.g(parcel, 4, this.f11875c);
        e0.m(parcel, 5, this.d);
        e0.g(parcel, 6, this.f11876e);
        e0.d(parcel, 7, this.f11877f);
        e0.s(parcel, 8, 4);
        parcel.writeInt(this.f11878n ? 1 : 0);
        e0.o(parcel, 9, this.h, i10);
        e0.r(parcel, q6);
    }

    public c(c2 c2Var, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z10, k8.a[] aVarArr) {
        this.f11873a = c2Var;
        this.f11874b = bArr;
        this.f11875c = iArr;
        this.d = strArr;
        this.f11879r = null;
        this.f11876e = iArr2;
        this.f11877f = bArr2;
        this.h = aVarArr;
        this.f11878n = z10;
    }
}
