package f2;

import b2.q0;
import b2.s0;
import com.google.android.gms.internal.play_billing.k3;
import e2.m0;
import e2.x;
import java.util.ArrayList;
import java.util.Arrays;
import v7.b8;
import v7.u6;
public final class b implements s0 {
    public final String f10281a;
    public final byte[] f10282b;
    public final int f10283c;
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
                u6.g(r2);
                break;
            case 1:
                if (i11 == 75 && bArr.length == 1 && ((b10 = bArr[0]) == 0 || b10 == 1)) {
                    r2 = true;
                }
                u6.g(r2);
                break;
            case 2:
            case 3:
                if (i11 == 78 && bArr.length == 8) {
                    r2 = true;
                }
                u6.g(r2);
                break;
            case 4:
                u6.g(i11 == 0);
                break;
        }
        this.f10281a = str;
        this.f10282b = bArr;
        this.f10283c = i10;
        this.d = i11;
    }

    @Override
    public final b2.w a() {
        return null;
    }

    @Override
    public final byte[] c() {
        return null;
    }

    public final ArrayList d() {
        u6.o("Metadata is not an auxiliary tracks map", this.f10281a.equals("auxiliary.tracks.map"));
        byte[] bArr = this.f10282b;
        byte b10 = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < b10; i10 = k3.f(bArr[i10 + 2], i10, 1, arrayList)) {
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f10281a.equals(bVar.f10281a) && Arrays.equals(this.f10282b, bVar.f10282b) && this.f10283c == bVar.f10283c && this.d == bVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f10282b) + a1.g.g(527, 31, this.f10281a)) * 31) + this.f10283c) * 31) + this.d;
    }

    public final String toString() {
        String sb2;
        boolean z10;
        boolean z11;
        String str = this.f10281a;
        byte[] bArr = this.f10282b;
        int i10 = this.d;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 23) {
                    if (i10 != 67) {
                        if (i10 != 75) {
                            if (i10 == 78) {
                                sb2 = String.valueOf(new x(bArr).G());
                            }
                            sb2 = m0.f0(bArr);
                        } else {
                            sb2 = String.valueOf(bArr[0] & 255);
                        }
                    } else {
                        if (bArr.length >= 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        u6.d("array too small: %s < %s", bArr.length, 4, z11);
                        sb2 = String.valueOf(b8.c(bArr[0], bArr[1], bArr[2], bArr[3]));
                    }
                } else {
                    if (bArr.length >= 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    u6.d("array too small: %s < %s", bArr.length, 4, z10);
                    sb2 = String.valueOf(Float.intBitsToFloat(b8.c(bArr[0], bArr[1], bArr[2], bArr[3])));
                }
            } else {
                sb2 = m0.r(bArr);
            }
        } else {
            if (str.equals("auxiliary.tracks.map")) {
                ArrayList d = d();
                StringBuilder u10 = a1.g.u("track types = ");
                new d9.l(String.valueOf(',')).a(u10, d.iterator());
                sb2 = u10.toString();
            }
            sb2 = m0.f0(bArr);
        }
        return k3.k("mdta: key=", str, ", value=", sb2);
    }

    @Override
    public final void b(q0 q0Var) {
    }
}
