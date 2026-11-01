package h2;

import java.util.ArrayDeque;
import v7.t6;
public abstract class l implements e {
    public final k f7592a;
    public final h[] e;
    public final j[] f7595f;
    public int f7596g;
    public int h;
    public h f7597i;
    public f f7598j;
    public boolean f7599k;
    public boolean f7600l;
    public int f7601m;
    public final Object f7593b = new Object();
    public long f7602n = -9223372036854775807L;
    public final ArrayDeque f7594c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    public l(h[] hVarArr, j[] jVarArr) {
        this.e = hVarArr;
        this.f7596g = hVarArr.length;
        for (int i10 = 0; i10 < this.f7596g; i10++) {
            this.e[i10] = f();
        }
        this.f7595f = jVarArr;
        this.h = jVarArr.length;
        for (int i11 = 0; i11 < this.h; i11++) {
            this.f7595f[i11] = g();
        }
        k kVar = new k(this);
        this.f7592a = kVar;
        kVar.start();
    }

    @Override
    public final void a(long j10) {
        boolean z10;
        synchronized (this.f7593b) {
            try {
                if (this.f7596g != this.e.length && !this.f7599k) {
                    z10 = false;
                    t6.p(z10);
                    this.f7602n = j10;
                }
                z10 = true;
                t6.p(z10);
                this.f7602n = j10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final Object d() {
        boolean z10;
        h hVar;
        synchronized (this.f7593b) {
            try {
                f fVar = this.f7598j;
                if (fVar == null) {
                    if (this.f7597i == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    t6.p(z10);
                    int i10 = this.f7596g;
                    if (i10 == 0) {
                        hVar = null;
                    } else {
                        h[] hVarArr = this.e;
                        int i11 = i10 - 1;
                        this.f7596g = i11;
                        hVar = hVarArr[i11];
                    }
                    this.f7597i = hVar;
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
        synchronized (this.f7593b) {
            try {
                this.f7599k = true;
                this.f7601m = 0;
                h hVar = this.f7597i;
                if (hVar != null) {
                    hVar.clear();
                    h[] hVarArr = this.e;
                    int i10 = this.f7596g;
                    this.f7596g = i10 + 1;
                    hVarArr[i10] = hVar;
                    this.f7597i = null;
                }
                while (!this.f7594c.isEmpty()) {
                    h hVar2 = (h) this.f7594c.removeFirst();
                    hVar2.clear();
                    h[] hVarArr2 = this.e;
                    int i11 = this.f7596g;
                    this.f7596g = i11 + 1;
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
        synchronized (this.f7593b) {
            while (!this.f7600l) {
                try {
                    if (!this.f7594c.isEmpty() && this.h > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        break;
                    }
                    this.f7593b.wait();
                } finally {
                }
            }
            if (this.f7600l) {
                return false;
            }
            h hVar = (h) this.f7594c.removeFirst();
            j[] jVarArr = this.f7595f;
            int i10 = this.h - 1;
            this.h = i10;
            j jVar = jVarArr[i10];
            boolean z11 = this.f7599k;
            this.f7599k = false;
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
                    synchronized (this.f7593b) {
                        this.f7598j = h;
                    }
                    return false;
                }
            }
            synchronized (this.f7593b) {
                try {
                    if (this.f7599k) {
                        jVar.release();
                    } else if (jVar.shouldBeSkipped) {
                        this.f7601m++;
                        jVar.release();
                    } else {
                        jVar.skippedOutputBufferCount = this.f7601m;
                        this.f7601m = 0;
                        this.d.addLast(jVar);
                    }
                    hVar.clear();
                    h[] hVarArr = this.e;
                    int i11 = this.f7596g;
                    this.f7596g = i11 + 1;
                    hVarArr[i11] = hVar;
                } finally {
                }
            }
            return true;
        }
    }

    @Override
    public final j c() {
        synchronized (this.f7593b) {
            try {
                f fVar = this.f7598j;
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
        synchronized (this.f7593b) {
            long j11 = this.f7602n;
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
        synchronized (this.f7593b) {
            try {
                f fVar = this.f7598j;
                if (fVar == null) {
                    if (hVar == this.f7597i) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    t6.f(z10);
                    this.f7594c.addLast(hVar);
                    if (!this.f7594c.isEmpty() && this.h > 0) {
                        this.f7593b.notify();
                    }
                    this.f7597i = null;
                } else {
                    throw fVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void n(j jVar) {
        synchronized (this.f7593b) {
            jVar.clear();
            j[] jVarArr = this.f7595f;
            int i10 = this.h;
            this.h = i10 + 1;
            jVarArr[i10] = jVar;
            if (!this.f7594c.isEmpty() && this.h > 0) {
                this.f7593b.notify();
            }
        }
    }

    public final void o(int i10) {
        boolean z10;
        int i11 = this.f7596g;
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
        synchronized (this.f7593b) {
            this.f7600l = true;
            this.f7593b.notify();
        }
        try {
            this.f7592a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
