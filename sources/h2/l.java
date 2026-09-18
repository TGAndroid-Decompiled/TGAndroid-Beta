package h2;

import java.util.ArrayDeque;
public abstract class l implements e {
    public final k f10101a;
    public final h[] e;
    public final j[] f10104f;
    public int f10105g;
    public int h;
    public h f10106i;
    public f f10107j;
    public boolean f10108k;
    public boolean f10109l;
    public int f10110m;
    public final Object f10102b = new Object();
    public long f10111n = -9223372036854775807L;
    public final ArrayDeque f10103c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    public l(h[] hVarArr, j[] jVarArr) {
        this.e = hVarArr;
        this.f10105g = hVarArr.length;
        for (int i10 = 0; i10 < this.f10105g; i10++) {
            this.e[i10] = f();
        }
        this.f10104f = jVarArr;
        this.h = jVarArr.length;
        for (int i11 = 0; i11 < this.h; i11++) {
            this.f10104f[i11] = g();
        }
        k kVar = new k(this);
        this.f10101a = kVar;
        kVar.start();
    }

    @Override
    public final void a(long j3) {
        boolean z10;
        synchronized (this.f10102b) {
            try {
                if (this.f10105g != this.e.length && !this.f10108k) {
                    z10 = false;
                    e2.d.g(z10);
                    this.f10111n = j3;
                }
                z10 = true;
                e2.d.g(z10);
                this.f10111n = j3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final Object d() {
        boolean z10;
        h hVar;
        synchronized (this.f10102b) {
            try {
                f fVar = this.f10107j;
                if (fVar == null) {
                    if (this.f10106i == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    e2.d.g(z10);
                    int i10 = this.f10105g;
                    if (i10 == 0) {
                        hVar = null;
                    } else {
                        h[] hVarArr = this.e;
                        int i11 = i10 - 1;
                        this.f10105g = i11;
                        hVar = hVarArr[i11];
                    }
                    this.f10106i = hVar;
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
        synchronized (this.f10102b) {
            try {
                this.f10108k = true;
                this.f10110m = 0;
                h hVar = this.f10106i;
                if (hVar != null) {
                    hVar.clear();
                    h[] hVarArr = this.e;
                    int i10 = this.f10105g;
                    this.f10105g = i10 + 1;
                    hVarArr[i10] = hVar;
                    this.f10106i = null;
                }
                while (!this.f10103c.isEmpty()) {
                    h hVar2 = (h) this.f10103c.removeFirst();
                    hVar2.clear();
                    h[] hVarArr2 = this.e;
                    int i11 = this.f10105g;
                    this.f10105g = i11 + 1;
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
        synchronized (this.f10102b) {
            while (!this.f10109l) {
                try {
                    if (!this.f10103c.isEmpty() && this.h > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        break;
                    }
                    this.f10102b.wait();
                } finally {
                }
            }
            if (this.f10109l) {
                return false;
            }
            h hVar = (h) this.f10103c.removeFirst();
            j[] jVarArr = this.f10104f;
            int i10 = this.h - 1;
            this.h = i10;
            j jVar = jVarArr[i10];
            boolean z11 = this.f10108k;
            this.f10108k = false;
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
                    synchronized (this.f10102b) {
                        this.f10107j = h;
                    }
                    return false;
                }
            }
            synchronized (this.f10102b) {
                try {
                    if (this.f10108k) {
                        jVar.release();
                    } else if (jVar.shouldBeSkipped) {
                        this.f10110m++;
                        jVar.release();
                    } else {
                        jVar.skippedOutputBufferCount = this.f10110m;
                        this.f10110m = 0;
                        this.d.addLast(jVar);
                    }
                    hVar.clear();
                    h[] hVarArr = this.e;
                    int i11 = this.f10105g;
                    this.f10105g = i11 + 1;
                    hVarArr[i11] = hVar;
                } finally {
                }
            }
            return true;
        }
    }

    @Override
    public final j c() {
        synchronized (this.f10102b) {
            try {
                f fVar = this.f10107j;
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
        synchronized (this.f10102b) {
            long j10 = this.f10111n;
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
        synchronized (this.f10102b) {
            try {
                f fVar = this.f10107j;
                if (fVar == null) {
                    if (hVar == this.f10106i) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    e2.d.b(z10);
                    this.f10103c.addLast(hVar);
                    if (!this.f10103c.isEmpty() && this.h > 0) {
                        this.f10102b.notify();
                    }
                    this.f10106i = null;
                } else {
                    throw fVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void n(j jVar) {
        synchronized (this.f10102b) {
            jVar.clear();
            j[] jVarArr = this.f10104f;
            int i10 = this.h;
            this.h = i10 + 1;
            jVarArr[i10] = jVar;
            if (!this.f10103c.isEmpty() && this.h > 0) {
                this.f10102b.notify();
            }
        }
    }

    public final void o(int i10) {
        boolean z10;
        int i11 = this.f10105g;
        h[] hVarArr = this.e;
        if (i11 == hVarArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        for (h hVar : hVarArr) {
            hVar.b(i10);
        }
    }

    @Override
    public void release() {
        synchronized (this.f10102b) {
            this.f10109l = true;
            this.f10102b.notify();
        }
        try {
            this.f10101a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
