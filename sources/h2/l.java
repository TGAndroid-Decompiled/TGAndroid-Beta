package h2;

import java.util.ArrayDeque;
public abstract class l implements e {
    public final k f10083a;
    public final h[] e;
    public final j[] f10086f;
    public int f10087g;
    public int h;
    public h f10088i;
    public f f10089j;
    public boolean f10090k;
    public boolean f10091l;
    public int f10092m;
    public final Object f10084b = new Object();
    public long f10093n = -9223372036854775807L;
    public final ArrayDeque f10085c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    public l(h[] hVarArr, j[] jVarArr) {
        this.e = hVarArr;
        this.f10087g = hVarArr.length;
        for (int i10 = 0; i10 < this.f10087g; i10++) {
            this.e[i10] = f();
        }
        this.f10086f = jVarArr;
        this.h = jVarArr.length;
        for (int i11 = 0; i11 < this.h; i11++) {
            this.f10086f[i11] = g();
        }
        k kVar = new k(this);
        this.f10083a = kVar;
        kVar.start();
    }

    @Override
    public final void a(long j3) {
        boolean z10;
        synchronized (this.f10084b) {
            try {
                if (this.f10087g != this.e.length && !this.f10090k) {
                    z10 = false;
                    e2.d.g(z10);
                    this.f10093n = j3;
                }
                z10 = true;
                e2.d.g(z10);
                this.f10093n = j3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final Object d() {
        boolean z10;
        h hVar;
        synchronized (this.f10084b) {
            try {
                f fVar = this.f10089j;
                if (fVar == null) {
                    if (this.f10088i == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    e2.d.g(z10);
                    int i10 = this.f10087g;
                    if (i10 == 0) {
                        hVar = null;
                    } else {
                        h[] hVarArr = this.e;
                        int i11 = i10 - 1;
                        this.f10087g = i11;
                        hVar = hVarArr[i11];
                    }
                    this.f10088i = hVar;
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
        synchronized (this.f10084b) {
            try {
                this.f10090k = true;
                this.f10092m = 0;
                h hVar = this.f10088i;
                if (hVar != null) {
                    hVar.clear();
                    h[] hVarArr = this.e;
                    int i10 = this.f10087g;
                    this.f10087g = i10 + 1;
                    hVarArr[i10] = hVar;
                    this.f10088i = null;
                }
                while (!this.f10085c.isEmpty()) {
                    h hVar2 = (h) this.f10085c.removeFirst();
                    hVar2.clear();
                    h[] hVarArr2 = this.e;
                    int i11 = this.f10087g;
                    this.f10087g = i11 + 1;
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
        synchronized (this.f10084b) {
            while (!this.f10091l) {
                try {
                    if (!this.f10085c.isEmpty() && this.h > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        break;
                    }
                    this.f10084b.wait();
                } finally {
                }
            }
            if (this.f10091l) {
                return false;
            }
            h hVar = (h) this.f10085c.removeFirst();
            j[] jVarArr = this.f10086f;
            int i10 = this.h - 1;
            this.h = i10;
            j jVar = jVarArr[i10];
            boolean z11 = this.f10090k;
            this.f10090k = false;
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
                    synchronized (this.f10084b) {
                        this.f10089j = h;
                    }
                    return false;
                }
            }
            synchronized (this.f10084b) {
                try {
                    if (this.f10090k) {
                        jVar.release();
                    } else if (jVar.shouldBeSkipped) {
                        this.f10092m++;
                        jVar.release();
                    } else {
                        jVar.skippedOutputBufferCount = this.f10092m;
                        this.f10092m = 0;
                        this.d.addLast(jVar);
                    }
                    hVar.clear();
                    h[] hVarArr = this.e;
                    int i11 = this.f10087g;
                    this.f10087g = i11 + 1;
                    hVarArr[i11] = hVar;
                } finally {
                }
            }
            return true;
        }
    }

    @Override
    public final j c() {
        synchronized (this.f10084b) {
            try {
                f fVar = this.f10089j;
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
        synchronized (this.f10084b) {
            long j10 = this.f10093n;
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
        synchronized (this.f10084b) {
            try {
                f fVar = this.f10089j;
                if (fVar == null) {
                    if (hVar == this.f10088i) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    e2.d.b(z10);
                    this.f10085c.addLast(hVar);
                    if (!this.f10085c.isEmpty() && this.h > 0) {
                        this.f10084b.notify();
                    }
                    this.f10088i = null;
                } else {
                    throw fVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void n(j jVar) {
        synchronized (this.f10084b) {
            jVar.clear();
            j[] jVarArr = this.f10086f;
            int i10 = this.h;
            this.h = i10 + 1;
            jVarArr[i10] = jVar;
            if (!this.f10085c.isEmpty() && this.h > 0) {
                this.f10084b.notify();
            }
        }
    }

    public final void o(int i10) {
        boolean z10;
        int i11 = this.f10087g;
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
        synchronized (this.f10084b) {
            this.f10091l = true;
            this.f10084b.notify();
        }
        try {
            this.f10083a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
