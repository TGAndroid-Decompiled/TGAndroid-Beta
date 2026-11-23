package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public class AnimatedFileDrawableStream implements j7 {
    public final int E;
    public int F;
    public boolean G;
    public i7 f22627a;
    public CountDownLatch f22628b;
    public final TLRPC.Document f22629c;
    public final gc d;
    public final Object f22630e;
    public final int f22631f;
    public volatile boolean h;
    public final Object f22632n = new Object();
    public long f22633r;
    public boolean f22634s;
    public final boolean f22635w;
    public boolean f22636x;
    public String f22637y;

    public AnimatedFileDrawableStream(TLRPC.Document document, gc gcVar, Object obj, int i7, boolean z10, int i10, int i11) {
        this.f22629c = document;
        this.d = gcVar;
        this.f22630e = obj;
        this.f22631f = i7;
        this.f22635w = z10;
        this.E = i10;
        w7 G = w7.G(i7);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        i7[] i7VarArr = new i7[1];
        w7.K.c(new k7(G, i7VarArr, document, gcVar, obj, i10, this, 0L, z10, i11, countDownLatch));
        w7.a(countDownLatch, true);
        this.f22627a = i7VarArr[0];
    }

    @Override
    public final void a() {
        CountDownLatch countDownLatch = this.f22628b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            this.f22628b = null;
        }
    }

    public final void b(boolean z10) {
        boolean z11;
        if (this.h) {
            return;
        }
        synchronized (this.f22632n) {
            try {
                CountDownLatch countDownLatch = this.f22628b;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                    this.f22628b = null;
                    if (z10 && !this.h && !this.f22635w) {
                        w7.G(this.f22631f).Z(this.f22629c, false, true);
                    }
                }
                Object obj = this.f22630e;
                if (obj instanceof gj) {
                    gj gjVar = (gj) obj;
                    a6 q10 = a6.q(gjVar.K1);
                    int e12 = gjVar.e1();
                    ArrayList arrayList = q10.H;
                    int i7 = 0;
                    while (true) {
                        if (i7 < arrayList.size()) {
                            if (((gj) arrayList.get(i7)).f24213k.f28455id == e12) {
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
        int i7 = this.f22631f;
        w7.G(i7).f(this.f22629c);
        gc gcVar = this.d;
        if (gcVar != null) {
            w7.G(i7).e(null, null, null, gcVar.f24116f, "mp4", null);
        }
    }

    public void cancel() {
        b(true);
    }

    public final void d() {
        synchronized (this.f22632n) {
            this.h = false;
        }
    }

    public String getFinishedFilePath() {
        return this.f22637y;
    }

    public boolean isCanceled() {
        return this.h;
    }

    public boolean isFinishedLoadingFile() {
        return this.f22636x;
    }

    public int read(int i7, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        int i12;
        int i13 = i10;
        synchronized (this.f22632n) {
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
                            i7 i7Var = this.f22627a;
                            long j10 = i7;
                            i7Var.getClass();
                            CountDownLatch countDownLatch = new CountDownLatch(r22);
                            ?? r10 = new long[2];
                            Utilities.d.c(new k9(i7Var, (Serializable) r10, j10, i13, countDownLatch, 2));
                            try {
                                countDownLatch.await();
                            } catch (Exception unused) {
                            }
                            long j11 = r10[i14];
                            try {
                                if (!this.f22636x) {
                                    try {
                                        if (r10[r22] != 0) {
                                            this.f22636x = r22;
                                            this.f22637y = this.f22627a.L0.getAbsolutePath();
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
                                    synchronized (this.f22632n) {
                                        if (this.h) {
                                            c();
                                            return i14;
                                        }
                                        this.f22628b = new CountDownLatch(r22);
                                        if (!this.f22627a.Z && this.f22633r == j10 && !this.f22635w) {
                                            z11 = r22;
                                            i12 = i14;
                                        } else {
                                            w7 G = w7.G(this.f22631f);
                                            TLRPC.Document document = this.f22629c;
                                            gc gcVar = this.d;
                                            Object obj = this.f22630e;
                                            boolean z12 = this.f22635w;
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
                                            w7.K.c(new k7(G, i7VarArr, document, gcVar, obj, i16, this, j10, z12, i11, countDownLatch2));
                                            w7.a(countDownLatch2, z13);
                                            i7 i7Var2 = i7VarArr[i12];
                                            i7 i7Var3 = this.f22627a;
                                            if (i7Var3 != i7Var2) {
                                                try {
                                                    i7Var3.getClass();
                                                    Utilities.d.c(new e7(i7Var3, this, 0));
                                                    this.f22627a = i7Var2;
                                                } catch (Exception e11) {
                                                    e = e11;
                                                    j3 = j11;
                                                    z10 = i12;
                                                    a8.g(e, z10);
                                                    return (int) j3;
                                                }
                                            }
                                            this.f22633r = j10 + j11;
                                            z11 = z13;
                                        }
                                        synchronized (this.f22632n) {
                                            if (this.h) {
                                                this.f22628b = null;
                                                c();
                                                return i12;
                                            }
                                        }
                                        if (!this.f22635w) {
                                            w7.G(this.f22631f).b0(this.f22629c, i12, z11);
                                        }
                                        CountDownLatch countDownLatch3 = this.f22628b;
                                        if (countDownLatch3 != null) {
                                            this.f22634s = z11;
                                            countDownLatch3.await();
                                            this.f22634s = false;
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
                    this.f22633r = i7 + j3;
                    return (int) j3;
                }
            } finally {
            }
        }
    }
}
