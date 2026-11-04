package org.telegram.messenger;

import android.content.SharedPreferences;
import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Array;
public final class bz extends c1 {
    public final byte[] f21909a;
    public long f21910b;
    public final long[][] f21911c;
    public final long[][] d;
    public final int[][] f21912e;
    public final int[][] f21913f;
    public final long[] h;
    public final int[] f21914n;
    public final RandomAccessFile f21915r;
    public final cg.c0 f21916s;
    public final mi.b0 f21917w;
    public static final p5 f21907x = new p5("statsSaveQueue");
    public static final a7.j f21908y = new a7.j(2);
    public static volatile bz[] E = new bz[4];

    public bz(int i3) {
        super(i3);
        SharedPreferences sharedPreferences;
        this.f21909a = new byte[8];
        Class cls = Long.TYPE;
        this.f21911c = (long[][]) Array.newInstance(cls, 3, 8);
        this.d = (long[][]) Array.newInstance(cls, 3, 8);
        Class cls2 = Integer.TYPE;
        this.f21912e = (int[][]) Array.newInstance(cls2, 3, 8);
        this.f21913f = (int[][]) Array.newInstance(cls2, 3, 8);
        this.h = new long[3];
        this.f21914n = new int[3];
        this.f21916s = new cg.c0(32);
        this.f21917w = new mi.b0(this, 12);
        File h = t0.h();
        if (i3 != 0) {
            h = new File(t0.h(), k2.p1.j(i3, "account", "/"));
            h.mkdirs();
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(new File(h, "stats2.dat"), "rw");
            this.f21915r = randomAccessFile;
            if (randomAccessFile.length() > 0) {
                boolean z10 = false;
                for (int i10 = 0; i10 < 3; i10++) {
                    for (int i11 = 0; i11 < 7; i11++) {
                        this.f21915r.readFully(this.f21909a, 0, 8);
                        this.f21911c[i10][i11] = d(this.f21909a);
                        this.f21915r.readFully(this.f21909a, 0, 8);
                        this.d[i10][i11] = d(this.f21909a);
                        this.f21915r.readFully(this.f21909a, 0, 4);
                        this.f21912e[i10][i11] = c(this.f21909a);
                        this.f21915r.readFully(this.f21909a, 0, 4);
                        this.f21913f[i10][i11] = c(this.f21909a);
                    }
                    this.f21915r.readFully(this.f21909a, 0, 4);
                    this.f21914n[i10] = c(this.f21909a);
                    this.f21915r.readFully(this.f21909a, 0, 8);
                    this.h[i10] = d(this.f21909a);
                    long[] jArr = this.h;
                    if (jArr[i10] == 0) {
                        jArr[i10] = System.currentTimeMillis();
                        z10 = true;
                    }
                }
                for (int i12 = 0; i12 < 3; i12++) {
                    this.f21915r.readFully(this.f21909a, 0, 8);
                    this.f21911c[i12][7] = d(this.f21909a);
                    this.f21915r.readFully(this.f21909a, 0, 8);
                    this.d[i12][7] = d(this.f21909a);
                    this.f21915r.readFully(this.f21909a, 0, 4);
                    this.f21912e[i12][7] = c(this.f21909a);
                    this.f21915r.readFully(this.f21909a, 0, 4);
                    this.f21913f[i12][7] = c(this.f21909a);
                }
                if (z10) {
                    m();
                    return;
                }
                return;
            }
        } catch (Exception unused) {
        }
        if (i3 == 0) {
            sharedPreferences = t0.f25457b.getSharedPreferences("stats", 0);
        } else {
            sharedPreferences = t0.f25457b.getSharedPreferences("stats" + i3, 0);
        }
        boolean z11 = false;
        for (int i13 = 0; i13 < 3; i13++) {
            this.f21914n[i13] = sharedPreferences.getInt("callsTotalTime" + i13, 0);
            this.h[i13] = sharedPreferences.getLong("resetStatsDate" + i13, 0L);
            for (int i14 = 0; i14 < 8; i14++) {
                this.f21911c[i13][i14] = sharedPreferences.getLong(a1.g.n(i13, i14, "sentBytes", "_"), 0L);
                this.d[i13][i14] = sharedPreferences.getLong(a1.g.n(i13, i14, "receivedBytes", "_"), 0L);
                this.f21912e[i13][i14] = sharedPreferences.getInt(a1.g.n(i13, i14, "sentItems", "_"), 0);
                this.f21913f[i13][i14] = sharedPreferences.getInt(a1.g.n(i13, i14, "receivedItems", "_"), 0);
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

    public static byte[] a(bz bzVar, long j10) {
        byte[] bArr = bzVar.f21909a;
        bArr[0] = (byte) (j10 >>> 56);
        bArr[1] = (byte) (j10 >>> 48);
        bArr[2] = (byte) (j10 >>> 40);
        bArr[3] = (byte) (j10 >>> 32);
        bArr[4] = (byte) (j10 >>> 24);
        bArr[5] = (byte) (j10 >>> 16);
        bArr[6] = (byte) (j10 >>> 8);
        bArr[7] = (byte) j10;
        return bArr;
    }

    public static byte[] b(bz bzVar, int i3) {
        byte[] bArr = bzVar.f21909a;
        bArr[0] = (byte) (i3 >>> 24);
        bArr[1] = (byte) (i3 >>> 16);
        bArr[2] = (byte) (i3 >>> 8);
        bArr[3] = (byte) i3;
        return bArr;
    }

    public static int c(byte[] bArr) {
        return (bArr[3] & 255) | (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    public static long d(byte[] bArr) {
        return ((bArr[0] & 255) << 56) | ((bArr[1] & 255) << 48) | ((bArr[2] & 255) << 40) | ((bArr[3] & 255) << 32) | ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (255 & bArr[7]);
    }

    public static bz e(int i3) {
        bz bzVar;
        bz bzVar2 = E[i3];
        if (bzVar2 == null) {
            synchronized (bz.class) {
                try {
                    bzVar = E[i3];
                    if (bzVar == null) {
                        bz[] bzVarArr = E;
                        bz bzVar3 = new bz(i3);
                        bzVarArr[i3] = bzVar3;
                        bzVar = bzVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return bzVar;
        }
        return bzVar2;
    }

    public final long f(int i3, int i10) {
        long[][] jArr = this.d;
        if (i10 == 1) {
            long[] jArr2 = jArr[i3];
            return ((((jArr2[6] - jArr2[5]) - jArr2[3]) - jArr2[2]) - jArr2[4]) - jArr2[7];
        }
        return jArr[i3][i10];
    }

    public final long g(int i3, int i10) {
        long[][] jArr = this.f21911c;
        if (i10 == 1) {
            long[] jArr2 = jArr[i3];
            return ((((jArr2[6] - jArr2[5]) - jArr2[3]) - jArr2[2]) - jArr2[4]) - jArr2[7];
        }
        return jArr[i3][i10];
    }

    public final void h(int i3, int i10, long j10) {
        long[] jArr = this.d[i3];
        jArr[i10] = jArr[i10] + j10;
        m();
    }

    public final void i(int i3, int i10, int i11) {
        int[] iArr = this.f21913f[i3];
        iArr[i10] = iArr[i10] + i11;
        m();
    }

    public final void j(int i3, int i10, long j10) {
        long[] jArr = this.f21911c[i3];
        jArr[i10] = jArr[i10] + j10;
        m();
    }

    public final void k(int i3, int i10, int i11) {
        int[] iArr = this.f21912e[i3];
        iArr[i10] = iArr[i10] + i11;
        m();
    }

    public final void l(int i3) {
        this.h[i3] = System.currentTimeMillis();
        for (int i10 = 0; i10 < 8; i10++) {
            this.f21911c[i3][i10] = 0;
            this.d[i3][i10] = 0;
            this.f21912e[i3][i10] = 0;
            this.f21913f[i3][i10] = 0;
        }
        this.f21914n[i3] = 0;
        m();
    }

    public final void m() {
        long currentTimeMillis = System.currentTimeMillis();
        a7.j jVar = f21908y;
        if (Math.abs(currentTimeMillis - ((Long) jVar.get()).longValue()) >= 2000) {
            jVar.set(Long.valueOf(currentTimeMillis));
            p5 p5Var = f21907x;
            mi.b0 b0Var = this.f21917w;
            p5Var.a(b0Var);
            p5Var.c(b0Var);
        }
    }
}
