package l6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.internal.clearcut.b2;
import com.google.android.gms.internal.clearcut.v1;
import java.util.Arrays;
import q6.m;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new j7.b(27);
    public final b2 f19322a;
    public byte[] f19323b;
    public final int[] f19324c;
    public final String[] d;
    public final int[] f19325e;
    public final byte[][] f19326f;
    public final n8.a[] h;
    public final boolean f19327n;
    public final v1 f19328r;

    public c(b2 b2Var, v1 v1Var) {
        this.f19322a = b2Var;
        this.f19328r = v1Var;
        this.f19324c = null;
        this.d = null;
        this.f19325e = null;
        this.f19326f = null;
        this.h = null;
        this.f19327n = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (m.k(this.f19322a, cVar.f19322a) && Arrays.equals(this.f19323b, cVar.f19323b) && Arrays.equals(this.f19324c, cVar.f19324c) && Arrays.equals(this.d, cVar.d) && m.k(this.f19328r, cVar.f19328r) && m.k(null, null) && m.k(null, null) && Arrays.equals(this.f19325e, cVar.f19325e) && Arrays.deepEquals(this.f19326f, cVar.f19326f) && Arrays.equals(this.h, cVar.h) && this.f19327n == cVar.f19327n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19322a, this.f19323b, this.f19324c, this.d, this.f19328r, null, null, this.f19325e, this.f19326f, this.h, Boolean.valueOf(this.f19327n)});
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("LogEventParcelable[");
        sb2.append(this.f19322a);
        sb2.append(", LogEventBytes: ");
        byte[] bArr = this.f19323b;
        if (bArr == null) {
            str = null;
        } else {
            str = new String(bArr);
        }
        sb2.append(str);
        sb2.append(", TestCodes: ");
        sb2.append(Arrays.toString(this.f19324c));
        sb2.append(", MendelPackages: ");
        sb2.append(Arrays.toString(this.d));
        sb2.append(", LogEvent: ");
        sb2.append(this.f19328r);
        sb2.append(", ExtensionProducer: null, VeProducer: null, ExperimentIDs: ");
        sb2.append(Arrays.toString(this.f19325e));
        sb2.append(", ExperimentTokens: ");
        sb2.append(Arrays.toString(this.f19326f));
        sb2.append(", ExperimentTokensParcelables: ");
        sb2.append(Arrays.toString(this.h));
        sb2.append(", AddPhenotypeExperimentTokens: ");
        sb2.append(this.f19327n);
        sb2.append("]");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.k(parcel, 2, this.f19322a, i7);
        yb.c(parcel, 3, this.f19323b);
        yb.g(parcel, 4, this.f19324c);
        yb.m(parcel, 5, this.d);
        yb.g(parcel, 6, this.f19325e);
        yb.d(parcel, 7, this.f19326f);
        yb.q(parcel, 8, 4);
        parcel.writeInt(this.f19327n ? 1 : 0);
        yb.o(parcel, 9, this.h, i7);
        yb.s(parcel, r10);
    }

    public c(b2 b2Var, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z10, n8.a[] aVarArr) {
        this.f19322a = b2Var;
        this.f19323b = bArr;
        this.f19324c = iArr;
        this.d = strArr;
        this.f19328r = null;
        this.f19325e = iArr2;
        this.f19326f = bArr2;
        this.h = aVarArr;
        this.f19327n = z10;
    }
}
