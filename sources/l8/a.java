package l8;

import a8.df;
import a8.xd;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import c3.h0;
import h8.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class a extends p6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(19);
    public final String f16952a;
    public final byte[] f16953b;
    public final byte[][] f16954c;
    public final byte[][] d;
    public final byte[][] e;
    public final byte[][] f16955f;
    public final int[] h;
    public final byte[][] f16956n;

    public a(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6) {
        this.f16952a = str;
        this.f16953b = bArr;
        this.f16954c = bArr2;
        this.d = bArr3;
        this.e = bArr4;
        this.f16955f = bArr5;
        this.h = iArr;
        this.f16956n = bArr6;
    }

    public static List b(int[] iArr) {
        if (iArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        int i10 = 0;
        while (i10 < length) {
            i10 = h0.i(iArr[i10], i10, 1, arrayList);
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

    public static void d(StringBuilder sb2, String str, byte[][] bArr) {
        String str2;
        sb2.append(str);
        sb2.append("=");
        if (bArr == null) {
            str2 = "null";
        } else {
            sb2.append("(");
            int length = bArr.length;
            boolean z10 = true;
            int i10 = 0;
            while (i10 < length) {
                byte[] bArr2 = bArr[i10];
                if (!z10) {
                    sb2.append(", ");
                }
                sb2.append("'");
                sb2.append(Base64.encodeToString(bArr2, 3));
                sb2.append("'");
                i10++;
                z10 = false;
            }
            str2 = ")";
        }
        sb2.append(str2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (xd.a(this.f16952a, aVar.f16952a) && Arrays.equals(this.f16953b, aVar.f16953b) && xd.a(c(this.f16954c), c(aVar.f16954c)) && xd.a(c(this.d), c(aVar.d)) && xd.a(c(this.e), c(aVar.e)) && xd.a(c(this.f16955f), c(aVar.f16955f)) && xd.a(b(this.h), b(aVar.h)) && xd.a(c(this.f16956n), c(aVar.f16956n))) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String sb2;
        StringBuilder sb3 = new StringBuilder("ExperimentTokens");
        sb3.append("(");
        String str = this.f16952a;
        if (str == null) {
            sb2 = "null";
        } else {
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 2);
            sb4.append("'");
            sb4.append(str);
            sb4.append("'");
            sb2 = sb4.toString();
        }
        sb3.append(sb2);
        sb3.append(", direct=");
        byte[] bArr = this.f16953b;
        if (bArr == null) {
            sb3.append("null");
        } else {
            sb3.append("'");
            sb3.append(Base64.encodeToString(bArr, 3));
            sb3.append("'");
        }
        sb3.append(", ");
        d(sb3, "GAIA", this.f16954c);
        sb3.append(", ");
        d(sb3, "PSEUDO", this.d);
        sb3.append(", ");
        d(sb3, "ALWAYS", this.e);
        sb3.append(", ");
        d(sb3, "OTHER", this.f16955f);
        sb3.append(", ");
        sb3.append("weak");
        sb3.append("=");
        int[] iArr = this.h;
        if (iArr == null) {
            sb3.append("null");
        } else {
            sb3.append("(");
            int length = iArr.length;
            boolean z10 = true;
            int i10 = 0;
            while (i10 < length) {
                int i11 = iArr[i10];
                if (!z10) {
                    sb3.append(", ");
                }
                sb3.append(i11);
                i10++;
                z10 = false;
            }
            sb3.append(")");
        }
        sb3.append(", ");
        d(sb3, "directs", this.f16956n);
        sb3.append(")");
        return sb3.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.f16952a);
        df.c(parcel, 3, this.f16953b);
        df.d(parcel, 4, this.f16954c);
        df.d(parcel, 5, this.d);
        df.d(parcel, 6, this.e);
        df.d(parcel, 7, this.f16955f);
        df.g(parcel, 8, this.h);
        df.d(parcel, 9, this.f16956n);
        df.r(parcel, q5);
    }
}
