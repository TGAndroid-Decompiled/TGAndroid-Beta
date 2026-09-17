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
    public final c2 f11899a;
    public byte[] f11900b;
    public final int[] f11901c;
    public final String[] d;
    public final int[] f11902e;
    public final byte[][] f11903f;
    public final k8.a[] h;
    public final boolean f11904n;
    public final w1 f11905r;

    public c(c2 c2Var, w1 w1Var) {
        this.f11899a = c2Var;
        this.f11905r = w1Var;
        this.f11901c = null;
        this.d = null;
        this.f11902e = null;
        this.f11903f = null;
        this.h = null;
        this.f11904n = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (l.l(this.f11899a, cVar.f11899a) && Arrays.equals(this.f11900b, cVar.f11900b) && Arrays.equals(this.f11901c, cVar.f11901c) && Arrays.equals(this.d, cVar.d) && l.l(this.f11905r, cVar.f11905r) && l.l(null, null) && l.l(null, null) && Arrays.equals(this.f11902e, cVar.f11902e) && Arrays.deepEquals(this.f11903f, cVar.f11903f) && Arrays.equals(this.h, cVar.h) && this.f11904n == cVar.f11904n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11899a, this.f11900b, this.f11901c, this.d, this.f11905r, null, null, this.f11902e, this.f11903f, this.h, Boolean.valueOf(this.f11904n)});
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("LogEventParcelable[");
        sb2.append(this.f11899a);
        sb2.append(", LogEventBytes: ");
        byte[] bArr = this.f11900b;
        if (bArr == null) {
            str = null;
        } else {
            str = new String(bArr);
        }
        sb2.append(str);
        sb2.append(", TestCodes: ");
        sb2.append(Arrays.toString(this.f11901c));
        sb2.append(", MendelPackages: ");
        sb2.append(Arrays.toString(this.d));
        sb2.append(", LogEvent: ");
        sb2.append(this.f11905r);
        sb2.append(", ExtensionProducer: null, VeProducer: null, ExperimentIDs: ");
        sb2.append(Arrays.toString(this.f11902e));
        sb2.append(", ExperimentTokens: ");
        sb2.append(Arrays.toString(this.f11903f));
        sb2.append(", ExperimentTokensParcelables: ");
        sb2.append(Arrays.toString(this.h));
        sb2.append(", AddPhenotypeExperimentTokens: ");
        sb2.append(this.f11904n);
        sb2.append("]");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.k(parcel, 2, this.f11899a, i10);
        e0.c(parcel, 3, this.f11900b);
        e0.g(parcel, 4, this.f11901c);
        e0.m(parcel, 5, this.d);
        e0.g(parcel, 6, this.f11902e);
        e0.d(parcel, 7, this.f11903f);
        e0.s(parcel, 8, 4);
        parcel.writeInt(this.f11904n ? 1 : 0);
        e0.o(parcel, 9, this.h, i10);
        e0.r(parcel, q6);
    }

    public c(c2 c2Var, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z10, k8.a[] aVarArr) {
        this.f11899a = c2Var;
        this.f11900b = bArr;
        this.f11901c = iArr;
        this.d = strArr;
        this.f11905r = null;
        this.f11902e = iArr2;
        this.f11903f = bArr2;
        this.h = aVarArr;
        this.f11904n = z10;
    }
}
