package l6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import com.google.android.gms.internal.clearcut.c2;
import com.google.android.gms.internal.clearcut.w1;
import java.util.Arrays;
import q6.m;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new j7.b(27);
    public final c2 f18192a;
    public byte[] f18193b;
    public final int[] f18194c;
    public final String[] d;
    public final int[] f18195e;
    public final byte[][] f18196f;
    public final n8.a[] h;
    public final boolean f18197n;
    public final w1 f18198r;

    public c(c2 c2Var, w1 w1Var) {
        this.f18192a = c2Var;
        this.f18198r = w1Var;
        this.f18194c = null;
        this.d = null;
        this.f18195e = null;
        this.f18196f = null;
        this.h = null;
        this.f18197n = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (m.k(this.f18192a, cVar.f18192a) && Arrays.equals(this.f18193b, cVar.f18193b) && Arrays.equals(this.f18194c, cVar.f18194c) && Arrays.equals(this.d, cVar.d) && m.k(this.f18198r, cVar.f18198r) && m.k(null, null) && m.k(null, null) && Arrays.equals(this.f18195e, cVar.f18195e) && Arrays.deepEquals(this.f18196f, cVar.f18196f) && Arrays.equals(this.h, cVar.h) && this.f18197n == cVar.f18197n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18192a, this.f18193b, this.f18194c, this.d, this.f18198r, null, null, this.f18195e, this.f18196f, this.h, Boolean.valueOf(this.f18197n)});
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("LogEventParcelable[");
        sb2.append(this.f18192a);
        sb2.append(", LogEventBytes: ");
        byte[] bArr = this.f18193b;
        if (bArr == null) {
            str = null;
        } else {
            str = new String(bArr);
        }
        sb2.append(str);
        sb2.append(", TestCodes: ");
        sb2.append(Arrays.toString(this.f18194c));
        sb2.append(", MendelPackages: ");
        sb2.append(Arrays.toString(this.d));
        sb2.append(", LogEvent: ");
        sb2.append(this.f18198r);
        sb2.append(", ExtensionProducer: null, VeProducer: null, ExperimentIDs: ");
        sb2.append(Arrays.toString(this.f18195e));
        sb2.append(", ExperimentTokens: ");
        sb2.append(Arrays.toString(this.f18196f));
        sb2.append(", ExperimentTokensParcelables: ");
        sb2.append(Arrays.toString(this.h));
        sb2.append(", AddPhenotypeExperimentTokens: ");
        sb2.append(this.f18197n);
        sb2.append("]");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.k(parcel, 2, this.f18192a, i7);
        xb.c(parcel, 3, this.f18193b);
        xb.g(parcel, 4, this.f18194c);
        xb.m(parcel, 5, this.d);
        xb.g(parcel, 6, this.f18195e);
        xb.d(parcel, 7, this.f18196f);
        xb.q(parcel, 8, 4);
        parcel.writeInt(this.f18197n ? 1 : 0);
        xb.o(parcel, 9, this.h, i7);
        xb.s(parcel, r10);
    }

    public c(c2 c2Var, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z9, n8.a[] aVarArr) {
        this.f18192a = c2Var;
        this.f18193b = bArr;
        this.f18194c = iArr;
        this.d = strArr;
        this.f18198r = null;
        this.f18195e = iArr2;
        this.f18196f = bArr2;
        this.h = aVarArr;
        this.f18197n = z9;
    }
}
