package n8;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import c8.aa;
import c8.xb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import m6.e;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new e(11);
    public final String f20531a;
    public final byte[] f20532b;
    public final byte[][] f20533c;
    public final byte[][] d;
    public final byte[][] f20534e;
    public final byte[][] f20535f;
    public final int[] h;
    public final byte[][] f20536n;

    public a(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6) {
        this.f20531a = str;
        this.f20532b = bArr;
        this.f20533c = bArr2;
        this.d = bArr3;
        this.f20534e = bArr4;
        this.f20535f = bArr5;
        this.h = iArr;
        this.f20536n = bArr6;
    }

    public static List b(int[] iArr) {
        if (iArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        int i7 = 0;
        while (i7 < length) {
            i7 = com.google.android.recaptcha.internal.a.f(iArr[i7], i7, 1, arrayList);
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
            boolean z9 = true;
            int i7 = 0;
            while (i7 < length) {
                byte[] bArr2 = bArr[i7];
                if (!z9) {
                    sb2.append(", ");
                }
                sb2.append("'");
                sb2.append(Base64.encodeToString(bArr2, 3));
                sb2.append("'");
                i7++;
                z9 = false;
            }
            str2 = ")";
        }
        sb2.append(str2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (aa.a(this.f20531a, aVar.f20531a) && Arrays.equals(this.f20532b, aVar.f20532b) && aa.a(c(this.f20533c), c(aVar.f20533c)) && aa.a(c(this.d), c(aVar.d)) && aa.a(c(this.f20534e), c(aVar.f20534e)) && aa.a(c(this.f20535f), c(aVar.f20535f)) && aa.a(b(this.h), b(aVar.h)) && aa.a(c(this.f20536n), c(aVar.f20536n))) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String sb2;
        StringBuilder sb3 = new StringBuilder("ExperimentTokens");
        sb3.append("(");
        String str = this.f20531a;
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
        byte[] bArr = this.f20532b;
        if (bArr == null) {
            sb3.append("null");
        } else {
            sb3.append("'");
            sb3.append(Base64.encodeToString(bArr, 3));
            sb3.append("'");
        }
        sb3.append(", ");
        d(sb3, "GAIA", this.f20533c);
        sb3.append(", ");
        d(sb3, "PSEUDO", this.d);
        sb3.append(", ");
        d(sb3, "ALWAYS", this.f20534e);
        sb3.append(", ");
        d(sb3, "OTHER", this.f20535f);
        sb3.append(", ");
        sb3.append("weak");
        sb3.append("=");
        int[] iArr = this.h;
        if (iArr == null) {
            sb3.append("null");
        } else {
            sb3.append("(");
            int length = iArr.length;
            boolean z9 = true;
            int i7 = 0;
            while (i7 < length) {
                int i10 = iArr[i7];
                if (!z9) {
                    sb3.append(", ");
                }
                sb3.append(i10);
                i7++;
                z9 = false;
            }
            sb3.append(")");
        }
        sb3.append(", ");
        d(sb3, "directs", this.f20536n);
        sb3.append(")");
        return sb3.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f20531a);
        xb.c(parcel, 3, this.f20532b);
        xb.d(parcel, 4, this.f20533c);
        xb.d(parcel, 5, this.d);
        xb.d(parcel, 6, this.f20534e);
        xb.d(parcel, 7, this.f20535f);
        xb.g(parcel, 8, this.h);
        xb.d(parcel, 9, this.f20536n);
        xb.s(parcel, r10);
    }
}
