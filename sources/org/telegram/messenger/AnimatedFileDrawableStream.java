package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public class AnimatedFileDrawableStream implements j7 {
    public final int D;
    public int E;
    public boolean F;
    public i7 f21154a;
    public CountDownLatch f21155b;
    public final TLRPC.Document f21156c;
    public final hc d;
    public final Object f21157e;
    public final int f21158f;
    public volatile boolean h;
    public final Object f21159n = new Object();
    public long f21160r;
    public boolean f21161s;
    public final boolean f21162w;
    public boolean f21163x;
    public String f21164y;

    public AnimatedFileDrawableStream(TLRPC.Document document, hc hcVar, Object obj, int i7, boolean z9, int i10, int i11) {
        this.f21156c = document;
        this.d = hcVar;
        this.f21157e = obj;
        this.f21158f = i7;
        this.f21162w = z9;
        this.D = i10;
        w7 G = w7.G(i7);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        i7[] i7VarArr = new i7[1];
        w7.J.c(new k7(G, i7VarArr, document, hcVar, obj, i10, this, 0L, z9, i11, countDownLatch));
        w7.a(countDownLatch, true);
        this.f21154a = i7VarArr[0];
    }

    @Override
    public final void a() {
        CountDownLatch countDownLatch = this.f21155b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            this.f21155b = null;
        }
    }

    public final void b(boolean z9) {
        boolean z10;
        if (this.h) {
            return;
        }
        synchronized (this.f21159n) {
            try {
                CountDownLatch countDownLatch = this.f21155b;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                    this.f21155b = null;
                    if (z9 && !this.h && !this.f21162w) {
                        w7.G(this.f21158f).Z(this.f21156c, false, true);
                    }
                }
                Object obj = this.f21157e;
                if (obj instanceof ij) {
                    ij ijVar = (ij) obj;
                    z5 q10 = z5.q(ijVar.I1);
                    int f12 = ijVar.f1();
                    ArrayList arrayList = q10.G;
                    int i7 = 0;
                    while (true) {
                        if (i7 < arrayList.size()) {
                            if (((ij) arrayList.get(i7)).f23262k.f26977id == f12) {
                                z10 = true;
                                break;
                            }
                            i7++;
                        } else {
                            z10 = false;
                            break;
                        }
                    }
                    if (z10) {
                        z9 = false;
                    }
                }
                if (z9) {
                    c();
                }
                this.h = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        int i7 = this.f21158f;
        w7.G(i7).f(this.f21156c);
        hc hcVar = this.d;
        if (hcVar != null) {
            w7.G(i7).e(null, null, null, hcVar.f22869f, "mp4", null);
        }
    }

    public void cancel() {
        b(true);
    }

    public final void d() {
        synchronized (this.f21159n) {
            this.h = false;
        }
    }

    public String getFinishedFilePath() {
        return this.f21164y;
    }

    public boolean isCanceled() {
        return this.h;
    }

    public boolean isFinishedLoadingFile() {
        return this.f21163x;
    }

    public int read(int i7, int i10) {
        boolean z9;
        boolean z10;
        int i11;
        int i12;
        int i13 = i10;
        synchronized (this.f21159n) {
            try {
                int i14 = 0;
                ?? r22 = 1;
                if (this.h) {
                    int i15 = this.E + 1;
                    this.E = i15;
                    if (!this.F && i15 > 200) {
                        this.F = true;
                        a8.g(new RuntimeException("infinity stream reading!!!"), true);
                    }
                    return 0;
                } else if (i13 == 0) {
                    return 0;
                } else {
                    long j3 = 0;
                    while (j3 == 0) {
                        try {
                            i7 i7Var = this.f21154a;
                            long j10 = i7;
                            i7Var.getClass();
                            CountDownLatch countDownLatch = new CountDownLatch(r22);
                            ?? r10 = new long[2];
                            Utilities.d.c(new l9(i7Var, (Serializable) r10, j10, i13, countDownLatch, 2));
                            try {
                                countDownLatch.await();
                            } catch (Exception unused) {
                            }
                            long j11 = r10[i14];
                            try {
                                if (!this.f21163x) {
                                    try {
                                        if (r10[r22] != 0) {
                                            this.f21163x = r22;
                                            this.f21164y = this.f21154a.L0.getAbsolutePath();
                                        }
                                    } catch (Exception e10) {
                                        e = e10;
                                        z9 = i14;
                                        j3 = j11;
                                        a8.g(e, z9);
                                        return (int) j3;
                                    }
                                }
                                if (j11 == 0) {
                                    synchronized (this.f21159n) {
                                        if (this.h) {
                                            c();
                                            return i14;
                                        }
                                        this.f21155b = new CountDownLatch(r22);
                                        if (!this.f21154a.Z && this.f21160r == j10 && !this.f21162w) {
                                            z10 = r22;
                                            i12 = i14;
                                        } else {
                                            w7 G = w7.G(this.f21158f);
                                            TLRPC.Document document = this.f21156c;
                                            hc hcVar = this.d;
                                            Object obj = this.f21157e;
                                            boolean z11 = this.f21162w;
                                            int i16 = this.D;
                                            if (document == null) {
                                                i11 = r22;
                                            } else {
                                                i11 = i14;
                                            }
                                            CountDownLatch countDownLatch2 = new CountDownLatch(r22);
                                            int i17 = r22;
                                            i7[] i7VarArr = new i7[i17];
                                            boolean z12 = i17;
                                            i12 = i14;
                                            w7.J.c(new k7(G, i7VarArr, document, hcVar, obj, i16, this, j10, z11, i11, countDownLatch2));
                                            w7.a(countDownLatch2, z12);
                                            i7 i7Var2 = i7VarArr[i12];
                                            i7 i7Var3 = this.f21154a;
                                            if (i7Var3 != i7Var2) {
                                                try {
                                                    i7Var3.getClass();
                                                    Utilities.d.c(new e7(i7Var3, this, 0));
                                                    this.f21154a = i7Var2;
                                                } catch (Exception e11) {
                                                    e = e11;
                                                    j3 = j11;
                                                    z9 = i12;
                                                    a8.g(e, z9);
                                                    return (int) j3;
                                                }
                                            }
                                            this.f21160r = j10 + j11;
                                            z10 = z12;
                                        }
                                        synchronized (this.f21159n) {
                                            if (this.h) {
                                                this.f21155b = null;
                                                c();
                                                return i12;
                                            }
                                        }
                                        if (!this.f21162w) {
                                            w7.G(this.f21158f).b0(this.f21156c, i12, z10);
                                        }
                                        CountDownLatch countDownLatch3 = this.f21155b;
                                        if (countDownLatch3 != null) {
                                            this.f21161s = z10;
                                            countDownLatch3.await();
                                            this.f21161s = false;
                                        }
                                    }
                                } else {
                                    z10 = r22;
                                }
                                r22 = z10;
                                j3 = j11;
                                i14 = 0;
                                i13 = i10;
                            } catch (Exception e12) {
                                e = e12;
                                j3 = j11;
                                z9 = 0;
                                a8.g(e, z9);
                                return (int) j3;
                            }
                        } catch (Exception e13) {
                            e = e13;
                        }
                    }
                    this.f21160r = i7 + j3;
                    return (int) j3;
                }
            } finally {
            }
        }
    }
}
