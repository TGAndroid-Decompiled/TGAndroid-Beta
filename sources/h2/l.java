package h2;

import java.util.ArrayDeque;
public abstract class l implements e {
    public final k f10989a;
    public final h[] f10992e;
    public final j[] f10993f;
    public int f10994g;
    public int h;
    public h f10995i;
    public f f10996j;
    public boolean f10997k;
    public boolean f10998l;
    public int f10999m;
    public final Object f10990b = new Object();
    public long f11000n = -9223372036854775807L;
    public final ArrayDeque f10991c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    public l(h[] hVarArr, j[] jVarArr) {
        this.f10992e = hVarArr;
        this.f10994g = hVarArr.length;
        for (int i10 = 0; i10 < this.f10994g; i10++) {
            this.f10992e[i10] = f();
        }
        this.f10993f = jVarArr;
        this.h = jVarArr.length;
        for (int i11 = 0; i11 < this.h; i11++) {
            this.f10993f[i11] = g();
        }
        k kVar = new k(this);
        this.f10989a = kVar;
        kVar.start();
    }

    @Override
    public final void a(long j3) {
        boolean z10;
        synchronized (this.f10990b) {
            try {
                if (this.f10994g != this.f10992e.length && !this.f10997k) {
                    z10 = false;
                    e2.d.g(z10);
                    this.f11000n = j3;
                }
                z10 = true;
                e2.d.g(z10);
                this.f11000n = j3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final Object d() {
        boolean z10;
        h hVar;
        synchronized (this.f10990b) {
            try {
                f fVar = this.f10996j;
                if (fVar == null) {
                    if (this.f10995i == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    e2.d.g(z10);
                    int i10 = this.f10994g;
                    if (i10 == 0) {
                        hVar = null;
                    } else {
                        h[] hVarArr = this.f10992e;
                        int i11 = i10 - 1;
                        this.f10994g = i11;
                        hVar = hVarArr[i11];
                    }
                    this.f10995i = hVar;
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
        synchronized (this.f10990b) {
            try {
                this.f10997k = true;
                this.f10999m = 0;
                h hVar = this.f10995i;
                if (hVar != null) {
                    hVar.clear();
                    h[] hVarArr = this.f10992e;
                    int i10 = this.f10994g;
                    this.f10994g = i10 + 1;
                    hVarArr[i10] = hVar;
                    this.f10995i = null;
                }
                while (!this.f10991c.isEmpty()) {
                    h hVar2 = (h) this.f10991c.removeFirst();
                    hVar2.clear();
                    h[] hVarArr2 = this.f10992e;
                    int i11 = this.f10994g;
                    this.f10994g = i11 + 1;
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
        synchronized (this.f10990b) {
            while (!this.f10998l) {
                try {
                    if (!this.f10991c.isEmpty() && this.h > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        break;
                    }
                    this.f10990b.wait();
                } finally {
                }
            }
            if (this.f10998l) {
                return false;
            }
            h hVar = (h) this.f10991c.removeFirst();
            j[] jVarArr = this.f10993f;
            int i10 = this.h - 1;
            this.h = i10;
            j jVar = jVarArr[i10];
            boolean z11 = this.f10997k;
            this.f10997k = false;
            if (hVar.isEndOfStream()) {
                jVar.addFlag(4);
            } else {
                jVar.timeUs = hVar.f10985e;
                if (hVar.isFirstSample()) {
                    jVar.addFlag(134217728);
                }
                if (!l(hVar.f10985e)) {
                    jVar.shouldBeSkipped = true;
                }
                try {
                    h = i(hVar, jVar, z11);
                } catch (OutOfMemoryError e7) {
                    h = h(e7);
                } catch (RuntimeException e10) {
                    h = h(e10);
                }
                if (h != null) {
                    synchronized (this.f10990b) {
                        this.f10996j = h;
                    }
                    return false;
                }
            }
            synchronized (this.f10990b) {
                try {
                    if (this.f10997k) {
                        jVar.release();
                    } else if (jVar.shouldBeSkipped) {
                        this.f10999m++;
                        jVar.release();
                    } else {
                        jVar.skippedOutputBufferCount = this.f10999m;
                        this.f10999m = 0;
                        this.d.addLast(jVar);
                    }
                    hVar.clear();
                    h[] hVarArr = this.f10992e;
                    int i11 = this.f10994g;
                    this.f10994g = i11 + 1;
                    hVarArr[i11] = hVar;
                } finally {
                }
            }
            return true;
        }
    }

    @Override
    public final j c() {
        synchronized (this.f10990b) {
            try {
                f fVar = this.f10996j;
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
        synchronized (this.f10990b) {
            long j10 = this.f11000n;
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
        synchronized (this.f10990b) {
            try {
                f fVar = this.f10996j;
                if (fVar == null) {
                    if (hVar == this.f10995i) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    e2.d.b(z10);
                    this.f10991c.addLast(hVar);
                    if (!this.f10991c.isEmpty() && this.h > 0) {
                        this.f10990b.notify();
                    }
                    this.f10995i = null;
                } else {
                    throw fVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void n(j jVar) {
        synchronized (this.f10990b) {
            jVar.clear();
            j[] jVarArr = this.f10993f;
            int i10 = this.h;
            this.h = i10 + 1;
            jVarArr[i10] = jVar;
            if (!this.f10991c.isEmpty() && this.h > 0) {
                this.f10990b.notify();
            }
        }
    }

    public final void o(int i10) {
        boolean z10;
        int i11 = this.f10994g;
        h[] hVarArr = this.f10992e;
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
        synchronized (this.f10990b) {
            this.f10998l = true;
            this.f10990b.notify();
        }
        try {
            this.f10989a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
