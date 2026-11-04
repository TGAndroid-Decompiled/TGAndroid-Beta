package m8;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import b8.de;
import i7.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class a extends q6.a {
    public static final Parcelable.Creator<a> CREATOR = new p(26);
    public final String f19214a;
    public final byte[] f19215b;
    public final byte[][] f19216c;
    public final byte[][] d;
    public final byte[][] f19217e;
    public final byte[][] f19218f;
    public final int[] h;
    public final byte[][] f19219n;

    public a(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6) {
        this.f19214a = str;
        this.f19215b = bArr;
        this.f19216c = bArr2;
        this.d = bArr3;
        this.f19217e = bArr4;
        this.f19218f = bArr5;
        this.h = iArr;
        this.f19219n = bArr6;
    }

    public static List b(int[] iArr) {
        if (iArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        int i3 = 0;
        while (i3 < length) {
            i3 = com.google.android.recaptcha.internal.a.f(iArr[i3], i3, 1, arrayList);
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
            int i3 = 0;
            while (i3 < length) {
                byte[] bArr2 = bArr[i3];
                if (!z10) {
                    sb2.append(", ");
                }
                sb2.append("'");
                sb2.append(Base64.encodeToString(bArr2, 3));
                sb2.append("'");
                i3++;
                z10 = false;
            }
            str2 = ")";
        }
        sb2.append(str2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (de.a(this.f19214a, aVar.f19214a) && Arrays.equals(this.f19215b, aVar.f19215b) && de.a(c(this.f19216c), c(aVar.f19216c)) && de.a(c(this.d), c(aVar.d)) && de.a(c(this.f19217e), c(aVar.f19217e)) && de.a(c(this.f19218f), c(aVar.f19218f)) && de.a(b(this.h), b(aVar.h)) && de.a(c(this.f19219n), c(aVar.f19219n))) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String sb2;
        StringBuilder sb3 = new StringBuilder("ExperimentTokens");
        sb3.append("(");
        String str = this.f19214a;
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
        byte[] bArr = this.f19215b;
        if (bArr == null) {
            sb3.append("null");
        } else {
            sb3.append("'");
            sb3.append(Base64.encodeToString(bArr, 3));
            sb3.append("'");
        }
        sb3.append(", ");
        d(sb3, "GAIA", this.f19216c);
        sb3.append(", ");
        d(sb3, "PSEUDO", this.d);
        sb3.append(", ");
        d(sb3, "ALWAYS", this.f19217e);
        sb3.append(", ");
        d(sb3, "OTHER", this.f19218f);
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
            int i3 = 0;
            while (i3 < length) {
                int i10 = iArr[i3];
                if (!z10) {
                    sb3.append(", ");
                }
                sb3.append(i10);
                i3++;
                z10 = false;
            }
            sb3.append(")");
        }
        sb3.append(", ");
        d(sb3, "directs", this.f19219n);
        sb3.append(")");
        return sb3.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.f19214a);
        j8.a.d(parcel, 3, this.f19215b);
        j8.a.e(parcel, 4, this.f19216c);
        j8.a.e(parcel, 5, this.d);
        j8.a.e(parcel, 6, this.f19217e);
        j8.a.e(parcel, 7, this.f19218f);
        j8.a.h(parcel, 8, this.h);
        j8.a.e(parcel, 9, this.f19219n);
        j8.a.t(parcel, s6);
    }
}
