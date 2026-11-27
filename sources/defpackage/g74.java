package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class g74 extends c4 {
    public static final Parcelable.Creator<g74> CREATOR = new g3e((byte) 23);
    public final String a;
    public final byte[] b;
    public final byte[][] c;
    public final byte[][] d;
    public final byte[][] e;
    public final byte[][] f;
    public final int[] h;
    public final byte[][] n;

    public g74(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6) {
        this.a = str;
        this.b = bArr;
        this.c = bArr2;
        this.d = bArr3;
        this.e = bArr4;
        this.f = bArr5;
        this.h = iArr;
        this.n = bArr6;
    }

    public static List b(int[] iArr) {
        if (iArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        int i = 0;
        while (i < length) {
            i = qd4.g(iArr[i], i, 1, arrayList);
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static List c(byte[][] bArr) {
        if (bArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte[] bArr2 : bArr) {
            arrayList.add(Base64.encodeToString(bArr2, 3));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static void d(StringBuilder sb, String str, byte[][] bArr) {
        String str2;
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            str2 = "null";
        } else {
            sb.append("(");
            int length = bArr.length;
            boolean z = true;
            int i = 0;
            while (i < length) {
                byte[] bArr2 = bArr[i];
                if (!z) {
                    sb.append(", ");
                }
                sb.append("'");
                sb.append(Base64.encodeToString(bArr2, 3));
                sb.append("'");
                i++;
                z = false;
            }
            str2 = ")";
        }
        sb.append(str2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g74) {
            g74 g74Var = (g74) obj;
            if (h8f.a(this.a, g74Var.a) && Arrays.equals(this.b, g74Var.b) && h8f.a(c(this.c), c(g74Var.c)) && h8f.a(c(this.d), c(g74Var.d)) && h8f.a(c(this.e), c(g74Var.e)) && h8f.a(c(this.f), c(g74Var.f)) && h8f.a(b(this.h), b(g74Var.h)) && h8f.a(c(this.n), c(g74Var.n))) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String sb;
        StringBuilder l = c00.l("ExperimentTokens", "(");
        String str = this.a;
        if (str == null) {
            sb = "null";
        } else {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 2);
            sb2.append("'");
            sb2.append(str);
            sb2.append("'");
            sb = sb2.toString();
        }
        l.append(sb);
        l.append(", direct=");
        byte[] bArr = this.b;
        if (bArr == null) {
            l.append("null");
        } else {
            l.append("'");
            l.append(Base64.encodeToString(bArr, 3));
            l.append("'");
        }
        l.append(", ");
        d(l, "GAIA", this.c);
        l.append(", ");
        d(l, "PSEUDO", this.d);
        l.append(", ");
        d(l, "ALWAYS", this.e);
        l.append(", ");
        d(l, "OTHER", this.f);
        l.append(", ");
        l.append("weak");
        l.append("=");
        int[] iArr = this.h;
        if (iArr == null) {
            l.append("null");
        } else {
            l.append("(");
            int length = iArr.length;
            boolean z = true;
            int i = 0;
            while (i < length) {
                int i2 = iArr[i];
                if (!z) {
                    l.append(", ");
                }
                l.append(i2);
                i++;
                z = false;
            }
            l.append(")");
        }
        l.append(", ");
        d(l, "directs", this.n);
        l.append(")");
        return l.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 2, this.a);
        bye.c(parcel, 3, this.b);
        bye.d(parcel, 4, this.c);
        bye.d(parcel, 5, this.d);
        bye.d(parcel, 6, this.e);
        bye.d(parcel, 7, this.f);
        bye.g(parcel, 8, this.h);
        bye.d(parcel, 9, this.n);
        bye.s(parcel, r);
    }
}
