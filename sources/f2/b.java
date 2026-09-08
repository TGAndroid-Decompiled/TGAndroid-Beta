package f2;

import b2.m0;
import b2.o0;
import com.google.android.gms.internal.vision.e2;
import e2.d0;
import e2.v;
import java.util.ArrayList;
import java.util.Arrays;
import v7.u6;
import v7.x7;
public final class b implements o0 {
    public final String f9199a;
    public final byte[] f9200b;
    public final int f9201c;
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
                e2.d.b(r2);
                break;
            case 1:
                if (i11 == 75 && bArr.length == 1 && ((b10 = bArr[0]) == 0 || b10 == 1)) {
                    r2 = true;
                }
                e2.d.b(r2);
                break;
            case 2:
            case 3:
                if (i11 == 78 && bArr.length == 8) {
                    r2 = true;
                }
                e2.d.b(r2);
                break;
            case 4:
                e2.d.b(i11 == 0);
                break;
        }
        this.f9199a = str;
        this.f9200b = bArr;
        this.f9201c = i10;
        this.d = i11;
    }

    @Override
    public final b2.s a() {
        return null;
    }

    @Override
    public final byte[] c() {
        return null;
    }

    public final ArrayList d() {
        e2.d.f("Metadata is not an auxiliary tracks map", this.f9199a.equals("auxiliary.tracks.map"));
        byte[] bArr = this.f9200b;
        byte b10 = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < b10; i10 = e2.e(bArr[i10 + 2], i10, 1, arrayList)) {
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f9199a.equals(bVar.f9199a) && Arrays.equals(this.f9200b, bVar.f9200b) && this.f9201c == bVar.f9201c && this.d == bVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f9200b) + a4.a.h(527, 31, this.f9199a)) * 31) + this.f9201c) * 31) + this.d;
    }

    public final String toString() {
        String sb2;
        boolean z10;
        boolean z11;
        String str = this.f9199a;
        byte[] bArr = this.f9200b;
        int i10 = this.d;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 23) {
                    if (i10 != 67) {
                        if (i10 != 75) {
                            if (i10 == 78) {
                                sb2 = String.valueOf(new v(bArr).C());
                            }
                            sb2 = d0.c0(bArr);
                        } else {
                            sb2 = String.valueOf(bArr[0] & 255);
                        }
                    } else {
                        if (bArr.length >= 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        int length = bArr.length;
                        if (z11) {
                            sb2 = String.valueOf(x7.c(bArr[0], bArr[1], bArr[2], bArr[3]));
                        } else {
                            throw new IllegalArgumentException(u6.a("array too small: %s < %s", Integer.valueOf(length), 4));
                        }
                    }
                } else {
                    if (bArr.length >= 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int length2 = bArr.length;
                    if (z10) {
                        sb2 = String.valueOf(Float.intBitsToFloat(x7.c(bArr[0], bArr[1], bArr[2], bArr[3])));
                    } else {
                        throw new IllegalArgumentException(u6.a("array too small: %s < %s", Integer.valueOf(length2), 4));
                    }
                }
            } else {
                sb2 = d0.p(bArr);
            }
        } else {
            if (str.equals("auxiliary.tracks.map")) {
                ArrayList d = d();
                StringBuilder u10 = a4.a.u("track types = ");
                new d9.f(String.valueOf(',')).a(u10, d.iterator());
                sb2 = u10.toString();
            }
            sb2 = d0.c0(bArr);
        }
        return e2.j("mdta: key=", str, ", value=", sb2);
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
