package k8;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.internal.play_billing.k3;
import g8.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import w7.f0;
import w7.g;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(19);
    public final String f14993a;
    public final byte[] f14994b;
    public final byte[][] f14995c;
    public final byte[][] d;
    public final byte[][] e;
    public final byte[][] f14996f;
    public final int[] h;
    public final byte[][] f14997n;

    public a(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6) {
        this.f14993a = str;
        this.f14994b = bArr;
        this.f14995c = bArr2;
        this.d = bArr3;
        this.e = bArr4;
        this.f14996f = bArr5;
        this.h = iArr;
        this.f14997n = bArr6;
    }

    public static List b(int[] iArr) {
        if (iArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        int i10 = 0;
        while (i10 < length) {
            i10 = k3.f(iArr[i10], i10, 1, arrayList);
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
            if (g.a(this.f14993a, aVar.f14993a) && Arrays.equals(this.f14994b, aVar.f14994b) && g.a(c(this.f14995c), c(aVar.f14995c)) && g.a(c(this.d), c(aVar.d)) && g.a(c(this.e), c(aVar.e)) && g.a(c(this.f14996f), c(aVar.f14996f)) && g.a(b(this.h), b(aVar.h)) && g.a(c(this.f14997n), c(aVar.f14997n))) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String sb2;
        StringBuilder sb3 = new StringBuilder("ExperimentTokens");
        sb3.append("(");
        String str = this.f14993a;
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
        byte[] bArr = this.f14994b;
        if (bArr == null) {
            sb3.append("null");
        } else {
            sb3.append("'");
            sb3.append(Base64.encodeToString(bArr, 3));
            sb3.append("'");
        }
        sb3.append(", ");
        d(sb3, "GAIA", this.f14995c);
        sb3.append(", ");
        d(sb3, "PSEUDO", this.d);
        sb3.append(", ");
        d(sb3, "ALWAYS", this.e);
        sb3.append(", ");
        d(sb3, "OTHER", this.f14996f);
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
        d(sb3, "directs", this.f14997n);
        sb3.append(")");
        return sb3.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.f14993a);
        f0.c(parcel, 3, this.f14994b);
        f0.d(parcel, 4, this.f14995c);
        f0.d(parcel, 5, this.d);
        f0.d(parcel, 6, this.e);
        f0.d(parcel, 7, this.f14996f);
        f0.g(parcel, 8, this.h);
        f0.d(parcel, 9, this.f14997n);
        f0.r(parcel, q6);
    }
}
