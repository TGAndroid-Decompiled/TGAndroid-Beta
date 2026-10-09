package i6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.clearcut.c2;
import com.google.android.gms.internal.clearcut.w1;
import g8.j;
import java.util.Arrays;
import n6.l;
import w7.d0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new j(9);
    public final c2 f12028a;
    public byte[] f12029b;
    public final int[] f12030c;
    public final String[] d;
    public final int[] f12031e;
    public final byte[][] f12032f;
    public final k8.a[] h;
    public final boolean f12033n;
    public final w1 f12034r;

    public c(c2 c2Var, w1 w1Var) {
        this.f12028a = c2Var;
        this.f12034r = w1Var;
        this.f12030c = null;
        this.d = null;
        this.f12031e = null;
        this.f12032f = null;
        this.h = null;
        this.f12033n = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (l.l(this.f12028a, cVar.f12028a) && Arrays.equals(this.f12029b, cVar.f12029b) && Arrays.equals(this.f12030c, cVar.f12030c) && Arrays.equals(this.d, cVar.d) && l.l(this.f12034r, cVar.f12034r) && l.l(null, null) && l.l(null, null) && Arrays.equals(this.f12031e, cVar.f12031e) && Arrays.deepEquals(this.f12032f, cVar.f12032f) && Arrays.equals(this.h, cVar.h) && this.f12033n == cVar.f12033n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12028a, this.f12029b, this.f12030c, this.d, this.f12034r, null, null, this.f12031e, this.f12032f, this.h, Boolean.valueOf(this.f12033n)});
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("LogEventParcelable[");
        sb2.append(this.f12028a);
        sb2.append(", LogEventBytes: ");
        byte[] bArr = this.f12029b;
        if (bArr == null) {
            str = null;
        } else {
            str = new String(bArr);
        }
        sb2.append(str);
        sb2.append(", TestCodes: ");
        sb2.append(Arrays.toString(this.f12030c));
        sb2.append(", MendelPackages: ");
        sb2.append(Arrays.toString(this.d));
        sb2.append(", LogEvent: ");
        sb2.append(this.f12034r);
        sb2.append(", ExtensionProducer: null, VeProducer: null, ExperimentIDs: ");
        sb2.append(Arrays.toString(this.f12031e));
        sb2.append(", ExperimentTokens: ");
        sb2.append(Arrays.toString(this.f12032f));
        sb2.append(", ExperimentTokensParcelables: ");
        sb2.append(Arrays.toString(this.h));
        sb2.append(", AddPhenotypeExperimentTokens: ");
        sb2.append(this.f12033n);
        sb2.append("]");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.k(parcel, 2, this.f12028a, i10);
        d0.c(parcel, 3, this.f12029b);
        d0.g(parcel, 4, this.f12030c);
        d0.m(parcel, 5, this.d);
        d0.g(parcel, 6, this.f12031e);
        d0.d(parcel, 7, this.f12032f);
        d0.s(parcel, 8, 4);
        parcel.writeInt(this.f12033n ? 1 : 0);
        d0.o(parcel, 9, this.h, i10);
        d0.r(parcel, q6);
    }

    public c(c2 c2Var, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z10, k8.a[] aVarArr) {
        this.f12028a = c2Var;
        this.f12029b = bArr;
        this.f12030c = iArr;
        this.d = strArr;
        this.f12034r = null;
        this.f12031e = iArr2;
        this.f12032f = bArr2;
        this.h = aVarArr;
        this.f12033n = z10;
    }
}
