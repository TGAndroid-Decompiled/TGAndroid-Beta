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
    public final c2 f18189a;
    public byte[] f18190b;
    public final int[] f18191c;
    public final String[] d;
    public final int[] f18192e;
    public final byte[][] f18193f;
    public final n8.a[] h;
    public final boolean f18194n;
    public final w1 f18195r;

    public c(c2 c2Var, w1 w1Var) {
        this.f18189a = c2Var;
        this.f18195r = w1Var;
        this.f18191c = null;
        this.d = null;
        this.f18192e = null;
        this.f18193f = null;
        this.h = null;
        this.f18194n = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (m.k(this.f18189a, cVar.f18189a) && Arrays.equals(this.f18190b, cVar.f18190b) && Arrays.equals(this.f18191c, cVar.f18191c) && Arrays.equals(this.d, cVar.d) && m.k(this.f18195r, cVar.f18195r) && m.k(null, null) && m.k(null, null) && Arrays.equals(this.f18192e, cVar.f18192e) && Arrays.deepEquals(this.f18193f, cVar.f18193f) && Arrays.equals(this.h, cVar.h) && this.f18194n == cVar.f18194n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18189a, this.f18190b, this.f18191c, this.d, this.f18195r, null, null, this.f18192e, this.f18193f, this.h, Boolean.valueOf(this.f18194n)});
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("LogEventParcelable[");
        sb2.append(this.f18189a);
        sb2.append(", LogEventBytes: ");
        byte[] bArr = this.f18190b;
        if (bArr == null) {
            str = null;
        } else {
            str = new String(bArr);
        }
        sb2.append(str);
        sb2.append(", TestCodes: ");
        sb2.append(Arrays.toString(this.f18191c));
        sb2.append(", MendelPackages: ");
        sb2.append(Arrays.toString(this.d));
        sb2.append(", LogEvent: ");
        sb2.append(this.f18195r);
        sb2.append(", ExtensionProducer: null, VeProducer: null, ExperimentIDs: ");
        sb2.append(Arrays.toString(this.f18192e));
        sb2.append(", ExperimentTokens: ");
        sb2.append(Arrays.toString(this.f18193f));
        sb2.append(", ExperimentTokensParcelables: ");
        sb2.append(Arrays.toString(this.h));
        sb2.append(", AddPhenotypeExperimentTokens: ");
        sb2.append(this.f18194n);
        sb2.append("]");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.k(parcel, 2, this.f18189a, i7);
        xb.c(parcel, 3, this.f18190b);
        xb.g(parcel, 4, this.f18191c);
        xb.m(parcel, 5, this.d);
        xb.g(parcel, 6, this.f18192e);
        xb.d(parcel, 7, this.f18193f);
        xb.q(parcel, 8, 4);
        parcel.writeInt(this.f18194n ? 1 : 0);
        xb.o(parcel, 9, this.h, i7);
        xb.s(parcel, r10);
    }

    public c(c2 c2Var, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z9, n8.a[] aVarArr) {
        this.f18189a = c2Var;
        this.f18190b = bArr;
        this.f18191c = iArr;
        this.d = strArr;
        this.f18195r = null;
        this.f18192e = iArr2;
        this.f18193f = bArr2;
        this.h = aVarArr;
        this.f18194n = z9;
    }
}
