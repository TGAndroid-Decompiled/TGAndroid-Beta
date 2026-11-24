package defpackage;

import android.media.MediaCodec;
import android.os.Build;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
public final class cp9 {
    public final mv6 a;
    public final int b;
    public final xu7 c;
    public ly0 d;
    public ly0 e;
    public ly0 f;
    public long g;

    public cp9(mv6 mv6Var) {
        this.a = mv6Var;
        synchronized (mv6Var) {
            af0 af0Var = ((lb3) mv6Var.d).c;
        }
        this.b = 65536;
        this.c = new xu7(32);
        ly0 ly0Var = new ly0(0L, 65536);
        this.d = ly0Var;
        this.e = ly0Var;
        this.f = ly0Var;
    }

    public static ly0 d(ly0 ly0Var, long j, ByteBuffer byteBuffer, int i) {
        while (j >= ly0Var.b) {
            ly0Var = (ly0) ly0Var.d;
        }
        while (i > 0) {
            int min = Math.min(i, (int) (ly0Var.b - j));
            mj mjVar = (mj) ly0Var.c;
            byteBuffer.put(mjVar.a, ((int) (j - ly0Var.a)) + mjVar.b, min);
            i -= min;
            j += min;
            if (j == ly0Var.b) {
                ly0Var = (ly0) ly0Var.d;
            }
        }
        return ly0Var;
    }

    public static ly0 e(ly0 ly0Var, long j, byte[] bArr, int i) {
        while (j >= ly0Var.b) {
            ly0Var = (ly0) ly0Var.d;
        }
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (ly0Var.b - j));
            mj mjVar = (mj) ly0Var.c;
            System.arraycopy(mjVar.a, ((int) (j - ly0Var.a)) + mjVar.b, bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == ly0Var.b) {
                ly0Var = (ly0) ly0Var.d;
            }
        }
        return ly0Var;
    }

    public static ly0 f(ly0 ly0Var, z83 z83Var, jd1 jd1Var, xu7 xu7Var) {
        boolean z;
        if (z83Var.getFlag(1073741824)) {
            long j = jd1Var.b;
            int i = 1;
            xu7Var.K(1);
            ly0 e = e(ly0Var, j, xu7Var.a, 1);
            long j2 = j + 1;
            byte b = xu7Var.a[0];
            if ((b & 128) != 0) {
                z = true;
            } else {
                z = false;
            }
            int i2 = b & Byte.MAX_VALUE;
            o33 o33Var = z83Var.b;
            byte[] bArr = o33Var.a;
            if (bArr == null) {
                o33Var.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            ly0Var = e(e, j2, o33Var.a, i2);
            long j3 = j2 + i2;
            if (z) {
                xu7Var.K(2);
                ly0Var = e(ly0Var, j3, xu7Var.a, 2);
                j3 += 2;
                i = xu7Var.H();
            }
            int[] iArr = o33Var.d;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = o33Var.e;
            if (iArr2 == null || iArr2.length < i) {
                iArr2 = new int[i];
            }
            if (z) {
                int i3 = i * 6;
                xu7Var.K(i3);
                ly0Var = e(ly0Var, j3, xu7Var.a, i3);
                j3 += i3;
                xu7Var.N(0);
                for (int i4 = 0; i4 < i; i4++) {
                    iArr[i4] = xu7Var.H();
                    iArr2[i4] = xu7Var.E();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = jd1Var.a - ((int) (j3 - jd1Var.b));
            }
            vxb vxbVar = (vxb) jd1Var.c;
            String str = g8c.a;
            byte[] bArr2 = vxbVar.b;
            byte[] bArr3 = o33Var.a;
            byte b2 = vxbVar.a;
            int i5 = vxbVar.c;
            int i6 = vxbVar.d;
            o33Var.f = i;
            o33Var.d = iArr;
            o33Var.e = iArr2;
            o33Var.b = bArr2;
            o33Var.a = bArr3;
            o33Var.c = b2;
            o33Var.g = i5;
            o33Var.h = i6;
            MediaCodec.CryptoInfo cryptoInfo = o33Var.i;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = b2;
            if (Build.VERSION.SDK_INT >= 24) {
                n33 n33Var = o33Var.j;
                n33Var.getClass();
                n33Var.a(i5, i6);
            }
            long j4 = jd1Var.b;
            int i7 = (int) (j3 - j4);
            jd1Var.b = j4 + i7;
            jd1Var.a -= i7;
        }
        if (z83Var.hasSupplementalData()) {
            xu7Var.K(4);
            ly0 e2 = e(ly0Var, jd1Var.b, xu7Var.a, 4);
            int E = xu7Var.E();
            jd1Var.b += 4;
            jd1Var.a -= 4;
            z83Var.c(E);
            ly0 d = d(e2, jd1Var.b, z83Var.c, E);
            jd1Var.b += E;
            int i8 = jd1Var.a - E;
            jd1Var.a = i8;
            ByteBuffer byteBuffer = z83Var.f;
            if (byteBuffer != null && byteBuffer.capacity() >= i8) {
                z83Var.f.clear();
            } else {
                z83Var.f = ByteBuffer.allocate(i8);
            }
            return d(d, jd1Var.b, z83Var.f, jd1Var.a);
        }
        z83Var.c(jd1Var.a);
        return d(ly0Var, jd1Var.b, z83Var.c, jd1Var.a);
    }

    public final void a(ly0 ly0Var) {
        if (((mj) ly0Var.c) == null) {
            return;
        }
        mv6 mv6Var = this.a;
        synchronized (mv6Var) {
            ((lb3) mv6Var.d).c.z(ly0Var);
            ly0 ly0Var2 = ly0Var;
            while (ly0Var2 != null) {
                mj mjVar = (mj) ly0Var2.c;
                mjVar.getClass();
                mv6Var.c0(mjVar);
                ly0Var2 = (ly0) ly0Var2.d;
                if (ly0Var2 == null || ((mj) ly0Var2.c) == null) {
                    ly0Var2 = null;
                }
            }
        }
        ly0Var.c = null;
        ly0Var.d = null;
    }

    public final void b(long j) {
        ly0 ly0Var;
        if (j != -1) {
            while (true) {
                ly0Var = this.d;
                if (j < ly0Var.b) {
                    break;
                }
                mv6 mv6Var = this.a;
                mj mjVar = (mj) ly0Var.c;
                synchronized (mv6Var) {
                    ((lb3) mv6Var.d).c.y(mjVar);
                    mv6Var.c0(mjVar);
                }
                ly0 ly0Var2 = this.d;
                ly0Var2.c = null;
                ly0Var2.d = null;
                this.d = (ly0) ly0Var2.d;
            }
            if (this.e.a < ly0Var.a) {
                this.e = ly0Var;
            }
        }
    }

    public final int c(int i) {
        mj a;
        ly0 ly0Var = this.f;
        if (((mj) ly0Var.c) == null) {
            mv6 mv6Var = this.a;
            synchronized (mv6Var) {
                a = ((lb3) mv6Var.d).c.a();
                ((HashMap) mv6Var.b).put(a, (uc8) mv6Var.c);
                kb3 kb3Var = (kb3) ((lb3) mv6Var.d).o.get((uc8) mv6Var.c);
                if (kb3Var != null) {
                    kb3Var.a();
                }
            }
            ly0 ly0Var2 = new ly0(this.f.b, this.b);
            ly0Var.c = a;
            ly0Var.d = ly0Var2;
        }
        return Math.min(i, (int) (this.f.b - this.g));
    }
}
