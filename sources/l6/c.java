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
    public final c2 f18186a;
    public byte[] f18187b;
    public final int[] f18188c;
    public final String[] d;
    public final int[] f18189e;
    public final byte[][] f18190f;
    public final n8.a[] h;
    public final boolean f18191n;
    public final w1 f18192r;

    public c(c2 c2Var, w1 w1Var) {
        this.f18186a = c2Var;
        this.f18192r = w1Var;
        this.f18188c = null;
        this.d = null;
        this.f18189e = null;
        this.f18190f = null;
        this.h = null;
        this.f18191n = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (m.k(this.f18186a, cVar.f18186a) && Arrays.equals(this.f18187b, cVar.f18187b) && Arrays.equals(this.f18188c, cVar.f18188c) && Arrays.equals(this.d, cVar.d) && m.k(this.f18192r, cVar.f18192r) && m.k(null, null) && m.k(null, null) && Arrays.equals(this.f18189e, cVar.f18189e) && Arrays.deepEquals(this.f18190f, cVar.f18190f) && Arrays.equals(this.h, cVar.h) && this.f18191n == cVar.f18191n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18186a, this.f18187b, this.f18188c, this.d, this.f18192r, null, null, this.f18189e, this.f18190f, this.h, Boolean.valueOf(this.f18191n)});
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("LogEventParcelable[");
        sb2.append(this.f18186a);
        sb2.append(", LogEventBytes: ");
        byte[] bArr = this.f18187b;
        if (bArr == null) {
            str = null;
        } else {
            str = new String(bArr);
        }
        sb2.append(str);
        sb2.append(", TestCodes: ");
        sb2.append(Arrays.toString(this.f18188c));
        sb2.append(", MendelPackages: ");
        sb2.append(Arrays.toString(this.d));
        sb2.append(", LogEvent: ");
        sb2.append(this.f18192r);
        sb2.append(", ExtensionProducer: null, VeProducer: null, ExperimentIDs: ");
        sb2.append(Arrays.toString(this.f18189e));
        sb2.append(", ExperimentTokens: ");
        sb2.append(Arrays.toString(this.f18190f));
        sb2.append(", ExperimentTokensParcelables: ");
        sb2.append(Arrays.toString(this.h));
        sb2.append(", AddPhenotypeExperimentTokens: ");
        sb2.append(this.f18191n);
        sb2.append("]");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.k(parcel, 2, this.f18186a, i7);
        xb.c(parcel, 3, this.f18187b);
        xb.g(parcel, 4, this.f18188c);
        xb.m(parcel, 5, this.d);
        xb.g(parcel, 6, this.f18189e);
        xb.d(parcel, 7, this.f18190f);
        xb.q(parcel, 8, 4);
        parcel.writeInt(this.f18191n ? 1 : 0);
        xb.o(parcel, 9, this.h, i7);
        xb.s(parcel, r10);
    }

    public c(c2 c2Var, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z9, n8.a[] aVarArr) {
        this.f18186a = c2Var;
        this.f18187b = bArr;
        this.f18188c = iArr;
        this.d = strArr;
        this.f18192r = null;
        this.f18189e = iArr2;
        this.f18190f = bArr2;
        this.h = aVarArr;
        this.f18191n = z9;
    }
}
