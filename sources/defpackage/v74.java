package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class v74 extends b4 {
    public static final Parcelable.Creator<v74> CREATOR = new t0e((byte) 23);
    public final String a;
    public final byte[] b;
    public final byte[][] c;
    public final byte[][] d;
    public final byte[][] e;
    public final byte[][] f;
    public final int[] h;
    public final byte[][] n;

    public v74(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6) {
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
            i = td4.g(iArr[i], i, 1, arrayList);
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
        if (obj instanceof v74) {
            v74 v74Var = (v74) obj;
            if (l5f.a(this.a, v74Var.a) && Arrays.equals(this.b, v74Var.b) && l5f.a(c(this.c), c(v74Var.c)) && l5f.a(c(this.d), c(v74Var.d)) && l5f.a(c(this.e), c(v74Var.e)) && l5f.a(c(this.f), c(v74Var.f)) && l5f.a(b(this.h), b(v74Var.h)) && l5f.a(c(this.n), c(v74Var.n))) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String sb;
        StringBuilder k = b10.k("ExperimentTokens", "(");
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
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 2, this.a);
        mve.c(parcel, 3, this.b);
        mve.d(parcel, 4, this.c);
        mve.d(parcel, 5, this.d);
        mve.d(parcel, 6, this.e);
        mve.d(parcel, 7, this.f);
        mve.g(parcel, 8, this.h);
        mve.d(parcel, 9, this.n);
        mve.s(parcel, r);
    }
}
