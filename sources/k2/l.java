package k2;

import a8.la;
import java.util.ArrayDeque;
public abstract class l implements e {
    public final k f18133a;
    public final h[] f18136e;
    public final j[] f18137f;
    public int f18138g;
    public int h;
    public h f18139i;
    public f f18140j;
    public boolean f18141k;
    public boolean f18142l;
    public int f18143m;
    public final Object f18134b = new Object();
    public long f18144n = -9223372036854775807L;
    public final ArrayDeque f18135c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    public l(h[] hVarArr, j[] jVarArr) {
        this.f18136e = hVarArr;
        this.f18138g = hVarArr.length;
        for (int i7 = 0; i7 < this.f18138g; i7++) {
            this.f18136e[i7] = f();
        }
        this.f18137f = jVarArr;
        this.h = jVarArr.length;
        for (int i10 = 0; i10 < this.h; i10++) {
            this.f18137f[i10] = g();
        }
        k kVar = new k(this);
        this.f18133a = kVar;
        kVar.start();
    }

    @Override
    public final void a(long j3) {
        boolean z10;
        synchronized (this.f18134b) {
            try {
                if (this.f18138g != this.f18136e.length && !this.f18141k) {
                    z10 = false;
                    la.p(z10);
                    this.f18144n = j3;
                }
                z10 = true;
                la.p(z10);
                this.f18144n = j3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final Object d() {
        boolean z10;
        h hVar;
        synchronized (this.f18134b) {
            try {
                f fVar = this.f18140j;
                if (fVar == null) {
                    if (this.f18139i == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    la.p(z10);
                    int i7 = this.f18138g;
                    if (i7 == 0) {
                        hVar = null;
                    } else {
                        h[] hVarArr = this.f18136e;
                        int i10 = i7 - 1;
                        this.f18138g = i10;
                        hVar = hVarArr[i10];
                    }
                    this.f18139i = hVar;
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
        synchronized (this.f18134b) {
            try {
                this.f18141k = true;
                this.f18143m = 0;
                h hVar = this.f18139i;
                if (hVar != null) {
                    hVar.clear();
                    h[] hVarArr = this.f18136e;
                    int i7 = this.f18138g;
                    this.f18138g = i7 + 1;
                    hVarArr[i7] = hVar;
                    this.f18139i = null;
                }
                while (!this.f18135c.isEmpty()) {
                    h hVar2 = (h) this.f18135c.removeFirst();
                    hVar2.clear();
                    h[] hVarArr2 = this.f18136e;
                    int i10 = this.f18138g;
                    this.f18138g = i10 + 1;
                    hVarArr2[i10] = hVar2;
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
        synchronized (this.f18134b) {
            while (!this.f18142l) {
                try {
                    if (!this.f18135c.isEmpty() && this.h > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        break;
                    }
                    this.f18134b.wait();
                } finally {
                }
            }
            if (this.f18142l) {
                return false;
            }
            h hVar = (h) this.f18135c.removeFirst();
            j[] jVarArr = this.f18137f;
            int i7 = this.h - 1;
            this.h = i7;
            j jVar = jVarArr[i7];
            boolean z11 = this.f18141k;
            this.f18141k = false;
            if (hVar.isEndOfStream()) {
                jVar.addFlag(4);
            } else {
                jVar.timeUs = hVar.f18128e;
                if (hVar.isFirstSample()) {
                    jVar.addFlag(134217728);
                }
                if (!l(hVar.f18128e)) {
                    jVar.shouldBeSkipped = true;
                }
                try {
                    h = i(hVar, jVar, z11);
                } catch (OutOfMemoryError e10) {
                    h = h(e10);
                } catch (RuntimeException e11) {
                    h = h(e11);
                }
                if (h != null) {
                    synchronized (this.f18134b) {
                        this.f18140j = h;
                    }
                    return false;
                }
            }
            synchronized (this.f18134b) {
                try {
                    if (this.f18141k) {
                        jVar.release();
                    } else if (jVar.shouldBeSkipped) {
                        this.f18143m++;
                        jVar.release();
                    } else {
                        jVar.skippedOutputBufferCount = this.f18143m;
                        this.f18143m = 0;
                        this.d.addLast(jVar);
                    }
                    hVar.clear();
                    h[] hVarArr = this.f18136e;
                    int i10 = this.f18138g;
                    this.f18138g = i10 + 1;
                    hVarArr[i10] = hVar;
                } finally {
                }
            }
            return true;
        }
    }

    @Override
    public final j c() {
        synchronized (this.f18134b) {
            try {
                f fVar = this.f18140j;
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

    public final boolean l(long j3) {
        boolean z10;
        synchronized (this.f18134b) {
            long j10 = this.f18144n;
            if (j10 != -9223372036854775807L && j3 < j10) {
                z10 = false;
            }
            z10 = true;
        }
        return z10;
    }

    @Override
    public final void e(h hVar) {
        boolean z10;
        synchronized (this.f18134b) {
            try {
                f fVar = this.f18140j;
                if (fVar == null) {
                    if (hVar == this.f18139i) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    la.f(z10);
                    this.f18135c.addLast(hVar);
                    if (!this.f18135c.isEmpty() && this.h > 0) {
                        this.f18134b.notify();
                    }
                    this.f18139i = null;
                } else {
                    throw fVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void n(j jVar) {
        synchronized (this.f18134b) {
            jVar.clear();
            j[] jVarArr = this.f18137f;
            int i7 = this.h;
            this.h = i7 + 1;
            jVarArr[i7] = jVar;
            if (!this.f18135c.isEmpty() && this.h > 0) {
                this.f18134b.notify();
            }
        }
    }

    public final void o(int i7) {
        boolean z10;
        int i10 = this.f18138g;
        h[] hVarArr = this.f18136e;
        if (i10 == hVarArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        la.p(z10);
        for (h hVar : hVarArr) {
            hVar.b(i7);
        }
    }

    @Override
    public void release() {
        synchronized (this.f18134b) {
            this.f18142l = true;
            this.f18134b.notify();
        }
        try {
            this.f18133a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
