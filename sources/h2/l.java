package h2;

import java.util.ArrayDeque;
import v7.u6;
public abstract class l implements e {
    public final k f11641a;
    public final h[] e;
    public final j[] f11644f;
    public int f11645g;
    public int h;
    public h f11646i;
    public f f11647j;
    public boolean f11648k;
    public boolean f11649l;
    public int f11650m;
    public final Object f11642b = new Object();
    public long f11651n = -9223372036854775807L;
    public final ArrayDeque f11643c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    public l(h[] hVarArr, j[] jVarArr) {
        this.e = hVarArr;
        this.f11645g = hVarArr.length;
        for (int i10 = 0; i10 < this.f11645g; i10++) {
            this.e[i10] = f();
        }
        this.f11644f = jVarArr;
        this.h = jVarArr.length;
        for (int i11 = 0; i11 < this.h; i11++) {
            this.f11644f[i11] = g();
        }
        k kVar = new k(this);
        this.f11641a = kVar;
        kVar.start();
    }

    @Override
    public final void a(long j10) {
        boolean z10;
        synchronized (this.f11642b) {
            try {
                if (this.f11645g != this.e.length && !this.f11648k) {
                    z10 = false;
                    u6.p(z10);
                    this.f11651n = j10;
                }
                z10 = true;
                u6.p(z10);
                this.f11651n = j10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final Object d() {
        boolean z10;
        h hVar;
        synchronized (this.f11642b) {
            try {
                f fVar = this.f11647j;
                if (fVar == null) {
                    if (this.f11646i == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    u6.p(z10);
                    int i10 = this.f11645g;
                    if (i10 == 0) {
                        hVar = null;
                    } else {
                        h[] hVarArr = this.e;
                        int i11 = i10 - 1;
                        this.f11645g = i11;
                        hVar = hVarArr[i11];
                    }
                    this.f11646i = hVar;
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
        synchronized (this.f11642b) {
            try {
                this.f11648k = true;
                this.f11650m = 0;
                h hVar = this.f11646i;
                if (hVar != null) {
                    hVar.clear();
                    h[] hVarArr = this.e;
                    int i10 = this.f11645g;
                    this.f11645g = i10 + 1;
                    hVarArr[i10] = hVar;
                    this.f11646i = null;
                }
                while (!this.f11643c.isEmpty()) {
                    h hVar2 = (h) this.f11643c.removeFirst();
                    hVar2.clear();
                    h[] hVarArr2 = this.e;
                    int i11 = this.f11645g;
                    this.f11645g = i11 + 1;
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
        synchronized (this.f11642b) {
            while (!this.f11649l) {
                try {
                    if (!this.f11643c.isEmpty() && this.h > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        break;
                    }
                    this.f11642b.wait();
                } finally {
                }
            }
            if (this.f11649l) {
                return false;
            }
            h hVar = (h) this.f11643c.removeFirst();
            j[] jVarArr = this.f11644f;
            int i10 = this.h - 1;
            this.h = i10;
            j jVar = jVarArr[i10];
            boolean z11 = this.f11648k;
            this.f11648k = false;
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
                    synchronized (this.f11642b) {
                        this.f11647j = h;
                    }
                    return false;
                }
            }
            synchronized (this.f11642b) {
                try {
                    if (this.f11648k) {
                        jVar.release();
                    } else if (jVar.shouldBeSkipped) {
                        this.f11650m++;
                        jVar.release();
                    } else {
                        jVar.skippedOutputBufferCount = this.f11650m;
                        this.f11650m = 0;
                        this.d.addLast(jVar);
                    }
                    hVar.clear();
                    h[] hVarArr = this.e;
                    int i11 = this.f11645g;
                    this.f11645g = i11 + 1;
                    hVarArr[i11] = hVar;
                } finally {
                }
            }
            return true;
        }
    }

    @Override
    public final j c() {
        synchronized (this.f11642b) {
            try {
                f fVar = this.f11647j;
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
        synchronized (this.f11642b) {
            long j11 = this.f11651n;
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
        synchronized (this.f11642b) {
            try {
                f fVar = this.f11647j;
                if (fVar == null) {
                    if (hVar == this.f11646i) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    u6.g(z10);
                    this.f11643c.addLast(hVar);
                    if (!this.f11643c.isEmpty() && this.h > 0) {
                        this.f11642b.notify();
                    }
                    this.f11646i = null;
                } else {
                    throw fVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void n(j jVar) {
        synchronized (this.f11642b) {
            jVar.clear();
            j[] jVarArr = this.f11644f;
            int i10 = this.h;
            this.h = i10 + 1;
            jVarArr[i10] = jVar;
            if (!this.f11643c.isEmpty() && this.h > 0) {
                this.f11642b.notify();
            }
        }
    }

    public final void o(int i10) {
        boolean z10;
        int i11 = this.f11645g;
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
        synchronized (this.f11642b) {
            this.f11649l = true;
            this.f11642b.notify();
        }
        try {
            this.f11641a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
