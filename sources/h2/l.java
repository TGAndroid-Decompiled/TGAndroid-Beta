package h2;

import java.util.ArrayDeque;
import v7.u6;
public abstract class l implements e {
    public final k f10330a;
    public final h[] e;
    public final j[] f10333f;
    public int f10334g;
    public int h;
    public h f10335i;
    public f f10336j;
    public boolean f10337k;
    public boolean f10338l;
    public int f10339m;
    public final Object f10331b = new Object();
    public long f10340n = -9223372036854775807L;
    public final ArrayDeque f10332c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    public l(h[] hVarArr, j[] jVarArr) {
        this.e = hVarArr;
        this.f10334g = hVarArr.length;
        for (int i10 = 0; i10 < this.f10334g; i10++) {
            this.e[i10] = f();
        }
        this.f10333f = jVarArr;
        this.h = jVarArr.length;
        for (int i11 = 0; i11 < this.h; i11++) {
            this.f10333f[i11] = g();
        }
        k kVar = new k(this);
        this.f10330a = kVar;
        kVar.start();
    }

    @Override
    public final void a(long j10) {
        boolean z10;
        synchronized (this.f10331b) {
            try {
                if (this.f10334g != this.e.length && !this.f10337k) {
                    z10 = false;
                    u6.p(z10);
                    this.f10340n = j10;
                }
                z10 = true;
                u6.p(z10);
                this.f10340n = j10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final Object d() {
        boolean z10;
        h hVar;
        synchronized (this.f10331b) {
            try {
                f fVar = this.f10336j;
                if (fVar == null) {
                    if (this.f10335i == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    u6.p(z10);
                    int i10 = this.f10334g;
                    if (i10 == 0) {
                        hVar = null;
                    } else {
                        h[] hVarArr = this.e;
                        int i11 = i10 - 1;
                        this.f10334g = i11;
                        hVar = hVarArr[i11];
                    }
                    this.f10335i = hVar;
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
        synchronized (this.f10331b) {
            try {
                this.f10337k = true;
                this.f10339m = 0;
                h hVar = this.f10335i;
                if (hVar != null) {
                    hVar.clear();
                    h[] hVarArr = this.e;
                    int i10 = this.f10334g;
                    this.f10334g = i10 + 1;
                    hVarArr[i10] = hVar;
                    this.f10335i = null;
                }
                while (!this.f10332c.isEmpty()) {
                    h hVar2 = (h) this.f10332c.removeFirst();
                    hVar2.clear();
                    h[] hVarArr2 = this.e;
                    int i11 = this.f10334g;
                    this.f10334g = i11 + 1;
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
        synchronized (this.f10331b) {
            while (!this.f10338l) {
                try {
                    if (!this.f10332c.isEmpty() && this.h > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        break;
                    }
                    this.f10331b.wait();
                } finally {
                }
            }
            if (this.f10338l) {
                return false;
            }
            h hVar = (h) this.f10332c.removeFirst();
            j[] jVarArr = this.f10333f;
            int i10 = this.h - 1;
            this.h = i10;
            j jVar = jVarArr[i10];
            boolean z11 = this.f10337k;
            this.f10337k = false;
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
                    synchronized (this.f10331b) {
                        this.f10336j = h;
                    }
                    return false;
                }
            }
            synchronized (this.f10331b) {
                try {
                    if (this.f10337k) {
                        jVar.release();
                    } else if (jVar.shouldBeSkipped) {
                        this.f10339m++;
                        jVar.release();
                    } else {
                        jVar.skippedOutputBufferCount = this.f10339m;
                        this.f10339m = 0;
                        this.d.addLast(jVar);
                    }
                    hVar.clear();
                    h[] hVarArr = this.e;
                    int i11 = this.f10334g;
                    this.f10334g = i11 + 1;
                    hVarArr[i11] = hVar;
                } finally {
                }
            }
            return true;
        }
    }

    @Override
    public final j c() {
        synchronized (this.f10331b) {
            try {
                f fVar = this.f10336j;
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
        synchronized (this.f10331b) {
            long j11 = this.f10340n;
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
        synchronized (this.f10331b) {
            try {
                f fVar = this.f10336j;
                if (fVar == null) {
                    if (hVar == this.f10335i) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    u6.g(z10);
                    this.f10332c.addLast(hVar);
                    if (!this.f10332c.isEmpty() && this.h > 0) {
                        this.f10331b.notify();
                    }
                    this.f10335i = null;
                } else {
                    throw fVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void n(j jVar) {
        synchronized (this.f10331b) {
            jVar.clear();
            j[] jVarArr = this.f10333f;
            int i10 = this.h;
            this.h = i10 + 1;
            jVarArr[i10] = jVar;
            if (!this.f10332c.isEmpty() && this.h > 0) {
                this.f10331b.notify();
            }
        }
    }

    public final void o(int i10) {
        boolean z10;
        int i11 = this.f10334g;
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
        synchronized (this.f10331b) {
            this.f10338l = true;
            this.f10331b.notify();
        }
        try {
            this.f10330a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
