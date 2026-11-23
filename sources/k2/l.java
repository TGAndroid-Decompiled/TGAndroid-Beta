package k2;

import a8.ma;
import java.util.ArrayDeque;
public abstract class l implements e {
    public final k f18229a;
    public final h[] f18232e;
    public final j[] f18233f;
    public int f18234g;
    public int h;
    public h f18235i;
    public f f18236j;
    public boolean f18237k;
    public boolean f18238l;
    public int f18239m;
    public final Object f18230b = new Object();
    public long f18240n = -9223372036854775807L;
    public final ArrayDeque f18231c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    public l(h[] hVarArr, j[] jVarArr) {
        this.f18232e = hVarArr;
        this.f18234g = hVarArr.length;
        for (int i7 = 0; i7 < this.f18234g; i7++) {
            this.f18232e[i7] = f();
        }
        this.f18233f = jVarArr;
        this.h = jVarArr.length;
        for (int i10 = 0; i10 < this.h; i10++) {
            this.f18233f[i10] = g();
        }
        k kVar = new k(this);
        this.f18229a = kVar;
        kVar.start();
    }

    @Override
    public final void a(long j3) {
        boolean z10;
        synchronized (this.f18230b) {
            try {
                if (this.f18234g != this.f18232e.length && !this.f18237k) {
                    z10 = false;
                    ma.p(z10);
                    this.f18240n = j3;
                }
                z10 = true;
                ma.p(z10);
                this.f18240n = j3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final Object d() {
        boolean z10;
        h hVar;
        synchronized (this.f18230b) {
            try {
                f fVar = this.f18236j;
                if (fVar == null) {
                    if (this.f18235i == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ma.p(z10);
                    int i7 = this.f18234g;
                    if (i7 == 0) {
                        hVar = null;
                    } else {
                        h[] hVarArr = this.f18232e;
                        int i10 = i7 - 1;
                        this.f18234g = i10;
                        hVar = hVarArr[i10];
                    }
                    this.f18235i = hVar;
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
        synchronized (this.f18230b) {
            try {
                this.f18237k = true;
                this.f18239m = 0;
                h hVar = this.f18235i;
                if (hVar != null) {
                    hVar.clear();
                    h[] hVarArr = this.f18232e;
                    int i7 = this.f18234g;
                    this.f18234g = i7 + 1;
                    hVarArr[i7] = hVar;
                    this.f18235i = null;
                }
                while (!this.f18231c.isEmpty()) {
                    h hVar2 = (h) this.f18231c.removeFirst();
                    hVar2.clear();
                    h[] hVarArr2 = this.f18232e;
                    int i10 = this.f18234g;
                    this.f18234g = i10 + 1;
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
        synchronized (this.f18230b) {
            while (!this.f18238l) {
                try {
                    if (!this.f18231c.isEmpty() && this.h > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        break;
                    }
                    this.f18230b.wait();
                } finally {
                }
            }
            if (this.f18238l) {
                return false;
            }
            h hVar = (h) this.f18231c.removeFirst();
            j[] jVarArr = this.f18233f;
            int i7 = this.h - 1;
            this.h = i7;
            j jVar = jVarArr[i7];
            boolean z11 = this.f18237k;
            this.f18237k = false;
            if (hVar.isEndOfStream()) {
                jVar.addFlag(4);
            } else {
                jVar.timeUs = hVar.f18224e;
                if (hVar.isFirstSample()) {
                    jVar.addFlag(134217728);
                }
                if (!l(hVar.f18224e)) {
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
                    synchronized (this.f18230b) {
                        this.f18236j = h;
                    }
                    return false;
                }
            }
            synchronized (this.f18230b) {
                try {
                    if (this.f18237k) {
                        jVar.release();
                    } else if (jVar.shouldBeSkipped) {
                        this.f18239m++;
                        jVar.release();
                    } else {
                        jVar.skippedOutputBufferCount = this.f18239m;
                        this.f18239m = 0;
                        this.d.addLast(jVar);
                    }
                    hVar.clear();
                    h[] hVarArr = this.f18232e;
                    int i10 = this.f18234g;
                    this.f18234g = i10 + 1;
                    hVarArr[i10] = hVar;
                } finally {
                }
            }
            return true;
        }
    }

    @Override
    public final j c() {
        synchronized (this.f18230b) {
            try {
                f fVar = this.f18236j;
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
        synchronized (this.f18230b) {
            long j10 = this.f18240n;
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
        synchronized (this.f18230b) {
            try {
                f fVar = this.f18236j;
                if (fVar == null) {
                    if (hVar == this.f18235i) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ma.f(z10);
                    this.f18231c.addLast(hVar);
                    if (!this.f18231c.isEmpty() && this.h > 0) {
                        this.f18230b.notify();
                    }
                    this.f18235i = null;
                } else {
                    throw fVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void n(j jVar) {
        synchronized (this.f18230b) {
            jVar.clear();
            j[] jVarArr = this.f18233f;
            int i7 = this.h;
            this.h = i7 + 1;
            jVarArr[i7] = jVar;
            if (!this.f18231c.isEmpty() && this.h > 0) {
                this.f18230b.notify();
            }
        }
    }

    public final void o(int i7) {
        boolean z10;
        int i10 = this.f18234g;
        h[] hVarArr = this.f18232e;
        if (i10 == hVarArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        ma.p(z10);
        for (h hVar : hVarArr) {
            hVar.b(i7);
        }
    }

    @Override
    public void release() {
        synchronized (this.f18230b) {
            this.f18238l = true;
            this.f18230b.notify();
        }
        try {
            this.f18229a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
