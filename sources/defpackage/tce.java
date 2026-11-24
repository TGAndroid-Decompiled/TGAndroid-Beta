package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;
public final class tce extends l4e implements Cloneable {
    public boolean E;
    public long a;
    public long b;
    public int c;
    public yce[] d;
    public byte[] e;
    public byte[] f;
    public String h;
    public String n;
    public String r;
    public long s;
    public byte[] w;
    public String x;
    public int[] y;

    @Override
    public final void a(sld sldVar) {
        String str = this.x;
        String str2 = this.r;
        String str3 = this.n;
        String str4 = this.h;
        byte[] bArr = this.e;
        long j = this.a;
        if (j != 0) {
            sldVar.h(1, 0);
            sldVar.k(j);
        }
        yce[] yceVarArr = this.d;
        if (yceVarArr != null && yceVarArr.length > 0) {
            int i = 0;
            while (true) {
                yce[] yceVarArr2 = this.d;
                if (i >= yceVarArr2.length) {
                    break;
                }
                yce yceVar = yceVarArr2[i];
                i++;
            }
        }
        byte[] bArr2 = wed.b;
        if (!Arrays.equals(bArr, bArr2)) {
            sldVar.d(4, bArr);
        }
        if (!Arrays.equals(this.f, bArr2)) {
            sldVar.d(6, this.f);
        }
        if (str4 != null && !str4.equals("")) {
            sldVar.c(8, str4);
        }
        int i2 = this.c;
        if (i2 != 0) {
            sldVar.h(11, 0);
            if (i2 >= 0) {
                sldVar.f(i2);
            } else {
                sldVar.k(i2);
            }
        }
        if (str3 != null && !str3.equals("")) {
            sldVar.c(13, str3);
        }
        if (str2 != null && !str2.equals("")) {
            sldVar.c(14, str2);
        }
        long j2 = this.s;
        if (j2 != 180000) {
            sldVar.h(15, 0);
            sldVar.k((j2 << 1) ^ (j2 >> 63));
        }
        long j3 = this.b;
        if (j3 != 0) {
            sldVar.h(17, 0);
            sldVar.k(j3);
        }
        if (!Arrays.equals(this.w, bArr2)) {
            sldVar.d(18, this.w);
        }
        int[] iArr = this.y;
        if (iArr != null && iArr.length > 0) {
            int i3 = 0;
            while (true) {
                int[] iArr2 = this.y;
                if (i3 >= iArr2.length) {
                    break;
                }
                int i4 = iArr2[i3];
                sldVar.h(20, 0);
                if (i4 >= 0) {
                    sldVar.f(i4);
                } else {
                    sldVar.k(i4);
                }
                i3++;
            }
        }
        if (str != null && !str.equals("")) {
            sldVar.c(24, str);
        }
        boolean z = this.E;
        if (z) {
            sldVar.h(25, 0);
            byte b = z ? (byte) 1 : (byte) 0;
            ByteBuffer byteBuffer = (ByteBuffer) sldVar.a;
            if (byteBuffer.hasRemaining()) {
                byteBuffer.put(b);
                return;
            }
            throw new bk2(byteBuffer.position(), byteBuffer.limit());
        }
    }

    public final Object clone() {
        try {
            tce tceVar = (tce) d();
            yce[] yceVarArr = this.d;
            if (yceVarArr != null && yceVarArr.length > 0) {
                tceVar.d = new yce[yceVarArr.length];
                int i = 0;
                while (true) {
                    yce[] yceVarArr2 = this.d;
                    if (i >= yceVarArr2.length) {
                        break;
                    }
                    yce yceVar = yceVarArr2[i];
                    i++;
                }
            }
            int[] iArr = this.y;
            if (iArr != null && iArr.length > 0) {
                tceVar.y = (int[]) iArr.clone();
            }
            return tceVar;
        } catch (CloneNotSupportedException e) {
            fi7.g(e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        int length;
        int length2;
        boolean z;
        boolean z2;
        boolean z3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tce)) {
            return false;
        }
        tce tceVar = (tce) obj;
        if (this.a != tceVar.a || this.b != tceVar.b || this.c != tceVar.c) {
            return false;
        }
        yce[] yceVarArr = this.d;
        yce[] yceVarArr2 = tceVar.d;
        Object obj2 = j5e.a;
        if (yceVarArr == null) {
            length = 0;
        } else {
            length = yceVarArr.length;
        }
        if (yceVarArr2 == null) {
            length2 = 0;
        } else {
            length2 = yceVarArr2.length;
        }
        int i = 0;
        while (i < length) {
            yce yceVar = yceVarArr[i];
            i++;
        }
        int i2 = 0;
        while (i2 < length2) {
            yce yceVar2 = yceVarArr2[i2];
            i2++;
        }
        if (i >= length) {
            z = true;
        } else {
            z = false;
        }
        if (i2 >= length2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            if (!Arrays.equals(this.e, tceVar.e) || !Arrays.equals(this.f, tceVar.f)) {
                return false;
            }
            String str = this.h;
            String str2 = tceVar.h;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.n;
            String str4 = tceVar.n;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.r;
            String str6 = tceVar.r;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            if (this.s != tceVar.s || !Arrays.equals(this.w, tceVar.w)) {
                return false;
            }
            String str7 = this.x;
            String str8 = tceVar.x;
            if (str7 == null) {
                if (str8 != null) {
                    return false;
                }
            } else if (!str7.equals(str8)) {
                return false;
            }
            int[] iArr = this.y;
            int[] iArr2 = tceVar.y;
            if (iArr != null && iArr.length != 0) {
                z3 = Arrays.equals(iArr, iArr2);
            } else if (iArr2 != null && iArr2.length != 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3 && this.E == tceVar.E) {
                return true;
            }
            return false;
        } else if (z != z2) {
            return false;
        } else {
            yce yceVar3 = yceVarArr[i];
            yce yceVar4 = yceVarArr2[i2];
            throw null;
        }
    }

    public final int hashCode() {
        int length;
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        long j = this.a;
        long j2 = this.b;
        int i = 1237;
        int hashCode5 = ((((((((tce.class.getName().hashCode() + 527) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 29791) + this.c) * 29791) + 1237;
        yce[] yceVarArr = this.d;
        Object obj = j5e.a;
        int i2 = 0;
        if (yceVarArr == null) {
            length = 0;
        } else {
            length = yceVarArr.length;
        }
        for (int i3 = 0; i3 < length; i3++) {
            yce yceVar = yceVarArr[i3];
        }
        int hashCode6 = (Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + (hashCode5 * 961)) * 961)) * 31;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i4 = (hashCode6 + hashCode) * 31;
        String str2 = this.n;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i5 = (i4 + hashCode2) * 961;
        String str3 = this.r;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        long j3 = this.s;
        int hashCode7 = (Arrays.hashCode(this.w) + ((((i5 + hashCode3) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 961)) * 31;
        String str4 = this.x;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i6 = (hashCode7 + hashCode4) * 961;
        int[] iArr = this.y;
        if (iArr != null && iArr.length != 0) {
            i2 = Arrays.hashCode(iArr);
        }
        int i7 = (i6 + i2) * 29791;
        if (this.E) {
            i = 1231;
        }
        return (i7 + i) * 31;
    }
}
