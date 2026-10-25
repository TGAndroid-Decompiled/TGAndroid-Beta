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
    public final b2 f15526a;
    public byte[] f15527b;
    public final int[] f15528c;
    public final String[] d;
    public final int[] e;
    public final byte[][] f15529f;
    public final l8.a[] h;
    public final boolean f15530n;
    public final v1 f15531r;

    public c(b2 b2Var, v1 v1Var) {
        this.f15526a = b2Var;
        this.f15531r = v1Var;
        this.f15528c = null;
        this.d = null;
        this.e = null;
        this.f15529f = null;
        this.h = null;
        this.f15530n = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (l.l(this.f15526a, cVar.f15526a) && Arrays.equals(this.f15527b, cVar.f15527b) && Arrays.equals(this.f15528c, cVar.f15528c) && Arrays.equals(this.d, cVar.d) && l.l(this.f15531r, cVar.f15531r) && l.l(null, null) && l.l(null, null) && Arrays.equals(this.e, cVar.e) && Arrays.deepEquals(this.f15529f, cVar.f15529f) && Arrays.equals(this.h, cVar.h) && this.f15530n == cVar.f15530n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15526a, this.f15527b, this.f15528c, this.d, this.f15531r, null, null, this.e, this.f15529f, this.h, Boolean.valueOf(this.f15530n)});
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("LogEventParcelable[");
        sb2.append(this.f15526a);
        sb2.append(", LogEventBytes: ");
        byte[] bArr = this.f15527b;
        if (bArr == null) {
            str = null;
        } else {
            str = new String(bArr);
        }
        sb2.append(str);
        sb2.append(", TestCodes: ");
        sb2.append(Arrays.toString(this.f15528c));
        sb2.append(", MendelPackages: ");
        sb2.append(Arrays.toString(this.d));
        sb2.append(", LogEvent: ");
        sb2.append(this.f15531r);
        sb2.append(", ExtensionProducer: null, VeProducer: null, ExperimentIDs: ");
        sb2.append(Arrays.toString(this.e));
        sb2.append(", ExperimentTokens: ");
        sb2.append(Arrays.toString(this.f15529f));
        sb2.append(", ExperimentTokensParcelables: ");
        sb2.append(Arrays.toString(this.h));
        sb2.append(", AddPhenotypeExperimentTokens: ");
        sb2.append(this.f15530n);
        sb2.append("]");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.k(parcel, 2, this.f15526a, i10);
        df.c(parcel, 3, this.f15527b);
        df.g(parcel, 4, this.f15528c);
        df.m(parcel, 5, this.d);
        df.g(parcel, 6, this.e);
        df.d(parcel, 7, this.f15529f);
        df.s(parcel, 8, 4);
        parcel.writeInt(this.f15530n ? 1 : 0);
        df.o(parcel, 9, this.h, i10);
        df.r(parcel, q5);
    }

    public c(b2 b2Var, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z10, l8.a[] aVarArr) {
        this.f15526a = b2Var;
        this.f15527b = bArr;
        this.f15528c = iArr;
        this.d = strArr;
        this.f15531r = null;
        this.e = iArr2;
        this.f15529f = bArr2;
        this.h = aVarArr;
        this.f15530n = z10;
    }
}
