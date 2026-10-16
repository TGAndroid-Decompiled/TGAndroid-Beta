package h2;

import java.util.ArrayDeque;
import v7.u6;
public abstract class l implements e {
    public final k f10334a;
    public final h[] e;
    public final j[] f10337f;
    public int f10338g;
    public int h;
    public h f10339i;
    public f f10340j;
    public boolean f10341k;
    public boolean f10342l;
    public int f10343m;
    public final Object f10335b = new Object();
    public long f10344n = -9223372036854775807L;
    public final ArrayDeque f10336c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    public l(h[] hVarArr, j[] jVarArr) {
        this.e = hVarArr;
        this.f10338g = hVarArr.length;
        for (int i10 = 0; i10 < this.f10338g; i10++) {
            this.e[i10] = f();
        }
        this.f10337f = jVarArr;
        this.h = jVarArr.length;
        for (int i11 = 0; i11 < this.h; i11++) {
            this.f10337f[i11] = g();
        }
        k kVar = new k(this);
        this.f10334a = kVar;
        kVar.start();
    }

    @Override
    public final void a(long j10) {
        boolean z10;
        synchronized (this.f10335b) {
            try {
                if (this.f10338g != this.e.length && !this.f10341k) {
                    z10 = false;
                    u6.p(z10);
                    this.f10344n = j10;
                }
                z10 = true;
                u6.p(z10);
                this.f10344n = j10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final Object d() {
        boolean z10;
        h hVar;
        synchronized (this.f10335b) {
            try {
                f fVar = this.f10340j;
                if (fVar == null) {
                    if (this.f10339i == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    u6.p(z10);
                    int i10 = this.f10338g;
                    if (i10 == 0) {
                        hVar = null;
                    } else {
                        h[] hVarArr = this.e;
                        int i11 = i10 - 1;
                        this.f10338g = i11;
                        hVar = hVarArr[i11];
                    }
                    this.f10339i = hVar;
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
        synchronized (this.f10335b) {
            try {
                this.f10341k = true;
                this.f10343m = 0;
                h hVar = this.f10339i;
                if (hVar != null) {
                    hVar.clear();
                    h[] hVarArr = this.e;
                    int i10 = this.f10338g;
                    this.f10338g = i10 + 1;
                    hVarArr[i10] = hVar;
                    this.f10339i = null;
                }
                while (!this.f10336c.isEmpty()) {
                    h hVar2 = (h) this.f10336c.removeFirst();
                    hVar2.clear();
                    h[] hVarArr2 = this.e;
                    int i11 = this.f10338g;
                    this.f10338g = i11 + 1;
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
        synchronized (this.f10335b) {
            while (!this.f10342l) {
                try {
                    if (!this.f10336c.isEmpty() && this.h > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        break;
                    }
                    this.f10335b.wait();
                } finally {
                }
            }
            if (this.f10342l) {
                return false;
            }
            h hVar = (h) this.f10336c.removeFirst();
            j[] jVarArr = this.f10337f;
            int i10 = this.h - 1;
            this.h = i10;
            j jVar = jVarArr[i10];
            boolean z11 = this.f10341k;
            this.f10341k = false;
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
                    synchronized (this.f10335b) {
                        this.f10340j = h;
                    }
                    return false;
                }
            }
            synchronized (this.f10335b) {
                try {
                    if (this.f10341k) {
                        jVar.release();
                    } else if (jVar.shouldBeSkipped) {
                        this.f10343m++;
                        jVar.release();
                    } else {
                        jVar.skippedOutputBufferCount = this.f10343m;
                        this.f10343m = 0;
                        this.d.addLast(jVar);
                    }
                    hVar.clear();
                    h[] hVarArr = this.e;
                    int i11 = this.f10338g;
                    this.f10338g = i11 + 1;
                    hVarArr[i11] = hVar;
                } finally {
                }
            }
            return true;
        }
    }

    @Override
    public final j c() {
        synchronized (this.f10335b) {
            try {
                f fVar = this.f10340j;
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
        synchronized (this.f10335b) {
            long j11 = this.f10344n;
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
        synchronized (this.f10335b) {
            try {
                f fVar = this.f10340j;
                if (fVar == null) {
                    if (hVar == this.f10339i) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    u6.g(z10);
                    this.f10336c.addLast(hVar);
                    if (!this.f10336c.isEmpty() && this.h > 0) {
                        this.f10335b.notify();
                    }
                    this.f10339i = null;
                } else {
                    throw fVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void n(j jVar) {
        synchronized (this.f10335b) {
            jVar.clear();
            j[] jVarArr = this.f10337f;
            int i10 = this.h;
            this.h = i10 + 1;
            jVarArr[i10] = jVar;
            if (!this.f10336c.isEmpty() && this.h > 0) {
                this.f10335b.notify();
            }
        }
    }

    public final void o(int i10) {
        boolean z10;
        int i11 = this.f10338g;
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
        synchronized (this.f10335b) {
            this.f10342l = true;
            this.f10335b.notify();
        }
        try {
            this.f10334a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
