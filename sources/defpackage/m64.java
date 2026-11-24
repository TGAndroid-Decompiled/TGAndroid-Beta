package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class m64 extends b4 {
    public static final Parcelable.Creator<m64> CREATOR = new qyd((byte) 23);
    public final String a;
    public final byte[] b;
    public final byte[][] c;
    public final byte[][] d;
    public final byte[][] e;
    public final byte[][] f;
    public final int[] h;
    public final byte[][] n;

    public m64(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6) {
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
            i = tb4.g(iArr[i], i, 1, arrayList);
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
        if (obj instanceof m64) {
            m64 m64Var = (m64) obj;
            if (j3f.a(this.a, m64Var.a) && Arrays.equals(this.b, m64Var.b) && j3f.a(c(this.c), c(m64Var.c)) && j3f.a(c(this.d), c(m64Var.d)) && j3f.a(c(this.e), c(m64Var.e)) && j3f.a(c(this.f), c(m64Var.f)) && j3f.a(b(this.h), b(m64Var.h)) && j3f.a(c(this.n), c(m64Var.n))) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String sb;
        StringBuilder k = b00.k("ExperimentTokens", "(");
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
        k.append(sb);
        k.append(", direct=");
        byte[] bArr = this.b;
        if (bArr == null) {
            k.append("null");
        } else {
            k.append("'");
            k.append(Base64.encodeToString(bArr, 3));
            k.append("'");
        }
        k.append(", ");
        d(k, "GAIA", this.c);
        k.append(", ");
        d(k, "PSEUDO", this.d);
        k.append(", ");
        d(k, "ALWAYS", this.e);
        k.append(", ");
        d(k, "OTHER", this.f);
        k.append(", ");
        k.append("weak");
        k.append("=");
        int[] iArr = this.h;
        if (iArr == null) {
            k.append("null");
        } else {
            k.append("(");
            int length = iArr.length;
            boolean z = true;
            int i = 0;
            while (i < length) {
                int i2 = iArr[i];
                if (!z) {
                    k.append(", ");
                }
                k.append(i2);
                i++;
                z = false;
            }
            k.append(")");
        }
        k.append(", ");
        d(k, "directs", this.n);
        k.append(")");
        return k.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 2, this.a);
        jte.c(parcel, 3, this.b);
        jte.d(parcel, 4, this.c);
        jte.d(parcel, 5, this.d);
        jte.d(parcel, 6, this.e);
        jte.d(parcel, 7, this.f);
        jte.g(parcel, 8, this.h);
        jte.d(parcel, 9, this.n);
        jte.s(parcel, r);
    }
}
