package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class mtd extends b4 {
    public static final Parcelable.Creator<mtd> CREATOR = new qyd((byte) 2);
    public final fbf a;
    public byte[] b;
    public final int[] c;
    public final String[] d;
    public final int[] e;
    public final byte[][] f;
    public final m64[] h;
    public final boolean n;
    public final tce r;

    public mtd(fbf fbfVar, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z, m64[] m64VarArr) {
        this.a = fbfVar;
        this.b = bArr;
        this.c = iArr;
        this.d = strArr;
        this.r = null;
        this.e = iArr2;
        this.f = bArr2;
        this.h = m64VarArr;
        this.n = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mtd) {
            mtd mtdVar = (mtd) obj;
            if (cqe.a(this.a, mtdVar.a) && Arrays.equals(this.b, mtdVar.b) && Arrays.equals(this.c, mtdVar.c) && Arrays.equals(this.d, mtdVar.d) && cqe.a(this.r, mtdVar.r) && cqe.a(null, null) && cqe.a(null, null) && Arrays.equals(this.e, mtdVar.e) && Arrays.deepEquals(this.f, mtdVar.f) && Arrays.equals(this.h, mtdVar.h) && this.n == mtdVar.n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.r, null, null, this.e, this.f, this.h, Boolean.valueOf(this.n)});
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("LogEventParcelable[");
        sb.append(this.a);
        sb.append(", LogEventBytes: ");
        byte[] bArr = this.b;
        if (bArr == null) {
            str = null;
        } else {
            str = new String(bArr);
        }
        sb.append(str);
        sb.append(", TestCodes: ");
        sb.append(Arrays.toString(this.c));
        sb.append(", MendelPackages: ");
        sb.append(Arrays.toString(this.d));
        sb.append(", LogEvent: ");
        sb.append(this.r);
        sb.append(", ExtensionProducer: null, VeProducer: null, ExperimentIDs: ");
        sb.append(Arrays.toString(this.e));
        sb.append(", ExperimentTokens: ");
        sb.append(Arrays.toString(this.f));
        sb.append(", ExperimentTokensParcelables: ");
        sb.append(Arrays.toString(this.h));
        sb.append(", AddPhenotypeExperimentTokens: ");
        sb.append(this.n);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.k(parcel, 2, this.a, i);
        jte.c(parcel, 3, this.b);
        jte.g(parcel, 4, this.c);
        jte.m(parcel, 5, this.d);
        jte.g(parcel, 6, this.e);
        jte.d(parcel, 7, this.f);
        jte.q(parcel, 8, 4);
        parcel.writeInt(this.n ? 1 : 0);
        jte.o(parcel, 9, this.h, i);
        jte.s(parcel, r);
    }

    public mtd(fbf fbfVar, tce tceVar) {
        this.a = fbfVar;
        this.r = tceVar;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.h = null;
        this.n = true;
    }
}
