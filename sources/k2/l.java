package k2;

import a8.ia;
import java.util.ArrayDeque;
public abstract class l implements e {
    public final k f17178a;
    public final h[] f17181e;
    public final j[] f17182f;
    public int f17183g;
    public int h;
    public h f17184i;
    public f f17185j;
    public boolean f17186k;
    public boolean f17187l;
    public int f17188m;
    public final Object f17179b = new Object();
    public long f17189n = -9223372036854775807L;
    public final ArrayDeque f17180c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    public l(h[] hVarArr, j[] jVarArr) {
        this.f17181e = hVarArr;
        this.f17183g = hVarArr.length;
        for (int i7 = 0; i7 < this.f17183g; i7++) {
            this.f17181e[i7] = f();
        }
        this.f17182f = jVarArr;
        this.h = jVarArr.length;
        for (int i10 = 0; i10 < this.h; i10++) {
            this.f17182f[i10] = g();
        }
        k kVar = new k(this);
        this.f17178a = kVar;
        kVar.start();
    }

    @Override
    public final void a(long j3) {
        boolean z9;
        synchronized (this.f17179b) {
            try {
                if (this.f17183g != this.f17181e.length && !this.f17186k) {
                    z9 = false;
                    ia.p(z9);
                    this.f17189n = j3;
                }
                z9 = true;
                ia.p(z9);
                this.f17189n = j3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final Object d() {
        boolean z9;
        h hVar;
        synchronized (this.f17179b) {
            try {
                f fVar = this.f17185j;
                if (fVar == null) {
                    if (this.f17184i == null) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    ia.p(z9);
                    int i7 = this.f17183g;
                    if (i7 == 0) {
                        hVar = null;
                    } else {
                        h[] hVarArr = this.f17181e;
                        int i10 = i7 - 1;
                        this.f17183g = i10;
                        hVar = hVarArr[i10];
                    }
                    this.f17184i = hVar;
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
        synchronized (this.f17179b) {
            try {
                this.f17186k = true;
                this.f17188m = 0;
                h hVar = this.f17184i;
                if (hVar != null) {
                    hVar.clear();
                    h[] hVarArr = this.f17181e;
                    int i7 = this.f17183g;
                    this.f17183g = i7 + 1;
                    hVarArr[i7] = hVar;
                    this.f17184i = null;
                }
                while (!this.f17180c.isEmpty()) {
                    h hVar2 = (h) this.f17180c.removeFirst();
                    hVar2.clear();
                    h[] hVarArr2 = this.f17181e;
                    int i10 = this.f17183g;
                    this.f17183g = i10 + 1;
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

    public abstract f i(h hVar, j jVar, boolean z9);

    public final boolean j() {
        f h;
        boolean z9;
        synchronized (this.f17179b) {
            while (!this.f17187l) {
                try {
                    if (!this.f17180c.isEmpty() && this.h > 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        break;
                    }
                    this.f17179b.wait();
                } finally {
                }
            }
            if (this.f17187l) {
                return false;
            }
            h hVar = (h) this.f17180c.removeFirst();
            j[] jVarArr = this.f17182f;
            int i7 = this.h - 1;
            this.h = i7;
            j jVar = jVarArr[i7];
            boolean z10 = this.f17186k;
            this.f17186k = false;
            if (hVar.isEndOfStream()) {
                jVar.addFlag(4);
            } else {
                jVar.timeUs = hVar.f17173e;
                if (hVar.isFirstSample()) {
                    jVar.addFlag(134217728);
                }
                if (!l(hVar.f17173e)) {
                    jVar.shouldBeSkipped = true;
                }
                try {
                    h = i(hVar, jVar, z10);
                } catch (OutOfMemoryError e10) {
                    h = h(e10);
                } catch (RuntimeException e11) {
                    h = h(e11);
                }
                if (h != null) {
                    synchronized (this.f17179b) {
                        this.f17185j = h;
                    }
                    return false;
                }
            }
            synchronized (this.f17179b) {
                try {
                    if (this.f17186k) {
                        jVar.release();
                    } else if (jVar.shouldBeSkipped) {
                        this.f17188m++;
                        jVar.release();
                    } else {
                        jVar.skippedOutputBufferCount = this.f17188m;
                        this.f17188m = 0;
                        this.d.addLast(jVar);
                    }
                    hVar.clear();
                    h[] hVarArr = this.f17181e;
                    int i10 = this.f17183g;
                    this.f17183g = i10 + 1;
                    hVarArr[i10] = hVar;
                } finally {
                }
            }
            return true;
        }
    }

    @Override
    public final j c() {
        synchronized (this.f17179b) {
            try {
                f fVar = this.f17185j;
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
        boolean z9;
        synchronized (this.f17179b) {
            long j10 = this.f17189n;
            if (j10 != -9223372036854775807L && j3 < j10) {
                z9 = false;
            }
            z9 = true;
        }
        return z9;
    }

    @Override
    public final void e(h hVar) {
        boolean z9;
        synchronized (this.f17179b) {
            try {
                f fVar = this.f17185j;
                if (fVar == null) {
                    if (hVar == this.f17184i) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    ia.f(z9);
                    this.f17180c.addLast(hVar);
                    if (!this.f17180c.isEmpty() && this.h > 0) {
                        this.f17179b.notify();
                    }
                    this.f17184i = null;
                } else {
                    throw fVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void n(j jVar) {
        synchronized (this.f17179b) {
            jVar.clear();
            j[] jVarArr = this.f17182f;
            int i7 = this.h;
            this.h = i7 + 1;
            jVarArr[i7] = jVar;
            if (!this.f17180c.isEmpty() && this.h > 0) {
                this.f17179b.notify();
            }
        }
    }

    public final void o(int i7) {
        boolean z9;
        int i10 = this.f17183g;
        h[] hVarArr = this.f17181e;
        if (i10 == hVarArr.length) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.p(z9);
        for (h hVar : hVarArr) {
            hVar.b(i7);
        }
    }

    @Override
    public void release() {
        synchronized (this.f17179b) {
            this.f17187l = true;
            this.f17179b.notify();
        }
        try {
            this.f17178a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
