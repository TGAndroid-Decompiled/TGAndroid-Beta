package k2;

import a8.la;
import java.util.ArrayDeque;
public abstract class l implements e {
    public final k f18164a;
    public final h[] f18167e;
    public final j[] f18168f;
    public int f18169g;
    public int h;
    public h f18170i;
    public f f18171j;
    public boolean f18172k;
    public boolean f18173l;
    public int f18174m;
    public final Object f18165b = new Object();
    public long f18175n = -9223372036854775807L;
    public final ArrayDeque f18166c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    public l(h[] hVarArr, j[] jVarArr) {
        this.f18167e = hVarArr;
        this.f18169g = hVarArr.length;
        for (int i7 = 0; i7 < this.f18169g; i7++) {
            this.f18167e[i7] = f();
        }
        this.f18168f = jVarArr;
        this.h = jVarArr.length;
        for (int i10 = 0; i10 < this.h; i10++) {
            this.f18168f[i10] = g();
        }
        k kVar = new k(this);
        this.f18164a = kVar;
        kVar.start();
    }

    @Override
    public final void a(long j3) {
        boolean z10;
        synchronized (this.f18165b) {
            try {
                if (this.f18169g != this.f18167e.length && !this.f18172k) {
                    z10 = false;
                    la.p(z10);
                    this.f18175n = j3;
                }
                z10 = true;
                la.p(z10);
                this.f18175n = j3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final Object d() {
        boolean z10;
        h hVar;
        synchronized (this.f18165b) {
            try {
                f fVar = this.f18171j;
                if (fVar == null) {
                    if (this.f18170i == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    la.p(z10);
                    int i7 = this.f18169g;
                    if (i7 == 0) {
                        hVar = null;
                    } else {
                        h[] hVarArr = this.f18167e;
                        int i10 = i7 - 1;
                        this.f18169g = i10;
                        hVar = hVarArr[i10];
                    }
                    this.f18170i = hVar;
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
        synchronized (this.f18165b) {
            try {
                this.f18172k = true;
                this.f18174m = 0;
                h hVar = this.f18170i;
                if (hVar != null) {
                    hVar.clear();
                    h[] hVarArr = this.f18167e;
                    int i7 = this.f18169g;
                    this.f18169g = i7 + 1;
                    hVarArr[i7] = hVar;
                    this.f18170i = null;
                }
                while (!this.f18166c.isEmpty()) {
                    h hVar2 = (h) this.f18166c.removeFirst();
                    hVar2.clear();
                    h[] hVarArr2 = this.f18167e;
                    int i10 = this.f18169g;
                    this.f18169g = i10 + 1;
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
        synchronized (this.f18165b) {
            while (!this.f18173l) {
                try {
                    if (!this.f18166c.isEmpty() && this.h > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        break;
                    }
                    this.f18165b.wait();
                } finally {
                }
            }
            if (this.f18173l) {
                return false;
            }
            h hVar = (h) this.f18166c.removeFirst();
            j[] jVarArr = this.f18168f;
            int i7 = this.h - 1;
            this.h = i7;
            j jVar = jVarArr[i7];
            boolean z11 = this.f18172k;
            this.f18172k = false;
            if (hVar.isEndOfStream()) {
                jVar.addFlag(4);
            } else {
                jVar.timeUs = hVar.f18159e;
                if (hVar.isFirstSample()) {
                    jVar.addFlag(134217728);
                }
                if (!l(hVar.f18159e)) {
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
                    synchronized (this.f18165b) {
                        this.f18171j = h;
                    }
                    return false;
                }
            }
            synchronized (this.f18165b) {
                try {
                    if (this.f18172k) {
                        jVar.release();
                    } else if (jVar.shouldBeSkipped) {
                        this.f18174m++;
                        jVar.release();
                    } else {
                        jVar.skippedOutputBufferCount = this.f18174m;
                        this.f18174m = 0;
                        this.d.addLast(jVar);
                    }
                    hVar.clear();
                    h[] hVarArr = this.f18167e;
                    int i10 = this.f18169g;
                    this.f18169g = i10 + 1;
                    hVarArr[i10] = hVar;
                } finally {
                }
            }
            return true;
        }
    }

    @Override
    public final j c() {
        synchronized (this.f18165b) {
            try {
                f fVar = this.f18171j;
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
        synchronized (this.f18165b) {
            long j10 = this.f18175n;
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
        synchronized (this.f18165b) {
            try {
                f fVar = this.f18171j;
                if (fVar == null) {
                    if (hVar == this.f18170i) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    la.f(z10);
                    this.f18166c.addLast(hVar);
                    if (!this.f18166c.isEmpty() && this.h > 0) {
                        this.f18165b.notify();
                    }
                    this.f18170i = null;
                } else {
                    throw fVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void n(j jVar) {
        synchronized (this.f18165b) {
            jVar.clear();
            j[] jVarArr = this.f18168f;
            int i7 = this.h;
            this.h = i7 + 1;
            jVarArr[i7] = jVar;
            if (!this.f18166c.isEmpty() && this.h > 0) {
                this.f18165b.notify();
            }
        }
    }

    public final void o(int i7) {
        boolean z10;
        int i10 = this.f18169g;
        h[] hVarArr = this.f18167e;
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
        synchronized (this.f18165b) {
            this.f18173l = true;
            this.f18165b.notify();
        }
        try {
            this.f18164a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
