package org.telegram.messenger;

import android.content.SharedPreferences;
import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Array;
public final class cz extends c1 {
    public final byte[] f23443a;
    public long f23444b;
    public final long[][] f23445c;
    public final long[][] d;
    public final int[][] f23446e;
    public final int[][] f23447f;
    public final long[] h;
    public final int[] f23448n;
    public final RandomAccessFile f23449r;
    public final bg.e0 f23450s;
    public final j6.o f23451w;
    public static final q5 f23441x = new q5("statsSaveQueue");
    public static final b7.j f23442y = new b7.j(2);
    public static volatile cz[] E = new cz[4];

    public cz(int i7) {
        super(i7);
        SharedPreferences sharedPreferences;
        this.f23443a = new byte[8];
        Class cls = Long.TYPE;
        this.f23445c = (long[][]) Array.newInstance(cls, 3, 8);
        this.d = (long[][]) Array.newInstance(cls, 3, 8);
        Class cls2 = Integer.TYPE;
        this.f23446e = (int[][]) Array.newInstance(cls2, 3, 8);
        this.f23447f = (int[][]) Array.newInstance(cls2, 3, 8);
        this.h = new long[3];
        this.f23448n = new int[3];
        this.f23450s = new bg.e0(32);
        this.f23451w = new j6.o(this, 16);
        File h = t0.h();
        if (i7 != 0) {
            h = new File(t0.h(), i5.c.j(i7, "account", "/"));
            h.mkdirs();
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(new File(h, "stats2.dat"), "rw");
            this.f23449r = randomAccessFile;
            if (randomAccessFile.length() > 0) {
                boolean z10 = false;
                for (int i10 = 0; i10 < 3; i10++) {
                    for (int i11 = 0; i11 < 7; i11++) {
                        this.f23449r.readFully(this.f23443a, 0, 8);
                        this.f23445c[i10][i11] = d(this.f23443a);
                        this.f23449r.readFully(this.f23443a, 0, 8);
                        this.d[i10][i11] = d(this.f23443a);
                        this.f23449r.readFully(this.f23443a, 0, 4);
                        this.f23446e[i10][i11] = c(this.f23443a);
                        this.f23449r.readFully(this.f23443a, 0, 4);
                        this.f23447f[i10][i11] = c(this.f23443a);
                    }
                    this.f23449r.readFully(this.f23443a, 0, 4);
                    this.f23448n[i10] = c(this.f23443a);
                    this.f23449r.readFully(this.f23443a, 0, 8);
                    this.h[i10] = d(this.f23443a);
                    long[] jArr = this.h;
                    if (jArr[i10] == 0) {
                        jArr[i10] = System.currentTimeMillis();
                        z10 = true;
                    }
                }
                for (int i12 = 0; i12 < 3; i12++) {
                    this.f23449r.readFully(this.f23443a, 0, 8);
                    this.f23445c[i12][7] = d(this.f23443a);
                    this.f23449r.readFully(this.f23443a, 0, 8);
                    this.d[i12][7] = d(this.f23443a);
                    this.f23449r.readFully(this.f23443a, 0, 4);
                    this.f23446e[i12][7] = c(this.f23443a);
                    this.f23449r.readFully(this.f23443a, 0, 4);
                    this.f23447f[i12][7] = c(this.f23443a);
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
            sharedPreferences = t0.f26915b.getSharedPreferences("stats", 0);
        } else {
            sharedPreferences = t0.f26915b.getSharedPreferences("stats" + i7, 0);
        }
        boolean z11 = false;
        for (int i13 = 0; i13 < 3; i13++) {
            this.f23448n[i13] = sharedPreferences.getInt("callsTotalTime" + i13, 0);
            this.h[i13] = sharedPreferences.getLong("resetStatsDate" + i13, 0L);
            for (int i14 = 0; i14 < 8; i14++) {
                this.f23445c[i13][i14] = sharedPreferences.getLong(a8.p0.m(i13, i14, "sentBytes", "_"), 0L);
                this.d[i13][i14] = sharedPreferences.getLong(a8.p0.m(i13, i14, "receivedBytes", "_"), 0L);
                this.f23446e[i13][i14] = sharedPreferences.getInt(a8.p0.m(i13, i14, "sentItems", "_"), 0);
                this.f23447f[i13][i14] = sharedPreferences.getInt(a8.p0.m(i13, i14, "receivedItems", "_"), 0);
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

    public static byte[] a(cz czVar, long j3) {
        byte[] bArr = czVar.f23443a;
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

    public static byte[] b(cz czVar, int i7) {
        byte[] bArr = czVar.f23443a;
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

    public static cz e(int i7) {
        cz czVar;
        cz czVar2 = E[i7];
        if (czVar2 == null) {
            synchronized (cz.class) {
                try {
                    czVar = E[i7];
                    if (czVar == null) {
                        cz[] czVarArr = E;
                        cz czVar3 = new cz(i7);
                        czVarArr[i7] = czVar3;
                        czVar = czVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return czVar;
        }
        return czVar2;
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
        long[][] jArr = this.f23445c;
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
        int[] iArr = this.f23447f[i7];
        iArr[i10] = iArr[i10] + i11;
        m();
    }

    public final void j(int i7, int i10, long j3) {
        long[] jArr = this.f23445c[i7];
        jArr[i10] = jArr[i10] + j3;
        m();
    }

    public final void k(int i7, int i10, int i11) {
        int[] iArr = this.f23446e[i7];
        iArr[i10] = iArr[i10] + i11;
        m();
    }

    public final void l(int i7) {
        this.h[i7] = System.currentTimeMillis();
        for (int i10 = 0; i10 < 8; i10++) {
            this.f23445c[i7][i10] = 0;
            this.d[i7][i10] = 0;
            this.f23446e[i7][i10] = 0;
            this.f23447f[i7][i10] = 0;
        }
        this.f23448n[i7] = 0;
        m();
    }

    public final void m() {
        long currentTimeMillis = System.currentTimeMillis();
        b7.j jVar = f23442y;
        if (Math.abs(currentTimeMillis - ((Long) jVar.get()).longValue()) >= 2000) {
            jVar.set(Long.valueOf(currentTimeMillis));
            q5 q5Var = f23441x;
            j6.o oVar = this.f23451w;
            q5Var.a(oVar);
            q5Var.c(oVar);
        }
    }
}
