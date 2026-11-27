package defpackage;

import android.media.MediaCodec;
import android.os.Build;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
public final class us9 {
    public final rx6 a;
    public final int b;
    public final ey7 c;
    public ty0 d;
    public ty0 e;
    public ty0 f;
    public long g;

    public us9(rx6 rx6Var) {
        this.a = rx6Var;
        synchronized (rx6Var) {
            cf0 cf0Var = ((ec3) rx6Var.d).c;
        }
        this.b = 65536;
        this.c = new ey7(32);
        ty0 ty0Var = new ty0(0L, 65536);
        this.d = ty0Var;
        this.e = ty0Var;
        this.f = ty0Var;
    }

    public static ty0 d(ty0 ty0Var, long j, ByteBuffer byteBuffer, int i) {
        while (j >= ty0Var.b) {
            ty0Var = (ty0) ty0Var.d;
        }
        while (i > 0) {
            int min = Math.min(i, (int) (ty0Var.b - j));
            nj njVar = (nj) ty0Var.c;
            byteBuffer.put(njVar.a, ((int) (j - ty0Var.a)) + njVar.b, min);
            i -= min;
            j += min;
            if (j == ty0Var.b) {
                ty0Var = (ty0) ty0Var.d;
            }
        }
        return ty0Var;
    }

    public static ty0 e(ty0 ty0Var, long j, byte[] bArr, int i) {
        while (j >= ty0Var.b) {
            ty0Var = (ty0) ty0Var.d;
        }
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (ty0Var.b - j));
            nj njVar = (nj) ty0Var.c;
            System.arraycopy(njVar.a, ((int) (j - ty0Var.a)) + njVar.b, bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == ty0Var.b) {
                ty0Var = (ty0) ty0Var.d;
            }
        }
        return ty0Var;
    }

    public static ty0 f(ty0 ty0Var, s93 s93Var, sd1 sd1Var, ey7 ey7Var) {
        boolean z;
        if (s93Var.getFlag(1073741824)) {
            long j = sd1Var.b;
            int i = 1;
            ey7Var.K(1);
            ty0 e = e(ty0Var, j, ey7Var.a, 1);
            long j2 = j + 1;
            byte b = ey7Var.a[0];
            if ((b & 128) != 0) {
                z = true;
            } else {
                z = false;
            }
            int i2 = b & Byte.MAX_VALUE;
            g43 g43Var = s93Var.b;
            byte[] bArr = g43Var.a;
            if (bArr == null) {
                g43Var.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            ty0Var = e(e, j2, g43Var.a, i2);
            long j3 = j2 + i2;
            if (z) {
                ey7Var.K(2);
                ty0Var = e(ty0Var, j3, ey7Var.a, 2);
                j3 += 2;
                i = ey7Var.H();
            }
            int[] iArr = g43Var.d;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = g43Var.e;
            if (iArr2 == null || iArr2.length < i) {
                iArr2 = new int[i];
            }
            if (z) {
                int i3 = i * 6;
                ey7Var.K(i3);
                ty0Var = e(ty0Var, j3, ey7Var.a, i3);
                j3 += i3;
                ey7Var.N(0);
                for (int i4 = 0; i4 < i; i4++) {
                    iArr[i4] = ey7Var.H();
                    iArr2[i4] = ey7Var.E();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = sd1Var.a - ((int) (j3 - sd1Var.b));
            }
            w1c w1cVar = (w1c) sd1Var.c;
            String str = gcc.a;
            byte[] bArr2 = w1cVar.b;
            byte[] bArr3 = g43Var.a;
            byte b2 = w1cVar.a;
            int i5 = w1cVar.c;
            int i6 = w1cVar.d;
            g43Var.f = i;
            g43Var.d = iArr;
            g43Var.e = iArr2;
            g43Var.b = bArr2;
            g43Var.a = bArr3;
            g43Var.c = b2;
            g43Var.g = i5;
            g43Var.h = i6;
            MediaCodec.CryptoInfo cryptoInfo = g43Var.i;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = b2;
            if (Build.VERSION.SDK_INT >= 24) {
                f43 f43Var = g43Var.j;
                f43Var.getClass();
                f43Var.a(i5, i6);
            }
            long j4 = sd1Var.b;
            int i7 = (int) (j3 - j4);
            sd1Var.b = j4 + i7;
            sd1Var.a -= i7;
        }
        if (s93Var.hasSupplementalData()) {
            ey7Var.K(4);
            ty0 e2 = e(ty0Var, sd1Var.b, ey7Var.a, 4);
            int E = ey7Var.E();
            sd1Var.b += 4;
            sd1Var.a -= 4;
            s93Var.c(E);
            ty0 d = d(e2, sd1Var.b, s93Var.c, E);
            sd1Var.b += E;
            int i8 = sd1Var.a - E;
            sd1Var.a = i8;
            ByteBuffer byteBuffer = s93Var.f;
            if (byteBuffer != null && byteBuffer.capacity() >= i8) {
                s93Var.f.clear();
            } else {
                s93Var.f = ByteBuffer.allocate(i8);
            }
            return d(d, sd1Var.b, s93Var.f, sd1Var.a);
        }
        s93Var.c(sd1Var.a);
        return d(ty0Var, sd1Var.b, s93Var.c, sd1Var.a);
    }

    public final void a(ty0 ty0Var) {
        if (((nj) ty0Var.c) == null) {
            return;
        }
        rx6 rx6Var = this.a;
        synchronized (rx6Var) {
            ((ec3) rx6Var.d).c.z(ty0Var);
            ty0 ty0Var2 = ty0Var;
            while (ty0Var2 != null) {
                nj njVar = (nj) ty0Var2.c;
                njVar.getClass();
                rx6Var.h0(njVar);
                ty0Var2 = (ty0) ty0Var2.d;
                if (ty0Var2 == null || ((nj) ty0Var2.c) == null) {
                    ty0Var2 = null;
                }
            }
        }
        ty0Var.c = null;
        ty0Var.d = null;
    }

    public final void b(long j) {
        ty0 ty0Var;
        if (j != -1) {
            while (true) {
                ty0Var = this.d;
                if (j < ty0Var.b) {
                    break;
                }
                rx6 rx6Var = this.a;
                nj njVar = (nj) ty0Var.c;
                synchronized (rx6Var) {
                    ((ec3) rx6Var.d).c.y(njVar);
                    rx6Var.h0(njVar);
                }
                ty0 ty0Var2 = this.d;
                ty0Var2.c = null;
                ty0Var2.d = null;
                this.d = (ty0) ty0Var2.d;
            }
            if (this.e.a < ty0Var.a) {
                this.e = ty0Var;
            }
        }
    }

    public final int c(int i) {
        nj a;
        ty0 ty0Var = this.f;
        if (((nj) ty0Var.c) == null) {
            rx6 rx6Var = this.a;
            synchronized (rx6Var) {
                a = ((ec3) rx6Var.d).c.a();
                ((HashMap) rx6Var.b).put(a, (ig8) rx6Var.c);
                dc3 dc3Var = (dc3) ((ec3) rx6Var.d).o.get((ig8) rx6Var.c);
                if (dc3Var != null) {
                    dc3Var.a();
                }
            }
            ty0 ty0Var2 = new ty0(this.f.b, this.b);
            ty0Var.c = a;
            ty0Var.d = ty0Var2;
        }
        return Math.min(i, (int) (this.f.b - this.g));
    }
}
