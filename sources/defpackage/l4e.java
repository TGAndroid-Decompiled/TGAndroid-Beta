package defpackage;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
public abstract class l4e {
    public static final void b(l4e l4eVar, byte[] bArr, int i) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i);
            ?? obj = new Object();
            obj.a = wrap;
            wrap.order(ByteOrder.LITTLE_ENDIAN);
            l4eVar.a(obj);
            ByteBuffer byteBuffer = (ByteBuffer) obj.a;
            if (byteBuffer.remaining() == 0) {
                return;
            }
            int remaining = byteBuffer.remaining();
            throw new IllegalStateException("Did not write as much data as expected, " + remaining + " bytes remaining.");
        } catch (IOException e) {
            fyb.j("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public abstract void a(sld sldVar);

    public final int c() {
        int i;
        int[] iArr;
        int i2;
        int i3;
        tce tceVar = (tce) this;
        String str = tceVar.x;
        String str2 = tceVar.r;
        String str3 = tceVar.n;
        String str4 = tceVar.h;
        byte[] bArr = tceVar.e;
        long j = tceVar.a;
        int i4 = 0;
        if (j != 0) {
            i = sld.l(j) + sld.m(1);
        } else {
            i = 0;
        }
        yce[] yceVarArr = tceVar.d;
        if (yceVarArr != null && yceVarArr.length > 0) {
            int i5 = 0;
            while (true) {
                yce[] yceVarArr2 = tceVar.d;
                if (i5 >= yceVarArr2.length) {
                    break;
                }
                yce yceVar = yceVarArr2[i5];
                i5++;
            }
        }
        byte[] bArr2 = wed.b;
        if (!Arrays.equals(bArr, bArr2)) {
            i += sld.n(bArr.length) + bArr.length + sld.m(4);
        }
        if (!Arrays.equals(tceVar.f, bArr2)) {
            byte[] bArr3 = tceVar.f;
            i += sld.n(bArr3.length) + bArr3.length + sld.m(6);
        }
        if (str4 != null && !str4.equals("")) {
            i += sld.g(8, str4);
        }
        int i6 = tceVar.c;
        if (i6 != 0) {
            int m = sld.m(11);
            if (i6 >= 0) {
                i3 = sld.n(i6);
            } else {
                i3 = 10;
            }
            i += i3 + m;
        }
        if (str3 != null && !str3.equals("")) {
            i += sld.g(13, str3);
        }
        if (str2 != null && !str2.equals("")) {
            i += sld.g(14, str2);
        }
        long j2 = tceVar.s;
        if (j2 != 180000) {
            i += sld.l((j2 << 1) ^ (j2 >> 63)) + sld.m(15);
        }
        long j3 = tceVar.b;
        if (j3 != 0) {
            i += sld.l(j3) + sld.m(17);
        }
        if (!Arrays.equals(tceVar.w, bArr2)) {
            byte[] bArr4 = tceVar.w;
            i += sld.n(bArr4.length) + bArr4.length + sld.m(18);
        }
        int[] iArr2 = tceVar.y;
        if (iArr2 != null && iArr2.length > 0) {
            int i7 = 0;
            while (true) {
                iArr = tceVar.y;
                if (i4 >= iArr.length) {
                    break;
                }
                int i8 = iArr[i4];
                if (i8 >= 0) {
                    i2 = sld.n(i8);
                } else {
                    i2 = 10;
                }
                i7 += i2;
                i4++;
            }
            i = i + i7 + (iArr.length << 1);
        }
        if (str != null && !str.equals("")) {
            i += sld.g(24, str);
        }
        if (tceVar.E) {
            return sld.m(25) + 1 + i;
        }
        return i;
    }

    public final l4e d() {
        l4e l4eVar = (l4e) super.clone();
        Object obj = j5e.a;
        return l4eVar;
    }

    public final String toString() {
        String valueOf;
        StringBuffer stringBuffer = new StringBuffer();
        try {
            a2f.a(null, this, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e) {
            valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() == 0) {
                return new String("Error printing proto: ");
            }
            return "Error printing proto: ".concat(valueOf);
        } catch (InvocationTargetException e2) {
            valueOf = String.valueOf(e2.getMessage());
            if (valueOf.length() == 0) {
                return new String("Error printing proto: ");
            }
            return "Error printing proto: ".concat(valueOf);
        }
    }
}
