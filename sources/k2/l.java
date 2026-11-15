package k2;

import a8.ja;
import java.util.ArrayDeque;
public abstract class l implements e {
    public final k f17738a;
    public final h[] f17741e;
    public final j[] f17742f;
    public int f17743g;
    public int h;
    public h f17744i;
    public f f17745j;
    public boolean f17746k;
    public boolean f17747l;
    public int f17748m;
    public final Object f17739b = new Object();
    public long f17749n = -9223372036854775807L;
    public final ArrayDeque f17740c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    public l(h[] hVarArr, j[] jVarArr) {
        this.f17741e = hVarArr;
        this.f17743g = hVarArr.length;
        for (int i7 = 0; i7 < this.f17743g; i7++) {
            this.f17741e[i7] = f();
        }
        this.f17742f = jVarArr;
        this.h = jVarArr.length;
        for (int i10 = 0; i10 < this.h; i10++) {
            this.f17742f[i10] = g();
        }
        k kVar = new k(this);
        this.f17738a = kVar;
        kVar.start();
    }

    @Override
    public final void a(long j3) {
        boolean z10;
        synchronized (this.f17739b) {
            try {
                if (this.f17743g != this.f17741e.length && !this.f17746k) {
                    z10 = false;
                    ja.p(z10);
                    this.f17749n = j3;
                }
                z10 = true;
                ja.p(z10);
                this.f17749n = j3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final Object d() {
        boolean z10;
        h hVar;
        synchronized (this.f17739b) {
            try {
                f fVar = this.f17745j;
                if (fVar == null) {
                    if (this.f17744i == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ja.p(z10);
                    int i7 = this.f17743g;
                    if (i7 == 0) {
                        hVar = null;
                    } else {
                        h[] hVarArr = this.f17741e;
                        int i10 = i7 - 1;
                        this.f17743g = i10;
                        hVar = hVarArr[i10];
                    }
                    this.f17744i = hVar;
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
        synchronized (this.f17739b) {
            try {
                this.f17746k = true;
                this.f17748m = 0;
                h hVar = this.f17744i;
                if (hVar != null) {
                    hVar.clear();
                    h[] hVarArr = this.f17741e;
                    int i7 = this.f17743g;
                    this.f17743g = i7 + 1;
                    hVarArr[i7] = hVar;
                    this.f17744i = null;
                }
                while (!this.f17740c.isEmpty()) {
                    h hVar2 = (h) this.f17740c.removeFirst();
                    hVar2.clear();
                    h[] hVarArr2 = this.f17741e;
                    int i10 = this.f17743g;
                    this.f17743g = i10 + 1;
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
        synchronized (this.f17739b) {
            while (!this.f17747l) {
                try {
                    if (!this.f17740c.isEmpty() && this.h > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        break;
                    }
                    this.f17739b.wait();
                } finally {
                }
            }
            if (this.f17747l) {
                return false;
            }
            h hVar = (h) this.f17740c.removeFirst();
            j[] jVarArr = this.f17742f;
            int i7 = this.h - 1;
            this.h = i7;
            j jVar = jVarArr[i7];
            boolean z11 = this.f17746k;
            this.f17746k = false;
            if (hVar.isEndOfStream()) {
                jVar.addFlag(4);
            } else {
                jVar.timeUs = hVar.f17733e;
                if (hVar.isFirstSample()) {
                    jVar.addFlag(134217728);
                }
                if (!l(hVar.f17733e)) {
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
                    synchronized (this.f17739b) {
                        this.f17745j = h;
                    }
                    return false;
                }
            }
            synchronized (this.f17739b) {
                try {
                    if (this.f17746k) {
                        jVar.release();
                    } else if (jVar.shouldBeSkipped) {
                        this.f17748m++;
                        jVar.release();
                    } else {
                        jVar.skippedOutputBufferCount = this.f17748m;
                        this.f17748m = 0;
                        this.d.addLast(jVar);
                    }
                    hVar.clear();
                    h[] hVarArr = this.f17741e;
                    int i10 = this.f17743g;
                    this.f17743g = i10 + 1;
                    hVarArr[i10] = hVar;
                } finally {
                }
            }
            return true;
        }
    }

    @Override
    public final j c() {
        synchronized (this.f17739b) {
            try {
                f fVar = this.f17745j;
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
        synchronized (this.f17739b) {
            long j10 = this.f17749n;
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
        synchronized (this.f17739b) {
            try {
                f fVar = this.f17745j;
                if (fVar == null) {
                    if (hVar == this.f17744i) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ja.f(z10);
                    this.f17740c.addLast(hVar);
                    if (!this.f17740c.isEmpty() && this.h > 0) {
                        this.f17739b.notify();
                    }
                    this.f17744i = null;
                } else {
                    throw fVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void n(j jVar) {
        synchronized (this.f17739b) {
            jVar.clear();
            j[] jVarArr = this.f17742f;
            int i7 = this.h;
            this.h = i7 + 1;
            jVarArr[i7] = jVar;
            if (!this.f17740c.isEmpty() && this.h > 0) {
                this.f17739b.notify();
            }
        }
    }

    public final void o(int i7) {
        boolean z10;
        int i10 = this.f17743g;
        h[] hVarArr = this.f17741e;
        if (i10 == hVarArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        ja.p(z10);
        for (h hVar : hVarArr) {
            hVar.b(i7);
        }
    }

    @Override
    public void release() {
        synchronized (this.f17739b) {
            this.f17747l = true;
            this.f17739b.notify();
        }
        try {
            this.f17738a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
