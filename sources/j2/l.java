package j2;

import b8.zb;
import java.util.ArrayDeque;
public abstract class l implements e {
    public final k f16163a;
    public final h[] f16166e;
    public final j[] f16167f;
    public int f16168g;
    public int h;
    public h f16169i;
    public f f16170j;
    public boolean f16171k;
    public boolean f16172l;
    public int f16173m;
    public final Object f16164b = new Object();
    public long f16174n = -9223372036854775807L;
    public final ArrayDeque f16165c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    public l(h[] hVarArr, j[] jVarArr) {
        this.f16166e = hVarArr;
        this.f16168g = hVarArr.length;
        for (int i3 = 0; i3 < this.f16168g; i3++) {
            this.f16166e[i3] = f();
        }
        this.f16167f = jVarArr;
        this.h = jVarArr.length;
        for (int i10 = 0; i10 < this.h; i10++) {
            this.f16167f[i10] = g();
        }
        k kVar = new k(this);
        this.f16163a = kVar;
        kVar.start();
    }

    @Override
    public final void a(long j10) {
        boolean z10;
        synchronized (this.f16164b) {
            try {
                if (this.f16168g != this.f16166e.length && !this.f16171k) {
                    z10 = false;
                    zb.p(z10);
                    this.f16174n = j10;
                }
                z10 = true;
                zb.p(z10);
                this.f16174n = j10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final Object d() {
        boolean z10;
        h hVar;
        synchronized (this.f16164b) {
            try {
                f fVar = this.f16170j;
                if (fVar == null) {
                    if (this.f16169i == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zb.p(z10);
                    int i3 = this.f16168g;
                    if (i3 == 0) {
                        hVar = null;
                    } else {
                        h[] hVarArr = this.f16166e;
                        int i10 = i3 - 1;
                        this.f16168g = i10;
                        hVar = hVarArr[i10];
                    }
                    this.f16169i = hVar;
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
        synchronized (this.f16164b) {
            try {
                this.f16171k = true;
                this.f16173m = 0;
                h hVar = this.f16169i;
                if (hVar != null) {
                    hVar.clear();
                    h[] hVarArr = this.f16166e;
                    int i3 = this.f16168g;
                    this.f16168g = i3 + 1;
                    hVarArr[i3] = hVar;
                    this.f16169i = null;
                }
                while (!this.f16165c.isEmpty()) {
                    h hVar2 = (h) this.f16165c.removeFirst();
                    hVar2.clear();
                    h[] hVarArr2 = this.f16166e;
                    int i10 = this.f16168g;
                    this.f16168g = i10 + 1;
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
        synchronized (this.f16164b) {
            while (!this.f16172l) {
                try {
                    if (!this.f16165c.isEmpty() && this.h > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        break;
                    }
                    this.f16164b.wait();
                } finally {
                }
            }
            if (this.f16172l) {
                return false;
            }
            h hVar = (h) this.f16165c.removeFirst();
            j[] jVarArr = this.f16167f;
            int i3 = this.h - 1;
            this.h = i3;
            j jVar = jVarArr[i3];
            boolean z11 = this.f16171k;
            this.f16171k = false;
            if (hVar.isEndOfStream()) {
                jVar.addFlag(4);
            } else {
                jVar.timeUs = hVar.f16158e;
                if (hVar.isFirstSample()) {
                    jVar.addFlag(134217728);
                }
                if (!l(hVar.f16158e)) {
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
                    synchronized (this.f16164b) {
                        this.f16170j = h;
                    }
                    return false;
                }
            }
            synchronized (this.f16164b) {
                try {
                    if (this.f16171k) {
                        jVar.release();
                    } else if (jVar.shouldBeSkipped) {
                        this.f16173m++;
                        jVar.release();
                    } else {
                        jVar.skippedOutputBufferCount = this.f16173m;
                        this.f16173m = 0;
                        this.d.addLast(jVar);
                    }
                    hVar.clear();
                    h[] hVarArr = this.f16166e;
                    int i10 = this.f16168g;
                    this.f16168g = i10 + 1;
                    hVarArr[i10] = hVar;
                } finally {
                }
            }
            return true;
        }
    }

    @Override
    public final j c() {
        synchronized (this.f16164b) {
            try {
                f fVar = this.f16170j;
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
        synchronized (this.f16164b) {
            long j11 = this.f16174n;
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
        synchronized (this.f16164b) {
            try {
                f fVar = this.f16170j;
                if (fVar == null) {
                    if (hVar == this.f16169i) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zb.f(z10);
                    this.f16165c.addLast(hVar);
                    if (!this.f16165c.isEmpty() && this.h > 0) {
                        this.f16164b.notify();
                    }
                    this.f16169i = null;
                } else {
                    throw fVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void n(j jVar) {
        synchronized (this.f16164b) {
            jVar.clear();
            j[] jVarArr = this.f16167f;
            int i3 = this.h;
            this.h = i3 + 1;
            jVarArr[i3] = jVar;
            if (!this.f16165c.isEmpty() && this.h > 0) {
                this.f16164b.notify();
            }
        }
    }

    public final void o(int i3) {
        boolean z10;
        int i10 = this.f16168g;
        h[] hVarArr = this.f16166e;
        if (i10 == hVarArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.p(z10);
        for (h hVar : hVarArr) {
            hVar.b(i3);
        }
    }

    @Override
    public void release() {
        synchronized (this.f16164b) {
            this.f16172l = true;
            this.f16164b.notify();
        }
        try {
            this.f16163a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
