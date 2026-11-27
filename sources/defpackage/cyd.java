package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class cyd extends c4 {
    public static final Parcelable.Creator<cyd> CREATOR = new g3e((byte) 2);
    public final vff a;
    public byte[] b;
    public final int[] c;
    public final String[] d;
    public final int[] e;
    public final byte[][] f;
    public final g74[] h;
    public final boolean n;
    public final khe r;

    public cyd(vff vffVar, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z, g74[] g74VarArr) {
        this.a = vffVar;
        this.b = bArr;
        this.c = iArr;
        this.d = strArr;
        this.r = null;
        this.e = iArr2;
        this.f = bArr2;
        this.h = g74VarArr;
        this.n = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cyd) {
            cyd cydVar = (cyd) obj;
            if (vue.a(this.a, cydVar.a) && Arrays.equals(this.b, cydVar.b) && Arrays.equals(this.c, cydVar.c) && Arrays.equals(this.d, cydVar.d) && vue.a(this.r, cydVar.r) && vue.a(null, null) && vue.a(null, null) && Arrays.equals(this.e, cydVar.e) && Arrays.deepEquals(this.f, cydVar.f) && Arrays.equals(this.h, cydVar.h) && this.n == cydVar.n) {
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
        int r = bye.r(parcel, 20293);
        bye.k(parcel, 2, this.a, i);
        bye.c(parcel, 3, this.b);
        bye.g(parcel, 4, this.c);
        bye.m(parcel, 5, this.d);
        bye.g(parcel, 6, this.e);
        bye.d(parcel, 7, this.f);
        bye.q(parcel, 8, 4);
        parcel.writeInt(this.n ? 1 : 0);
        bye.o(parcel, 9, this.h, i);
        bye.s(parcel, r);
    }

    public cyd(vff vffVar, khe kheVar) {
        this.a = vffVar;
        this.r = kheVar;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.h = null;
        this.n = true;
    }
}
