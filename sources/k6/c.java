package k6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.clearcut.b2;
import com.google.android.gms.internal.clearcut.v1;
import i7.p;
import java.util.Arrays;
import p6.m;
public final class c extends q6.a {
    public static final Parcelable.Creator<c> CREATOR = new p(12);
    public final b2 f16891a;
    public byte[] f16892b;
    public final int[] f16893c;
    public final String[] d;
    public final int[] f16894e;
    public final byte[][] f16895f;
    public final m8.a[] h;
    public final boolean f16896n;
    public final v1 f16897r;

    public c(b2 b2Var, v1 v1Var) {
        this.f16891a = b2Var;
        this.f16897r = v1Var;
        this.f16893c = null;
        this.d = null;
        this.f16894e = null;
        this.f16895f = null;
        this.h = null;
        this.f16896n = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (m.k(this.f16891a, cVar.f16891a) && Arrays.equals(this.f16892b, cVar.f16892b) && Arrays.equals(this.f16893c, cVar.f16893c) && Arrays.equals(this.d, cVar.d) && m.k(this.f16897r, cVar.f16897r) && m.k(null, null) && m.k(null, null) && Arrays.equals(this.f16894e, cVar.f16894e) && Arrays.deepEquals(this.f16895f, cVar.f16895f) && Arrays.equals(this.h, cVar.h) && this.f16896n == cVar.f16896n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16891a, this.f16892b, this.f16893c, this.d, this.f16897r, null, null, this.f16894e, this.f16895f, this.h, Boolean.valueOf(this.f16896n)});
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("LogEventParcelable[");
        sb2.append(this.f16891a);
        sb2.append(", LogEventBytes: ");
        byte[] bArr = this.f16892b;
        if (bArr == null) {
            str = null;
        } else {
            str = new String(bArr);
        }
        sb2.append(str);
        sb2.append(", TestCodes: ");
        sb2.append(Arrays.toString(this.f16893c));
        sb2.append(", MendelPackages: ");
        sb2.append(Arrays.toString(this.d));
        sb2.append(", LogEvent: ");
        sb2.append(this.f16897r);
        sb2.append(", ExtensionProducer: null, VeProducer: null, ExperimentIDs: ");
        sb2.append(Arrays.toString(this.f16894e));
        sb2.append(", ExperimentTokens: ");
        sb2.append(Arrays.toString(this.f16895f));
        sb2.append(", ExperimentTokensParcelables: ");
        sb2.append(Arrays.toString(this.h));
        sb2.append(", AddPhenotypeExperimentTokens: ");
        sb2.append(this.f16896n);
        sb2.append("]");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.l(parcel, 2, this.f16891a, i3);
        j8.a.d(parcel, 3, this.f16892b);
        j8.a.h(parcel, 4, this.f16893c);
        j8.a.n(parcel, 5, this.d);
        j8.a.h(parcel, 6, this.f16894e);
        j8.a.e(parcel, 7, this.f16895f);
        j8.a.r(parcel, 8, 4);
        parcel.writeInt(this.f16896n ? 1 : 0);
        j8.a.p(parcel, 9, this.h, i3);
        j8.a.t(parcel, s6);
    }

    public c(b2 b2Var, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z10, m8.a[] aVarArr) {
        this.f16891a = b2Var;
        this.f16892b = bArr;
        this.f16893c = iArr;
        this.d = strArr;
        this.f16897r = null;
        this.f16894e = iArr2;
        this.f16895f = bArr2;
        this.h = aVarArr;
        this.f16896n = z10;
    }
}
