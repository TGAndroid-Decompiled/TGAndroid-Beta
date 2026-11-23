package l6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.internal.clearcut.b2;
import com.google.android.gms.internal.clearcut.v1;
import java.util.Arrays;
import q6.m;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new j7.b(27);
    public final b2 f19783a;
    public byte[] f19784b;
    public final int[] f19785c;
    public final String[] d;
    public final int[] f19786e;
    public final byte[][] f19787f;
    public final n8.a[] h;
    public final boolean f19788n;
    public final v1 f19789r;

    public c(b2 b2Var, v1 v1Var) {
        this.f19783a = b2Var;
        this.f19789r = v1Var;
        this.f19785c = null;
        this.d = null;
        this.f19786e = null;
        this.f19787f = null;
        this.h = null;
        this.f19788n = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (m.l(this.f19783a, cVar.f19783a) && Arrays.equals(this.f19784b, cVar.f19784b) && Arrays.equals(this.f19785c, cVar.f19785c) && Arrays.equals(this.d, cVar.d) && m.l(this.f19789r, cVar.f19789r) && m.l(null, null) && m.l(null, null) && Arrays.equals(this.f19786e, cVar.f19786e) && Arrays.deepEquals(this.f19787f, cVar.f19787f) && Arrays.equals(this.h, cVar.h) && this.f19788n == cVar.f19788n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19783a, this.f19784b, this.f19785c, this.d, this.f19789r, null, null, this.f19786e, this.f19787f, this.h, Boolean.valueOf(this.f19788n)});
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("LogEventParcelable[");
        sb2.append(this.f19783a);
        sb2.append(", LogEventBytes: ");
        byte[] bArr = this.f19784b;
        if (bArr == null) {
            str = null;
        } else {
            str = new String(bArr);
        }
        sb2.append(str);
        sb2.append(", TestCodes: ");
        sb2.append(Arrays.toString(this.f19785c));
        sb2.append(", MendelPackages: ");
        sb2.append(Arrays.toString(this.d));
        sb2.append(", LogEvent: ");
        sb2.append(this.f19789r);
        sb2.append(", ExtensionProducer: null, VeProducer: null, ExperimentIDs: ");
        sb2.append(Arrays.toString(this.f19786e));
        sb2.append(", ExperimentTokens: ");
        sb2.append(Arrays.toString(this.f19787f));
        sb2.append(", ExperimentTokensParcelables: ");
        sb2.append(Arrays.toString(this.h));
        sb2.append(", AddPhenotypeExperimentTokens: ");
        sb2.append(this.f19788n);
        sb2.append("]");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.k(parcel, 2, this.f19783a, i7);
        cc.c(parcel, 3, this.f19784b);
        cc.g(parcel, 4, this.f19785c);
        cc.m(parcel, 5, this.d);
        cc.g(parcel, 6, this.f19786e);
        cc.d(parcel, 7, this.f19787f);
        cc.q(parcel, 8, 4);
        parcel.writeInt(this.f19788n ? 1 : 0);
        cc.o(parcel, 9, this.h, i7);
        cc.s(parcel, r10);
    }

    public c(b2 b2Var, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z10, n8.a[] aVarArr) {
        this.f19783a = b2Var;
        this.f19784b = bArr;
        this.f19785c = iArr;
        this.d = strArr;
        this.f19789r = null;
        this.f19786e = iArr2;
        this.f19787f = bArr2;
        this.h = aVarArr;
        this.f19788n = z10;
    }
}
