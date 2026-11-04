package h2;

import b8.od;
import b8.zb;
import d2.p0;
import d2.r0;
import d2.v;
import g2.n0;
import g2.y;
import java.util.ArrayList;
import java.util.Arrays;
public final class a implements r0 {
    public final String f14100a;
    public final byte[] f14101b;
    public final int f14102c;
    public final int d;

    public a(String str, byte[] bArr, int i3, int i10) {
        byte b10;
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1949883051:
                if (str.equals("com.android.capture.fps")) {
                    c2 = 0;
                    break;
                }
                break;
            case -269399509:
                if (str.equals("auxiliary.tracks.interleaved")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1011693540:
                if (str.equals("auxiliary.tracks.length")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1098277265:
                if (str.equals("auxiliary.tracks.offset")) {
                    c2 = 3;
                    break;
                }
                break;
            case 2002123038:
                if (str.equals("auxiliary.tracks.map")) {
                    c2 = 4;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                if (i10 == 23 && bArr.length == 4) {
                    r2 = true;
                }
                zb.f(r2);
                break;
            case 1:
                if (i10 == 75 && bArr.length == 1 && ((b10 = bArr[0]) == 0 || b10 == 1)) {
                    r2 = true;
                }
                zb.f(r2);
                break;
            case 2:
            case 3:
                if (i10 == 78 && bArr.length == 8) {
                    r2 = true;
                }
                zb.f(r2);
                break;
            case 4:
                zb.f(i10 == 0);
                break;
        }
        this.f14100a = str;
        this.f14101b = bArr;
        this.f14102c = i3;
        this.d = i10;
    }

    @Override
    public final v b() {
        return null;
    }

    @Override
    public final byte[] c() {
        return null;
    }

    public final ArrayList d() {
        zb.o("Metadata is not an auxiliary tracks map", this.f14100a.equals("auxiliary.tracks.map"));
        byte[] bArr = this.f14101b;
        byte b10 = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < b10; i3 = com.google.android.recaptcha.internal.a.f(bArr[i3 + 2], i3, 1, arrayList)) {
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f14100a.equals(aVar.f14100a) && Arrays.equals(this.f14101b, aVar.f14101b) && this.f14102c == aVar.f14102c && this.d == aVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f14101b) + com.google.android.recaptcha.internal.a.g(527, 31, this.f14100a)) * 31) + this.f14102c) * 31) + this.d;
    }

    public final String toString() {
        String sb2;
        boolean z10;
        boolean z11;
        String str = this.f14100a;
        byte[] bArr = this.f14101b;
        int i3 = this.d;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 23) {
                    if (i3 != 67) {
                        if (i3 != 75) {
                            if (i3 == 78) {
                                sb2 = String.valueOf(new y(bArr).G());
                            }
                            sb2 = n0.f0(bArr);
                        } else {
                            sb2 = String.valueOf(bArr[0] & 255);
                        }
                    } else {
                        if (bArr.length >= 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        zb.b(bArr.length, 4, "array too small: %s < %s", z11);
                        sb2 = String.valueOf(od.c(bArr[0], bArr[1], bArr[2], bArr[3]));
                    }
                } else {
                    if (bArr.length >= 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zb.b(bArr.length, 4, "array too small: %s < %s", z10);
                    sb2 = String.valueOf(Float.intBitsToFloat(od.c(bArr[0], bArr[1], bArr[2], bArr[3])));
                }
            } else {
                sb2 = n0.r(bArr);
            }
        } else {
            if (str.equals("auxiliary.tracks.map")) {
                ArrayList d = d();
                StringBuilder l10 = com.google.android.recaptcha.internal.a.l("track types = ");
                new com.google.android.gms.internal.clearcut.e(String.valueOf(',')).a(l10, d.iterator());
                sb2 = l10.toString();
            }
            sb2 = n0.f0(bArr);
        }
        return com.google.android.recaptcha.internal.a.k("mdta: key=", str, ", value=", sb2);
    }

    @Override
    public final void a(p0 p0Var) {
    }
}
