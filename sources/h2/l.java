package h2;

import a8.yb;
import java.util.ArrayDeque;
public abstract class l implements e {
    public final k f12573a;
    public final h[] e;
    public final j[] f12576f;
    public int f12577g;
    public int h;
    public h f12578i;
    public f f12579j;
    public boolean f12580k;
    public boolean f12581l;
    public int f12582m;
    public final Object f12574b = new Object();
    public long f12583n = -9223372036854775807L;
    public final ArrayDeque f12575c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    public l(h[] hVarArr, j[] jVarArr) {
        this.e = hVarArr;
        this.f12577g = hVarArr.length;
        for (int i10 = 0; i10 < this.f12577g; i10++) {
            this.e[i10] = f();
        }
        this.f12576f = jVarArr;
        this.h = jVarArr.length;
        for (int i11 = 0; i11 < this.h; i11++) {
            this.f12576f[i11] = g();
        }
        k kVar = new k(this);
        this.f12573a = kVar;
        kVar.start();
    }

    @Override
    public final void a(long j10) {
        boolean z10;
        synchronized (this.f12574b) {
            try {
                if (this.f12577g != this.e.length && !this.f12580k) {
                    z10 = false;
                    yb.p(z10);
                    this.f12583n = j10;
                }
                z10 = true;
                yb.p(z10);
                this.f12583n = j10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final Object d() {
        boolean z10;
        h hVar;
        synchronized (this.f12574b) {
            try {
                f fVar = this.f12579j;
                if (fVar == null) {
                    if (this.f12578i == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    yb.p(z10);
                    int i10 = this.f12577g;
                    if (i10 == 0) {
                        hVar = null;
                    } else {
                        h[] hVarArr = this.e;
                        int i11 = i10 - 1;
                        this.f12577g = i11;
                        hVar = hVarArr[i11];
                    }
                    this.f12578i = hVar;
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
        synchronized (this.f12574b) {
            try {
                this.f12580k = true;
                this.f12582m = 0;
                h hVar = this.f12578i;
                if (hVar != null) {
                    hVar.clear();
                    h[] hVarArr = this.e;
                    int i10 = this.f12577g;
                    this.f12577g = i10 + 1;
                    hVarArr[i10] = hVar;
                    this.f12578i = null;
                }
                while (!this.f12575c.isEmpty()) {
                    h hVar2 = (h) this.f12575c.removeFirst();
                    hVar2.clear();
                    h[] hVarArr2 = this.e;
                    int i11 = this.f12577g;
                    this.f12577g = i11 + 1;
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
        synchronized (this.f12574b) {
            while (!this.f12581l) {
                try {
                    if (!this.f12575c.isEmpty() && this.h > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        break;
                    }
                    this.f12574b.wait();
                } finally {
                }
            }
            if (this.f12581l) {
                return false;
            }
            h hVar = (h) this.f12575c.removeFirst();
            j[] jVarArr = this.f12576f;
            int i10 = this.h - 1;
            this.h = i10;
            j jVar = jVarArr[i10];
            boolean z11 = this.f12580k;
            this.f12580k = false;
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
                    synchronized (this.f12574b) {
                        this.f12579j = h;
                    }
                    return false;
                }
            }
            synchronized (this.f12574b) {
                try {
                    if (this.f12580k) {
                        jVar.release();
                    } else if (jVar.shouldBeSkipped) {
                        this.f12582m++;
                        jVar.release();
                    } else {
                        jVar.skippedOutputBufferCount = this.f12582m;
                        this.f12582m = 0;
                        this.d.addLast(jVar);
                    }
                    hVar.clear();
                    h[] hVarArr = this.e;
                    int i11 = this.f12577g;
                    this.f12577g = i11 + 1;
                    hVarArr[i11] = hVar;
                } finally {
                }
            }
            return true;
        }
    }

    @Override
    public final j c() {
        synchronized (this.f12574b) {
            try {
                f fVar = this.f12579j;
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
        synchronized (this.f12574b) {
            long j11 = this.f12583n;
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
        synchronized (this.f12574b) {
            try {
                f fVar = this.f12579j;
                if (fVar == null) {
                    if (hVar == this.f12578i) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    yb.g(z10);
                    this.f12575c.addLast(hVar);
                    if (!this.f12575c.isEmpty() && this.h > 0) {
                        this.f12574b.notify();
                    }
                    this.f12578i = null;
                } else {
                    throw fVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void n(j jVar) {
        synchronized (this.f12574b) {
            jVar.clear();
            j[] jVarArr = this.f12576f;
            int i10 = this.h;
            this.h = i10 + 1;
            jVarArr[i10] = jVar;
            if (!this.f12575c.isEmpty() && this.h > 0) {
                this.f12574b.notify();
            }
        }
    }

    public final void o(int i10) {
        boolean z10;
        int i11 = this.f12577g;
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
        synchronized (this.f12574b) {
            this.f12581l = true;
            this.f12574b.notify();
        }
        try {
            this.f12573a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
