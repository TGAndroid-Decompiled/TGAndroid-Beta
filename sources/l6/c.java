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
    public final b2 f19683a;
    public byte[] f19684b;
    public final int[] f19685c;
    public final String[] d;
    public final int[] f19686e;
    public final byte[][] f19687f;
    public final n8.a[] h;
    public final boolean f19688n;
    public final v1 f19689r;

    public c(b2 b2Var, v1 v1Var) {
        this.f19683a = b2Var;
        this.f19689r = v1Var;
        this.f19685c = null;
        this.d = null;
        this.f19686e = null;
        this.f19687f = null;
        this.h = null;
        this.f19688n = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (m.l(this.f19683a, cVar.f19683a) && Arrays.equals(this.f19684b, cVar.f19684b) && Arrays.equals(this.f19685c, cVar.f19685c) && Arrays.equals(this.d, cVar.d) && m.l(this.f19689r, cVar.f19689r) && m.l(null, null) && m.l(null, null) && Arrays.equals(this.f19686e, cVar.f19686e) && Arrays.deepEquals(this.f19687f, cVar.f19687f) && Arrays.equals(this.h, cVar.h) && this.f19688n == cVar.f19688n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19683a, this.f19684b, this.f19685c, this.d, this.f19689r, null, null, this.f19686e, this.f19687f, this.h, Boolean.valueOf(this.f19688n)});
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("LogEventParcelable[");
        sb2.append(this.f19683a);
        sb2.append(", LogEventBytes: ");
        byte[] bArr = this.f19684b;
        if (bArr == null) {
            str = null;
        } else {
            str = new String(bArr);
        }
        sb2.append(str);
        sb2.append(", TestCodes: ");
        sb2.append(Arrays.toString(this.f19685c));
        sb2.append(", MendelPackages: ");
        sb2.append(Arrays.toString(this.d));
        sb2.append(", LogEvent: ");
        sb2.append(this.f19689r);
        sb2.append(", ExtensionProducer: null, VeProducer: null, ExperimentIDs: ");
        sb2.append(Arrays.toString(this.f19686e));
        sb2.append(", ExperimentTokens: ");
        sb2.append(Arrays.toString(this.f19687f));
        sb2.append(", ExperimentTokensParcelables: ");
        sb2.append(Arrays.toString(this.h));
        sb2.append(", AddPhenotypeExperimentTokens: ");
        sb2.append(this.f19688n);
        sb2.append("]");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.k(parcel, 2, this.f19683a, i7);
        cc.c(parcel, 3, this.f19684b);
        cc.g(parcel, 4, this.f19685c);
        cc.m(parcel, 5, this.d);
        cc.g(parcel, 6, this.f19686e);
        cc.d(parcel, 7, this.f19687f);
        cc.q(parcel, 8, 4);
        parcel.writeInt(this.f19688n ? 1 : 0);
        cc.o(parcel, 9, this.h, i7);
        cc.s(parcel, r10);
    }

    public c(b2 b2Var, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z10, n8.a[] aVarArr) {
        this.f19683a = b2Var;
        this.f19684b = bArr;
        this.f19685c = iArr;
        this.d = strArr;
        this.f19689r = null;
        this.f19686e = iArr2;
        this.f19687f = bArr2;
        this.h = aVarArr;
        this.f19688n = z10;
    }
}
