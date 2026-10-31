package h2;

import java.util.ArrayDeque;
import v7.t6;
public abstract class l implements e {
    public final k f7591a;
    public final h[] e;
    public final j[] f7594f;
    public int f7595g;
    public int h;
    public h f7596i;
    public f f7597j;
    public boolean f7598k;
    public boolean f7599l;
    public int f7600m;
    public final Object f7592b = new Object();
    public long f7601n = -9223372036854775807L;
    public final ArrayDeque f7593c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    public l(h[] hVarArr, j[] jVarArr) {
        this.e = hVarArr;
        this.f7595g = hVarArr.length;
        for (int i10 = 0; i10 < this.f7595g; i10++) {
            this.e[i10] = f();
        }
        this.f7594f = jVarArr;
        this.h = jVarArr.length;
        for (int i11 = 0; i11 < this.h; i11++) {
            this.f7594f[i11] = g();
        }
        k kVar = new k(this);
        this.f7591a = kVar;
        kVar.start();
    }

    @Override
    public final void a(long j10) {
        boolean z10;
        synchronized (this.f7592b) {
            try {
                if (this.f7595g != this.e.length && !this.f7598k) {
                    z10 = false;
                    t6.p(z10);
                    this.f7601n = j10;
                }
                z10 = true;
                t6.p(z10);
                this.f7601n = j10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final Object d() {
        boolean z10;
        h hVar;
        synchronized (this.f7592b) {
            try {
                f fVar = this.f7597j;
                if (fVar == null) {
                    if (this.f7596i == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    t6.p(z10);
                    int i10 = this.f7595g;
                    if (i10 == 0) {
                        hVar = null;
                    } else {
                        h[] hVarArr = this.e;
                        int i11 = i10 - 1;
                        this.f7595g = i11;
                        hVar = hVarArr[i11];
                    }
                    this.f7596i = hVar;
                } else {
                    throw fVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }

    public abstract h f();

    @Override
    public final void flush() {
        synchronized (this.f7592b) {
            try {
                this.f7598k = true;
                this.f7600m = 0;
                h hVar = this.f7596i;
                if (hVar != null) {
                    hVar.clear();
                    h[] hVarArr = this.e;
                    int i10 = this.f7595g;
                    this.f7595g = i10 + 1;
                    hVarArr[i10] = hVar;
                    this.f7596i = null;
                }
                while (!this.f7593c.isEmpty()) {
                    h hVar2 = (h) this.f7593c.removeFirst();
                    hVar2.clear();
                    h[] hVarArr2 = this.e;
                    int i11 = this.f7595g;
                    this.f7595g = i11 + 1;
                    hVarArr2[i11] = hVar2;
                }
                while (!this.d.isEmpty()) {
                    ((j) this.d.removeFirst()).release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract j g();

    public abstract f h(Throwable th2);

    public abstract f i(h hVar, j jVar, boolean z10);

    public final boolean j() {
        f h;
        boolean z10;
        synchronized (this.f7592b) {
            while (!this.f7599l) {
                try {
                    if (!this.f7593c.isEmpty() && this.h > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        break;
                    }
                    this.f7592b.wait();
                } finally {
                }
            }
            if (this.f7599l) {
                return false;
            }
            h hVar = (h) this.f7593c.removeFirst();
            j[] jVarArr = this.f7594f;
            int i10 = this.h - 1;
            this.h = i10;
            j jVar = jVarArr[i10];
            boolean z11 = this.f7598k;
            this.f7598k = false;
            if (hVar.isEndOfStream()) {
                jVar.addFlag(4);
            } else {
                jVar.timeUs = hVar.e;
                if (hVar.isFirstSample()) {
                    jVar.addFlag(134217728);
                }
                if (!l(hVar.e)) {
                    jVar.shouldBeSkipped = true;
                }
                try {
                    h = i(hVar, jVar, z11);
                } catch (OutOfMemoryError e) {
                    h = h(e);
                } catch (RuntimeException e7) {
                    h = h(e7);
                }
                if (h != null) {
                    synchronized (this.f7592b) {
                        this.f7597j = h;
                    }
                    return false;
                }
            }
            synchronized (this.f7592b) {
                try {
                    if (this.f7598k) {
                        jVar.release();
                    } else if (jVar.shouldBeSkipped) {
                        this.f7600m++;
                        jVar.release();
                    } else {
                        jVar.skippedOutputBufferCount = this.f7600m;
                        this.f7600m = 0;
                        this.d.addLast(jVar);
                    }
                    hVar.clear();
                    h[] hVarArr = this.e;
                    int i11 = this.f7595g;
                    this.f7595g = i11 + 1;
                    hVarArr[i11] = hVar;
                } finally {
                }
            }
            return true;
        }
    }

    @Override
    public final j c() {
        synchronized (this.f7592b) {
            try {
                f fVar = this.f7597j;
                if (fVar == null) {
                    if (this.d.isEmpty()) {
                        return null;
                    }
                    return (j) this.d.removeFirst();
                }
                throw fVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean l(long j10) {
        boolean z10;
        synchronized (this.f7592b) {
            long j11 = this.f7601n;
            if (j11 != -9223372036854775807L && j10 < j11) {
                z10 = false;
            }
            z10 = true;
        }
        return z10;
    }

    @Override
    public final void e(h hVar) {
        boolean z10;
        synchronized (this.f7592b) {
            try {
                f fVar = this.f7597j;
                if (fVar == null) {
                    if (hVar == this.f7596i) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    t6.f(z10);
                    this.f7593c.addLast(hVar);
                    if (!this.f7593c.isEmpty() && this.h > 0) {
                        this.f7592b.notify();
                    }
                    this.f7596i = null;
                } else {
                    throw fVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void n(j jVar) {
        synchronized (this.f7592b) {
            jVar.clear();
            j[] jVarArr = this.f7594f;
            int i10 = this.h;
            this.h = i10 + 1;
            jVarArr[i10] = jVar;
            if (!this.f7593c.isEmpty() && this.h > 0) {
                this.f7592b.notify();
            }
        }
    }

    public final void o(int i10) {
        boolean z10;
        int i11 = this.f7595g;
        h[] hVarArr = this.e;
        if (i11 == hVarArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.p(z10);
        for (h hVar : hVarArr) {
            hVar.c(i10);
        }
    }

    @Override
    public void release() {
        synchronized (this.f7592b) {
            this.f7599l = true;
            this.f7592b.notify();
        }
        try {
            this.f7591a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
