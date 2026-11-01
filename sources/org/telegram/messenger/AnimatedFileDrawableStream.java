package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public class AnimatedFileDrawableStream implements n7 {
    public final int D;
    public int E;
    public boolean F;
    public m7 f14345a;
    public CountDownLatch f14346b;
    public final TLRPC.Document f14347c;
    public final jc d;
    public final Object e;
    public final int f14348f;
    public volatile boolean h;
    public final Object f14349n = new Object();
    public long f14350r;
    public boolean f14351s;
    public final boolean f14352w;
    public boolean f14353x;
    public String f14354y;

    public AnimatedFileDrawableStream(TLRPC.Document document, jc jcVar, Object obj, int i10, boolean z10, int i11, int i12) {
        this.f14347c = document;
        this.d = jcVar;
        this.e = obj;
        this.f14348f = i10;
        this.f14352w = z10;
        this.D = i11;
        b8 G = b8.G(i10);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        m7[] m7VarArr = new m7[1];
        b8.J.c(new t7(G, m7VarArr, document, jcVar, obj, i11, this, 0L, z10, i12, countDownLatch));
        b8.a(countDownLatch, true);
        this.f14345a = m7VarArr[0];
    }

    @Override
    public final void a() {
        CountDownLatch countDownLatch = this.f14346b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            this.f14346b = null;
        }
    }

    public final void b(boolean z10) {
        boolean z11;
        if (this.h) {
            return;
        }
        synchronized (this.f14349n) {
            try {
                CountDownLatch countDownLatch = this.f14346b;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                    this.f14346b = null;
                    if (z10 && !this.h && !this.f14352w) {
                        b8.G(this.f14348f).a0(this.f14347c, false, true);
                    }
                }
                Object obj = this.e;
                if (obj instanceof kj) {
                    kj kjVar = (kj) obj;
                    b6 q6 = b6.q(kjVar.I1);
                    int f12 = kjVar.f1();
                    ArrayList arrayList = q6.G;
                    int i10 = 0;
                    while (true) {
                        if (i10 < arrayList.size()) {
                            if (((kj) arrayList.get(i10)).f16690k.f19815id == f12) {
                                z11 = true;
                                break;
                            }
                            i10++;
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
        int i10 = this.f14348f;
        b8.G(i10).f(this.f14347c);
        jc jcVar = this.d;
        if (jcVar != null) {
            b8.G(i10).e(null, null, null, jcVar.f16435f, "mp4", null);
        }
    }

    public void cancel() {
        b(true);
    }

    public final void d() {
        synchronized (this.f14349n) {
            this.h = false;
        }
    }

    public String getFinishedFilePath() {
        return this.f14354y;
    }

    public boolean isCanceled() {
        return this.h;
    }

    public boolean isFinishedLoadingFile() {
        return this.f14353x;
    }

    public int read(int i10, int i11) {
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        int i14 = i11;
        synchronized (this.f14349n) {
            try {
                int i15 = 0;
                ?? r22 = 1;
                if (this.h) {
                    int i16 = this.E + 1;
                    this.E = i16;
                    if (!this.F && i16 > 200) {
                        this.F = true;
                        f8.g(new RuntimeException("infinity stream reading!!!"), true);
                    }
                    return 0;
                } else if (i14 == 0) {
                    return 0;
                } else {
                    long j10 = 0;
                    while (j10 == 0) {
                        try {
                            m7 m7Var = this.f14345a;
                            long j11 = i10;
                            m7Var.getClass();
                            CountDownLatch countDownLatch = new CountDownLatch(r22);
                            ?? r10 = new long[2];
                            Utilities.d.c(new n9(m7Var, (Serializable) r10, j11, i14, countDownLatch, 2));
                            try {
                                countDownLatch.await();
                            } catch (Exception unused) {
                            }
                            long j12 = r10[i15];
                            try {
                                if (!this.f14353x) {
                                    try {
                                        if (r10[r22] != 0) {
                                            this.f14353x = r22;
                                            this.f14354y = this.f14345a.L0.getAbsolutePath();
                                        }
                                    } catch (Exception e) {
                                        e = e;
                                        z10 = i15;
                                        j10 = j12;
                                        f8.g(e, z10);
                                        return (int) j10;
                                    }
                                }
                                if (j12 == 0) {
                                    synchronized (this.f14349n) {
                                        if (this.h) {
                                            c();
                                            return i15;
                                        }
                                        this.f14346b = new CountDownLatch(r22);
                                        if (!this.f14345a.Z && this.f14350r == j11 && !this.f14352w) {
                                            z11 = r22;
                                            i13 = i15;
                                        } else {
                                            b8 G = b8.G(this.f14348f);
                                            TLRPC.Document document = this.f14347c;
                                            jc jcVar = this.d;
                                            Object obj = this.e;
                                            boolean z12 = this.f14352w;
                                            int i17 = this.D;
                                            if (document == null) {
                                                i12 = r22;
                                            } else {
                                                i12 = i15;
                                            }
                                            CountDownLatch countDownLatch2 = new CountDownLatch(r22);
                                            int i18 = r22;
                                            m7[] m7VarArr = new m7[i18];
                                            boolean z13 = i18;
                                            i13 = i15;
                                            b8.J.c(new t7(G, m7VarArr, document, jcVar, obj, i17, this, j11, z12, i12, countDownLatch2));
                                            b8.a(countDownLatch2, z13);
                                            m7 m7Var2 = m7VarArr[i13];
                                            m7 m7Var3 = this.f14345a;
                                            if (m7Var3 != m7Var2) {
                                                try {
                                                    m7Var3.getClass();
                                                    Utilities.d.c(new i7(m7Var3, this, 0));
                                                    this.f14345a = m7Var2;
                                                } catch (Exception e7) {
                                                    e = e7;
                                                    j10 = j12;
                                                    z10 = i13;
                                                    f8.g(e, z10);
                                                    return (int) j10;
                                                }
                                            }
                                            this.f14350r = j11 + j12;
                                            z11 = z13;
                                        }
                                        synchronized (this.f14349n) {
                                            if (this.h) {
                                                this.f14346b = null;
                                                c();
                                                return i13;
                                            }
                                        }
                                        if (!this.f14352w) {
                                            b8.G(this.f14348f).c0(this.f14347c, i13, z11);
                                        }
                                        CountDownLatch countDownLatch3 = this.f14346b;
                                        if (countDownLatch3 != null) {
                                            this.f14351s = z11;
                                            countDownLatch3.await();
                                            this.f14351s = false;
                                        }
                                    }
                                } else {
                                    z11 = r22;
                                }
                                r22 = z11;
                                j10 = j12;
                                i15 = 0;
                                i14 = i11;
                            } catch (Exception e10) {
                                e = e10;
                                j10 = j12;
                                z10 = 0;
                                f8.g(e, z10);
                                return (int) j10;
                            }
                        } catch (Exception e11) {
                            e = e11;
                        }
                    }
                    this.f14350r = i10 + j10;
                    return (int) j10;
                }
            } finally {
            }
        }
    }
}
