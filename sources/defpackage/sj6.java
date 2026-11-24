package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
public final class sj6 implements jd7 {
    public final String a;
    public final byte[] b;
    public final int c;
    public final int d;

    public sj6(String str, byte[] bArr, int i, int i2) {
        byte b;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1949883051:
                if (str.equals("com.android.capture.fps")) {
                    c = 0;
                    break;
                }
                break;
            case -269399509:
                if (str.equals("auxiliary.tracks.interleaved")) {
                    c = 1;
                    break;
                }
                break;
            case 1011693540:
                if (str.equals("auxiliary.tracks.length")) {
                    c = 2;
                    break;
                }
                break;
            case 1098277265:
                if (str.equals("auxiliary.tracks.offset")) {
                    c = 3;
                    break;
                }
                break;
            case 2002123038:
                if (str.equals("auxiliary.tracks.map")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                if (i2 == 23 && bArr.length == 4) {
                    r2 = true;
                }
                gre.f(r2);
                break;
            case 1:
                if (i2 == 75 && bArr.length == 1 && ((b = bArr[0]) == 0 || b == 1)) {
                    r2 = true;
                }
                gre.f(r2);
                break;
            case 2:
            case 3:
                if (i2 == 78 && bArr.length == 8) {
                    r2 = true;
                }
                gre.f(r2);
                break;
            case 4:
                gre.f(i2 == 0);
                break;
        }
        this.a = str;
        this.b = bArr;
        this.c = i;
        this.d = i2;
    }

    @Override
    public final fm4 a() {
        return null;
    }

    @Override
    public final byte[] c() {
        return null;
    }

    public final ArrayList d() {
        gre.o("Metadata is not an auxiliary tracks map", this.a.equals("auxiliary.tracks.map"));
        byte[] bArr = this.b;
        byte b = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b; i = tb4.g(bArr[i + 2] & 255, i, 1, arrayList)) {
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && sj6.class == obj.getClass()) {
                sj6 sj6Var = (sj6) obj;
                if (this.a.equals(sj6Var.a) && Arrays.equals(this.b, sj6Var.b) && this.c == sj6Var.c && this.d == sj6Var.d) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + ir2.j(527, 31, this.a)) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        String sb;
        boolean z;
        boolean z2;
        String str = this.a;
        byte[] bArr = this.b;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 23) {
                    if (i != 67) {
                        if (i != 75) {
                            if (i == 78) {
                                sb = String.valueOf(new xu7(bArr).G());
                            }
                            sb = g8c.g0(bArr);
                        } else {
                            sb = String.valueOf(bArr[0] & 255);
                        }
                    } else {
                        if (bArr.length >= 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        gre.b(bArr.length, 4, "array too small: %s < %s", z2);
                        sb = String.valueOf(gle.c(bArr[0], bArr[1], bArr[2], bArr[3]));
                    }
                } else {
                    if (bArr.length >= 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    gre.b(bArr.length, 4, "array too small: %s < %s", z);
                    sb = String.valueOf(Float.intBitsToFloat(gle.c(bArr[0], bArr[1], bArr[2], bArr[3])));
                }
            } else {
                sb = g8c.r(bArr);
            }
        } else {
            if (str.equals("auxiliary.tracks.map")) {
                ArrayList d = d();
                StringBuilder r = tb4.r("track types = ");
                new zb3(String.valueOf(',')).a(r, d.iterator());
                sb = r.toString();
            }
            sb = g8c.g0(bArr);
        }
        return tb4.q("mdta: key=", str, ", value=", sb);
    }

    @Override
    public final void b(hr6 hr6Var) {
    }
}
