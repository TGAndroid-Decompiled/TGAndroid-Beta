package i2;

import a8.ia;
import c8.e1;
import e2.n0;
import e2.p0;
import h2.m0;
import h2.x;
import java.util.ArrayList;
import java.util.Arrays;
public final class a implements p0 {
    public final String f15147a;
    public final byte[] f15148b;
    public final int f15149c;
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
                ia.f(r2);
                break;
            case 1:
                if (i10 == 75 && bArr.length == 1 && ((b10 = bArr[0]) == 0 || b10 == 1)) {
                    r2 = true;
                }
                ia.f(r2);
                break;
            case 2:
            case 3:
                if (i10 == 78 && bArr.length == 8) {
                    r2 = true;
                }
                ia.f(r2);
                break;
            case 4:
                ia.f(i10 == 0);
                break;
        }
        this.f15147a = str;
        this.f15148b = bArr;
        this.f15149c = i7;
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
        ia.o("Metadata is not an auxiliary tracks map", this.f15147a.equals("auxiliary.tracks.map"));
        byte[] bArr = this.f15148b;
        byte b10 = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < b10; i7 = com.google.android.recaptcha.internal.a.f(bArr[i7 + 2], i7, 1, arrayList)) {
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f15147a.equals(aVar.f15147a) && Arrays.equals(this.f15148b, aVar.f15148b) && this.f15149c == aVar.f15149c && this.d == aVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f15148b) + com.google.android.recaptcha.internal.a.h(527, 31, this.f15147a)) * 31) + this.f15149c) * 31) + this.d;
    }

    public final String toString() {
        String sb2;
        boolean z9;
        boolean z10;
        String str = this.f15147a;
        byte[] bArr = this.f15148b;
        int i7 = this.d;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 23) {
                    if (i7 != 67) {
                        if (i7 != 75) {
                            if (i7 == 78) {
                                sb2 = String.valueOf(new x(bArr).G());
                            }
                            sb2 = m0.f0(bArr);
                        } else {
                            sb2 = String.valueOf(bArr[0] & 255);
                        }
                    } else {
                        if (bArr.length >= 4) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        ia.b(bArr.length, 4, "array too small: %s < %s", z10);
                        sb2 = String.valueOf(e1.c(bArr[0], bArr[1], bArr[2], bArr[3]));
                    }
                } else {
                    if (bArr.length >= 4) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    ia.b(bArr.length, 4, "array too small: %s < %s", z9);
                    sb2 = String.valueOf(Float.intBitsToFloat(e1.c(bArr[0], bArr[1], bArr[2], bArr[3])));
                }
            } else {
                sb2 = m0.r(bArr);
            }
        } else {
            if (str.equals("auxiliary.tracks.map")) {
                ArrayList d = d();
                StringBuilder m10 = com.google.android.recaptcha.internal.a.m("track types = ");
                new g9.l(String.valueOf(','), 0).a(m10, d.iterator());
                sb2 = m10.toString();
            }
            sb2 = m0.f0(bArr);
        }
        return com.google.android.recaptcha.internal.a.l("mdta: key=", str, ", value=", sb2);
    }

    @Override
    public final void b(n0 n0Var) {
    }
}
