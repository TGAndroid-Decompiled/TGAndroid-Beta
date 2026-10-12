package i6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.clearcut.c2;
import com.google.android.gms.internal.clearcut.w1;
import g8.j;
import java.util.Arrays;
import n6.m;
import w7.c0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new j(9);
    public final c2 f12026a;
    public byte[] f12027b;
    public final int[] f12028c;
    public final String[] d;
    public final int[] f12029e;
    public final byte[][] f12030f;
    public final k8.a[] h;
    public final boolean f12031n;
    public final w1 f12032r;

    public c(c2 c2Var, w1 w1Var) {
        this.f12026a = c2Var;
        this.f12032r = w1Var;
        this.f12028c = null;
        this.d = null;
        this.f12029e = null;
        this.f12030f = null;
        this.h = null;
        this.f12031n = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (m.l(this.f12026a, cVar.f12026a) && Arrays.equals(this.f12027b, cVar.f12027b) && Arrays.equals(this.f12028c, cVar.f12028c) && Arrays.equals(this.d, cVar.d) && m.l(this.f12032r, cVar.f12032r) && m.l(null, null) && m.l(null, null) && Arrays.equals(this.f12029e, cVar.f12029e) && Arrays.deepEquals(this.f12030f, cVar.f12030f) && Arrays.equals(this.h, cVar.h) && this.f12031n == cVar.f12031n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12026a, this.f12027b, this.f12028c, this.d, this.f12032r, null, null, this.f12029e, this.f12030f, this.h, Boolean.valueOf(this.f12031n)});
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("LogEventParcelable[");
        sb2.append(this.f12026a);
        sb2.append(", LogEventBytes: ");
        byte[] bArr = this.f12027b;
        if (bArr == null) {
            str = null;
        } else {
            str = new String(bArr);
        }
        sb2.append(str);
        sb2.append(", TestCodes: ");
        sb2.append(Arrays.toString(this.f12028c));
        sb2.append(", MendelPackages: ");
        sb2.append(Arrays.toString(this.d));
        sb2.append(", LogEvent: ");
        sb2.append(this.f12032r);
        sb2.append(", ExtensionProducer: null, VeProducer: null, ExperimentIDs: ");
        sb2.append(Arrays.toString(this.f12029e));
        sb2.append(", ExperimentTokens: ");
        sb2.append(Arrays.toString(this.f12030f));
        sb2.append(", ExperimentTokensParcelables: ");
        sb2.append(Arrays.toString(this.h));
        sb2.append(", AddPhenotypeExperimentTokens: ");
        sb2.append(this.f12031n);
        sb2.append("]");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.k(parcel, 2, this.f12026a, i10);
        c0.c(parcel, 3, this.f12027b);
        c0.g(parcel, 4, this.f12028c);
        c0.m(parcel, 5, this.d);
        c0.g(parcel, 6, this.f12029e);
        c0.d(parcel, 7, this.f12030f);
        c0.s(parcel, 8, 4);
        parcel.writeInt(this.f12031n ? 1 : 0);
        c0.o(parcel, 9, this.h, i10);
        c0.r(parcel, q6);
    }

    public c(c2 c2Var, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z10, k8.a[] aVarArr) {
        this.f12026a = c2Var;
        this.f12027b = bArr;
        this.f12028c = iArr;
        this.d = strArr;
        this.f12032r = null;
        this.f12029e = iArr2;
        this.f12030f = bArr2;
        this.h = aVarArr;
        this.f12031n = z10;
    }
}
