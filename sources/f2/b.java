package f2;

import b2.r0;
import b2.t0;
import b2.x;
import c3.i0;
import e2.l0;
import java.util.ArrayList;
import java.util.Arrays;
import v7.c8;
import v7.t6;
public final class b implements t0 {
    public final String f6729a;
    public final byte[] f6730b;
    public final int f6731c;
    public final int d;

    public b(String str, byte[] bArr, int i10, int i11) {
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
                if (i11 == 23 && bArr.length == 4) {
                    r2 = true;
                }
                t6.f(r2);
                break;
            case 1:
                if (i11 == 75 && bArr.length == 1 && ((b10 = bArr[0]) == 0 || b10 == 1)) {
                    r2 = true;
                }
                t6.f(r2);
                break;
            case 2:
            case 3:
                if (i11 == 78 && bArr.length == 8) {
                    r2 = true;
                }
                t6.f(r2);
                break;
            case 4:
                t6.f(i11 == 0);
                break;
        }
        this.f6729a = str;
        this.f6730b = bArr;
        this.f6731c = i10;
        this.d = i11;
    }

    @Override
    public final x a() {
        return null;
    }

    @Override
    public final byte[] c() {
        return null;
    }

    public final ArrayList d() {
        t6.o("Metadata is not an auxiliary tracks map", this.f6729a.equals("auxiliary.tracks.map"));
        byte[] bArr = this.f6730b;
        byte b10 = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < b10; i10 = i0.j(bArr[i10 + 2], i10, 1, arrayList)) {
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f6729a.equals(bVar.f6729a) && Arrays.equals(this.f6730b, bVar.f6730b) && this.f6731c == bVar.f6731c && this.d == bVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f6730b) + a1.g.f(527, 31, this.f6729a)) * 31) + this.f6731c) * 31) + this.d;
    }

    public final String toString() {
        String sb2;
        boolean z10;
        boolean z11;
        String str = this.f6729a;
        byte[] bArr = this.f6730b;
        int i10 = this.d;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 23) {
                    if (i10 != 67) {
                        if (i10 != 75) {
                            if (i10 == 78) {
                                sb2 = String.valueOf(new e2.x(bArr).G());
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
                        t6.b(bArr.length, 4, "array too small: %s < %s", z11);
                        sb2 = String.valueOf(c8.c(bArr[0], bArr[1], bArr[2], bArr[3]));
                    }
                } else {
                    if (bArr.length >= 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    t6.b(bArr.length, 4, "array too small: %s < %s", z10);
                    sb2 = String.valueOf(Float.intBitsToFloat(c8.c(bArr[0], bArr[1], bArr[2], bArr[3])));
                }
            } else {
                sb2 = l0.r(bArr);
            }
        } else {
            if (str.equals("auxiliary.tracks.map")) {
                ArrayList d = d();
                StringBuilder t10 = a1.g.t("track types = ");
                new com.google.android.gms.internal.clearcut.e(String.valueOf(','), 1).a(t10, d.iterator());
                sb2 = t10.toString();
            }
            sb2 = l0.f0(bArr);
        }
        return i0.n("mdta: key=", str, ", value=", sb2);
    }

    @Override
    public final void b(r0 r0Var) {
    }
}
