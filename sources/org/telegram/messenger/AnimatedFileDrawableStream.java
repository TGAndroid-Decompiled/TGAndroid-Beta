package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public class AnimatedFileDrawableStream implements mb4 {
    public final boolean E;
    public int F;
    public boolean G;
    public lb4 a;
    public CountDownLatch b;
    public final TLRPC.Document c;
    public final gn5 d;
    public final Object e;
    public final int f;
    public volatile boolean h;
    public final Object n = new Object();
    public long r;
    public boolean s;
    public final boolean w;
    public boolean x;
    public String y;

    public AnimatedFileDrawableStream(TLRPC.Document document, gn5 gn5Var, Object obj, int i, boolean z, int i2, int i3) {
        this.c = document;
        this.d = gn5Var;
        this.e = obj;
        this.f = i;
        this.w = z;
        this.E = i2;
        bc4 G = bc4.G(i);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        lb4[] lb4VarArr = new lb4[1];
        bc4.K.c(new nb4(G, lb4VarArr, document, gn5Var, obj, i2, this, 0L, z, i3, countDownLatch));
        bc4.a(countDownLatch, true);
        this.a = lb4VarArr[0];
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
                    bc4.G(this.f).Z(this.c, false, true);
                }
            }
            Object obj = this.e;
            if (obj instanceof k47) {
                k47 k47Var = (k47) obj;
                er3 q = er3.q(k47Var.K1);
                int e1 = k47Var.e1();
                ArrayList arrayList = q.H;
                int i = 0;
                while (true) {
                    if (i < arrayList.size()) {
                        if (((k47) arrayList.get(i)).k.id == e1) {
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
        bc4.G(i).f(this.c);
        gn5 gn5Var = this.d;
        if (gn5Var != null) {
            bc4.G(i).e(null, null, null, gn5Var.f, "mp4", null);
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
                    fc4.g(new RuntimeException("infinity stream reading!!!"), true);
                }
                return 0;
            } else if (i3 == 0) {
                return 0;
            } else {
                long j3 = 0;
                while (j3 == 0) {
                    try {
                        lb4 lb4Var = this.a;
                        j = i;
                        lb4Var.getClass();
                        CountDownLatch countDownLatch = new CountDownLatch(r2);
                        r10 = new long[2];
                        Utilities.d.c(new ev4(lb4Var, (Serializable) r10, j, i3, countDownLatch, (byte) 4));
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
                                fc4.g(e, z);
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
                                    bc4 G = bc4.G(this.f);
                                    TLRPC.Document document = this.c;
                                    gn5 gn5Var = this.d;
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
                                    lb4[] lb4VarArr = new lb4[i5];
                                    boolean z5 = i5;
                                    byte b3 = b2;
                                    bc4.K.c(new nb4(G, lb4VarArr, document, gn5Var, obj, z4 ? 1 : 0, this, j, z3, b, countDownLatch2));
                                    bc4.a(countDownLatch2, z5);
                                    lb4 lb4Var2 = lb4VarArr[b3];
                                    lb4 lb4Var3 = this.a;
                                    if (lb4Var3 != lb4Var2) {
                                        lb4Var3.getClass();
                                        Utilities.d.c(new hb4(lb4Var3, this, b3));
                                        this.a = lb4Var2;
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
                                    bc4.G(this.f).b0(this.c, false, z2);
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
                        fc4.g(e, z);
                        return (int) j3;
                    }
                }
                this.r = i + j3;
                return (int) j3;
            }
        }
    }
}
