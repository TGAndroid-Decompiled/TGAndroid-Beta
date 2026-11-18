package i2;

import a8.la;
import c8.k1;
import com.google.android.gms.internal.vision.e2;
import e2.n0;
import e2.p0;
import h2.l0;
import h2.x;
import java.util.ArrayList;
import java.util.Arrays;
public final class a implements p0 {
    public final String f15919a;
    public final byte[] f15920b;
    public final int f15921c;
    public final int d;

    public a(String str, byte[] bArr, int i7, int i10) {
        byte b10;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1949883051:
                if (str.equals("com.android.capture.fps")) {
                    c10 = 0;
                    break;
                }
                break;
            case -269399509:
                if (str.equals("auxiliary.tracks.interleaved")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1011693540:
                if (str.equals("auxiliary.tracks.length")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1098277265:
                if (str.equals("auxiliary.tracks.offset")) {
                    c10 = 3;
                    break;
                }
                break;
            case 2002123038:
                if (str.equals("auxiliary.tracks.map")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                if (i10 == 23 && bArr.length == 4) {
                    r2 = true;
                }
                la.f(r2);
                break;
            case 1:
                if (i10 == 75 && bArr.length == 1 && ((b10 = bArr[0]) == 0 || b10 == 1)) {
                    r2 = true;
                }
                la.f(r2);
                break;
            case 2:
            case 3:
                if (i10 == 78 && bArr.length == 8) {
                    r2 = true;
                }
                la.f(r2);
                break;
            case 4:
                la.f(i10 == 0);
                break;
        }
        this.f15919a = str;
        this.f15920b = bArr;
        this.f15921c = i7;
        this.d = i10;
    }

    @Override
    public final e2.u a() {
        return null;
    }

    @Override
    public final byte[] c() {
        return null;
    }

    public final ArrayList d() {
        la.o("Metadata is not an auxiliary tracks map", this.f15919a.equals("auxiliary.tracks.map"));
        byte[] bArr = this.f15920b;
        byte b10 = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < b10; i7 = e2.f(bArr[i7 + 2], i7, 1, arrayList)) {
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f15919a.equals(aVar.f15919a) && Arrays.equals(this.f15920b, aVar.f15920b) && this.f15921c == aVar.f15921c && this.d == aVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f15920b) + e2.h(527, 31, this.f15919a)) * 31) + this.f15921c) * 31) + this.d;
    }

    public final String toString() {
        String sb2;
        boolean z10;
        boolean z11;
        String str = this.f15919a;
        byte[] bArr = this.f15920b;
        int i7 = this.d;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 23) {
                    if (i7 != 67) {
                        if (i7 != 75) {
                            if (i7 == 78) {
                                sb2 = String.valueOf(new x(bArr).G());
                            }
                            sb2 = l0.f0(bArr);
                        } else {
                            sb2 = String.valueOf(bArr[0] & 255);
                        }
                    } else {
                        if (bArr.length >= 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        la.b(bArr.length, 4, "array too small: %s < %s", z11);
                        sb2 = String.valueOf(k1.c(bArr[0], bArr[1], bArr[2], bArr[3]));
                    }
                } else {
                    if (bArr.length >= 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    la.b(bArr.length, 4, "array too small: %s < %s", z10);
                    sb2 = String.valueOf(Float.intBitsToFloat(k1.c(bArr[0], bArr[1], bArr[2], bArr[3])));
                }
            } else {
                sb2 = l0.r(bArr);
            }
        } else {
            if (str.equals("auxiliary.tracks.map")) {
                ArrayList d = d();
                StringBuilder m10 = e2.m("track types = ");
                new f5.g(String.valueOf(',')).a(m10, d.iterator());
                sb2 = m10.toString();
            }
            sb2 = l0.f0(bArr);
        }
        return e2.l("mdta: key=", str, ", value=", sb2);
    }

    @Override
    public final void b(n0 n0Var) {
    }
}
