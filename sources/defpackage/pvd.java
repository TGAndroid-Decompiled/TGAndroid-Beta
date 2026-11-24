package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class pvd extends b4 {
    public static final Parcelable.Creator<pvd> CREATOR = new t0e((byte) 2);
    public final gdf a;
    public byte[] b;
    public final int[] c;
    public final String[] d;
    public final int[] e;
    public final byte[][] f;
    public final v74[] h;
    public final boolean n;
    public final uee r;

    public pvd(gdf gdfVar, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z, v74[] v74VarArr) {
        this.a = gdfVar;
        this.b = bArr;
        this.c = iArr;
        this.d = strArr;
        this.r = null;
        this.e = iArr2;
        this.f = bArr2;
        this.h = v74VarArr;
        this.n = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pvd) {
            pvd pvdVar = (pvd) obj;
            if (fse.a(this.a, pvdVar.a) && Arrays.equals(this.b, pvdVar.b) && Arrays.equals(this.c, pvdVar.c) && Arrays.equals(this.d, pvdVar.d) && fse.a(this.r, pvdVar.r) && fse.a(null, null) && fse.a(null, null) && Arrays.equals(this.e, pvdVar.e) && Arrays.deepEquals(this.f, pvdVar.f) && Arrays.equals(this.h, pvdVar.h) && this.n == pvdVar.n) {
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
        int r = mve.r(parcel, 20293);
        mve.k(parcel, 2, this.a, i);
        mve.c(parcel, 3, this.b);
        mve.g(parcel, 4, this.c);
        mve.m(parcel, 5, this.d);
        mve.g(parcel, 6, this.e);
        mve.d(parcel, 7, this.f);
        mve.q(parcel, 8, 4);
        parcel.writeInt(this.n ? 1 : 0);
        mve.o(parcel, 9, this.h, i);
        mve.s(parcel, r);
    }

    public pvd(gdf gdfVar, uee ueeVar) {
        this.a = gdfVar;
        this.r = ueeVar;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.h = null;
        this.n = true;
    }
}
