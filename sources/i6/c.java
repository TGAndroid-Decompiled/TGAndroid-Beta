package i6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.clearcut.c2;
import com.google.android.gms.internal.clearcut.w1;
import g8.j;
import java.util.Arrays;
import n6.l;
import w7.g0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new j(9);
    public final c2 f11332a;
    public byte[] f11333b;
    public final int[] f11334c;
    public final String[] d;
    public final int[] e;
    public final byte[][] f11335f;
    public final k8.a[] h;
    public final boolean f11336n;
    public final w1 f11337r;

    public c(c2 c2Var, w1 w1Var) {
        this.f11332a = c2Var;
        this.f11337r = w1Var;
        this.f11334c = null;
        this.d = null;
        this.e = null;
        this.f11335f = null;
        this.h = null;
        this.f11336n = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (l.l(this.f11332a, cVar.f11332a) && Arrays.equals(this.f11333b, cVar.f11333b) && Arrays.equals(this.f11334c, cVar.f11334c) && Arrays.equals(this.d, cVar.d) && l.l(this.f11337r, cVar.f11337r) && l.l(null, null) && l.l(null, null) && Arrays.equals(this.e, cVar.e) && Arrays.deepEquals(this.f11335f, cVar.f11335f) && Arrays.equals(this.h, cVar.h) && this.f11336n == cVar.f11336n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11332a, this.f11333b, this.f11334c, this.d, this.f11337r, null, null, this.e, this.f11335f, this.h, Boolean.valueOf(this.f11336n)});
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("LogEventParcelable[");
        sb2.append(this.f11332a);
        sb2.append(", LogEventBytes: ");
        byte[] bArr = this.f11333b;
        if (bArr == null) {
            str = null;
        } else {
            str = new String(bArr);
        }
        sb2.append(str);
        sb2.append(", TestCodes: ");
        sb2.append(Arrays.toString(this.f11334c));
        sb2.append(", MendelPackages: ");
        sb2.append(Arrays.toString(this.d));
        sb2.append(", LogEvent: ");
        sb2.append(this.f11337r);
        sb2.append(", ExtensionProducer: null, VeProducer: null, ExperimentIDs: ");
        sb2.append(Arrays.toString(this.e));
        sb2.append(", ExperimentTokens: ");
        sb2.append(Arrays.toString(this.f11335f));
        sb2.append(", ExperimentTokensParcelables: ");
        sb2.append(Arrays.toString(this.h));
        sb2.append(", AddPhenotypeExperimentTokens: ");
        sb2.append(this.f11336n);
        sb2.append("]");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.k(parcel, 2, this.f11332a, i10);
        g0.c(parcel, 3, this.f11333b);
        g0.g(parcel, 4, this.f11334c);
        g0.m(parcel, 5, this.d);
        g0.g(parcel, 6, this.e);
        g0.d(parcel, 7, this.f11335f);
        g0.s(parcel, 8, 4);
        parcel.writeInt(this.f11336n ? 1 : 0);
        g0.o(parcel, 9, this.h, i10);
        g0.r(parcel, q6);
    }

    public c(c2 c2Var, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z10, k8.a[] aVarArr) {
        this.f11332a = c2Var;
        this.f11333b = bArr;
        this.f11334c = iArr;
        this.d = strArr;
        this.f11337r = null;
        this.e = iArr2;
        this.f11335f = bArr2;
        this.h = aVarArr;
        this.f11336n = z10;
    }
}
