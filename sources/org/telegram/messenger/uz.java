package org.telegram.messenger;

import android.content.SharedPreferences;
import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Array;
public final class uz extends f1 {
    public final byte[] f18425a;
    public long f18426b;
    public final long[][] f18427c;
    public final long[][] d;
    public final int[][] e;
    public final int[][] f18428f;
    public final long[] h;
    public final int[] f18429n;
    public final RandomAccessFile f18430r;
    public final rf.x f18431s;
    public final mg.c2 f18432w;
    public static final r5 f18423x = new r5("statsSaveQueue");
    public static final com.google.android.gms.common.api.internal.o1 f18424y = new com.google.android.gms.common.api.internal.o1(3);
    public static volatile uz[] D = new uz[4];

    public uz(int i10) {
        super(i10);
        SharedPreferences sharedPreferences;
        this.f18425a = new byte[8];
        Class cls = Long.TYPE;
        this.f18427c = (long[][]) Array.newInstance(cls, 3, 8);
        this.d = (long[][]) Array.newInstance(cls, 3, 8);
        Class cls2 = Integer.TYPE;
        this.e = (int[][]) Array.newInstance(cls2, 3, 8);
        this.f18428f = (int[][]) Array.newInstance(cls2, 3, 8);
        this.h = new long[3];
        this.f18429n = new int[3];
        this.f18431s = new rf.x(32);
        this.f18432w = new mg.c2(this, 11);
        File h = w0.h();
        if (i10 != 0) {
            h = new File(w0.h(), i0.a.j(i10, "account", "/"));
            h.mkdirs();
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(new File(h, "stats2.dat"), "rw");
            this.f18430r = randomAccessFile;
            if (randomAccessFile.length() > 0) {
                boolean z10 = false;
                for (int i11 = 0; i11 < 3; i11++) {
                    for (int i12 = 0; i12 < 7; i12++) {
                        this.f18430r.readFully(this.f18425a, 0, 8);
                        this.f18427c[i11][i12] = d(this.f18425a);
                        this.f18430r.readFully(this.f18425a, 0, 8);
                        this.d[i11][i12] = d(this.f18425a);
                        this.f18430r.readFully(this.f18425a, 0, 4);
                        this.e[i11][i12] = c(this.f18425a);
                        this.f18430r.readFully(this.f18425a, 0, 4);
                        this.f18428f[i11][i12] = c(this.f18425a);
                    }
                    this.f18430r.readFully(this.f18425a, 0, 4);
                    this.f18429n[i11] = c(this.f18425a);
                    this.f18430r.readFully(this.f18425a, 0, 8);
                    this.h[i11] = d(this.f18425a);
                    long[] jArr = this.h;
                    if (jArr[i11] == 0) {
                        jArr[i11] = System.currentTimeMillis();
                        z10 = true;
                    }
                }
                for (int i13 = 0; i13 < 3; i13++) {
                    this.f18430r.readFully(this.f18425a, 0, 8);
                    this.f18427c[i13][7] = d(this.f18425a);
                    this.f18430r.readFully(this.f18425a, 0, 8);
                    this.d[i13][7] = d(this.f18425a);
                    this.f18430r.readFully(this.f18425a, 0, 4);
                    this.e[i13][7] = c(this.f18425a);
                    this.f18430r.readFully(this.f18425a, 0, 4);
                    this.f18428f[i13][7] = c(this.f18425a);
                }
                if (z10) {
                    m();
                    return;
                }
                return;
            }
        } catch (Exception unused) {
        }
        if (i10 == 0) {
            sharedPreferences = w0.f19025b.getSharedPreferences("stats", 0);
        } else {
            sharedPreferences = w0.f19025b.getSharedPreferences("stats" + i10, 0);
        }
        boolean z11 = false;
        for (int i14 = 0; i14 < 3; i14++) {
            this.f18429n[i14] = sharedPreferences.getInt("callsTotalTime" + i14, 0);
            this.h[i14] = sharedPreferences.getLong("resetStatsDate" + i14, 0L);
            for (int i15 = 0; i15 < 8; i15++) {
                this.f18427c[i14][i15] = sharedPreferences.getLong(a1.g.j(i14, i15, "sentBytes", "_"), 0L);
                this.d[i14][i15] = sharedPreferences.getLong(a1.g.j(i14, i15, "receivedBytes", "_"), 0L);
                this.e[i14][i15] = sharedPreferences.getInt(a1.g.j(i14, i15, "sentItems", "_"), 0);
                this.f18428f[i14][i15] = sharedPreferences.getInt(a1.g.j(i14, i15, "receivedItems", "_"), 0);
            }
            long[] jArr2 = this.h;
            if (jArr2[i14] == 0) {
                jArr2[i14] = System.currentTimeMillis();
                z11 = true;
            }
        }
        if (z11) {
            m();
        }
    }

    public static byte[] a(uz uzVar, long j10) {
        byte[] bArr = uzVar.f18425a;
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

    public static byte[] b(uz uzVar, int i10) {
        byte[] bArr = uzVar.f18425a;
        bArr[0] = (byte) (i10 >>> 24);
        bArr[1] = (byte) (i10 >>> 16);
        bArr[2] = (byte) (i10 >>> 8);
        bArr[3] = (byte) i10;
        return bArr;
    }

    public static int c(byte[] bArr) {
        return (bArr[3] & 255) | (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    public static long d(byte[] bArr) {
        return ((bArr[0] & 255) << 56) | ((bArr[1] & 255) << 48) | ((bArr[2] & 255) << 40) | ((bArr[3] & 255) << 32) | ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (255 & bArr[7]);
    }

    public static uz e(int i10) {
        uz uzVar;
        uz uzVar2 = D[i10];
        if (uzVar2 == null) {
            synchronized (uz.class) {
                try {
                    uzVar = D[i10];
                    if (uzVar == null) {
                        uz[] uzVarArr = D;
                        uz uzVar3 = new uz(i10);
                        uzVarArr[i10] = uzVar3;
                        uzVar = uzVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return uzVar;
        }
        return uzVar2;
    }

    public final long f(int i10, int i11) {
        long[][] jArr = this.d;
        if (i11 == 1) {
            long[] jArr2 = jArr[i10];
            return ((((jArr2[6] - jArr2[5]) - jArr2[3]) - jArr2[2]) - jArr2[4]) - jArr2[7];
        }
        return jArr[i10][i11];
    }

    public final long g(int i10, int i11) {
        long[][] jArr = this.f18427c;
        if (i11 == 1) {
            long[] jArr2 = jArr[i10];
            return ((((jArr2[6] - jArr2[5]) - jArr2[3]) - jArr2[2]) - jArr2[4]) - jArr2[7];
        }
        return jArr[i10][i11];
    }

    public final void h(int i10, int i11, long j10) {
        long[] jArr = this.d[i10];
        jArr[i11] = jArr[i11] + j10;
        m();
    }

    public final void i(int i10, int i11, int i12) {
        int[] iArr = this.f18428f[i10];
        iArr[i11] = iArr[i11] + i12;
        m();
    }

    public final void j(int i10, int i11, long j10) {
        long[] jArr = this.f18427c[i10];
        jArr[i11] = jArr[i11] + j10;
        m();
    }

    public final void k(int i10, int i11, int i12) {
        int[] iArr = this.e[i10];
        iArr[i11] = iArr[i11] + i12;
        m();
    }

    public final void l(int i10) {
        this.h[i10] = System.currentTimeMillis();
        for (int i11 = 0; i11 < 8; i11++) {
            this.f18427c[i10][i11] = 0;
            this.d[i10][i11] = 0;
            this.e[i10][i11] = 0;
            this.f18428f[i10][i11] = 0;
        }
        this.f18429n[i10] = 0;
        m();
    }

    public final void m() {
        long currentTimeMillis = System.currentTimeMillis();
        com.google.android.gms.common.api.internal.o1 o1Var = f18424y;
        if (Math.abs(currentTimeMillis - ((Long) o1Var.get()).longValue()) >= 2000) {
            o1Var.set(Long.valueOf(currentTimeMillis));
            r5 r5Var = f18423x;
            mg.c2 c2Var = this.f18432w;
            r5Var.a(c2Var);
            r5Var.c(c2Var);
        }
    }
}
