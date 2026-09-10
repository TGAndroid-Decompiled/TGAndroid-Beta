package h2;

import java.util.ArrayDeque;
public abstract class l implements e {
    public final k f9215a;
    public final h[] e;
    public final j[] f9218f;
    public int f9219g;
    public int h;
    public h f9220i;
    public f f9221j;
    public boolean f9222k;
    public boolean f9223l;
    public int f9224m;
    public final Object f9216b = new Object();
    public long f9225n = -9223372036854775807L;
    public final ArrayDeque f9217c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    public l(h[] hVarArr, j[] jVarArr) {
        this.e = hVarArr;
        this.f9219g = hVarArr.length;
        for (int i10 = 0; i10 < this.f9219g; i10++) {
            this.e[i10] = f();
        }
        this.f9218f = jVarArr;
        this.h = jVarArr.length;
        for (int i11 = 0; i11 < this.h; i11++) {
            this.f9218f[i11] = g();
        }
        k kVar = new k(this);
        this.f9215a = kVar;
        kVar.start();
    }

    @Override
    public final void a(long j3) {
        boolean z10;
        synchronized (this.f9216b) {
            try {
                if (this.f9219g != this.e.length && !this.f9222k) {
                    z10 = false;
                    e2.d.g(z10);
                    this.f9225n = j3;
                }
                z10 = true;
                e2.d.g(z10);
                this.f9225n = j3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final Object d() {
        boolean z10;
        h hVar;
        synchronized (this.f9216b) {
            try {
                f fVar = this.f9221j;
                if (fVar == null) {
                    if (this.f9220i == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    e2.d.g(z10);
                    int i10 = this.f9219g;
                    if (i10 == 0) {
                        hVar = null;
                    } else {
                        h[] hVarArr = this.e;
                        int i11 = i10 - 1;
                        this.f9219g = i11;
                        hVar = hVarArr[i11];
                    }
                    this.f9220i = hVar;
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
        synchronized (this.f9216b) {
            try {
                this.f9222k = true;
                this.f9224m = 0;
                h hVar = this.f9220i;
                if (hVar != null) {
                    hVar.clear();
                    h[] hVarArr = this.e;
                    int i10 = this.f9219g;
                    this.f9219g = i10 + 1;
                    hVarArr[i10] = hVar;
                    this.f9220i = null;
                }
                while (!this.f9217c.isEmpty()) {
                    h hVar2 = (h) this.f9217c.removeFirst();
                    hVar2.clear();
                    h[] hVarArr2 = this.e;
                    int i11 = this.f9219g;
                    this.f9219g = i11 + 1;
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
        synchronized (this.f9216b) {
            while (!this.f9223l) {
                try {
                    if (!this.f9217c.isEmpty() && this.h > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        break;
                    }
                    this.f9216b.wait();
                } finally {
                }
            }
            if (this.f9223l) {
                return false;
            }
            h hVar = (h) this.f9217c.removeFirst();
            j[] jVarArr = this.f9218f;
            int i10 = this.h - 1;
            this.h = i10;
            j jVar = jVarArr[i10];
            boolean z11 = this.f9222k;
            this.f9222k = false;
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
                    synchronized (this.f9216b) {
                        this.f9221j = h;
                    }
                    return false;
                }
            }
            synchronized (this.f9216b) {
                try {
                    if (this.f9222k) {
                        jVar.release();
                    } else if (jVar.shouldBeSkipped) {
                        this.f9224m++;
                        jVar.release();
                    } else {
                        jVar.skippedOutputBufferCount = this.f9224m;
                        this.f9224m = 0;
                        this.d.addLast(jVar);
                    }
                    hVar.clear();
                    h[] hVarArr = this.e;
                    int i11 = this.f9219g;
                    this.f9219g = i11 + 1;
                    hVarArr[i11] = hVar;
                } finally {
                }
            }
            return true;
        }
    }

    @Override
    public final j c() {
        synchronized (this.f9216b) {
            try {
                f fVar = this.f9221j;
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
        synchronized (this.f9216b) {
            long j10 = this.f9225n;
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
        synchronized (this.f9216b) {
            try {
                f fVar = this.f9221j;
                if (fVar == null) {
                    if (hVar == this.f9220i) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    e2.d.b(z10);
                    this.f9217c.addLast(hVar);
                    if (!this.f9217c.isEmpty() && this.h > 0) {
                        this.f9216b.notify();
                    }
                    this.f9220i = null;
                } else {
                    throw fVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void n(j jVar) {
        synchronized (this.f9216b) {
            jVar.clear();
            j[] jVarArr = this.f9218f;
            int i10 = this.h;
            this.h = i10 + 1;
            jVarArr[i10] = jVar;
            if (!this.f9217c.isEmpty() && this.h > 0) {
                this.f9216b.notify();
            }
        }
    }

    public final void o(int i10) {
        boolean z10;
        int i11 = this.f9219g;
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
        synchronized (this.f9216b) {
            this.f9223l = true;
            this.f9216b.notify();
        }
        try {
            this.f9215a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
