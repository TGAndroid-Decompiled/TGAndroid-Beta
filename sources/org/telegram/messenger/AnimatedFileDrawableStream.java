package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public class AnimatedFileDrawableStream implements m94 {
    public final boolean E;
    public int F;
    public boolean G;
    public l94 a;
    public CountDownLatch b;
    public final TLRPC.Document c;
    public final gl5 d;
    public final Object e;
    public final int f;
    public volatile boolean h;
    public final Object n = new Object();
    public long r;
    public boolean s;
    public final boolean w;
    public boolean x;
    public String y;

    public AnimatedFileDrawableStream(TLRPC.Document document, gl5 gl5Var, Object obj, int i, boolean z, int i2, int i3) {
        this.c = document;
        this.d = gl5Var;
        this.e = obj;
        this.f = i;
        this.w = z;
        this.E = i2;
        ba4 G = ba4.G(i);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        l94[] l94VarArr = new l94[1];
        ba4.K.c(new n94(G, l94VarArr, document, gl5Var, obj, i2, this, 0L, z, i3, countDownLatch));
        ba4.a(countDownLatch, true);
        this.a = l94VarArr[0];
    }

    @Override
    public final void a() {
        CountDownLatch countDownLatch = this.b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            this.b = null;
        }
    }

    public final void b(boolean z) {
        boolean z2;
        if (this.h) {
            return;
        }
        synchronized (this.n) {
            CountDownLatch countDownLatch = this.b;
            if (countDownLatch != null) {
                countDownLatch.countDown();
                this.b = null;
                if (z && !this.h && !this.w) {
                    ba4.G(this.f).Z(this.c, false, true);
                }
            }
            Object obj = this.e;
            if (obj instanceof k27) {
                k27 k27Var = (k27) obj;
                up3 q = up3.q(k27Var.K1);
                int e1 = k27Var.e1();
                ArrayList arrayList = q.H;
                int i = 0;
                while (true) {
                    if (i < arrayList.size()) {
                        if (((k27) arrayList.get(i)).k.id == e1) {
                            z2 = true;
                            break;
                        }
                        i++;
                    } else {
                        z2 = false;
                        break;
                    }
                }
                if (z2) {
                    z = false;
                }
            }
            if (z) {
                c();
            }
            this.h = true;
        }
    }

    public final void c() {
        int i = this.f;
        ba4.G(i).f(this.c);
        gl5 gl5Var = this.d;
        if (gl5Var != null) {
            ba4.G(i).e(null, null, null, gl5Var.f, "mp4", null);
        }
    }

    public void cancel() {
        b(true);
    }

    public final void d() {
        synchronized (this.n) {
            this.h = false;
        }
    }

    public String getFinishedFilePath() {
        return this.y;
    }

    public boolean isCanceled() {
        return this.h;
    }

    public boolean isFinishedLoadingFile() {
        return this.x;
    }

    public int read(int i, int i2) {
        boolean z;
        long j;
        ?? r10;
        long j2;
        boolean z2;
        byte b;
        int i3 = i2;
        synchronized (this.n) {
            byte b2 = 0;
            ?? r2 = 1;
            if (this.h) {
                int i4 = this.F + 1;
                this.F = i4;
                if (!this.G && i4 > 200) {
                    this.G = true;
                    fa4.g(new RuntimeException("infinity stream reading!!!"), true);
                }
                return 0;
            } else if (i3 == 0) {
                return 0;
            } else {
                long j3 = 0;
                while (j3 == 0) {
                    try {
                        l94 l94Var = this.a;
                        j = i;
                        l94Var.getClass();
                        CountDownLatch countDownLatch = new CountDownLatch(r2);
                        r10 = new long[2];
                        Utilities.d.c(new dt4(l94Var, (Serializable) r10, j, i3, countDownLatch, (byte) 4));
                        try {
                            countDownLatch.await();
                        } catch (Exception unused) {
                        }
                        j2 = r10[b2];
                    } catch (Exception e) {
                        e = e;
                    }
                    try {
                        if (!this.x) {
                            try {
                                if (r10[r2] != 0) {
                                    this.x = r2;
                                    this.y = this.a.L0.getAbsolutePath();
                                }
                            } catch (Exception e2) {
                                e = e2;
                                z = b2;
                                j3 = j2;
                                fa4.g(e, z);
                                return (int) j3;
                            }
                        }
                        if (j2 == 0) {
                            synchronized (this.n) {
                                if (this.h) {
                                    c();
                                    return b2;
                                }
                                this.b = new CountDownLatch(r2);
                                if (!this.a.Z && this.r == j && !this.w) {
                                    z2 = r2;
                                } else {
                                    ba4 G = ba4.G(this.f);
                                    TLRPC.Document document = this.c;
                                    gl5 gl5Var = this.d;
                                    Object obj = this.e;
                                    boolean z3 = this.w;
                                    boolean z4 = this.E;
                                    if (document == null) {
                                        b = r2;
                                    } else {
                                        b = b2;
                                    }
                                    CountDownLatch countDownLatch2 = new CountDownLatch(r2);
                                    int i5 = r2;
                                    l94[] l94VarArr = new l94[i5];
                                    boolean z5 = i5;
                                    byte b3 = b2;
                                    ba4.K.c(new n94(G, l94VarArr, document, gl5Var, obj, z4 ? 1 : 0, this, j, z3, b, countDownLatch2));
                                    ba4.a(countDownLatch2, z5);
                                    l94 l94Var2 = l94VarArr[b3];
                                    l94 l94Var3 = this.a;
                                    if (l94Var3 != l94Var2) {
                                        l94Var3.getClass();
                                        Utilities.d.c(new h94(l94Var3, this, b3));
                                        this.a = l94Var2;
                                    }
                                    this.r = j + j2;
                                    z2 = z5;
                                }
                                synchronized (this.n) {
                                    if (this.h) {
                                        this.b = null;
                                        c();
                                        return 0;
                                    }
                                }
                                if (!this.w) {
                                    ba4.G(this.f).b0(this.c, false, z2);
                                }
                                CountDownLatch countDownLatch3 = this.b;
                                if (countDownLatch3 != null) {
                                    this.s = z2;
                                    countDownLatch3.await();
                                    this.s = false;
                                }
                            }
                        } else {
                            z2 = r2;
                        }
                        r2 = z2;
                        j3 = j2;
                        b2 = 0;
                        i3 = i2;
                    } catch (Exception e3) {
                        e = e3;
                        j3 = j2;
                        z = 0;
                        fa4.g(e, z);
                        return (int) j3;
                    }
                }
                this.r = i + j3;
                return (int) j3;
            }
        }
    }
}
