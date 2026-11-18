package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public class AnimatedFileDrawableStream implements j7 {
    public final int E;
    public int F;
    public boolean G;
    public i7 f22599a;
    public CountDownLatch f22600b;
    public final TLRPC.Document f22601c;
    public final fc d;
    public final Object f22602e;
    public final int f22603f;
    public volatile boolean h;
    public final Object f22604n = new Object();
    public long f22605r;
    public boolean f22606s;
    public final boolean f22607w;
    public boolean f22608x;
    public String f22609y;

    public AnimatedFileDrawableStream(TLRPC.Document document, fc fcVar, Object obj, int i7, boolean z10, int i10, int i11) {
        this.f22601c = document;
        this.d = fcVar;
        this.f22602e = obj;
        this.f22603f = i7;
        this.f22607w = z10;
        this.E = i10;
        w7 G = w7.G(i7);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        i7[] i7VarArr = new i7[1];
        w7.K.c(new k7(G, i7VarArr, document, fcVar, obj, i10, this, 0L, z10, i11, countDownLatch));
        w7.a(countDownLatch, true);
        this.f22599a = i7VarArr[0];
    }

    @Override
    public final void a() {
        CountDownLatch countDownLatch = this.f22600b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            this.f22600b = null;
        }
    }

    public final void b(boolean z10) {
        boolean z11;
        if (this.h) {
            return;
        }
        synchronized (this.f22604n) {
            try {
                CountDownLatch countDownLatch = this.f22600b;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                    this.f22600b = null;
                    if (z10 && !this.h && !this.f22607w) {
                        w7.G(this.f22603f).Z(this.f22601c, false, true);
                    }
                }
                Object obj = this.f22602e;
                if (obj instanceof fj) {
                    fj fjVar = (fj) obj;
                    a6 q10 = a6.q(fjVar.K1);
                    int e12 = fjVar.e1();
                    ArrayList arrayList = q10.H;
                    int i7 = 0;
                    while (true) {
                        if (i7 < arrayList.size()) {
                            if (((fj) arrayList.get(i7)).f23968k.f28426id == e12) {
                                z11 = true;
                                break;
                            }
                            i7++;
                        } else {
                            z11 = false;
                            break;
                        }
                    }
                    if (z11) {
                        z10 = false;
                    }
                }
                if (z10) {
                    c();
                }
                this.h = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        int i7 = this.f22603f;
        w7.G(i7).f(this.f22601c);
        fc fcVar = this.d;
        if (fcVar != null) {
            w7.G(i7).e(null, null, null, fcVar.f23871f, "mp4", null);
        }
    }

    public void cancel() {
        b(true);
    }

    public final void d() {
        synchronized (this.f22604n) {
            this.h = false;
        }
    }

    public String getFinishedFilePath() {
        return this.f22609y;
    }

    public boolean isCanceled() {
        return this.h;
    }

    public boolean isFinishedLoadingFile() {
        return this.f22608x;
    }

    public int read(int i7, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        int i12;
        int i13 = i10;
        synchronized (this.f22604n) {
            try {
                int i14 = 0;
                ?? r22 = 1;
                if (this.h) {
                    int i15 = this.F + 1;
                    this.F = i15;
                    if (!this.G && i15 > 200) {
                        this.G = true;
                        a8.g(new RuntimeException("infinity stream reading!!!"), true);
                    }
                    return 0;
                } else if (i13 == 0) {
                    return 0;
                } else {
                    long j3 = 0;
                    while (j3 == 0) {
                        try {
                            i7 i7Var = this.f22599a;
                            long j10 = i7;
                            i7Var.getClass();
                            CountDownLatch countDownLatch = new CountDownLatch(r22);
                            ?? r10 = new long[2];
                            Utilities.d.c(new j9(i7Var, (Serializable) r10, j10, i13, countDownLatch, 2));
                            try {
                                countDownLatch.await();
                            } catch (Exception unused) {
                            }
                            long j11 = r10[i14];
                            try {
                                if (!this.f22608x) {
                                    try {
                                        if (r10[r22] != 0) {
                                            this.f22608x = r22;
                                            this.f22609y = this.f22599a.L0.getAbsolutePath();
                                        }
                                    } catch (Exception e10) {
                                        e = e10;
                                        z10 = i14;
                                        j3 = j11;
                                        a8.g(e, z10);
                                        return (int) j3;
                                    }
                                }
                                if (j11 == 0) {
                                    synchronized (this.f22604n) {
                                        if (this.h) {
                                            c();
                                            return i14;
                                        }
                                        this.f22600b = new CountDownLatch(r22);
                                        if (!this.f22599a.Z && this.f22605r == j10 && !this.f22607w) {
                                            z11 = r22;
                                            i12 = i14;
                                        } else {
                                            w7 G = w7.G(this.f22603f);
                                            TLRPC.Document document = this.f22601c;
                                            fc fcVar = this.d;
                                            Object obj = this.f22602e;
                                            boolean z12 = this.f22607w;
                                            int i16 = this.E;
                                            if (document == null) {
                                                i11 = r22;
                                            } else {
                                                i11 = i14;
                                            }
                                            CountDownLatch countDownLatch2 = new CountDownLatch(r22);
                                            int i17 = r22;
                                            i7[] i7VarArr = new i7[i17];
                                            boolean z13 = i17;
                                            i12 = i14;
                                            w7.K.c(new k7(G, i7VarArr, document, fcVar, obj, i16, this, j10, z12, i11, countDownLatch2));
                                            w7.a(countDownLatch2, z13);
                                            i7 i7Var2 = i7VarArr[i12];
                                            i7 i7Var3 = this.f22599a;
                                            if (i7Var3 != i7Var2) {
                                                try {
                                                    i7Var3.getClass();
                                                    Utilities.d.c(new e7(i7Var3, this, 0));
                                                    this.f22599a = i7Var2;
                                                } catch (Exception e11) {
                                                    e = e11;
                                                    j3 = j11;
                                                    z10 = i12;
                                                    a8.g(e, z10);
                                                    return (int) j3;
                                                }
                                            }
                                            this.f22605r = j10 + j11;
                                            z11 = z13;
                                        }
                                        synchronized (this.f22604n) {
                                            if (this.h) {
                                                this.f22600b = null;
                                                c();
                                                return i12;
                                            }
                                        }
                                        if (!this.f22607w) {
                                            w7.G(this.f22603f).b0(this.f22601c, i12, z11);
                                        }
                                        CountDownLatch countDownLatch3 = this.f22600b;
                                        if (countDownLatch3 != null) {
                                            this.f22606s = z11;
                                            countDownLatch3.await();
                                            this.f22606s = false;
                                        }
                                    }
                                } else {
                                    z11 = r22;
                                }
                                r22 = z11;
                                j3 = j11;
                                i14 = 0;
                                i13 = i10;
                            } catch (Exception e12) {
                                e = e12;
                                j3 = j11;
                                z10 = 0;
                                a8.g(e, z10);
                                return (int) j3;
                            }
                        } catch (Exception e13) {
                            e = e13;
                        }
                    }
                    this.f22605r = i7 + j3;
                    return (int) j3;
                }
            } finally {
            }
        }
    }
}
