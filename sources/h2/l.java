package h2;

import java.util.ArrayDeque;
import v7.u6;
public abstract class l implements e {
    public final k f11665a;
    public final h[] e;
    public final j[] f11668f;
    public int f11669g;
    public int h;
    public h f11670i;
    public f f11671j;
    public boolean f11672k;
    public boolean f11673l;
    public int f11674m;
    public final Object f11666b = new Object();
    public long f11675n = -9223372036854775807L;
    public final ArrayDeque f11667c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    public l(h[] hVarArr, j[] jVarArr) {
        this.e = hVarArr;
        this.f11669g = hVarArr.length;
        for (int i10 = 0; i10 < this.f11669g; i10++) {
            this.e[i10] = f();
        }
        this.f11668f = jVarArr;
        this.h = jVarArr.length;
        for (int i11 = 0; i11 < this.h; i11++) {
            this.f11668f[i11] = g();
        }
        k kVar = new k(this);
        this.f11665a = kVar;
        kVar.start();
    }

    @Override
    public final void a(long j10) {
        boolean z10;
        synchronized (this.f11666b) {
            try {
                if (this.f11669g != this.e.length && !this.f11672k) {
                    z10 = false;
                    u6.p(z10);
                    this.f11675n = j10;
                }
                z10 = true;
                u6.p(z10);
                this.f11675n = j10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final Object d() {
        boolean z10;
        h hVar;
        synchronized (this.f11666b) {
            try {
                f fVar = this.f11671j;
                if (fVar == null) {
                    if (this.f11670i == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    u6.p(z10);
                    int i10 = this.f11669g;
                    if (i10 == 0) {
                        hVar = null;
                    } else {
                        h[] hVarArr = this.e;
                        int i11 = i10 - 1;
                        this.f11669g = i11;
                        hVar = hVarArr[i11];
                    }
                    this.f11670i = hVar;
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
        synchronized (this.f11666b) {
            try {
                this.f11672k = true;
                this.f11674m = 0;
                h hVar = this.f11670i;
                if (hVar != null) {
                    hVar.clear();
                    h[] hVarArr = this.e;
                    int i10 = this.f11669g;
                    this.f11669g = i10 + 1;
                    hVarArr[i10] = hVar;
                    this.f11670i = null;
                }
                while (!this.f11667c.isEmpty()) {
                    h hVar2 = (h) this.f11667c.removeFirst();
                    hVar2.clear();
                    h[] hVarArr2 = this.e;
                    int i11 = this.f11669g;
                    this.f11669g = i11 + 1;
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
        synchronized (this.f11666b) {
            while (!this.f11673l) {
                try {
                    if (!this.f11667c.isEmpty() && this.h > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        break;
                    }
                    this.f11666b.wait();
                } finally {
                }
            }
            if (this.f11673l) {
                return false;
            }
            h hVar = (h) this.f11667c.removeFirst();
            j[] jVarArr = this.f11668f;
            int i10 = this.h - 1;
            this.h = i10;
            j jVar = jVarArr[i10];
            boolean z11 = this.f11672k;
            this.f11672k = false;
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
                    synchronized (this.f11666b) {
                        this.f11671j = h;
                    }
                    return false;
                }
            }
            synchronized (this.f11666b) {
                try {
                    if (this.f11672k) {
                        jVar.release();
                    } else if (jVar.shouldBeSkipped) {
                        this.f11674m++;
                        jVar.release();
                    } else {
                        jVar.skippedOutputBufferCount = this.f11674m;
                        this.f11674m = 0;
                        this.d.addLast(jVar);
                    }
                    hVar.clear();
                    h[] hVarArr = this.e;
                    int i11 = this.f11669g;
                    this.f11669g = i11 + 1;
                    hVarArr[i11] = hVar;
                } finally {
                }
            }
            return true;
        }
    }

    @Override
    public final j c() {
        synchronized (this.f11666b) {
            try {
                f fVar = this.f11671j;
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
        synchronized (this.f11666b) {
            long j11 = this.f11675n;
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
        synchronized (this.f11666b) {
            try {
                f fVar = this.f11671j;
                if (fVar == null) {
                    if (hVar == this.f11670i) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    u6.g(z10);
                    this.f11667c.addLast(hVar);
                    if (!this.f11667c.isEmpty() && this.h > 0) {
                        this.f11666b.notify();
                    }
                    this.f11670i = null;
                } else {
                    throw fVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void n(j jVar) {
        synchronized (this.f11666b) {
            jVar.clear();
            j[] jVarArr = this.f11668f;
            int i10 = this.h;
            this.h = i10 + 1;
            jVarArr[i10] = jVar;
            if (!this.f11667c.isEmpty() && this.h > 0) {
                this.f11666b.notify();
            }
        }
    }

    public final void o(int i10) {
        boolean z10;
        int i11 = this.f11669g;
        h[] hVarArr = this.e;
        if (i11 == hVarArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z10);
        for (h hVar : hVarArr) {
            hVar.b(i10);
        }
    }

    @Override
    public void release() {
        synchronized (this.f11666b) {
            this.f11673l = true;
            this.f11666b.notify();
        }
        try {
            this.f11665a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
