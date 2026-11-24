package defpackage;

import android.media.MediaCodec;
import android.os.Build;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
public final class dr9 {
    public final mx6 a;
    public final int b;
    public final yw7 c;
    public sz0 d;
    public sz0 e;
    public sz0 f;
    public long g;

    public dr9(mx6 mx6Var) {
        this.a = mx6Var;
        synchronized (mx6Var) {
            ag0 ag0Var = ((xc3) mx6Var.d).c;
        }
        this.b = 65536;
        this.c = new yw7(32);
        sz0 sz0Var = new sz0(0L, 65536);
        this.d = sz0Var;
        this.e = sz0Var;
        this.f = sz0Var;
    }

    public static sz0 d(sz0 sz0Var, long j, ByteBuffer byteBuffer, int i) {
        while (j >= sz0Var.b) {
            sz0Var = (sz0) sz0Var.d;
        }
        while (i > 0) {
            int min = Math.min(i, (int) (sz0Var.b - j));
            mk mkVar = (mk) sz0Var.c;
            byteBuffer.put(mkVar.a, ((int) (j - sz0Var.a)) + mkVar.b, min);
            i -= min;
            j += min;
            if (j == sz0Var.b) {
                sz0Var = (sz0) sz0Var.d;
            }
        }
        return sz0Var;
    }

    public static sz0 e(sz0 sz0Var, long j, byte[] bArr, int i) {
        while (j >= sz0Var.b) {
            sz0Var = (sz0) sz0Var.d;
        }
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (sz0Var.b - j));
            mk mkVar = (mk) sz0Var.c;
            System.arraycopy(mkVar.a, ((int) (j - sz0Var.a)) + mkVar.b, bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == sz0Var.b) {
                sz0Var = (sz0) sz0Var.d;
            }
        }
        return sz0Var;
    }

    public static sz0 f(sz0 sz0Var, la3 la3Var, re1 re1Var, yw7 yw7Var) {
        boolean z;
        if (la3Var.getFlag(1073741824)) {
            long j = re1Var.b;
            int i = 1;
            yw7Var.K(1);
            sz0 e = e(sz0Var, j, yw7Var.a, 1);
            long j2 = j + 1;
            byte b = yw7Var.a[0];
            if ((b & 128) != 0) {
                z = true;
            } else {
                z = false;
            }
            int i2 = b & Byte.MAX_VALUE;
            z43 z43Var = la3Var.b;
            byte[] bArr = z43Var.a;
            if (bArr == null) {
                z43Var.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            sz0Var = e(e, j2, z43Var.a, i2);
            long j3 = j2 + i2;
            if (z) {
                yw7Var.K(2);
                sz0Var = e(sz0Var, j3, yw7Var.a, 2);
                j3 += 2;
                i = yw7Var.H();
            }
            int[] iArr = z43Var.d;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = z43Var.e;
            if (iArr2 == null || iArr2.length < i) {
                iArr2 = new int[i];
            }
            if (z) {
                int i3 = i * 6;
                yw7Var.K(i3);
                sz0Var = e(sz0Var, j3, yw7Var.a, i3);
                j3 += i3;
                yw7Var.N(0);
                for (int i4 = 0; i4 < i; i4++) {
                    iArr[i4] = yw7Var.H();
                    iArr2[i4] = yw7Var.E();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = re1Var.a - ((int) (j3 - re1Var.b));
            }
            xzb xzbVar = (xzb) re1Var.c;
            String str = hac.a;
            byte[] bArr2 = xzbVar.b;
            byte[] bArr3 = z43Var.a;
            byte b2 = xzbVar.a;
            int i5 = xzbVar.c;
            int i6 = xzbVar.d;
            z43Var.f = i;
            z43Var.d = iArr;
            z43Var.e = iArr2;
            z43Var.b = bArr2;
            z43Var.a = bArr3;
            z43Var.c = b2;
            z43Var.g = i5;
            z43Var.h = i6;
            MediaCodec.CryptoInfo cryptoInfo = z43Var.i;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = b2;
            if (Build.VERSION.SDK_INT >= 24) {
                y43 y43Var = z43Var.j;
                y43Var.getClass();
                y43Var.a(i5, i6);
            }
            long j4 = re1Var.b;
            int i7 = (int) (j3 - j4);
            re1Var.b = j4 + i7;
            re1Var.a -= i7;
        }
        if (la3Var.hasSupplementalData()) {
            yw7Var.K(4);
            sz0 e2 = e(sz0Var, re1Var.b, yw7Var.a, 4);
            int E = yw7Var.E();
            re1Var.b += 4;
            re1Var.a -= 4;
            la3Var.c(E);
            sz0 d = d(e2, re1Var.b, la3Var.c, E);
            re1Var.b += E;
            int i8 = re1Var.a - E;
            re1Var.a = i8;
            ByteBuffer byteBuffer = la3Var.f;
            if (byteBuffer != null && byteBuffer.capacity() >= i8) {
                la3Var.f.clear();
            } else {
                la3Var.f = ByteBuffer.allocate(i8);
            }
            return d(d, re1Var.b, la3Var.f, re1Var.a);
        }
        la3Var.c(re1Var.a);
        return d(sz0Var, re1Var.b, la3Var.c, re1Var.a);
    }

    public final void a(sz0 sz0Var) {
        if (((mk) sz0Var.c) == null) {
            return;
        }
        mx6 mx6Var = this.a;
        synchronized (mx6Var) {
            ((xc3) mx6Var.d).c.z(sz0Var);
            sz0 sz0Var2 = sz0Var;
            while (sz0Var2 != null) {
                mk mkVar = (mk) sz0Var2.c;
                mkVar.getClass();
                mx6Var.g0(mkVar);
                sz0Var2 = (sz0) sz0Var2.d;
                if (sz0Var2 == null || ((mk) sz0Var2.c) == null) {
                    sz0Var2 = null;
                }
            }
        }
        sz0Var.c = null;
        sz0Var.d = null;
    }

    public final void b(long j) {
        sz0 sz0Var;
        if (j != -1) {
            while (true) {
                sz0Var = this.d;
                if (j < sz0Var.b) {
                    break;
                }
                mx6 mx6Var = this.a;
                mk mkVar = (mk) sz0Var.c;
                synchronized (mx6Var) {
                    ((xc3) mx6Var.d).c.y(mkVar);
                    mx6Var.g0(mkVar);
                }
                sz0 sz0Var2 = this.d;
                sz0Var2.c = null;
                sz0Var2.d = null;
                this.d = (sz0) sz0Var2.d;
            }
            if (this.e.a < sz0Var.a) {
                this.e = sz0Var;
            }
        }
    }

    public final int c(int i) {
        mk a;
        sz0 sz0Var = this.f;
        if (((mk) sz0Var.c) == null) {
            mx6 mx6Var = this.a;
            synchronized (mx6Var) {
                a = ((xc3) mx6Var.d).c.a();
                ((HashMap) mx6Var.b).put(a, (we8) mx6Var.c);
                wc3 wc3Var = (wc3) ((xc3) mx6Var.d).o.get((we8) mx6Var.c);
                if (wc3Var != null) {
                    wc3Var.a();
                }
            }
            sz0 sz0Var2 = new sz0(this.f.b, this.b);
            sz0Var.c = a;
            sz0Var.d = sz0Var2;
        }
        return Math.min(i, (int) (this.f.b - this.g));
    }
}
