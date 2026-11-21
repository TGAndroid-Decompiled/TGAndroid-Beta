package k2;

import a8.la;
import java.util.ArrayDeque;
public abstract class l implements e {
    public final k f18161a;
    public final h[] f18164e;
    public final j[] f18165f;
    public int f18166g;
    public int h;
    public h f18167i;
    public f f18168j;
    public boolean f18169k;
    public boolean f18170l;
    public int f18171m;
    public final Object f18162b = new Object();
    public long f18172n = -9223372036854775807L;
    public final ArrayDeque f18163c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    public l(h[] hVarArr, j[] jVarArr) {
        this.f18164e = hVarArr;
        this.f18166g = hVarArr.length;
        for (int i7 = 0; i7 < this.f18166g; i7++) {
            this.f18164e[i7] = f();
        }
        this.f18165f = jVarArr;
        this.h = jVarArr.length;
        for (int i10 = 0; i10 < this.h; i10++) {
            this.f18165f[i10] = g();
        }
        k kVar = new k(this);
        this.f18161a = kVar;
        kVar.start();
    }

    @Override
    public final void a(long j3) {
        boolean z10;
        synchronized (this.f18162b) {
            try {
                if (this.f18166g != this.f18164e.length && !this.f18169k) {
                    z10 = false;
                    la.p(z10);
                    this.f18172n = j3;
                }
                z10 = true;
                la.p(z10);
                this.f18172n = j3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final Object d() {
        boolean z10;
        h hVar;
        synchronized (this.f18162b) {
            try {
                f fVar = this.f18168j;
                if (fVar == null) {
                    if (this.f18167i == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    la.p(z10);
                    int i7 = this.f18166g;
                    if (i7 == 0) {
                        hVar = null;
                    } else {
                        h[] hVarArr = this.f18164e;
                        int i10 = i7 - 1;
                        this.f18166g = i10;
                        hVar = hVarArr[i10];
                    }
                    this.f18167i = hVar;
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
        synchronized (this.f18162b) {
            try {
                this.f18169k = true;
                this.f18171m = 0;
                h hVar = this.f18167i;
                if (hVar != null) {
                    hVar.clear();
                    h[] hVarArr = this.f18164e;
                    int i7 = this.f18166g;
                    this.f18166g = i7 + 1;
                    hVarArr[i7] = hVar;
                    this.f18167i = null;
                }
                while (!this.f18163c.isEmpty()) {
                    h hVar2 = (h) this.f18163c.removeFirst();
                    hVar2.clear();
                    h[] hVarArr2 = this.f18164e;
                    int i10 = this.f18166g;
                    this.f18166g = i10 + 1;
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
        synchronized (this.f18162b) {
            while (!this.f18170l) {
                try {
                    if (!this.f18163c.isEmpty() && this.h > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        break;
                    }
                    this.f18162b.wait();
                } finally {
                }
            }
            if (this.f18170l) {
                return false;
            }
            h hVar = (h) this.f18163c.removeFirst();
            j[] jVarArr = this.f18165f;
            int i7 = this.h - 1;
            this.h = i7;
            j jVar = jVarArr[i7];
            boolean z11 = this.f18169k;
            this.f18169k = false;
            if (hVar.isEndOfStream()) {
                jVar.addFlag(4);
            } else {
                jVar.timeUs = hVar.f18156e;
                if (hVar.isFirstSample()) {
                    jVar.addFlag(134217728);
                }
                if (!l(hVar.f18156e)) {
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
                    synchronized (this.f18162b) {
                        this.f18168j = h;
                    }
                    return false;
                }
            }
            synchronized (this.f18162b) {
                try {
                    if (this.f18169k) {
                        jVar.release();
                    } else if (jVar.shouldBeSkipped) {
                        this.f18171m++;
                        jVar.release();
                    } else {
                        jVar.skippedOutputBufferCount = this.f18171m;
                        this.f18171m = 0;
                        this.d.addLast(jVar);
                    }
                    hVar.clear();
                    h[] hVarArr = this.f18164e;
                    int i10 = this.f18166g;
                    this.f18166g = i10 + 1;
                    hVarArr[i10] = hVar;
                } finally {
                }
            }
            return true;
        }
    }

    @Override
    public final j c() {
        synchronized (this.f18162b) {
            try {
                f fVar = this.f18168j;
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
        synchronized (this.f18162b) {
            long j10 = this.f18172n;
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
        synchronized (this.f18162b) {
            try {
                f fVar = this.f18168j;
                if (fVar == null) {
                    if (hVar == this.f18167i) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    la.f(z10);
                    this.f18163c.addLast(hVar);
                    if (!this.f18163c.isEmpty() && this.h > 0) {
                        this.f18162b.notify();
                    }
                    this.f18167i = null;
                } else {
                    throw fVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void n(j jVar) {
        synchronized (this.f18162b) {
            jVar.clear();
            j[] jVarArr = this.f18165f;
            int i7 = this.h;
            this.h = i7 + 1;
            jVarArr[i7] = jVar;
            if (!this.f18163c.isEmpty() && this.h > 0) {
                this.f18162b.notify();
            }
        }
    }

    public final void o(int i7) {
        boolean z10;
        int i10 = this.f18166g;
        h[] hVarArr = this.f18164e;
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
        synchronized (this.f18162b) {
            this.f18170l = true;
            this.f18162b.notify();
        }
        try {
            this.f18161a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
