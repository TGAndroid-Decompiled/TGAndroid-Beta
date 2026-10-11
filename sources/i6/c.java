package i6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.clearcut.c2;
import com.google.android.gms.internal.clearcut.w1;
import g8.j;
import java.util.Arrays;
import n6.m;
import w7.d0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new j(9);
    public final c2 f12027a;
    public byte[] f12028b;
    public final int[] f12029c;
    public final String[] d;
    public final int[] f12030e;
    public final byte[][] f12031f;
    public final k8.a[] h;
    public final boolean f12032n;
    public final w1 f12033r;

    public c(c2 c2Var, w1 w1Var) {
        this.f12027a = c2Var;
        this.f12033r = w1Var;
        this.f12029c = null;
        this.d = null;
        this.f12030e = null;
        this.f12031f = null;
        this.h = null;
        this.f12032n = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (m.l(this.f12027a, cVar.f12027a) && Arrays.equals(this.f12028b, cVar.f12028b) && Arrays.equals(this.f12029c, cVar.f12029c) && Arrays.equals(this.d, cVar.d) && m.l(this.f12033r, cVar.f12033r) && m.l(null, null) && m.l(null, null) && Arrays.equals(this.f12030e, cVar.f12030e) && Arrays.deepEquals(this.f12031f, cVar.f12031f) && Arrays.equals(this.h, cVar.h) && this.f12032n == cVar.f12032n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12027a, this.f12028b, this.f12029c, this.d, this.f12033r, null, null, this.f12030e, this.f12031f, this.h, Boolean.valueOf(this.f12032n)});
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("LogEventParcelable[");
        sb2.append(this.f12027a);
        sb2.append(", LogEventBytes: ");
        byte[] bArr = this.f12028b;
        if (bArr == null) {
            str = null;
        } else {
            str = new String(bArr);
        }
        sb2.append(str);
        sb2.append(", TestCodes: ");
        sb2.append(Arrays.toString(this.f12029c));
        sb2.append(", MendelPackages: ");
        sb2.append(Arrays.toString(this.d));
        sb2.append(", LogEvent: ");
        sb2.append(this.f12033r);
        sb2.append(", ExtensionProducer: null, VeProducer: null, ExperimentIDs: ");
        sb2.append(Arrays.toString(this.f12030e));
        sb2.append(", ExperimentTokens: ");
        sb2.append(Arrays.toString(this.f12031f));
        sb2.append(", ExperimentTokensParcelables: ");
        sb2.append(Arrays.toString(this.h));
        sb2.append(", AddPhenotypeExperimentTokens: ");
        sb2.append(this.f12032n);
        sb2.append("]");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.k(parcel, 2, this.f12027a, i10);
        d0.c(parcel, 3, this.f12028b);
        d0.g(parcel, 4, this.f12029c);
        d0.m(parcel, 5, this.d);
        d0.g(parcel, 6, this.f12030e);
        d0.d(parcel, 7, this.f12031f);
        d0.s(parcel, 8, 4);
        parcel.writeInt(this.f12032n ? 1 : 0);
        d0.o(parcel, 9, this.h, i10);
        d0.r(parcel, q6);
    }

    public c(c2 c2Var, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z10, k8.a[] aVarArr) {
        this.f12027a = c2Var;
        this.f12028b = bArr;
        this.f12029c = iArr;
        this.d = strArr;
        this.f12033r = null;
        this.f12030e = iArr2;
        this.f12031f = bArr2;
        this.h = aVarArr;
        this.f12032n = z10;
    }
}
