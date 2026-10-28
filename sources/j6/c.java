package j6;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.clearcut.b2;
import com.google.android.gms.internal.clearcut.v1;
import h8.j;
import java.util.Arrays;
import o6.l;
public final class c extends p6.a {
    public static final Parcelable.Creator<c> CREATOR = new j(9);
    public final b2 f15525a;
    public byte[] f15526b;
    public final int[] f15527c;
    public final String[] d;
    public final int[] e;
    public final byte[][] f15528f;
    public final l8.a[] h;
    public final boolean f15529n;
    public final v1 f15530r;

    public c(b2 b2Var, v1 v1Var) {
        this.f15525a = b2Var;
        this.f15530r = v1Var;
        this.f15527c = null;
        this.d = null;
        this.e = null;
        this.f15528f = null;
        this.h = null;
        this.f15529n = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (l.l(this.f15525a, cVar.f15525a) && Arrays.equals(this.f15526b, cVar.f15526b) && Arrays.equals(this.f15527c, cVar.f15527c) && Arrays.equals(this.d, cVar.d) && l.l(this.f15530r, cVar.f15530r) && l.l(null, null) && l.l(null, null) && Arrays.equals(this.e, cVar.e) && Arrays.deepEquals(this.f15528f, cVar.f15528f) && Arrays.equals(this.h, cVar.h) && this.f15529n == cVar.f15529n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15525a, this.f15526b, this.f15527c, this.d, this.f15530r, null, null, this.e, this.f15528f, this.h, Boolean.valueOf(this.f15529n)});
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("LogEventParcelable[");
        sb2.append(this.f15525a);
        sb2.append(", LogEventBytes: ");
        byte[] bArr = this.f15526b;
        if (bArr == null) {
            str = null;
        } else {
            str = new String(bArr);
        }
        sb2.append(str);
        sb2.append(", TestCodes: ");
        sb2.append(Arrays.toString(this.f15527c));
        sb2.append(", MendelPackages: ");
        sb2.append(Arrays.toString(this.d));
        sb2.append(", LogEvent: ");
        sb2.append(this.f15530r);
        sb2.append(", ExtensionProducer: null, VeProducer: null, ExperimentIDs: ");
        sb2.append(Arrays.toString(this.e));
        sb2.append(", ExperimentTokens: ");
        sb2.append(Arrays.toString(this.f15528f));
        sb2.append(", ExperimentTokensParcelables: ");
        sb2.append(Arrays.toString(this.h));
        sb2.append(", AddPhenotypeExperimentTokens: ");
        sb2.append(this.f15529n);
        sb2.append("]");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.k(parcel, 2, this.f15525a, i10);
        df.c(parcel, 3, this.f15526b);
        df.g(parcel, 4, this.f15527c);
        df.m(parcel, 5, this.d);
        df.g(parcel, 6, this.e);
        df.d(parcel, 7, this.f15528f);
        df.s(parcel, 8, 4);
        parcel.writeInt(this.f15529n ? 1 : 0);
        df.o(parcel, 9, this.h, i10);
        df.r(parcel, q5);
    }

    public c(b2 b2Var, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z10, l8.a[] aVarArr) {
        this.f15525a = b2Var;
        this.f15526b = bArr;
        this.f15527c = iArr;
        this.d = strArr;
        this.f15530r = null;
        this.e = iArr2;
        this.f15528f = bArr2;
        this.h = aVarArr;
        this.f15529n = z10;
    }
}
