package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;
public final class khe extends b9e implements Cloneable {
    public boolean E;
    public long a;
    public long b;
    public int c;
    public phe[] d;
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
    public final void a(ve9 ve9Var) {
        String str = this.x;
        String str2 = this.r;
        String str3 = this.n;
        String str4 = this.h;
        byte[] bArr = this.e;
        long j = this.a;
        if (j != 0) {
            ve9Var.m0(1, 0);
            ve9Var.o0(j);
        }
        phe[] pheVarArr = this.d;
        if (pheVarArr != null && pheVarArr.length > 0) {
            int i = 0;
            while (true) {
                phe[] pheVarArr2 = this.d;
                if (i >= pheVarArr2.length) {
                    break;
                }
                phe pheVar = pheVarArr2[i];
                i++;
            }
        }
        byte[] bArr2 = njd.b;
        if (!Arrays.equals(bArr, bArr2)) {
            ve9Var.g0(4, bArr);
        }
        if (!Arrays.equals(this.f, bArr2)) {
            ve9Var.g0(6, this.f);
        }
        if (str4 != null && !str4.equals("")) {
            ve9Var.f0(8, str4);
        }
        int i2 = this.c;
        if (i2 != 0) {
            ve9Var.m0(11, 0);
            if (i2 >= 0) {
                ve9Var.k0(i2);
            } else {
                ve9Var.o0(i2);
            }
        }
        if (str3 != null && !str3.equals("")) {
            ve9Var.f0(13, str3);
        }
        if (str2 != null && !str2.equals("")) {
            ve9Var.f0(14, str2);
        }
        long j2 = this.s;
        if (j2 != 180000) {
            ve9Var.m0(15, 0);
            ve9Var.o0((j2 << 1) ^ (j2 >> 63));
        }
        long j3 = this.b;
        if (j3 != 0) {
            ve9Var.m0(17, 0);
            ve9Var.o0(j3);
        }
        if (!Arrays.equals(this.w, bArr2)) {
            ve9Var.g0(18, this.w);
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
                ve9Var.m0(20, 0);
                if (i4 >= 0) {
                    ve9Var.k0(i4);
                } else {
                    ve9Var.o0(i4);
                }
                i3++;
            }
        }
        if (str != null && !str.equals("")) {
            ve9Var.f0(24, str);
        }
        boolean z = this.E;
        if (z) {
            ve9Var.m0(25, 0);
            byte b = z ? (byte) 1 : (byte) 0;
            ByteBuffer byteBuffer = (ByteBuffer) ve9Var.b;
            if (byteBuffer.hasRemaining()) {
                byteBuffer.put(b);
                return;
            }
            throw new wk2(byteBuffer.position(), byteBuffer.limit());
        }
    }

    public final Object clone() {
        try {
            khe kheVar = (khe) d();
            phe[] pheVarArr = this.d;
            if (pheVarArr != null && pheVarArr.length > 0) {
                kheVar.d = new phe[pheVarArr.length];
                int i = 0;
                while (true) {
                    phe[] pheVarArr2 = this.d;
                    if (i >= pheVarArr2.length) {
                        break;
                    }
                    phe pheVar = pheVarArr2[i];
                    i++;
                }
            }
            int[] iArr = this.y;
            if (iArr != null && iArr.length > 0) {
                kheVar.y = (int[]) iArr.clone();
            }
            return kheVar;
        } catch (CloneNotSupportedException e) {
            hz6.e(e);
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
        if (!(obj instanceof khe)) {
            return false;
        }
        khe kheVar = (khe) obj;
        if (this.a != kheVar.a || this.b != kheVar.b || this.c != kheVar.c) {
            return false;
        }
        phe[] pheVarArr = this.d;
        phe[] pheVarArr2 = kheVar.d;
        Object obj2 = z9e.a;
        if (pheVarArr == null) {
            length = 0;
        } else {
            length = pheVarArr.length;
        }
        if (pheVarArr2 == null) {
            length2 = 0;
        } else {
            length2 = pheVarArr2.length;
        }
        int i = 0;
        while (i < length) {
            phe pheVar = pheVarArr[i];
            i++;
        }
        int i2 = 0;
        while (i2 < length2) {
            phe pheVar2 = pheVarArr2[i2];
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
            if (!Arrays.equals(this.e, kheVar.e) || !Arrays.equals(this.f, kheVar.f)) {
                return false;
            }
            String str = this.h;
            String str2 = kheVar.h;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.n;
            String str4 = kheVar.n;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.r;
            String str6 = kheVar.r;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            if (this.s != kheVar.s || !Arrays.equals(this.w, kheVar.w)) {
                return false;
            }
            String str7 = this.x;
            String str8 = kheVar.x;
            if (str7 == null) {
                if (str8 != null) {
                    return false;
                }
            } else if (!str7.equals(str8)) {
                return false;
            }
            int[] iArr = this.y;
            int[] iArr2 = kheVar.y;
            if (iArr != null && iArr.length != 0) {
                z3 = Arrays.equals(iArr, iArr2);
            } else if (iArr2 != null && iArr2.length != 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3 && this.E == kheVar.E) {
                return true;
            }
            return false;
        } else if (z != z2) {
            return false;
        } else {
            phe pheVar3 = pheVarArr[i];
            phe pheVar4 = pheVarArr2[i2];
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
        int hashCode5 = ((((((((khe.class.getName().hashCode() + 527) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 29791) + this.c) * 29791) + 1237;
        phe[] pheVarArr = this.d;
        Object obj = z9e.a;
        int i2 = 0;
        if (pheVarArr == null) {
            length = 0;
        } else {
            length = pheVarArr.length;
        }
        for (int i3 = 0; i3 < length; i3++) {
            phe pheVar = pheVarArr[i3];
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
