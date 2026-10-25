package h2;

import a8.yb;
import java.util.ArrayDeque;
public abstract class l implements e {
    public final k f12574a;
    public final h[] e;
    public final j[] f12577f;
    public int f12578g;
    public int h;
    public h f12579i;
    public f f12580j;
    public boolean f12581k;
    public boolean f12582l;
    public int f12583m;
    public final Object f12575b = new Object();
    public long f12584n = -9223372036854775807L;
    public final ArrayDeque f12576c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    public l(h[] hVarArr, j[] jVarArr) {
        this.e = hVarArr;
        this.f12578g = hVarArr.length;
        for (int i10 = 0; i10 < this.f12578g; i10++) {
            this.e[i10] = f();
        }
        this.f12577f = jVarArr;
        this.h = jVarArr.length;
        for (int i11 = 0; i11 < this.h; i11++) {
            this.f12577f[i11] = g();
        }
        k kVar = new k(this);
        this.f12574a = kVar;
        kVar.start();
    }

    @Override
    public final void a(long j10) {
        boolean z10;
        synchronized (this.f12575b) {
            try {
                if (this.f12578g != this.e.length && !this.f12581k) {
                    z10 = false;
                    yb.p(z10);
                    this.f12584n = j10;
                }
                z10 = true;
                yb.p(z10);
                this.f12584n = j10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final Object d() {
        boolean z10;
        h hVar;
        synchronized (this.f12575b) {
            try {
                f fVar = this.f12580j;
                if (fVar == null) {
                    if (this.f12579i == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    yb.p(z10);
                    int i10 = this.f12578g;
                    if (i10 == 0) {
                        hVar = null;
                    } else {
                        h[] hVarArr = this.e;
                        int i11 = i10 - 1;
                        this.f12578g = i11;
                        hVar = hVarArr[i11];
                    }
                    this.f12579i = hVar;
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
        synchronized (this.f12575b) {
            try {
                this.f12581k = true;
                this.f12583m = 0;
                h hVar = this.f12579i;
                if (hVar != null) {
                    hVar.clear();
                    h[] hVarArr = this.e;
                    int i10 = this.f12578g;
                    this.f12578g = i10 + 1;
                    hVarArr[i10] = hVar;
                    this.f12579i = null;
                }
                while (!this.f12576c.isEmpty()) {
                    h hVar2 = (h) this.f12576c.removeFirst();
                    hVar2.clear();
                    h[] hVarArr2 = this.e;
                    int i11 = this.f12578g;
                    this.f12578g = i11 + 1;
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
        synchronized (this.f12575b) {
            while (!this.f12582l) {
                try {
                    if (!this.f12576c.isEmpty() && this.h > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        break;
                    }
                    this.f12575b.wait();
                } finally {
                }
            }
            if (this.f12582l) {
                return false;
            }
            h hVar = (h) this.f12576c.removeFirst();
            j[] jVarArr = this.f12577f;
            int i10 = this.h - 1;
            this.h = i10;
            j jVar = jVarArr[i10];
            boolean z11 = this.f12581k;
            this.f12581k = false;
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
                } catch (RuntimeException e10) {
                    h = h(e10);
                }
                if (h != null) {
                    synchronized (this.f12575b) {
                        this.f12580j = h;
                    }
                    return false;
                }
            }
            synchronized (this.f12575b) {
                try {
                    if (this.f12581k) {
                        jVar.release();
                    } else if (jVar.shouldBeSkipped) {
                        this.f12583m++;
                        jVar.release();
                    } else {
                        jVar.skippedOutputBufferCount = this.f12583m;
                        this.f12583m = 0;
                        this.d.addLast(jVar);
                    }
                    hVar.clear();
                    h[] hVarArr = this.e;
                    int i11 = this.f12578g;
                    this.f12578g = i11 + 1;
                    hVarArr[i11] = hVar;
                } finally {
                }
            }
            return true;
        }
    }

    @Override
    public final j c() {
        synchronized (this.f12575b) {
            try {
                f fVar = this.f12580j;
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
        synchronized (this.f12575b) {
            long j11 = this.f12584n;
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
        synchronized (this.f12575b) {
            try {
                f fVar = this.f12580j;
                if (fVar == null) {
                    if (hVar == this.f12579i) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    yb.g(z10);
                    this.f12576c.addLast(hVar);
                    if (!this.f12576c.isEmpty() && this.h > 0) {
                        this.f12575b.notify();
                    }
                    this.f12579i = null;
                } else {
                    throw fVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void n(j jVar) {
        synchronized (this.f12575b) {
            jVar.clear();
            j[] jVarArr = this.f12577f;
            int i10 = this.h;
            this.h = i10 + 1;
            jVarArr[i10] = jVar;
            if (!this.f12576c.isEmpty() && this.h > 0) {
                this.f12575b.notify();
            }
        }
    }

    public final void o(int i10) {
        boolean z10;
        int i11 = this.f12578g;
        h[] hVarArr = this.e;
        if (i11 == hVarArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.p(z10);
        for (h hVar : hVarArr) {
            hVar.b(i10);
        }
    }

    @Override
    public void release() {
        synchronized (this.f12575b) {
            this.f12582l = true;
            this.f12575b.notify();
        }
        try {
            this.f12574a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
