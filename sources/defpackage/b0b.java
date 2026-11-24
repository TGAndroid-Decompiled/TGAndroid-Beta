package defpackage;

import android.content.SharedPreferences;
import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Array;
import org.telegram.messenger.a;
public final class b0b extends pg0 {
    public final byte[] a;
    public long b;
    public final long[][] c;
    public final long[][] d;
    public final int[][] e;
    public final int[][] f;
    public final long[] h;
    public final int[] n;
    public final RandomAccessFile r;
    public final do5 s;
    public final zka w;
    public static final mp3 x = new mp3("statsSaveQueue");
    public static final j94 y = new j94((byte) 2);
    public static volatile b0b[] E = new b0b[4];

    public b0b(int i) {
        super(i);
        SharedPreferences sharedPreferences;
        RandomAccessFile randomAccessFile;
        byte[] bArr;
        this.a = new byte[8];
        Class cls = Long.TYPE;
        this.c = (long[][]) Array.newInstance(cls, 3, 8);
        this.d = (long[][]) Array.newInstance(cls, 3, 8);
        Class cls2 = Integer.TYPE;
        this.e = (int[][]) Array.newInstance(cls2, 3, 8);
        this.f = (int[][]) Array.newInstance(cls2, 3, 8);
        this.h = new long[3];
        this.n = new int[3];
        this.s = new do5(32);
        this.w = new zka(this, (byte) 3);
        File h = a.h();
        if (i != 0) {
            h = new File(a.h(), td4.o(i, "account", "/"));
            h.mkdirs();
        }
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(new File(h, "stats2.dat"), "rw");
            this.r = randomAccessFile2;
            if (randomAccessFile2.length() > 0) {
                boolean z = false;
                for (int i2 = 0; i2 < 3; i2++) {
                    int i3 = 0;
                    while (true) {
                        randomAccessFile = this.r;
                        bArr = this.a;
                        if (i3 >= 7) {
                            break;
                        }
                        randomAccessFile.readFully(bArr, 0, 8);
                        this.c[i2][i3] = b(this.a);
                        this.r.readFully(this.a, 0, 8);
                        this.d[i2][i3] = b(this.a);
                        this.r.readFully(this.a, 0, 4);
                        this.e[i2][i3] = a(this.a);
                        this.r.readFully(this.a, 0, 4);
                        this.f[i2][i3] = a(this.a);
                        i3++;
                    }
                    randomAccessFile.readFully(bArr, 0, 4);
                    this.n[i2] = a(this.a);
                    this.r.readFully(this.a, 0, 8);
                    this.h[i2] = b(this.a);
                    long[] jArr = this.h;
                    if (jArr[i2] == 0) {
                        jArr[i2] = System.currentTimeMillis();
                        z = true;
                    }
                }
                for (int i4 = 0; i4 < 3; i4++) {
                    this.r.readFully(this.a, 0, 8);
                    this.c[i4][7] = b(this.a);
                    this.r.readFully(this.a, 0, 8);
                    this.d[i4][7] = b(this.a);
                    this.r.readFully(this.a, 0, 4);
                    this.e[i4][7] = a(this.a);
                    this.r.readFully(this.a, 0, 4);
                    this.f[i4][7] = a(this.a);
                }
                if (z) {
                    m();
                    return;
                }
                return;
            }
        } catch (Exception unused) {
        }
        if (i == 0) {
            sharedPreferences = a.b.getSharedPreferences("stats", 0);
        } else {
            sharedPreferences = a.b.getSharedPreferences("stats" + i, 0);
        }
        boolean z2 = false;
        for (int i5 = 0; i5 < 3; i5++) {
            this.n[i5] = sharedPreferences.getInt("callsTotalTime" + i5, 0);
            this.h[i5] = sharedPreferences.getLong("resetStatsDate" + i5, 0L);
            for (int i6 = 0; i6 < 8; i6++) {
                this.c[i5][i6] = sharedPreferences.getLong(b10.g(i5, i6, "sentBytes", "_"), 0L);
                this.d[i5][i6] = sharedPreferences.getLong(b10.g(i5, i6, "receivedBytes", "_"), 0L);
                this.e[i5][i6] = sharedPreferences.getInt(b10.g(i5, i6, "sentItems", "_"), 0);
                this.f[i5][i6] = sharedPreferences.getInt(b10.g(i5, i6, "receivedItems", "_"), 0);
            }
            long[] jArr2 = this.h;
            if (jArr2[i5] == 0) {
                jArr2[i5] = System.currentTimeMillis();
                z2 = true;
            }
        }
        if (z2) {
            m();
        }
    }

    public static int a(byte[] bArr) {
        return (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
    }

    public static long b(byte[] bArr) {
        return ((bArr[0] & 255) << 56) | ((bArr[1] & 255) << 48) | ((bArr[2] & 255) << 40) | ((bArr[3] & 255) << 32) | ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
    }

    public static b0b c(int i) {
        b0b b0bVar;
        b0b b0bVar2 = E[i];
        if (b0bVar2 == null) {
            synchronized (b0b.class) {
                b0bVar = E[i];
                if (b0bVar == null) {
                    b0b[] b0bVarArr = E;
                    b0b b0bVar3 = new b0b(i);
                    b0bVarArr[i] = b0bVar3;
                    b0bVar = b0bVar3;
                }
            }
            return b0bVar;
        }
        return b0bVar2;
    }

    public final long d(int i, int i2) {
        long[][] jArr = this.d;
        if (i2 == 1) {
            long[] jArr2 = jArr[i];
            return ((((jArr2[6] - jArr2[5]) - jArr2[3]) - jArr2[2]) - jArr2[4]) - jArr2[7];
        }
        return jArr[i][i2];
    }

    public final long e(int i, int i2) {
        long[][] jArr = this.c;
        if (i2 == 1) {
            long[] jArr2 = jArr[i];
            return ((((jArr2[6] - jArr2[5]) - jArr2[3]) - jArr2[2]) - jArr2[4]) - jArr2[7];
        }
        return jArr[i][i2];
    }

    public final void f(int i, int i2, long j) {
        long[] jArr = this.d[i];
        jArr[i2] = jArr[i2] + j;
        m();
    }

    public final void g(int i, int i2, int i3) {
        int[] iArr = this.f[i];
        iArr[i2] = iArr[i2] + i3;
        m();
    }

    public final void h(int i, int i2, long j) {
        long[] jArr = this.c[i];
        jArr[i2] = jArr[i2] + j;
        m();
    }

    public final void i(int i, int i2, int i3) {
        int[] iArr = this.e[i];
        iArr[i2] = iArr[i2] + i3;
        m();
    }

    public final byte[] j(int i) {
        byte[] bArr = this.a;
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) i;
        return bArr;
    }

    public final byte[] k(long j) {
        byte[] bArr = this.a;
        bArr[0] = (byte) (j >>> 56);
        bArr[1] = (byte) (j >>> 48);
        bArr[2] = (byte) (j >>> 40);
        bArr[3] = (byte) (j >>> 32);
        bArr[4] = (byte) (j >>> 24);
        bArr[5] = (byte) (j >>> 16);
        bArr[6] = (byte) (j >>> 8);
        bArr[7] = (byte) j;
        return bArr;
    }

    public final void l(int i) {
        this.h[i] = System.currentTimeMillis();
        for (int i2 = 0; i2 < 8; i2++) {
            this.c[i][i2] = 0;
            this.d[i][i2] = 0;
            this.e[i][i2] = 0;
            this.f[i][i2] = 0;
        }
        this.n[i] = 0;
        m();
    }

    public final void m() {
        long currentTimeMillis = System.currentTimeMillis();
        j94 j94Var = y;
        if (Math.abs(currentTimeMillis - ((Long) j94Var.get()).longValue()) >= 2000) {
            j94Var.set(Long.valueOf(currentTimeMillis));
            mp3 mp3Var = x;
            zka zkaVar = this.w;
            mp3Var.a(zkaVar);
            mp3Var.c(zkaVar);
        }
    }
}
