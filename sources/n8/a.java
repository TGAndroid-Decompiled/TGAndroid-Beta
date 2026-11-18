package n8;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import c8.ba;
import c8.bc;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import m6.e;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new e(11);
    public final String f21456a;
    public final byte[] f21457b;
    public final byte[][] f21458c;
    public final byte[][] d;
    public final byte[][] f21459e;
    public final byte[][] f21460f;
    public final int[] h;
    public final byte[][] f21461n;

    public a(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6) {
        this.f21456a = str;
        this.f21457b = bArr;
        this.f21458c = bArr2;
        this.d = bArr3;
        this.f21459e = bArr4;
        this.f21460f = bArr5;
        this.h = iArr;
        this.f21461n = bArr6;
    }

    public static List b(int[] iArr) {
        if (iArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        int i7 = 0;
        while (i7 < length) {
            i7 = e2.f(iArr[i7], i7, 1, arrayList);
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
            int i7 = 0;
            while (i7 < length) {
                byte[] bArr2 = bArr[i7];
                if (!z10) {
                    sb2.append(", ");
                }
                sb2.append("'");
                sb2.append(Base64.encodeToString(bArr2, 3));
                sb2.append("'");
                i7++;
                z10 = false;
            }
            str2 = ")";
        }
        sb2.append(str2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (ba.a(this.f21456a, aVar.f21456a) && Arrays.equals(this.f21457b, aVar.f21457b) && ba.a(c(this.f21458c), c(aVar.f21458c)) && ba.a(c(this.d), c(aVar.d)) && ba.a(c(this.f21459e), c(aVar.f21459e)) && ba.a(c(this.f21460f), c(aVar.f21460f)) && ba.a(b(this.h), b(aVar.h)) && ba.a(c(this.f21461n), c(aVar.f21461n))) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String sb2;
        StringBuilder sb3 = new StringBuilder("ExperimentTokens");
        sb3.append("(");
        String str = this.f21456a;
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
        byte[] bArr = this.f21457b;
        if (bArr == null) {
            sb3.append("null");
        } else {
            sb3.append("'");
            sb3.append(Base64.encodeToString(bArr, 3));
            sb3.append("'");
        }
        sb3.append(", ");
        d(sb3, "GAIA", this.f21458c);
        sb3.append(", ");
        d(sb3, "PSEUDO", this.d);
        sb3.append(", ");
        d(sb3, "ALWAYS", this.f21459e);
        sb3.append(", ");
        d(sb3, "OTHER", this.f21460f);
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
            int i7 = 0;
            while (i7 < length) {
                int i10 = iArr[i7];
                if (!z10) {
                    sb3.append(", ");
                }
                sb3.append(i10);
                i7++;
                z10 = false;
            }
            sb3.append(")");
        }
        sb3.append(", ");
        d(sb3, "directs", this.f21461n);
        sb3.append(")");
        return sb3.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f21456a);
        bc.c(parcel, 3, this.f21457b);
        bc.d(parcel, 4, this.f21458c);
        bc.d(parcel, 5, this.d);
        bc.d(parcel, 6, this.f21459e);
        bc.d(parcel, 7, this.f21460f);
        bc.g(parcel, 8, this.h);
        bc.d(parcel, 9, this.f21461n);
        bc.s(parcel, r10);
    }
}
