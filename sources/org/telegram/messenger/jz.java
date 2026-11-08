package org.telegram.messenger;

import android.content.SharedPreferences;
import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Array;
public final class jz extends c1 {
    public final byte[] f23628a;
    public long f23629b;
    public final long[][] f23630c;
    public final long[][] d;
    public final int[][] f23631e;
    public final int[][] f23632f;
    public final long[] h;
    public final int[] f23633n;
    public final RandomAccessFile f23634r;
    public final bg.d0 f23635s;
    public final m.f3 f23636w;
    public static final p5 f23626x = new p5("statsSaveQueue");
    public static final b7.j f23627y = new b7.j(2);
    public static volatile jz[] D = new jz[4];

    public jz(int i7) {
        super(i7);
        SharedPreferences sharedPreferences;
        this.f23628a = new byte[8];
        Class cls = Long.TYPE;
        this.f23630c = (long[][]) Array.newInstance(cls, 3, 8);
        this.d = (long[][]) Array.newInstance(cls, 3, 8);
        Class cls2 = Integer.TYPE;
        this.f23631e = (int[][]) Array.newInstance(cls2, 3, 8);
        this.f23632f = (int[][]) Array.newInstance(cls2, 3, 8);
        this.h = new long[3];
        this.f23633n = new int[3];
        this.f23635s = new bg.d0(32);
        this.f23636w = new m.f3(this, 13);
        File h = t0.h();
        if (i7 != 0) {
            h = new File(t0.h(), jg.g.k(i7, "account", "/"));
            h.mkdirs();
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(new File(h, "stats2.dat"), "rw");
            this.f23634r = randomAccessFile;
            if (randomAccessFile.length() > 0) {
                boolean z9 = false;
                for (int i10 = 0; i10 < 3; i10++) {
                    for (int i11 = 0; i11 < 7; i11++) {
                        this.f23634r.readFully(this.f23628a, 0, 8);
                        this.f23630c[i10][i11] = d(this.f23628a);
                        this.f23634r.readFully(this.f23628a, 0, 8);
                        this.d[i10][i11] = d(this.f23628a);
                        this.f23634r.readFully(this.f23628a, 0, 4);
                        this.f23631e[i10][i11] = c(this.f23628a);
                        this.f23634r.readFully(this.f23628a, 0, 4);
                        this.f23632f[i10][i11] = c(this.f23628a);
                    }
                    this.f23634r.readFully(this.f23628a, 0, 4);
                    this.f23633n[i10] = c(this.f23628a);
                    this.f23634r.readFully(this.f23628a, 0, 8);
                    this.h[i10] = d(this.f23628a);
                    long[] jArr = this.h;
                    if (jArr[i10] == 0) {
                        jArr[i10] = System.currentTimeMillis();
                        z9 = true;
                    }
                }
                for (int i12 = 0; i12 < 3; i12++) {
                    this.f23634r.readFully(this.f23628a, 0, 8);
                    this.f23630c[i12][7] = d(this.f23628a);
                    this.f23634r.readFully(this.f23628a, 0, 8);
                    this.d[i12][7] = d(this.f23628a);
                    this.f23634r.readFully(this.f23628a, 0, 4);
                    this.f23631e[i12][7] = c(this.f23628a);
                    this.f23634r.readFully(this.f23628a, 0, 4);
                    this.f23632f[i12][7] = c(this.f23628a);
                }
                if (z9) {
                    m();
                    return;
                }
                return;
            }
        } catch (Exception unused) {
        }
        if (i7 == 0) {
            sharedPreferences = t0.f25566b.getSharedPreferences("stats", 0);
        } else {
            sharedPreferences = t0.f25566b.getSharedPreferences("stats" + i7, 0);
        }
        boolean z10 = false;
        for (int i13 = 0; i13 < 3; i13++) {
            this.f23633n[i13] = sharedPreferences.getInt("callsTotalTime" + i13, 0);
            this.h[i13] = sharedPreferences.getLong("resetStatsDate" + i13, 0L);
            for (int i14 = 0; i14 < 8; i14++) {
                this.f23630c[i13][i14] = sharedPreferences.getLong(a8.p0.m(i13, i14, "sentBytes", "_"), 0L);
                this.d[i13][i14] = sharedPreferences.getLong(a8.p0.m(i13, i14, "receivedBytes", "_"), 0L);
                this.f23631e[i13][i14] = sharedPreferences.getInt(a8.p0.m(i13, i14, "sentItems", "_"), 0);
                this.f23632f[i13][i14] = sharedPreferences.getInt(a8.p0.m(i13, i14, "receivedItems", "_"), 0);
            }
            long[] jArr2 = this.h;
            if (jArr2[i13] == 0) {
                jArr2[i13] = System.currentTimeMillis();
                z10 = true;
            }
        }
        if (z10) {
            m();
        }
    }

    public static byte[] a(jz jzVar, long j3) {
        byte[] bArr = jzVar.f23628a;
        bArr[0] = (byte) (j3 >>> 56);
        bArr[1] = (byte) (j3 >>> 48);
        bArr[2] = (byte) (j3 >>> 40);
        bArr[3] = (byte) (j3 >>> 32);
        bArr[4] = (byte) (j3 >>> 24);
        bArr[5] = (byte) (j3 >>> 16);
        bArr[6] = (byte) (j3 >>> 8);
        bArr[7] = (byte) j3;
        return bArr;
    }

    public static byte[] b(jz jzVar, int i7) {
        byte[] bArr = jzVar.f23628a;
        bArr[0] = (byte) (i7 >>> 24);
        bArr[1] = (byte) (i7 >>> 16);
        bArr[2] = (byte) (i7 >>> 8);
        bArr[3] = (byte) i7;
        return bArr;
    }

    public static int c(byte[] bArr) {
        return (bArr[3] & 255) | (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    public static long d(byte[] bArr) {
        return ((bArr[0] & 255) << 56) | ((bArr[1] & 255) << 48) | ((bArr[2] & 255) << 40) | ((bArr[3] & 255) << 32) | ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (255 & bArr[7]);
    }

    public static jz e(int i7) {
        jz jzVar;
        jz jzVar2 = D[i7];
        if (jzVar2 == null) {
            synchronized (jz.class) {
                try {
                    jzVar = D[i7];
                    if (jzVar == null) {
                        jz[] jzVarArr = D;
                        jz jzVar3 = new jz(i7);
                        jzVarArr[i7] = jzVar3;
                        jzVar = jzVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return jzVar;
        }
        return jzVar2;
    }

    public final long f(int i7, int i10) {
        long[][] jArr = this.d;
        if (i10 == 1) {
            long[] jArr2 = jArr[i7];
            return ((((jArr2[6] - jArr2[5]) - jArr2[3]) - jArr2[2]) - jArr2[4]) - jArr2[7];
        }
        return jArr[i7][i10];
    }

    public final long g(int i7, int i10) {
        long[][] jArr = this.f23630c;
        if (i10 == 1) {
            long[] jArr2 = jArr[i7];
            return ((((jArr2[6] - jArr2[5]) - jArr2[3]) - jArr2[2]) - jArr2[4]) - jArr2[7];
        }
        return jArr[i7][i10];
    }

    public final void h(int i7, int i10, long j3) {
        long[] jArr = this.d[i7];
        jArr[i10] = jArr[i10] + j3;
        m();
    }

    public final void i(int i7, int i10, int i11) {
        int[] iArr = this.f23632f[i7];
        iArr[i10] = iArr[i10] + i11;
        m();
    }

    public final void j(int i7, int i10, long j3) {
        long[] jArr = this.f23630c[i7];
        jArr[i10] = jArr[i10] + j3;
        m();
    }

    public final void k(int i7, int i10, int i11) {
        int[] iArr = this.f23631e[i7];
        iArr[i10] = iArr[i10] + i11;
        m();
    }

    public final void l(int i7) {
        this.h[i7] = System.currentTimeMillis();
        for (int i10 = 0; i10 < 8; i10++) {
            this.f23630c[i7][i10] = 0;
            this.d[i7][i10] = 0;
            this.f23631e[i7][i10] = 0;
            this.f23632f[i7][i10] = 0;
        }
        this.f23633n[i7] = 0;
        m();
    }

    public final void m() {
        long currentTimeMillis = System.currentTimeMillis();
        b7.j jVar = f23627y;
        if (Math.abs(currentTimeMillis - ((Long) jVar.get()).longValue()) >= 2000) {
            jVar.set(Long.valueOf(currentTimeMillis));
            p5 p5Var = f23626x;
            m.f3 f3Var = this.f23636w;
            p5Var.a(f3Var);
            p5Var.c(f3Var);
        }
    }
}
