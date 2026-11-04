package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public class AnimatedFileDrawableStream implements j7 {
    public final int E;
    public int F;
    public boolean G;
    public i7 f21204a;
    public CountDownLatch f21205b;
    public final TLRPC.Document f21206c;
    public final ac d;
    public final Object f21207e;
    public final int f21208f;
    public volatile boolean h;
    public final Object f21209n = new Object();
    public long f21210r;
    public boolean f21211s;
    public final boolean f21212w;
    public boolean f21213x;
    public String f21214y;

    public AnimatedFileDrawableStream(TLRPC.Document document, ac acVar, Object obj, int i3, boolean z10, int i10, int i11) {
        this.f21206c = document;
        this.d = acVar;
        this.f21207e = obj;
        this.f21208f = i3;
        this.f21212w = z10;
        this.E = i10;
        w7 G = w7.G(i3);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        i7[] i7VarArr = new i7[1];
        w7.K.c(new o7(G, i7VarArr, document, acVar, obj, i10, this, 0L, z10, i11, countDownLatch));
        w7.a(countDownLatch, true);
        this.f21204a = i7VarArr[0];
    }

    @Override
    public final void a() {
        CountDownLatch countDownLatch = this.f21205b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            this.f21205b = null;
        }
    }

    public final void b(boolean z10) {
        boolean z11;
        if (this.h) {
            return;
        }
        synchronized (this.f21209n) {
            try {
                CountDownLatch countDownLatch = this.f21205b;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                    this.f21205b = null;
                    if (z10 && !this.h && !this.f21212w) {
                        w7.G(this.f21208f).a0(this.f21206c, false, true);
                    }
                }
                Object obj = this.f21207e;
                if (obj instanceof zi) {
                    zi ziVar = (zi) obj;
                    z5 q10 = z5.q(ziVar.I1);
                    int f12 = ziVar.f1();
                    ArrayList arrayList = q10.H;
                    int i3 = 0;
                    while (true) {
                        if (i3 < arrayList.size()) {
                            if (((zi) arrayList.get(i3)).f26868k.f27022id == f12) {
                                z11 = true;
                                break;
                            }
                            i3++;
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
        int i3 = this.f21208f;
        w7.G(i3).f(this.f21206c);
        ac acVar = this.d;
        if (acVar != null) {
            w7.G(i3).e(null, null, null, acVar.f21488f, "mp4", null);
        }
    }

    public void cancel() {
        b(true);
    }

    public final void d() {
        synchronized (this.f21209n) {
            this.h = false;
        }
    }

    public String getFinishedFilePath() {
        return this.f21214y;
    }

    public boolean isCanceled() {
        return this.h;
    }

    public boolean isFinishedLoadingFile() {
        return this.f21213x;
    }

    public int read(int i3, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        int i12;
        int i13 = i10;
        synchronized (this.f21209n) {
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
                    long j10 = 0;
                    while (j10 == 0) {
                        try {
                            i7 i7Var = this.f21204a;
                            long j11 = i3;
                            i7Var.getClass();
                            CountDownLatch countDownLatch = new CountDownLatch(r22);
                            ?? r10 = new long[2];
                            Utilities.d.c(new f9(i7Var, (Serializable) r10, j11, i13, countDownLatch, 2));
                            try {
                                countDownLatch.await();
                            } catch (Exception unused) {
                            }
                            long j12 = r10[i14];
                            try {
                                if (!this.f21213x) {
                                    try {
                                        if (r10[r22] != 0) {
                                            this.f21213x = r22;
                                            this.f21214y = this.f21204a.L0.getAbsolutePath();
                                        }
                                    } catch (Exception e10) {
                                        e = e10;
                                        z10 = i14;
                                        j10 = j12;
                                        a8.g(e, z10);
                                        return (int) j10;
                                    }
                                }
                                if (j12 == 0) {
                                    synchronized (this.f21209n) {
                                        if (this.h) {
                                            c();
                                            return i14;
                                        }
                                        this.f21205b = new CountDownLatch(r22);
                                        if (!this.f21204a.Z && this.f21210r == j11 && !this.f21212w) {
                                            z11 = r22;
                                            i12 = i14;
                                        } else {
                                            w7 G = w7.G(this.f21208f);
                                            TLRPC.Document document = this.f21206c;
                                            ac acVar = this.d;
                                            Object obj = this.f21207e;
                                            boolean z12 = this.f21212w;
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
                                            w7.K.c(new o7(G, i7VarArr, document, acVar, obj, i16, this, j11, z12, i11, countDownLatch2));
                                            w7.a(countDownLatch2, z13);
                                            i7 i7Var2 = i7VarArr[i12];
                                            i7 i7Var3 = this.f21204a;
                                            if (i7Var3 != i7Var2) {
                                                try {
                                                    i7Var3.getClass();
                                                    Utilities.d.c(new e7(i7Var3, this, 0));
                                                    this.f21204a = i7Var2;
                                                } catch (Exception e11) {
                                                    e = e11;
                                                    j10 = j12;
                                                    z10 = i12;
                                                    a8.g(e, z10);
                                                    return (int) j10;
                                                }
                                            }
                                            this.f21210r = j11 + j12;
                                            z11 = z13;
                                        }
                                        synchronized (this.f21209n) {
                                            if (this.h) {
                                                this.f21205b = null;
                                                c();
                                                return i12;
                                            }
                                        }
                                        if (!this.f21212w) {
                                            w7.G(this.f21208f).c0(this.f21206c, i12, z11);
                                        }
                                        CountDownLatch countDownLatch3 = this.f21205b;
                                        if (countDownLatch3 != null) {
                                            this.f21211s = z11;
                                            countDownLatch3.await();
                                            this.f21211s = false;
                                        }
                                    }
                                } else {
                                    z11 = r22;
                                }
                                r22 = z11;
                                j10 = j12;
                                i14 = 0;
                                i13 = i10;
                            } catch (Exception e12) {
                                e = e12;
                                j10 = j12;
                                z10 = 0;
                                a8.g(e, z10);
                                return (int) j10;
                            }
                        } catch (Exception e13) {
                            e = e13;
                        }
                    }
                    this.f21210r = i3 + j10;
                    return (int) j10;
                }
            } finally {
            }
        }
    }
}
