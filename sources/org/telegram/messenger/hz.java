package org.telegram.messenger;

import android.content.SharedPreferences;
import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Array;
public final class hz extends c1 {
    public final byte[] f24245a;
    public long f24246b;
    public final long[][] f24247c;
    public final long[][] d;
    public final int[][] f24248e;
    public final int[][] f24249f;
    public final long[] h;
    public final int[] f24250n;
    public final RandomAccessFile f24251r;
    public final bg.d0 f24252s;
    public final j6.o f24253w;
    public static final p5 f24243x = new p5("statsSaveQueue");
    public static final b7.j f24244y = new b7.j(2);
    public static volatile hz[] E = new hz[4];

    public hz(int i7) {
        super(i7);
        SharedPreferences sharedPreferences;
        this.f24245a = new byte[8];
        Class cls = Long.TYPE;
        this.f24247c = (long[][]) Array.newInstance(cls, 3, 8);
        this.d = (long[][]) Array.newInstance(cls, 3, 8);
        Class cls2 = Integer.TYPE;
        this.f24248e = (int[][]) Array.newInstance(cls2, 3, 8);
        this.f24249f = (int[][]) Array.newInstance(cls2, 3, 8);
        this.h = new long[3];
        this.f24250n = new int[3];
        this.f24252s = new bg.d0(32);
        this.f24253w = new j6.o(this, 16);
        File h = t0.h();
        if (i7 != 0) {
            h = new File(t0.h(), i5.c.j(i7, "account", "/"));
            h.mkdirs();
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(new File(h, "stats2.dat"), "rw");
            this.f24251r = randomAccessFile;
            if (randomAccessFile.length() > 0) {
                boolean z10 = false;
                for (int i10 = 0; i10 < 3; i10++) {
                    for (int i11 = 0; i11 < 7; i11++) {
                        this.f24251r.readFully(this.f24245a, 0, 8);
                        this.f24247c[i10][i11] = d(this.f24245a);
                        this.f24251r.readFully(this.f24245a, 0, 8);
                        this.d[i10][i11] = d(this.f24245a);
                        this.f24251r.readFully(this.f24245a, 0, 4);
                        this.f24248e[i10][i11] = c(this.f24245a);
                        this.f24251r.readFully(this.f24245a, 0, 4);
                        this.f24249f[i10][i11] = c(this.f24245a);
                    }
                    this.f24251r.readFully(this.f24245a, 0, 4);
                    this.f24250n[i10] = c(this.f24245a);
                    this.f24251r.readFully(this.f24245a, 0, 8);
                    this.h[i10] = d(this.f24245a);
                    long[] jArr = this.h;
                    if (jArr[i10] == 0) {
                        jArr[i10] = System.currentTimeMillis();
                        z10 = true;
                    }
                }
                for (int i12 = 0; i12 < 3; i12++) {
                    this.f24251r.readFully(this.f24245a, 0, 8);
                    this.f24247c[i12][7] = d(this.f24245a);
                    this.f24251r.readFully(this.f24245a, 0, 8);
                    this.d[i12][7] = d(this.f24245a);
                    this.f24251r.readFully(this.f24245a, 0, 4);
                    this.f24248e[i12][7] = c(this.f24245a);
                    this.f24251r.readFully(this.f24245a, 0, 4);
                    this.f24249f[i12][7] = c(this.f24245a);
                }
                if (z10) {
                    m();
                    return;
                }
                return;
            }
        } catch (Exception unused) {
        }
        if (i7 == 0) {
            sharedPreferences = t0.f26600b.getSharedPreferences("stats", 0);
        } else {
            sharedPreferences = t0.f26600b.getSharedPreferences("stats" + i7, 0);
        }
        boolean z11 = false;
        for (int i13 = 0; i13 < 3; i13++) {
            this.f24250n[i13] = sharedPreferences.getInt("callsTotalTime" + i13, 0);
            this.h[i13] = sharedPreferences.getLong("resetStatsDate" + i13, 0L);
            for (int i14 = 0; i14 < 8; i14++) {
                this.f24247c[i13][i14] = sharedPreferences.getLong(a8.p0.m(i13, i14, "sentBytes", "_"), 0L);
                this.d[i13][i14] = sharedPreferences.getLong(a8.p0.m(i13, i14, "receivedBytes", "_"), 0L);
                this.f24248e[i13][i14] = sharedPreferences.getInt(a8.p0.m(i13, i14, "sentItems", "_"), 0);
                this.f24249f[i13][i14] = sharedPreferences.getInt(a8.p0.m(i13, i14, "receivedItems", "_"), 0);
            }
            long[] jArr2 = this.h;
            if (jArr2[i13] == 0) {
                jArr2[i13] = System.currentTimeMillis();
                z11 = true;
            }
        }
        if (z11) {
            m();
        }
    }

    public static byte[] a(hz hzVar, long j3) {
        byte[] bArr = hzVar.f24245a;
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

    public static byte[] b(hz hzVar, int i7) {
        byte[] bArr = hzVar.f24245a;
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

    public static hz e(int i7) {
        hz hzVar;
        hz hzVar2 = E[i7];
        if (hzVar2 == null) {
            synchronized (hz.class) {
                try {
                    hzVar = E[i7];
                    if (hzVar == null) {
                        hz[] hzVarArr = E;
                        hz hzVar3 = new hz(i7);
                        hzVarArr[i7] = hzVar3;
                        hzVar = hzVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return hzVar;
        }
        return hzVar2;
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
        long[][] jArr = this.f24247c;
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
        int[] iArr = this.f24249f[i7];
        iArr[i10] = iArr[i10] + i11;
        m();
    }

    public final void j(int i7, int i10, long j3) {
        long[] jArr = this.f24247c[i7];
        jArr[i10] = jArr[i10] + j3;
        m();
    }

    public final void k(int i7, int i10, int i11) {
        int[] iArr = this.f24248e[i7];
        iArr[i10] = iArr[i10] + i11;
        m();
    }

    public final void l(int i7) {
        this.h[i7] = System.currentTimeMillis();
        for (int i10 = 0; i10 < 8; i10++) {
            this.f24247c[i7][i10] = 0;
            this.d[i7][i10] = 0;
            this.f24248e[i7][i10] = 0;
            this.f24249f[i7][i10] = 0;
        }
        this.f24250n[i7] = 0;
        m();
    }

    public final void m() {
        long currentTimeMillis = System.currentTimeMillis();
        b7.j jVar = f24244y;
        if (Math.abs(currentTimeMillis - ((Long) jVar.get()).longValue()) >= 2000) {
            jVar.set(Long.valueOf(currentTimeMillis));
            p5 p5Var = f24243x;
            j6.o oVar = this.f24253w;
            p5Var.a(oVar);
            p5Var.c(oVar);
        }
    }
}
